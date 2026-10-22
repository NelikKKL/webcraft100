package net.minecraft.client;

public class aw extends wc {
   private float a;

   public aw(ry var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, (double)0.0F, (double)0.0F, (double)0.0F);
      this.v *= (double)0.8F;
      this.w *= (double)0.8F;
      this.x *= (double)0.8F;
      this.w = (double)(this.Y.nextFloat() * 0.4F + 0.05F);
      this.h = this.i = this.aq = 1.0F;
      this.f *= this.Y.nextFloat() * 2.0F + 0.2F;
      this.a = this.f;
      this.e = (int)((double)16.0F / (Math.random() * 0.8 + 0.2));
      this.W = false;
      this.c(49);
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
      short var4 = 240;
      int var5 = var3 >> 16 & 255;
      return var4 | var5 << 16;
   }

   public float b(float var1) {
      return 1.0F;
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.d + var2) / (float)this.e;
      this.f = this.a * (1.0F - var8 * var8);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      if (this.d++ >= this.e) {
         this.v();
      }

      float var1 = (float)this.d / (float)this.e;
      if (this.Y.nextFloat() > var1) {
         this.o.a("smoke", this.s, this.t, this.u, this.v, this.w, this.x);
      }

      this.w -= 0.03;
      this.b(this.v, this.w, this.x);
      this.v *= (double)0.999F;
      this.w *= (double)0.999F;
      this.x *= (double)0.999F;
      if (this.D) {
         this.v *= (double)0.7F;
         this.x *= (double)0.7F;
      }

   }
}
