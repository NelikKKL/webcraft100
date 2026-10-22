package net.minecraft.client;

import net.minecraft.client.Minecraft;

public class di extends vi {
   public agn b;
   protected Minecraft c;
   protected int d = 0;
   public int e = 0;
   public float f;
   public float g;
   public float h;
   public float i;
   private ne a = new ne();
   private ne cj = new ne();
   private ne ck = new ne();

   public di(Minecraft var1, ry var2, dr var3, int var4) {
      super(var2);
      this.c = var1;
      this.bK = var4;
      if (var3 != null && var3.b != null && var3.b.length() > 0) {
         this.ad = "http://s3.amazonaws.com/MinecraftSkins/" + var3.b + ".png";
      }

      this.bJ = var3.b;
   }

   public void b(double var1, double var3, double var5) {
      super.b(var1, var3, var5);
   }

   public void n() {
      super.n();
      this.br = this.b.a;
      this.bs = this.b.b;
      this.bu = this.b.d;
      this.h = this.f;
      this.i = this.g;
      this.g = (float)((double)this.g + (double)(this.z - this.g) * (double)0.5F);
      this.f = (float)((double)this.f + (double)(this.y - this.f) * (double)0.5F);
   }

   public void c() {
      if (this.e > 0) {
         --this.e;
         if (this.e == 0) {
            this.a(false);
         }
      }

      if (this.d > 0) {
         --this.d;
      }

      if (this.c.c.i()) {
         this.s = this.u = (double)0.5F;
         this.s = (double)0.0F;
         this.u = (double)0.0F;
         this.y = (float)this.Z / 12.0F;
         this.z = 10.0F;
         this.t = (double)68.5F;
      } else {
         if (!this.c.K.a(ut.f)) {
            this.c.v.b(ut.f);
         }

         this.cb = this.ca;
         if (this.bZ) {
            if (!this.o.I && this.n != null) {
               this.g((ia)null);
            }

            if (this.c.s != null) {
               this.c.a((xe)null);
            }

            if (this.ca == 0.0F) {
               this.c.C.a("portal.trigger", 1.0F, this.Y.nextFloat() * 0.4F + 0.8F);
            }

            this.ca += 0.0125F;
            if (this.ca >= 1.0F) {
               this.ca = 1.0F;
               if (!this.o.I) {
                  this.bY = 10;
                  this.c.C.a("portal.travel", 1.0F, this.Y.nextFloat() * 0.4F + 0.8F);
                  byte var1 = 0;
                  if (this.bK == -1) {
                     var1 = 0;
                  } else {
                     var1 = -1;
                  }

                  this.c.a(var1);
                  this.a((px)ut.x);
               }
            }

            this.bZ = false;
         } else if (this.a((abg)abg.k) && this.b((abg)abg.k).b() > 60) {
            this.ca += 0.006666667F;
            if (this.ca > 1.0F) {
               this.ca = 1.0F;
            }
         } else {
            if (this.ca > 0.0F) {
               this.ca -= 0.05F;
            }

            if (this.ca < 0.0F) {
               this.ca = 0.0F;
            }
         }

         if (this.bY > 0) {
            --this.bY;
         }

         boolean var6 = this.b.d;
         float var2 = 0.8F;
         boolean var3 = this.b.b >= var2;
         this.b.a(this);
         if (this.az()) {
            agn var10000 = this.b;
            var10000.a *= 0.2F;
            var10000 = this.b;
            var10000.b *= 0.2F;
            this.d = 0;
         }

         if (this.b.e && this.U < 0.2F) {
            this.U = 0.2F;
         }

         this.c(this.s - (double)this.M * 0.35, this.C.b + (double)0.5F, this.u + (double)this.M * 0.35);
         this.c(this.s - (double)this.M * 0.35, this.C.b + (double)0.5F, this.u - (double)this.M * 0.35);
         this.c(this.s + (double)this.M * 0.35, this.C.b + (double)0.5F, this.u - (double)this.M * 0.35);
         this.c(this.s + (double)this.M * 0.35, this.C.b + (double)0.5F, this.u + (double)this.M * 0.35);
         boolean var4 = (float)this.aO().a() > 6.0F;
         if (this.D && !var3 && this.b.b >= var2 && !this.X() && var4 && !this.az() && !this.a((abg)abg.q)) {
            if (this.d == 0) {
               this.d = 7;
            } else {
               this.a(true);
               this.d = 0;
            }
         }

         if (this.q()) {
            this.d = 0;
         }

         if (this.X() && (this.b.b < var2 || this.E || !var4)) {
            this.a(false);
         }

         if (this.cc.c && !var6 && this.b.d) {
            if (this.bC == 0) {
               this.bC = 7;
            } else {
               this.cc.b = !this.cc.b;
               this.bC = 0;
            }
         }

         if (this.cc.b) {
            if (this.b.e) {
               this.w -= 0.15;
            }

            if (this.b.d) {
               this.w += 0.15;
            }
         }

         super.c();
         if (this.D && this.cc.b) {
            this.cc.b = false;
         }

      }
   }

   public void c(int var1) {
      if (!this.o.I) {
         if (this.bK == 1 && var1 == 1) {
            this.a((px)ut.C);
            this.c.a((xe)(new lt()));
         } else {
            this.a((px)ut.B);
            this.c.C.a("portal.travel", 1.0F, this.Y.nextFloat() * 0.4F + 0.8F);
            this.c.a(1);
         }
      }

   }

