package net.minecraft.client;

public class zb extends vi {
   private boolean b = false;
   private int c;
   private double d;
   private double e;
   private double f;
   private double g;
   private double h;
   float a = 0.0F;

   public zb(ry var1, String var2) {
      super(var1);
      this.bJ = var2;
      this.L = 0.0F;
      this.V = 0.0F;
      if (var2 != null && var2.length() > 0) {
         this.ad = "http://s3.amazonaws.com/MinecraftSkins/" + var2 + ".png";
      }

      this.W = true;
      this.bW = 0.25F;
      this.k = (double)10.0F;
   }

   protected void aF() {
      this.L = 0.0F;
   }

   public boolean a(pm var1, int var2) {
      return true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.d = var1;
      this.e = var3;
      this.f = var5;
      this.g = (double)var7;
      this.h = (double)var8;
      this.c = var9;
   }

   public void a() {
      this.bW = 0.0F;
      super.a();
      this.ba = this.bb;
      double var1 = this.s - this.p;
      double var3 = this.u - this.r;
      float var5 = me.a(var1 * var1 + var3 * var3) * 4.0F;
      if (var5 > 1.0F) {
         var5 = 1.0F;
      }

      this.bb += (var5 - this.bb) * 0.4F;
      this.bc += this.bb;
      if (!this.b && this.Y() && this.by.a[this.by.c] != null) {
         dk var6 = this.by.a[this.by.c];
         this.c(this.by.a[this.by.c], acy.d[var6.c].b(var6));
         this.b = true;
      } else if (this.b && !this.Y()) {
         this.aC();
         this.b = false;
      }

   }

   public float i_() {
      return 0.0F;
   }

   public void c() {
      super.n();
      if (this.c > 0) {
         double var1 = this.s + (this.d - this.s) / (double)this.c;
         double var3 = this.t + (this.e - this.t) / (double)this.c;
         double var5 = this.u + (this.f - this.u) / (double)this.c;

         double var7;
         for(var7 = this.g - (double)this.y; var7 < (double)-180.0F; var7 += (double)360.0F) {
         }

         while(var7 >= (double)180.0F) {
            var7 -= (double)360.0F;
         }

         this.y = (float)((double)this.y + var7 / (double)this.c);
         this.z = (float)((double)this.z + (this.h - (double)this.z) / (double)this.c);
         --this.c;
         this.d(var1, var3, var5);
         this.b(this.y, this.z);
      }

      this.bF = this.bG;
      float var9 = me.a(this.v * this.v + this.x * this.x);
      float var2 = (float)Math.atan(-this.w * (double)0.2F) * 15.0F;
      if (var9 > 0.1F) {
         var9 = 0.1F;
      }

      if (!this.D || this.ag() <= 0) {
         var9 = 0.0F;
      }

      if (this.D || this.ag() <= 0) {
         var2 = 0.0F;
      }

      this.bG += (var9 - this.bG) * 0.4F;
      this.aV += (var2 - this.aV) * 0.8F;
   }

   public void c(int var1, int var2, int var3) {
      dk var4 = null;
      if (var2 >= 0) {
         var4 = new dk(var2, 1, var3);
      }

      if (var1 == 0) {
         this.by.a[this.by.c] = var4;
      } else {
         this.by.b[var1 - 1] = var4;
      }

   }

   public void r() {
   }

   public float E() {
      return 1.82F;
   }
}
