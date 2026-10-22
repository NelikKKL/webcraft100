package net.minecraft.client;

public abstract class ww extends nq {
   private dw a;
   protected ia h;
   protected boolean i = false;
   protected int by = 0;

   public ww(ry var1) {
      super(var1);
   }

   protected boolean az() {
      return false;
   }

   protected void n() {
      pf.a("ai");
      if (this.by > 0) {
         --this.by;
      }

      this.i = this.az();
      float var1 = 16.0F;
      if (this.h == null) {
         this.h = this.o();
         if (this.h != null) {
            this.a = this.o.a(this, this.h, var1);
         }
      } else if (!this.h.K()) {
         this.h = null;
      } else {
         float var2 = this.h.c((ia)this);
         if (this.i(this.h)) {
            this.a(this.h, var2);
         } else {
            this.b(this.h, var2);
         }
      }

      pf.b();
      if (this.i || this.h == null || this.a != null && this.Y.nextInt(20) != 0) {
         if (!this.i && (this.a == null && this.Y.nextInt(180) == 0 || this.Y.nextInt(120) == 0 || this.by > 0) && this.bq < 100) {
            this.aA();
         }
      } else {
         this.a = this.o.a(this, this.h, var1);
      }

      int var21 = me.c(this.C.b + (double)0.5F);
      boolean var3 = this.D();
      boolean var4 = this.F();
      this.z = 0.0F;
      if (this.a != null && this.Y.nextInt(100) != 0) {
         pf.a("followpath");
         fb var5 = this.a.a(this);
         double var6 = (double)(this.M * 2.0F);

         while(var5 != null && var5.d(this.s, var5.b, this.u) < var6 * var6) {
            this.a.a();
            if (this.a.b()) {
               var5 = null;
               this.a = null;
            } else {
               var5 = this.a.a(this);
            }
         }

         this.bu = false;
         if (var5 != null) {
            double var8 = var5.a - this.s;
            double var10 = var5.c - this.u;
            double var12 = var5.b - (double)var21;
            float var14 = (float)(Math.atan2(var10, var8) * (double)180.0F / (double)(float)Math.PI) - 90.0F;
            float var15 = var14 - this.y;

            for(this.bs = this.bw; var15 < -180.0F; var15 += 360.0F) {
            }

            while(var15 >= 180.0F) {
               var15 -= 360.0F;
            }

            if (var15 > 30.0F) {
               var15 = 30.0F;
            }

            if (var15 < -30.0F) {
               var15 = -30.0F;
            }

            this.y += var15;
            if (this.i && this.h != null) {
               double var16 = this.h.s - this.s;
               double var18 = this.h.u - this.u;
               float var20 = this.y;
               this.y = (float)(Math.atan2(var18, var16) * (double)180.0F / (double)(float)Math.PI) - 90.0F;
               var15 = (var20 - this.y + 90.0F) * (float)Math.PI / 180.0F;
               this.br = -me.a(var15) * this.bs * 1.0F;
               this.bs = me.b(var15) * this.bs * 1.0F;
            }

            if (var12 > (double)0.0F) {
               this.bu = true;
            }
         }

         if (this.h != null) {
            this.a(this.h, 30.0F, 30.0F);
         }

         if (this.E && !this.aB()) {
            this.bu = true;
         }

         if (this.Y.nextFloat() < 0.8F && (var3 || var4)) {
            this.bu = true;
         }

         pf.b();
      } else {
         super.n();
         this.a = null;
      }
   }

   protected void aA() {
      pf.a("stroll");
      boolean var1 = false;
      int var2 = -1;
      int var3 = -1;
      int var4 = -1;
      float var5 = -99999.0F;

      for(int var6 = 0; var6 < 10; ++var6) {
         int var7 = me.c(this.s + (double)this.Y.nextInt(13) - (double)6.0F);
         int var8 = me.c(this.t + (double)this.Y.nextInt(7) - (double)3.0F);
         int var9 = me.c(this.u + (double)this.Y.nextInt(13) - (double)6.0F);
         float var10 = this.a(var7, var8, var9);
         if (var10 > var5) {
            var5 = var10;
            var2 = var7;
            var3 = var8;
            var4 = var9;
            var1 = true;
         }
      }

      if (var1) {
         this.a = this.o.a(this, var2, var3, var4, 10.0F);
      }

      pf.b();
   }

   protected void a(ia var1, float var2) {
   }

   protected void b(ia var1, float var2) {
   }

   protected float a(int var1, int var2, int var3) {
      return 0.0F;
   }

   protected ia o() {
      return null;
   }

   public boolean i() {
      int var1 = me.c(this.s);
      int var2 = me.c(this.C.b);
      int var3 = me.c(this.u);
      return super.i() && this.a(var1, var2, var3) >= 0.0F;
   }

   public boolean aB() {
      return this.a != null;
   }

   public void a(dw var1) {
      this.a = var1;
   }

   public ia aC() {
      return this.h;
   }

   public void a(ia var1) {
      this.h = var1;
   }

   protected float aw() {
      float var1 = super.aw();
      if (this.by > 0) {
         var1 *= 2.0F;
      }

      return var1;
   }
}
