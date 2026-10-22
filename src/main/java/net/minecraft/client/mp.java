package net.minecraft.client;

public class mp extends wc {
   private yy a;

   public mp(ry var1, double var2, double var4, double var6, double var8, double var10, double var12, yy var14, int var15, int var16) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.a = var14;
      this.c(var14.a(0, var16));
      this.g = var14.bY;
      this.h = this.i = this.aq = 0.6F;
      this.f /= 2.0F;
   }

   public mp a(int var1, int var2, int var3) {
      if (this.a == yy.u) {
         return this;
      } else {
         int var4 = this.a.a((kq)this.o, var1, var2, var3);
         this.h *= (float)(var4 >> 16 & 255) / 255.0F;
         this.i *= (float)(var4 >> 8 & 255) / 255.0F;
         this.aq *= (float)(var4 & 255) / 255.0F;
         return this;
      }
   }

   public int g() {
      return 1;
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)(this.k() % 16) + this.b / 4.0F) / 16.0F;
      float var9 = var8 + 0.015609375F;
      float var10 = ((float)(this.k() / 16) + this.c / 4.0F) / 16.0F;
      float var11 = var10 + 0.015609375F;
      float var12 = 0.1F * this.f;
      float var13 = (float)(this.p + (this.s - this.p) * (double)var2 - ar);
      float var14 = (float)(this.q + (this.t - this.q) * (double)var2 - as);
      float var15 = (float)(this.r + (this.u - this.r) * (double)var2 - at);
      float var16 = 1.0F;
      var1.a(var16 * this.h, var16 * this.i, var16 * this.aq);
      var1.a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var8, (double)var11);
      var1.a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var9, (double)var11);
   }
}
