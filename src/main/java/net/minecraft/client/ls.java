package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class ls extends rg {
   public void a(ael var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable(32826);
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      byte var10 = 1;
      byte var11 = 2;
      this.a("/particles.png");
      cv var12 = cv.a;
      float var13 = (float)(var10 * 8 + 0) / 128.0F;
      float var14 = (float)(var10 * 8 + 8) / 128.0F;
      float var15 = (float)(var11 * 8 + 0) / 128.0F;
      float var16 = (float)(var11 * 8 + 8) / 128.0F;
      float var17 = 1.0F;
      float var18 = 0.5F;
      float var19 = 0.5F;
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
      if (var1.b != null) {
         float var20 = (var1.b.A + (var1.b.y - var1.b.A) * var9) * (float)Math.PI / 180.0F;
         double var21 = (double)me.a(var20);
         double var23 = (double)me.b(var20);
         float var25 = var1.b.d(var9);
         float var26 = me.a(me.c(var25) * (float)Math.PI);
         fb var27 = fb.b((double)-0.5F, 0.03, 0.8);
         var27.a(-(var1.b.B + (var1.b.z - var1.b.B) * var9) * (float)Math.PI / 180.0F);
         var27.b(-(var1.b.A + (var1.b.y - var1.b.A) * var9) * (float)Math.PI / 180.0F);
         var27.b(var26 * 0.5F);
         var27.a(-var26 * 0.7F);
         double var28 = var1.b.p + (var1.b.s - var1.b.p) * (double)var9 + var27.a;
         double var30 = var1.b.q + (var1.b.t - var1.b.q) * (double)var9 + var27.b;
         double var32 = var1.b.r + (var1.b.u - var1.b.r) * (double)var9 + var27.c;
         if (this.c.k.E > 0) {
            var20 = (var1.b.au + (var1.b.at - var1.b.au) * var9) * (float)Math.PI / 180.0F;
            var21 = (double)me.a(var20);
            var23 = (double)me.b(var20);
            var28 = var1.b.p + (var1.b.s - var1.b.p) * (double)var9 - var23 * 0.35 - var21 * 0.85;
            var30 = var1.b.q + (var1.b.t - var1.b.q) * (double)var9 - 0.45;
            var32 = var1.b.r + (var1.b.u - var1.b.r) * (double)var9 - var21 * 0.35 + var23 * 0.85;
         }

         double var34 = var1.p + (var1.s - var1.p) * (double)var9;
         double var36 = var1.q + (var1.t - var1.q) * (double)var9 + (double)0.25F;
         double var38 = var1.r + (var1.u - var1.r) * (double)var9;
         double var40 = (double)((float)(var28 - var34));
         double var42 = (double)((float)(var30 - var36));
         double var44 = (double)((float)(var32 - var38));
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         var12.a(3);
         var12.c(0);
         byte var46 = 16;

         for(int var47 = 0; var47 <= var46; ++var47) {
            float var48 = (float)var47 / (float)var46;
            var12.a(var2 + var40 * (double)var48, var4 + var42 * (double)(var48 * var48 + var48) * (double)0.5F + (double)0.25F, var6 + var44 * (double)var48);
         }

         var12.a();
         GL11.glEnable(2896);
         GL11.glEnable(3553);
      }

   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(ia v0, double v1, double v2, double v3, float v4, float v5) { this.a((ael)v0, v1, v2, v3, v4, v5); }
}
