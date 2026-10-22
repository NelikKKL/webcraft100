package net.minecraft.client;

public class pq extends wc {
   public pq(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.h = 1.0F;
      this.i = 1.0F;
      this.aq = 1.0F;
      this.c(32);
      this.a(0.02F, 0.02F);
      this.f *= this.Y.nextFloat() * 0.6F + 0.2F;
      this.v = var8 * (double)0.2F + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.02F);
      this.w = var10 * (double)0.2F + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.02F);
      this.x = var12 * (double)0.2F + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.02F);
      this.e = (int)((double)8.0F / (Math.random() * 0.8 + 0.2));
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      this.w += 0.002;
      this.b(this.v, this.w, this.x);
      this.v *= (double)0.85F;
      this.w *= (double)0.85F;
      this.x *= (double)0.85F;
      if (this.o.e(net.minecraft.client.me.c(this.s), net.minecraft.client.me.c(this.t), net.minecraft.client.me.c(this.u)) != net.minecraft.client.p.g) {
         this.v();
      }

      if (this.e-- <= 0) {
         this.v();
      }

   }
}
