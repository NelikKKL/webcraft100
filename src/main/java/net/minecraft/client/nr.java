package net.minecraft.client;

public class nr extends wc {
   public nr(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.v = var8 + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.05F);
      this.w = var10 + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.05F);
      this.x = var12 + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.05F);
      this.h = this.i = this.aq = this.Y.nextFloat() * 0.3F + 0.7F;
      this.f = this.Y.nextFloat() * this.Y.nextFloat() * 6.0F + 1.0F;
      this.e = (int)((double)16.0F / ((double)this.Y.nextFloat() * 0.8 + 0.2)) + 2;
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      if (this.d++ >= this.e) {
         this.v();
      }

      this.c(7 - this.d * 8 / this.e);
      this.w += 0.004;
      this.b(this.v, this.w, this.x);
      this.v *= (double)0.9F;
      this.w *= (double)0.9F;
      this.x *= (double)0.9F;
      if (this.D) {
         this.v *= (double)0.7F;
         this.x *= (double)0.7F;
      }

   }
}
