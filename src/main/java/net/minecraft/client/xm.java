package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class xm extends acq {
   private al a;

   public xm(al var1, al var2, float var3) {
      super(var1, var3);
      this.a = var2;
   }

   protected int a(aed var1, int var2, float var3) {
      if (var2 == 0) {
         this.a(this.a);
         GL11.glEnable(2977);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         return 1;
      } else {
         if (var2 == 1) {
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

         return -1;
      }
   }

   protected void a(aed var1, float var2) {
      int var3 = var1.aF();
      float var4 = (var1.c + (var1.b - var1.c) * var2) / ((float)var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      float var6 = (float)var3;
      GL11.glScalef(var5 * var6, 1.0F / var5 * var6, var5 * var6);
   }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected int a(nq v0, int v1, float v2) { return this.a((aed)v0, v1, v2); }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected void a(nq v0, float v1) { this.a((aed)v0, v1); }
}
