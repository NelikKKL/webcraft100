package net.minecraft.client;

public class afn extends wc {
   private float a;
   private double au;
   private double av;
   private double aw;

   public afn(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.v = var8;
      this.w = var10;
      this.x = var12;
      this.au = this.s = var2;
      this.av = this.t = var4;
      this.aw = this.u = var6;
      float var14 = this.Y.nextFloat() * 0.6F + 0.4F;
      this.a = this.f = this.Y.nextFloat() * 0.5F + 0.2F;
      this.h = this.i = this.aq = 1.0F * var14;
      this.i *= 0.9F;
      this.h *= 0.9F;
      this.e = (int)(Math.random() * (double)10.0F) + 30;
      this.W = true;
      this.c((int)(Math.random() * (double)26.0F + (double)1.0F + (double)224.0F));
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public int a(float var1) {
      int var2 = super.a(var1);
      float var3 = (float)this.d / (float)this.e;
      var3 *= var3;
      var3 *= var3;
      int var4 = var2 & 255;
      int var5 = var2 >> 16 & 255;
      var5 += (int)(var3 * 15.0F * 16.0F);
      if (var5 > 240) {
         var5 = 240;
      }

      return var4 | var5 << 16;
   }

   public float b(float var1) {
      float var2 = super.b(var1);
      float var3 = (float)this.d / (float)this.e;
      var3 *= var3;
      var3 *= var3;
      return var2 * (1.0F - var3) + var3;
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      float var1 = (float)this.d / (float)this.e;
      var1 = 1.0F - var1;
      float var2 = 1.0F - var1;
      var2 *= var2;
      var2 *= var2;
      this.s = this.au + this.v * (double)var1;
      this.t = this.av + this.w * (double)var1 - (double)(var2 * 1.2F);
      this.u = this.aw + this.x * (double)var1;
      if (this.d++ >= this.e) {
         this.v();
      }

   }
}
