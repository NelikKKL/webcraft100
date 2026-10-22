package net.minecraft.client;

public class sq extends wc {
   private int a = 128;

   public sq(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.w *= (double)0.2F;
      if (var8 == (double)0.0F && var12 == (double)0.0F) {
         this.v *= (double)0.1F;
         this.x *= (double)0.1F;
      }

      this.f *= 0.75F;
      this.e = (int)((double)8.0F / (Math.random() * 0.8 + 0.2));
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

      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      if (this.d++ >= this.e) {
         this.v();
      }

      this.c(this.a + (7 - this.d * 8 / this.e));
      this.w += 0.004;
      this.b(this.v, this.w, this.x);
      if (this.t == this.q) {
         this.v *= 1.1;
         this.x *= 1.1;
      }

      this.v *= (double)0.96F;
      this.w *= (double)0.96F;
      this.x *= (double)0.96F;
      if (this.D) {
         this.v *= (double)0.7F;
         this.x *= (double)0.7F;
      }

   }

   public void b(int var1) {
      this.a = var1;
   }
}
