package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public abstract class rg {
   protected wb c;
   private al a = new fa();
   protected acr d = new acr();
   protected float e = 0.0F;
   protected float f = 1.0F;

   public abstract void a(ia var1, double var2, double var4, double var6, float var8, float var9);

   protected void a(String var1) {
      zh var2 = this.c.e;
      var2.b(var2.b(var1));
   }

   protected boolean a(String var1, String var2) {
      zh var3 = this.c.e;
      int var4 = var3.a(var1, var2);
      if (var4 >= 0) {
         var3.b(var4);
         return true;
      } else {
         return false;
      }
   }

   private void a(ia var1, double var2, double var4, double var6, float var8) {
      GL11.glDisable(2896);
      int var9 = yy.ar.bL;
      int var10 = (var9 & 15) << 4;
      int var11 = var9 & 240;
      float var12 = (float)var10 / 256.0F;
      float var13 = ((float)var10 + 15.99F) / 256.0F;
      float var14 = (float)var11 / 256.0F;
      float var15 = ((float)var11 + 15.99F) / 256.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var16 = var1.M * 1.4F;
      GL11.glScalef(var16, var16, var16);
      this.a("/terrain.png");
      cv var17 = cv.a;
      float var18 = 0.5F;
      float var19 = 0.0F;
      float var20 = var1.N / var16;
      float var21 = (float)(var1.t - var1.C.b);
      GL11.glRotatef(-this.c.i, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, -0.3F + (float)((int)var20) * 0.02F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var22 = 0.0F;
      int var23 = 0;
      var17.b();

      while(var20 > 0.0F) {
         if (var23 % 2 == 0) {
            var12 = (float)var10 / 256.0F;
            var13 = ((float)var10 + 15.99F) / 256.0F;
            var14 = (float)var11 / 256.0F;
            var15 = ((float)var11 + 15.99F) / 256.0F;
         } else {
            var12 = (float)var10 / 256.0F;
            var13 = ((float)var10 + 15.99F) / 256.0F;
            var14 = (float)(var11 + 16) / 256.0F;
            var15 = ((float)(var11 + 16) + 15.99F) / 256.0F;
         }

         if (var23 / 2 % 2 == 0) {
            float var24 = var13;
            var13 = var12;
            var12 = var24;
         }

         var17.a((double)(var18 - var19), (double)(0.0F - var21), (double)var22, (double)var13, (double)var15);
         var17.a((double)(-var18 - var19), (double)(0.0F - var21), (double)var22, (double)var12, (double)var15);
         var17.a((double)(-var18 - var19), (double)(1.4F - var21), (double)var22, (double)var12, (double)var14);
         var17.a((double)(var18 - var19), (double)(1.4F - var21), (double)var22, (double)var13, (double)var14);
         var20 -= 0.45F;
         var21 -= 0.45F;
         var18 *= 0.9F;
         var22 += 0.03F;
         ++var23;
      }

      var17.a();
      GL11.glPopMatrix();
      GL11.glEnable(2896);
   }

   private void c(ia var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      zh var10 = this.c.e;
      var10.b(var10.b("%clamp%/misc/shadow.png"));
      ry var11 = this.b();
      GL11.glDepthMask(false);
      float var12 = this.e;
      if (var1 instanceof nq) {
         nq var13 = (nq)var1;
         var12 *= var13.aq();
         if (var13 instanceof fx) {
            fx var14 = (fx)var13;
            if (var14.q_()) {
               var12 *= 0.5F;
            }
         }
      }

      double var36 = var1.R + (var1.s - var1.R) * (double)var9;
      double var15 = var1.S + (var1.t - var1.S) * (double)var9 + (double)var1.i_();
      double var17 = var1.T + (var1.u - var1.T) * (double)var9;
      int var19 = me.c(var36 - (double)var12);
      int var20 = me.c(var36 + (double)var12);
      int var21 = me.c(var15 - (double)var12);
      int var22 = me.c(var15);
      int var23 = me.c(var17 - (double)var12);
      int var24 = me.c(var17 + (double)var12);
      double var25 = var2 - var36;
      double var27 = var4 - var15;
      double var29 = var6 - var17;
      cv var31 = cv.a;
      var31.b();

      for(int var32 = var19; var32 <= var20; ++var32) {
         for(int var33 = var21; var33 <= var22; ++var33) {
            for(int var34 = var23; var34 <= var24; ++var34) {
               int var35 = var11.a(var32, var33 - 1, var34);
               if (var35 > 0 && var11.n(var32, var33, var34) > 3) {
                  this.a(yy.k[var35], var2, var4 + (double)var1.i_(), var6, var32, var33, var34, var8, var12, var25, var27 + (double)var1.i_(), var29);
               }
            }
         }
      }

      var31.a();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glDepthMask(true);
   }

   private ry b() {
      return this.c.g;
   }

   private void a(yy var1, double var2, double var4, double var6, int var8, int var9, int var10, float var11, float var12, double var13, double var15, double var17) {
      cv var19 = cv.a;
      if (var1.b()) {
         double var20 = ((double)var11 - (var4 - ((double)var9 + var15)) / (double)2.0F) * (double)0.5F * (double)this.b().c(var8, var9, var10);
         if (!(var20 < (double)0.0F)) {
            if (var20 > (double)1.0F) {
               var20 = (double)1.0F;
            }

            var19.a(1.0F, 1.0F, 1.0F, (float)var20);
            double var22 = (double)var8 + var1.bR + var13;
            double var24 = (double)var8 + var1.bU + var13;
            double var26 = (double)var9 + var1.bS + var15 + (double)0.015625F;
            double var28 = (double)var10 + var1.bT + var17;
            double var30 = (double)var10 + var1.bW + var17;
            float var32 = (float)((var2 - var22) / (double)2.0F / (double)var12 + (double)0.5F);
            float var33 = (float)((var2 - var24) / (double)2.0F / (double)var12 + (double)0.5F);
            float var34 = (float)((var6 - var28) / (double)2.0F / (double)var12 + (double)0.5F);
            float var35 = (float)((var6 - var30) / (double)2.0F / (double)var12 + (double)0.5F);
            var19.a(var22, var26, var28, (double)var32, (double)var34);
            var19.a(var22, var26, var30, (double)var32, (double)var35);
            var19.a(var24, var26, var30, (double)var33, (double)var35);
            var19.a(var24, var26, var28, (double)var33, (double)var34);
         }
      }
   }

   public static void a(c var0, double var1, double var3, double var5) {
      GL11.glDisable(3553);
      cv var7 = cv.a;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var7.b();
      var7.b(var1, var3, var5);
      var7.b(0.0F, 0.0F, -1.0F);
      var7.a(var0.a, var0.e, var0.c);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.a, var0.b, var0.c);
      var7.b(0.0F, 0.0F, 1.0F);
      var7.a(var0.a, var0.b, var0.f);
      var7.a(var0.d, var0.b, var0.f);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.a, var0.e, var0.f);
      var7.b(0.0F, -1.0F, 0.0F);
      var7.a(var0.a, var0.b, var0.c);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.d, var0.b, var0.f);
      var7.a(var0.a, var0.b, var0.f);
      var7.b(0.0F, 1.0F, 0.0F);
      var7.a(var0.a, var0.e, var0.f);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.a, var0.e, var0.c);
      var7.b(-1.0F, 0.0F, 0.0F);
      var7.a(var0.a, var0.b, var0.f);
      var7.a(var0.a, var0.e, var0.f);
      var7.a(var0.a, var0.e, var0.c);
      var7.a(var0.a, var0.b, var0.c);
      var7.b(1.0F, 0.0F, 0.0F);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.d, var0.b, var0.f);
      var7.b((double)0.0F, (double)0.0F, (double)0.0F);
      var7.a();
      GL11.glEnable(3553);
   }

   public static void a(c var0) {
      cv var1 = cv.a;
      var1.b();
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.d, var0.b, var0.f);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.f);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.d, var0.b, var0.f);
      var1.a();
   }

   public void a(wb var1) {
      this.c = var1;
   }

   public void b(ia var1, double var2, double var4, double var6, float var8, float var9) {
      if (this.c.k.j && this.e > 0.0F) {
         double var10 = this.c.a(var1.s, var1.t, var1.u);
         float var12 = (float)(((double)1.0F - var10 / (double)256.0F) * (double)this.f);
         if (var12 > 0.0F) {
            this.c(var1, var2, var4, var6, var12, var9);
         }
      }

      if (var1.V()) {
         this.a(var1, var2, var4, var6, var9);
      }

   }

   public abe a() {
      return this.c.a();
   }
}
