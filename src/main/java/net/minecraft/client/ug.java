package net.minecraft.client;

public class ug extends wc {
   public ug(ry var1, double var2, double var4, double var6, acy var8) {
      super(var1, var2, var4, var6, (double)0.0F, (double)0.0F, (double)0.0F);
      this.c(var8.a(0));
      this.h = this.i = this.aq = 1.0F;
      this.g = yy.aU.bY;
      this.f /= 2.0F;
   }

   public ug(ry var1, double var2, double var4, double var6, double var8, double var10, double var12, acy var14) {
      this(var1, var2, var4, var6, var14);
      this.v *= (double)0.1F;
      this.w *= (double)0.1F;
      this.x *= (double)0.1F;
      this.v += var8;
      this.w += var10;
      this.x += var12;
   }

   public int g() {
      return 2;
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
