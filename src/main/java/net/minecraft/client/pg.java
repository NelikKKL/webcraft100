package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class pg extends rg {
   protected al a;

   public pg() {
      this.e = 0.5F;
      this.a = new iv();
   }

   public void a(vm var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      long var10 = (long)var1.j * 493286711L;
      var10 = var10 * var10 * 4392167121L + var10 * 98761L;
      float var12 = (((float)(var10 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var13 = (((float)(var10 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var14 = (((float)(var10 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      GL11.glTranslatef(var12, var13, var14);
      double var15 = var1.R + (var1.s - var1.R) * (double)var9;
      double var17 = var1.S + (var1.t - var1.S) * (double)var9;
      double var19 = var1.T + (var1.u - var1.T) * (double)var9;
      double var21 = (double)0.3F;
      fb var23 = var1.i(var15, var17, var19);
      float var24 = var1.B + (var1.z - var1.B) * var9;
      if (var23 != null) {
         fb var25 = var1.a(var15, var17, var19, var21);
         fb var26 = var1.a(var15, var17, var19, -var21);
         if (var25 == null) {
            var25 = var23;
         }

         if (var26 == null) {
            var26 = var23;
         }

         var2 += var23.a - var15;
         var4 += (var25.b + var26.b) / (double)2.0F - var17;
         var6 += var23.c - var19;
         fb var27 = var26.c(-var25.a, -var25.b, -var25.c);
         if (var27.d() != (double)0.0F) {
            var27 = var27.c();
            var8 = (float)(Math.atan2(var27.c, var27.a) * (double)180.0F / Math.PI);
            var24 = (float)(Math.atan(var27.b) * (double)73.0F);
         }
      }

      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(180.0F - var8, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var24, 0.0F, 0.0F, 1.0F);
      float var29 = (float)var1.l() - var9;
      float var30 = (float)var1.i() - var9;
      if (var30 < 0.0F) {
         var30 = 0.0F;
      }

      if (var29 > 0.0F) {
         GL11.glRotatef(me.a(var29) * var29 * var30 / 10.0F * (float)var1.m(), 1.0F, 0.0F, 0.0F);
      }

      if (var1.a != 0) {
         this.a("/terrain.png");
         float var32 = 0.75F;
         GL11.glScalef(var32, var32, var32);
         if (var1.a == 1) {
            GL11.glTranslatef(-0.5F, 0.0F, 0.5F);
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            (new acr()).a(yy.au, 0, var1.b(var9));
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.5F, 0.0F, -0.5F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         } else if (var1.a == 2) {
            GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            (new acr()).a(yy.aB, 0, var1.b(var9));
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.3125F, 0.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

         GL11.glScalef(1.0F / var32, 1.0F / var32, 1.0F / var32);
      }

      this.a("/item/cart.png");
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      this.a.a(var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(ia v0, double v1, double v2, double v3, float v4, float v5) { this.a((vm)v0, v1, v2, v3, v4, v5); }
}
