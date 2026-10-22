package net.minecraft.client;

import java.util.List;

public class vm extends ia implements de {
   private dk[] d;
   private int e;
   private boolean f;
   public int a;
   public double b;
   public double c;
   private static final int[][][] g = new int[][][]{{{0, 0, -1}, {0, 0, 1}}, {{-1, 0, 0}, {1, 0, 0}}, {{-1, -1, 0}, {1, 0, 0}}, {{-1, 0, 0}, {1, -1, 0}}, {{0, 0, -1}, {0, -1, 1}}, {{0, -1, -1}, {0, 0, 1}}, {{0, 0, 1}, {1, 0, 0}}, {{0, 0, 1}, {-1, 0, 0}}, {{0, 0, -1}, {-1, 0, 0}}, {{0, 0, -1}, {1, 0, 0}}};
   private int h;
   private double i;
   private double aq;
   private double ar;
   private double as;
   private double at;
   private double au;
   private double av;
   private double aw;

   public vm(ry var1) {
      super(var1);
      this.d = new dk[36];
      this.e = 0;
      this.f = false;
      this.l = true;
      this.a(0.98F, 0.7F);
      this.L = this.N / 2.0F;
   }

   protected boolean d_() {
      return false;
   }

   protected void b() {
      this.ag.a(16, new Byte((byte)0));
      this.ag.a(17, new Integer(0));
      this.ag.a(18, new Integer(1));
      this.ag.a(19, new Integer(0));
   }

   public c f(ia var1) {
      return var1.C;
   }

   public c A() {
      return null;
   }

   public boolean H() {
      return true;
   }

   public vm(ry var1, double var2, double var4, double var6, int var8) {
      this(var1);
      this.d(var2, var4 + (double)this.L, var6);
      this.v = (double)0.0F;
      this.w = (double)0.0F;
      this.x = (double)0.0F;
      this.p = var2;
      this.q = var4;
      this.r = var6;
      this.a = var8;
   }

   public double P() {
      return (double)this.N * (double)0.0F - (double)0.3F;
   }

   public boolean a(pm var1, int var2) {
      if (!this.o.I && !this.K) {
         this.h(-this.m());
         this.c(10);
         this.G();
         this.b(this.i() + var2 * 10);
         if (this.i() > 40) {
            if (this.m != null) {
               this.m.g(this);
            }

            this.v();
            this.a(acy.ay.bM, 1, 0.0F);
            if (this.a == 1) {
               vm var3 = this;

               for(int var4 = 0; var4 < var3.c(); ++var4) {
                  dk var5 = var3.d(var4);
                  if (var5 != null) {
                     float var6 = this.Y.nextFloat() * 0.8F + 0.1F;
                     float var7 = this.Y.nextFloat() * 0.8F + 0.1F;
                     float var8 = this.Y.nextFloat() * 0.8F + 0.1F;

                     while(var5.a > 0) {
                        int var9 = this.Y.nextInt(21) + 10;
                        if (var9 > var5.a) {
                           var9 = var5.a;
                        }

                        var5.a -= var9;
                        ih var10 = new ih(this.o, this.s + (double)var6, this.t + (double)var7, this.u + (double)var8, new dk(var5.c, var9, var5.i()));
                        float var11 = 0.05F;
                        var10.v = (double)((float)this.Y.nextGaussian() * var11);
                        var10.w = (double)((float)this.Y.nextGaussian() * var11 + 0.2F);
                        var10.x = (double)((float)this.Y.nextGaussian() * var11);
                        this.o.a((ia)var10);
                     }
                  }
               }

               this.a(yy.au.bM, 1, 0.0F);
            } else if (this.a == 2) {
               this.a(yy.aB.bM, 1, 0.0F);
            }
         }

         return true;
      } else {
         return true;
      }
   }

   public void T() {
      this.h(-this.m());
      this.c(10);
      this.b(this.i() + this.i() * 10);
   }

   public boolean e_() {
      return !this.K;
   }

