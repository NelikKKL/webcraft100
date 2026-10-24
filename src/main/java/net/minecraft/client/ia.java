package net.minecraft.client;

import java.util.List;
import java.util.Random;

public abstract class ia {
   private static int a = 0;
   public int j;
   public double k;
   public boolean l;
   public ia m;
   public ia n;
   public ry o;
   public double p;
   public double q;
   public double r;
   public double s;
   public double t;
   public double u;
   public double v;
   public double w;
   public double x;
   public float y;
   public float z;
   public float A;
   public float B;
   public final c C;
   public boolean D;
   public boolean E;
   public boolean F;
   public boolean G;
   public boolean H;
   protected boolean I;
   public boolean J;
   public boolean K;
   public float L;
   public float M;
   public float N;
   public float O;
   public float P;
   public float Q;
   private int b;
   public double R;
   public double S;
   public double T;
   public float U;
   public float V;
   public boolean W;
   public float X;
   protected Random Y;
   public int Z;
   public int aa;
   private int c;
   protected boolean ab;
   public int ac;
   private boolean d;
   public String ad;
   public String ae;
   protected boolean af;
   protected cr ag;
   private double e;
   private double f;
   public boolean ah;
   public int ai;
   public int aj;
   public int ak;
   public int al;
   public int am;
   public int an;
   public boolean ao;
   public boolean ap;

