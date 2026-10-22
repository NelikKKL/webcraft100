package net.minecraft.client;

import java.util.List;

public class ael extends ia {
   private int d;
   private int e;
   private int f;
   private int g;
   private boolean h;
   public int a;
   public vi b;
   private int i;
   private int aq;
   private int ar;
   public ia c;
   private int as;
   private double at;
   private double au;
   private double av;
   private double aw;
   private double ax;
   private double ay;
   private double az;
   private double aA;

   public ael(ry var1) {
      super(var1);
      this.d = -1;
      this.e = -1;
      this.f = -1;
      this.g = 0;
      this.h = false;
      this.a = 0;
      this.aq = 0;
      this.ar = 0;
      this.c = null;
      this.a(0.25F, 0.25F);
      this.ao = true;
   }

   public ael(ry var1, double var2, double var4, double var6) {
      this(var1);
      this.d(var2, var4, var6);
      this.ao = true;
   }

   public ael(ry var1, vi var2) {
      super(var1);
      this.d = -1;
      this.e = -1;
      this.f = -1;
      this.g = 0;
      this.h = false;
      this.a = 0;
      this.aq = 0;
      this.ar = 0;
      this.c = null;
      this.ao = true;
      this.b = var2;
      this.b.ci = this;
      this.a(0.25F, 0.25F);
      this.c(var2.s, var2.t + 1.62 - (double)var2.L, var2.u, var2.y, var2.z);
      this.s -= (double)(me.b(this.y / 180.0F * (float)Math.PI) * 0.16F);
      this.t -= (double)0.1F;
      this.u -= (double)(me.a(this.y / 180.0F * (float)Math.PI) * 0.16F);
      this.d(this.s, this.t, this.u);
      this.L = 0.0F;
      float var3 = 0.4F;
      this.v = (double)(-me.a(this.y / 180.0F * (float)Math.PI) * me.b(this.z / 180.0F * (float)Math.PI) * var3);
      this.x = (double)(me.b(this.y / 180.0F * (float)Math.PI) * me.b(this.z / 180.0F * (float)Math.PI) * var3);
      this.w = (double)(-me.a(this.z / 180.0F * (float)Math.PI) * var3);
      this.a(this.v, this.w, this.x, 1.5F, 1.0F);
   }

   protected void b() {
   }