   public void v() {
      for(int var1 = 0; var1 < this.c(); ++var1) {
         dk var2 = this.d(var1);
         if (var2 != null) {
            float var3 = this.Y.nextFloat() * 0.8F + 0.1F;
            float var4 = this.Y.nextFloat() * 0.8F + 0.1F;
            float var5 = this.Y.nextFloat() * 0.8F + 0.1F;

            while(var2.a > 0) {
               int var6 = this.Y.nextInt(21) + 10;
               if (var6 > var2.a) {
                  var6 = var2.a;
               }

               var2.a -= var6;
               ih var7 = new ih(this.o, this.s + (double)var3, this.t + (double)var4, this.u + (double)var5, new dk(var2.c, var6, var2.i()));
               float var8 = 0.05F;
               var7.v = (double)((float)this.Y.nextGaussian() * var8);
               var7.w = (double)((float)this.Y.nextGaussian() * var8 + 0.2F);
               var7.x = (double)((float)this.Y.nextGaussian() * var8);
               this.o.a((ia)var7);
            }
         }
      }

      super.v();
   }

   public void a() {
      if (this.l() > 0) {
         this.c(this.l() - 1);
      }

      if (this.i() > 0) {
         this.b(this.i() - 1);
      }

      if (this.g() && this.Y.nextInt(4) == 0) {
         this.o.a("largesmoke", this.s, this.t + 0.8, this.u, (double)0.0F, (double)0.0F, (double)0.0F);
      }

      if (this.o.I) {
         if (this.h > 0) {
            double var45 = this.s + (this.i - this.s) / (double)this.h;
            double var46 = this.t + (this.aq - this.t) / (double)this.h;
            double var5 = this.u + (this.ar - this.u) / (double)this.h;

            double var7;
            for(var7 = this.as - (double)this.y; var7 < (double)-180.0F; var7 += (double)360.0F) {
            }

            while(var7 >= (double)180.0F) {
               var7 -= (double)360.0F;
            }

            this.y = (float)((double)this.y + var7 / (double)this.h);
            this.z = (float)((double)this.z + (this.at - (double)this.z) / (double)this.h);
            --this.h;
            this.d(var45, var46, var5);
            this.b(this.y, this.z);
         } else {
            this.d(this.s, this.t, this.u);
            this.b(this.y, this.z);
         }

      } else {
         this.p = this.s;
         this.q = this.t;
         this.r = this.u;
         this.w -= (double)0.04F;
         int var1 = me.c(this.s);
         int var2 = me.c(this.t);
         int var3 = me.c(this.u);
         if (afr.g(this.o, var1, var2 - 1, var3)) {
            --var2;
         }

         double var4 = 0.4;
         double var6 = (double)0.0078125F;
         int var8 = this.o.a(var1, var2, var3);
         if (afr.e(var8)) {
            fb var9 = this.i(this.s, this.t, this.u);
            int var10 = this.o.d(var1, var2, var3);
            this.t = (double)var2;
            boolean var11 = false;
            boolean var12 = false;
            if (var8 == yy.T.bM) {
               var11 = (var10 & 8) != 0;
               var12 = !var11;
            }

            if (((afr)yy.k[var8]).s()) {
               var10 &= 7;
            }

            if (var10 >= 2 && var10 <= 5) {
               this.t = (double)(var2 + 1);
            }

            if (var10 == 2) {
               this.v -= var6;
            }

            if (var10 == 3) {
               this.v += var6;
            }

            if (var10 == 4) {
               this.x += var6;
            }

            if (var10 == 5) {
               this.x -= var6;
            }

            int[][] var13 = g[var10];
            double var14 = (double)(var13[1][0] - var13[0][0]);
            double var16 = (double)(var13[1][2] - var13[0][2]);
            double var18 = Math.sqrt(var14 * var14 + var16 * var16);
            double var20 = this.v * var14 + this.x * var16;
            if (var20 < (double)0.0F) {
               var14 = -var14;
               var16 = -var16;
            }

            double var22 = Math.sqrt(this.v * this.v + this.x * this.x);
            this.v = var22 * var14 / var18;
            this.x = var22 * var16 / var18;
            if (var12) {
               double var24 = Math.sqrt(this.v * this.v + this.x * this.x);
               if (var24 < 0.03) {
                  this.v *= (double)0.0F;
                  this.w *= (double)0.0F;
                  this.x *= (double)0.0F;
               } else {
                  this.v *= (double)0.5F;
                  this.w *= (double)0.0F;
                  this.x *= (double)0.5F;
               }
            }

            double var55 = (double)0.0F;
            double var26 = (double)var1 + (double)0.5F + (double)var13[0][0] * (double)0.5F;
            double var28 = (double)var3 + (double)0.5F + (double)var13[0][2] * (double)0.5F;
            double var30 = (double)var1 + (double)0.5F + (double)var13[1][0] * (double)0.5F;
            double var32 = (double)var3 + (double)0.5F + (double)var13[1][2] * (double)0.5F;
            var14 = var30 - var26;
            var16 = var32 - var28;
            if (var14 == (double)0.0F) {
               this.s = (double)var1 + (double)0.5F;
               var55 = this.u - (double)var3;
            } else if (var16 == (double)0.0F) {
               this.u = (double)var3 + (double)0.5F;
               var55 = this.s - (double)var1;
            } else {
               double var34 = this.s - var26;
               double var36 = this.u - var28;
               double var38 = (var34 * var14 + var36 * var16) * (double)2.0F;
               var55 = var38;
            }

            this.s = var26 + var14 * var55;
            this.u = var28 + var16 * var55;
            this.d(this.s, this.t + (double)this.L, this.u);
            double var57 = this.v;
            double var58 = this.x;
            if (this.m != null) {
               var57 *= (double)0.75F;
               var58 *= (double)0.75F;
            }

            if (var57 < -var4) {
               var57 = -var4;
            }

            if (var57 > var4) {
               var57 = var4;
            }

            if (var58 < -var4) {
               var58 = -var4;
            }

            if (var58 > var4) {
               var58 = var4;
            }

            this.b(var57, (double)0.0F, var58);
            if (var13[0][1] != 0 && me.c(this.s) - var1 == var13[0][0] && me.c(this.u) - var3 == var13[0][2]) {
               this.d(this.s, this.t + (double)var13[0][1], this.u);
            } else if (var13[1][1] != 0 && me.c(this.s) - var1 == var13[1][0] && me.c(this.u) - var3 == var13[1][2]) {
               this.d(this.s, this.t + (double)var13[1][1], this.u);
            }

            if (this.m != null) {
               this.v *= (double)0.997F;
               this.w *= (double)0.0F;
               this.x *= (double)0.997F;
            } else {
               if (this.a == 2) {
                  double var59 = (double)me.a(this.b * this.b + this.c * this.c);
                  if (var59 > 0.01) {
                     this.b /= var59;
                     this.c /= var59;
                     double var40 = 0.04;
                     this.v *= (double)0.8F;
                     this.w *= (double)0.0F;
                     this.x *= (double)0.8F;
                     this.v += this.b * var40;
                     this.x += this.c * var40;
                  } else {
                     this.v *= (double)0.9F;
                     this.w *= (double)0.0F;
                     this.x *= (double)0.9F;
                  }
               }

               this.v *= (double)0.96F;
               this.w *= (double)0.0F;
               this.x *= (double)0.96F;
            }

            fb var60 = this.i(this.s, this.t, this.u);
            if (var60 != null && var9 != null) {
               double var39 = (var9.b - var60.b) * 0.05;
               var22 = Math.sqrt(this.v * this.v + this.x * this.x);
               if (var22 > (double)0.0F) {
                  this.v = this.v / var22 * (var22 + var39);
                  this.x = this.x / var22 * (var22 + var39);
               }

               this.d(this.s, var60.b, this.u);
            }

            int var61 = me.c(this.s);
            int var62 = me.c(this.u);
            if (var61 != var1 || var62 != var3) {
               var22 = Math.sqrt(this.v * this.v + this.x * this.x);
               this.v = var22 * (double)(var61 - var1);
               this.x = var22 * (double)(var62 - var3);
            }

            if (this.a == 2) {
               double var41 = (double)me.a(this.b * this.b + this.c * this.c);
               if (var41 > 0.01 && this.v * this.v + this.x * this.x > 0.001) {
                  this.b /= var41;
                  this.c /= var41;
                  if (this.b * this.v + this.c * this.x < (double)0.0F) {
                     this.b = (double)0.0F;
                     this.c = (double)0.0F;
                  } else {
                     this.b = this.v;
                     this.c = this.x;
                  }
               }
            }

            if (var11) {
               double var63 = Math.sqrt(this.v * this.v + this.x * this.x);
               if (var63 > 0.01) {
                  double var43 = 0.06;
                  this.v += this.v / var63 * var43;
                  this.x += this.x / var63 * var43;
               } else if (var10 == 1) {
                  if (this.o.g(var1 - 1, var2, var3)) {
                     this.v = 0.02;
                  } else if (this.o.g(var1 + 1, var2, var3)) {
                     this.v = -0.02;
                  }
               } else if (var10 == 0) {
                  if (this.o.g(var1, var2, var3 - 1)) {
                     this.x = 0.02;
                  } else if (this.o.g(var1, var2, var3 + 1)) {
                     this.x = -0.02;
                  }
               }
            }
         } else {
            if (this.v < -var4) {
               this.v = -var4;
            }

            if (this.v > var4) {
               this.v = var4;
            }

            if (this.x < -var4) {
               this.x = -var4;
            }

            if (this.x > var4) {
               this.x = var4;
            }

            if (this.D) {
               this.v *= (double)0.5F;
               this.w *= (double)0.5F;
               this.x *= (double)0.5F;
            }

            this.b(this.v, this.w, this.x);
            if (!this.D) {
               this.v *= (double)0.95F;
               this.w *= (double)0.95F;
               this.x *= (double)0.95F;
            }
         }

         this.z = 0.0F;
         double var47 = this.p - this.s;
         double var48 = this.r - this.u;
         if (var47 * var47 + var48 * var48 > 0.001) {
            this.y = (float)(Math.atan2(var48, var47) * (double)180.0F / Math.PI);
            if (this.f) {
               this.y += 180.0F;
            }
         }

         double var49;
         for(var49 = (double)(this.y - this.A); var49 >= (double)180.0F; var49 -= (double)360.0F) {
         }

         while(var49 < (double)-180.0F) {
            var49 += (double)360.0F;
         }

         if (var49 < (double)-170.0F || var49 >= (double)170.0F) {
            this.y += 180.0F;
            this.f = !this.f;
         }

         this.b(this.y, this.z);
         List var15 = this.o.b((ia)this, (c)this.C.b((double)0.2F, (double)0.0F, (double)0.2F));
         if (var15 != null && var15.size() > 0) {
            for(int var52 = 0; var52 < var15.size(); ++var52) {
               ia var17 = (ia)var15.get(var52);
               if (var17 != this.m && var17.H() && var17 instanceof vm) {
                  var17.e((ia)this);
               }
            }
         }

         if (this.m != null && this.m.K) {
            if (this.m.n == this) {
               this.m.n = null;
            }

            this.m = null;
         }

         if (this.e > 0) {
            --this.e;
         }

         if (this.e <= 0) {
            this.b = this.c = (double)0.0F;
         }

         this.b(this.e > 0);
      }
   }

