package net.minecraft.client;

import net.minecraft.client.web.ResourcePreloader;
import net.minecraft.client.web.WorldStore;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
 * Точка входа веб-порта Minecraft 1.0.0.
 *
 * Последовательность запуска:
 *  1. WorldStore.restore()      — восстанавливает миры (overworld + DIM-1 + DIM1)
 *                                 из IndexedDB в виртуальную ФС TeaVM.
 *  2. ResourcePreloader.preloadAll() — скачивает assets.akrile, распаковывает,
 *                                 декодирует PNG/TXT через браузер.
 *  3. После обоих — startGame(): создаём WebMinecraft, вызываем init(),
 *                                 запускаем игровой цикл через rAF.
 *
 * Отличия от Alpha-порта (webcraft):
 *  - Класс WebMinecraft теперь для 1.0.0 (dr-сессия, oq-краш).
 *  - saveWorldNow() через WorldStore.flush() с поддержкой DIM-1/DIM1.
 *  - adl-исключение (OutOfGame / "disconnect") перехватывается и ведёт
 *    в главное меню; в 1.0.0 оно называется adl (было adj в Alpha).
 *
 * Игра НЕ использует оригинальный Minecraft.run() — он блокирующий
 * (while-цикл), что недопустимо в браузере. Вместо этого:
 *   Minecraft.a()  = init()
 *   Minecraft.x()  = runOneFrame()
 *   Minecraft.L    = isRunning()
 */
public final class WebEntryPoint {

    private static WebMinecraft minecraft;
    private static int framesSinceFlush = 0;

    /**
     * Игра стартует, когда оба источника данных готовы:
     * ресурсы (prелоад) И сохранённые миры (IndexedDB).
     */
    private static int pendingStart = 2;

    private static void partReady() {
        if (--pendingStart == 0) {
            startGame();
        }
    }

    public static void main(String[] args) {
        WorldStore.restore(WebEntryPoint::partReady);
        ResourcePreloader.preloadAll(WebEntryPoint::partReady);
    }

    private static void startGame() {
        try {
            minecraft = new WebMinecraft(854, 480, false);
            minecraft.init();
        } catch (Throwable t) {
            showCrash("Failed to start game", t);
            return;
        }

        // При уходе со страницы — сохраняем мир (все измерения)
        WorldStore.installExitHook(() -> {
            if (minecraft != null) minecraft.saveWorldNow();
        });

        hideLoadingScreen();
        requestFrame(WebEntryPoint::frame);
    }

    private static void frame(double timestampMs) {
        try {
            minecraft.runOneFrame();
        } catch (adl e) {
            // adl = OutOfGameException (дисконнект/возврат в меню) — не краш
            // Minecraft.run() ловит это же исключение и возвращается в меню.
            // Здесь просто продолжаем, меню уже выставлено внутри x().
        } catch (OutOfMemoryError e) {
            // Аналогично оригиналу: OOM → экран ошибки
            showCrash("Out of memory", e);
            return;
        } catch (Throwable t) {
            showCrash("Unexpected error in game loop", t);
            return;
        }

        // Периодически сбрасываем накопленные изменения мира в IndexedDB
        if (++framesSinceFlush >= 300) {
            framesSinceFlush = 0;
            WorldStore.flush();
        }

        if (minecraft.isRunning()) {
            requestFrame(WebEntryPoint::frame);
        }
    }

    private static void showCrash(String title, Throwable t) {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append(": ").append(t).append('\n');
        for (StackTraceElement el : t.getStackTrace()) {
            sb.append("    at ").append(el).append('\n');
        }
        t.printStackTrace();
        showCrashScreen(sb.toString());
    }

    // ---- JS interop ----

    @JSFunctor
    interface FrameCallback extends JSObject {
        void run(double timestampMs);
    }

    @JSBody(params = {"cb"}, script =
        "window.requestAnimationFrame(function(t) { cb(t); });")
    private static native void requestFrame(FrameCallback cb);

    @JSBody(params = {}, script =
        "if (window.__hideLoadingScreen) window.__hideLoadingScreen();")
    private static native void hideLoadingScreen();

    @JSBody(params = {"text"}, script =
        "if (window.__showCrashScreen) window.__showCrashScreen(text);")
    private static native void showCrashScreen(String text);
}
