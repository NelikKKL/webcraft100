package net.minecraft.client;

public class ub extends wc {
   public ub(ry var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, (double)0.0F, (double)0.0F, (double)0.0F);
      this.v *= (double)0.3F;
      this.w = (double)((float)Math.random() * 0.2F + 0.1F);
      this.x *= (double)0.3F;
      this.h = 1.0F;
      this.i = 1.0F;
      this.aq = 1.0F;
      this.c(19 + this.Y.nextInt(4));
      this.a(0.01F, 0.01F);
      this.g = 0.06F;
      this.e = (int)((double)8.0F / (Math.random() * 0.8 + 0.2));
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      this.w -= (double)this.g;
      this.b(this.v, this.w, this.x);
      this.v *= (double)0.98F;
      this.w *= (double)0.98F;
      this.x *= (double)0.98F;
      if (this.e-- <= 0) {
         this.v();
      }

      if (this.D) {
         if (Math.random() < (double)0.5F) {
            this.v();
         }

         this.v *= (double)0.7F;
         this.x *= (double)0.7F;
      }

      p var1 = this.o.e(me.c(this.s), me.c(this.t), me.c(this.u));
      if (var1.a() || var1.b()) {
         double var2 = (double)((float)(me.c(this.t) + 1) - agw.e(this.o.d(me.c(this.s), me.c(this.t), me.c(this.u))));
         if (this.t < var2) {
            this.v();
         }
      }

   }
}
