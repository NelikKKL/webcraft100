package org.lwjgl.opengl;

/** Шим ARBMultitexture: делегирует GL13 (см. там про отслеживание юнитов). */
public final class ARBMultitexture {
    private ARBMultitexture() {}
    public static final int GL_TEXTURE0_ARB = 33984;
    public static final int GL_TEXTURE1_ARB = 33985;
    public static void glActiveTextureARB(int unit) { GL13.glActiveTexture(unit); }
    public static void glClientActiveTextureARB(int unit) { GL13.glClientActiveTexture(unit); }
    public static void glMultiTexCoord2fARB(int unit, float s, float t) { GL13.glMultiTexCoord2f(unit, s, t); }
}