   public fb a(double var1, double var3, double var5, double var7) {
      int var9 = me.c(var1);
      int var10 = me.c(var3);
      int var11 = me.c(var5);
      if (afr.g(this.o, var9, var10 - 1, var11)) {
         --var10;
      }

      int var12 = this.o.a(var9, var10, var11);
      if (!afr.e(var12)) {
         return null;
      } else {
         int var13 = this.o.d(var9, var10, var11);
         if (((afr)yy.k[var12]).s()) {
            var13 &= 7;
         }

         var3 = (double)var10;
         if (var13 >= 2 && var13 <= 5) {
            var3 = (double)(var10 + 1);
         }

         int[][] var14 = g[var13];
         double var15 = (double)(var14[1][0] - var14[0][0]);
         double var17 = (double)(var14[1][2] - var14[0][2]);
         double var19 = Math.sqrt(var15 * var15 + var17 * var17);
         var15 /= var19;
         var17 /= var19;
         var1 += var15 * var7;
         var5 += var17 * var7;
         if (var14[0][1] != 0 && me.c(var1) - var9 == var14[0][0] && me.c(var5) - var11 == var14[0][2]) {
            var3 += (double)var14[0][1];
         } else if (var14[1][1] != 0 && me.c(var1) - var9 == var14[1][0] && me.c(var5) - var11 == var14[1][2]) {
            var3 += (double)var14[1][1];
         }

         return this.i(var1, var3, var5);
      }
   }

