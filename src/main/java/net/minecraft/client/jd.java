package net.minecraft.client;

public class jd extends wc {
   public jd(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4 - (double)0.125F, var6, var8, var10, var12);
      this.h = 0.4F;
      this.i = 0.4F;
      this.aq = 0.7F;
      this.c(0);
      this.a(0.01F, 0.01F);
      this.f *= this.Y.nextFloat() * 0.6F + 0.2F;
      this.v = var8 * (double)0.0F;
      this.w = var10 * (double)0.0F;
      this.x = var12 * (double)0.0F;
      this.e = (int)((double)16.0F / (Math.random() * 0.8 + 0.2));
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      this.b(this.v, this.w, this.x);
      if (this.o.e(net.minecraft.client.me.c(this.s), net.minecraft.client.me.c(this.t), net.minecraft.client.me.c(this.u)) != net.minecraft.client.p.g) {
         this.v();
      }

      if (this.e-- <= 0) {
         this.v();
      }

   }
}
