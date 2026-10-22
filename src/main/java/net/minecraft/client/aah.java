package net.minecraft.client;

public class aah extends fm {
   public aah(ry var1) {
      super(var1);
   }

   public aah(ry var1, nq var2) {
      super(var1, var2);
   }

   public aah(ry var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void a(gv var1) {
      if (var1.g != null) {
         byte var2 = 0;
         if (var1.g instanceof qf) {
            var2 = 3;
         }

         if (var1.g.a(pm.a((ia)this, this.c), var2)) {
         }
      }

      for(int var3 = 0; var3 < 8; ++var3) {
         this.o.a("snowballpoof", this.s, this.t, this.u, (double)0.0F, (double)0.0F, (double)0.0F);
      }

      if (!this.o.I) {
         this.v();
      }

   }
}