   public fb i(double var1, double var3, double var5) {
      int var7 = me.c(var1);
      int var8 = me.c(var3);
      int var9 = me.c(var5);
      if (afr.g(this.o, var7, var8 - 1, var9)) {
         --var8;
      }

      int var10 = this.o.a(var7, var8, var9);
      if (afr.e(var10)) {
         int var11 = this.o.d(var7, var8, var9);
         var3 = (double)var8;
         if (((afr)yy.k[var10]).s()) {
            var11 &= 7;
         }

         if (var11 >= 2 && var11 <= 5) {
            var3 = (double)(var8 + 1);
         }

         int[][] var12 = g[var11];
         double var13 = (double)0.0F;
         double var15 = (double)var7 + (double)0.5F + (double)var12[0][0] * (double)0.5F;
         double var17 = (double)var8 + (double)0.5F + (double)var12[0][1] * (double)0.5F;
         double var19 = (double)var9 + (double)0.5F + (double)var12[0][2] * (double)0.5F;
         double var21 = (double)var7 + (double)0.5F + (double)var12[1][0] * (double)0.5F;
         double var23 = (double)var8 + (double)0.5F + (double)var12[1][1] * (double)0.5F;
         double var25 = (double)var9 + (double)0.5F + (double)var12[1][2] * (double)0.5F;
         double var27 = var21 - var15;
         double var29 = (var23 - var17) * (double)2.0F;
         double var31 = var25 - var19;
         if (var27 == (double)0.0F) {
            var1 = (double)var7 + (double)0.5F;
            var13 = var5 - (double)var9;
         } else if (var31 == (double)0.0F) {
            var5 = (double)var9 + (double)0.5F;
            var13 = var1 - (double)var7;
         } else {
            double var33 = var1 - var15;
            double var35 = var5 - var19;
            double var37 = (var33 * var27 + var35 * var31) * (double)2.0F;
            var13 = var37;
         }

         var1 = var15 + var27 * var13;
         var3 = var17 + var29 * var13;
         var5 = var19 + var31 * var13;
         if (var29 < (double)0.0F) {
            ++var3;
         }

         if (var29 > (double)0.0F) {
            var3 += (double)0.5F;
         }

         return fb.b(var1, var3, var5);
      } else {
         return null;
      }
   }

