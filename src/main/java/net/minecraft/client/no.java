package net.minecraft.client;

import java.util.List;

public class no extends ia {
   private int a;
   private double b;
   private double c;
   private double d;
   private double e;
   private double f;
   private double g;
   private double h;
   private double i;

   public no(ry var1) {
      super(var1);
      this.l = true;
      this.a(1.5F, 0.6F);
      this.L = this.N / 2.0F;
   }

   protected boolean d_() {
      return false;
   }

   protected void b() {
      this.ag.a(17, new Integer(0));
      this.ag.a(18, new Integer(1));
      this.ag.a(19, new Integer(0));
   }

   public c f(ia var1) {
      return var1.C;
   }

   public c A() {
      return this.C;
   }

   public boolean H() {
      return true;
   }

   public no(ry var1, double var2, double var4, double var6) {
      this(var1);
      this.d(var2, var4 + (double)this.L, var6);
      this.v = (double)0.0F;
      this.w = (double)0.0F;
      this.x = (double)0.0F;
      this.p = var2;
      this.q = var4;
      this.r = var6;
   }

   public double P() {
      return (double)this.N * (double)0.0F - (double)0.3F;
   }

   public boolean a(pm var1, int var2) {
      if (!this.o.I && !this.K) {
         this.d(-this.i());
         this.c(10);
         this.b(this.g() + var2 * 10);
         this.G();
         if (this.g() > 40) {
            if (this.m != null) {
               this.m.g(this);
            }

            for(int var3 = 0; var3 < 3; ++var3) {
               this.a(yy.x.bM, 1, 0.0F);
            }

            for(int var4 = 0; var4 < 2; ++var4) {
               this.a(acy.C.bM, 1, 0.0F);
            }

            this.v();
         }

         return true;
      } else {
         return true;
      }
   }

   public void T() {
      this.d(-this.i());
      this.c(10);
      this.b(this.g() * 11);
   }

   public boolean e_() {
      return !this.K;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.b = var1;
      this.c = var3;
      this.d = var5;
      this.e = (double)var7;
      this.f = (double)var8;
      this.a = var9 + 4;
      this.v = this.g;
      this.w = this.h;
      this.x = this.i;
   }

   public void a(double var1, double var3, double var5) {
      this.g = this.v = var1;
      this.h = this.w = var3;
      this.i = this.x = var5;
   }

