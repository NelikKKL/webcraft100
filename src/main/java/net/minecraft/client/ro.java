package net.minecraft.client;

import java.util.List;

public class ro extends ia {
   private int e = -1;
   private int f = -1;
   private int g = -1;
   private int h = 0;
   private int i = 0;
   private boolean aq = false;
   public boolean a = false;
   public int b = 0;
   public ia c;
   private int ar;
   private int as = 0;
   public boolean d = false;

   public ro(ry var1) {
      super(var1);
      this.a(0.5F, 0.5F);
   }

   public ro(ry var1, double var2, double var4, double var6) {
      super(var1);
      this.a(0.5F, 0.5F);
      this.d(var2, var4, var6);
      this.L = 0.0F;
   }

   public ro(ry var1, nq var2, float var3) {
      super(var1);
      this.c = var2;
      this.a = var2 instanceof vi;
      this.a(0.5F, 0.5F);
      this.c(var2.s, var2.t + (double)var2.E(), var2.u, var2.y, var2.z);
      this.s -= (double)(me.b(this.y / 180.0F * (float)Math.PI) * 0.16F);
      this.t -= (double)0.1F;
      this.u -= (double)(me.a(this.y / 180.0F * (float)Math.PI) * 0.16F);
      this.d(this.s, this.t, this.u);
      this.L = 0.0F;
      this.v = (double)(-me.a(this.y / 180.0F * (float)Math.PI) * me.b(this.z / 180.0F * (float)Math.PI));
      this.x = (double)(me.b(this.y / 180.0F * (float)Math.PI) * me.b(this.z / 180.0F * (float)Math.PI));
      this.w = (double)(-me.a(this.z / 180.0F * (float)Math.PI));
      this.a(this.v, this.w, this.x, var3 * 1.5F, 1.0F);
   }

   protected void b() {
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
      this.ar = 0;
   }

   public void a(double var1, double var3, double var5) {
      this.v = var1;
      this.w = var3;
      this.x = var5;
      if (this.B == 0.0F && this.A == 0.0F) {
         float var7 = me.a(var1 * var1 + var5 * var5);
         this.A = this.y = (float)(Math.atan2(var1, var5) * (double)180.0F / (double)(float)Math.PI);
         this.B = this.z = (float)(Math.atan2(var3, (double)var7) * (double)180.0F / (double)(float)Math.PI);
         this.B = this.z;
         this.A = this.y;
         this.c(this.s, this.t, this.u, this.y, this.z);
         this.ar = 0;
      }

   }

