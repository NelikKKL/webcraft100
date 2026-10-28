package net.minecraft.client.web;

import org.teavm.jso.JSBody;
import org.teavm.jso.typedarrays.Float32Array;
import org.teavm.jso.typedarrays.Uint8Array;

/**
 * Вызовы WebGL2, у которых в спецификации несколько JS-перегрузок или нужна
 * специфическая передача типов (typed arrays с offset/length), которые
 * неудобно/ненадёжно выразить через простой @JSMethod-интерфейс. Каждый
 * метод здесь явно выбирает нужную перегрузку внутри JS-тела.
 */
public final class GLRaw {

    private GLRaw() {}

    // --- getParameter возвращает то int, то String, то float[] в зависимости
    //     от pname — заводим отдельный метод под каждый нужный нам случай
    //     (см. GL11.glGetString / glGetFloat в decomp-исходниках). ---

    @JSBody(params = { "gl", "pname" }, script =
        "return gl.getParameter(pname) || '';")
    public static native String getParameterString(WebGL2 gl, int pname);

    @JSBody(params = { "gl", "pname" }, script =
        "var v = gl.getParameter(pname);" +
        "if (v == null) return 0;" +
        "if (v.length !== undefined) return v[0];" + // Float32Array-подобные
        "return v;")
    public static native float getParameterFloat(WebGL2 gl, int pname);

    // --- Компиляция шейдера: статус + лог одним вызовом, чтобы не гонять
    //     туда-сюда лишние JS-обращения. ---

    @JSBody(params = { "gl", "shader" }, script =
        "return gl.getShaderParameter(shader, gl.COMPILE_STATUS);")
    public static native boolean getShaderCompileStatus(WebGL2 gl, WebGLShader shader);

    @JSBody(params = { "gl", "shader" }, script =
        "return gl.getShaderInfoLog(shader) || '';")
    public static native String getShaderInfoLog(WebGL2 gl, WebGLShader shader);

    @JSBody(params = { "gl", "program" }, script =
        "return gl.getProgramParameter(program, gl.LINK_STATUS);")
    public static native boolean getProgramLinkStatus(WebGL2 gl, WebGLProgram program);

    @JSBody(params = { "gl", "program" }, script =
        "return gl.getProgramInfoLog(program) || '';")
    public static native String getProgramInfoLog(WebGL2 gl, WebGLProgram program);

    // --- Загрузка текстуры из RGBA8 байтов (сконвертированных из Java int[]
    //     ARGB в GLState.uploadTexture). Всегда используем формат
    //     RGBA/UNSIGNED_BYTE — этого достаточно для всех вызовов glTexImage2D
    //     / glTexSubImage2D, встречающихся в decomp. ---

    @JSBody(params = { "gl", "target", "level", "width", "height", "pixels" }, script =
        "gl.texImage2D(target, level, gl.RGBA8, width, height, 0, gl.RGBA, gl.UNSIGNED_BYTE, pixels);")
    public static native void texImage2DRGBA(WebGL2 gl, int target, int level,
                                              int width, int height, Uint8Array pixels);

    @JSBody(params = { "gl", "target", "level", "xoffset", "yoffset", "width", "height", "pixels" }, script =
        "gl.texSubImage2D(target, level, xoffset, yoffset, width, height, gl.RGBA, gl.UNSIGNED_BYTE, pixels);")
    public static native void texSubImage2DRGBA(WebGL2 gl, int target, int level,
                                                 int xoffset, int yoffset,
                                                 int width, int height, Uint8Array pixels);

    @JSBody(params = { "gl", "x", "y", "width", "height", "pixels" }, script =
        "gl.readPixels(x, y, width, height, gl.RGBA, gl.UNSIGNED_BYTE, pixels);")
    public static native void readPixelsRGBA(WebGL2 gl, int x, int y, int width, int height, Uint8Array pixels);

