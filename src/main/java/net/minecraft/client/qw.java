package net.minecraft.client;

public class qw extends fm {
   public qw(ry var1) {
      super(var1);
   }

   public qw(ry var1, nq var2) {
      super(var1, var2);
   }

   public qw(ry var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void a(gv var1) {
      if (var1.g != null && var1.g.a(pm.a((ia)this, this.c), 0)) {
      }

      if (!this.o.I && this.Y.nextInt(8) == 0) {
         byte var2 = 1;
         if (this.Y.nextInt(32) == 0) {
            var2 = 4;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            qh var4 = new qh(this.o);
            var4.b(-24000);
            var4.c(this.s, this.t, this.u, this.y, 0.0F);
            this.o.a((ia)var4);
         }
      }

      for(int var5 = 0; var5 < 8; ++var5) {
         this.o.a("snowballpoof", this.s, this.t, this.u, (double)0.0F, (double)0.0F, (double)0.0F);
      }

      if (!this.o.I) {
         this.v();
      }

   }
}
