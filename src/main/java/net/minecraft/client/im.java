package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class im extends acq {
   public im() {
      super(new mu(), 0.5F);
   }

   protected void a(is var1, float var2) {
      float var4 = ((float)var1.e + (float)(var1.f - var1.e) * var2) / 20.0F;
      if (var4 < 0.0F) {
         var4 = 0.0F;
      }

      var4 = 1.0F / (var4 * var4 * var4 * var4 * var4 * 2.0F + 1.0F);
      float var5 = (8.0F + var4) / 2.0F;
      float var6 = (8.0F + 1.0F / var4) / 2.0F;
      GL11.glScalef(var6, var5, var6);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected void a(nq v0, float v1) { this.a((is)v0, v1); }
}
