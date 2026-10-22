package org.lwjgl.util.glu;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import net.minecraft.client.web.GLState;

/**
 * Шим org.lwjgl.util.glu.GLU. Реализует только реально используемые в
 * decomp методы (проверено grep'ом по всему проекту): gluPerspective и
 * gluErrorString.
 */
public final class GLU {
    private GLU() {}

    /** Классическая формула перевода fovY/aspect/near/far в glFrustum-параметры. */
    public static void gluPerspective(float fovY, float aspect, float zNear, float zFar) {
        double top = zNear * Math.tan(Math.toRadians(fovY) / 2.0);
        double bottom = -top;
        double left = bottom * aspect;
        double right = top * aspect;
        GLState.INSTANCE.frustum(left, right, bottom, top, zNear, zFar);
    }

    public static String gluErrorString(int errorCode) {
        return "GL error " + errorCode;
    }

    /** Чистая Java-реализация gluUnProject (матрицы column-major, как в OpenGL). Нужна abz (ActiveRenderInfo). */
    public static boolean gluUnProject(float winX, float winY, float winZ,
                                       FloatBuffer model, FloatBuffer proj, IntBuffer view,
                                       FloatBuffer objPos) {
        double[] m = new double[16], p = new double[16], a = new double[16], inv = new double[16];
        int mp = model.position(), pp = proj.position(), vp = view.position();
        for (int i = 0; i < 16; i++) { m[i] = model.get(mp + i); p[i] = proj.get(pp + i); }
        for (int c = 0; c < 4; c++)            // a = proj * model
            for (int r = 0; r < 4; r++) {
                double v = 0;
                for (int k = 0; k < 4; k++) v += p[k * 4 + r] * m[c * 4 + k];
                a[c * 4 + r] = v;
            }
        if (!invert(a, inv)) return false;
        double x = (winX - view.get(vp)) / view.get(vp + 2) * 2 - 1;
        double y = (winY - view.get(vp + 1)) / view.get(vp + 3) * 2 - 1;
        double z = 2 * winZ - 1;
        double[] o = new double[4];
        for (int r = 0; r < 4; r++)
            o[r] = inv[r] * x + inv[4 + r] * y + inv[8 + r] * z + inv[12 + r];
        if (o[3] == 0) return false;
        int op = objPos.position();
        objPos.put(op, (float) (o[0] / o[3]));
        objPos.put(op + 1, (float) (o[1] / o[3]));
        objPos.put(op + 2, (float) (o[2] / o[3]));
        return true;
    }

    private static boolean invert(double[] m, double[] out) {
        double[] a = new double[32];                     // [M | I], гаусс с выбором ведущего
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) a[r * 8 + c] = m[c * 4 + r];
            a[r * 8 + 4 + r] = 1;
        }
        for (int i = 0; i < 4; i++) {
            int piv = i;
            for (int r = i + 1; r < 4; r++) if (Math.abs(a[r * 8 + i]) > Math.abs(a[piv * 8 + i])) piv = r;
            if (Math.abs(a[piv * 8 + i]) < 1e-12) return false;
            if (piv != i) for (int c = 0; c < 8; c++) { double t = a[i * 8 + c]; a[i * 8 + c] = a[piv * 8 + c]; a[piv * 8 + c] = t; }
            double d = a[i * 8 + i];
            for (int c = 0; c < 8; c++) a[i * 8 + c] /= d;
            for (int r = 0; r < 4; r++) if (r != i) {
                double f = a[r * 8 + i];
                if (f != 0) for (int c = 0; c < 8; c++) a[r * 8 + c] -= f * a[i * 8 + c];
            }
        }
        for (int r = 0; r < 4; r++) for (int c = 0; c < 4; c++) out[c * 4 + r] = a[r * 8 + 4 + c];
        return true;
    }
}
