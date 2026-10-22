package org.lwjgl.opengl;

/** Шим GL13: мультитекстура не поддерживается (GLContextCapabilities.OpenGL13 == false). */
public final class GL13 {
    private GL13() {}
    public static final int GL_TEXTURE0 = 33984;
    public static final int GL_TEXTURE1 = 33985;
    public static void glActiveTexture(int unit) { }
    public static void glClientActiveTexture(int unit) { }
    public static void glMultiTexCoord2f(int unit, float s, float t) { }
}
