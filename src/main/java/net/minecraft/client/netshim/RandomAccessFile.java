package net.minecraft.client.netshim;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Шим java.io.RandomAccessFile для региональных файлов (as.java, формат McRegion).
 *
 * Содержимое файла живёт в памяти (byte[]); на диск виртуальной ФС TeaVM оно записывается при
 * close() и при syncAll(), которую WorldStore вызывает перед каждым сбросом в IndexedDB.
 * Нужен потому, что RandomAccessFile TeaVM поверх виртуальной ФС ненадёжен (в Alpha-порте
 * региональных файлов не было — там один файл на чанк).
 */
public class RandomAccessFile {
    private static final ArrayList<RandomAccessFile> OPEN = new ArrayList<>();

    private final File file;
    private byte[] data;
    private int size;
    private int pos;
    private boolean dirty;
    private boolean closed;

    public RandomAccessFile(File file, String mode) throws IOException {
        this.file = file;
        if (file.exists()) {
            long len = file.length();
            data = new byte[(int) Math.max(len, 8192)];
            FileInputStream in = new FileInputStream(file);
            try {
                int n;
                while (size < len && (n = in.read(data, size, (int) len - size)) > 0) size += n;
            } finally {
                in.close();
            }
        } else {
            File parent = file.getParentFile();
            if (parent != null && !parent.exists()) parent.mkdirs();
            data = new byte[8192];
            dirty = true;     // новый файл нужно создать на диске, даже пустой
        }
        synchronized (OPEN) { OPEN.add(this); }
    }

    // ------------------------------------------------------------ состояние

    public long length() throws IOException { return size; }

    public void seek(long p) throws IOException { pos = (int) p; }

    public long getFilePointer() throws IOException { return pos; }

    public void setLength(long n) throws IOException {
        ensure((int) n);
        if (n > size) Arrays.fill(data, size, (int) n, (byte) 0);
        size = (int) n;
        if (pos > size) pos = size;
        dirty = true;
    }

    private void ensure(int cap) {
        if (cap > data.length) data = Arrays.copyOf(data, Math.max(cap, data.length * 2));
    }

    // ------------------------------------------------------------ чтение

    public int read() throws IOException {
        return pos < size ? data[pos++] & 0xFF : -1;
    }

    public int read(byte[] b) throws IOException { return read(b, 0, b.length); }

    public int read(byte[] b, int off, int len) throws IOException {
        if (len == 0) return 0;
        if (pos >= size) return -1;
        int n = Math.min(len, size - pos);
        System.arraycopy(data, pos, b, off, n);
        pos += n;
        return n;
    }

    public void readFully(byte[] b) throws IOException { readFully(b, 0, b.length); }

    public void readFully(byte[] b, int off, int len) throws IOException {
        int done = 0;
        while (done < len) {
            int n = read(b, off + done, len - done);
            if (n < 0) throw new EOFException();
            done += n;
        }
    }

    public byte readByte() throws IOException {
        int v = read();
        if (v < 0) throw new EOFException();
        return (byte) v;
    }

    public int readInt() throws IOException {
        int a = read(), b = read(), c = read(), d = read();
        if ((a | b | c | d) < 0) throw new EOFException();
        return (a << 24) | (b << 16) | (c << 8) | d;
    }

    // ------------------------------------------------------------ запись

    public void write(int b) throws IOException {
        ensure(pos + 1);
        if (pos > size) Arrays.fill(data, size, pos, (byte) 0);
        data[pos++] = (byte) b;
        if (pos > size) size = pos;
        dirty = true;
    }

    public void write(byte[] b) throws IOException { write(b, 0, b.length); }

    public void write(byte[] b, int off, int len) throws IOException {
        ensure(pos + len);
        if (pos > size) Arrays.fill(data, size, pos, (byte) 0);
        System.arraycopy(b, off, data, pos, len);
        pos += len;
        if (pos > size) size = pos;
        dirty = true;
    }

    public void writeByte(int v) throws IOException { write(v); }

    public void writeInt(int v) throws IOException {
        write(v >>> 24); write(v >>> 16); write(v >>> 8); write(v);
    }

    // ------------------------------------------------------------ синхронизация с ФС

    /** Записывает изменённое содержимое в файл виртуальной ФС. */
    public void sync() throws IOException {
        if (!dirty) return;
        File parent = file.getParentFile();
        if (parent != null && !parent.exists()) parent.mkdirs();
        FileOutputStream out = new FileOutputStream(file);
        try {
            out.write(data, 0, size);
        } finally {
            out.close();
        }
        dirty = false;
    }

    public void close() throws IOException {
        if (closed) return;
        sync();
        closed = true;
        synchronized (OPEN) { OPEN.remove(this); }
    }

    /** Записать на диск ФС все открытые региональные файлы (перед сбросом в IndexedDB). */
    public static void syncAll() {
        RandomAccessFile[] list;
        synchronized (OPEN) { list = OPEN.toArray(new RandomAccessFile[0]); }
        for (RandomAccessFile f : list) {
            try { f.sync(); } catch (IOException e) { e.printStackTrace(); }
        }
    }
}
