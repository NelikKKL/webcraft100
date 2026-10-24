package net.minecraft.client;

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class iw extends rg {
   private acr g = new acr();
   private Random h = new net.minecraft.client.web.JRandom();
   public boolean a = true;
   public float b = 0.0F;

   public iw() {
      this.e = 0.15F;
      this.f = 0.75F;
   }

   public void a(ih var1, double var2, double var4, double var6, float var8, float var9) {
      this.h.setSeed(187L);
      dk var10 = var1.a;
      GL11.glPushMatrix();
      float var11 = me.a(((float)var1.b + var9) / 10.0F + var1.d) * 0.1F + 0.1F;
      float var12 = (((float)var1.b + var9) / 20.0F + var1.d) * (180F / (float)Math.PI);
      byte var13 = 1;
      if (var1.a.a > 1) {
         var13 = 2;
      }

      if (var1.a.a > 5) {
         var13 = 3;
      }

      if (var1.a.a > 20) {
         var13 = 4;
      }

      GL11.glTranslatef((float)var2, (float)var4 + var11, (float)var6);
      GL11.glEnable(32826);
      if (var10.c < 256 && acr.a(yy.k[var10.c].c())) {
         GL11.glRotatef(var12, 0.0F, 1.0F, 0.0F);
         this.a("/terrain.png");
         float var21 = 0.25F;
         int var23 = yy.k[var10.c].c();
         if (var23 == 1 || var23 == 19 || var23 == 12 || var23 == 2) {
            var21 = 0.5F;
         }

         GL11.glScalef(var21, var21, var21);

         for(int var25 = 0; var25 < var13; ++var25) {
            GL11.glPushMatrix();
            if (var25 > 0) {
               float var27 = (this.h.nextFloat() * 2.0F - 1.0F) * 0.2F / var21;
               float var30 = (this.h.nextFloat() * 2.0F - 1.0F) * 0.2F / var21;
               float var32 = (this.h.nextFloat() * 2.0F - 1.0F) * 0.2F / var21;
               GL11.glTranslatef(var27, var30, var32);
            }

            float var28 = 1.0F;
            this.g.a(yy.k[var10.c], var10.i(), var28);
            GL11.glPopMatrix();
         }
      } else if (var10.c == acy.br.bM) {
         GL11.glScalef(0.5F, 0.5F, 0.5F);
         short var14 = 141;
         this.a("/gui/items.png");
         float var15 = 1.0F;
         if (this.a) {
            int var16 = acy.d[var10.c].c(var10.i());
            float var17 = (float)(var16 >> 16 & 255) / 255.0F;
            float var18 = (float)(var16 >> 8 & 255) / 255.0F;
            float var19 = (float)(var16 & 255) / 255.0F;
            GL11.glColor4f(var17 * var15, var18 * var15, var19 * var15, 1.0F);
         }

         this.a(var14, var13);
         if (this.a) {
            GL11.glColor4f(var15, var15, var15, 1.0F);
            this.a(var10.b(), var13);
         }
      } else {
         GL11.glScalef(0.5F, 0.5F, 0.5F);
         int var20 = var10.b();
         if (var10.c < 256) {
            this.a("/terrain.png");
         } else {
            this.a("/gui/items.png");
         }

         if (this.a) {
            int var22 = acy.d[var10.c].c(var10.i());
            float var24 = (float)(var22 >> 16 & 255) / 255.0F;
            float var26 = (float)(var22 >> 8 & 255) / 255.0F;
            float var29 = (float)(var22 & 255) / 255.0F;
            float var31 = 1.0F;
            GL11.glColor4f(var24 * var31, var26 * var31, var29 * var31, 1.0F);
         }

         this.a(var20, var13);
      }

      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }

   private void a(int var1, int var2) {
      cv var3 = cv.a;
      float var4 = (float)(var1 % 16 * 16 + 0) / 256.0F;
      float var5 = (float)(var1 % 16 * 16 + 16) / 256.0F;
      float var6 = (float)(var1 / 16 * 16 + 0) / 256.0F;
      float var7 = (float)(var1 / 16 * 16 + 16) / 256.0F;
      float var8 = 1.0F;
      float var9 = 0.5F;
      float var10 = 0.25F;

      for(int var11 = 0; var11 < var2; ++var11) {
         GL11.glPushMatrix();
         if (var11 > 0) {
            float var12 = (this.h.nextFloat() * 2.0F - 1.0F) * 0.3F;
            float var13 = (this.h.nextFloat() * 2.0F - 1.0F) * 0.3F;
            float var14 = (this.h.nextFloat() * 2.0F - 1.0F) * 0.3F;
            GL11.glTranslatef(var12, var13, var14);
         }

         GL11.glRotatef(180.0F - this.c.i, 0.0F, 1.0F, 0.0F);
         var3.b();
         var3.b(0.0F, 1.0F, 0.0F);
         var3.a((double)(0.0F - var9), (double)(0.0F - var10), (double)0.0F, (double)var4, (double)var7);
         var3.a((double)(var8 - var9), (double)(0.0F - var10), (double)0.0F, (double)var5, (double)var7);
         var3.a((double)(var8 - var9), (double)(1.0F - var10), (double)0.0F, (double)var5, (double)var6);
         var3.a((double)(0.0F - var9), (double)(1.0F - var10), (double)0.0F, (double)var4, (double)var6);
         var3.a();
         GL11.glPopMatrix();
      }

   }

   public void a(abe var1, zh var2, int var3, int var4, int var5, int var6, int var7) {
      if (var3 < 256 && acr.a(yy.k[var3].c())) {
         var2.b(var2.b("/terrain.png"));
         yy var16 = yy.k[var3];
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(var6 - 2), (float)(var7 + 3), -3.0F + this.b);
         GL11.glScalef(10.0F, 10.0F, 10.0F);
         GL11.glTranslatef(1.0F, 0.5F, 1.0F);
         GL11.glScalef(1.0F, 1.0F, -1.0F);
         GL11.glRotatef(210.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         int var18 = acy.d[var3].c(var4);
         float var20 = (float)(var18 >> 16 & 255) / 255.0F;
         float var21 = (float)(var18 >> 8 & 255) / 255.0F;
         float var13 = (float)(var18 & 255) / 255.0F;
         if (this.a) {
            GL11.glColor4f(var20, var21, var13, 1.0F);
         }

         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         this.g.c = this.a;
         this.g.a(var16, var4, 1.0F);
         this.g.c = true;
         GL11.glPopMatrix();
      } else if (var3 == acy.br.bM) {
         GL11.glDisable(2896);
         var2.b(var2.b("/gui/items.png"));
         short var8 = 141;
         int var9 = acy.d[var3].c(var4);
         float var10 = (float)(var9 >> 16 & 255) / 255.0F;
         float var11 = (float)(var9 >> 8 & 255) / 255.0F;
         float var12 = (float)(var9 & 255) / 255.0F;
         if (this.a) {
            GL11.glColor4f(var10, var11, var12, 1.0F);
         }

         this.a(var6, var7, var8 % 16 * 16, var8 / 16 * 16, 16, 16);
         if (this.a) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

         this.a(var6, var7, var5 % 16 * 16, var5 / 16 * 16, 16, 16);
         GL11.glEnable(2896);
      } else if (var5 >= 0) {
         GL11.glDisable(2896);
         if (var3 < 256) {
            var2.b(var2.b("/terrain.png"));
         } else {
            var2.b(var2.b("/gui/items.png"));
         }

         int var14 = acy.d[var3].c(var4);
         float var15 = (float)(var14 >> 16 & 255) / 255.0F;
         float var17 = (float)(var14 >> 8 & 255) / 255.0F;
         float var19 = (float)(var14 & 255) / 255.0F;
         if (this.a) {
            GL11.glColor4f(var15, var17, var19, 1.0F);
         }

         this.a(var6, var7, var5 % 16 * 16, var5 / 16 * 16, 16, 16);
         GL11.glEnable(2896);
      }

      GL11.glEnable(2884);
   }

   public void a(abe var1, zh var2, dk var3, int var4, int var5) {
      if (var3 != null) {
         this.a(var1, var2, var3.c, var3.i(), var3.b(), var4, var5);
         if (var3 != null && var3.r()) {
            GL11.glDepthFunc(516);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            var2.b(var2.b("%blur%/misc/glint.png"));
            this.b -= 50.0F;
            GL11.glEnable(3042);
            GL11.glBlendFunc(774, 774);
            GL11.glColor4f(0.5F, 0.25F, 0.8F, 1.0F);
            this.a(var4 * 431278612 + var5 * 32178161, var4 - 2, var5 - 2, 20, 20);
            GL11.glDisable(3042);
            GL11.glDepthMask(true);
            this.b += 50.0F;
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
         }

      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 2; ++var6) {
         if (var6 == 0) {
            GL11.glBlendFunc(768, 1);
         }

         if (var6 == 1) {
            GL11.glBlendFunc(768, 1);
         }

         float var7 = 0.00390625F;
         float var8 = 0.00390625F;
         float var9 = (float)(System.currentTimeMillis() % (long)(3000 + var6 * 1873)) / (3000.0F + (float)(var6 * 1873)) * 256.0F;
         float var10 = 0.0F;
         cv var11 = cv.a;
         float var12 = 4.0F;
         if (var6 == 1) {
            var12 = -1.0F;
         }

         var11.b();
         var11.a((double)(var2 + 0), (double)(var3 + var5), (double)this.b, (double)((var9 + (float)var5 * var12) * var7), (double)((var10 + (float)var5) * var8));
         var11.a((double)(var2 + var4), (double)(var3 + var5), (double)this.b, (double)((var9 + (float)var4 + (float)var5 * var12) * var7), (double)((var10 + (float)var5) * var8));
         var11.a((double)(var2 + var4), (double)(var3 + 0), (double)this.b, (double)((var9 + (float)var4) * var7), (double)((var10 + 0.0F) * var8));
         var11.a((double)(var2 + 0), (double)(var3 + 0), (double)this.b, (double)((var9 + 0.0F) * var7), (double)((var10 + 0.0F) * var8));
         var11.a();
      }

   }

   public void b(abe var1, zh var2, dk var3, int var4, int var5) {
      if (var3 != null) {
         if (var3.a > 1) {
            String var6 = "" + var3.a;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            var1.a(var6, var4 + 19 - 2 - var1.a(var6), var5 + 6 + 3, 16777215);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }

         if (var3.g()) {
            int var11 = (int)net.minecraft.client.web.JMath.round((double)13.0F - (double)var3.h() * (double)13.0F / (double)var3.j());
            int var7 = (int)net.minecraft.client.web.JMath.round((double)255.0F - (double)var3.h() * (double)255.0F / (double)var3.j());
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            cv var8 = cv.a;
            int var9 = 255 - var7 << 16 | var7 << 8;
            int var10 = (255 - var7) / 4 << 16 | 16128;
            this.a(var8, var4 + 2, var5 + 13, 13, 2, 0);
            this.a(var8, var4 + 2, var5 + 13, 12, 1, var10);
            this.a(var8, var4 + 2, var5 + 13, var11, 1, var9);
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

      }
   }

   private void a(cv var1, int var2, int var3, int var4, int var5, int var6) {
      var1.b();
      var1.c(var6);
      var1.a((double)(var2 + 0), (double)(var3 + 0), (double)0.0F);
      var1.a((double)(var2 + 0), (double)(var3 + var5), (double)0.0F);
      var1.a((double)(var2 + var4), (double)(var3 + var5), (double)0.0F);
      var1.a((double)(var2 + var4), (double)(var3 + 0), (double)0.0F);
      var1.a();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      cv var9 = cv.a;
      var9.b();
      var9.a((double)(var1 + 0), (double)(var2 + var6), (double)this.b, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + var6), (double)this.b, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + 0), (double)this.b, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.a((double)(var1 + 0), (double)(var2 + 0), (double)this.b, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.a();
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(ia v0, double v1, double v2, double v3, float v4, float v5) { this.a((ih)v0, v1, v2, v3, v4, v5); }
}
