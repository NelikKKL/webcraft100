package net.minecraft.client;

public class ae extends wc {
   float a;

   public ae(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 2.0F);
   }

   public ae(ry var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, (double)0.0F, (double)0.0F, (double)0.0F);
      this.v *= (double)0.01F;
      this.w *= (double)0.01F;
      this.x *= (double)0.01F;
      this.w += 0.2;
      this.h = me.a(((float)var8 + 0.0F) * (float)Math.PI * 2.0F) * 0.65F + 0.35F;
      this.i = me.a(((float)var8 + 0.33333334F) * (float)Math.PI * 2.0F) * 0.65F + 0.35F;
      this.aq = me.a(((float)var8 + 0.6666667F) * (float)Math.PI * 2.0F) * 0.65F + 0.35F;
      this.f *= 0.75F;
      this.f *= var14;
      this.a = this.f;
      this.e = 6;
      this.W = false;
      this.c(64);
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

      this.b(this.v, this.w, this.x);
      if (this.t == this.q) {
         this.v *= 1.1;
         this.x *= 1.1;
      }

      this.v *= (double)0.66F;
      this.w *= (double)0.66F;
      this.x *= (double)0.66F;
      if (this.D) {
         this.v *= (double)0.7F;
         this.x *= (double)0.7F;
      }

   }
}
