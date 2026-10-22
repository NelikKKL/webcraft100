package net.minecraft.client;

import java.util.List;

public class aad extends ia {
   private int e = -1;
   private int f = -1;
   private int g = -1;
   private int h = 0;
   private boolean i = false;
   public nq a;
   private int aq;
   private int ar = 0;
   public double b;
   public double c;
   public double d;

   public aad(ry var1) {
      super(var1);
      this.a(1.0F, 1.0F);
   }

   protected void b() {
   }

   public boolean a(double var1) {
      double var3 = this.C.c() * (double)4.0F;
      var3 *= (double)64.0F;
      return var1 < var3 * var3;
   }

   public aad(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.a(1.0F, 1.0F);
      this.c(var2, var4, var6, this.y, this.z);
      this.d(var2, var4, var6);
      double var14 = (double)me.a(var8 * var8 + var10 * var10 + var12 * var12);
      this.b = var8 / var14 * 0.1;
      this.c = var10 / var14 * 0.1;
      this.d = var12 / var14 * 0.1;
   }

   public aad(ry var1, nq var2, double var3, double var5, double var7) {
      super(var1);
      this.a = var2;
      this.a(1.0F, 1.0F);
      this.c(var2.s, var2.t, var2.u, var2.y, var2.z);
      this.d(this.s, this.t, this.u);
      this.L = 0.0F;
      this.v = this.w = this.x = (double)0.0F;
      var3 += this.Y.nextGaussian() * 0.4;
      var5 += this.Y.nextGaussian() * 0.4;
      var7 += this.Y.nextGaussian() * 0.4;
      double var9 = (double)me.a(var3 * var3 + var5 * var5 + var7 * var7);
      this.b = var3 / var9 * 0.1;
      this.c = var5 / var9 * 0.1;
      this.d = var7 / var9 * 0.1;
   }

   public void a() {
      super.a();
      this.e(1);
      if (!this.o.I && (this.a == null || this.a.K)) {
         this.v();
      }

      if (this.i) {
         int var1 = this.o.a(this.e, this.f, this.g);
         if (var1 == this.h) {
            ++this.aq;
            if (this.aq == 1200) {
               this.v();
            }

            return;
         }

         this.i = false;
         this.v *= (double)(this.Y.nextFloat() * 0.2F);
         this.w *= (double)(this.Y.nextFloat() * 0.2F);
         this.x *= (double)(this.Y.nextFloat() * 0.2F);
         this.aq = 0;
         this.ar = 0;
      } else {
         ++this.ar;
      }

      fb var15 = fb.b(this.s, this.t, this.u);
      fb var2 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
      gv var3 = this.o.a(var15, var2);
      var15 = fb.b(this.s, this.t, this.u);
      var2 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
      if (var3 != null) {
         var2 = fb.b(var3.f.a, var3.f.b, var3.f.c);
      }

      ia var4 = null;
      List var5 = this.o.b((ia)this, (c)this.C.a(this.v, this.w, this.x).b((double)1.0F, (double)1.0F, (double)1.0F));
      double var6 = (double)0.0F;

      for(int var8 = 0; var8 < var5.size(); ++var8) {
         ia var9 = (ia)var5.get(var8);
         if (var9.e_() && (!var9.h(this.a) || this.ar >= 25)) {
            float var10 = 0.3F;
            c var11 = var9.C.b((double)var10, (double)var10, (double)var10);
            gv var12 = var11.a(var15, var2);
            if (var12 != null) {
               double var13 = var15.d(var12.f);
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
         this.a(var3);
      }

      this.s += this.v;
      this.t += this.w;
      this.u += this.x;
      float var18 = me.a(this.v * this.v + this.x * this.x);
      this.y = (float)(Math.atan2(this.v, this.x) * (double)180.0F / (double)(float)Math.PI);

      for(this.z = (float)(Math.atan2(this.w, (double)var18) * (double)180.0F / (double)(float)Math.PI); this.z - this.B < -180.0F; this.B -= 360.0F) {
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
      float var19 = 0.95F;
      if (this.D()) {
         for(int var20 = 0; var20 < 4; ++var20) {
            float var21 = 0.25F;
            this.o.a("bubble", this.s - this.v * (double)var21, this.t - this.w * (double)var21, this.u - this.x * (double)var21, this.v, this.w, this.x);
         }

         var19 = 0.8F;
      }

      this.v += this.b;
      this.w += this.c;
      this.x += this.d;
      this.v *= (double)var19;
      this.w *= (double)var19;
      this.x *= (double)var19;
      this.o.a("smoke", this.s, this.t + (double)0.5F, this.u, (double)0.0F, (double)0.0F, (double)0.0F);
      this.d(this.s, this.t, this.u);
   }

   protected void a(gv var1) {
      if (!this.o.I) {
         if (var1.g != null && var1.g.a(pm.a((aad)this, this.a), 4)) {
         }

         this.o.a((ia)null, this.s, this.t, this.u, 1.0F, true);
         this.v();
      }

   }

   public void a(ik var1) {
      var1.a("xTile", (short)this.e);
      var1.a("yTile", (short)this.f);
      var1.a("zTile", (short)this.g);
      var1.a("inTile", (byte)this.h);
      var1.a("inGround", (byte)(this.i ? 1 : 0));
   }

   public void b(ik var1) {
      this.e = var1.d("xTile");
      this.f = var1.d("yTile");
      this.g = var1.d("zTile");
      this.h = var1.c("inTile") & 255;
      this.i = var1.c("inGround") == 1;
   }

   public boolean e_() {
      return true;
   }

   public float Q() {
      return 1.0F;
   }

   public boolean a(pm var1, int var2) {
      this.G();
      if (var1.a() != null) {
         fb var3 = var1.a().R();
         if (var3 != null) {
            this.v = var3.a;
            this.w = var3.b;
            this.x = var3.c;
            this.b = this.v * 0.1;
            this.c = this.w * 0.1;
            this.d = this.x * 0.1;
         }

         if (var1.a() instanceof nq) {
            this.a = (nq)var1.a();
         }

         return true;
      } else {
         return false;
      }
   }

   public float i_() {
      return 0.0F;
   }

   public float b(float var1) {
      return 1.0F;
   }

   public int a(float var1) {
      return 15728880;
   }
}
