package net.minecraft.client;

public class st extends wc {
   private p a;
   private int au;

   public st(ry var1, double var2, double var4, double var6, p var8) {
      super(var1, var2, var4, var6, (double)0.0F, (double)0.0F, (double)0.0F);
      this.v = this.w = this.x = (double)0.0F;
      if (var8 == net.minecraft.client.p.g) {
         this.h = 0.0F;
         this.i = 0.0F;
         this.aq = 1.0F;
      } else {
         this.h = 1.0F;
         this.i = 0.0F;
         this.aq = 0.0F;
      }

      this.c(113);
      this.a(0.01F, 0.01F);
      this.g = 0.06F;
      this.a = var8;
      this.au = 40;
      this.e = (int)((double)64.0F / (Math.random() * 0.8 + 0.2));
      this.v = this.w = this.x = (double)0.0F;
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public int a(float var1) {
      return this.a == net.minecraft.client.p.g ? super.a(var1) : 257;
   }

   public float b(float var1) {
      return this.a == net.minecraft.client.p.g ? super.b(var1) : 1.0F;
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      if (this.a == net.minecraft.client.p.g) {
         this.h = 0.2F;
         this.i = 0.3F;
         this.aq = 1.0F;
      } else {
         this.h = 1.0F;
         this.i = 16.0F / (float)(40 - this.au + 16);
         this.aq = 4.0F / (float)(40 - this.au + 8);
      }

      this.w -= (double)this.g;
      if (this.au-- > 0) {
         this.v *= 0.02;
         this.w *= 0.02;
         this.x *= 0.02;
         this.c(113);
      } else {
         this.c(112);
      }

      this.b(this.v, this.w, this.x);
      this.v *= (double)0.98F;
      this.w *= (double)0.98F;
      this.x *= (double)0.98F;
      if (this.e-- <= 0) {
         this.v();
      }

      if (this.D) {
         if (this.a == net.minecraft.client.p.g) {
            this.v();
            this.o.a("splash", this.s, this.t, this.u, (double)0.0F, (double)0.0F, (double)0.0F);
         } else {
            this.c(114);
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