   public void a() {
      super.a();
      if (this.h() > 0) {
         this.c(this.h() - 1);
      }

      if (this.g() > 0) {
         this.b(this.g() - 1);
      }

      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      byte var1 = 5;
      double var2 = (double)0.0F;

      for(int var4 = 0; var4 < var1; ++var4) {
         double var5 = this.C.b + (this.C.e - this.C.b) * (double)(var4 + 0) / (double)var1 - (double)0.125F;
         double var7 = this.C.b + (this.C.e - this.C.b) * (double)(var4 + 1) / (double)var1 - (double)0.125F;
         c var9 = net.minecraft.client.c.b(this.C.a, var5, this.C.c, this.C.d, var7, this.C.f);
         if (this.o.b(var9, net.minecraft.client.p.g)) {
            var2 += (double)1.0F / (double)var1;
         }
      }

      double var21 = Math.sqrt(this.v * this.v + this.x * this.x);
      if (var21 > 0.15) {
         double var6 = Math.cos((double)this.y * Math.PI / (double)180.0F);
         double var8 = Math.sin((double)this.y * Math.PI / (double)180.0F);

         for(int var10 = 0; (double)var10 < (double)1.0F + var21 * (double)60.0F; ++var10) {
            double var11 = (double)(this.Y.nextFloat() * 2.0F - 1.0F);
            double var13 = (double)(this.Y.nextInt(2) * 2 - 1) * 0.7;
            if (this.Y.nextBoolean()) {
               double var15 = this.s - var6 * var11 * 0.8 + var8 * var13;
               double var17 = this.u - var8 * var11 * 0.8 - var6 * var13;
               this.o.a("splash", var15, this.t - (double)0.125F, var17, this.v, this.w, this.x);
            } else {
               double var35 = this.s + var6 + var8 * var11 * 0.7;
               double var36 = this.u + var8 - var6 * var11 * 0.7;
               this.o.a("splash", var35, this.t - (double)0.125F, var36, this.v, this.w, this.x);
            }
         }
      }

      if (this.o.I) {
         if (this.a > 0) {
            double var24 = this.s + (this.b - this.s) / (double)this.a;
            double var29 = this.t + (this.c - this.t) / (double)this.a;
            double var32 = this.u + (this.d - this.u) / (double)this.a;

            double var34;
            for(var34 = this.e - (double)this.y; var34 < (double)-180.0F; var34 += (double)360.0F) {
            }

            while(var34 >= (double)180.0F) {
               var34 -= (double)360.0F;
            }

            this.y = (float)((double)this.y + var34 / (double)this.a);
            this.z = (float)((double)this.z + (this.f - (double)this.z) / (double)this.a);
            --this.a;
            this.d(var24, var29, var32);
            this.b(this.y, this.z);
         } else {
            double var25 = this.s + this.v;
            double var30 = this.t + this.w;
            double var33 = this.u + this.x;
            this.d(var25, var30, var33);
            if (this.D) {
               this.v *= (double)0.5F;
               this.w *= (double)0.5F;
               this.x *= (double)0.5F;
            }

            this.v *= (double)0.99F;
            this.w *= (double)0.95F;
            this.x *= (double)0.99F;
         }

      } else {
         if (var2 < (double)1.0F) {
            double var22 = var2 * (double)2.0F - (double)1.0F;
            this.w += (double)0.04F * var22;
         } else {
            if (this.w < (double)0.0F) {
               this.w /= (double)2.0F;
            }

            this.w += (double)0.007F;
         }

         if (this.m != null) {
            this.v += this.m.v * 0.2;
            this.x += this.m.x * 0.2;
         }

         double var23 = 0.4;
         if (this.v < -var23) {
            this.v = -var23;
         }

         if (this.v > var23) {
            this.v = var23;
         }

         if (this.x < -var23) {
            this.x = -var23;
         }

         if (this.x > var23) {
            this.x = var23;
         }

         if (this.D) {
            this.v *= (double)0.5F;
            this.w *= (double)0.5F;
            this.x *= (double)0.5F;
         }

         this.b(this.v, this.w, this.x);
         if (this.E && var21 > 0.2) {
            if (!this.o.I) {
               this.v();

               for(int var26 = 0; var26 < 3; ++var26) {
                  this.a(yy.x.bM, 1, 0.0F);
               }

               for(int var27 = 0; var27 < 2; ++var27) {
                  this.a(acy.C.bM, 1, 0.0F);
               }
            }
         } else {
            this.v *= (double)0.99F;
            this.w *= (double)0.95F;
            this.x *= (double)0.99F;
         }

         this.z = 0.0F;
         double var28 = (double)this.y;
         double var31 = this.p - this.s;
         double var12 = this.r - this.u;
         if (var31 * var31 + var12 * var12 > 0.001) {
            var28 = (double)((float)(Math.atan2(var12, var31) * (double)180.0F / Math.PI));
         }

         double var14;
         for(var14 = var28 - (double)this.y; var14 >= (double)180.0F; var14 -= (double)360.0F) {
         }

         while(var14 < (double)-180.0F) {
            var14 += (double)360.0F;
         }

         if (var14 > (double)20.0F) {
            var14 = (double)20.0F;
         }

         if (var14 < (double)-20.0F) {
            var14 = (double)-20.0F;
         }

         this.y = (float)((double)this.y + var14);
         this.b(this.y, this.z);
         List var16 = this.o.b((ia)this, (c)this.C.b((double)0.2F, (double)0.0F, (double)0.2F));
         if (var16 != null && var16.size() > 0) {
            for(int var37 = 0; var37 < var16.size(); ++var37) {
               ia var18 = (ia)var16.get(var37);
               if (var18 != this.m && var18.H() && var18 instanceof no) {
                  var18.e((ia)this);
               }
            }
         }

         for(int var38 = 0; var38 < 4; ++var38) {
            int var39 = me.c(this.s + ((double)(var38 % 2) - (double)0.5F) * 0.8);
            int var19 = me.c(this.t);
            int var20 = me.c(this.u + ((double)(var38 / 2) - (double)0.5F) * 0.8);
            if (this.o.a(var39, var19, var20) == yy.aS.bM) {
               this.o.g(var39, var19, var20, 0);
            }
         }

         if (this.m != null && this.m.K) {
            this.m = null;
         }

      }
   }

   public void N() {
      if (this.m != null) {
         double var1 = Math.cos((double)this.y * Math.PI / (double)180.0F) * 0.4;
         double var3 = Math.sin((double)this.y * Math.PI / (double)180.0F) * 0.4;
         this.m.d(this.s + var1, this.t + this.P() + this.m.O(), this.u + var3);
      }
   }

   protected void a(ik var1) {
   }

   protected void b(ik var1) {
   }

   public float i_() {
      return 0.0F;
   }

   public boolean c(vi var1) {
      if (this.m != null && this.m instanceof vi && this.m != var1) {
         return true;
      } else {
         if (!this.o.I) {
            var1.g(this);
         }

         return true;
      }
   }

   public void b(int var1) {
      this.ag.b(19, var1);
   }

   public int g() {
      return this.ag.c(19);
   }

   public void c(int var1) {
      this.ag.b(17, var1);
   }

   public int h() {
      return this.ag.c(17);
   }

   public void d(int var1) {
      this.ag.b(18, var1);
   }

   public int i() {
      return this.ag.c(18);
   }
}
