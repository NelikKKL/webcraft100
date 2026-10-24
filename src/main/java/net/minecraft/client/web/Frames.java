package net.minecraft.client.web;

import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
 * Мост между "потоковым" кодом игры и событийным циклом браузера.
 *
 * Игра запускается в зелёном потоке TeaVM (см. WebEntryPoint). Код, который может приостановиться
 * (sleep, wait, Frames.next), компилируется TeaVM в корутины и ОБЯЗАН выполняться внутри такого потока,
 * иначе падает с "thread is null". next() отдаёт управление браузеру до следующего кадра:
 * именно тогда браузер перерисовывает канвас — так работает экран генерации мира.
 */
public final class Frames {
    private Frames() {}

    private static long lastYield = 0L;

    /** Приостанавливает поток до следующего requestAnimationFrame. */
    @Async
    public static native void next();

    private static void next(final AsyncCallback<Void> callback) {
        requestFrame(t -> callback.complete(null));
    }

    /** Отдаёт кадр браузеру, если с прошлой отдачи прошло >= 30 мс (для длинных циклов загрузки). */
    public static void yieldIfDue() {
        long now = System.currentTimeMillis();
        if (now - lastYield >= 30L) {
            next();
            lastYield = System.currentTimeMillis();
        }
    }

    /** Ждёт, пока готовы и сохранённые миры (IndexedDB), и ресурсы (assets.akrile). */
    @Async
    public static native void whenReady();

    private static void whenReady(final AsyncCallback<Void> callback) {
        final int[] left = { 2 };
        final Runnable part = () -> {
            if (--left[0] == 0) callback.complete(null);
        };
        WorldStore.restore(part);
        ResourcePreloader.preloadAll(part::run);
    }

    @JSFunctor
    interface FrameCallback extends JSObject {
        void run(double timestampMs);
    }

    @JSBody(params = { "cb" }, script = "window.requestAnimationFrame(function(t) { cb(t); });")
    private static native void requestFrame(FrameCallback cb);
}
