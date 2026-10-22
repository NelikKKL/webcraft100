package net.minecraft.client;

public class cn extends wc {
   public cn(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      float var14 = this.Y.nextFloat() * 0.1F + 0.2F;
      this.h = var14;
      this.i = var14;
      this.aq = var14;
      this.c(0);
      this.a(0.02F, 0.02F);
      this.f *= this.Y.nextFloat() * 0.6F + 0.5F;
      this.v *= (double)0.02F;
      this.w *= (double)0.02F;
      this.x *= (double)0.02F;
      this.e = (int)((double)20.0F / (Math.random() * 0.8 + 0.2));
      this.W = true;
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      this.b(this.v, this.w, this.x);
      this.v *= 0.99;
      this.w *= 0.99;
      this.x *= 0.99;
      if (this.e-- <= 0) {
         this.v();
      }

   }
}