   public boolean a(double var1) {
      double var3 = this.C.c() * (double)4.0F;
      var3 *= (double)64.0F;
      return var1 < var3 * var3;
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      float var9 = me.a(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.Y.nextGaussian() * (double)0.0075F * (double)var8;
      var3 += this.Y.nextGaussian() * (double)0.0075F * (double)var8;
      var5 += this.Y.nextGaussian() * (double)0.0075F * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.v = var1;
      this.w = var3;
      this.x = var5;
      float var10 = me.a(var1 * var1 + var5 * var5);
      this.A = this.y = (float)(Math.atan2(var1, var5) * (double)180.0F / (double)(float)Math.PI);
      this.B = this.z = (float)(Math.atan2(var3, (double)var10) * (double)180.0F / (double)(float)Math.PI);
      this.i = 0;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.at = var1;
      this.au = var3;
      this.av = var5;
      this.aw = (double)var7;
      this.ax = (double)var8;
      this.as = var9;
      this.v = this.ay;
      this.w = this.az;
      this.x = this.aA;
   }

   public void a(double var1, double var3, double var5) {
      this.ay = this.v = var1;
      this.az = this.w = var3;
      this.aA = this.x = var5;
   }

   public void a() {
      super.a();
      if (this.as > 0) {
         double var22 = this.s + (this.at - this.s) / (double)this.as;
         double var24 = this.t + (this.au - this.t) / (double)this.as;
         double var25 = this.u + (this.av - this.u) / (double)this.as;

         double var7;
         for(var7 = this.aw - (double)this.y; var7 < (double)-180.0F; var7 += (double)360.0F) {
         }

         while(var7 >= (double)180.0F) {
            var7 -= (double)360.0F;
         }

         this.y = (float)((double)this.y + var7 / (double)this.as);
         this.z = (float)((double)this.z + (this.ax - (double)this.z) / (double)this.as);
         --this.as;
         this.d(var22, var24, var25);
         this.b(this.y, this.z);
      } else {
         if (!this.o.I) {
            dk var1 = this.b.aH();
            if (this.b.K || !this.b.K() || var1 == null || var1.a() != acy.aQ || this.d(this.b) > (double)1024.0F) {
               this.v();
               this.b.ci = null;
               return;
            }

            if (this.c != null) {
               if (!this.c.K) {
                  this.s = this.c.s;
                  this.t = this.c.C.b + (double)this.c.N * 0.8;
                  this.u = this.c.u;
                  return;
               }

               this.c = null;
            }
         }

         if (this.a > 0) {
            --this.a;
         }

         if (this.h) {
            int var19 = this.o.a(this.d, this.e, this.f);
            if (var19 == this.g) {
               ++this.i;
               if (this.i == 1200) {
                  this.v();
               }

               return;
            }

            this.h = false;
            this.v *= (double)(this.Y.nextFloat() * 0.2F);
            this.w *= (double)(this.Y.nextFloat() * 0.2F);
            this.x *= (double)(this.Y.nextFloat() * 0.2F);
            this.i = 0;
            this.aq = 0;
         } else {
            ++this.aq;
         }

         fb var20 = fb.b(this.s, this.t, this.u);
         fb var2 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
         gv var3 = this.o.a(var20, var2);
         var20 = fb.b(this.s, this.t, this.u);
         var2 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
         if (var3 != null) {
            var2 = fb.b(var3.f.a, var3.f.b, var3.f.c);
         }

         ia var4 = null;
         List var5 = this.o.b((ia)this, (c)this.C.a(this.v, this.w, this.x).b((double)1.0F, (double)1.0F, (double)1.0F));
         double var6 = (double)0.0F;

         for(int var8 = 0; var8 < var5.size(); ++var8) {
            ia var9 = (ia)var5.get(var8);
            if (var9.e_() && (var9 != this.b || this.aq >= 5)) {
               float var10 = 0.3F;
               c var11 = var9.C.b((double)var10, (double)var10, (double)var10);
               gv var12 = var11.a(var20, var2);
               if (var12 != null) {
                  double var13 = var20.d(var12.f);
                  if (var13 < var6 || var6 == (double)0.0F) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if (var4 != null) {
            var3 = new gv(var4);
         }

         if (var3 != null) {
            if (var3.g != null) {
               if (var3.g.a(pm.a((ia)this, this.b), 0)) {
                  this.c = var3.g;
               }
            } else {
               this.h = true;
            }
         }

         if (!this.h) {
            this.b(this.v, this.w, this.x);
            float var26 = me.a(this.v * this.v + this.x * this.x);
            this.y = (float)(Math.atan2(this.v, this.x) * (double)180.0F / (double)(float)Math.PI);

            for(this.z = (float)(Math.atan2(this.w, (double)var26) * (double)180.0F / (double)(float)Math.PI); this.z - this.B < -180.0F; this.B -= 360.0F) {
            }

            while(this.z - this.B >= 180.0F) {
               this.B += 360.0F;
            }

            while(this.y - this.A < -180.0F) {
               this.A -= 360.0F;
            }

            while(this.y - this.A >= 180.0F) {
               this.A += 360.0F;
            }

            this.z = this.B + (this.z - this.B) * 0.2F;
            this.y = this.A + (this.y - this.A) * 0.2F;
            float var27 = 0.92F;
            if (this.D || this.E) {
               var27 = 0.5F;
            }

            byte var28 = 5;
            double var29 = (double)0.0F;

            for(int var30 = 0; var30 < var28; ++var30) {
               double var14 = this.C.b + (this.C.e - this.C.b) * (double)(var30 + 0) / (double)var28 - (double)0.125F + (double)0.125F;
               double var16 = this.C.b + (this.C.e - this.C.b) * (double)(var30 + 1) / (double)var28 - (double)0.125F + (double)0.125F;
               c var18 = net.minecraft.client.c.b(this.C.a, var14, this.C.c, this.C.d, var16, this.C.f);
               if (this.o.b(var18, net.minecraft.client.p.g)) {
                  var29 += (double)1.0F / (double)var28;
               }
            }

            if (var29 > (double)0.0F) {
               if (this.ar > 0) {
                  --this.ar;
               } else {
                  short var31 = 500;
                  if (this.o.w(me.c(this.s), me.c(this.t) + 1, me.c(this.u))) {
                     var31 = 300;
                  }

                  if (this.Y.nextInt(var31) == 0) {
                     this.ar = this.Y.nextInt(30) + 10;
                     this.w -= (double)0.2F;
                     this.o.a(this, "random.splash", 0.25F, 1.0F + (this.Y.nextFloat() - this.Y.nextFloat()) * 0.4F);
                     float var33 = (float)me.c(this.C.b);

                     for(int var15 = 0; (float)var15 < 1.0F + this.M * 20.0F; ++var15) {
                        float var35 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
                        float var17 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
                        this.o.a("bubble", this.s + (double)var35, (double)(var33 + 1.0F), this.u + (double)var17, this.v, this.w - (double)(this.Y.nextFloat() * 0.2F), this.x);
                     }

                     for(int var34 = 0; (float)var34 < 1.0F + this.M * 20.0F; ++var34) {
                        float var36 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
                        float var37 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
                        this.o.a("splash", this.s + (double)var36, (double)(var33 + 1.0F), this.u + (double)var37, this.v, this.w, this.x);
                     }
                  }
               }
            }

            if (this.ar > 0) {
               this.w -= (double)(this.Y.nextFloat() * this.Y.nextFloat() * this.Y.nextFloat()) * 0.2;
            }

            double var32 = var29 * (double)2.0F - (double)1.0F;
            this.w += (double)0.04F * var32;
            if (var29 > (double)0.0F) {
               var27 = (float)((double)var27 * 0.9);
               this.w *= 0.8;
            }

            this.v *= (double)var27;
            this.w *= (double)var27;
            this.x *= (double)var27;
            this.d(this.s, this.t, this.u);
         }
      }
   }

   public void a(ik var1) {
      var1.a("xTile", (short)this.d);
      var1.a("yTile", (short)this.e);
      var1.a("zTile", (short)this.f);
      var1.a("inTile", (byte)this.g);
      var1.a("shake", (byte)this.a);
      var1.a("inGround", (byte)(this.h ? 1 : 0));
   }

   public void b(ik var1) {
      this.d = var1.d("xTile");
      this.e = var1.d("yTile");
      this.f = var1.d("zTile");
      this.g = var1.c("inTile") & 255;
      this.a = var1.c("shake") & 255;
      this.h = var1.c("inGround") == 1;
   }

   public float i_() {
      return 0.0F;
   }

   public int g() {
      byte var1 = 0;
      if (this.c != null) {
         double var2 = this.b.s - this.s;
         double var4 = this.b.t - this.t;
         double var6 = this.b.u - this.u;
         double var8 = (double)me.a(var2 * var2 + var4 * var4 + var6 * var6);
         double var10 = 0.1;
         ia var10000 = this.c;
         var10000.v += var2 * var10;
         var10000 = this.c;
         var10000.w += var4 * var10 + (double)me.a(var8) * 0.08;
         var10000 = this.c;
         var10000.x += var6 * var10;
         var1 = 3;
      } else if (this.ar > 0) {
         ih var13 = new ih(this.o, this.s, this.t, this.u, new dk(acy.aT));
         double var3 = this.b.s - this.s;
         double var5 = this.b.t - this.t;
         double var7 = this.b.u - this.u;
         double var9 = (double)me.a(var3 * var3 + var5 * var5 + var7 * var7);
         double var11 = 0.1;
         var13.v = var3 * var11;
         var13.w = var5 * var11 + (double)me.a(var9) * 0.08;
         var13.x = var7 * var11;
         this.o.a((ia)var13);
         this.b.a((px)ny.B, 1);
         var1 = 1;
      }

      if (this.h) {
         var1 = 2;
      }

      this.v();
      this.b.ci = null;
      return var1;
   }
}
