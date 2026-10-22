package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class aic extends acq {
   public aic(al var1, float var2) {
      super(var1, var2);
   }

   public void a(yv var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((nq)var1, var2, var4, var6, var8, var9);
   }

   protected void a(yv var1, float var2, float var3, float var4) {
      float var5 = var1.b + (var1.a - var1.b) * var4;
      float var6 = var1.d + (var1.c - var1.d) * var4;
      GL11.glTranslatef(0.0F, 0.5F, 0.0F);
      GL11.glRotatef(180.0F - var3, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var5, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, -1.2F, 0.0F);
   }

   protected void a(yv var1, float var2) {
   }

   protected float b(yv var1, float var2) {
      float var3 = var1.bz + (var1.g - var1.bz) * var2;
      return var3;
   }
}
