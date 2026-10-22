package net.minecraft.client;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class abz {
   public static float a = 0.0F;
   public static float b = 0.0F;
   public static float c = 0.0F;
   private static IntBuffer i = bt.d(16);
   private static FloatBuffer j = bt.e(16);
   private static FloatBuffer k = bt.e(16);
   private static FloatBuffer l = bt.e(3);
   public static float d;
   public static float e;
   public static float f;
   public static float g;
   public static float h;

   public static void a(vi var0, boolean var1) {
      GL11.glGetFloat(2982, j);
      GL11.glGetFloat(2983, k);
      GL11.glGetInteger(2978, i);
      float var2 = (float)((i.get(0) + i.get(2)) / 2);
      float var3 = (float)((i.get(1) + i.get(3)) / 2);
      GLU.gluUnProject(var2, var3, 0.0F, j, k, i, l);
      a = l.get(0);
      b = l.get(1);
      c = l.get(2);
      int var4 = var1 ? 1 : 0;
      float var5 = var0.z;
      float var6 = var0.y;
      d = me.b(var6 * (float)Math.PI / 180.0F) * (float)(1 - var4 * 2);
      f = me.a(var6 * (float)Math.PI / 180.0F) * (float)(1 - var4 * 2);
      g = -f * me.a(var5 * (float)Math.PI / 180.0F) * (float)(1 - var4 * 2);
      h = d * me.a(var5 * (float)Math.PI / 180.0F) * (float)(1 - var4 * 2);
      e = me.b(var5 * (float)Math.PI / 180.0F);
   }

   public static fb a(nq var0, double var1) {
      double var3 = var0.p + (var0.s - var0.p) * var1;
      double var5 = var0.q + (var0.t - var0.q) * var1 + (double)var0.E();
      double var7 = var0.r + (var0.u - var0.r) * var1;
      double var9 = var3 + (double)(a * 1.0F);
      double var11 = var5 + (double)(b * 1.0F);
      double var13 = var7 + (double)(c * 1.0F);
      return fb.b(var9, var11, var13);
   }

   public static int a(ry var0, nq var1, float var2) {
      fb var3 = a(var1, (double)var2);
      am var4 = new am(var3);
      int var5 = var0.a(var4.a, var4.b, var4.c);
      if (var5 != 0 && yy.k[var5].bZ.a()) {
         float var6 = agw.e(var0.d(var4.a, var4.b, var4.c)) - 0.11111111F;
         float var7 = (float)(var4.b + 1) - var6;
         if (var3.b >= (double)var7) {
            var5 = var0.a(var4.a, var4.b + 1, var4.c);
         }
      }

      return var5;
   }
}
