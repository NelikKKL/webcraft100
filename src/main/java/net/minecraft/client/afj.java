package net.minecraft.client;

public class afj extends wc {
   private boolean au;
   float a;

   public afj(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   public afj(ry var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, (double)0.0F, (double)0.0F, (double)0.0F);
      this.au = true;
      this.v *= (double)0.1F;
      this.w *= (double)0.1F;
      this.x *= (double)0.1F;
      this.v += var8 * 0.4;
      this.w += var10 * 0.4;
      this.x += var12 * 0.4;
      this.h = this.i = this.aq = (float)(Math.random() * (double)0.3F + (double)0.6F);
      this.f *= 0.75F;
      this.f *= var14;
      this.a = this.f;
      this.e = (int)((double)6.0F / (Math.random() * 0.8 + 0.6));
      this.e = (int)((float)this.e * var14);
      this.W = false;
      this.c(65);
      this.a();
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (this.au) {
         float var8 = ((float)this.d + var2) / (float)this.e * 32.0F;
         if (var8 < 0.0F) {
            var8 = 0.0F;
         }

         if (var8 > 1.0F) {
            var8 = 1.0F;
         }

         this.f = this.a * var8;
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      if (this.d++ >= this.e) {
         this.v();
      }

      this.b(this.v, this.w, this.x);
      this.i = (float)((double)this.i * 0.96);
      this.aq = (float)((double)this.aq * 0.9);
      this.v *= (double)0.7F;
      this.w *= (double)0.7F;
      this.x *= (double)0.7F;
      this.w -= (double)0.02F;
      if (this.D) {
         this.v *= (double)0.7F;
         this.x *= (double)0.7F;
      }

   }
}
