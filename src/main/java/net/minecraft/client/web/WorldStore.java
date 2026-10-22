package net.minecraft.client.web;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import net.minecraft.client.Minecraft;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.typedarrays.ArrayBuffer;
import org.teavm.jso.typedarrays.Uint8Array;

/**
 * Сохранение/восстановление миров между перезагрузками вкладки.
 *
 * Отличия от Alpha-порта:
 *  - 1.0.0 хранит измерения в подпапках DIM-1/ (Нижний мир) и DIM1/ (Край),
 *    поэтому все три пути вида saves/WorldName/DIM-1/region/*.mca
 *    так же попадают в IndexedDB.
 *  - Структура сохранений в 1.0.0: McRegion → Anvil (w.java/adg.java).
 *    Файлы region/*.mca, playerdata/*.dat, level.dat, level.dat_mcr.
 *  - session.lock, level.dat_new, level.dat_old по-прежнему не сохраняются.
 *
 * Что сохраняется:
 *   saves/<мир>/level.dat
 *   saves/<мир>/level.dat_mcr  (конвертированный формат)
 *   saves/<мир>/region/*.mca
 *   saves/<мир>/DIM-1/region/*.mca
 *   saves/<мир>/DIM1/region/*.mca
 *   saves/<мир>/playerdata/*.dat
 *   options.txt
 *
 * Принцип тот же, что в Alpha: TeaVM-виртуальная-ФС зеркалится в IndexedDB
 * через window.WorldDB (window.WorldDB — объект в extras.js).
 */
public final class WorldStore {

    private WorldStore() {}

    @JSFunctor interface FileCb extends JSObject { void call(String path, Uint8Array data); }
    @JSFunctor interface DoneCb extends JSObject { void call(boolean ok); }
    @JSFunctor interface ExitCb extends JSObject { void call(); }

    private static final LinkedHashSet<String> dirty      = new LinkedHashSet<>();
    private static final ArrayList<String>     removedPfx = new ArrayList<>();
    private static boolean enabled    = false;
    private static File    baseOverride = null;   // для JVM-теста

    // ------------------------------------------------------------ пути

    private static File base() {
        return baseOverride != null ? baseOverride : Minecraft.b();
    }

    /**
     * Файлы, которые намеренно НЕ сохраняются:
     *   session.lock    — блокировка, пересоздаётся при каждом старте
     *   level.dat_new   — временный файл записи (переименовывается в level.dat)
     *   level.dat_old   — резервная копия (можно воссоздать из dat)
     *   tmp_chunk.dat   — временный буфер чанка
     */
    static boolean skip(String name) {
        return name.equals("session.lock")
            || name.equals("level.dat_new")
            || name.equals("level.dat_old")
            || name.equals("tmp_chunk.dat");
    }

    /**
     * Ключ файла относительно папки игры, или null, если файл не должен сохраняться.
     *
     * Допустимые префиксы (1.0.0):
     *   saves/          — все файлы мира, включая DIM-1 и DIM1
     *   options.txt     — настройки
     */
    static String keyOf(File f) {
        String root = base().getAbsolutePath().replace('\\', '/');
        String p    = f.getAbsolutePath().replace('\\', '/');
        if (!root.endsWith("/")) root += "/";
        if (!p.startsWith(root)) return null;
        String key = p.substring(root.length());
        if (!key.startsWith("saves/") && !key.equals("options.txt")) return null;
        if (skip(f.getName())) return null;
        return key;
    }

    static String keyOfLenient(File f) {
        String key = keyOf(f);
        if (key != null) return key;
        if (skip(f.getName())) return null;
        String p = f.getAbsolutePath().replace('\\', '/');
        if (f.getName().equals("options.txt")) return "options.txt";
        int i = p.indexOf("/saves/");
        if (i >= 0) return p.substring(i + 1);
        if (p.startsWith("saves/")) return p;
        return null;
    }

    // ------------------------------------------------------------ учёт изменений

