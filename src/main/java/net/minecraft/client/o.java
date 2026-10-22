package net.minecraft.client;

public class o extends wc {
   private float a;

   public o(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.v = this.v * (double)0.01F + var8;
      this.w = this.w * (double)0.01F + var10;
      this.x = this.x * (double)0.01F + var12;
      double var10000 = var2 + (double)((this.Y.nextFloat() - this.Y.nextFloat()) * 0.05F);
      var10000 = var4 + (double)((this.Y.nextFloat() - this.Y.nextFloat()) * 0.05F);
      var10000 = var6 + (double)((this.Y.nextFloat() - this.Y.nextFloat()) * 0.05F);
      this.a = this.f;
      this.h = this.i = this.aq = 1.0F;
      this.e = (int)((double)8.0F / (Math.random() * 0.8 + 0.2)) + 4;
      this.W = true;
      this.c(48);
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.d + var2) / (float)this.e;
      this.f = this.a * (1.0F - var8 * var8 * 0.5F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public int a(float var1) {
      float var2 = ((float)this.d + var1) / (float)this.e;
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

   public float b(float var1) {
      float var2 = ((float)this.d + var1) / (float)this.e;
      if (var2 < 0.0F) {
         var2 = 0.0F;
      }

      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      float var3 = super.b(var1);
      return var3 * var2 + (1.0F - var2);
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      if (this.d++ >= this.e) {
         this.v();
      }

      this.b(this.v, this.w, this.x);
      this.v *= (double)0.96F;
      this.w *= (double)0.96F;
      this.x *= (double)0.96F;
      if (this.D) {
         this.v *= (double)0.7F;
         this.x *= (double)0.7F;
      }

   }
}
