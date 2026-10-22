package net.minecraft.client;

public class kz extends wc {
   float a;

   public kz(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, (double)0.0F, (double)0.0F, (double)0.0F);
      float var14 = 2.5F;
      this.v *= (double)0.1F;
      this.w *= (double)0.1F;
      this.x *= (double)0.1F;
      this.v += var8;
      this.w += var10;
      this.x += var12;
      this.h = this.i = this.aq = 1.0F - (float)(Math.random() * (double)0.3F);
      this.f *= 0.75F;
      this.f *= var14;
      this.a = this.f;
      this.e = (int)((double)8.0F / (Math.random() * 0.8 + 0.3));
      this.e = (int)((float)this.e * var14);
      this.W = false;
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
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

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      if (this.d++ >= this.e) {
         this.v();
      }

      this.c(7 - this.d * 8 / this.e);
      this.b(this.v, this.w, this.x);
      this.v *= (double)0.96F;
      this.w *= (double)0.96F;
      this.x *= (double)0.96F;
      vi var1 = this.o.a(this, (double)2.0F);
      if (var1 != null && this.t > var1.C.b) {
         this.t += (var1.C.b - this.t) * 0.2;
         this.w += (var1.w - this.w) * 0.2;
         this.d(this.s, this.t, this.u);
      }

      if (this.D) {
         this.v *= (double)0.7F;
         this.x *= (double)0.7F;
      }

   }
}
