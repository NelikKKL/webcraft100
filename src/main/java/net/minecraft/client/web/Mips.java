package net.minecraft.client.web;

import org.teavm.jso.JSBody;
import org.teavm.jso.typedarrays.Uint8Array;

/**
 * PATCH(mipmaps): мипмапы текстур против «зерна» на расстоянии.
 *
 * Игра 1.0.0 грузит текстуры без мип-уровней (GL_NEAREST), а шейдер читает тексели напрямую (texelFetch, уровень 0).
 * Вдали каждый пиксель экрана попадает в один случайный тексель пиксельной текстуры -> шум, который двигается
 * вместе с камерой. Теперь для текстур, которым игра ставит мип-фильтр (RenderEngine.useMipmaps = zh.a),
 * шим строит цепочку уровней (альфа-взвешенное усреднение, см. web/extras.js: window.WebcraftMips),
 * а шейдер выбирает уровень по производным UV (Shaders.sampleTex, uniform uMipMax).
 *
 * Отключить: в консоли браузера localStorage.setItem('webcraft.mipmaps', '0') и перезагрузить страницу
 * (вернуть: removeItem) — тогда всё работает как раньше.
 */
public final class Mips {

    private Mips() {}

    private static int state = -1;   // -1 = ещё не проверяли, 0 = выключены, 1 = включены

    /** Включены ли мипмапы: JS-часть загружена (extras.js) и пользователь их не выключил. */
    public static boolean enabled() {
        if (state < 0) {
            state = (!"0".equals(readFlag()) && available()) ? 1 : 0;
            System.out.println("MIPMAPS: " + (state == 1 ? "enabled" : "disabled"));
        }
        return state == 1;
    }

    @JSBody(script = "try { return localStorage.getItem('webcraft.mipmaps'); } catch (err) { return null; }")
    private static native String readFlag();

    @JSBody(script = "return !!(window.WebcraftMips && window.WebcraftMips.build && window.WebcraftMips.sub);")
    private static native boolean available();

    /**
     * Строит уровни 1..n по пикселям уровня 0 (он уже залит в текущую привязанную TEXTURE_2D) и заливает их.
     * Возвращает число построенных уровней (0 — мипы для такого размера не нужны).
     */
    @JSBody(params = { "gl", "tex", "width", "height", "pixels" }, script =
        "return window.WebcraftMips.build(gl, tex, width, height, pixels);")
    public static native int build(WebGL2 gl, WebGLTexture tex, int width, int height, Uint8Array pixels);

    /** Пересчитывает нижние уровни после glTexSubImage2D уровня 0 (анимированные плитки, динамические текстуры). */
    @JSBody(params = { "gl", "tex", "xoff", "yoff", "width", "height", "pixels" }, script =
        "window.WebcraftMips.sub(gl, tex, xoff, yoff, width, height, pixels);")
    public static native void sub(WebGL2 gl, WebGLTexture tex, int xoff, int yoff, int width, int height, Uint8Array pixels);
}