   public float o() {
      float var1 = 1.0F;
      if (this.cc.b) {
         var1 *= 1.1F;
      }

      var1 *= (this.aI * this.aw() / this.cg + 1.0F) / 2.0F;
      if (this.az() && this.ax().c == acy.j.bM) {
         int var2 = this.aA();
         float var3 = (float)var2 / 20.0F;
         if (var3 > 1.0F) {
            var3 = 1.0F;
         } else {
            var3 *= var3;
         }

         var1 *= 1.0F - var3 * 0.15F;
      }

      return var1;
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("Score", this.bE);
   }

   public void b(ik var1) {
      super.b(var1);
      this.bE = var1.e("Score");
   }

   public void m() {
      super.m();
      this.c.a((xe)null);
   }

   public void a(u var1) {
      this.c.a((xe)(new fl(var1)));
   }

   public void a(de var1) {
      this.c.a((xe)(new gj(this.by, var1)));
   }

   public void a(int var1, int var2, int var3) {
      this.c.a((xe)(new uv(this.by, this.o, var1, var2, var3)));
   }

   public void b(int var1, int var2, int var3) {
      this.c.a((xe)(new zw(this.by, this.o, var1, var2, var3)));
   }

   public void a(oe var1) {
      this.c.a((xe)(new aaw(this.by, var1)));
   }

   public void a(tt var1) {
      this.c.a((xe)(new cy(this.by, var1)));
   }

   public void a(bp var1) {
      this.c.a((xe)(new wt(this.by, var1)));
   }

   public void a(ia var1) {
      this.c.j.a((wc)(new hu(this.c.f, var1)));
   }

   public void b(ia var1) {
      hu var2 = new hu(this.c.f, var1, "magicCrit");
      this.c.j.a((wc)var2);
   }

   public void a(ia var1, int var2) {
      this.c.j.a((wc)(new acw(this.c.f, var1, this, -0.5F)));
   }

   public int p() {
      return this.by.f();
   }

   public void a(String var1) {
   }

   public boolean q() {
      return this.b.e && !this.bT;
   }

   public void b(int var1) {
      int var2 = this.ag() - var1;
      if (var2 <= 0) {
         this.h(var1);
         if (var2 < 0) {
            this.ac = this.aq / 2;
         }
      } else {
         this.bp = var2;
         this.h(this.ag());
         this.ac = this.aq;
         this.b(pm.j, var2);
         this.aP = this.aQ = 10;
      }

   }

   public void n_() {
      this.c.a(false, 0, false);
   }

   public void r() {
   }

   public void b(String var1) {
      this.c.w.c(var1);
   }

   public void a(px var1, int var2) {
      if (var1 != null) {
         if (var1.c()) {
            ws var3 = (ws)var1;
            if (var3.j == null || this.c.K.a(var3.j)) {
               if (!this.c.K.a(var3)) {
                  this.c.v.a(var3);
               }

               this.c.K.a(var1, var2);
            }
         } else {
            this.c.K.a(var1, var2);
         }

      }
   }

   private boolean f(int var1, int var2, int var3) {
      return this.o.g(var1, var2, var3);
   }

   protected boolean c(double var1, double var3, double var5) {
      int var7 = me.c(var1);
      int var8 = me.c(var3);
      int var9 = me.c(var5);
      double var10 = var1 - (double)var7;
      double var12 = var5 - (double)var9;
      if (this.f(var7, var8, var9) || this.f(var7, var8 + 1, var9)) {
         boolean var14 = !this.f(var7 - 1, var8, var9) && !this.f(var7 - 1, var8 + 1, var9);
         boolean var15 = !this.f(var7 + 1, var8, var9) && !this.f(var7 + 1, var8 + 1, var9);
         boolean var16 = !this.f(var7, var8, var9 - 1) && !this.f(var7, var8 + 1, var9 - 1);
         boolean var17 = !this.f(var7, var8, var9 + 1) && !this.f(var7, var8 + 1, var9 + 1);
         byte var18 = -1;
         double var19 = (double)9999.0F;
         if (var14 && var10 < var19) {
            var19 = var10;
            var18 = 0;
         }

         if (var15 && (double)1.0F - var10 < var19) {
            var19 = (double)1.0F - var10;
            var18 = 1;
         }

         if (var16 && var12 < var19) {
            var19 = var12;
            var18 = 4;
         }

         if (var17 && (double)1.0F - var12 < var19) {
            var19 = (double)1.0F - var12;
            var18 = 5;
         }

         float var21 = 0.1F;
         if (var18 == 0) {
            this.v = (double)(-var21);
         }

         if (var18 == 1) {
            this.v = (double)var21;
         }

         if (var18 == 4) {
            this.x = (double)(-var21);
         }

         if (var18 == 5) {
            this.x = (double)var21;
         }
      }

      return false;
   }

   public void a(boolean var1) {
      super.a(var1);
      if (!var1) {
         this.e = 0;
      } else {
         this.e = 600;
      }

   }

   public void a(float var1, int var2, int var3) {
      this.cf = var1;
      this.ce = var2;
      this.cd = var3;
   }
}