   protected void a(ik var1) {
      var1.a("Type", this.a);
      if (this.a == 2) {
         var1.a("PushX", this.b);
         var1.a("PushZ", this.c);
         var1.a("Fuel", (short)this.e);
      } else if (this.a == 1) {
         yi var2 = new yi();

         for(int var3 = 0; var3 < this.d.length; ++var3) {
            if (this.d[var3] != null) {
               ik var4 = new ik();
               var4.a("Slot", (byte)var3);
               this.d[var3].b(var4);
               var2.a((um)var4);
            }
         }

         var1.a("Items", (um)var2);
      }

   }

   protected void b(ik var1) {
      this.a = var1.e("Type");
      if (this.a == 2) {
         this.b = var1.h("PushX");
         this.c = var1.h("PushZ");
         this.e = var1.d("Fuel");
      } else if (this.a == 1) {
         yi var2 = var1.l("Items");
         this.d = new dk[this.c()];

         for(int var3 = 0; var3 < var2.c(); ++var3) {
            ik var4 = (ik)var2.a(var3);
            int var5 = var4.c("Slot") & 255;
            if (var5 >= 0 && var5 < this.d.length) {
               this.d[var5] = dk.a(var4);
            }
         }
      }

   }

   public float i_() {
      return 0.0F;
   }

