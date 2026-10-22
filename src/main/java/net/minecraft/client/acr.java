package net.minecraft.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class acr {
   public kq a;
   private int e = -1;
   private boolean f = false;
   private boolean g = false;
   public static boolean b = true;
   public boolean c = true;
   public boolean[] d = new boolean[256];
   private int h = 0;
   private int i = 0;
   private int j = 0;
   private int k = 0;
   private int l = 0;
   private int m = 0;
   private boolean n;
   private float o;
   private float p;
   private float q;
   private float r;
   private float s;
   private float t;
   private float u;
   private float v;
   private float w;
   private float x;
   private float y;
   private float z;
   private float A;
   private float B;
   private float C;
   private float D;
   private float E;
   private float F;
   private float G;
   private float H;
   private float I;
   private float J;
   private float K;
   private float L;
   private float M;
   private float N;
   private float O;
   private int P;
   private int Q;
   private int R;
   private int S;
   private int T;
   private int U;
   private int V;
   private int W;
   private int X;
   private int Y;
   private int Z;
   private int aa;
   private int ab;
   private int ac;
   private int ad;
   private int ae;
   private int af;
   private int ag;
   private int ah;
   private int ai;
   private int aj = 1;
   private int ak;
   private int al;
   private int am;
   private int an;
   private float ao;
   private float ap;
   private float aq;
   private float ar;
   private float as;
   private float at;
   private float au;
   private float av;
   private float aw;
   private float ax;
   private float ay;
   private float az;
   private boolean aA;
   private boolean aB;
   private boolean aC;
   private boolean aD;
   private boolean aE;
   private boolean aF;
   private boolean aG;
   private boolean aH;
   private boolean aI;
   private boolean aJ;
   private boolean aK;
   private boolean aL;

   public acr(kq var1) {
      this.a = var1;

      for(int var2 = 0; var2 < 256; ++var2) {
         yy var3 = yy.k[var2];
         if (var3 != null) {
            if (var3 == yy.aT) {
               this.d[var2] = true;
            }

            if (var3.b() && var3.a()) {
               this.d[var2] = true;
            }
         }
      }

   }

   public acr() {
   }

   public void a() {
      this.e = -1;
   }

   public void a(yy var1, int var2, int var3, int var4, int var5) {
      this.e = var5;
      this.b(var1, var2, var3, var4);
      this.e = -1;
   }

   public void a(yy var1, int var2, int var3, int var4) {
      this.g = true;
      this.b(var1, var2, var3, var4);
      this.g = false;
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      if (this != null) {
         return false;
      } else {
         byte var5 = 13;
         byte var6 = 52;
         byte var7 = 32;
         int var8 = me.a(var1 - var5);
         int var9 = me.a(var3 - var6);
         if (var9 <= var7 && var8 <= var7 && (var8 == var7 || var9 == var7) && this.d[this.a.a(var1, var2, var3)]) {
            int var10 = 5;
            if (var1 == var5 - var7) {
               --var10;
            }

            if (var1 == var5 + var7) {
               ++var10;
            }

            if (var3 == var6 - var7) {
               var10 -= 3;
            }

            if (var3 == var6 + var7) {
               var10 += 3;
            }

            this.b(var10, var1, var2, var3);
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean b(yy var1, int var2, int var3, int var4) {
      int var5 = var1.c();
      var1.b(this.a, var2, var3, var4);
      if (var5 == 0) {
         return this.o(var1, var2, var3, var4);
      } else if (var5 == 4) {
         return this.n(var1, var2, var3, var4);
      } else if (var5 == 13) {
         return this.p(var1, var2, var3, var4);
      } else if (var5 == 1) {
         return this.j(var1, var2, var3, var4);
      } else if (var5 == 19) {
         return this.k(var1, var2, var3, var4);
      } else if (var5 == 23) {
         return this.m(var1, var2, var3, var4);
      } else if (var5 == 6) {
         return this.l(var1, var2, var3, var4);
      } else if (var5 == 2) {
         return this.c(var1, var2, var3, var4);
      } else if (var5 == 3) {
         return this.f(var1, var2, var3, var4);
      } else if (var5 == 5) {
         return this.g(var1, var2, var3, var4);
      } else if (var5 == 8) {
         return this.h(var1, var2, var3, var4);
      } else if (var5 == 7) {
         return this.r(var1, var2, var3, var4);
      } else if (var5 == 9) {
         return this.a((afr)var1, var2, var3, var4);
      } else if (var5 == 10) {
         return this.q(var1, var2, var3, var4);
      } else if (var5 == 27) {
         return this.a((aci)var1, var2, var3, var4);
      } else if (var5 == 11) {
         return this.a((nz)var1, var2, var3, var4);
      } else if (var5 == 12) {
         return this.e(var1, var2, var3, var4);
      } else if (var5 == 14) {
         return this.t(var1, var2, var3, var4);
      } else if (var5 == 15) {
         return this.u(var1, var2, var3, var4);
      } else if (var5 == 16) {
         return this.b(var1, var2, var3, var4, false);
      } else if (var5 == 17) {
         return this.c(var1, var2, var3, var4, true);
      } else if (var5 == 18) {
         return this.a((uh)var1, var2, var3, var4);
      } else if (var5 == 20) {
         return this.i(var1, var2, var3, var4);
      } else if (var5 == 21) {
         return this.a((fp)var1, var2, var3, var4);
      } else if (var5 == 24) {
         return this.a((ic)var1, var2, var3, var4);
      } else if (var5 == 25) {
         return this.a((ahp)var1, var2, var3, var4);
      } else {
         return var5 == 26 ? this.s(var1, var2, var3, var4) : false;
      }
   }

   private boolean s(yy var1, int var2, int var3, int var4) {
      int var5 = this.a.d(var2, var3, var4);
      int var6 = var5 & 3;
      if (var6 == 0) {
         this.l = 3;
      } else if (var6 == 3) {
         this.l = 1;
      } else if (var6 == 1) {
         this.l = 2;
      }

      if (!rl.e(var5)) {
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.e();
         this.l = 0;
         return true;
      } else {
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
         this.o(var1, var2, var3, var4);
         this.e = 174;
         var1.a(0.25F, 0.8125F, 0.25F, 0.75F, 1.0F, 0.75F);
         this.o(var1, var2, var3, var4);
         this.a();
         var1.e();
         this.l = 0;
         return true;
      }
   }

   private boolean t(yy var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      int var6 = this.a.d(var2, var3, var4);
      int var7 = aab.e(var6);
      boolean var8 = aab.f(var6);
      float var9 = 0.5F;
      float var10 = 1.0F;
      float var11 = 0.8F;
      float var12 = 0.6F;
      int var25 = var1.e(this.a, var2, var3, var4);
      var5.b(var25);
      var5.a(var9, var9, var9);
      int var27 = var1.a((kq)this.a, var2, var3, var4, 0);
      int var28 = (var27 & 15) << 4;
      int var29 = var27 & 240;
      double var30 = (double)((float)var28 / 256.0F);
      double var32 = ((double)(var28 + 16) - 0.01) / (double)256.0F;
      double var34 = (double)((float)var29 / 256.0F);
      double var36 = ((double)(var29 + 16) - 0.01) / (double)256.0F;
      double var38 = (double)var2 + var1.bR;
      double var40 = (double)var2 + var1.bU;
      double var42 = (double)var3 + var1.bS + (double)0.1875F;
      double var44 = (double)var4 + var1.bT;
      double var46 = (double)var4 + var1.bW;
      var5.a(var38, var42, var46, var30, var36);
      var5.a(var38, var42, var44, var30, var34);
      var5.a(var40, var42, var44, var32, var34);
      var5.a(var40, var42, var46, var32, var36);
      var5.b(var1.e(this.a, var2, var3 + 1, var4));
      var5.a(var10, var10, var10);
      var27 = var1.a((kq)this.a, var2, var3, var4, 1);
      var28 = (var27 & 15) << 4;
      var29 = var27 & 240;
      var30 = (double)((float)var28 / 256.0F);
      var32 = ((double)(var28 + 16) - 0.01) / (double)256.0F;
      var34 = (double)((float)var29 / 256.0F);
      var36 = ((double)(var29 + 16) - 0.01) / (double)256.0F;
      var38 = var30;
      var40 = var32;
      var42 = var34;
      var44 = var34;
      var46 = var30;
      double var48 = var32;
      double var50 = var36;
      double var52 = var36;
      if (var7 == 0) {
         var40 = var30;
         var42 = var36;
         var46 = var32;
         var52 = var34;
      } else if (var7 == 2) {
         var38 = var32;
         var44 = var36;
         var48 = var30;
         var50 = var34;
      } else if (var7 == 3) {
         var38 = var32;
         var44 = var36;
         var48 = var30;
         var50 = var34;
         var40 = var30;
         var42 = var36;
         var46 = var32;
         var52 = var34;
      }

      double var54 = (double)var2 + var1.bR;
      double var56 = (double)var2 + var1.bU;
      double var58 = (double)var3 + var1.bV;
      double var60 = (double)var4 + var1.bT;
      double var62 = (double)var4 + var1.bW;
      var5.a(var56, var58, var62, var46, var50);
      var5.a(var56, var58, var60, var38, var42);
      var5.a(var54, var58, var60, var40, var44);
      var5.a(var54, var58, var62, var48, var52);
      var27 = lz.c[var7];
      if (var8) {
         var27 = lz.c[lz.e[var7]];
      }

      var28 = 4;
      switch (var7) {
         case 0:
            var28 = 5;
            break;
         case 1:
            var28 = 3;
         case 2:
         default:
            break;
         case 3:
            var28 = 2;
      }

      if (var27 != 2 && (this.g || var1.a_(this.a, var2, var3, var4 - 1, 2))) {
         var5.b(var1.bT > (double)0.0F ? var25 : var1.e(this.a, var2, var3, var4 - 1));
         var5.a(var11, var11, var11);
         this.f = var28 == 2;
         this.c(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 2));
      }

      if (var27 != 3 && (this.g || var1.a_(this.a, var2, var3, var4 + 1, 3))) {
         var5.b(var1.bW < (double)1.0F ? var25 : var1.e(this.a, var2, var3, var4 + 1));
         var5.a(var11, var11, var11);
         this.f = var28 == 3;
         this.d(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 3));
      }

      if (var27 != 4 && (this.g || var1.a_(this.a, var2 - 1, var3, var4, 4))) {
         var5.b(var1.bT > (double)0.0F ? var25 : var1.e(this.a, var2 - 1, var3, var4));
         var5.a(var12, var12, var12);
         this.f = var28 == 4;
         this.e(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 4));
      }

      if (var27 != 5 && (this.g || var1.a_(this.a, var2 + 1, var3, var4, 5))) {
         var5.b(var1.bW < (double)1.0F ? var25 : var1.e(this.a, var2 + 1, var3, var4));
         var5.a(var12, var12, var12);
         this.f = var28 == 5;
         this.f(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 5));
      }

      this.f = false;
      return true;
   }

   private boolean a(ahp var1, int var2, int var3, int var4) {
      var1.a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
      this.o(var1, var2, var3, var4);
      this.e = 156;
      var1.a(0.5625F, 0.0F, 0.3125F, 0.9375F, 0.125F, 0.6875F);
      this.o(var1, var2, var3, var4);
      var1.a(0.125F, 0.0F, 0.0625F, 0.5F, 0.125F, 0.4375F);
      this.o(var1, var2, var3, var4);
      var1.a(0.125F, 0.0F, 0.5625F, 0.5F, 0.125F, 0.9375F);
      this.o(var1, var2, var3, var4);
      this.a();
      cv var5 = cv.a;
      var5.b(var1.e(this.a, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.a(this.a, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if (adt.a) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.a(var6 * var8, var6 * var9, var6 * var10);
      int var34 = var1.a(0, 0);
      if (this.e >= 0) {
         var34 = this.e;
      }

      int var35 = (var34 & 15) << 4;
      int var36 = var34 & 240;
      double var14 = (double)((float)var36 / 256.0F);
      double var16 = (double)(((float)var36 + 15.99F) / 256.0F);
      int var18 = this.a.d(var2, var3, var4);

      for(int var19 = 0; var19 < 3; ++var19) {
         double var20 = (double)var19 * Math.PI * (double)2.0F / (double)3.0F + (Math.PI / 2D);
         double var22 = (double)(((float)var35 + 8.0F) / 256.0F);
         double var24 = (double)(((float)var35 + 15.99F) / 256.0F);
         if ((var18 & 1 << var19) != 0) {
            var22 = (double)(((float)var35 + 7.99F) / 256.0F);
            var24 = (double)(((float)var35 + 0.0F) / 256.0F);
         }

         double var26 = (double)var2 + (double)0.5F;
         double var28 = (double)var2 + (double)0.5F + Math.sin(var20) * (double)8.0F / (double)16.0F;
         double var30 = (double)var4 + (double)0.5F;
         double var32 = (double)var4 + (double)0.5F + Math.cos(var20) * (double)8.0F / (double)16.0F;
         var5.a(var26, (double)(var3 + 1), var30, var22, var14);
         var5.a(var26, (double)(var3 + 0), var30, var22, var16);
         var5.a(var28, (double)(var3 + 0), var32, var24, var16);
         var5.a(var28, (double)(var3 + 1), var32, var24, var14);
         var5.a(var28, (double)(var3 + 1), var32, var24, var14);
         var5.a(var28, (double)(var3 + 0), var32, var24, var16);
         var5.a(var26, (double)(var3 + 0), var30, var22, var16);
         var5.a(var26, (double)(var3 + 1), var30, var22, var14);
      }

      var1.e();
      return true;
   }

   private boolean a(ic var1, int var2, int var3, int var4) {
      this.o(var1, var2, var3, var4);
      cv var5 = cv.a;
      var5.b(var1.e(this.a, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.a(this.a, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if (adt.a) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.a(var6 * var8, var6 * var9, var6 * var10);
      short var16 = 154;
      float var17 = 0.125F;
      this.f(var1, (double)((float)var2 - 1.0F + var17), (double)var3, (double)var4, var16);
      this.e(var1, (double)((float)var2 + 1.0F - var17), (double)var3, (double)var4, var16);
      this.d(var1, (double)var2, (double)var3, (double)((float)var4 - 1.0F + var17), var16);
      this.c(var1, (double)var2, (double)var3, (double)((float)var4 + 1.0F - var17), var16);
      short var18 = 139;
      this.b(var1, (double)var2, (double)((float)var3 - 1.0F + 0.25F), (double)var4, var18);
      this.a(var1, (double)var2, (double)((float)var3 + 1.0F - 0.75F), (double)var4, var18);
      int var14 = this.a.d(var2, var3, var4);
      if (var14 > 0) {
         short var15 = 205;
         if (var14 > 3) {
            var14 = 3;
         }

         this.b(var1, (double)var2, (double)((float)var3 - 1.0F + (6.0F + (float)var14 * 3.0F) / 16.0F), (double)var4, var15);
      }

      return true;
   }

   public boolean c(yy var1, int var2, int var3, int var4) {
      int var5 = this.a.d(var2, var3, var4);
      cv var6 = cv.a;
      var6.b(var1.e(this.a, var2, var3, var4));
      var6.a(1.0F, 1.0F, 1.0F);
      double var7 = (double)0.4F;
      double var9 = (double)0.5F - var7;
      double var11 = (double)0.2F;
      if (var5 == 1) {
         this.a(var1, (double)var2 - var9, (double)var3 + var11, (double)var4, -var7, (double)0.0F);
      } else if (var5 == 2) {
         this.a(var1, (double)var2 + var9, (double)var3 + var11, (double)var4, var7, (double)0.0F);
      } else if (var5 == 3) {
         this.a(var1, (double)var2, (double)var3 + var11, (double)var4 - var9, (double)0.0F, -var7);
      } else if (var5 == 4) {
         this.a(var1, (double)var2, (double)var3 + var11, (double)var4 + var9, (double)0.0F, var7);
      } else {
         this.a(var1, (double)var2, (double)var3, (double)var4, (double)0.0F, (double)0.0F);
      }

      return true;
   }

   private boolean u(yy var1, int var2, int var3, int var4) {
      int var5 = this.a.d(var2, var3, var4);
      int var6 = var5 & 3;
      int var7 = (var5 & 12) >> 2;
      this.o(var1, var2, var3, var4);
      cv var8 = cv.a;
      var8.b(var1.e(this.a, var2, var3, var4));
      var8.a(1.0F, 1.0F, 1.0F);
      double var9 = (double)-0.1875F;
      double var11 = (double)0.0F;
      double var13 = (double)0.0F;
      double var15 = (double)0.0F;
      double var17 = (double)0.0F;
      switch (var6) {
         case 0:
            var17 = (double)-0.3125F;
            var13 = mz.a[var7];
            break;
         case 1:
            var15 = (double)0.3125F;
            var11 = -mz.a[var7];
            break;
         case 2:
            var17 = (double)0.3125F;
            var13 = -mz.a[var7];
            break;
         case 3:
            var15 = (double)-0.3125F;
            var11 = mz.a[var7];
      }

      this.a(var1, (double)var2 + var11, (double)var3 + var9, (double)var4 + var13, (double)0.0F, (double)0.0F);
      this.a(var1, (double)var2 + var15, (double)var3 + var9, (double)var4 + var17, (double)0.0F, (double)0.0F);
      int var19 = var1.b(1);
      int var20 = (var19 & 15) << 4;
      int var21 = var19 & 240;
      double var22 = (double)((float)var20 / 256.0F);
      double var24 = (double)(((float)var20 + 15.99F) / 256.0F);
      double var26 = (double)((float)var21 / 256.0F);
      double var28 = (double)(((float)var21 + 15.99F) / 256.0F);
      double var30 = (double)0.125F;
      double var32 = (double)(var2 + 1);
      double var34 = (double)(var2 + 1);
      double var36 = (double)(var2 + 0);
      double var38 = (double)(var2 + 0);
      double var40 = (double)(var4 + 0);
      double var42 = (double)(var4 + 1);
      double var44 = (double)(var4 + 1);
      double var46 = (double)(var4 + 0);
      double var48 = (double)var3 + var30;
      if (var6 == 2) {
         var32 = var34 = (double)(var2 + 0);
         var36 = var38 = (double)(var2 + 1);
         var40 = var46 = (double)(var4 + 1);
         var42 = var44 = (double)(var4 + 0);
      } else if (var6 == 3) {
         var32 = var38 = (double)(var2 + 0);
         var34 = var36 = (double)(var2 + 1);
         var40 = var42 = (double)(var4 + 0);
         var44 = var46 = (double)(var4 + 1);
      } else if (var6 == 1) {
         var32 = var38 = (double)(var2 + 1);
         var34 = var36 = (double)(var2 + 0);
         var40 = var42 = (double)(var4 + 1);
         var44 = var46 = (double)(var4 + 0);
      }

      var8.a(var38, var48, var46, var22, var26);
      var8.a(var36, var48, var44, var22, var28);
      var8.a(var34, var48, var42, var24, var28);
      var8.a(var32, var48, var40, var24, var26);
      return true;
   }

   public void d(yy var1, int var2, int var3, int var4) {
      this.g = true;
      this.b(var1, var2, var3, var4, true);
      this.g = false;
   }

   private boolean b(yy var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.a.d(var2, var3, var4);
      boolean var7 = var5 || (var6 & 8) != 0;
      int var8 = abr.e(var6);
      if (var7) {
         switch (var8) {
            case 0:
               this.h = 3;
               this.i = 3;
               this.j = 3;
               this.k = 3;
               var1.a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
               break;
            case 1:
               var1.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
               break;
            case 2:
               this.j = 1;
               this.k = 2;
               var1.a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
               break;
            case 3:
               this.j = 2;
               this.k = 1;
               this.l = 3;
               this.m = 3;
               var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
               break;
            case 4:
               this.h = 1;
               this.i = 2;
               this.l = 2;
               this.m = 1;
               var1.a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
               break;
            case 5:
               this.h = 2;
               this.i = 1;
               this.l = 1;
               this.m = 2;
               var1.a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
         }

         this.o(var1, var2, var3, var4);
         this.h = 0;
         this.i = 0;
         this.j = 0;
         this.k = 0;
         this.l = 0;
         this.m = 0;
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         switch (var8) {
            case 0:
               this.h = 3;
               this.i = 3;
               this.j = 3;
               this.k = 3;
            case 1:
            default:
               break;
            case 2:
               this.j = 1;
               this.k = 2;
               break;
            case 3:
               this.j = 2;
               this.k = 1;
               this.l = 3;
               this.m = 3;
               break;
            case 4:
               this.h = 1;
               this.i = 2;
               this.l = 2;
               this.m = 1;
               break;
            case 5:
               this.h = 2;
               this.i = 1;
               this.l = 1;
               this.m = 2;
         }

         this.o(var1, var2, var3, var4);
         this.h = 0;
         this.i = 0;
         this.j = 0;
         this.k = 0;
         this.l = 0;
         this.m = 0;
      }

      return true;
   }

   private void a(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      int var16 = 108;
      if (this.e >= 0) {
         var16 = this.e;
      }

      int var17 = (var16 & 15) << 4;
      int var18 = var16 & 240;
      cv var19 = cv.a;
      double var20 = (double)((float)(var17 + 0) / 256.0F);
      double var22 = (double)((float)(var18 + 0) / 256.0F);
      double var24 = ((double)var17 + var14 - 0.01) / (double)256.0F;
      double var26 = ((double)((float)var18 + 4.0F) - 0.01) / (double)256.0F;
      var19.a(var13, var13, var13);
      var19.a(var1, var7, var9, var24, var22);
      var19.a(var1, var5, var9, var20, var22);
      var19.a(var3, var5, var11, var20, var26);
      var19.a(var3, var7, var11, var24, var26);
   }

   private void b(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      int var16 = 108;
      if (this.e >= 0) {
         var16 = this.e;
      }

      int var17 = (var16 & 15) << 4;
      int var18 = var16 & 240;
      cv var19 = cv.a;
      double var20 = (double)((float)(var17 + 0) / 256.0F);
      double var22 = (double)((float)(var18 + 0) / 256.0F);
      double var24 = ((double)var17 + var14 - 0.01) / (double)256.0F;
      double var26 = ((double)((float)var18 + 4.0F) - 0.01) / (double)256.0F;
      var19.a(var13, var13, var13);
      var19.a(var1, var5, var11, var24, var22);
      var19.a(var1, var5, var9, var20, var22);
      var19.a(var3, var7, var9, var20, var26);
      var19.a(var3, var7, var11, var24, var26);
   }

   private void c(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      int var16 = 108;
      if (this.e >= 0) {
         var16 = this.e;
      }

      int var17 = (var16 & 15) << 4;
      int var18 = var16 & 240;
      cv var19 = cv.a;
      double var20 = (double)((float)(var17 + 0) / 256.0F);
      double var22 = (double)((float)(var18 + 0) / 256.0F);
      double var24 = ((double)var17 + var14 - 0.01) / (double)256.0F;
      double var26 = ((double)((float)var18 + 4.0F) - 0.01) / (double)256.0F;
      var19.a(var13, var13, var13);
      var19.a(var3, var5, var9, var24, var22);
      var19.a(var1, var5, var9, var20, var22);
      var19.a(var1, var7, var11, var20, var26);
      var19.a(var3, var7, var11, var24, var26);
   }

   public void a(yy var1, int var2, int var3, int var4, boolean var5) {
      this.g = true;
      this.c(var1, var2, var3, var4, var5);
      this.g = false;
   }

   private boolean c(yy var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.a.d(var2, var3, var4);
      int var7 = acu.f(var6);
      float var11 = var1.d(this.a, var2, var3, var4);
      float var12 = var5 ? 1.0F : 0.5F;
      double var13 = var5 ? (double)16.0F : (double)8.0F;
      switch (var7) {
         case 0:
            this.h = 3;
            this.i = 3;
            this.j = 3;
            this.k = 3;
            var1.a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
            this.o(var1, var2, var3, var4);
            this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.8F, var13);
            this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.8F, var13);
            this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
            this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
            break;
         case 1:
            var1.a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
            this.o(var1, var2, var3, var4);
            this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.8F, var13);
            this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.8F, var13);
            this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
            this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
            break;
         case 2:
            this.j = 1;
            this.k = 2;
            var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
            this.o(var1, var2, var3, var4);
            this.b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11 * 0.6F, var13);
            this.b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11 * 0.6F, var13);
            this.b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11 * 0.5F, var13);
            this.b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11, var13);
            break;
         case 3:
            this.j = 2;
            this.k = 1;
            this.l = 3;
            this.m = 3;
            var1.a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
            this.o(var1, var2, var3, var4);
            this.b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11 * 0.6F, var13);
            this.b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11 * 0.6F, var13);
            this.b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11 * 0.5F, var13);
            this.b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11, var13);
            break;
         case 4:
            this.h = 1;
            this.i = 2;
            this.l = 2;
            this.m = 1;
            var1.a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
            this.o(var1, var2, var3, var4);
            this.c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.5F, var13);
            this.c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11, var13);
            this.c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
            this.c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
            break;
         case 5:
            this.h = 2;
            this.i = 1;
            this.l = 1;
            this.m = 2;
            var1.a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            this.o(var1, var2, var3, var4);
            this.c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.5F, var13);
            this.c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11, var13);
            this.c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
            this.c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
      }

      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.k = 0;
      this.l = 0;
      this.m = 0;
      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return true;
   }

   public boolean e(yy var1, int var2, int var3, int var4) {
      int var5 = this.a.d(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) > 0;
      cv var8 = cv.a;
      boolean var9 = this.e >= 0;
      if (!var9) {
         this.e = yy.w.bL;
      }

      float var10 = 0.25F;
      float var11 = 0.1875F;
      float var12 = 0.1875F;
      if (var6 == 5) {
         var1.a(0.5F - var11, 0.0F, 0.5F - var10, 0.5F + var11, var12, 0.5F + var10);
      } else if (var6 == 6) {
         var1.a(0.5F - var10, 0.0F, 0.5F - var11, 0.5F + var10, var12, 0.5F + var11);
      } else if (var6 == 4) {
         var1.a(0.5F - var11, 0.5F - var10, 1.0F - var12, 0.5F + var11, 0.5F + var10, 1.0F);
      } else if (var6 == 3) {
         var1.a(0.5F - var11, 0.5F - var10, 0.0F, 0.5F + var11, 0.5F + var10, var12);
      } else if (var6 == 2) {
         var1.a(1.0F - var12, 0.5F - var10, 0.5F - var11, 1.0F, 0.5F + var10, 0.5F + var11);
      } else if (var6 == 1) {
         var1.a(0.0F, 0.5F - var10, 0.5F - var11, var12, 0.5F + var10, 0.5F + var11);
      }

      this.o(var1, var2, var3, var4);
      if (!var9) {
         this.e = -1;
      }

      var8.b(var1.e(this.a, var2, var3, var4));
      float var13 = 1.0F;
      if (yy.q[var1.bM] > 0) {
         var13 = 1.0F;
      }

      var8.a(var13, var13, var13);
      int var14 = var1.b(0);
      if (this.e >= 0) {
         var14 = this.e;
      }

      int var15 = (var14 & 15) << 4;
      int var16 = var14 & 240;
      float var17 = (float)var15 / 256.0F;
      float var18 = ((float)var15 + 15.99F) / 256.0F;
      float var19 = (float)var16 / 256.0F;
      float var20 = ((float)var16 + 15.99F) / 256.0F;
      fb[] var21 = new fb[8];
      float var22 = 0.0625F;
      float var23 = 0.0625F;
      float var24 = 0.625F;
      var21[0] = fb.b((double)(-var22), (double)0.0F, (double)(-var23));
      var21[1] = fb.b((double)var22, (double)0.0F, (double)(-var23));
      var21[2] = fb.b((double)var22, (double)0.0F, (double)var23);
      var21[3] = fb.b((double)(-var22), (double)0.0F, (double)var23);
      var21[4] = fb.b((double)(-var22), (double)var24, (double)(-var23));
      var21[5] = fb.b((double)var22, (double)var24, (double)(-var23));
      var21[6] = fb.b((double)var22, (double)var24, (double)var23);
      var21[7] = fb.b((double)(-var22), (double)var24, (double)var23);

      for(int var25 = 0; var25 < 8; ++var25) {
         if (var7) {
            var21[var25].c -= (double)0.0625F;
            var21[var25].a(0.69813174F);
         } else {
            var21[var25].c += (double)0.0625F;
            var21[var25].a(-0.69813174F);
         }

         if (var6 == 6) {
            var21[var25].b(((float)Math.PI / 2F));
         }

         if (var6 < 5) {
            var21[var25].b -= (double)0.375F;
            var21[var25].a(((float)Math.PI / 2F));
            if (var6 == 4) {
               var21[var25].b(0.0F);
            }

            if (var6 == 3) {
               var21[var25].b((float)Math.PI);
            }

            if (var6 == 2) {
               var21[var25].b(((float)Math.PI / 2F));
            }

            if (var6 == 1) {
               var21[var25].b((-(float)Math.PI / 2F));
            }

            var21[var25].a += (double)var2 + (double)0.5F;
            var21[var25].b += (double)((float)var3 + 0.5F);
            var21[var25].c += (double)var4 + (double)0.5F;
         } else {
            var21[var25].a += (double)var2 + (double)0.5F;
            var21[var25].b += (double)((float)var3 + 0.125F);
            var21[var25].c += (double)var4 + (double)0.5F;
         }
      }

      fb var30 = null;
      fb var26 = null;
      fb var27 = null;
      fb var28 = null;

      for(int var29 = 0; var29 < 6; ++var29) {
         if (var29 == 0) {
            var17 = (float)(var15 + 7) / 256.0F;
            var18 = ((float)(var15 + 9) - 0.01F) / 256.0F;
            var19 = (float)(var16 + 6) / 256.0F;
            var20 = ((float)(var16 + 8) - 0.01F) / 256.0F;
         } else if (var29 == 2) {
            var17 = (float)(var15 + 7) / 256.0F;
            var18 = ((float)(var15 + 9) - 0.01F) / 256.0F;
            var19 = (float)(var16 + 6) / 256.0F;
            var20 = ((float)(var16 + 16) - 0.01F) / 256.0F;
         }

         if (var29 == 0) {
            var30 = var21[0];
            var26 = var21[1];
            var27 = var21[2];
            var28 = var21[3];
         } else if (var29 == 1) {
            var30 = var21[7];
            var26 = var21[6];
            var27 = var21[5];
            var28 = var21[4];
         } else if (var29 == 2) {
            var30 = var21[1];
            var26 = var21[0];
            var27 = var21[4];
            var28 = var21[5];
         } else if (var29 == 3) {
            var30 = var21[2];
            var26 = var21[1];
            var27 = var21[5];
            var28 = var21[6];
         } else if (var29 == 4) {
            var30 = var21[3];
            var26 = var21[2];
            var27 = var21[6];
            var28 = var21[7];
         } else if (var29 == 5) {
            var30 = var21[0];
            var26 = var21[3];
            var27 = var21[7];
            var28 = var21[4];
         }

         var8.a(var30.a, var30.b, var30.c, (double)var17, (double)var20);
         var8.a(var26.a, var26.b, var26.c, (double)var18, (double)var20);
         var8.a(var27.a, var27.b, var27.c, (double)var18, (double)var19);
         var8.a(var28.a, var28.b, var28.c, (double)var17, (double)var19);
      }

      return true;
   }

   public boolean b(int var1, int var2, int var3, int var4) {
      cv var5 = cv.a;

      for(int var6 = 0; var6 < 6; ++var6) {
         int var7 = var2;
         int var8 = var3;
         int var9 = var4;
         if ((var6 != 2 && var6 != 3 || (var1 - 1) / 3 != 1) && (var6 != 4 && var6 != 5 || (var1 - 1) % 3 != 1)) {
            int var10 = 252;
            int var11 = 0;
            if (var1 == 2) {
               var11 = 0;
            }

            if (var1 == 4) {
               var11 = 1;
            }

            if (var1 == 8) {
               var11 = 2;
            }

            if (var1 == 6) {
               var11 = 3;
            }

            if (var1 == 1) {
               var11 = 0;
            }

            if (var1 == 3) {
               var11 = 3;
            }

            if (var1 == 7) {
               var11 = 1;
            }

            if (var1 == 9) {
               var11 = 2;
            }

            if (var1 != 2 && var1 != 4 && var1 != 6 && var1 != 8) {
               if (var6 >= 2) {
                  if (var1 == 1) {
                     --var10;
                     if (var6 == 5 || var6 == 3) {
                        continue;
                     }

                     if (var6 == 4) {
                        ++var11;
                     }
                  } else if (var1 == 3) {
                     --var10;
                     if (var6 == 5 || var6 == 2) {
                        continue;
                     }

                     if (var6 == 3) {
                        ++var11;
                     }
                  } else if (var1 == 7) {
                     --var10;
                     if (var6 == 4 || var6 == 3) {
                        continue;
                     }

                     if (var6 == 2) {
                        ++var11;
                     }
                  } else if (var1 == 9) {
                     --var10;
                     if (var6 == 4 || var6 == 2) {
                        continue;
                     }

                     if (var6 == 5) {
                        ++var11;
                     }
                  }
               }
            } else {
               --var10;
            }

            if (var6 == 0) {
               var8 = var3 + 1;
            }

            if (var6 == 1) {
               --var8;
            }

            if (var6 == 2) {
               var7 = var2 + 1;
            }

            if (var6 == 3) {
               --var7;
            }

            if (var6 == 4) {
               var9 = var4 + 1;
            }

            if (var6 == 5) {
               --var9;
            }

            if (!this.d[this.a.a(var7, var8, var9)]) {
               short var12 = 16384;
               var5.c(var12);
               var5.b(this.a.a(var7, var8, var9, 2));
               int var13 = (var10 & 15) << 4;
               int var14 = var10 & 240;
               double var15 = ((double)var13 + (double)0.0F) / (double)256.0F;
               double var17 = ((double)var13 + 15.99) / (double)256.0F;
               double var19 = (double)((float)var14 / 256.0F);
               double var21 = (double)(((float)var14 + 15.99F) / 256.0F);
               double var23 = var15;
               double var25 = var17;
               double var27 = var17;
               double var29 = var15;
               double var31 = var21;
               double var33 = var21;
               double var35 = var19;
               double var37 = var19;
               if (var11 != 0) {
                  if (var11 == 1) {
                     var23 = var15;
                     var25 = var15;
                     var27 = var17;
                     var29 = var17;
                     var31 = var19;
                     var33 = var21;
                     var35 = var21;
                     var37 = var19;
                  } else if (var11 == 2) {
                     var23 = var17;
                     var25 = var15;
                     var27 = var15;
                     var29 = var17;
                     var31 = var19;
                     var33 = var19;
                     var35 = var21;
                     var37 = var21;
                  } else if (var11 == 3) {
                     var23 = var17;
                     var25 = var17;
                     var27 = var15;
                     var29 = var15;
                     var31 = var21;
                     var33 = var19;
                     var35 = var19;
                     var37 = var21;
                  }
               }

               double var39 = (double)0.003125F;
               double var41 = (double)0.0F - var39;
               double var43 = (double)1.0F + var39;
               if (var6 == 0) {
                  var5.a((double)var2 + var41, (double)(var3 + 1) + var39, (double)var4 + var41, var25, var33);
                  var5.a((double)var2 + var41, (double)(var3 + 1) + var39, (double)var4 + var43, var27, var35);
                  var5.a((double)var2 + var43, (double)(var3 + 1) + var39, (double)var4 + var43, var29, var37);
                  var5.a((double)var2 + var43, (double)(var3 + 1) + var39, (double)var4 + var41, var23, var31);
               } else if (var6 == 1) {
                  var5.a((double)var2 + var41, (double)(var3 + 0) - var39, (double)var4 + var43, var27, var35);
                  var5.a((double)var2 + var41, (double)(var3 + 0) - var39, (double)var4 + var41, var25, var33);
                  var5.a((double)var2 + var43, (double)(var3 + 0) - var39, (double)var4 + var41, var23, var31);
                  var5.a((double)var2 + var43, (double)(var3 + 0) - var39, (double)var4 + var43, var29, var37);
               } else if (var6 == 2) {
                  var5.a((double)(var2 + 1) + var39, (double)var3 + var41, (double)var4 + var43, var27, var35);
                  var5.a((double)(var2 + 1) + var39, (double)var3 + var41, (double)var4 + var41, var25, var33);
                  var5.a((double)(var2 + 1) + var39, (double)var3 + var43, (double)var4 + var41, var23, var31);
                  var5.a((double)(var2 + 1) + var39, (double)var3 + var43, (double)var4 + var43, var29, var37);
               } else if (var6 == 3) {
                  var5.a((double)(var2 + 0) - var39, (double)var3 + var41, (double)var4 + var41, var25, var33);
                  var5.a((double)(var2 + 0) - var39, (double)var3 + var41, (double)var4 + var43, var27, var35);
                  var5.a((double)(var2 + 0) - var39, (double)var3 + var43, (double)var4 + var43, var29, var37);
                  var5.a((double)(var2 + 0) - var39, (double)var3 + var43, (double)var4 + var41, var23, var31);
               } else if (var6 == 4) {
                  var5.a((double)var2 + var41, (double)var3 + var43, (double)(var4 + 1) + var39, var27, var35);
                  var5.a((double)var2 + var41, (double)var3 + var41, (double)(var4 + 1) + var39, var25, var33);
                  var5.a((double)var2 + var43, (double)var3 + var41, (double)(var4 + 1) + var39, var23, var31);
                  var5.a((double)var2 + var43, (double)var3 + var43, (double)(var4 + 1) + var39, var29, var37);
               } else if (var6 == 5) {
                  var5.a((double)var2 + var43, (double)var3 + var41, (double)(var4 + 0) - var39, var23, var31);
                  var5.a((double)var2 + var41, (double)var3 + var41, (double)(var4 + 0) - var39, var25, var33);
                  var5.a((double)var2 + var41, (double)var3 + var43, (double)(var4 + 0) - var39, var27, var35);
                  var5.a((double)var2 + var43, (double)var3 + var43, (double)(var4 + 0) - var39, var29, var37);
               }
            }
         }
      }

      return true;
   }

   public boolean f(yy var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      int var6 = var1.b(0);
      if (this.e >= 0) {
         var6 = this.e;
      }

      var5.a(1.0F, 1.0F, 1.0F);
      var5.b(var1.e(this.a, var2, var3, var4));
      int var7 = (var6 & 15) << 4;
      int var8 = var6 & 240;
      double var9 = (double)((float)var7 / 256.0F);
      double var11 = (double)(((float)var7 + 15.99F) / 256.0F);
      double var13 = (double)((float)var8 / 256.0F);
      double var15 = (double)(((float)var8 + 15.99F) / 256.0F);
      float var17 = 1.4F;
      if (!this.a.g(var2, var3 - 1, var4) && !yy.ar.c(this.a, var2, var3 - 1, var4)) {
         float var59 = 0.2F;
         float var19 = 0.0625F;
         if ((var2 + var3 + var4 & 1) == 1) {
            var9 = (double)((float)var7 / 256.0F);
            var11 = (double)(((float)var7 + 15.99F) / 256.0F);
            var13 = (double)((float)(var8 + 16) / 256.0F);
            var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
         }

         if ((var2 / 2 + var3 / 2 + var4 / 2 & 1) == 1) {
            double var61 = var11;
            var11 = var9;
            var9 = var61;
         }

         if (yy.ar.c(this.a, var2 - 1, var3, var4)) {
            var5.a((double)((float)var2 + var59), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)((float)var2 + var59), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
            var5.a((double)((float)var2 + var59), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.a((double)((float)var2 + var59), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
         }

         if (yy.ar.c(this.a, var2 + 1, var3, var4)) {
            var5.a((double)((float)(var2 + 1) - var59), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.a((double)((float)(var2 + 1) - var59), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
            var5.a((double)((float)(var2 + 1) - var59), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)((float)(var2 + 1) - var59), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
         }

         if (yy.ar.c(this.a, var2, var3, var4 - 1)) {
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)var4 + var59), var11, var13);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var11, var15);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)var4 + var59), var9, var13);
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)var4 + var59), var9, var13);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var11, var15);
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)var4 + var59), var11, var13);
         }

         if (yy.ar.c(this.a, var2, var3, var4 + 1)) {
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var59), var9, var13);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var9, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var11, var15);
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var59), var11, var13);
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var59), var11, var13);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var11, var15);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var9, var15);
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var59), var9, var13);
         }

         if (yy.ar.c(this.a, var2, var3 + 1, var4)) {
            double var62 = (double)var2 + (double)0.5F + (double)0.5F;
            double var64 = (double)var2 + (double)0.5F - (double)0.5F;
            double var66 = (double)var4 + (double)0.5F + (double)0.5F;
            double var68 = (double)var4 + (double)0.5F - (double)0.5F;
            double var70 = (double)var2 + (double)0.5F - (double)0.5F;
            double var72 = (double)var2 + (double)0.5F + (double)0.5F;
            double var74 = (double)var4 + (double)0.5F - (double)0.5F;
            double var34 = (double)var4 + (double)0.5F + (double)0.5F;
            var9 = (double)((float)var7 / 256.0F);
            var11 = (double)(((float)var7 + 15.99F) / 256.0F);
            var13 = (double)((float)var8 / 256.0F);
            var15 = (double)(((float)var8 + 15.99F) / 256.0F);
            ++var3;
            var17 = -0.2F;
            if ((var2 + var3 + var4 & 1) == 0) {
               var5.a(var70, (double)((float)var3 + var17), (double)(var4 + 0), var11, var13);
               var5.a(var62, (double)(var3 + 0), (double)(var4 + 0), var11, var15);
               var5.a(var62, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
               var5.a(var70, (double)((float)var3 + var17), (double)(var4 + 1), var9, var13);
               var9 = (double)((float)var7 / 256.0F);
               var11 = (double)(((float)var7 + 15.99F) / 256.0F);
               var13 = (double)((float)(var8 + 16) / 256.0F);
               var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
               var5.a(var72, (double)((float)var3 + var17), (double)(var4 + 1), var11, var13);
               var5.a(var64, (double)(var3 + 0), (double)(var4 + 1), var11, var15);
               var5.a(var64, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
               var5.a(var72, (double)((float)var3 + var17), (double)(var4 + 0), var9, var13);
            } else {
               var5.a((double)(var2 + 0), (double)((float)var3 + var17), var34, var11, var13);
               var5.a((double)(var2 + 0), (double)(var3 + 0), var68, var11, var15);
               var5.a((double)(var2 + 1), (double)(var3 + 0), var68, var9, var15);
               var5.a((double)(var2 + 1), (double)((float)var3 + var17), var34, var9, var13);
               var9 = (double)((float)var7 / 256.0F);
               var11 = (double)(((float)var7 + 15.99F) / 256.0F);
               var13 = (double)((float)(var8 + 16) / 256.0F);
               var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
               var5.a((double)(var2 + 1), (double)((float)var3 + var17), var74, var11, var13);
               var5.a((double)(var2 + 1), (double)(var3 + 0), var66, var11, var15);
               var5.a((double)(var2 + 0), (double)(var3 + 0), var66, var9, var15);
               var5.a((double)(var2 + 0), (double)((float)var3 + var17), var74, var9, var13);
            }
         }
      } else {
         double var18 = (double)var2 + (double)0.5F + 0.2;
         double var20 = (double)var2 + (double)0.5F - 0.2;
         double var22 = (double)var4 + (double)0.5F + 0.2;
         double var24 = (double)var4 + (double)0.5F - 0.2;
         double var26 = (double)var2 + (double)0.5F - 0.3;
         double var28 = (double)var2 + (double)0.5F + 0.3;
         double var30 = (double)var4 + (double)0.5F - 0.3;
         double var32 = (double)var4 + (double)0.5F + 0.3;
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 1), var11, var13);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 1), var11, var15);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 0), var9, var13);
         var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 0), var11, var13);
         var5.a(var20, (double)(var3 + 0), (double)(var4 + 0), var11, var15);
         var5.a(var20, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
         var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 1), var9, var13);
         var9 = (double)((float)var7 / 256.0F);
         var11 = (double)(((float)var7 + 15.99F) / 256.0F);
         var13 = (double)((float)(var8 + 16) / 256.0F);
         var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var32, var11, var13);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var24, var11, var15);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var24, var9, var15);
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var32, var9, var13);
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var30, var11, var13);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var22, var11, var15);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var22, var9, var15);
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var30, var9, var13);
         var18 = (double)var2 + (double)0.5F - (double)0.5F;
         var20 = (double)var2 + (double)0.5F + (double)0.5F;
         var22 = (double)var4 + (double)0.5F - (double)0.5F;
         var24 = (double)var4 + (double)0.5F + (double)0.5F;
         var26 = (double)var2 + (double)0.5F - 0.4;
         var28 = (double)var2 + (double)0.5F + 0.4;
         var30 = (double)var4 + (double)0.5F - 0.4;
         var32 = (double)var4 + (double)0.5F + 0.4;
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 0), var9, var13);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 1), var11, var15);
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 1), var11, var13);
         var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 1), var9, var13);
         var5.a(var20, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
         var5.a(var20, (double)(var3 + 0), (double)(var4 + 0), var11, var15);
         var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 0), var11, var13);
         var9 = (double)((float)var7 / 256.0F);
         var11 = (double)(((float)var7 + 15.99F) / 256.0F);
         var13 = (double)((float)var8 / 256.0F);
         var15 = (double)(((float)var8 + 15.99F) / 256.0F);
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var32, var9, var13);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var24, var9, var15);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var24, var11, var15);
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var32, var11, var13);
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var30, var9, var13);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var22, var9, var15);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var22, var11, var15);
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var30, var11, var13);
      }

      return true;
   }

   public boolean g(yy var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      int var6 = this.a.d(var2, var3, var4);
      int var7 = var1.a(1, var6);
      if (this.e >= 0) {
         var7 = this.e;
      }

      var5.b(var1.e(this.a, var2, var3, var4));
      float var8 = 1.0F;
      float var9 = (float)var6 / 15.0F;
      float var10 = var9 * 0.6F + 0.4F;
      if (var6 == 0) {
         var10 = 0.3F;
      }

      float var11 = var9 * var9 * 0.7F - 0.5F;
      float var12 = var9 * var9 * 0.6F - 0.7F;
      if (var11 < 0.0F) {
         var11 = 0.0F;
      }

      if (var12 < 0.0F) {
         var12 = 0.0F;
      }

      var5.a(var10, var11, var12);
      int var13 = (var7 & 15) << 4;
      int var14 = var7 & 240;
      double var15 = (double)((float)var13 / 256.0F);
      double var17 = (double)(((float)var13 + 15.99F) / 256.0F);
      double var19 = (double)((float)var14 / 256.0F);
      double var21 = (double)(((float)var14 + 15.99F) / 256.0F);
      boolean var29 = kw.c((kq)this.a, var2 - 1, var3, var4, 1) || !this.a.g(var2 - 1, var3, var4) && kw.c((kq)this.a, var2 - 1, var3 - 1, var4, -1);
      boolean var30 = kw.c((kq)this.a, var2 + 1, var3, var4, 3) || !this.a.g(var2 + 1, var3, var4) && kw.c((kq)this.a, var2 + 1, var3 - 1, var4, -1);
      boolean var31 = kw.c((kq)this.a, var2, var3, var4 - 1, 2) || !this.a.g(var2, var3, var4 - 1) && kw.c((kq)this.a, var2, var3 - 1, var4 - 1, -1);
      boolean var32 = kw.c((kq)this.a, var2, var3, var4 + 1, 0) || !this.a.g(var2, var3, var4 + 1) && kw.c((kq)this.a, var2, var3 - 1, var4 + 1, -1);
      if (!this.a.g(var2, var3 + 1, var4)) {
         if (this.a.g(var2 - 1, var3, var4) && kw.c((kq)this.a, var2 - 1, var3 + 1, var4, -1)) {
            var29 = true;
         }

         if (this.a.g(var2 + 1, var3, var4) && kw.c((kq)this.a, var2 + 1, var3 + 1, var4, -1)) {
            var30 = true;
         }

         if (this.a.g(var2, var3, var4 - 1) && kw.c((kq)this.a, var2, var3 + 1, var4 - 1, -1)) {
            var31 = true;
         }

         if (this.a.g(var2, var3, var4 + 1) && kw.c((kq)this.a, var2, var3 + 1, var4 + 1, -1)) {
            var32 = true;
         }
      }

      float var34 = (float)(var2 + 0);
      float var35 = (float)(var2 + 1);
      float var36 = (float)(var4 + 0);
      float var37 = (float)(var4 + 1);
      byte var38 = 0;
      if ((var29 || var30) && !var31 && !var32) {
         var38 = 1;
      }

      if ((var31 || var32) && !var30 && !var29) {
         var38 = 2;
      }

      if (var38 != 0) {
         var15 = (double)((float)(var13 + 16) / 256.0F);
         var17 = (double)(((float)(var13 + 16) + 15.99F) / 256.0F);
         var19 = (double)((float)var14 / 256.0F);
         var21 = (double)(((float)var14 + 15.99F) / 256.0F);
      }

      if (var38 == 0) {
         if (!var29) {
            var34 += 0.3125F;
         }

         if (!var29) {
            var15 += (double)0.01953125F;
         }

         if (!var30) {
            var35 -= 0.3125F;
         }

         if (!var30) {
            var17 -= (double)0.01953125F;
         }

         if (!var31) {
            var36 += 0.3125F;
         }

         if (!var31) {
            var19 += (double)0.01953125F;
         }

         if (!var32) {
            var37 -= 0.3125F;
         }

         if (!var32) {
            var21 -= (double)0.01953125F;
         }

         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var37, var17, var21);
         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var36, var17, var19);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var36, var15, var19);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var37, var15, var21);
         var5.a(var8, var8, var8);
         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var37, var17, var21 + (double)0.0625F);
         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var36, var17, var19 + (double)0.0625F);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var36, var15, var19 + (double)0.0625F);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var37, var15, var21 + (double)0.0625F);
      } else if (var38 == 1) {
         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var37, var17, var21);
         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var36, var17, var19);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var36, var15, var19);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var37, var15, var21);
         var5.a(var8, var8, var8);
         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var37, var17, var21 + (double)0.0625F);
         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var36, var17, var19 + (double)0.0625F);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var36, var15, var19 + (double)0.0625F);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var37, var15, var21 + (double)0.0625F);
      } else if (var38 == 2) {
         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var37, var17, var21);
         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var36, var15, var21);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var36, var15, var19);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var37, var17, var19);
         var5.a(var8, var8, var8);
         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var37, var17, var21 + (double)0.0625F);
         var5.a((double)var35, (double)var3 + (double)0.015625F, (double)var36, var15, var21 + (double)0.0625F);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var36, var15, var19 + (double)0.0625F);
         var5.a((double)var34, (double)var3 + (double)0.015625F, (double)var37, var17, var19 + (double)0.0625F);
      }

      if (!this.a.g(var2, var3 + 1, var4)) {
         var15 = (double)((float)(var13 + 16) / 256.0F);
         var17 = (double)(((float)(var13 + 16) + 15.99F) / 256.0F);
         var19 = (double)((float)var14 / 256.0F);
         var21 = (double)(((float)var14 + 15.99F) / 256.0F);
         if (this.a.g(var2 - 1, var3, var4) && this.a.a(var2 - 1, var3 + 1, var4) == yy.av.bM) {
            var5.a(var8 * var10, var8 * var11, var8 * var12);
            var5.a((double)var2 + (double)0.015625F, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var19);
            var5.a((double)var2 + (double)0.015625F, (double)(var3 + 0), (double)(var4 + 1), var15, var19);
            var5.a((double)var2 + (double)0.015625F, (double)(var3 + 0), (double)(var4 + 0), var15, var21);
            var5.a((double)var2 + (double)0.015625F, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var21);
            var5.a(var8, var8, var8);
            var5.a((double)var2 + (double)0.015625F, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var19 + (double)0.0625F);
            var5.a((double)var2 + (double)0.015625F, (double)(var3 + 0), (double)(var4 + 1), var15, var19 + (double)0.0625F);
            var5.a((double)var2 + (double)0.015625F, (double)(var3 + 0), (double)(var4 + 0), var15, var21 + (double)0.0625F);
            var5.a((double)var2 + (double)0.015625F, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var21 + (double)0.0625F);
         }

         if (this.a.g(var2 + 1, var3, var4) && this.a.a(var2 + 1, var3 + 1, var4) == yy.av.bM) {
            var5.a(var8 * var10, var8 * var11, var8 * var12);
            var5.a((double)(var2 + 1) - (double)0.015625F, (double)(var3 + 0), (double)(var4 + 1), var15, var21);
            var5.a((double)(var2 + 1) - (double)0.015625F, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var21);
            var5.a((double)(var2 + 1) - (double)0.015625F, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var19);
            var5.a((double)(var2 + 1) - (double)0.015625F, (double)(var3 + 0), (double)(var4 + 0), var15, var19);
            var5.a(var8, var8, var8);
            var5.a((double)(var2 + 1) - (double)0.015625F, (double)(var3 + 0), (double)(var4 + 1), var15, var21 + (double)0.0625F);
            var5.a((double)(var2 + 1) - (double)0.015625F, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var21 + (double)0.0625F);
            var5.a((double)(var2 + 1) - (double)0.015625F, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var19 + (double)0.0625F);
            var5.a((double)(var2 + 1) - (double)0.015625F, (double)(var3 + 0), (double)(var4 + 0), var15, var19 + (double)0.0625F);
         }

         if (this.a.g(var2, var3, var4 - 1) && this.a.a(var2, var3 + 1, var4 - 1) == yy.av.bM) {
            var5.a(var8 * var10, var8 * var11, var8 * var12);
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + (double)0.015625F, var15, var21);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + (double)0.015625F, var17, var21);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + (double)0.015625F, var17, var19);
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + (double)0.015625F, var15, var19);
            var5.a(var8, var8, var8);
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + (double)0.015625F, var15, var21 + (double)0.0625F);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + (double)0.015625F, var17, var21 + (double)0.0625F);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + (double)0.015625F, var17, var19 + (double)0.0625F);
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + (double)0.015625F, var15, var19 + (double)0.0625F);
         }

         if (this.a.g(var2, var3, var4 + 1) && this.a.a(var2, var3 + 1, var4 + 1) == yy.av.bM) {
            var5.a(var8 * var10, var8 * var11, var8 * var12);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - (double)0.015625F, var17, var19);
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - (double)0.015625F, var15, var19);
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - (double)0.015625F, var15, var21);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - (double)0.015625F, var17, var21);
            var5.a(var8, var8, var8);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - (double)0.015625F, var17, var19 + (double)0.0625F);
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - (double)0.015625F, var15, var19 + (double)0.0625F);
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - (double)0.015625F, var15, var21 + (double)0.0625F);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - (double)0.015625F, var17, var21 + (double)0.0625F);
         }
      }

      return true;
   }

   public boolean a(afr var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      int var6 = this.a.d(var2, var3, var4);
      int var7 = var1.a(0, var6);
      if (this.e >= 0) {
         var7 = this.e;
      }

      if (var1.s()) {
         var6 &= 7;
      }

      var5.b(var1.e(this.a, var2, var3, var4));
      var5.a(1.0F, 1.0F, 1.0F);
      int var8 = (var7 & 15) << 4;
      int var9 = var7 & 240;
      double var10 = (double)((float)var8 / 256.0F);
      double var12 = (double)(((float)var8 + 15.99F) / 256.0F);
      double var14 = (double)((float)var9 / 256.0F);
      double var16 = (double)(((float)var9 + 15.99F) / 256.0F);
      double var18 = (double)0.0625F;
      double var20 = (double)(var2 + 1);
      double var22 = (double)(var2 + 1);
      double var24 = (double)(var2 + 0);
      double var26 = (double)(var2 + 0);
      double var28 = (double)(var4 + 0);
      double var30 = (double)(var4 + 1);
      double var32 = (double)(var4 + 1);
      double var34 = (double)(var4 + 0);
      double var36 = (double)var3 + var18;
      double var38 = (double)var3 + var18;
      double var40 = (double)var3 + var18;
      double var42 = (double)var3 + var18;
      if (var6 != 1 && var6 != 2 && var6 != 3 && var6 != 7) {
         if (var6 == 8) {
            var20 = var22 = (double)(var2 + 0);
            var24 = var26 = (double)(var2 + 1);
            var28 = var34 = (double)(var4 + 1);
            var30 = var32 = (double)(var4 + 0);
         } else if (var6 == 9) {
            var20 = var26 = (double)(var2 + 0);
            var22 = var24 = (double)(var2 + 1);
            var28 = var30 = (double)(var4 + 0);
            var32 = var34 = (double)(var4 + 1);
         }
      } else {
         var20 = var26 = (double)(var2 + 1);
         var22 = var24 = (double)(var2 + 0);
         var28 = var30 = (double)(var4 + 1);
         var32 = var34 = (double)(var4 + 0);
      }

      if (var6 != 2 && var6 != 4) {
         if (var6 == 3 || var6 == 5) {
            ++var38;
            ++var40;
         }
      } else {
         ++var36;
         ++var42;
      }

      var5.a(var20, var36, var28, var12, var14);
      var5.a(var22, var38, var30, var12, var16);
      var5.a(var24, var40, var32, var10, var16);
      var5.a(var26, var42, var34, var10, var14);
      var5.a(var26, var42, var34, var10, var14);
      var5.a(var24, var40, var32, var10, var16);
      var5.a(var22, var38, var30, var12, var16);
      var5.a(var20, var36, var28, var12, var14);
      return true;
   }

   public boolean h(yy var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      int var6 = var1.b(0);
      if (this.e >= 0) {
         var6 = this.e;
      }

      var5.b(var1.e(this.a, var2, var3, var4));
      float var7 = 1.0F;
      var5.a(var7, var7, var7);
      int var22 = (var6 & 15) << 4;
      int var8 = var6 & 240;
      double var9 = (double)((float)var22 / 256.0F);
      double var11 = (double)(((float)var22 + 15.99F) / 256.0F);
      double var13 = (double)((float)var8 / 256.0F);
      double var15 = (double)(((float)var8 + 15.99F) / 256.0F);
      int var17 = this.a.d(var2, var3, var4);
      double var18 = (double)0.0F;
      double var20 = (double)0.05F;
      if (var17 == 5) {
         var5.a((double)var2 + var20, (double)(var3 + 1) + var18, (double)(var4 + 1) + var18, var9, var13);
         var5.a((double)var2 + var20, (double)(var3 + 0) - var18, (double)(var4 + 1) + var18, var9, var15);
         var5.a((double)var2 + var20, (double)(var3 + 0) - var18, (double)(var4 + 0) - var18, var11, var15);
         var5.a((double)var2 + var20, (double)(var3 + 1) + var18, (double)(var4 + 0) - var18, var11, var13);
      }

      if (var17 == 4) {
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 0) - var18, (double)(var4 + 1) + var18, var11, var15);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 1) + var18, (double)(var4 + 1) + var18, var11, var13);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 1) + var18, (double)(var4 + 0) - var18, var9, var13);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 0) - var18, (double)(var4 + 0) - var18, var9, var15);
      }

      if (var17 == 3) {
         var5.a((double)(var2 + 1) + var18, (double)(var3 + 0) - var18, (double)var4 + var20, var11, var15);
         var5.a((double)(var2 + 1) + var18, (double)(var3 + 1) + var18, (double)var4 + var20, var11, var13);
         var5.a((double)(var2 + 0) - var18, (double)(var3 + 1) + var18, (double)var4 + var20, var9, var13);
         var5.a((double)(var2 + 0) - var18, (double)(var3 + 0) - var18, (double)var4 + var20, var9, var15);
      }

      if (var17 == 2) {
         var5.a((double)(var2 + 1) + var18, (double)(var3 + 1) + var18, (double)(var4 + 1) - var20, var9, var13);
         var5.a((double)(var2 + 1) + var18, (double)(var3 + 0) - var18, (double)(var4 + 1) - var20, var9, var15);
         var5.a((double)(var2 + 0) - var18, (double)(var3 + 0) - var18, (double)(var4 + 1) - var20, var11, var15);
         var5.a((double)(var2 + 0) - var18, (double)(var3 + 1) + var18, (double)(var4 + 1) - var20, var11, var13);
      }

      return true;
   }

   public boolean i(yy var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      int var6 = var1.b(0);
      if (this.e >= 0) {
         var6 = this.e;
      }

      float var7 = 1.0F;
      var5.b(var1.e(this.a, var2, var3, var4));
      int var8 = var1.a(this.a, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      var5.a(var7 * var9, var7 * var10, var7 * var11);
      var8 = (var6 & 15) << 4;
      int var22 = var6 & 240;
      double var23 = (double)((float)var8 / 256.0F);
      double var12 = (double)(((float)var8 + 15.99F) / 256.0F);
      double var14 = (double)((float)var22 / 256.0F);
      double var16 = (double)(((float)var22 + 15.99F) / 256.0F);
      double var18 = (double)0.05F;
      int var20 = this.a.d(var2, var3, var4);
      if ((var20 & 2) != 0) {
         var5.a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 1), var23, var14);
         var5.a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 1), var23, var16);
         var5.a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 0), var12, var16);
         var5.a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 0), var12, var14);
         var5.a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 0), var12, var14);
         var5.a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 0), var12, var16);
         var5.a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 1), var23, var16);
         var5.a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 1), var23, var14);
      }

      if ((var20 & 8) != 0) {
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 1), var12, var16);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 1), var12, var14);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 0), var23, var14);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 0), var23, var16);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 0), var23, var16);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 0), var23, var14);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 1), var12, var14);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 1), var12, var16);
      }

      if ((var20 & 4) != 0) {
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + var18, var12, var16);
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)var4 + var18, var12, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)var4 + var18, var23, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + var18, var23, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + var18, var23, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)var4 + var18, var23, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)var4 + var18, var12, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + var18, var12, var16);
      }

      if ((var20 & 1) != 0) {
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1) - var18, var23, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - var18, var23, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - var18, var12, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)(var4 + 1) - var18, var12, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)(var4 + 1) - var18, var12, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - var18, var12, var16);
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - var18, var23, var16);
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1) - var18, var23, var14);
      }

      if (this.a.g(var2, var3 + 1, var4)) {
         var5.a((double)(var2 + 1), (double)(var3 + 1) - var18, (double)(var4 + 0), var23, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 1) - var18, (double)(var4 + 1), var23, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 1) - var18, (double)(var4 + 1), var12, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 1) - var18, (double)(var4 + 0), var12, var14);
      }

      return true;
   }

   public boolean a(uh var1, int var2, int var3, int var4) {
      int var5 = this.a.b();
      cv var6 = cv.a;
      var6.b(var1.e(this.a, var2, var3, var4));
      float var7 = 1.0F;
      int var8 = var1.a(this.a, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      if (adt.a) {
         float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = var13;
         var11 = var14;
      }

      var6.a(var7 * var9, var7 * var10, var7 * var11);
      int var64 = 0;
      int var66 = 0;
      if (this.e >= 0) {
         var64 = this.e;
         var66 = this.e;
      } else {
         int var68 = this.a.d(var2, var3, var4);
         var64 = var1.a(0, var68);
         var66 = var1.j();
      }

      int var69 = (var64 & 15) << 4;
      int var15 = var64 & 240;
      double var16 = (double)((float)var69 / 256.0F);
      double var18 = (double)(((float)var69 + 7.99F) / 256.0F);
      double var20 = (double)(((float)var69 + 15.99F) / 256.0F);
      double var22 = (double)((float)var15 / 256.0F);
      double var24 = (double)(((float)var15 + 15.99F) / 256.0F);
      int var26 = (var66 & 15) << 4;
      int var27 = var66 & 240;
      double var28 = (double)((float)(var26 + 7) / 256.0F);
      double var30 = (double)(((float)var26 + 8.99F) / 256.0F);
      double var32 = (double)((float)var27 / 256.0F);
      double var34 = (double)((float)(var27 + 8) / 256.0F);
      double var36 = (double)(((float)var27 + 15.99F) / 256.0F);
      double var38 = (double)var2;
      double var40 = (double)var2 + (double)0.5F;
      double var42 = (double)(var2 + 1);
      double var44 = (double)var4;
      double var46 = (double)var4 + (double)0.5F;
      double var48 = (double)(var4 + 1);
      double var50 = (double)var2 + (double)0.5F - (double)0.0625F;
      double var52 = (double)var2 + (double)0.5F + (double)0.0625F;
      double var54 = (double)var4 + (double)0.5F - (double)0.0625F;
      double var56 = (double)var4 + (double)0.5F + (double)0.0625F;
      boolean var58 = var1.e(this.a.a(var2, var3, var4 - 1));
      boolean var59 = var1.e(this.a.a(var2, var3, var4 + 1));
      boolean var60 = var1.e(this.a.a(var2 - 1, var3, var4));
      boolean var61 = var1.e(this.a.a(var2 + 1, var3, var4));
      boolean var62 = var1.a_(this.a, var2, var3 + 1, var4, 1);
      boolean var63 = var1.a_(this.a, var2, var3 - 1, var4, 0);
      if ((!var60 || !var61) && (var60 || var61 || var58 || var59)) {
         if (var60 && !var61) {
            var6.a(var38, (double)(var3 + 1), var46, var16, var22);
            var6.a(var38, (double)(var3 + 0), var46, var16, var24);
            var6.a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.a(var40, (double)(var3 + 1), var46, var16, var22);
            var6.a(var40, (double)(var3 + 0), var46, var16, var24);
            var6.a(var38, (double)(var3 + 0), var46, var18, var24);
            var6.a(var38, (double)(var3 + 1), var46, var18, var22);
            if (!var59 && !var58) {
               var6.a(var40, (double)(var3 + 1), var56, var28, var32);
               var6.a(var40, (double)(var3 + 0), var56, var28, var36);
               var6.a(var40, (double)(var3 + 0), var54, var30, var36);
               var6.a(var40, (double)(var3 + 1), var54, var30, var32);
               var6.a(var40, (double)(var3 + 1), var54, var28, var32);
               var6.a(var40, (double)(var3 + 0), var54, var28, var36);
               var6.a(var40, (double)(var3 + 0), var56, var30, var36);
               var6.a(var40, (double)(var3 + 1), var56, var30, var32);
            }

            if (var62 || var3 < var5 - 1 && this.a.h(var2 - 1, var3 + 1, var4)) {
               var6.a(var38, (double)(var3 + 1) + 0.01, var56, var30, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01, var56, var30, var36);
               var6.a(var40, (double)(var3 + 1) + 0.01, var54, var28, var36);
               var6.a(var38, (double)(var3 + 1) + 0.01, var54, var28, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01, var56, var30, var34);
               var6.a(var38, (double)(var3 + 1) + 0.01, var56, var30, var36);
               var6.a(var38, (double)(var3 + 1) + 0.01, var54, var28, var36);
               var6.a(var40, (double)(var3 + 1) + 0.01, var54, var28, var34);
            }

            if (var63 || var3 > 1 && this.a.h(var2 - 1, var3 - 1, var4)) {
               var6.a(var38, (double)var3 - 0.01, var56, var30, var34);
               var6.a(var40, (double)var3 - 0.01, var56, var30, var36);
               var6.a(var40, (double)var3 - 0.01, var54, var28, var36);
               var6.a(var38, (double)var3 - 0.01, var54, var28, var34);
               var6.a(var40, (double)var3 - 0.01, var56, var30, var34);
               var6.a(var38, (double)var3 - 0.01, var56, var30, var36);
               var6.a(var38, (double)var3 - 0.01, var54, var28, var36);
               var6.a(var40, (double)var3 - 0.01, var54, var28, var34);
            }
         } else if (!var60 && var61) {
            var6.a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.a(var42, (double)(var3 + 0), var46, var20, var24);
            var6.a(var42, (double)(var3 + 1), var46, var20, var22);
            var6.a(var42, (double)(var3 + 1), var46, var18, var22);
            var6.a(var42, (double)(var3 + 0), var46, var18, var24);
            var6.a(var40, (double)(var3 + 0), var46, var20, var24);
            var6.a(var40, (double)(var3 + 1), var46, var20, var22);
            if (!var59 && !var58) {
               var6.a(var40, (double)(var3 + 1), var54, var28, var32);
               var6.a(var40, (double)(var3 + 0), var54, var28, var36);
               var6.a(var40, (double)(var3 + 0), var56, var30, var36);
               var6.a(var40, (double)(var3 + 1), var56, var30, var32);
               var6.a(var40, (double)(var3 + 1), var56, var28, var32);
               var6.a(var40, (double)(var3 + 0), var56, var28, var36);
               var6.a(var40, (double)(var3 + 0), var54, var30, var36);
               var6.a(var40, (double)(var3 + 1), var54, var30, var32);
            }

            if (var62 || var3 < var5 - 1 && this.a.h(var2 + 1, var3 + 1, var4)) {
               var6.a(var40, (double)(var3 + 1) + 0.01, var56, var30, var32);
               var6.a(var42, (double)(var3 + 1) + 0.01, var56, var30, var34);
               var6.a(var42, (double)(var3 + 1) + 0.01, var54, var28, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01, var54, var28, var32);
               var6.a(var42, (double)(var3 + 1) + 0.01, var56, var30, var32);
               var6.a(var40, (double)(var3 + 1) + 0.01, var56, var30, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01, var54, var28, var34);
               var6.a(var42, (double)(var3 + 1) + 0.01, var54, var28, var32);
            }

            if (var63 || var3 > 1 && this.a.h(var2 + 1, var3 - 1, var4)) {
               var6.a(var40, (double)var3 - 0.01, var56, var30, var32);
               var6.a(var42, (double)var3 - 0.01, var56, var30, var34);
               var6.a(var42, (double)var3 - 0.01, var54, var28, var34);
               var6.a(var40, (double)var3 - 0.01, var54, var28, var32);
               var6.a(var42, (double)var3 - 0.01, var56, var30, var32);
               var6.a(var40, (double)var3 - 0.01, var56, var30, var34);
               var6.a(var40, (double)var3 - 0.01, var54, var28, var34);
               var6.a(var42, (double)var3 - 0.01, var54, var28, var32);
            }
         }
      } else {
         var6.a(var38, (double)(var3 + 1), var46, var16, var22);
         var6.a(var38, (double)(var3 + 0), var46, var16, var24);
         var6.a(var42, (double)(var3 + 0), var46, var20, var24);
         var6.a(var42, (double)(var3 + 1), var46, var20, var22);
         var6.a(var42, (double)(var3 + 1), var46, var16, var22);
         var6.a(var42, (double)(var3 + 0), var46, var16, var24);
         var6.a(var38, (double)(var3 + 0), var46, var20, var24);
         var6.a(var38, (double)(var3 + 1), var46, var20, var22);
         if (var62) {
            var6.a(var38, (double)(var3 + 1) + 0.01, var56, var30, var36);
            var6.a(var42, (double)(var3 + 1) + 0.01, var56, var30, var32);
            var6.a(var42, (double)(var3 + 1) + 0.01, var54, var28, var32);
            var6.a(var38, (double)(var3 + 1) + 0.01, var54, var28, var36);
            var6.a(var42, (double)(var3 + 1) + 0.01, var56, var30, var36);
            var6.a(var38, (double)(var3 + 1) + 0.01, var56, var30, var32);
            var6.a(var38, (double)(var3 + 1) + 0.01, var54, var28, var32);
            var6.a(var42, (double)(var3 + 1) + 0.01, var54, var28, var36);
         } else {
            if (var3 < var5 - 1 && this.a.h(var2 - 1, var3 + 1, var4)) {
               var6.a(var38, (double)(var3 + 1) + 0.01, var56, var30, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01, var56, var30, var36);
               var6.a(var40, (double)(var3 + 1) + 0.01, var54, var28, var36);
               var6.a(var38, (double)(var3 + 1) + 0.01, var54, var28, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01, var56, var30, var34);
               var6.a(var38, (double)(var3 + 1) + 0.01, var56, var30, var36);
               var6.a(var38, (double)(var3 + 1) + 0.01, var54, var28, var36);
               var6.a(var40, (double)(var3 + 1) + 0.01, var54, var28, var34);
            }

            if (var3 < var5 - 1 && this.a.h(var2 + 1, var3 + 1, var4)) {
               var6.a(var40, (double)(var3 + 1) + 0.01, var56, var30, var32);
               var6.a(var42, (double)(var3 + 1) + 0.01, var56, var30, var34);
               var6.a(var42, (double)(var3 + 1) + 0.01, var54, var28, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01, var54, var28, var32);
               var6.a(var42, (double)(var3 + 1) + 0.01, var56, var30, var32);
               var6.a(var40, (double)(var3 + 1) + 0.01, var56, var30, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01, var54, var28, var34);
               var6.a(var42, (double)(var3 + 1) + 0.01, var54, var28, var32);
            }
         }

         if (var63) {
            var6.a(var38, (double)var3 - 0.01, var56, var30, var36);
            var6.a(var42, (double)var3 - 0.01, var56, var30, var32);
            var6.a(var42, (double)var3 - 0.01, var54, var28, var32);
            var6.a(var38, (double)var3 - 0.01, var54, var28, var36);
            var6.a(var42, (double)var3 - 0.01, var56, var30, var36);
            var6.a(var38, (double)var3 - 0.01, var56, var30, var32);
            var6.a(var38, (double)var3 - 0.01, var54, var28, var32);
            var6.a(var42, (double)var3 - 0.01, var54, var28, var36);
         } else {
            if (var3 > 1 && this.a.h(var2 - 1, var3 - 1, var4)) {
               var6.a(var38, (double)var3 - 0.01, var56, var30, var34);
               var6.a(var40, (double)var3 - 0.01, var56, var30, var36);
               var6.a(var40, (double)var3 - 0.01, var54, var28, var36);
               var6.a(var38, (double)var3 - 0.01, var54, var28, var34);
               var6.a(var40, (double)var3 - 0.01, var56, var30, var34);
               var6.a(var38, (double)var3 - 0.01, var56, var30, var36);
               var6.a(var38, (double)var3 - 0.01, var54, var28, var36);
               var6.a(var40, (double)var3 - 0.01, var54, var28, var34);
            }

            if (var3 > 1 && this.a.h(var2 + 1, var3 - 1, var4)) {
               var6.a(var40, (double)var3 - 0.01, var56, var30, var32);
               var6.a(var42, (double)var3 - 0.01, var56, var30, var34);
               var6.a(var42, (double)var3 - 0.01, var54, var28, var34);
               var6.a(var40, (double)var3 - 0.01, var54, var28, var32);
               var6.a(var42, (double)var3 - 0.01, var56, var30, var32);
               var6.a(var40, (double)var3 - 0.01, var56, var30, var34);
               var6.a(var40, (double)var3 - 0.01, var54, var28, var34);
               var6.a(var42, (double)var3 - 0.01, var54, var28, var32);
            }
         }
      }

      if ((!var58 || !var59) && (var60 || var61 || var58 || var59)) {
         if (var58 && !var59) {
            var6.a(var40, (double)(var3 + 1), var44, var16, var22);
            var6.a(var40, (double)(var3 + 0), var44, var16, var24);
            var6.a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.a(var40, (double)(var3 + 1), var46, var16, var22);
            var6.a(var40, (double)(var3 + 0), var46, var16, var24);
            var6.a(var40, (double)(var3 + 0), var44, var18, var24);
            var6.a(var40, (double)(var3 + 1), var44, var18, var22);
            if (!var61 && !var60) {
               var6.a(var50, (double)(var3 + 1), var46, var28, var32);
               var6.a(var50, (double)(var3 + 0), var46, var28, var36);
               var6.a(var52, (double)(var3 + 0), var46, var30, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var32);
               var6.a(var52, (double)(var3 + 1), var46, var28, var32);
               var6.a(var52, (double)(var3 + 0), var46, var28, var36);
               var6.a(var50, (double)(var3 + 0), var46, var30, var36);
               var6.a(var50, (double)(var3 + 1), var46, var30, var32);
            }

            if (var62 || var3 < var5 - 1 && this.a.h(var2, var3 + 1, var4 - 1)) {
               var6.a(var50, (double)(var3 + 1), var44, var30, var32);
               var6.a(var50, (double)(var3 + 1), var46, var30, var34);
               var6.a(var52, (double)(var3 + 1), var46, var28, var34);
               var6.a(var52, (double)(var3 + 1), var44, var28, var32);
               var6.a(var50, (double)(var3 + 1), var46, var30, var32);
               var6.a(var50, (double)(var3 + 1), var44, var30, var34);
               var6.a(var52, (double)(var3 + 1), var44, var28, var34);
               var6.a(var52, (double)(var3 + 1), var46, var28, var32);
            }

            if (var63 || var3 > 1 && this.a.h(var2, var3 - 1, var4 - 1)) {
               var6.a(var50, (double)var3, var44, var30, var32);
               var6.a(var50, (double)var3, var46, var30, var34);
               var6.a(var52, (double)var3, var46, var28, var34);
               var6.a(var52, (double)var3, var44, var28, var32);
               var6.a(var50, (double)var3, var46, var30, var32);
               var6.a(var50, (double)var3, var44, var30, var34);
               var6.a(var52, (double)var3, var44, var28, var34);
               var6.a(var52, (double)var3, var46, var28, var32);
            }
         } else if (!var58 && var59) {
            var6.a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.a(var40, (double)(var3 + 0), var48, var20, var24);
            var6.a(var40, (double)(var3 + 1), var48, var20, var22);
            var6.a(var40, (double)(var3 + 1), var48, var18, var22);
            var6.a(var40, (double)(var3 + 0), var48, var18, var24);
            var6.a(var40, (double)(var3 + 0), var46, var20, var24);
            var6.a(var40, (double)(var3 + 1), var46, var20, var22);
            if (!var61 && !var60) {
               var6.a(var52, (double)(var3 + 1), var46, var28, var32);
               var6.a(var52, (double)(var3 + 0), var46, var28, var36);
               var6.a(var50, (double)(var3 + 0), var46, var30, var36);
               var6.a(var50, (double)(var3 + 1), var46, var30, var32);
               var6.a(var50, (double)(var3 + 1), var46, var28, var32);
               var6.a(var50, (double)(var3 + 0), var46, var28, var36);
               var6.a(var52, (double)(var3 + 0), var46, var30, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var32);
            }

            if (var62 || var3 < var5 - 1 && this.a.h(var2, var3 + 1, var4 + 1)) {
               var6.a(var50, (double)(var3 + 1), var46, var28, var34);
               var6.a(var50, (double)(var3 + 1), var48, var28, var36);
               var6.a(var52, (double)(var3 + 1), var48, var30, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var34);
               var6.a(var50, (double)(var3 + 1), var48, var28, var34);
               var6.a(var50, (double)(var3 + 1), var46, var28, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var36);
               var6.a(var52, (double)(var3 + 1), var48, var30, var34);
            }

            if (var63 || var3 > 1 && this.a.h(var2, var3 - 1, var4 + 1)) {
               var6.a(var50, (double)var3, var46, var28, var34);
               var6.a(var50, (double)var3, var48, var28, var36);
               var6.a(var52, (double)var3, var48, var30, var36);
               var6.a(var52, (double)var3, var46, var30, var34);
               var6.a(var50, (double)var3, var48, var28, var34);
               var6.a(var50, (double)var3, var46, var28, var36);
               var6.a(var52, (double)var3, var46, var30, var36);
               var6.a(var52, (double)var3, var48, var30, var34);
            }
         }
      } else {
         var6.a(var40, (double)(var3 + 1), var48, var16, var22);
         var6.a(var40, (double)(var3 + 0), var48, var16, var24);
         var6.a(var40, (double)(var3 + 0), var44, var20, var24);
         var6.a(var40, (double)(var3 + 1), var44, var20, var22);
         var6.a(var40, (double)(var3 + 1), var44, var16, var22);
         var6.a(var40, (double)(var3 + 0), var44, var16, var24);
         var6.a(var40, (double)(var3 + 0), var48, var20, var24);
         var6.a(var40, (double)(var3 + 1), var48, var20, var22);
         if (var62) {
            var6.a(var52, (double)(var3 + 1), var48, var30, var36);
            var6.a(var52, (double)(var3 + 1), var44, var30, var32);
            var6.a(var50, (double)(var3 + 1), var44, var28, var32);
            var6.a(var50, (double)(var3 + 1), var48, var28, var36);
            var6.a(var52, (double)(var3 + 1), var44, var30, var36);
            var6.a(var52, (double)(var3 + 1), var48, var30, var32);
            var6.a(var50, (double)(var3 + 1), var48, var28, var32);
            var6.a(var50, (double)(var3 + 1), var44, var28, var36);
         } else {
            if (var3 < var5 - 1 && this.a.h(var2, var3 + 1, var4 - 1)) {
               var6.a(var50, (double)(var3 + 1), var44, var30, var32);
               var6.a(var50, (double)(var3 + 1), var46, var30, var34);
               var6.a(var52, (double)(var3 + 1), var46, var28, var34);
               var6.a(var52, (double)(var3 + 1), var44, var28, var32);
               var6.a(var50, (double)(var3 + 1), var46, var30, var32);
               var6.a(var50, (double)(var3 + 1), var44, var30, var34);
               var6.a(var52, (double)(var3 + 1), var44, var28, var34);
               var6.a(var52, (double)(var3 + 1), var46, var28, var32);
            }

            if (var3 < var5 - 1 && this.a.h(var2, var3 + 1, var4 + 1)) {
               var6.a(var50, (double)(var3 + 1), var46, var28, var34);
               var6.a(var50, (double)(var3 + 1), var48, var28, var36);
               var6.a(var52, (double)(var3 + 1), var48, var30, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var34);
               var6.a(var50, (double)(var3 + 1), var48, var28, var34);
               var6.a(var50, (double)(var3 + 1), var46, var28, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var36);
               var6.a(var52, (double)(var3 + 1), var48, var30, var34);
            }
         }

         if (var63) {
            var6.a(var52, (double)var3, var48, var30, var36);
            var6.a(var52, (double)var3, var44, var30, var32);
            var6.a(var50, (double)var3, var44, var28, var32);
            var6.a(var50, (double)var3, var48, var28, var36);
            var6.a(var52, (double)var3, var44, var30, var36);
            var6.a(var52, (double)var3, var48, var30, var32);
            var6.a(var50, (double)var3, var48, var28, var32);
            var6.a(var50, (double)var3, var44, var28, var36);
         } else {
            if (var3 > 1 && this.a.h(var2, var3 - 1, var4 - 1)) {
               var6.a(var50, (double)var3, var44, var30, var32);
               var6.a(var50, (double)var3, var46, var30, var34);
               var6.a(var52, (double)var3, var46, var28, var34);
               var6.a(var52, (double)var3, var44, var28, var32);
               var6.a(var50, (double)var3, var46, var30, var32);
               var6.a(var50, (double)var3, var44, var30, var34);
               var6.a(var52, (double)var3, var44, var28, var34);
               var6.a(var52, (double)var3, var46, var28, var32);
            }

            if (var3 > 1 && this.a.h(var2, var3 - 1, var4 + 1)) {
               var6.a(var50, (double)var3, var46, var28, var34);
               var6.a(var50, (double)var3, var48, var28, var36);
               var6.a(var52, (double)var3, var48, var30, var36);
               var6.a(var52, (double)var3, var46, var30, var34);
               var6.a(var50, (double)var3, var48, var28, var34);
               var6.a(var50, (double)var3, var46, var28, var36);
               var6.a(var52, (double)var3, var46, var30, var36);
               var6.a(var52, (double)var3, var48, var30, var34);
            }
         }
      }

      return true;
   }

   public boolean j(yy var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      var5.b(var1.e(this.a, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.a(this.a, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if (adt.a) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.a(var6 * var8, var6 * var9, var6 * var10);
      double var19 = (double)var2;
      double var20 = (double)var3;
      double var15 = (double)var4;
      if (var1 == yy.X) {
         long var17 = (long)(var2 * 3129871) ^ (long)var4 * 116129781L ^ (long)var3;
         var17 = var17 * var17 * 42317861L + var17 * 11L;
         var19 += ((double)((float)(var17 >> 16 & 15L) / 15.0F) - (double)0.5F) * (double)0.5F;
         var20 += ((double)((float)(var17 >> 20 & 15L) / 15.0F) - (double)1.0F) * 0.2;
         var15 += ((double)((float)(var17 >> 24 & 15L) / 15.0F) - (double)0.5F) * (double)0.5F;
      }

      this.a(var1, this.a.d(var2, var3, var4), var19, var20, var15);
      return true;
   }

   public boolean k(yy var1, int var2, int var3, int var4) {
      pu var5 = (pu)var1;
      cv var6 = cv.a;
      var6.b(var5.e(this.a, var2, var3, var4));
      float var7 = 1.0F;
      int var8 = var5.a(this.a, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      if (adt.a) {
         float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = var13;
         var11 = var14;
      }

      var6.a(var7 * var9, var7 * var10, var7 * var11);
      var5.b(this.a, var2, var3, var4);
      int var15 = var5.c(this.a, var2, var3, var4);
      if (var15 < 0) {
         this.a(var5, this.a.d(var2, var3, var4), var5.bV, (double)var2, (double)var3, (double)var4);
      } else {
         this.a(var5, this.a.d(var2, var3, var4), (double)0.5F, (double)var2, (double)var3, (double)var4);
         this.a(var5, this.a.d(var2, var3, var4), var15, var5.bV, (double)var2, (double)var3, (double)var4);
      }

      return true;
   }

   public boolean l(yy var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      var5.b(var1.e(this.a, var2, var3, var4));
      var5.a(1.0F, 1.0F, 1.0F);
      this.b(var1, this.a.d(var2, var3, var4), (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      return true;
   }

   public void a(yy var1, double var2, double var4, double var6, double var8, double var10) {
      cv var12 = cv.a;
      int var13 = var1.b(0);
      if (this.e >= 0) {
         var13 = this.e;
      }

      int var14 = (var13 & 15) << 4;
      int var15 = var13 & 240;
      float var16 = (float)var14 / 256.0F;
      float var17 = ((float)var14 + 15.99F) / 256.0F;
      float var18 = (float)var15 / 256.0F;
      float var19 = ((float)var15 + 15.99F) / 256.0F;
      double var20 = (double)var16 + (double)0.02734375F;
      double var22 = (double)var18 + (double)0.0234375F;
      double var24 = (double)var16 + (double)0.03515625F;
      double var26 = (double)var18 + (double)0.03125F;
      var2 += (double)0.5F;
      var6 += (double)0.5F;
      double var28 = var2 - (double)0.5F;
      double var30 = var2 + (double)0.5F;
      double var32 = var6 - (double)0.5F;
      double var34 = var6 + (double)0.5F;
      double var36 = (double)0.0625F;
      double var38 = (double)0.625F;
      var12.a(var2 + var8 * ((double)1.0F - var38) - var36, var4 + var38, var6 + var10 * ((double)1.0F - var38) - var36, var20, var22);
      var12.a(var2 + var8 * ((double)1.0F - var38) - var36, var4 + var38, var6 + var10 * ((double)1.0F - var38) + var36, var20, var26);
      var12.a(var2 + var8 * ((double)1.0F - var38) + var36, var4 + var38, var6 + var10 * ((double)1.0F - var38) + var36, var24, var26);
      var12.a(var2 + var8 * ((double)1.0F - var38) + var36, var4 + var38, var6 + var10 * ((double)1.0F - var38) - var36, var24, var22);
      var12.a(var2 - var36, var4 + (double)1.0F, var32, (double)var16, (double)var18);
      var12.a(var2 - var36 + var8, var4 + (double)0.0F, var32 + var10, (double)var16, (double)var19);
      var12.a(var2 - var36 + var8, var4 + (double)0.0F, var34 + var10, (double)var17, (double)var19);
      var12.a(var2 - var36, var4 + (double)1.0F, var34, (double)var17, (double)var18);
      var12.a(var2 + var36, var4 + (double)1.0F, var34, (double)var16, (double)var18);
      var12.a(var2 + var8 + var36, var4 + (double)0.0F, var34 + var10, (double)var16, (double)var19);
      var12.a(var2 + var8 + var36, var4 + (double)0.0F, var32 + var10, (double)var17, (double)var19);
      var12.a(var2 + var36, var4 + (double)1.0F, var32, (double)var17, (double)var18);
      var12.a(var28, var4 + (double)1.0F, var6 + var36, (double)var16, (double)var18);
      var12.a(var28 + var8, var4 + (double)0.0F, var6 + var36 + var10, (double)var16, (double)var19);
      var12.a(var30 + var8, var4 + (double)0.0F, var6 + var36 + var10, (double)var17, (double)var19);
      var12.a(var30, var4 + (double)1.0F, var6 + var36, (double)var17, (double)var18);
      var12.a(var30, var4 + (double)1.0F, var6 - var36, (double)var16, (double)var18);
      var12.a(var30 + var8, var4 + (double)0.0F, var6 - var36 + var10, (double)var16, (double)var19);
      var12.a(var28 + var8, var4 + (double)0.0F, var6 - var36 + var10, (double)var17, (double)var19);
      var12.a(var28, var4 + (double)1.0F, var6 - var36, (double)var17, (double)var18);
   }

   public void a(yy var1, int var2, double var3, double var5, double var7) {
      cv var9 = cv.a;
      int var10 = var1.a(0, var2);
      if (this.e >= 0) {
         var10 = this.e;
      }

      int var11 = (var10 & 15) << 4;
      int var12 = var10 & 240;
      double var13 = (double)((float)var11 / 256.0F);
      double var15 = (double)(((float)var11 + 15.99F) / 256.0F);
      double var17 = (double)((float)var12 / 256.0F);
      double var19 = (double)(((float)var12 + 15.99F) / 256.0F);
      double var21 = var3 + (double)0.5F - 0.45;
      double var23 = var3 + (double)0.5F + 0.45;
      double var25 = var7 + (double)0.5F - 0.45;
      double var27 = var7 + (double)0.5F + 0.45;
      var9.a(var21, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var27, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var21, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var27, var15, var17);
   }

   public void a(yy var1, int var2, double var3, double var5, double var7, double var9) {
      cv var11 = cv.a;
      int var12 = var1.a(0, var2);
      if (this.e >= 0) {
         var12 = this.e;
      }

      int var13 = (var12 & 15) << 4;
      int var14 = var12 & 240;
      double var15 = (double)((float)var13 / 256.0F);
      double var17 = (double)(((float)var13 + 15.99F) / 256.0F);
      double var19 = (double)((float)var14 / 256.0F);
      double var21 = ((double)var14 + (double)15.99F * var3) / (double)256.0F;
      double var23 = var5 + (double)0.5F - (double)0.45F;
      double var25 = var5 + (double)0.5F + (double)0.45F;
      double var27 = var9 + (double)0.5F - (double)0.45F;
      double var29 = var9 + (double)0.5F + (double)0.45F;
      var11.a(var23, var7 + var3, var27, var15, var19);
      var11.a(var23, var7 + (double)0.0F, var27, var15, var21);
      var11.a(var25, var7 + (double)0.0F, var29, var17, var21);
      var11.a(var25, var7 + var3, var29, var17, var19);
      var11.a(var25, var7 + var3, var29, var15, var19);
      var11.a(var25, var7 + (double)0.0F, var29, var15, var21);
      var11.a(var23, var7 + (double)0.0F, var27, var17, var21);
      var11.a(var23, var7 + var3, var27, var17, var19);
      var11.a(var23, var7 + var3, var29, var15, var19);
      var11.a(var23, var7 + (double)0.0F, var29, var15, var21);
      var11.a(var25, var7 + (double)0.0F, var27, var17, var21);
      var11.a(var25, var7 + var3, var27, var17, var19);
      var11.a(var25, var7 + var3, var27, var15, var19);
      var11.a(var25, var7 + (double)0.0F, var27, var15, var21);
      var11.a(var23, var7 + (double)0.0F, var29, var17, var21);
      var11.a(var23, var7 + var3, var29, var17, var19);
   }

   public boolean m(yy var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      int var6 = var1.bL;
      if (this.e >= 0) {
         var6 = this.e;
      }

      int var7 = (var6 & 15) << 4;
      int var8 = var6 & 240;
      float var9 = 0.015625F;
      double var10 = (double)((float)var7 / 256.0F);
      double var12 = (double)(((float)var7 + 15.99F) / 256.0F);
      double var14 = (double)((float)var8 / 256.0F);
      double var16 = (double)(((float)var8 + 15.99F) / 256.0F);
      long var18 = (long)(var2 * 3129871) ^ (long)var4 * 116129781L ^ (long)var3;
      var18 = var18 * var18 * 42317861L + var18 * 11L;
      int var20 = (int)(var18 >> 16 & 3L);
      var5.b(var1.e(this.a, var2, var3, var4));
      float var21 = (float)var2 + 0.5F;
      float var22 = (float)var4 + 0.5F;
      float var23 = (float)(var20 & 1) * 0.5F * (float)(1 - var20 / 2 % 2 * 2);
      float var24 = (float)(var20 + 1 & 1) * 0.5F * (float)(1 - (var20 + 1) / 2 % 2 * 2);
      var5.c(var1.f());
      var5.a((double)(var21 + var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 + var24), var10, var14);
      var5.a((double)(var21 + var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 + var24), var12, var14);
      var5.a((double)(var21 - var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 - var24), var12, var16);
      var5.a((double)(var21 - var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 - var24), var10, var16);
      var5.c((var1.f() & 16711422) >> 1);
      var5.a((double)(var21 - var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 - var24), var10, var16);
      var5.a((double)(var21 - var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 - var24), var12, var16);
      var5.a((double)(var21 + var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 + var24), var12, var14);
      var5.a((double)(var21 + var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 + var24), var10, var14);
      return true;
   }

   public void a(yy var1, int var2, int var3, double var4, double var6, double var8, double var10) {
      cv var12 = cv.a;
      int var13 = var1.a(0, var2) + 16;
      if (this.e >= 0) {
         var13 = this.e;
      }

      int var14 = (var13 & 15) << 4;
      int var15 = var13 & 240;
      double var16 = (double)((float)var14 / 256.0F);
      double var18 = (double)(((float)var14 + 15.99F) / 256.0F);
      double var20 = (double)((float)var15 / 256.0F);
      double var22 = ((double)var15 + (double)15.99F * var4) / (double)256.0F;
      double var24 = var6 + (double)0.5F - (double)0.5F;
      double var26 = var6 + (double)0.5F + (double)0.5F;
      double var28 = var10 + (double)0.5F - (double)0.5F;
      double var30 = var10 + (double)0.5F + (double)0.5F;
      double var32 = var6 + (double)0.5F;
      double var34 = var10 + (double)0.5F;
      if ((var3 + 1) / 2 % 2 == 1) {
         double var36 = var18;
         var18 = var16;
         var16 = var36;
      }

      if (var3 < 2) {
         var12.a(var24, var8 + var4, var34, var16, var20);
         var12.a(var24, var8 + (double)0.0F, var34, var16, var22);
         var12.a(var26, var8 + (double)0.0F, var34, var18, var22);
         var12.a(var26, var8 + var4, var34, var18, var20);
         var12.a(var26, var8 + var4, var34, var18, var20);
         var12.a(var26, var8 + (double)0.0F, var34, var18, var22);
         var12.a(var24, var8 + (double)0.0F, var34, var16, var22);
         var12.a(var24, var8 + var4, var34, var16, var20);
      } else {
         var12.a(var32, var8 + var4, var30, var16, var20);
         var12.a(var32, var8 + (double)0.0F, var30, var16, var22);
         var12.a(var32, var8 + (double)0.0F, var28, var18, var22);
         var12.a(var32, var8 + var4, var28, var18, var20);
         var12.a(var32, var8 + var4, var28, var18, var20);
         var12.a(var32, var8 + (double)0.0F, var28, var18, var22);
         var12.a(var32, var8 + (double)0.0F, var30, var16, var22);
         var12.a(var32, var8 + var4, var30, var16, var20);
      }

   }

   public void b(yy var1, int var2, double var3, double var5, double var7) {
      cv var9 = cv.a;
      int var10 = var1.a(0, var2);
      if (this.e >= 0) {
         var10 = this.e;
      }

      int var11 = (var10 & 15) << 4;
      int var12 = var10 & 240;
      double var13 = (double)((float)var11 / 256.0F);
      double var15 = (double)(((float)var11 + 15.99F) / 256.0F);
      double var17 = (double)((float)var12 / 256.0F);
      double var19 = (double)(((float)var12 + 15.99F) / 256.0F);
      double var21 = var3 + (double)0.5F - (double)0.25F;
      double var23 = var3 + (double)0.5F + (double)0.25F;
      double var25 = var7 + (double)0.5F - (double)0.5F;
      double var27 = var7 + (double)0.5F + (double)0.5F;
      var9.a(var21, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var27, var15, var17);
      var9.a(var21, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var27, var15, var17);
      var21 = var3 + (double)0.5F - (double)0.5F;
      var23 = var3 + (double)0.5F + (double)0.5F;
      var25 = var7 + (double)0.5F - (double)0.25F;
      var27 = var7 + (double)0.5F + (double)0.25F;
      var9.a(var21, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var27, var15, var17);
      var9.a(var21, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var27, var15, var17);
   }

   public boolean n(yy var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      int var6 = var1.a(this.a, var2, var3, var4);
      float var7 = (float)(var6 >> 16 & 255) / 255.0F;
      float var8 = (float)(var6 >> 8 & 255) / 255.0F;
      float var9 = (float)(var6 & 255) / 255.0F;
      boolean var10 = var1.a_(this.a, var2, var3 + 1, var4, 1);
      boolean var11 = var1.a_(this.a, var2, var3 - 1, var4, 0);
      boolean[] var12 = new boolean[]{var1.a_(this.a, var2, var3, var4 - 1, 2), var1.a_(this.a, var2, var3, var4 + 1, 3), var1.a_(this.a, var2 - 1, var3, var4, 4), var1.a_(this.a, var2 + 1, var3, var4, 5)};
      if (!var10 && !var11 && !var12[0] && !var12[1] && !var12[2] && !var12[3]) {
         return false;
      } else {
         boolean var13 = false;
         float var14 = 0.5F;
         float var15 = 1.0F;
         float var16 = 0.8F;
         float var17 = 0.6F;
         double var18 = (double)0.0F;
         double var20 = (double)1.0F;
         p var22 = var1.bZ;
         int var23 = this.a.d(var2, var3, var4);
         double var24 = (double)this.a(var2, var3, var4, var22);
         double var26 = (double)this.a(var2, var3, var4 + 1, var22);
         double var28 = (double)this.a(var2 + 1, var3, var4 + 1, var22);
         double var30 = (double)this.a(var2 + 1, var3, var4, var22);
         double var32 = (double)0.001F;
         if (this.g || var10) {
            var13 = true;
            int var34 = var1.a(1, var23);
            float var35 = (float)agw.a(this.a, var2, var3, var4, var22);
            if (var35 > -999.0F) {
               var34 = var1.a(2, var23);
            }

            var24 -= var32;
            var26 -= var32;
            var28 -= var32;
            var30 -= var32;
            int var36 = (var34 & 15) << 4;
            int var37 = var34 & 240;
            double var38 = ((double)var36 + (double)8.0F) / (double)256.0F;
            double var40 = ((double)var37 + (double)8.0F) / (double)256.0F;
            if (var35 < -999.0F) {
               var35 = 0.0F;
            } else {
               var38 = (double)((float)(var36 + 16) / 256.0F);
               var40 = (double)((float)(var37 + 16) / 256.0F);
            }

            double var42 = (double)(me.a(var35) * 8.0F) / (double)256.0F;
            double var44 = (double)(me.b(var35) * 8.0F) / (double)256.0F;
            var5.b(var1.e(this.a, var2, var3, var4));
            float var46 = 1.0F;
            var5.a(var15 * var46 * var7, var15 * var46 * var8, var15 * var46 * var9);
            var5.a((double)(var2 + 0), (double)var3 + var24, (double)(var4 + 0), var38 - var44 - var42, var40 - var44 + var42);
            var5.a((double)(var2 + 0), (double)var3 + var26, (double)(var4 + 1), var38 - var44 + var42, var40 + var44 + var42);
            var5.a((double)(var2 + 1), (double)var3 + var28, (double)(var4 + 1), var38 + var44 + var42, var40 + var44 - var42);
            var5.a((double)(var2 + 1), (double)var3 + var30, (double)(var4 + 0), var38 + var44 - var42, var40 - var44 - var42);
         }

         if (this.g || var11) {
            var5.b(var1.e(this.a, var2, var3 - 1, var4));
            float var64 = 1.0F;
            var5.a(var14 * var64, var14 * var64, var14 * var64);
            this.a(var1, (double)var2, (double)var3 + var32, (double)var4, var1.b(0));
            var13 = true;
         }

         for(int var65 = 0; var65 < 4; ++var65) {
            int var66 = var2;
            int var67 = var4;
            if (var65 == 0) {
               var67 = var4 - 1;
            }

            if (var65 == 1) {
               ++var67;
            }

            if (var65 == 2) {
               var66 = var2 - 1;
            }

            if (var65 == 3) {
               ++var66;
            }

            int var68 = var1.a(var65 + 2, var23);
            int var39 = (var68 & 15) << 4;
            int var69 = var68 & 240;
            if (this.g || var12[var65]) {
               double var41;
               double var43;
               double var45;
               double var47;
               double var49;
               double var51;
               if (var65 == 0) {
                  var41 = var24;
                  var43 = var30;
                  var45 = (double)var2;
                  var49 = (double)(var2 + 1);
                  var47 = (double)var4 + var32;
                  var51 = (double)var4 + var32;
               } else if (var65 == 1) {
                  var41 = var28;
                  var43 = var26;
                  var45 = (double)(var2 + 1);
                  var49 = (double)var2;
                  var47 = (double)(var4 + 1) - var32;
                  var51 = (double)(var4 + 1) - var32;
               } else if (var65 == 2) {
                  var41 = var26;
                  var43 = var24;
                  var45 = (double)var2 + var32;
                  var49 = (double)var2 + var32;
                  var47 = (double)(var4 + 1);
                  var51 = (double)var4;
               } else {
                  var41 = var30;
                  var43 = var28;
                  var45 = (double)(var2 + 1) - var32;
                  var49 = (double)(var2 + 1) - var32;
                  var47 = (double)var4;
                  var51 = (double)(var4 + 1);
               }

               var13 = true;
               double var53 = (double)((float)(var39 + 0) / 256.0F);
               double var55 = ((double)(var39 + 16) - 0.01) / (double)256.0F;
               double var57 = ((double)var69 + ((double)1.0F - var41) * (double)16.0F) / (double)256.0F;
               double var59 = ((double)var69 + ((double)1.0F - var43) * (double)16.0F) / (double)256.0F;
               double var61 = ((double)(var69 + 16) - 0.01) / (double)256.0F;
               var5.b(var1.e(this.a, var66, var3, var67));
               float var63 = 1.0F;
               if (var65 < 2) {
                  var63 *= var16;
               } else {
                  var63 *= var17;
               }

               var5.a(var15 * var63 * var7, var15 * var63 * var8, var15 * var63 * var9);
               var5.a(var45, (double)var3 + var41, var47, var53, var57);
               var5.a(var49, (double)var3 + var43, var51, var55, var59);
               var5.a(var49, (double)(var3 + 0), var51, var55, var61);
               var5.a(var45, (double)(var3 + 0), var47, var53, var61);
            }
         }

         var1.bS = var18;
         var1.bV = var20;
         return var13;
      }
   }

   private float a(int var1, int var2, int var3, p var4) {
      int var5 = 0;
      float var6 = 0.0F;

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var1 - (var7 & 1);
         int var10 = var3 - (var7 >> 1 & 1);
         if (this.a.e(var8, var2 + 1, var10) == var4) {
            return 1.0F;
         }

         p var11 = this.a.e(var8, var2, var10);
         if (var11 == var4) {
            int var12 = this.a.d(var8, var2, var10);
            if (var12 >= 8 || var12 == 0) {
               var6 += agw.e(var12) * 10.0F;
               var5 += 10;
            }

            var6 += agw.e(var12);
            ++var5;
         } else if (!var11.b()) {
            ++var6;
            ++var5;
         }
      }

      return 1.0F - var6 / (float)var5;
   }

   public void a(yy var1, ry var2, int var3, int var4, int var5) {
      float var6 = 0.5F;
      float var7 = 1.0F;
      float var8 = 0.8F;
      float var9 = 0.6F;
      cv var10 = cv.a;
      var10.b();
      var10.b(var1.e((kq)var2, var3, var4, var5));
      float var11 = 1.0F;
      float var12 = 1.0F;
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var6 * var12, var6 * var12, var6 * var12);
      this.a(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.b(0));
      var12 = 1.0F;
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var7 * var12, var7 * var12, var7 * var12);
      this.b(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.b(1));
      var12 = 1.0F;
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var8 * var12, var8 * var12, var8 * var12);
      this.c(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.b(2));
      var12 = 1.0F;
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var8 * var12, var8 * var12, var8 * var12);
      this.d(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.b(3));
      var12 = 1.0F;
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var9 * var12, var9 * var12, var9 * var12);
      this.e(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.b(4));
      var12 = 1.0F;
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var9 * var12, var9 * var12, var9 * var12);
      this.f(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.b(5));
      var10.a();
   }

   public boolean o(yy var1, int var2, int var3, int var4) {
      int var5 = var1.a(this.a, var2, var3, var4);
      float var6 = (float)(var5 >> 16 & 255) / 255.0F;
      float var7 = (float)(var5 >> 8 & 255) / 255.0F;
      float var8 = (float)(var5 & 255) / 255.0F;
      if (adt.a) {
         float var9 = (var6 * 30.0F + var7 * 59.0F + var8 * 11.0F) / 100.0F;
         float var10 = (var6 * 30.0F + var7 * 70.0F) / 100.0F;
         float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
         var6 = var9;
         var7 = var10;
         var8 = var11;
      }

      return Minecraft.t() && yy.q[var1.bM] == 0 ? this.a(var1, var2, var3, var4, var6, var7, var8) : this.b(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean a(yy var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      this.n = true;
      boolean var8 = false;
      float var9 = this.o;
      float var10 = this.o;
      float var11 = this.o;
      float var12 = this.o;
      boolean var13 = true;
      boolean var14 = true;
      boolean var15 = true;
      boolean var16 = true;
      boolean var17 = true;
      boolean var18 = true;
      this.o = var1.f(this.a, var2, var3, var4);
      this.p = var1.f(this.a, var2 - 1, var3, var4);
      this.q = var1.f(this.a, var2, var3 - 1, var4);
      this.r = var1.f(this.a, var2, var3, var4 - 1);
      this.s = var1.f(this.a, var2 + 1, var3, var4);
      this.t = var1.f(this.a, var2, var3 + 1, var4);
      this.u = var1.f(this.a, var2, var3, var4 + 1);
      int var19 = var1.e(this.a, var2, var3, var4);
      int var20 = var19;
      int var21 = var19;
      int var22 = var19;
      int var23 = var19;
      int var24 = var19;
      int var25 = var19;
      if (var1.bS <= (double)0.0F) {
         var21 = var1.e(this.a, var2, var3 - 1, var4);
      }

      if (var1.bV >= (double)1.0F) {
         var24 = var1.e(this.a, var2, var3 + 1, var4);
      }

      if (var1.bR <= (double)0.0F) {
         var20 = var1.e(this.a, var2 - 1, var3, var4);
      }

      if (var1.bU >= (double)1.0F) {
         var23 = var1.e(this.a, var2 + 1, var3, var4);
      }

      if (var1.bT <= (double)0.0F) {
         var22 = var1.e(this.a, var2, var3, var4 - 1);
      }

      if (var1.bW >= (double)1.0F) {
         var25 = var1.e(this.a, var2, var3, var4 + 1);
      }

      cv var26 = cv.a;
      var26.b(983055);
      this.aB = yy.p[this.a.a(var2 + 1, var3 + 1, var4)];
      this.aJ = yy.p[this.a.a(var2 + 1, var3 - 1, var4)];
      this.aF = yy.p[this.a.a(var2 + 1, var3, var4 + 1)];
      this.aH = yy.p[this.a.a(var2 + 1, var3, var4 - 1)];
      this.aC = yy.p[this.a.a(var2 - 1, var3 + 1, var4)];
      this.aK = yy.p[this.a.a(var2 - 1, var3 - 1, var4)];
      this.aE = yy.p[this.a.a(var2 - 1, var3, var4 - 1)];
      this.aG = yy.p[this.a.a(var2 - 1, var3, var4 + 1)];
      this.aD = yy.p[this.a.a(var2, var3 + 1, var4 + 1)];
      this.aA = yy.p[this.a.a(var2, var3 + 1, var4 - 1)];
      this.aL = yy.p[this.a.a(var2, var3 - 1, var4 + 1)];
      this.aI = yy.p[this.a.a(var2, var3 - 1, var4 - 1)];
      if (var1.bL == 3) {
         var18 = false;
         var17 = false;
         var16 = false;
         var15 = false;
         var13 = false;
      }

      if (this.e >= 0) {
         var18 = false;
         var17 = false;
         var16 = false;
         var15 = false;
         var13 = false;
      }

      if (this.g || var1.a_(this.a, var2, var3 - 1, var4, 0)) {
         if (this.aj > 0) {
            if (var1.bS <= (double)0.0F) {
               --var3;
            }

            this.Q = var1.e(this.a, var2 - 1, var3, var4);
            this.S = var1.e(this.a, var2, var3, var4 - 1);
            this.T = var1.e(this.a, var2, var3, var4 + 1);
            this.V = var1.e(this.a, var2 + 1, var3, var4);
            this.w = var1.f(this.a, var2 - 1, var3, var4);
            this.y = var1.f(this.a, var2, var3, var4 - 1);
            this.z = var1.f(this.a, var2, var3, var4 + 1);
            this.B = var1.f(this.a, var2 + 1, var3, var4);
            if (!this.aI && !this.aK) {
               this.v = this.w;
               this.P = this.Q;
            } else {
               this.v = var1.f(this.a, var2 - 1, var3, var4 - 1);
               this.P = var1.e(this.a, var2 - 1, var3, var4 - 1);
            }

            if (!this.aL && !this.aK) {
               this.x = this.w;
               this.R = this.Q;
            } else {
               this.x = var1.f(this.a, var2 - 1, var3, var4 + 1);
               this.R = var1.e(this.a, var2 - 1, var3, var4 + 1);
            }

            if (!this.aI && !this.aJ) {
               this.A = this.B;
               this.U = this.V;
            } else {
               this.A = var1.f(this.a, var2 + 1, var3, var4 - 1);
               this.U = var1.e(this.a, var2 + 1, var3, var4 - 1);
            }

            if (!this.aL && !this.aJ) {
               this.C = this.B;
               this.W = this.V;
            } else {
               this.C = var1.f(this.a, var2 + 1, var3, var4 + 1);
               this.W = var1.e(this.a, var2 + 1, var3, var4 + 1);
            }

            if (var1.bS <= (double)0.0F) {
               ++var3;
            }

            var9 = (this.x + this.w + this.z + this.q) / 4.0F;
            var12 = (this.z + this.q + this.C + this.B) / 4.0F;
            var11 = (this.q + this.y + this.B + this.A) / 4.0F;
            var10 = (this.w + this.v + this.q + this.y) / 4.0F;
            this.ak = this.c(this.R, this.Q, this.T, var21);
            this.an = this.c(this.T, this.W, this.V, var21);
            this.am = this.c(this.S, this.V, this.U, var21);
            this.al = this.c(this.Q, this.P, this.S, var21);
         } else {
            var9 = var10 = var11 = var12 = this.q;
            this.ak = this.al = this.am = this.an = this.Q;
         }

         this.ao = this.ap = this.aq = this.ar = (var13 ? var5 : 1.0F) * 0.5F;
         this.as = this.at = this.au = this.av = (var13 ? var6 : 1.0F) * 0.5F;
         this.aw = this.ax = this.ay = this.az = (var13 ? var7 : 1.0F) * 0.5F;
         this.ao *= var9;
         this.as *= var9;
         this.aw *= var9;
         this.ap *= var10;
         this.at *= var10;
         this.ax *= var10;
         this.aq *= var11;
         this.au *= var11;
         this.ay *= var11;
         this.ar *= var12;
         this.av *= var12;
         this.az *= var12;
         this.a(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 0));
         var8 = true;
      }

      if (this.g || var1.a_(this.a, var2, var3 + 1, var4, 1)) {
         if (this.aj > 0) {
            if (var1.bV >= (double)1.0F) {
               ++var3;
            }

            this.Y = var1.e(this.a, var2 - 1, var3, var4);
            this.ac = var1.e(this.a, var2 + 1, var3, var4);
            this.aa = var1.e(this.a, var2, var3, var4 - 1);
            this.ad = var1.e(this.a, var2, var3, var4 + 1);
            this.E = var1.f(this.a, var2 - 1, var3, var4);
            this.I = var1.f(this.a, var2 + 1, var3, var4);
            this.G = var1.f(this.a, var2, var3, var4 - 1);
            this.J = var1.f(this.a, var2, var3, var4 + 1);
            if (!this.aA && !this.aC) {
               this.D = this.E;
               this.X = this.Y;
            } else {
               this.D = var1.f(this.a, var2 - 1, var3, var4 - 1);
               this.X = var1.e(this.a, var2 - 1, var3, var4 - 1);
            }

            if (!this.aA && !this.aB) {
               this.H = this.I;
               this.ab = this.ac;
            } else {
               this.H = var1.f(this.a, var2 + 1, var3, var4 - 1);
               this.ab = var1.e(this.a, var2 + 1, var3, var4 - 1);
            }

            if (!this.aD && !this.aC) {
               this.F = this.E;
               this.Z = this.Y;
            } else {
               this.F = var1.f(this.a, var2 - 1, var3, var4 + 1);
               this.Z = var1.e(this.a, var2 - 1, var3, var4 + 1);
            }

            if (!this.aD && !this.aB) {
               this.K = this.I;
               this.ae = this.ac;
            } else {
               this.K = var1.f(this.a, var2 + 1, var3, var4 + 1);
               this.ae = var1.e(this.a, var2 + 1, var3, var4 + 1);
            }

            if (var1.bV >= (double)1.0F) {
               --var3;
            }

            var12 = (this.F + this.E + this.J + this.t) / 4.0F;
            var9 = (this.J + this.t + this.K + this.I) / 4.0F;
            var10 = (this.t + this.G + this.I + this.H) / 4.0F;
            var11 = (this.E + this.D + this.t + this.G) / 4.0F;
            this.an = this.c(this.Z, this.Y, this.ad, var24);
            this.ak = this.c(this.ad, this.ae, this.ac, var24);
            this.al = this.c(this.aa, this.ac, this.ab, var24);
            this.am = this.c(this.Y, this.X, this.aa, var24);
         } else {
            var9 = var10 = var11 = var12 = this.t;
            this.ak = this.al = this.am = this.an = var24;
         }

         this.ao = this.ap = this.aq = this.ar = var14 ? var5 : 1.0F;
         this.as = this.at = this.au = this.av = var14 ? var6 : 1.0F;
         this.aw = this.ax = this.ay = this.az = var14 ? var7 : 1.0F;
         this.ao *= var9;
         this.as *= var9;
         this.aw *= var9;
         this.ap *= var10;
         this.at *= var10;
         this.ax *= var10;
         this.aq *= var11;
         this.au *= var11;
         this.ay *= var11;
         this.ar *= var12;
         this.av *= var12;
         this.az *= var12;
         this.b(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 1));
         var8 = true;
      }

      if (this.g || var1.a_(this.a, var2, var3, var4 - 1, 2)) {
         if (this.aj > 0) {
            if (var1.bT <= (double)0.0F) {
               --var4;
            }

            this.L = var1.f(this.a, var2 - 1, var3, var4);
            this.y = var1.f(this.a, var2, var3 - 1, var4);
            this.G = var1.f(this.a, var2, var3 + 1, var4);
            this.M = var1.f(this.a, var2 + 1, var3, var4);
            this.af = var1.e(this.a, var2 - 1, var3, var4);
            this.S = var1.e(this.a, var2, var3 - 1, var4);
            this.aa = var1.e(this.a, var2, var3 + 1, var4);
            this.ag = var1.e(this.a, var2 + 1, var3, var4);
            if (!this.aE && !this.aI) {
               this.v = this.L;
               this.P = this.af;
            } else {
               this.v = var1.f(this.a, var2 - 1, var3 - 1, var4);
               this.P = var1.e(this.a, var2 - 1, var3 - 1, var4);
            }

            if (!this.aE && !this.aA) {
               this.D = this.L;
               this.X = this.af;
            } else {
               this.D = var1.f(this.a, var2 - 1, var3 + 1, var4);
               this.X = var1.e(this.a, var2 - 1, var3 + 1, var4);
            }

            if (!this.aH && !this.aI) {
               this.A = this.M;
               this.U = this.ag;
            } else {
               this.A = var1.f(this.a, var2 + 1, var3 - 1, var4);
               this.U = var1.e(this.a, var2 + 1, var3 - 1, var4);
            }

            if (!this.aH && !this.aA) {
               this.H = this.M;
               this.ab = this.ag;
            } else {
               this.H = var1.f(this.a, var2 + 1, var3 + 1, var4);
               this.ab = var1.e(this.a, var2 + 1, var3 + 1, var4);
            }

            if (var1.bT <= (double)0.0F) {
               ++var4;
            }

            var9 = (this.L + this.D + this.r + this.G) / 4.0F;
            var10 = (this.r + this.G + this.M + this.H) / 4.0F;
            var11 = (this.y + this.r + this.A + this.M) / 4.0F;
            var12 = (this.v + this.L + this.y + this.r) / 4.0F;
            this.ak = this.c(this.af, this.X, this.aa, var22);
            this.al = this.c(this.aa, this.ag, this.ab, var22);
            this.am = this.c(this.S, this.U, this.ag, var22);
            this.an = this.c(this.P, this.af, this.S, var22);
         } else {
            var9 = var10 = var11 = var12 = this.r;
            this.ak = this.al = this.am = this.an = var22;
         }

         this.ao = this.ap = this.aq = this.ar = (var15 ? var5 : 1.0F) * 0.8F;
         this.as = this.at = this.au = this.av = (var15 ? var6 : 1.0F) * 0.8F;
         this.aw = this.ax = this.ay = this.az = (var15 ? var7 : 1.0F) * 0.8F;
         this.ao *= var9;
         this.as *= var9;
         this.aw *= var9;
         this.ap *= var10;
         this.at *= var10;
         this.ax *= var10;
         this.aq *= var11;
         this.au *= var11;
         this.ay *= var11;
         this.ar *= var12;
         this.av *= var12;
         this.az *= var12;
         int var27 = var1.a((kq)this.a, var2, var3, var4, 2);
         this.c(var1, (double)var2, (double)var3, (double)var4, var27);
         if (b && var27 == 3 && this.e < 0) {
            this.ao *= var5;
            this.ap *= var5;
            this.aq *= var5;
            this.ar *= var5;
            this.as *= var6;
            this.at *= var6;
            this.au *= var6;
            this.av *= var6;
            this.aw *= var7;
            this.ax *= var7;
            this.ay *= var7;
            this.az *= var7;
            this.c(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      if (this.g || var1.a_(this.a, var2, var3, var4 + 1, 3)) {
         if (this.aj > 0) {
            if (var1.bW >= (double)1.0F) {
               ++var4;
            }

            this.N = var1.f(this.a, var2 - 1, var3, var4);
            this.O = var1.f(this.a, var2 + 1, var3, var4);
            this.z = var1.f(this.a, var2, var3 - 1, var4);
            this.J = var1.f(this.a, var2, var3 + 1, var4);
            this.ah = var1.e(this.a, var2 - 1, var3, var4);
            this.ai = var1.e(this.a, var2 + 1, var3, var4);
            this.T = var1.e(this.a, var2, var3 - 1, var4);
            this.ad = var1.e(this.a, var2, var3 + 1, var4);
            if (!this.aG && !this.aL) {
               this.x = this.N;
               this.R = this.ah;
            } else {
               this.x = var1.f(this.a, var2 - 1, var3 - 1, var4);
               this.R = var1.e(this.a, var2 - 1, var3 - 1, var4);
            }

            if (!this.aG && !this.aD) {
               this.F = this.N;
               this.Z = this.ah;
            } else {
               this.F = var1.f(this.a, var2 - 1, var3 + 1, var4);
               this.Z = var1.e(this.a, var2 - 1, var3 + 1, var4);
            }

            if (!this.aF && !this.aL) {
               this.C = this.O;
               this.W = this.ai;
            } else {
               this.C = var1.f(this.a, var2 + 1, var3 - 1, var4);
               this.W = var1.e(this.a, var2 + 1, var3 - 1, var4);
            }

            if (!this.aF && !this.aD) {
               this.K = this.O;
               this.ae = this.ai;
            } else {
               this.K = var1.f(this.a, var2 + 1, var3 + 1, var4);
               this.ae = var1.e(this.a, var2 + 1, var3 + 1, var4);
            }

            if (var1.bW >= (double)1.0F) {
               --var4;
            }

            var9 = (this.N + this.F + this.u + this.J) / 4.0F;
            var12 = (this.u + this.J + this.O + this.K) / 4.0F;
            var11 = (this.z + this.u + this.C + this.O) / 4.0F;
            var10 = (this.x + this.N + this.z + this.u) / 4.0F;
            this.ak = this.c(this.ah, this.Z, this.ad, var25);
            this.an = this.c(this.ad, this.ai, this.ae, var25);
            this.am = this.c(this.T, this.W, this.ai, var25);
            this.al = this.c(this.R, this.ah, this.T, var25);
         } else {
            var9 = var10 = var11 = var12 = this.u;
            this.ak = this.al = this.am = this.an = var25;
         }

         this.ao = this.ap = this.aq = this.ar = (var16 ? var5 : 1.0F) * 0.8F;
         this.as = this.at = this.au = this.av = (var16 ? var6 : 1.0F) * 0.8F;
         this.aw = this.ax = this.ay = this.az = (var16 ? var7 : 1.0F) * 0.8F;
         this.ao *= var9;
         this.as *= var9;
         this.aw *= var9;
         this.ap *= var10;
         this.at *= var10;
         this.ax *= var10;
         this.aq *= var11;
         this.au *= var11;
         this.ay *= var11;
         this.ar *= var12;
         this.av *= var12;
         this.az *= var12;
         int var52 = var1.a((kq)this.a, var2, var3, var4, 3);
         this.d(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 3));
         if (b && var52 == 3 && this.e < 0) {
            this.ao *= var5;
            this.ap *= var5;
            this.aq *= var5;
            this.ar *= var5;
            this.as *= var6;
            this.at *= var6;
            this.au *= var6;
            this.av *= var6;
            this.aw *= var7;
            this.ax *= var7;
            this.ay *= var7;
            this.az *= var7;
            this.d(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      if (this.g || var1.a_(this.a, var2 - 1, var3, var4, 4)) {
         if (this.aj > 0) {
            if (var1.bR <= (double)0.0F) {
               --var2;
            }

            this.w = var1.f(this.a, var2, var3 - 1, var4);
            this.L = var1.f(this.a, var2, var3, var4 - 1);
            this.N = var1.f(this.a, var2, var3, var4 + 1);
            this.E = var1.f(this.a, var2, var3 + 1, var4);
            this.Q = var1.e(this.a, var2, var3 - 1, var4);
            this.af = var1.e(this.a, var2, var3, var4 - 1);
            this.ah = var1.e(this.a, var2, var3, var4 + 1);
            this.Y = var1.e(this.a, var2, var3 + 1, var4);
            if (!this.aE && !this.aK) {
               this.v = this.L;
               this.P = this.af;
            } else {
               this.v = var1.f(this.a, var2, var3 - 1, var4 - 1);
               this.P = var1.e(this.a, var2, var3 - 1, var4 - 1);
            }

            if (!this.aG && !this.aK) {
               this.x = this.N;
               this.R = this.ah;
            } else {
               this.x = var1.f(this.a, var2, var3 - 1, var4 + 1);
               this.R = var1.e(this.a, var2, var3 - 1, var4 + 1);
            }

            if (!this.aE && !this.aC) {
               this.D = this.L;
               this.X = this.af;
            } else {
               this.D = var1.f(this.a, var2, var3 + 1, var4 - 1);
               this.X = var1.e(this.a, var2, var3 + 1, var4 - 1);
            }

            if (!this.aG && !this.aC) {
               this.F = this.N;
               this.Z = this.ah;
            } else {
               this.F = var1.f(this.a, var2, var3 + 1, var4 + 1);
               this.Z = var1.e(this.a, var2, var3 + 1, var4 + 1);
            }

            if (var1.bR <= (double)0.0F) {
               ++var2;
            }

            var12 = (this.w + this.x + this.p + this.N) / 4.0F;
            var9 = (this.p + this.N + this.E + this.F) / 4.0F;
            var10 = (this.L + this.p + this.D + this.E) / 4.0F;
            var11 = (this.v + this.w + this.L + this.p) / 4.0F;
            this.an = this.c(this.Q, this.R, this.ah, var20);
            this.ak = this.c(this.ah, this.Y, this.Z, var20);
            this.al = this.c(this.af, this.X, this.Y, var20);
            this.am = this.c(this.P, this.Q, this.af, var20);
         } else {
            var9 = var10 = var11 = var12 = this.p;
            this.ak = this.al = this.am = this.an = var20;
         }

         this.ao = this.ap = this.aq = this.ar = (var17 ? var5 : 1.0F) * 0.6F;
         this.as = this.at = this.au = this.av = (var17 ? var6 : 1.0F) * 0.6F;
         this.aw = this.ax = this.ay = this.az = (var17 ? var7 : 1.0F) * 0.6F;
         this.ao *= var9;
         this.as *= var9;
         this.aw *= var9;
         this.ap *= var10;
         this.at *= var10;
         this.ax *= var10;
         this.aq *= var11;
         this.au *= var11;
         this.ay *= var11;
         this.ar *= var12;
         this.av *= var12;
         this.az *= var12;
         int var53 = var1.a((kq)this.a, var2, var3, var4, 4);
         this.e(var1, (double)var2, (double)var3, (double)var4, var53);
         if (b && var53 == 3 && this.e < 0) {
            this.ao *= var5;
            this.ap *= var5;
            this.aq *= var5;
            this.ar *= var5;
            this.as *= var6;
            this.at *= var6;
            this.au *= var6;
            this.av *= var6;
            this.aw *= var7;
            this.ax *= var7;
            this.ay *= var7;
            this.az *= var7;
            this.e(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      if (this.g || var1.a_(this.a, var2 + 1, var3, var4, 5)) {
         if (this.aj > 0) {
            if (var1.bU >= (double)1.0F) {
               ++var2;
            }

            this.B = var1.f(this.a, var2, var3 - 1, var4);
            this.M = var1.f(this.a, var2, var3, var4 - 1);
            this.O = var1.f(this.a, var2, var3, var4 + 1);
            this.I = var1.f(this.a, var2, var3 + 1, var4);
            this.V = var1.e(this.a, var2, var3 - 1, var4);
            this.ag = var1.e(this.a, var2, var3, var4 - 1);
            this.ai = var1.e(this.a, var2, var3, var4 + 1);
            this.ac = var1.e(this.a, var2, var3 + 1, var4);
            if (!this.aJ && !this.aH) {
               this.A = this.M;
               this.U = this.ag;
            } else {
               this.A = var1.f(this.a, var2, var3 - 1, var4 - 1);
               this.U = var1.e(this.a, var2, var3 - 1, var4 - 1);
            }

            if (!this.aJ && !this.aF) {
               this.C = this.O;
               this.W = this.ai;
            } else {
               this.C = var1.f(this.a, var2, var3 - 1, var4 + 1);
               this.W = var1.e(this.a, var2, var3 - 1, var4 + 1);
            }

            if (!this.aB && !this.aH) {
               this.H = this.M;
               this.ab = this.ag;
            } else {
               this.H = var1.f(this.a, var2, var3 + 1, var4 - 1);
               this.ab = var1.e(this.a, var2, var3 + 1, var4 - 1);
            }

            if (!this.aB && !this.aF) {
               this.K = this.O;
               this.ae = this.ai;
            } else {
               this.K = var1.f(this.a, var2, var3 + 1, var4 + 1);
               this.ae = var1.e(this.a, var2, var3 + 1, var4 + 1);
            }

            if (var1.bU >= (double)1.0F) {
               --var2;
            }

            var9 = (this.B + this.C + this.s + this.O) / 4.0F;
            var12 = (this.s + this.O + this.I + this.K) / 4.0F;
            var11 = (this.M + this.s + this.H + this.I) / 4.0F;
            var10 = (this.A + this.B + this.M + this.s) / 4.0F;
            this.ak = this.c(this.V, this.W, this.ai, var23);
            this.an = this.c(this.ai, this.ac, this.ae, var23);
            this.am = this.c(this.ag, this.ab, this.ac, var23);
            this.al = this.c(this.U, this.V, this.ag, var23);
         } else {
            var9 = var10 = var11 = var12 = this.s;
            this.ak = this.al = this.am = this.an = var23;
         }

         this.ao = this.ap = this.aq = this.ar = (var18 ? var5 : 1.0F) * 0.6F;
         this.as = this.at = this.au = this.av = (var18 ? var6 : 1.0F) * 0.6F;
         this.aw = this.ax = this.ay = this.az = (var18 ? var7 : 1.0F) * 0.6F;
         this.ao *= var9;
         this.as *= var9;
         this.aw *= var9;
         this.ap *= var10;
         this.at *= var10;
         this.ax *= var10;
         this.aq *= var11;
         this.au *= var11;
         this.ay *= var11;
         this.ar *= var12;
         this.av *= var12;
         this.az *= var12;
         int var54 = var1.a((kq)this.a, var2, var3, var4, 5);
         this.f(var1, (double)var2, (double)var3, (double)var4, var54);
         if (b && var54 == 3 && this.e < 0) {
            this.ao *= var5;
            this.ap *= var5;
            this.aq *= var5;
            this.ar *= var5;
            this.as *= var6;
            this.at *= var6;
            this.au *= var6;
            this.av *= var6;
            this.aw *= var7;
            this.ax *= var7;
            this.ay *= var7;
            this.az *= var7;
            this.f(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      this.n = false;
      return var8;
   }

   private int c(int var1, int var2, int var3, int var4) {
      if (var1 == 0) {
         var1 = var4;
      }

      if (var2 == 0) {
         var2 = var4;
      }

      if (var3 == 0) {
         var3 = var4;
      }

      return var1 + var2 + var3 + var4 >> 2 & 16711935;
   }

   public boolean b(yy var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      this.n = false;
      cv var8 = cv.a;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var11 * var5;
      float var15 = var11 * var6;
      float var16 = var11 * var7;
      float var17 = var10;
      float var18 = var12;
      float var19 = var13;
      float var20 = var10;
      float var21 = var12;
      float var22 = var13;
      float var23 = var10;
      float var24 = var12;
      float var25 = var13;
      if (var1 != yy.u) {
         var17 = var10 * var5;
         var18 = var12 * var5;
         var19 = var13 * var5;
         var20 = var10 * var6;
         var21 = var12 * var6;
         var22 = var13 * var6;
         var23 = var10 * var7;
         var24 = var12 * var7;
         var25 = var13 * var7;
      }

      int var26 = var1.e(this.a, var2, var3, var4);
      if (this.g || var1.a_(this.a, var2, var3 - 1, var4, 0)) {
         var8.b(var1.bS > (double)0.0F ? var26 : var1.e(this.a, var2, var3 - 1, var4));
         var8.a(var17, var20, var23);
         this.a(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 0));
         var9 = true;
      }

      if (this.g || var1.a_(this.a, var2, var3 + 1, var4, 1)) {
         var8.b(var1.bV < (double)1.0F ? var26 : var1.e(this.a, var2, var3 + 1, var4));
         var8.a(var14, var15, var16);
         this.b(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 1));
         var9 = true;
      }

      if (this.g || var1.a_(this.a, var2, var3, var4 - 1, 2)) {
         var8.b(var1.bT > (double)0.0F ? var26 : var1.e(this.a, var2, var3, var4 - 1));
         var8.a(var18, var21, var24);
         int var28 = var1.a((kq)this.a, var2, var3, var4, 2);
         this.c(var1, (double)var2, (double)var3, (double)var4, var28);
         if (b && var28 == 3 && this.e < 0) {
            var8.a(var18 * var5, var21 * var6, var24 * var7);
            this.c(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      if (this.g || var1.a_(this.a, var2, var3, var4 + 1, 3)) {
         var8.b(var1.bW < (double)1.0F ? var26 : var1.e(this.a, var2, var3, var4 + 1));
         var8.a(var18, var21, var24);
         int var29 = var1.a((kq)this.a, var2, var3, var4, 3);
         this.d(var1, (double)var2, (double)var3, (double)var4, var29);
         if (b && var29 == 3 && this.e < 0) {
            var8.a(var18 * var5, var21 * var6, var24 * var7);
            this.d(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      if (this.g || var1.a_(this.a, var2 - 1, var3, var4, 4)) {
         var8.b(var1.bR > (double)0.0F ? var26 : var1.e(this.a, var2 - 1, var3, var4));
         var8.a(var19, var22, var25);
         int var30 = var1.a((kq)this.a, var2, var3, var4, 4);
         this.e(var1, (double)var2, (double)var3, (double)var4, var30);
         if (b && var30 == 3 && this.e < 0) {
            var8.a(var19 * var5, var22 * var6, var25 * var7);
            this.e(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      if (this.g || var1.a_(this.a, var2 + 1, var3, var4, 5)) {
         var8.b(var1.bU < (double)1.0F ? var26 : var1.e(this.a, var2 + 1, var3, var4));
         var8.a(var19, var22, var25);
         int var31 = var1.a((kq)this.a, var2, var3, var4, 5);
         this.f(var1, (double)var2, (double)var3, (double)var4, var31);
         if (b && var31 == 3 && this.e < 0) {
            var8.a(var19 * var5, var22 * var6, var25 * var7);
            this.f(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      return var9;
   }

   public boolean p(yy var1, int var2, int var3, int var4) {
      int var5 = var1.a(this.a, var2, var3, var4);
      float var6 = (float)(var5 >> 16 & 255) / 255.0F;
      float var7 = (float)(var5 >> 8 & 255) / 255.0F;
      float var8 = (float)(var5 & 255) / 255.0F;
      if (adt.a) {
         float var9 = (var6 * 30.0F + var7 * 59.0F + var8 * 11.0F) / 100.0F;
         float var10 = (var6 * 30.0F + var7 * 70.0F) / 100.0F;
         float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
         var6 = var9;
         var7 = var10;
         var8 = var11;
      }

      return this.c(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean c(yy var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      cv var8 = cv.a;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var10 * var5;
      float var15 = var11 * var5;
      float var16 = var12 * var5;
      float var17 = var13 * var5;
      float var18 = var10 * var6;
      float var19 = var11 * var6;
      float var20 = var12 * var6;
      float var21 = var13 * var6;
      float var22 = var10 * var7;
      float var23 = var11 * var7;
      float var24 = var12 * var7;
      float var25 = var13 * var7;
      float var26 = 0.0625F;
      int var28 = var1.e(this.a, var2, var3, var4);
      if (this.g || var1.a_(this.a, var2, var3 - 1, var4, 0)) {
         var8.b(var1.bS > (double)0.0F ? var28 : var1.e(this.a, var2, var3 - 1, var4));
         var8.a(var14, var18, var22);
         this.a(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 0));
         var9 = true;
      }

      if (this.g || var1.a_(this.a, var2, var3 + 1, var4, 1)) {
         var8.b(var1.bV < (double)1.0F ? var28 : var1.e(this.a, var2, var3 + 1, var4));
         var8.a(var15, var19, var23);
         this.b(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 1));
         var9 = true;
      }

      if (this.g || var1.a_(this.a, var2, var3, var4 - 1, 2)) {
         var8.b(var1.bT > (double)0.0F ? var28 : var1.e(this.a, var2, var3, var4 - 1));
         var8.a(var16, var20, var24);
         var8.c(0.0F, 0.0F, var26);
         this.c(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 2));
         var8.c(0.0F, 0.0F, -var26);
         var9 = true;
      }

      if (this.g || var1.a_(this.a, var2, var3, var4 + 1, 3)) {
         var8.b(var1.bW < (double)1.0F ? var28 : var1.e(this.a, var2, var3, var4 + 1));
         var8.a(var16, var20, var24);
         var8.c(0.0F, 0.0F, -var26);
         this.d(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 3));
         var8.c(0.0F, 0.0F, var26);
         var9 = true;
      }

      if (this.g || var1.a_(this.a, var2 - 1, var3, var4, 4)) {
         var8.b(var1.bR > (double)0.0F ? var28 : var1.e(this.a, var2 - 1, var3, var4));
         var8.a(var17, var21, var25);
         var8.c(var26, 0.0F, 0.0F);
         this.e(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 4));
         var8.c(-var26, 0.0F, 0.0F);
         var9 = true;
      }

      if (this.g || var1.a_(this.a, var2 + 1, var3, var4, 5)) {
         var8.b(var1.bU < (double)1.0F ? var28 : var1.e(this.a, var2 + 1, var3, var4));
         var8.a(var17, var21, var25);
         var8.c(-var26, 0.0F, 0.0F);
         this.f(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 5));
         var8.c(var26, 0.0F, 0.0F);
         var9 = true;
      }

      return var9;
   }

   public boolean a(nz var1, int var2, int var3, int var4) {
      boolean var5 = false;
      float var6 = 0.375F;
      float var7 = 0.625F;
      var1.a(var6, 0.0F, var6, var7, 1.0F, var7);
      this.o(var1, var2, var3, var4);
      var5 = true;
      boolean var8 = false;
      boolean var9 = false;
      if (var1.c(this.a, var2 - 1, var3, var4) || var1.c(this.a, var2 + 1, var3, var4)) {
         var8 = true;
      }

      if (var1.c(this.a, var2, var3, var4 - 1) || var1.c(this.a, var2, var3, var4 + 1)) {
         var9 = true;
      }

      boolean var10 = var1.c(this.a, var2 - 1, var3, var4);
      boolean var11 = var1.c(this.a, var2 + 1, var3, var4);
      boolean var12 = var1.c(this.a, var2, var3, var4 - 1);
      boolean var13 = var1.c(this.a, var2, var3, var4 + 1);
      if (!var8 && !var9) {
         var8 = true;
      }

      var6 = 0.4375F;
      var7 = 0.5625F;
      float var14 = 0.75F;
      float var15 = 0.9375F;
      float var16 = var10 ? 0.0F : var6;
      float var17 = var11 ? 1.0F : var7;
      float var18 = var12 ? 0.0F : var6;
      float var19 = var13 ? 1.0F : var7;
      if (var8) {
         var1.a(var16, var14, var6, var17, var15, var7);
         this.o(var1, var2, var3, var4);
         var5 = true;
      }

      if (var9) {
         var1.a(var6, var14, var18, var7, var15, var19);
         this.o(var1, var2, var3, var4);
         var5 = true;
      }

      var14 = 0.375F;
      var15 = 0.5625F;
      if (var8) {
         var1.a(var16, var14, var6, var17, var15, var7);
         this.o(var1, var2, var3, var4);
         var5 = true;
      }

      if (var9) {
         var1.a(var6, var14, var18, var7, var15, var19);
         this.o(var1, var2, var3, var4);
         var5 = true;
      }

      var1.b(this.a, var2, var3, var4);
      return var5;
   }

   public boolean a(aci var1, int var2, int var3, int var4) {
      boolean var5 = false;
      int var6 = 0;

      for(int var7 = 0; var7 < 8; ++var7) {
         byte var8 = 0;
         byte var9 = 1;
         if (var7 == 0) {
            var8 = 2;
         }

         if (var7 == 1) {
            var8 = 3;
         }

         if (var7 == 2) {
            var8 = 4;
         }

         if (var7 == 3) {
            var8 = 5;
            var9 = 2;
         }

         if (var7 == 4) {
            var8 = 6;
            var9 = 3;
         }

         if (var7 == 5) {
            var8 = 7;
            var9 = 5;
         }

         if (var7 == 6) {
            var8 = 6;
            var9 = 2;
         }

         if (var7 == 7) {
            var8 = 3;
         }

         float var10 = (float)var8 / 16.0F;
         float var11 = 1.0F - (float)var6 / 16.0F;
         float var12 = 1.0F - (float)(var6 + var9) / 16.0F;
         var6 += var9;
         var1.a(0.5F - var10, var12, 0.5F - var10, 0.5F + var10, var11, 0.5F + var10);
         this.o(var1, var2, var3, var4);
      }

      var5 = true;
      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return var5;
   }

   public boolean a(fp var1, int var2, int var3, int var4) {
      boolean var5 = true;
      int var6 = this.a.d(var2, var3, var4);
      boolean var7 = fp.b_(var6);
      int var8 = fp.d(var6);
      if (var8 != 3 && var8 != 1) {
         float var19 = 0.0F;
         float var26 = 0.125F;
         float var34 = 0.4375F;
         float var41 = 0.5625F;
         var1.a(var19, 0.3125F, var34, var26, 1.0F, var41);
         this.o(var1, var2, var3, var4);
         var19 = 0.875F;
         var26 = 1.0F;
         var1.a(var19, 0.3125F, var34, var26, 1.0F, var41);
         this.o(var1, var2, var3, var4);
      } else {
         float var15 = 0.4375F;
         float var16 = 0.5625F;
         float var17 = 0.0F;
         float var18 = 0.125F;
         var1.a(var15, 0.3125F, var17, var16, 1.0F, var18);
         this.o(var1, var2, var3, var4);
         var17 = 0.875F;
         var18 = 1.0F;
         var1.a(var15, 0.3125F, var17, var16, 1.0F, var18);
         this.o(var1, var2, var3, var4);
      }

      if (!var7) {
         if (var8 != 3 && var8 != 1) {
            float var22 = 0.375F;
            float var29 = 0.5F;
            float var39 = 0.4375F;
            float var46 = 0.5625F;
            var1.a(var22, 0.375F, var39, var29, 0.9375F, var46);
            this.o(var1, var2, var3, var4);
            var22 = 0.5F;
            var29 = 0.625F;
            var1.a(var22, 0.375F, var39, var29, 0.9375F, var46);
            this.o(var1, var2, var3, var4);
            var22 = 0.625F;
            var29 = 0.875F;
            var1.a(var22, 0.375F, var39, var29, 0.5625F, var46);
            this.o(var1, var2, var3, var4);
            var1.a(var22, 0.75F, var39, var29, 0.9375F, var46);
            this.o(var1, var2, var3, var4);
            var22 = 0.125F;
            var29 = 0.375F;
            var1.a(var22, 0.375F, var39, var29, 0.5625F, var46);
            this.o(var1, var2, var3, var4);
            var1.a(var22, 0.75F, var39, var29, 0.9375F, var46);
            this.o(var1, var2, var3, var4);
         } else {
            float var21 = 0.4375F;
            float var28 = 0.5625F;
            float var35 = 0.375F;
            float var42 = 0.5F;
            var1.a(var21, 0.375F, var35, var28, 0.9375F, var42);
            this.o(var1, var2, var3, var4);
            var35 = 0.5F;
            var42 = 0.625F;
            var1.a(var21, 0.375F, var35, var28, 0.9375F, var42);
            this.o(var1, var2, var3, var4);
            var35 = 0.625F;
            var42 = 0.875F;
            var1.a(var21, 0.375F, var35, var28, 0.5625F, var42);
            this.o(var1, var2, var3, var4);
            var1.a(var21, 0.75F, var35, var28, 0.9375F, var42);
            this.o(var1, var2, var3, var4);
            var35 = 0.125F;
            var42 = 0.375F;
            var1.a(var21, 0.375F, var35, var28, 0.5625F, var42);
            this.o(var1, var2, var3, var4);
            var1.a(var21, 0.75F, var35, var28, 0.9375F, var42);
            this.o(var1, var2, var3, var4);
         }
      } else if (var8 == 3) {
         var1.a(0.8125F, 0.375F, 0.0F, 0.9375F, 0.9375F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.8125F, 0.375F, 0.875F, 0.9375F, 0.9375F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.a(0.5625F, 0.375F, 0.0F, 0.8125F, 0.5625F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.5625F, 0.375F, 0.875F, 0.8125F, 0.5625F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.a(0.5625F, 0.75F, 0.0F, 0.8125F, 0.9375F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.5625F, 0.75F, 0.875F, 0.8125F, 0.9375F, 1.0F);
         this.o(var1, var2, var3, var4);
      } else if (var8 == 1) {
         var1.a(0.0625F, 0.375F, 0.0F, 0.1875F, 0.9375F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0625F, 0.375F, 0.875F, 0.1875F, 0.9375F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.a(0.1875F, 0.375F, 0.0F, 0.4375F, 0.5625F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.1875F, 0.375F, 0.875F, 0.4375F, 0.5625F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.a(0.1875F, 0.75F, 0.0F, 0.4375F, 0.9375F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.1875F, 0.75F, 0.875F, 0.4375F, 0.9375F, 1.0F);
         this.o(var1, var2, var3, var4);
      } else if (var8 == 0) {
         var1.a(0.0F, 0.375F, 0.8125F, 0.125F, 0.9375F, 0.9375F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.375F, 0.8125F, 1.0F, 0.9375F, 0.9375F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0F, 0.375F, 0.5625F, 0.125F, 0.5625F, 0.8125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.375F, 0.5625F, 1.0F, 0.5625F, 0.8125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0F, 0.75F, 0.5625F, 0.125F, 0.9375F, 0.8125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.75F, 0.5625F, 1.0F, 0.9375F, 0.8125F);
         this.o(var1, var2, var3, var4);
      } else if (var8 == 2) {
         var1.a(0.0F, 0.375F, 0.0625F, 0.125F, 0.9375F, 0.1875F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.375F, 0.0625F, 1.0F, 0.9375F, 0.1875F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0F, 0.375F, 0.1875F, 0.125F, 0.5625F, 0.4375F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.375F, 0.1875F, 1.0F, 0.5625F, 0.4375F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0F, 0.75F, 0.1875F, 0.125F, 0.9375F, 0.4375F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.75F, 0.1875F, 1.0F, 0.9375F, 0.4375F);
         this.o(var1, var2, var3, var4);
      }

      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return var5;
   }

   public boolean q(yy var1, int var2, int var3, int var4) {
      boolean var5 = false;
      int var6 = this.a.d(var2, var3, var4);
      if (var6 == 0) {
         var1.a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         this.o(var1, var2, var3, var4);
         var5 = true;
      } else if (var6 == 1) {
         var1.a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         this.o(var1, var2, var3, var4);
         var5 = true;
      } else if (var6 == 2) {
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
         this.o(var1, var2, var3, var4);
         var5 = true;
      } else if (var6 == 3) {
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
         this.o(var1, var2, var3, var4);
         var5 = true;
      }

      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return var5;
   }

   public boolean r(yy var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      uc var6 = (uc)var1;
      boolean var7 = false;
      float var8 = 0.5F;
      float var9 = 1.0F;
      float var10 = 0.8F;
      float var11 = 0.6F;
      int var12 = var1.e(this.a, var2, var3, var4);
      var5.b(var1.bS > (double)0.0F ? var12 : var1.e(this.a, var2, var3 - 1, var4));
      var5.a(var8, var8, var8);
      this.a(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 0));
      var7 = true;
      var5.b(var1.bV < (double)1.0F ? var12 : var1.e(this.a, var2, var3 + 1, var4));
      var5.a(var9, var9, var9);
      this.b(var1, (double)var2, (double)var3, (double)var4, var1.a((kq)this.a, var2, var3, var4, 1));
      var7 = true;
      var5.b(var1.bT > (double)0.0F ? var12 : var1.e(this.a, var2, var3, var4 - 1));
      var5.a(var10, var10, var10);
      int var14 = var1.a((kq)this.a, var2, var3, var4, 2);
      if (var14 < 0) {
         this.f = true;
         var14 = -var14;
      }

      this.c(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.f = false;
      var5.b(var1.bW < (double)1.0F ? var12 : var1.e(this.a, var2, var3, var4 + 1));
      var5.a(var10, var10, var10);
      var14 = var1.a((kq)this.a, var2, var3, var4, 3);
      if (var14 < 0) {
         this.f = true;
         var14 = -var14;
      }

      this.d(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.f = false;
      var5.b(var1.bR > (double)0.0F ? var12 : var1.e(this.a, var2 - 1, var3, var4));
      var5.a(var11, var11, var11);
      var14 = var1.a((kq)this.a, var2, var3, var4, 4);
      if (var14 < 0) {
         this.f = true;
         var14 = -var14;
      }

      this.e(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.f = false;
      var5.b(var1.bU < (double)1.0F ? var12 : var1.e(this.a, var2 + 1, var3, var4));
      var5.a(var11, var11, var11);
      var14 = var1.a((kq)this.a, var2, var3, var4, 5);
      if (var14 < 0) {
         this.f = true;
         var14 = -var14;
      }

      this.f(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.f = false;
      return var7;
   }

   public void a(yy var1, double var2, double var4, double var6, int var8) {
      cv var9 = cv.a;
      if (this.e >= 0) {
         var8 = this.e;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bR * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bU * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)var11 + var1.bT * (double)16.0F) / (double)256.0F;
      double var18 = ((double)var11 + var1.bW * (double)16.0F - 0.01) / (double)256.0F;
      if (var1.bR < (double)0.0F || var1.bU > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bT < (double)0.0F || var1.bW > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if (this.m == 2) {
         var12 = ((double)var10 + var1.bT * (double)16.0F) / (double)256.0F;
         var16 = ((double)(var11 + 16) - var1.bU * (double)16.0F) / (double)256.0F;
         var14 = ((double)var10 + var1.bW * (double)16.0F) / (double)256.0F;
         var18 = ((double)(var11 + 16) - var1.bR * (double)16.0F) / (double)256.0F;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if (this.m == 1) {
         var12 = ((double)(var10 + 16) - var1.bW * (double)16.0F) / (double)256.0F;
         var16 = ((double)var11 + var1.bR * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bT * (double)16.0F) / (double)256.0F;
         var18 = ((double)var11 + var1.bU * (double)16.0F) / (double)256.0F;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if (this.m == 3) {
         var12 = ((double)(var10 + 16) - var1.bR * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bU * (double)16.0F - 0.01) / (double)256.0F;
         var16 = ((double)(var11 + 16) - var1.bT * (double)16.0F) / (double)256.0F;
         var18 = ((double)(var11 + 16) - var1.bW * (double)16.0F - 0.01) / (double)256.0F;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bR;
      double var30 = var2 + var1.bU;
      double var32 = var4 + var1.bS;
      double var34 = var6 + var1.bT;
      double var36 = var6 + var1.bW;
      if (this.n) {
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var28, var32, var36, var22, var26);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var30, var32, var34, var20, var24);
         var9.a(this.ar, this.av, this.az);
         var9.b(this.an);
         var9.a(var30, var32, var36, var14, var18);
      } else {
         var9.a(var28, var32, var36, var22, var26);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(var30, var32, var34, var20, var24);
         var9.a(var30, var32, var36, var14, var18);
      }

   }

   public void b(yy var1, double var2, double var4, double var6, int var8) {
      cv var9 = cv.a;
      if (this.e >= 0) {
         var8 = this.e;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bR * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bU * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)var11 + var1.bT * (double)16.0F) / (double)256.0F;
      double var18 = ((double)var11 + var1.bW * (double)16.0F - 0.01) / (double)256.0F;
      if (var1.bR < (double)0.0F || var1.bU > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bT < (double)0.0F || var1.bW > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if (this.l == 1) {
         var12 = ((double)var10 + var1.bT * (double)16.0F) / (double)256.0F;
         var16 = ((double)(var11 + 16) - var1.bU * (double)16.0F) / (double)256.0F;
         var14 = ((double)var10 + var1.bW * (double)16.0F) / (double)256.0F;
         var18 = ((double)(var11 + 16) - var1.bR * (double)16.0F) / (double)256.0F;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if (this.l == 2) {
         var12 = ((double)(var10 + 16) - var1.bW * (double)16.0F) / (double)256.0F;
         var16 = ((double)var11 + var1.bR * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bT * (double)16.0F) / (double)256.0F;
         var18 = ((double)var11 + var1.bU * (double)16.0F) / (double)256.0F;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if (this.l == 3) {
         var12 = ((double)(var10 + 16) - var1.bR * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bU * (double)16.0F - 0.01) / (double)256.0F;
         var16 = ((double)(var11 + 16) - var1.bT * (double)16.0F) / (double)256.0F;
         var18 = ((double)(var11 + 16) - var1.bW * (double)16.0F - 0.01) / (double)256.0F;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bR;
      double var30 = var2 + var1.bU;
      double var32 = var4 + var1.bV;
      double var34 = var6 + var1.bT;
      double var36 = var6 + var1.bW;
      if (this.n) {
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var30, var32, var36, var14, var18);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var30, var32, var34, var20, var24);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(this.ar, this.av, this.az);
         var9.b(this.an);
         var9.a(var28, var32, var36, var22, var26);
      } else {
         var9.a(var30, var32, var36, var14, var18);
         var9.a(var30, var32, var34, var20, var24);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(var28, var32, var36, var22, var26);
      }

   }

   public void c(yy var1, double var2, double var4, double var6, int var8) {
      cv var9 = cv.a;
      if (this.e >= 0) {
         var8 = this.e;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bR * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bU * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)(var11 + 16) - var1.bV * (double)16.0F) / (double)256.0F;
      double var18 = ((double)(var11 + 16) - var1.bS * (double)16.0F - 0.01) / (double)256.0F;
      if (this.f) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bR < (double)0.0F || var1.bU > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bS < (double)0.0F || var1.bV > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var42 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if (this.h == 2) {
         var12 = ((double)var10 + var1.bS * (double)16.0F) / (double)256.0F;
         var16 = ((double)(var11 + 16) - var1.bR * (double)16.0F) / (double)256.0F;
         var14 = ((double)var10 + var1.bV * (double)16.0F) / (double)256.0F;
         var18 = ((double)(var11 + 16) - var1.bU * (double)16.0F) / (double)256.0F;
         var24 = var16;
         var26 = var18;
         var42 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if (this.h == 1) {
         var12 = ((double)(var10 + 16) - var1.bV * (double)16.0F) / (double)256.0F;
         var16 = ((double)var11 + var1.bU * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bS * (double)16.0F) / (double)256.0F;
         var18 = ((double)var11 + var1.bR * (double)16.0F) / (double)256.0F;
         var42 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if (this.h == 3) {
         var12 = ((double)(var10 + 16) - var1.bR * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bU * (double)16.0F - 0.01) / (double)256.0F;
         var16 = ((double)var11 + var1.bV * (double)16.0F) / (double)256.0F;
         var18 = ((double)var11 + var1.bS * (double)16.0F - 0.01) / (double)256.0F;
         var42 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bR;
      double var30 = var2 + var1.bU;
      double var32 = var4 + var1.bS;
      double var34 = var4 + var1.bV;
      double var36 = var6 + var1.bT;
      if (this.n) {
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var28, var34, var36, var42, var24);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var30, var34, var36, var12, var16);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var30, var32, var36, var22, var26);
         var9.a(this.ar, this.av, this.az);
         var9.b(this.an);
         var9.a(var28, var32, var36, var14, var18);
      } else {
         var9.a(var28, var34, var36, var42, var24);
         var9.a(var30, var34, var36, var12, var16);
         var9.a(var30, var32, var36, var22, var26);
         var9.a(var28, var32, var36, var14, var18);
      }

   }

   public void d(yy var1, double var2, double var4, double var6, int var8) {
      cv var9 = cv.a;
      if (this.e >= 0) {
         var8 = this.e;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bR * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bU * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)(var11 + 16) - var1.bV * (double)16.0F) / (double)256.0F;
      double var18 = ((double)(var11 + 16) - var1.bS * (double)16.0F - 0.01) / (double)256.0F;
      if (this.f) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bR < (double)0.0F || var1.bU > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bS < (double)0.0F || var1.bV > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var42 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if (this.i == 1) {
         var12 = ((double)var10 + var1.bS * (double)16.0F) / (double)256.0F;
         var18 = ((double)(var11 + 16) - var1.bR * (double)16.0F) / (double)256.0F;
         var14 = ((double)var10 + var1.bV * (double)16.0F) / (double)256.0F;
         var16 = ((double)(var11 + 16) - var1.bU * (double)16.0F) / (double)256.0F;
         var24 = var16;
         var26 = var18;
         var42 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if (this.i == 2) {
         var12 = ((double)(var10 + 16) - var1.bV * (double)16.0F) / (double)256.0F;
         var16 = ((double)var11 + var1.bR * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bS * (double)16.0F) / (double)256.0F;
         var18 = ((double)var11 + var1.bU * (double)16.0F) / (double)256.0F;
         var42 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if (this.i == 3) {
         var12 = ((double)(var10 + 16) - var1.bR * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bU * (double)16.0F - 0.01) / (double)256.0F;
         var16 = ((double)var11 + var1.bV * (double)16.0F) / (double)256.0F;
         var18 = ((double)var11 + var1.bS * (double)16.0F - 0.01) / (double)256.0F;
         var42 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bR;
      double var30 = var2 + var1.bU;
      double var32 = var4 + var1.bS;
      double var34 = var4 + var1.bV;
      double var36 = var6 + var1.bW;
      if (this.n) {
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var28, var34, var36, var12, var16);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var28, var32, var36, var22, var26);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var30, var32, var36, var14, var18);
         var9.a(this.ar, this.av, this.az);
         var9.b(this.an);
         var9.a(var30, var34, var36, var42, var24);
      } else {
         var9.a(var28, var34, var36, var12, var16);
         var9.a(var28, var32, var36, var22, var26);
         var9.a(var30, var32, var36, var14, var18);
         var9.a(var30, var34, var36, var42, var24);
      }

   }

   public void e(yy var1, double var2, double var4, double var6, int var8) {
      cv var9 = cv.a;
      if (this.e >= 0) {
         var8 = this.e;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bT * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bW * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)(var11 + 16) - var1.bV * (double)16.0F) / (double)256.0F;
      double var18 = ((double)(var11 + 16) - var1.bS * (double)16.0F - 0.01) / (double)256.0F;
      if (this.f) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bT < (double)0.0F || var1.bW > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bS < (double)0.0F || var1.bV > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var42 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if (this.k == 1) {
         var12 = ((double)var10 + var1.bS * (double)16.0F) / (double)256.0F;
         var16 = ((double)(var11 + 16) - var1.bW * (double)16.0F) / (double)256.0F;
         var14 = ((double)var10 + var1.bV * (double)16.0F) / (double)256.0F;
         var18 = ((double)(var11 + 16) - var1.bT * (double)16.0F) / (double)256.0F;
         var24 = var16;
         var26 = var18;
         var42 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if (this.k == 2) {
         var12 = ((double)(var10 + 16) - var1.bV * (double)16.0F) / (double)256.0F;
         var16 = ((double)var11 + var1.bT * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bS * (double)16.0F) / (double)256.0F;
         var18 = ((double)var11 + var1.bW * (double)16.0F) / (double)256.0F;
         var42 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if (this.k == 3) {
         var12 = ((double)(var10 + 16) - var1.bT * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bW * (double)16.0F - 0.01) / (double)256.0F;
         var16 = ((double)var11 + var1.bV * (double)16.0F) / (double)256.0F;
         var18 = ((double)var11 + var1.bS * (double)16.0F - 0.01) / (double)256.0F;
         var42 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bR;
      double var30 = var4 + var1.bS;
      double var32 = var4 + var1.bV;
      double var34 = var6 + var1.bT;
      double var36 = var6 + var1.bW;
      if (this.n) {
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var28, var32, var36, var42, var24);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var28, var30, var34, var22, var26);
         var9.a(this.ar, this.av, this.az);
         var9.b(this.an);
         var9.a(var28, var30, var36, var14, var18);
      } else {
         var9.a(var28, var32, var36, var42, var24);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(var28, var30, var34, var22, var26);
         var9.a(var28, var30, var36, var14, var18);
      }

   }

   public void f(yy var1, double var2, double var4, double var6, int var8) {
      cv var9 = cv.a;
      if (this.e >= 0) {
         var8 = this.e;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bT * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bW * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)(var11 + 16) - var1.bV * (double)16.0F) / (double)256.0F;
      double var18 = ((double)(var11 + 16) - var1.bS * (double)16.0F - 0.01) / (double)256.0F;
      if (this.f) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bT < (double)0.0F || var1.bW > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bS < (double)0.0F || var1.bV > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var42 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if (this.j == 2) {
         var12 = ((double)var10 + var1.bS * (double)16.0F) / (double)256.0F;
         var16 = ((double)(var11 + 16) - var1.bT * (double)16.0F) / (double)256.0F;
         var14 = ((double)var10 + var1.bV * (double)16.0F) / (double)256.0F;
         var18 = ((double)(var11 + 16) - var1.bW * (double)16.0F) / (double)256.0F;
         var24 = var16;
         var26 = var18;
         var42 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if (this.j == 1) {
         var12 = ((double)(var10 + 16) - var1.bV * (double)16.0F) / (double)256.0F;
         var16 = ((double)var11 + var1.bW * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bS * (double)16.0F) / (double)256.0F;
         var18 = ((double)var11 + var1.bT * (double)16.0F) / (double)256.0F;
         var42 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if (this.j == 3) {
         var12 = ((double)(var10 + 16) - var1.bT * (double)16.0F) / (double)256.0F;
         var14 = ((double)(var10 + 16) - var1.bW * (double)16.0F - 0.01) / (double)256.0F;
         var16 = ((double)var11 + var1.bV * (double)16.0F) / (double)256.0F;
         var18 = ((double)var11 + var1.bS * (double)16.0F - 0.01) / (double)256.0F;
         var42 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bU;
      double var30 = var4 + var1.bS;
      double var32 = var4 + var1.bV;
      double var34 = var6 + var1.bT;
      double var36 = var6 + var1.bW;
      if (this.n) {
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var28, var30, var36, var22, var26);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var28, var30, var34, var14, var18);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var28, var32, var34, var42, var24);
         var9.a(this.ar, this.av, this.az);
         var9.b(this.an);
         var9.a(var28, var32, var36, var12, var16);
      } else {
         var9.a(var28, var30, var36, var22, var26);
         var9.a(var28, var30, var34, var14, var18);
         var9.a(var28, var32, var34, var42, var24);
         var9.a(var28, var32, var36, var12, var16);
      }

   }

   public void a(yy var1, int var2, float var3) {
      cv var4 = cv.a;
      boolean var5 = var1.bM == yy.u.bM;
      if (this.c) {
         int var6 = var1.c(var2);
         if (var5) {
            var6 = 16777215;
         }

         float var7 = (float)(var6 >> 16 & 255) / 255.0F;
         float var8 = (float)(var6 >> 8 & 255) / 255.0F;
         float var9 = (float)(var6 & 255) / 255.0F;
         GL11.glColor4f(var7 * var3, var8 * var3, var9 * var3, 1.0F);
      }

      int var14 = var1.c();
      if (var14 != 0 && var14 != 16) {
         if (var14 == 1) {
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            this.a(var1, var2, (double)-0.5F, (double)-0.5F, (double)-0.5F);
            var4.a();
         } else if (var14 == 19) {
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            var1.e();
            this.a(var1, var2, var1.bV, (double)-0.5F, (double)-0.5F, (double)-0.5F);
            var4.a();
         } else if (var14 == 23) {
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            var1.e();
            var4.a();
         } else if (var14 == 13) {
            var1.e();
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            float var16 = 0.0625F;
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            this.a(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(0));
            var4.a();
            var4.b();
            var4.b(0.0F, 1.0F, 0.0F);
            this.b(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(1));
            var4.a();
            var4.b();
            var4.b(0.0F, 0.0F, -1.0F);
            var4.c(0.0F, 0.0F, var16);
            this.c(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(2));
            var4.c(0.0F, 0.0F, -var16);
            var4.a();
            var4.b();
            var4.b(0.0F, 0.0F, 1.0F);
            var4.c(0.0F, 0.0F, -var16);
            this.d(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(3));
            var4.c(0.0F, 0.0F, var16);
            var4.a();
            var4.b();
            var4.b(-1.0F, 0.0F, 0.0F);
            var4.c(var16, 0.0F, 0.0F);
            this.e(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(4));
            var4.c(-var16, 0.0F, 0.0F);
            var4.a();
            var4.b();
            var4.b(1.0F, 0.0F, 0.0F);
            var4.c(-var16, 0.0F, 0.0F);
            this.f(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(5));
            var4.c(var16, 0.0F, 0.0F);
            var4.a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         } else if (var14 == 22) {
            acl.a.a(var1, var2, var3);
            GL11.glEnable(32826);
         } else if (var14 == 6) {
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            this.b(var1, var2, (double)-0.5F, (double)-0.5F, (double)-0.5F);
            var4.a();
         } else if (var14 == 2) {
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            this.a(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, (double)0.0F, (double)0.0F);
            var4.a();
         } else if (var14 == 10) {
            for(int var17 = 0; var17 < 2; ++var17) {
               if (var17 == 0) {
                  var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
               }

               if (var17 == 1) {
                  var1.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.b();
               var4.b(0.0F, -1.0F, 0.0F);
               this.a(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(0));
               var4.a();
               var4.b();
               var4.b(0.0F, 1.0F, 0.0F);
               this.b(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(1));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, -1.0F);
               this.c(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(2));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, 1.0F);
               this.d(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(3));
               var4.a();
               var4.b();
               var4.b(-1.0F, 0.0F, 0.0F);
               this.e(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(4));
               var4.a();
               var4.b();
               var4.b(1.0F, 0.0F, 0.0F);
               this.f(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(5));
               var4.a();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }
         } else if (var14 == 27) {
            int var18 = 0;
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var4.b();

            for(int var22 = 0; var22 < 8; ++var22) {
               byte var28 = 0;
               byte var29 = 1;
               if (var22 == 0) {
                  var28 = 2;
               }

               if (var22 == 1) {
                  var28 = 3;
               }

               if (var22 == 2) {
                  var28 = 4;
               }

               if (var22 == 3) {
                  var28 = 5;
                  var29 = 2;
               }

               if (var22 == 4) {
                  var28 = 6;
                  var29 = 3;
               }

               if (var22 == 5) {
                  var28 = 7;
                  var29 = 5;
               }

               if (var22 == 6) {
                  var28 = 6;
                  var29 = 2;
               }

               if (var22 == 7) {
                  var28 = 3;
               }

               float var11 = (float)var28 / 16.0F;
               float var12 = 1.0F - (float)var18 / 16.0F;
               float var13 = 1.0F - (float)(var18 + var29) / 16.0F;
               var18 += var29;
               var1.a(0.5F - var11, var13, 0.5F - var11, 0.5F + var11, var12, 0.5F + var11);
               var4.b(0.0F, -1.0F, 0.0F);
               this.a(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(0));
               var4.b(0.0F, 1.0F, 0.0F);
               this.b(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(1));
               var4.b(0.0F, 0.0F, -1.0F);
               this.c(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(2));
               var4.b(0.0F, 0.0F, 1.0F);
               this.d(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(3));
               var4.b(-1.0F, 0.0F, 0.0F);
               this.e(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(4));
               var4.b(1.0F, 0.0F, 0.0F);
               this.f(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(5));
            }

            var4.a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         } else if (var14 == 11) {
            for(int var19 = 0; var19 < 4; ++var19) {
               float var23 = 0.125F;
               if (var19 == 0) {
                  var1.a(0.5F - var23, 0.0F, 0.0F, 0.5F + var23, 1.0F, var23 * 2.0F);
               }

               if (var19 == 1) {
                  var1.a(0.5F - var23, 0.0F, 1.0F - var23 * 2.0F, 0.5F + var23, 1.0F, 1.0F);
               }

               var23 = 0.0625F;
               if (var19 == 2) {
                  var1.a(0.5F - var23, 1.0F - var23 * 3.0F, -var23 * 2.0F, 0.5F + var23, 1.0F - var23, 1.0F + var23 * 2.0F);
               }

               if (var19 == 3) {
                  var1.a(0.5F - var23, 0.5F - var23 * 3.0F, -var23 * 2.0F, 0.5F + var23, 0.5F - var23, 1.0F + var23 * 2.0F);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.b();
               var4.b(0.0F, -1.0F, 0.0F);
               this.a(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(0));
               var4.a();
               var4.b();
               var4.b(0.0F, 1.0F, 0.0F);
               this.b(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(1));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, -1.0F);
               this.c(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(2));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, 1.0F);
               this.d(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(3));
               var4.a();
               var4.b();
               var4.b(-1.0F, 0.0F, 0.0F);
               this.e(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(4));
               var4.a();
               var4.b();
               var4.b(1.0F, 0.0F, 0.0F);
               this.f(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(5));
               var4.a();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         } else if (var14 == 21) {
            for(int var20 = 0; var20 < 3; ++var20) {
               float var25 = 0.0625F;
               if (var20 == 0) {
                  var1.a(0.5F - var25, 0.3F, 0.0F, 0.5F + var25, 1.0F, var25 * 2.0F);
               }

               if (var20 == 1) {
                  var1.a(0.5F - var25, 0.3F, 1.0F - var25 * 2.0F, 0.5F + var25, 1.0F, 1.0F);
               }

               var25 = 0.0625F;
               if (var20 == 2) {
                  var1.a(0.5F - var25, 0.5F, 0.0F, 0.5F + var25, 1.0F - var25, 1.0F);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.b();
               var4.b(0.0F, -1.0F, 0.0F);
               this.a(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(0));
               var4.a();
               var4.b();
               var4.b(0.0F, 1.0F, 0.0F);
               this.b(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(1));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, -1.0F);
               this.c(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(2));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, 1.0F);
               this.d(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(3));
               var4.a();
               var4.b();
               var4.b(-1.0F, 0.0F, 0.0F);
               this.e(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(4));
               var4.a();
               var4.b();
               var4.b(1.0F, 0.0F, 0.0F);
               this.f(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.b(5));
               var4.a();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }
      } else {
         if (var14 == 16) {
            var2 = 1;
         }

         var1.e();
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         var4.b();
         var4.b(0.0F, -1.0F, 0.0F);
         this.a(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(0, var2));
         var4.a();
         if (var5 && this.c) {
            int var15 = var1.c(var2);
            float var21 = (float)(var15 >> 16 & 255) / 255.0F;
            float var27 = (float)(var15 >> 8 & 255) / 255.0F;
            float var10 = (float)(var15 & 255) / 255.0F;
            GL11.glColor4f(var21 * var3, var27 * var3, var10 * var3, 1.0F);
         }

         var4.b();
         var4.b(0.0F, 1.0F, 0.0F);
         this.b(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(1, var2));
         var4.a();
         if (var5 && this.c) {
            GL11.glColor4f(var3, var3, var3, 1.0F);
         }

         var4.b();
         var4.b(0.0F, 0.0F, -1.0F);
         this.c(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(2, var2));
         var4.a();
         var4.b();
         var4.b(0.0F, 0.0F, 1.0F);
         this.d(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(3, var2));
         var4.a();
         var4.b();
         var4.b(-1.0F, 0.0F, 0.0F);
         this.e(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(4, var2));
         var4.a();
         var4.b();
         var4.b(1.0F, 0.0F, 0.0F);
         this.f(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(5, var2));
         var4.a();
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      }

   }

   public static boolean a(int var0) {
      if (var0 == 0) {
         return true;
      } else if (var0 == 13) {
         return true;
      } else if (var0 == 10) {
         return true;
      } else if (var0 == 11) {
         return true;
      } else if (var0 == 27) {
         return true;
      } else if (var0 == 22) {
         return true;
      } else if (var0 == 21) {
         return true;
      } else {
         return var0 == 16;
      }
   }
}
