package net.minecraft.client;

public class tm extends fm {
   public tm(ry var1) {
      super(var1);
   }

   public tm(ry var1, nq var2) {
      super(var1, var2);
   }

   public tm(ry var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void a(gv var1) {
      if (var1.g != null && var1.g.a(pm.a((ia)this, this.c), 0)) {
      }

      for(int var2 = 0; var2 < 32; ++var2) {
         this.o.a("portal", this.s, this.t + this.Y.nextDouble() * (double)2.0F, this.u, this.Y.nextGaussian(), (double)0.0F, this.Y.nextGaussian());
      }

      if (!this.o.I) {
         if (this.c != null) {
            this.c.i(this.s, this.t, this.u);
            this.c.Q = 0.0F;
            this.c.a((pm)pm.h, 5);
         }

         this.v();
      }

   }
}
