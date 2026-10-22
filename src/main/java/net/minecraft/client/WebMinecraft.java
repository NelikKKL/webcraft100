package net.minecraft.client;

import org.teavm.jso.JSBody;

/**
 * Наш аналог ahy.java/nm.java (оба исключены из сборки, см. PATCHES.md).
 *
 * Отличия от Alpha-порта (webcraft):
 *  - Session хранится в поле this.k (тип dr: b=nick, c=sessionId),
 *    в Alpha было this.i (тип ea).
 *  - Краш-репорт — тип oq (поля a=message, b=cause), в Alpha был hr.
 *  - Метод инициализации — this.a() (публичный, наследуем напрямую).
 *  - Игровой тик — this.x() (пакетно-приватный, наследуем напрямую).
 *  - Флаг запуска — this.L (volatile boolean, наследуем напрямую).
 *
 * Паттерн запуска (см. WebEntryPoint):
 *   minecraft.init();                 // однократная инициализация
 *   while (minecraft.isRunning()) {   // по одному кадру за requestAnimationFrame
 *       minecraft.runOneFrame();
 *   }
 *
 * Сохранение мира при уходе со страницы — saveWorldNow().
 */
public final class WebMinecraft extends Minecraft {

    public WebMinecraft(int width, int height, boolean fullscreen) {
        super(null,                  // Component parent  — нет
              null,                  // Canvas            — нет (WebGL canvas управляется JS)
              new MinecraftApplet(), // фиктивный аплет   — шим
              width, height, fullscreen);

        // Сессия игрока (nickname, sessionId).
        // this.k = dr; dr.b = username, dr.c = sessionId.
        // В офлайн-режиме sessionId не нужен, ставим "-".
        this.k = new dr(net.minecraft.client.web.SkinStore.nick(), "-");
    }

    // ---------------------------------------------------------------- Minecraft API

    /**
     * Реализует единственный абстрактный метод Minecraft —
     * показ краш-экрана вместо AWT-диалога (wp.java, который исключён).
     */
    @Override
    public void a(oq crashReport) {
        StringBuilder sb = new StringBuilder();
        sb.append(crashReport.a == null ? "Game crashed" : crashReport.a);
        if (crashReport.b != null) {
            sb.append('\n').append(crashReport.b);
            for (StackTraceElement el : crashReport.b.getStackTrace()) {
                sb.append("\n    at ").append(el);
            }
        }
        String text = sb.toString();
        System.err.println(text);
        showCrashScreen(text);
    }

    // ---------------------------------------------------------------- Методы для WebEntryPoint

    /**
     * Однократная инициализация (Display.create, загрузка текстур, шрифтов и т.д.).
     * Вызывается один раз после прелоадки ресурсов.
     * Соответствует блоку try { this.a(); } в оригинальном run().
     */
    public void init() throws Exception {
        this.a();
    }

    /**
     * Один кадр игрового цикла.
     * Соответствует this.x() в оригинальном while (this.L) { this.x(); }.
     * Исключения .adl (OutOfGameException) пробрасываются наружу для обработки в WebEntryPoint.
     */
    public void runOneFrame() throws Exception {
        this.x();
    }

    /**
     * true — игра работает (L = volatile boolean в Minecraft).
     */
    public boolean isRunning() {
        return this.L;
    }

    /**
     * Сохранение текущего мира + flush в IndexedDB. Вызывается при уходе со страницы (pagehide).
     *
     * ry.a(boolean, rz) = World.saveWorld(boolean, IProgressUpdate): пишет level.dat, игрока и
     * чанки (region/*.mca). Каждое измерение — отдельный объект ry; текущий хранится в this.f,
     * остальные игра сохраняет сама при смене измерения / выходе в меню.
     */
    public void saveWorldNow() {
        try {
            if (this.f != null) {
                this.f.a(true, (rz)null);
            }
        } catch (Throwable t) {
            System.err.println("saveWorldNow: " + t);
        }
        net.minecraft.client.web.WorldStore.flush();
    }

    // ---------------------------------------------------------------- JS interop

    @JSBody(params = {"text"}, script =
        "if (window.__showCrashScreen) window.__showCrashScreen(text);")
    private static native void showCrashScreen(String text);
}