   public void a() {
      super.a();
      if (this.B == 0.0F && this.A == 0.0F) {
         float var1 = me.a(this.v * this.v + this.x * this.x);
         this.A = this.y = (float)(Math.atan2(this.v, this.x) * (double)180.0F / (double)(float)Math.PI);
         this.B = this.z = (float)(Math.atan2(this.w, (double)var1) * (double)180.0F / (double)(float)Math.PI);
      }

      int var15 = this.o.a(this.e, this.f, this.g);
      if (var15 > 0) {
         yy.k[var15].b((kq)this.o, this.e, this.f, this.g);
         c var2 = yy.k[var15].b(this.o, this.e, this.f, this.g);
         if (var2 != null && var2.a(fb.b(this.s, this.t, this.u))) {
            this.aq = true;
         }
      }

      if (this.b > 0) {
         --this.b;
      }

      if (this.aq) {
         var15 = this.o.a(this.e, this.f, this.g);
         int var21 = this.o.d(this.e, this.f, this.g);
         if (var15 == this.h && var21 == this.i) {
            ++this.ar;
            if (this.ar == 1200) {
               this.v();
            }

         } else {
            this.aq = false;
            this.v *= (double)(this.Y.nextFloat() * 0.2F);
            this.w *= (double)(this.Y.nextFloat() * 0.2F);
            this.x *= (double)(this.Y.nextFloat() * 0.2F);
            this.ar = 0;
            this.as = 0;
         }
      } else {
         ++this.as;
         fb var16 = fb.b(this.s, this.t, this.u);
         fb var19 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
         gv var3 = this.o.a(var16, var19, false, true);
         var16 = fb.b(this.s, this.t, this.u);
         var19 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
         if (var3 != null) {
            var19 = fb.b(var3.f.a, var3.f.b, var3.f.c);
         }

         ia var4 = null;
         List var5 = this.o.b((ia)this, (c)this.C.a(this.v, this.w, this.x).b((double)1.0F, (double)1.0F, (double)1.0F));
         double var6 = (double)0.0F;

         for(int var8 = 0; var8 < var5.size(); ++var8) {
            ia var9 = (ia)var5.get(var8);
            if (var9.e_() && (var9 != this.c || this.as >= 5)) {
               float var10 = 0.3F;
               c var11 = var9.C.b((double)var10, (double)var10, (double)var10);
               gv var12 = var11.a(var16, var19);
               if (var12 != null) {
                  double var13 = var16.d(var12.f);
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
               float var22 = me.a(this.v * this.v + this.w * this.w + this.x * this.x);
               int var26 = (int)Math.ceil((double)var22 * (double)2.0F);
               if (this.d) {
                  var26 += this.Y.nextInt(var26 / 2 + 2);
               }

               Object var28 = null;
               pm var29;
               if (this.c == null) {
                  var29 = pm.a((ro)this, this);
               } else {
                  var29 = pm.a(this, this.c);
               }

               if (var3.g.a(var29, var26)) {
                  if (var3.g instanceof nq) {
                     ++((nq)var3.g).bf;
                  }

                  this.o.a(this, "random.bowhit", 1.0F, 1.2F / (this.Y.nextFloat() * 0.2F + 0.9F));
                  this.v();
               } else {
                  this.v *= (double)-0.1F;
                  this.w *= (double)-0.1F;
                  this.x *= (double)-0.1F;
                  this.y += 180.0F;
                  this.A += 180.0F;
                  this.as = 0;
               }
            } else {
               this.e = var3.b;
               this.f = var3.c;
               this.g = var3.d;
               this.h = this.o.a(this.e, this.f, this.g);
               this.i = this.o.d(this.e, this.f, this.g);
               this.v = (double)((float)(var3.f.a - this.s));
               this.w = (double)((float)(var3.f.b - this.t));
               this.x = (double)((float)(var3.f.c - this.u));
               float var23 = me.a(this.v * this.v + this.w * this.w + this.x * this.x);
               this.s -= this.v / (double)var23 * (double)0.05F;
               this.t -= this.w / (double)var23 * (double)0.05F;
               this.u -= this.x / (double)var23 * (double)0.05F;
               this.o.a(this, "random.bowhit", 1.0F, 1.2F / (this.Y.nextFloat() * 0.2F + 0.9F));
               this.aq = true;
               this.b = 7;
               this.d = false;
            }
         }

         if (this.d) {
            for(int var24 = 0; var24 < 4; ++var24) {
               this.o.a("crit", this.s + this.v * (double)var24 / (double)4.0F, this.t + this.w * (double)var24 / (double)4.0F, this.u + this.x * (double)var24 / (double)4.0F, -this.v, -this.w + 0.2, -this.x);
            }
         }

         this.s += this.v;
         this.t += this.w;
         this.u += this.x;
         float var25 = me.a(this.v * this.v + this.x * this.x);
         this.y = (float)(Math.atan2(this.v, this.x) * (double)180.0F / (double)(float)Math.PI);

         for(this.z = (float)(Math.atan2(this.w, (double)var25) * (double)180.0F / (double)(float)Math.PI); this.z - this.B < -180.0F; this.B -= 360.0F) {
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
         float var27 = 0.99F;
         float var30 = 0.05F;
         if (this.D()) {
            for(int var31 = 0; var31 < 4; ++var31) {
               float var32 = 0.25F;
               this.o.a("bubble", this.s - this.v * (double)var32, this.t - this.w * (double)var32, this.u - this.x * (double)var32, this.v, this.w, this.x);
            }

            var27 = 0.8F;
         }

         this.v *= (double)var27;
         this.w *= (double)var27;
         this.x *= (double)var27;
         this.w -= (double)var30;
         this.d(this.s, this.t, this.u);
      }
   }

   public void a(ik var1) {
      var1.a("xTile", (short)this.e);
      var1.a("yTile", (short)this.f);
      var1.a("zTile", (short)this.g);
      var1.a("inTile", (byte)this.h);
      var1.a("inData", (byte)this.i);
      var1.a("shake", (byte)this.b);
      var1.a("inGround", (byte)(this.aq ? 1 : 0));
      var1.a("player", this.a);
   }

   public void b(ik var1) {
      this.e = var1.d("xTile");
      this.f = var1.d("yTile");
      this.g = var1.d("zTile");
      this.h = var1.c("inTile") & 255;
      this.i = var1.c("inData") & 255;
      this.b = var1.c("shake") & 255;
      this.aq = var1.c("inGround") == 1;
      this.a = var1.m("player");
   }

   public void a(vi var1) {
      if (!this.o.I) {
         if (this.aq && this.a && this.b <= 0 && var1.by.a(new dk(acy.k, 1))) {
            this.o.a(this, "random.pop", 0.2F, ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.a((ia)this, 1);
            this.v();
         }

      }
   }

   public float i_() {
      return 0.0F;
   }
}
