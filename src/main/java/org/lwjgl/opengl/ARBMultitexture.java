package org.lwjgl.opengl;

/** Шим ARBMultitexture: см. GL13. */
public final class ARBMultitexture {
    private ARBMultitexture() {}
    public static final int GL_TEXTURE0_ARB = 33984;
    public static final int GL_TEXTURE1_ARB = 33985;
    public static void glActiveTextureARB(int unit) { }
    public static void glClientActiveTextureARB(int unit) { }
    public static void glMultiTexCoord2fARB(int unit, float s, float t) { }
}