   public void e(ia var1) {
      if (!this.o.I) {
         if (var1 != this.m) {
            if (var1 instanceof nq && !(var1 instanceof vi) && this.a == 0 && this.v * this.v + this.x * this.x > 0.01 && this.m == null && var1.n == null) {
               var1.g(this);
            }

            double var2 = var1.s - this.s;
            double var4 = var1.u - this.u;
            double var6 = var2 * var2 + var4 * var4;
            if (var6 >= (double)1.0E-4F) {
               var6 = (double)me.a(var6);
               var2 /= var6;
               var4 /= var6;
               double var8 = (double)1.0F / var6;
               if (var8 > (double)1.0F) {
                  var8 = (double)1.0F;
               }

               var2 *= var8;
               var4 *= var8;
               var2 *= (double)0.1F;
               var4 *= (double)0.1F;
               var2 *= (double)(1.0F - this.X);
               var4 *= (double)(1.0F - this.X);
               var2 *= (double)0.5F;
               var4 *= (double)0.5F;
               if (var1 instanceof vm) {
                  double var10 = var1.s - this.s;
                  double var12 = var1.u - this.u;
                  fb var14 = fb.b(var10, (double)0.0F, var12).c();
                  fb var15 = fb.b((double)me.b(this.y * (float)Math.PI / 180.0F), (double)0.0F, (double)me.a(this.y * (float)Math.PI / 180.0F)).c();
                  double var16 = Math.abs(var14.b(var15));
                  if (var16 < (double)0.8F) {
                     return;
                  }

                  double var18 = var1.v + this.v;
                  double var20 = var1.x + this.x;
                  if (((vm)var1).a == 2 && this.a != 2) {
                     this.v *= (double)0.2F;
                     this.x *= (double)0.2F;
                     this.h(var1.v - var2, (double)0.0F, var1.x - var4);
                     var1.v *= (double)0.95F;
                     var1.x *= (double)0.95F;
                  } else if (((vm)var1).a != 2 && this.a == 2) {
                     var1.v *= (double)0.2F;
                     var1.x *= (double)0.2F;
                     var1.h(this.v + var2, (double)0.0F, this.x + var4);
                     this.v *= (double)0.95F;
                     this.x *= (double)0.95F;
                  } else {
                     var18 /= (double)2.0F;
                     var20 /= (double)2.0F;
                     this.v *= (double)0.2F;
                     this.x *= (double)0.2F;
                     this.h(var18 - var2, (double)0.0F, var20 - var4);
                     var1.v *= (double)0.2F;
                     var1.x *= (double)0.2F;
                     var1.h(var18 + var2, (double)0.0F, var20 + var4);
                  }
               } else {
                  this.h(-var2, (double)0.0F, -var4);
                  var1.h(var2 / (double)4.0F, (double)0.0F, var4 / (double)4.0F);
               }
            }

         }
      }
   }

   public int c() {
      return 27;
   }

   public dk d(int var1) {
      return this.d[var1];
   }

   public dk a(int var1, int var2) {
      if (this.d[var1] != null) {
         if (this.d[var1].a <= var2) {
            dk var4 = this.d[var1];
            this.d[var1] = null;
            return var4;
         } else {
            dk var3 = this.d[var1].a(var2);
            if (this.d[var1].a == 0) {
               this.d[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, dk var2) {
      this.d[var1] = var2;
      if (var2 != null && var2.a > this.e()) {
         var2.a = this.e();
      }

   }

   public String d() {
      return "Minecart";
   }

   public int e() {
      return 64;
   }

   public void h() {
   }

   public boolean c(vi var1) {
      if (this.a == 0) {
         if (this.m != null && this.m instanceof vi && this.m != var1) {
            return true;
         }

         if (!this.o.I) {
            var1.g(this);
         }
      } else if (this.a == 1) {
         if (!this.o.I) {
            var1.a((de)this);
         }
      } else if (this.a == 2) {
         dk var2 = var1.by.a();
         if (var2 != null && var2.c == acy.l.bM) {
            if (--var2.a == 0) {
               var1.by.a(var1.by.c, (dk)null);
            }

            this.e += 3600;
         }

         this.b = this.s - var1.s;
         this.c = this.u - var1.u;
      }

      return true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.i = var1;
      this.aq = var3;
      this.ar = var5;
      this.as = (double)var7;
      this.at = (double)var8;
      this.h = var9 + 2;
      this.v = this.au;
      this.w = this.av;
      this.x = this.aw;
   }

   public void a(double var1, double var3, double var5) {
      this.au = this.v = var1;
      this.av = this.w = var3;
      this.aw = this.x = var5;
   }

   public boolean b_(vi var1) {
      if (this.K) {
         return false;
      } else {
         return !(var1.d(this) > (double)64.0F);
      }
   }

   protected boolean g() {
      return (this.ag.a(16) & 1) != 0;
   }

   protected void b(boolean var1) {
      if (var1) {
         this.ag.b(16, (byte)(this.ag.a(16) | 1));
      } else {
         this.ag.b(16, (byte)(this.ag.a(16) & -2));
      }

   }

   public void j() {
   }

   public void k() {
   }

   public void b(int var1) {
      this.ag.b(19, var1);
   }

   public int i() {
      return this.ag.c(19);
   }

   public void c(int var1) {
      this.ag.b(17, var1);
   }

   public int l() {
      return this.ag.c(17);
   }

   public void h(int var1) {
      this.ag.b(18, var1);
   }

   public int m() {
      return this.ag.c(18);
   }
}
