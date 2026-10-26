package org.lwjgl.opengl;

/**
 * Шим GL13. Мультитекстура не эмулируется (лайтмап на юните 1 — TODO), но игра 1.0.0 безусловно переключает
 * юнит и делает на юните 1 glDisable(GL_TEXTURE_2D), glBindTexture, glMatrixMode(GL_TEXTURE) и т.п.
 * Чтобы эти вызовы не портили состояние юнита 0, мы запоминаем активный юнит; GL11 игнорирует
 * текстурные вызовы, пока активен юнит != 0.
 */
public final class GL13 {
    private GL13() {}
    public static final int GL_TEXTURE0 = 33984;
    public static final int GL_TEXTURE1 = 33985;

    /** Активный текстурный юнит (0 или 1...). */
    public static int activeUnit = 0;
    /** Активный юнит для клиентских массивов (glClientActiveTexture). */
    public static int clientUnit = 0;

    public static void glActiveTexture(int unit) { activeUnit = unit - GL_TEXTURE0; }
    public static void glClientActiveTexture(int unit) { clientUnit = unit - GL_TEXTURE0; }
    public static void glMultiTexCoord2f(int unit, float s, float t) { }
}