   public ia(ry var1) {
      this.j = a++;
      this.k = (double)1.0F;
      this.l = false;
      this.C = net.minecraft.client.c.a((double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F);
      this.D = false;
      this.G = false;
      this.H = false;
      this.J = true;
      this.K = false;
      this.L = 0.0F;
      this.M = 0.6F;
      this.N = 1.8F;
      this.O = 0.0F;
      this.P = 0.0F;
      this.Q = 0.0F;
      this.b = 1;
      this.U = 0.0F;
      this.V = 0.0F;
      this.W = false;
      this.X = 0.0F;
      this.Y = new net.minecraft.client.web.JRandom();
      this.Z = 0;
      this.aa = 1;
      this.c = 0;
      this.ab = false;
      this.ac = 0;
      this.d = true;
      this.af = false;
      this.ag = new cr();
      this.ah = false;
      this.o = var1;
      this.d((double)0.0F, (double)0.0F, (double)0.0F);
      this.ag.a(0, (byte)0);
      this.ag.a(1, (short)300);
      this.b();
   }

   protected abstract void b();

   public cr t() {
      return this.ag;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof ia) {
         return ((ia)var1).j == this.j;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.j;
   }

   protected void u() {
      if (this.o != null) {
         while(this.t > (double)0.0F) {
            this.d(this.s, this.t, this.u);
            if (this.o.a(this, this.C).size() == 0) {
               break;
            }

            ++this.t;
         }

         this.v = this.w = this.x = (double)0.0F;
         this.z = 0.0F;
      }
   }

   public void v() {
      this.K = true;
   }

   protected void a(float var1, float var2) {
      this.M = var1;
      this.N = var2;
   }

   protected void b(float var1, float var2) {
      this.y = var1 % 360.0F;
      this.z = var2 % 360.0F;
   }

   public void d(double var1, double var3, double var5) {
      this.s = var1;
      this.t = var3;
      this.u = var5;
      float var7 = this.M / 2.0F;
      float var8 = this.N;
      this.C.c(var1 - (double)var7, var3 - (double)this.L + (double)this.U, var5 - (double)var7, var1 + (double)var7, var3 - (double)this.L + (double)this.U + (double)var8, var5 + (double)var7);
   }

   public void c(float var1, float var2) {
      float var3 = this.z;
      float var4 = this.y;
      this.y = (float)((double)this.y + (double)var1 * 0.15);
      this.z = (float)((double)this.z - (double)var2 * 0.15);
      if (this.z < -90.0F) {
         this.z = -90.0F;
      }

      if (this.z > 90.0F) {
         this.z = 90.0F;
      }

      this.B += this.z - var3;
      this.A += this.y - var4;
   }

   public void a() {
      this.w();
   }

   public void w() {
      pf.a("entityBaseTick");
      if (this.n != null && this.n.K) {
         this.n = null;
      }

      ++this.Z;
      this.O = this.P;
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      this.B = this.z;
      this.A = this.y;
      if (this.X()) {
         int var1 = me.c(this.s);
         int var2 = me.c(this.t - (double)0.2F - (double)this.L);
         int var3 = me.c(this.u);
         int var4 = this.o.a(var1, var2, var3);
         if (var4 > 0) {
            this.o.a("tilecrack_" + var4, this.s + ((double)this.Y.nextFloat() - (double)0.5F) * (double)this.M, this.C.b + 0.1, this.u + ((double)this.Y.nextFloat() - (double)0.5F) * (double)this.M, -this.v * (double)4.0F, (double)1.5F, -this.x * (double)4.0F);
         }
      }

      if (this.h_()) {
         if (!this.ab && !this.d) {
            float var6 = me.a(this.v * this.v * (double)0.2F + this.w * this.w + this.x * this.x * (double)0.2F) * 0.2F;
            if (var6 > 1.0F) {
               var6 = 1.0F;
            }

            this.o.a(this, "random.splash", var6, 1.0F + (this.Y.nextFloat() - this.Y.nextFloat()) * 0.4F);
            float var7 = (float)me.c(this.C.b);

            for(int var8 = 0; (float)var8 < 1.0F + this.M * 20.0F; ++var8) {
               float var10 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
               float var5 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
               this.o.a("bubble", this.s + (double)var10, (double)(var7 + 1.0F), this.u + (double)var5, this.v, this.w - (double)(this.Y.nextFloat() * 0.2F), this.x);
            }

            for(int var9 = 0; (float)var9 < 1.0F + this.M * 20.0F; ++var9) {
               float var11 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
               float var12 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
               this.o.a("splash", this.s + (double)var11, (double)(var7 + 1.0F), this.u + (double)var12, this.v, this.w, this.x);
            }
         }

         this.Q = 0.0F;
         this.ab = true;
         this.c = 0;
      } else {
         this.ab = false;
      }

      if (this.o.I) {
         this.c = 0;
      } else if (this.c > 0) {
         if (this.af) {
            this.c -= 4;
            if (this.c < 0) {
               this.c = 0;
            }
         } else {
            if (this.c % 20 == 0) {
               this.a(pm.b, 1);
            }

            --this.c;
         }
      }

      if (this.F()) {
         this.x();
         this.Q *= 0.5F;
      }

      if (this.t < (double)-64.0F) {
         this.z();
      }

      if (!this.o.I) {
         this.a(0, this.c > 0);
         this.a(2, this.n != null);
      }

      this.d = false;
      pf.b();
   }

   protected void x() {
      if (!this.af) {
         this.a(pm.c, 4);
         this.e(15);
      }

   }

   public void e(int var1) {
      int var2 = var1 * 20;
      if (this.c < var2) {
         this.c = var2;
      }

   }

   public void y() {
      this.c = 0;
   }

   protected void z() {
      this.v();
   }

   public boolean e(double var1, double var3, double var5) {
      c var7 = this.C.c(var1, var3, var5);
      List var8 = this.o.a(this, var7);
      if (var8.size() > 0) {
         return false;
      } else {
         return !this.o.b(var7);
      }
   }

   public void b(double var1, double var3, double var5) {
      if (this.W) {
         this.C.d(var1, var3, var5);
         this.s = (this.C.a + this.C.d) / (double)2.0F;
         this.t = this.C.b + (double)this.L - (double)this.U;
         this.u = (this.C.c + this.C.f) / (double)2.0F;
      } else {
         pf.a("move");
         this.U *= 0.4F;
         double var7 = this.s;
         double var9 = this.u;
         if (this.I) {
            this.I = false;
            var1 *= (double)0.25F;
            var3 *= (double)0.05F;
            var5 *= (double)0.25F;
            this.v = (double)0.0F;
            this.w = (double)0.0F;
            this.x = (double)0.0F;
         }

         double var11 = var1;
         double var13 = var3;
         double var15 = var5;
         c var17 = this.C.d();
         boolean var18 = this.D && this.q();
         if (var18) {
            double var19;
            for(var19 = 0.05; var1 != (double)0.0F && this.o.a(this, this.C.c(var1, (double)-1.0F, (double)0.0F)).size() == 0; var11 = var1) {
               if (var1 < var19 && var1 >= -var19) {
                  var1 = (double)0.0F;
               } else if (var1 > (double)0.0F) {
                  var1 -= var19;
               } else {
                  var1 += var19;
               }
            }

            for(; var5 != (double)0.0F && this.o.a(this, this.C.c((double)0.0F, (double)-1.0F, var5)).size() == 0; var15 = var5) {
               if (var5 < var19 && var5 >= -var19) {
                  var5 = (double)0.0F;
               } else if (var5 > (double)0.0F) {
                  var5 -= var19;
               } else {
                  var5 += var19;
               }
            }
         }

         List var36 = this.o.a(this, this.C.a(var1, var3, var5));

         for(int var20 = 0; var20 < var36.size(); ++var20) {
            var3 = ((c)var36.get(var20)).b(this.C, var3);
         }

         this.C.d((double)0.0F, var3, (double)0.0F);
         if (!this.J && var13 != var3) {
            var5 = (double)0.0F;
            var3 = (double)0.0F;
            var1 = (double)0.0F;
         }

         boolean var38 = this.D || var13 != var3 && var13 < (double)0.0F;

         for(int var21 = 0; var21 < var36.size(); ++var21) {
            var1 = ((c)var36.get(var21)).a(this.C, var1);
         }

         this.C.d(var1, (double)0.0F, (double)0.0F);
         if (!this.J && var11 != var1) {
            var5 = (double)0.0F;
            var3 = (double)0.0F;
            var1 = (double)0.0F;
         }

         for(int var39 = 0; var39 < var36.size(); ++var39) {
            var5 = ((c)var36.get(var39)).c(this.C, var5);
         }

         this.C.d((double)0.0F, (double)0.0F, var5);
         if (!this.J && var15 != var5) {
            var5 = (double)0.0F;
            var3 = (double)0.0F;
            var1 = (double)0.0F;
         }

         if (this.V > 0.0F && var38 && (var18 || this.U < 0.05F) && (var11 != var1 || var15 != var5)) {
            double var40 = var1;
            double var23 = var3;
            double var25 = var5;
            var1 = var11;
            var3 = (double)this.V;
            var5 = var15;
            c var27 = this.C.d();
            this.C.b(var17);
            var36 = this.o.a(this, this.C.a(var11, var3, var15));

            for(int var28 = 0; var28 < var36.size(); ++var28) {
               var3 = ((c)var36.get(var28)).b(this.C, var3);
            }

            this.C.d((double)0.0F, var3, (double)0.0F);
            if (!this.J && var13 != var3) {
               var5 = (double)0.0F;
               var3 = (double)0.0F;
               var1 = (double)0.0F;
            }

            for(int var48 = 0; var48 < var36.size(); ++var48) {
               var1 = ((c)var36.get(var48)).a(this.C, var1);
            }

            this.C.d(var1, (double)0.0F, (double)0.0F);
            if (!this.J && var11 != var1) {
               var5 = (double)0.0F;
               var3 = (double)0.0F;
               var1 = (double)0.0F;
            }

            for(int var49 = 0; var49 < var36.size(); ++var49) {
               var5 = ((c)var36.get(var49)).c(this.C, var5);
            }

            this.C.d((double)0.0F, (double)0.0F, var5);
            if (!this.J && var15 != var5) {
               var5 = (double)0.0F;
               var3 = (double)0.0F;
               var1 = (double)0.0F;
            }

            if (!this.J && var13 != var3) {
               var5 = (double)0.0F;
               var3 = (double)0.0F;
               var1 = (double)0.0F;
            } else {
               var3 = (double)(-this.V);

               for(int var50 = 0; var50 < var36.size(); ++var50) {
                  var3 = ((c)var36.get(var50)).b(this.C, var3);
               }

               this.C.d((double)0.0F, var3, (double)0.0F);
            }

            if (var40 * var40 + var25 * var25 >= var1 * var1 + var5 * var5) {
               var1 = var40;
               var3 = var23;
               var5 = var25;
               this.C.b(var27);
            } else {
               double var51 = this.C.b - (double)((int)this.C.b);
               if (var51 > (double)0.0F) {
                  this.U = (float)((double)this.U + var51 + 0.01);
               }
            }
         }

         pf.b();
         pf.a("rest");
         this.s = (this.C.a + this.C.d) / (double)2.0F;
         this.t = this.C.b + (double)this.L - (double)this.U;
         this.u = (this.C.c + this.C.f) / (double)2.0F;
         this.E = var11 != var1 || var15 != var5;
         this.F = var13 != var3;
         this.D = var13 != var3 && var13 < (double)0.0F;
         this.G = this.E || this.F;
         this.a(var3, this.D);
         if (var11 != var1) {
            this.v = (double)0.0F;
         }

         if (var13 != var3) {
            this.w = (double)0.0F;
         }

         if (var15 != var5) {
            this.x = (double)0.0F;
         }

         double var41 = this.s - var7;
         double var42 = this.u - var9;
         if (this.d_() && !var18 && this.n == null) {
            this.P = (float)((double)this.P + (double)me.a(var41 * var41 + var42 * var42) * 0.6);
            int var43 = me.c(this.s);
            int var26 = me.c(this.t - (double)0.2F - (double)this.L);
            int var46 = me.c(this.u);
            int var52 = this.o.a(var43, var26, var46);
            if (var52 == 0 && this.o.a(var43, var26 - 1, var46) == yy.aZ.bM) {
               var52 = this.o.a(var43, var26 - 1, var46);
            }

            if (this.P > (float)this.b && var52 > 0) {
               this.b = (int)this.P + 1;
               this.a(var43, var26, var46, var52);
               yy.k[var52].b(this.o, var43, var26, var46, this);
            }
         }

         int var44 = me.c(this.C.a + 0.001);
         int var45 = me.c(this.C.b + 0.001);
         int var47 = me.c(this.C.c + 0.001);
         int var53 = me.c(this.C.d - 0.001);
         int var29 = me.c(this.C.e - 0.001);
         int var30 = me.c(this.C.f - 0.001);
         if (this.o.b(var44, var45, var47, var53, var29, var30)) {
            for(int var31 = var44; var31 <= var53; ++var31) {
               for(int var32 = var45; var32 <= var29; ++var32) {
                  for(int var33 = var47; var33 <= var30; ++var33) {
                     int var34 = this.o.a(var31, var32, var33);
                     if (var34 > 0) {
                        yy.k[var34].a(this.o, var31, var32, var33, this);
                     }
                  }
               }
            }
         }

         boolean var54 = this.C();
         if (this.o.c(this.C.e(0.001, 0.001, 0.001))) {
            this.a((int)1);
            if (!var54) {
               ++this.c;
               if (this.c == 0) {
                  this.e(8);
               }
            }
         } else if (this.c <= 0) {
            this.c = -this.aa;
         }

         if (var54 && this.c > 0) {
            this.o.a(this, "random.fizz", 0.7F, 1.6F + (this.Y.nextFloat() - this.Y.nextFloat()) * 0.4F);
            this.c = -this.aa;
         }

         pf.b();
      }
   }

   protected void a(int var1, int var2, int var3, int var4) {
      wu var5 = yy.k[var4].bX;
      if (this.o.a(var1, var2 + 1, var3) == yy.aS.bM) {
         var5 = yy.aS.bX;
         this.o.a(this, var5.d(), var5.b() * 0.15F, var5.c());
      } else if (!yy.k[var4].bZ.a()) {
         this.o.a(this, var5.d(), var5.b() * 0.15F, var5.c());
      }

   }

   protected boolean d_() {
      return true;
   }

   protected void a(double var1, boolean var3) {
      if (var3) {
         if (this.Q > 0.0F) {
            this.c(this.Q);
            this.Q = 0.0F;
         }
      } else if (var1 < (double)0.0F) {
         this.Q = (float)((double)this.Q - var1);
      }

   }

   public c A() {
      return null;
   }

   protected void a(int var1) {
      if (!this.af) {
         this.a(pm.a, var1);
      }

   }

   public final boolean B() {
      return this.af;
   }

   protected void c(float var1) {
      if (this.m != null) {
         this.m.c(var1);
      }

   }

   public boolean C() {
      return this.ab || this.o.w(me.c(this.s), me.c(this.t), me.c(this.u));
   }

   public boolean D() {
      return this.ab;
   }

   public boolean h_() {
      return this.o.a(this.C.b((double)0.0F, (double)-0.4F, (double)0.0F).e(0.001, 0.001, 0.001), net.minecraft.client.p.g, this);
   }

   public boolean a(p var1) {
      double var2 = this.t + (double)this.E();
      int var4 = me.c(this.s);
      int var5 = me.d((float)me.c(var2));
      int var6 = me.c(this.u);
      int var7 = this.o.a(var4, var5, var6);
      if (var7 != 0 && yy.k[var7].bZ == var1) {
         float var8 = agw.e(this.o.d(var4, var5, var6)) - 0.11111111F;
         float var9 = (float)(var5 + 1) - var8;
         return var2 < (double)var9;
      } else {
         return false;
      }
   }

   public float E() {
      return 0.0F;
   }

   public boolean F() {
      return this.o.a(this.C.b((double)-0.1F, (double)-0.4F, (double)-0.1F), net.minecraft.client.p.h);
   }

   public void a(float var1, float var2, float var3) {
      float var4 = me.c(var1 * var1 + var2 * var2);
      if (!(var4 < 0.01F)) {
         if (var4 < 1.0F) {
            var4 = 1.0F;
         }

         var4 = var3 / var4;
         var1 *= var4;
         var2 *= var4;
         float var5 = me.a(this.y * (float)Math.PI / 180.0F);
         float var6 = me.b(this.y * (float)Math.PI / 180.0F);
         this.v += (double)(var1 * var6 - var2 * var5);
         this.x += (double)(var2 * var6 + var1 * var5);
      }
   }

   public int a(float var1) {
      int var2 = me.c(this.s);
      int var3 = me.c(this.u);
      if (this.o.i(var2, this.o.c / 2, var3)) {
         double var4 = (this.C.e - this.C.b) * 0.66;
         int var6 = me.c(this.t - (double)this.L + var4);
         return this.o.a(var2, var6, var3, 0);
      } else {
         return 0;
      }
   }

   public float b(float var1) {
      int var2 = me.c(this.s);
      int var3 = me.c(this.u);
      if (this.o.i(var2, this.o.c / 2, var3)) {
         double var4 = (this.C.e - this.C.b) * 0.66;
         int var6 = me.c(this.t - (double)this.L + var4);
         return this.o.c(var2, var6, var3);
      } else {
         return 0.0F;
      }
   }

   public void a(ry var1) {
      this.o = var1;
   }

   public void b(double var1, double var3, double var5, float var7, float var8) {
      this.p = this.s = var1;
      this.q = this.t = var3;
      this.r = this.u = var5;
      this.A = this.y = var7;
      this.B = this.z = var8;
      this.U = 0.0F;
      double var9 = (double)(this.A - var7);
      if (var9 < (double)-180.0F) {
         this.A += 360.0F;
      }

      if (var9 >= (double)180.0F) {
         this.A -= 360.0F;
      }

      this.d(this.s, this.t, this.u);
      this.b(var7, var8);
   }

   public void c(double var1, double var3, double var5, float var7, float var8) {
      this.R = this.p = this.s = var1;
      this.S = this.q = this.t = var3 + (double)this.L;
      this.T = this.r = this.u = var5;
      this.y = var7;
      this.z = var8;
      this.d(this.s, this.t, this.u);
   }

   public float c(ia var1) {
      float var2 = (float)(this.s - var1.s);
      float var3 = (float)(this.t - var1.t);
      float var4 = (float)(this.u - var1.u);
      return me.c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double f(double var1, double var3, double var5) {
      double var7 = this.s - var1;
      double var9 = this.t - var3;
      double var11 = this.u - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double g(double var1, double var3, double var5) {
      double var7 = this.s - var1;
      double var9 = this.t - var3;
      double var11 = this.u - var5;
      return (double)me.a(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double d(ia var1) {
      double var2 = this.s - var1.s;
      double var4 = this.t - var1.t;
      double var6 = this.u - var1.u;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void a(vi var1) {
   }

   public void e(ia var1) {
      if (var1.m != this && var1.n != this) {
         double var2 = var1.s - this.s;
         double var4 = var1.u - this.u;
         double var6 = me.a(var2, var4);
         if (var6 >= (double)0.01F) {
            var6 = (double)me.a(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = (double)1.0F / var6;
            if (var8 > (double)1.0F) {
               var8 = (double)1.0F;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= (double)0.05F;
            var4 *= (double)0.05F;
            var2 *= (double)(1.0F - this.X);
            var4 *= (double)(1.0F - this.X);
            this.h(-var2, (double)0.0F, -var4);
            var1.h(var2, (double)0.0F, var4);
         }

      }
   }

   public void h(double var1, double var3, double var5) {
      this.v += var1;
      this.w += var3;
      this.x += var5;
      this.ap = true;
   }

   protected void G() {
      this.H = true;
   }

   public boolean a(pm var1, int var2) {
      this.G();
      return false;
   }

   public boolean e_() {
      return false;
   }

   public boolean H() {
      return false;
   }

   public void b(ia var1, int var2) {
   }

   public boolean a(fb var1) {
      double var2 = this.s - var1.a;
      double var4 = this.t - var1.b;
      double var6 = this.u - var1.c;
      double var8 = var2 * var2 + var4 * var4 + var6 * var6;
      return this.a(var8);
   }

   public boolean a(double var1) {
      double var3 = this.C.c();
      var3 *= (double)64.0F * this.k;
      return var1 < var3 * var3;
   }

   public String I() {
      return null;
   }

   public boolean c(ik var1) {
      String var2 = this.J();
      if (!this.K && var2 != null) {
         var1.a("id", var2);
         this.d(var1);
         return true;
      } else {
         return false;
      }
   }

   public void d(ik var1) {
      var1.a("Pos", (um)this.a(new double[]{this.s, this.t + (double)this.U, this.u}));
      var1.a("Motion", (um)this.a(new double[]{this.v, this.w, this.x}));
      var1.a("Rotation", (um)this.a(new float[]{this.y, this.z}));
      var1.a("FallDistance", this.Q);
      var1.a("Fire", (short)this.c);
      var1.a("Air", (short)this.Z());
      var1.a("OnGround", this.D);
      this.a(var1);
   }

   public void e(ik var1) {
      yi var2 = var1.l("Pos");
      yi var3 = var1.l("Motion");
      yi var4 = var1.l("Rotation");
      this.v = ((fg)var3.a(0)).a;
      this.w = ((fg)var3.a(1)).a;
      this.x = ((fg)var3.a(2)).a;
      if (Math.abs(this.v) > (double)10.0F) {
         this.v = (double)0.0F;
      }

      if (Math.abs(this.w) > (double)10.0F) {
         this.w = (double)0.0F;
      }

      if (Math.abs(this.x) > (double)10.0F) {
         this.x = (double)0.0F;
      }

      this.p = this.R = this.s = ((fg)var2.a(0)).a;
      this.q = this.S = this.t = ((fg)var2.a(1)).a;
      this.r = this.T = this.u = ((fg)var2.a(2)).a;
      this.A = this.y = ((vd)var4.a(0)).a;
      this.B = this.z = ((vd)var4.a(1)).a;
      this.Q = var1.g("FallDistance");
      this.c = var1.d("Fire");
      this.g(var1.d("Air"));
      this.D = var1.m("OnGround");
      this.d(this.s, this.t, this.u);
      this.b(this.y, this.z);
      this.b(var1);
   }

   protected final String J() {
      return afw.b(this);
   }

   protected abstract void b(ik var1);

   protected abstract void a(ik var1);

   protected yi a(double... var1) {
      yi var2 = new yi();

      for(double var6 : var1) {
         var2.a((um)(new fg((String)null, var6)));
      }

      return var2;
   }

   protected yi a(float... var1) {
      yi var2 = new yi();

      for(float var6 : var1) {
         var2.a((um)(new vd((String)null, var6)));
      }

      return var2;
   }

   public float i_() {
      return this.N / 2.0F;
   }

   public ih b(int var1, int var2) {
      return this.a(var1, var2, 0.0F);
   }

   public ih a(int var1, int var2, float var3) {
      return this.a(new dk(var1, var2, 0), var3);
   }

   public ih a(dk var1, float var2) {
      ih var3 = new ih(this.o, this.s, this.t + (double)var2, this.u, var1);
      var3.c = 10;
      this.o.a((ia)var3);
      return var3;
   }

   public boolean K() {
      return !this.K;
   }

   public boolean L() {
      for(int var1 = 0; var1 < 8; ++var1) {
         float var2 = ((float)((var1 >> 0) % 2) - 0.5F) * this.M * 0.8F;
         float var3 = ((float)((var1 >> 1) % 2) - 0.5F) * 0.1F;
         float var4 = ((float)((var1 >> 2) % 2) - 0.5F) * this.M * 0.8F;
         int var5 = me.c(this.s + (double)var2);
         int var6 = me.c(this.t + (double)this.E() + (double)var3);
         int var7 = me.c(this.u + (double)var4);
         if (this.o.g(var5, var6, var7)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(vi var1) {
      return false;
   }

   public c f(ia var1) {
      return null;
   }

   public void M() {
      if (this.n.K) {
         this.n = null;
      } else {
         this.v = (double)0.0F;
         this.w = (double)0.0F;
         this.x = (double)0.0F;
         this.a();
         if (this.n != null) {
            this.n.N();
            this.f += (double)(this.n.y - this.n.A);

            for(this.e += (double)(this.n.z - this.n.B); this.f >= (double)180.0F; this.f -= (double)360.0F) {
            }

            while(this.f < (double)-180.0F) {
               this.f += (double)360.0F;
            }

            while(this.e >= (double)180.0F) {
               this.e -= (double)360.0F;
            }

            while(this.e < (double)-180.0F) {
               this.e += (double)360.0F;
            }

            double var1 = this.f * (double)0.5F;
            double var3 = this.e * (double)0.5F;
            float var5 = 10.0F;
            if (var1 > (double)var5) {
               var1 = (double)var5;
            }

            if (var1 < (double)(-var5)) {
               var1 = (double)(-var5);
            }

            if (var3 > (double)var5) {
               var3 = (double)var5;
            }

            if (var3 < (double)(-var5)) {
               var3 = (double)(-var5);
            }

            this.f -= var1;
            this.e -= var3;
            this.y = (float)((double)this.y + var1);
            this.z = (float)((double)this.z + var3);
         }
      }
   }

   public void N() {
      this.m.d(this.s, this.t + this.P() + this.m.O(), this.u);
   }

   public double O() {
      return (double)this.L;
   }

   public double P() {
      return (double)this.N * (double)0.75F;
   }

   public void g(ia var1) {
      this.e = (double)0.0F;
      this.f = (double)0.0F;
      if (var1 == null) {
         if (this.n != null) {
            this.c(this.n.s, this.n.C.b + (double)this.n.N, this.n.u, this.y, this.z);
            this.n.m = null;
         }

         this.n = null;
      } else if (this.n == var1) {
         this.n.m = null;
         this.n = null;
         this.c(var1.s, var1.C.b + (double)var1.N, var1.u, this.y, this.z);
      } else {
         if (this.n != null) {
            this.n.m = null;
         }

         if (var1.m != null) {
            var1.m.n = null;
         }

         this.n = var1;
         var1.m = this;
      }
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.d(var1, var3, var5);
      this.b(var7, var8);
      List var10 = this.o.a(this, this.C.e((double)0.03125F, (double)0.0F, (double)0.03125F));
      if (var10.size() > 0) {
         double var11 = (double)0.0F;

         for(int var13 = 0; var13 < var10.size(); ++var13) {
            c var14 = (c)var10.get(var13);
            if (var14.e > var11) {
               var11 = var14.e;
            }
         }

         var3 += var11 - this.C.b;
         this.d(var1, var3, var5);
      }

   }

   public float Q() {
      return 0.1F;
   }

   public fb R() {
      return null;
   }

   public void S() {
   }

   public void a(double var1, double var3, double var5) {
      this.v = var1;
      this.w = var3;
      this.x = var5;
   }

   public void a(byte var1) {
   }

   public void T() {
   }

   public void U() {
   }

   public void c(int var1, int var2, int var3) {
   }

   public boolean V() {
      return this.c > 0 || this.f(0);
   }

   public boolean W() {
      return this.n != null || this.f(2);
   }

   public boolean q() {
      return this.f(1);
   }

   public boolean X() {
      return this.f(3);
   }

   public void a(boolean var1) {
      this.a(3, var1);
   }

   public boolean Y() {
      return this.f(4);
   }

   public void c(boolean var1) {
      this.a(4, var1);
   }

   protected boolean f(int var1) {
      return (this.ag.a(0) & 1 << var1) != 0;
   }

   protected void a(int var1, boolean var2) {
      byte var3 = this.ag.a(0);
      if (var2) {
         this.ag.b(0, (byte)(var3 | 1 << var1));
      } else {
         this.ag.b(0, (byte)(var3 & ~(1 << var1)));
      }

   }

   public int Z() {
      return this.ag.b(1);
   }

   public void g(int var1) {
      this.ag.b(1, (short)var1);
   }

   public void a(su var1) {
      this.a((int)5);
      ++this.c;
      if (this.c == 0) {
         this.e(8);
      }

   }

   public void a(nq var1) {
   }

   protected boolean c(double var1, double var3, double var5) {
      int var7 = me.c(var1);
      int var8 = me.c(var3);
      int var9 = me.c(var5);
      double var10 = var1 - (double)var7;
      double var12 = var3 - (double)var8;
      double var14 = var5 - (double)var9;
      if (this.o.g(var7, var8, var9)) {
         boolean var16 = !this.o.g(var7 - 1, var8, var9);
         boolean var17 = !this.o.g(var7 + 1, var8, var9);
         boolean var18 = !this.o.g(var7, var8 - 1, var9);
         boolean var19 = !this.o.g(var7, var8 + 1, var9);
         boolean var20 = !this.o.g(var7, var8, var9 - 1);
         boolean var21 = !this.o.g(var7, var8, var9 + 1);
         byte var22 = -1;
         double var23 = (double)9999.0F;
         if (var16 && var10 < var23) {
            var23 = var10;
            var22 = 0;
         }

         if (var17 && (double)1.0F - var10 < var23) {
            var23 = (double)1.0F - var10;
            var22 = 1;
         }

         if (var18 && var12 < var23) {
            var23 = var12;
            var22 = 2;
         }

         if (var19 && (double)1.0F - var12 < var23) {
            var23 = (double)1.0F - var12;
            var22 = 3;
         }

         if (var20 && var14 < var23) {
            var23 = var14;
            var22 = 4;
         }

         if (var21 && (double)1.0F - var14 < var23) {
            var23 = (double)1.0F - var14;
            var22 = 5;
         }

         float var25 = this.Y.nextFloat() * 0.2F + 0.1F;
         if (var22 == 0) {
            this.v = (double)(-var25);
         }

         if (var22 == 1) {
            this.v = (double)var25;
         }

         if (var22 == 2) {
            this.w = (double)(-var25);
         }

         if (var22 == 3) {
            this.w = (double)var25;
         }

         if (var22 == 4) {
            this.x = (double)(-var25);
         }

         if (var22 == 5) {
            this.x = (double)var25;
         }

         return true;
      } else {
         return false;
      }
   }

   public void aa() {
      this.I = true;
   }

   public ia[] ab() {
      return null;
   }

   public boolean h(ia var1) {
      return this == var1;
   }
}
