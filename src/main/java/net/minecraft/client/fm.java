package net.minecraft.client;

import java.util.List;

public abstract class fm extends ia {
   private int d = -1;
   private int e = -1;
   private int f = -1;
   private int g = 0;
   protected boolean a = false;
   public int b = 0;
   protected nq c;
   private int h;
   private int i = 0;

   public fm(ry var1) {
      super(var1);
      this.a(0.25F, 0.25F);
   }

   protected void b() {
   }

   public boolean a(double var1) {
      double var3 = this.C.c() * (double)4.0F;
      var3 *= (double)64.0F;
      return var1 < var3 * var3;
   }

   public fm(ry var1, nq var2) {
      super(var1);
      this.c = var2;
      this.a(0.25F, 0.25F);
      this.c(var2.s, var2.t + (double)var2.E(), var2.u, var2.y, var2.z);
      this.s -= (double)(me.b(this.y / 180.0F * (float)Math.PI) * 0.16F);
      this.t -= (double)0.1F;
      this.u -= (double)(me.a(this.y / 180.0F * (float)Math.PI) * 0.16F);
      this.d(this.s, this.t, this.u);
      this.L = 0.0F;
      float var3 = 0.4F;
      this.v = (double)(-me.a(this.y / 180.0F * (float)Math.PI) * me.b(this.z / 180.0F * (float)Math.PI) * var3);
      this.x = (double)(me.b(this.y / 180.0F * (float)Math.PI) * me.b(this.z / 180.0F * (float)Math.PI) * var3);
      this.w = (double)(-me.a((this.z + this.d()) / 180.0F * (float)Math.PI) * var3);
      this.a(this.v, this.w, this.x, this.c_(), 1.0F);
   }

   public fm(ry var1, double var2, double var4, double var6) {
      super(var1);
      this.h = 0;
      this.a(0.25F, 0.25F);
      this.d(var2, var4, var6);
      this.L = 0.0F;
   }

   protected float c_() {
      return 1.5F;
   }

   protected float d() {
      return 0.0F;
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
      this.h = 0;
   }

   public void a(double var1, double var3, double var5) {
      this.v = var1;
      this.w = var3;
      this.x = var5;
      if (this.B == 0.0F && this.A == 0.0F) {
         float var7 = me.a(var1 * var1 + var5 * var5);
         this.A = this.y = (float)(Math.atan2(var1, var5) * (double)180.0F / (double)(float)Math.PI);
         this.B = this.z = (float)(Math.atan2(var3, (double)var7) * (double)180.0F / (double)(float)Math.PI);
      }

   }

   public void a() {
      this.R = this.s;
      this.S = this.t;
      this.T = this.u;
      super.a();
      if (this.b > 0) {
         --this.b;
      }

      if (this.a) {
         int var1 = this.o.a(this.d, this.e, this.f);
         if (var1 == this.g) {
            ++this.h;
            if (this.h == 1200) {
               this.v();
            }

            return;
         }

         this.a = false;
         this.v *= (double)(this.Y.nextFloat() * 0.2F);
         this.w *= (double)(this.Y.nextFloat() * 0.2F);
         this.x *= (double)(this.Y.nextFloat() * 0.2F);
         this.h = 0;
         this.i = 0;
      } else {
         ++this.i;
      }

      fb var15 = fb.b(this.s, this.t, this.u);
      fb var2 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
      gv var3 = this.o.a(var15, var2);
      var15 = fb.b(this.s, this.t, this.u);
      var2 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
      if (var3 != null) {
         var2 = fb.b(var3.f.a, var3.f.b, var3.f.c);
      }

      if (!this.o.I) {
         ia var4 = null;
         List var5 = this.o.b((ia)this, (c)this.C.a(this.v, this.w, this.x).b((double)1.0F, (double)1.0F, (double)1.0F));
         double var6 = (double)0.0F;

         for(int var8 = 0; var8 < var5.size(); ++var8) {
            ia var9 = (ia)var5.get(var8);
            if (var9.e_() && (var9 != this.c || this.i >= 5)) {
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
      float var19 = 0.99F;
      float var20 = this.b_();
      if (this.D()) {
         for(int var7 = 0; var7 < 4; ++var7) {
            float var21 = 0.25F;
            this.o.a("bubble", this.s - this.v * (double)var21, this.t - this.w * (double)var21, this.u - this.x * (double)var21, this.v, this.w, this.x);
         }

         var19 = 0.8F;
      }

      this.v *= (double)var19;
      this.w *= (double)var19;
      this.x *= (double)var19;
      this.w -= (double)var20;
      this.d(this.s, this.t, this.u);
   }

   protected float b_() {
      return 0.03F;
   }

   protected abstract void a(gv var1);

   public void a(ik var1) {
      var1.a("xTile", (short)this.d);
      var1.a("yTile", (short)this.e);
      var1.a("zTile", (short)this.f);
      var1.a("inTile", (byte)this.g);
      var1.a("shake", (byte)this.b);
      var1.a("inGround", (byte)(this.a ? 1 : 0));
   }

   public void b(ik var1) {
      this.d = var1.d("xTile");
      this.e = var1.d("yTile");
      this.f = var1.d("zTile");
      this.g = var1.c("inTile") & 255;
      this.b = var1.c("shake") & 255;
      this.a = var1.c("inGround") == 1;
   }

   public void a(vi var1) {
   }

   public float i_() {
      return 0.0F;
   }
}
