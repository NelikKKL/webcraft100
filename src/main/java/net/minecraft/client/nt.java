package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class nt extends rg {
   private acr a = new acr();

   public nt() {
      this.e = 0.5F;
   }

   public void a(dd var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      if ((float)var1.a - var9 + 1.0F < 10.0F) {
         float var10 = 1.0F - ((float)var1.a - var9 + 1.0F) / 10.0F;
         if (var10 < 0.0F) {
            var10 = 0.0F;
         }

         if (var10 > 1.0F) {
            var10 = 1.0F;
         }

         var10 *= var10;
         var10 *= var10;
         float var11 = 1.0F + var10 * 0.3F;
         GL11.glScalef(var11, var11, var11);
      }

      float var14 = (1.0F - ((float)var1.a - var9 + 1.0F) / 100.0F) * 0.8F;
      this.a("/terrain.png");
      this.a.a(yy.am, 0, var1.b(var9));
      if (var1.a / 5 % 2 == 0) {
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 772);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var14);
         this.a.a(yy.am, 0, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(2896);
         GL11.glEnable(3553);
      }

      GL11.glPopMatrix();
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(ia v0, double v1, double v2, double v3, float v4, float v5) { this.a((dd)v0, v1, v2, v3, v4, v5); }
}