    public static void changed(File f) {
        if (!enabled) return;
        try {
            String key = keyOfLenient(f);
            if (key != null) dirty.add(key);
            else System.out.println("WorldStore: skipped: " + f.getAbsolutePath());
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    /**
     * Удаление мира (всего дерева папки, включая DIM-1 и DIM1).
     */
    public static void deletedTree(File dir) {
        if (!enabled) return;
        try {
            String root = base().getAbsolutePath().replace('\\', '/');
            String p    = dir.getAbsolutePath().replace('\\', '/');
            if (!root.endsWith("/")) root += "/";
            if (!p.startsWith(root)) return;
            String prefix = p.substring(root.length()) + "/";
            if (!prefix.startsWith("saves/")) return;
            for (Iterator<String> it = dirty.iterator(); it.hasNext(); ) {
                if (it.next().startsWith(prefix)) it.remove();
            }
            removedPfx.add(prefix);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static boolean hasPending() {
        return !dirty.isEmpty() || !removedPfx.isEmpty();
    }

    // ------------------------------------------------------------ чтение/запись

    static byte[] readAll(File f) throws IOException {
        try (FileInputStream in = new FileInputStream(f)) {
            ByteArrayOutputStream out =
                new ByteArrayOutputStream((int) Math.max(32, f.length()));
            byte[] buf = new byte[8192];
            int n;
            while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
            return out.toByteArray();
        }
    }

    static void writeFile(String key, byte[] data) throws IOException {
        File f      = new File(base(), key);
        File parent = f.getParentFile();
        if (parent != null && !parent.exists()) parent.mkdirs();
        try (FileOutputStream out = new FileOutputStream(f)) {
            out.write(data);
        }
    }

    static Map<String, byte[]> drain(ArrayList<String> removedOut) {
        LinkedHashMap<String, byte[]> out = new LinkedHashMap<>();
        removedOut.addAll(removedPfx);
        removedPfx.clear();
        ArrayList<String> keys = new ArrayList<>(dirty);
        dirty.clear();
        for (String key : keys) {
            File f = new File(base(), key);
            try {
                out.put(key, f.exists() ? readAll(f) : null);
            } catch (IOException e) {
                e.printStackTrace();
                dirty.add(key);
            }
        }
        return out;
    }

    // ------------------------------------------------------------ IndexedDB

    // ------------------------------------------------------------ резервное сканирование
    // Если какая-то запись мира обошла явные хуки changed(), её найдёт сравнение (размер, mtime).

    private static final java.util.HashMap<String, Long> sigs = new java.util.HashMap<>();

    private static void scan(boolean mark) {
        try {
            java.util.HashSet<String> present = new java.util.HashSet<>();
            File root = base();
            walk(new File(root, "saves"), present, mark);
            File opt = new File(root, "options.txt");
            if (opt.isFile()) check(opt, present, mark);
            for (Iterator<String> it = sigs.keySet().iterator(); it.hasNext(); ) {
                String k = it.next();
                if (!present.contains(k)) {
                    it.remove();
                    if (mark) dirty.add(k);   // drain() увидит, что файла нет, и удалит запись из IndexedDB
                }
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static void walk(File dir, java.util.HashSet<String> present, boolean mark) {
        File[] list = dir.listFiles();
        if (list == null) return;
        for (File f : list) {
            if (f.isDirectory()) walk(f, present, mark);
            else check(f, present, mark);
        }
    }

    private static void check(File f, java.util.HashSet<String> present, boolean mark) {
        String key = keyOf(f);
        if (key == null) return;
        present.add(key);
        long sig = f.length() * 1000003L + f.lastModified();
        Long old = sigs.get(key);
        if (old == null || old.longValue() != sig) {
            sigs.put(key, sig);
            if (mark) dirty.add(key);
        }
    }

    public static void flush() {
        if (!enabled) return;
        scan(true);
        if (!hasPending()) return;
        try {
            ArrayList<String>  removed = new ArrayList<>();
            Map<String, byte[]> files  = drain(removed);
            for (String pfx : removed) nativeRemovePrefix(pfx);
            for (Map.Entry<String, byte[]> e : files.entrySet()) {
                byte[] data = e.getValue();
                if (data == null) {
                    nativeRemove(e.getKey());
                } else {
                    Uint8Array arr = new Uint8Array(new ArrayBuffer(data.length));
                    arr.set(data, 0);
                    nativePut(e.getKey(), arr);
                }
            }
            nativeCommit();
            System.out.println("WorldStore: saved " + files.size() +
                " files, removed " + removed.size() + " worlds");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    /**
     * Восстанавливает все файлы из IndexedDB в виртуальную ФС TeaVM.
     * Принимает файлы с префиксом saves/ (все измерения) и options.txt.
     * Вызывать ДО создания WebMinecraft.
     */
    public static void restore(final Runnable onDone) {
        final int[] count = {0};
        FileCb onFile = (path, data) -> {
            // Принимаем saves/ и options.txt; DIM-1 и DIM1 лежат внутри saves/
            if (path == null
                || (!path.startsWith("saves/") && !path.equals("options.txt"))
                || path.contains("..")) return;
            try {
                int n     = data.getLength();
                byte[] bytes = new byte[n];
                for (int i = 0; i < n; i++) bytes[i] = (byte) data.get(i);
                writeFile(path, bytes);
                count[0]++;
            } catch (Throwable t) {
                t.printStackTrace();
            }
        };
        DoneCb done = ok -> {
            enabled = true;
            scan(false);   // восстановленные файлы — исходное состояние, заново не сохраняем
            System.out.println("WorldStore: restored " + count[0] +
                " files" + (ok ? "" : " (storage unavailable)"));
            onDone.run();
        };
        nativeLoad(onFile, done);
    }

    public static void installExitHook(final Runnable save) {
        nativeInstallExit((ExitCb) save::run);
    }

    // ------------------------------------------------------------ native JS

    @JSBody(params = {"onFile", "onDone"}, script =
        "if (window.WorldDB) { window.WorldDB.load(onFile, onDone); } else { onDone(false); }")
    private static native void nativeLoad(FileCb onFile, DoneCb onDone);

    @JSBody(params = {"path", "bytes"}, script =
        "if (window.WorldDB) window.WorldDB.put(path, bytes);")
    private static native void nativePut(String path, Uint8Array bytes);

    @JSBody(params = {"path"}, script =
        "if (window.WorldDB) window.WorldDB.remove(path);")
    private static native void nativeRemove(String path);

    @JSBody(params = {"prefix"}, script =
        "if (window.WorldDB) window.WorldDB.removePrefix(prefix);")
    private static native void nativeRemovePrefix(String prefix);

    @JSBody(params = {}, script =
        "if (window.WorldDB) window.WorldDB.commit();")
    private static native void nativeCommit();

    @JSBody(params = {"cb"}, script =
        "window.__javaWorldSave = cb;")
    private static native void nativeInstallExit(ExitCb cb);

    // ------------------------------------------------------------ тест

    static void testSetup(File base) {
        baseOverride = base;
        enabled      = true;
        dirty.clear();
        removedPfx.clear();
    }
}
