package net.minecraft.client;

public class fk extends ia {
   public int a;
   public int b = 0;
   public int c;
   private int d = 5;
   private int e;

   public fk(ry var1, double var2, double var4, double var6, int var8) {
      super(var1);
      this.a(0.5F, 0.5F);
      this.L = this.N / 2.0F;
      this.d(var2, var4, var6);
      this.y = (float)(Math.random() * (double)360.0F);
      this.v = (double)((float)(Math.random() * (double)0.2F - (double)0.1F) * 2.0F);
      this.w = (double)((float)(Math.random() * 0.2) * 2.0F);
      this.x = (double)((float)(Math.random() * (double)0.2F - (double)0.1F) * 2.0F);
      this.e = var8;
   }

   protected boolean d_() {
      return false;
   }

   public fk(ry var1) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.L = this.N / 2.0F;
   }

   protected void b() {
   }

   public int a(float var1) {
      float var2 = 0.5F;
      if (var2 < 0.0F) {
         var2 = 0.0F;
      }

      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      int var3 = super.a(var1);
      int var4 = var3 & 255;
      int var5 = var3 >> 16 & 255;
      var4 += (int)(var2 * 15.0F * 16.0F);
      if (var4 > 240) {
         var4 = 240;
      }

      return var4 | var5 << 16;
   }

   public void a() {
      super.a();
      if (this.c > 0) {
         --this.c;
      }

      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      this.w -= (double)0.03F;
      if (this.o.e(net.minecraft.client.me.c(this.s), net.minecraft.client.me.c(this.t), net.minecraft.client.me.c(this.u)) == net.minecraft.client.p.h) {
         this.w = (double)0.2F;
         this.v = (double)((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F);
         this.x = (double)((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F);
         this.o.a(this, "random.fizz", 0.4F, 2.0F + this.Y.nextFloat() * 0.4F);
      }

      this.c(this.s, (this.C.b + this.C.e) / (double)2.0F, this.u);
      double var1 = (double)8.0F;
      vi var3 = this.o.a(this, var1);
      if (var3 != null) {
         double var4 = (var3.s - this.s) / var1;
         double var6 = (var3.t + (double)var3.E() - this.t) / var1;
         double var8 = (var3.u - this.u) / var1;
         double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
         double var12 = (double)1.0F - var10;
         if (var12 > (double)0.0F) {
            var12 *= var12;
            this.v += var4 / var10 * var12 * 0.1;
            this.w += var6 / var10 * var12 * 0.1;
            this.x += var8 / var10 * var12 * 0.1;
         }
      }

      this.b(this.v, this.w, this.x);
      float var14 = 0.98F;
      if (this.D) {
         var14 = 0.58800006F;
         int var5 = this.o.a(me.c(this.s), me.c(this.C.b) - 1, me.c(this.u));
         if (var5 > 0) {
            var14 = yy.k[var5].ca * 0.98F;
         }
      }

      this.v *= (double)var14;
      this.w *= (double)0.98F;
      this.x *= (double)var14;
      if (this.D) {
         this.w *= (double)-0.9F;
      }

      ++this.a;
      ++this.b;
      if (this.b >= 6000) {
         this.v();
      }

   }

   public boolean h_() {
      return this.o.a(this.C, net.minecraft.client.p.g, this);
   }

   protected void a(int var1) {
      this.a(pm.a, var1);
   }

   public boolean a(pm var1, int var2) {
      this.G();
      this.d -= var2;
      if (this.d <= 0) {
         this.v();
      }

      return false;
   }

   public void a(ik var1) {
      var1.a("Health", (short)((byte)this.d));
      var1.a("Age", (short)this.b);
      var1.a("Value", (short)this.e);
   }

   public void b(ik var1) {
      this.d = var1.d("Health") & 255;
      this.b = var1.d("Age");
      this.e = var1.d("Value");
   }

   public void a(vi var1) {
      if (!this.o.I) {
         if (this.c == 0 && var1.bM == 0) {
            var1.bM = 2;
            this.o.a(this, "random.orb", 0.1F, 0.5F * ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.7F + 1.8F));
            var1.a((ia)this, 1);
            var1.k(this.e);
            this.v();
         }

      }
   }

   public int g() {
      return this.e;
   }

   public int h() {
      if (this.e >= 2477) {
         return 10;
      } else if (this.e >= 1237) {
         return 9;
      } else if (this.e >= 617) {
         return 8;
      } else if (this.e >= 307) {
         return 7;
      } else if (this.e >= 149) {
         return 6;
      } else if (this.e >= 73) {
         return 5;
      } else if (this.e >= 37) {
         return 4;
      } else if (this.e >= 17) {
         return 3;
      } else if (this.e >= 7) {
         return 2;
      } else {
         return this.e >= 3 ? 1 : 0;
      }
   }

   public static int b(int var0) {
      if (var0 >= 2477) {
         return 2477;
      } else if (var0 >= 1237) {
         return 1237;
      } else if (var0 >= 617) {
         return 617;
      } else if (var0 >= 307) {
         return 307;
      } else if (var0 >= 149) {
         return 149;
      } else if (var0 >= 73) {
         return 73;
      } else if (var0 >= 37) {
         return 37;
      } else if (var0 >= 17) {
         return 17;
      } else if (var0 >= 7) {
         return 7;
      } else {
         return var0 >= 3 ? 3 : 1;
      }
   }
}
