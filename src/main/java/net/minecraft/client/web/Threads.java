package net.minecraft.client.web;

/**
 * Замена блокирующим вызовам Thread.sleep/yield на ГЛАВНОМ пути игры.
 *
 * Игровой кадр выполняется из JS-колбэка requestAnimationFrame, а не внутри зелёного потока TeaVM,
 * поэтому Thread.sleep()/yield() там падают ("thread is null"). Паузы в оригинале нужны только для
 * ограничения FPS и ожидания фоновых потоков — в браузере ритм задаёт rAF, а потоки кооперативные.
 * Фоновые потоки игры (сеть, статистика), которые стартуют через Thread.start(), настоящий sleep используют.
 */
public final class Threads {
    private Threads() {}

    /** Не блокирует. Объявляет InterruptedException, чтобы вызывающий try/catch остался валидным. */
    public static void sleep(long millis) throws InterruptedException {
    }

    public static void yieldNow() {
    }
}
