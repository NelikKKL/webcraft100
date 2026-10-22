package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class ke extends rg {
   private float a;

   public ke(float var1) {
      this.a = var1;
   }

   public void a(aad var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable(32826);
      float var10 = this.a;
      GL11.glScalef(var10 / 1.0F, var10 / 1.0F, var10 / 1.0F);
      byte var11 = 46;
      this.a("/gui/items.png");
      cv var12 = cv.a;
      float var13 = (float)(var11 % 16 * 16 + 0) / 256.0F;
      float var14 = (float)(var11 % 16 * 16 + 16) / 256.0F;
      float var15 = (float)(var11 / 16 * 16 + 0) / 256.0F;
      float var16 = (float)(var11 / 16 * 16 + 16) / 256.0F;
      float var17 = 1.0F;
      float var18 = 0.5F;
      float var19 = 0.25F;
      GL11.glRotatef(180.0F - this.c.i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.c.j, 1.0F, 0.0F, 0.0F);
      var12.b();
      var12.b(0.0F, 1.0F, 0.0F);
      var12.a((double)(0.0F - var18), (double)(0.0F - var19), (double)0.0F, (double)var13, (double)var16);
      var12.a((double)(var17 - var18), (double)(0.0F - var19), (double)0.0F, (double)var14, (double)var16);
      var12.a((double)(var17 - var18), (double)(1.0F - var19), (double)0.0F, (double)var14, (double)var15);
      var12.a((double)(0.0F - var18), (double)(1.0F - var19), (double)0.0F, (double)var13, (double)var15);
      var12.a();
      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(ia v0, double v1, double v2, double v3, float v4, float v5) { this.a((aad)v0, v1, v2, v3, v4, v5); }
}
