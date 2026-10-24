package net.minecraft.client;

import net.minecraft.client.web.Frames;
import net.minecraft.client.web.WorldStore;
import org.teavm.jso.JSBody;

/**
 * Точка входа веб-порта Minecraft 1.0.0.
 *
 * Игра работает в зелёном потоке TeaVM ("Game"), а не в JS-колбэке requestAnimationFrame:
 * методы, способные приостановиться (Thread.sleep, wait, Frames.next, контендные synchronized),
 * TeaVM компилирует в корутины, и вне потока они падают с "thread is null".
 *
 * Последовательность:
 *  1. Frames.whenReady()  — ждём восстановления миров из IndexedDB и распаковки assets.akrile.
 *  2. new WebMinecraft + init() — однократная инициализация (аналог Minecraft.run() до цикла).
 *  3. Цикл: runOneFrame() (= Minecraft.x()), затем Frames.next() — ждём следующий кадр браузера.
 *     Длинные операции игры (генерация мира) сами вызывают Frames.yieldIfDue(), чтобы экран обновлялся.
 */
public final class WebEntryPoint {

    private static WebMinecraft minecraft;
    private static int framesSinceFlush = 0;

    public static void main(String[] args) {
        Thread game = new Thread(WebEntryPoint::gameThread, "Game");
        game.start();
    }

    private static void gameThread() {
        Frames.whenReady();

        try {
            minecraft = new WebMinecraft(854, 480, false);
            minecraft.init();
        } catch (Throwable t) {
            showCrash("Failed to start game", t);
            return;
        }

        // При уходе со страницы — сохраняем мир
        WorldStore.installExitHook(() -> {
            if (minecraft != null) minecraft.saveWorldNow();
        });

        hideLoadingScreen();

        while (minecraft.isRunning()) {
            try {
                minecraft.runOneFrame();
            } catch (adl e) {
                // adl = выход в главное меню / дисконнект — не краш, меню уже выставлено внутри x()
            } catch (OutOfMemoryError e) {
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

            Frames.next();
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

    @JSBody(params = {}, script =
        "if (window.__hideLoadingScreen) window.__hideLoadingScreen();")
    private static native void hideLoadingScreen();

    @JSBody(params = { "text" }, script =
        "if (window.__showCrashScreen) window.__showCrashScreen(text);")
    private static native void showCrashScreen(String text);
}