    // bufferData с заранее известным размером (только резервирование памяти,
    // без данных) — используется для стриминга динамических VBO кадр за кадром.
    @JSBody(params = { "gl", "target", "size", "usage" }, script =
        "gl.bufferData(target, size, usage);")
    public static native void bufferDataCapacity(WebGL2 gl, int target, int size, int usage);

    // PATCH(perf): индексы квадов (0,1,2, 0,2,3 на каждые 4 вершины) прямо в JS — Uint32Array, без перегонки из Java.
    // (в @JSBody нет однобуквенных локальных имён — см. PATCHES.md)
    @JSBody(params = { "gl", "quads" }, script =
        "var total = quads * 6;" +
        "var indices = new Uint32Array(total);" +
        "var pos = 0;" +
        "for (var quad = 0; quad < quads; quad++) {" +
        "  var base = quad * 4;" +
        "  indices[pos++] = base; indices[pos++] = base + 1; indices[pos++] = base + 2;" +
        "  indices[pos++] = base; indices[pos++] = base + 2; indices[pos++] = base + 3;" +
        "}" +
        "gl.bufferData(34963, indices, 35044);")
    public static native void uploadQuadIndices(WebGL2 gl, int quads);

    // PERF: заливка только первых `length` float'ов из переиспользуемого
    // Float32Array (subarray — это view без копирования).
    @JSBody(params = { "gl", "target", "data", "length", "usage" }, script =
        "gl.bufferData(target, data.subarray(0, length), usage);")
    public static native void bufferDataPrefix(WebGL2 gl, int target, Float32Array data, int length, int usage);

    // fog принимает то float, то массив (glFogfv для GL_FOG_COLOR) —
    // в decomp используются только glFogf/glFogi с одиночным значением,
    // цвет тумана эмулируем отдельным полем в GLState (см. GL11.glFog(int,FloatBuffer)).

    // PATCH(1.0.0): панорама главного меню копирует кадр в текстуру (eh.java)
    /**
     * Канвас создан с alpha:false (RGB), а текстура RGBA — прямой copyTexSubImage2D даёт
     * "Invalid copy texture format combination". Копируем через blitFramebuffer во временный FBO.
     */
    @JSBody(params = { "gl", "target", "level", "xoffset", "yoffset", "x", "y", "width", "height" }, script =
        "var rfb = gl.getParameter(gl.READ_FRAMEBUFFER_BINDING), dfb = gl.getParameter(gl.DRAW_FRAMEBUFFER_BINDING);" +
        "var tex = gl.getParameter(gl.TEXTURE_BINDING_2D);" +
        "var tmp = gl.__copyFbo || (gl.__copyFbo = gl.createFramebuffer());" +
        "gl.bindFramebuffer(gl.DRAW_FRAMEBUFFER, tmp);" +
        "gl.framebufferTexture2D(gl.DRAW_FRAMEBUFFER, gl.COLOR_ATTACHMENT0, gl.TEXTURE_2D, tex, level);" +
        "var sc = gl.isEnabled(gl.SCISSOR_TEST); if (sc) gl.disable(gl.SCISSOR_TEST);" +
        "gl.blitFramebuffer(x, y, x + width, y + height, xoffset, yoffset, xoffset + width, yoffset + height, gl.COLOR_BUFFER_BIT, gl.NEAREST);" +
        "if (sc) gl.enable(gl.SCISSOR_TEST);" +
        "gl.framebufferTexture2D(gl.DRAW_FRAMEBUFFER, gl.COLOR_ATTACHMENT0, gl.TEXTURE_2D, null, 0);" +
        "gl.bindFramebuffer(gl.DRAW_FRAMEBUFFER, dfb); gl.bindFramebuffer(gl.READ_FRAMEBUFFER, rfb);")
    public static native void copyTexSubImage2D(WebGL2 gl, int target, int level,
                                                int xoffset, int yoffset, int x, int y,
                                                int width, int height);
}
