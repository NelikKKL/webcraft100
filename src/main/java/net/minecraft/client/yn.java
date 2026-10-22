package net.minecraft.client;

public class yn extends aad {
   public yn(ry var1) {
      super(var1);
      this.a(0.3125F, 0.3125F);
   }

   public yn(ry var1, nq var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.a(0.3125F, 0.3125F);
   }

   public yn(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.a(0.3125F, 0.3125F);
   }

   protected void a(gv var1) {
      if (!this.o.I) {
         if (var1.g != null) {
            if (!var1.g.B() && var1.g.a(pm.a((aad)this, this.a), 5)) {
               var1.g.e(5);
            }
         } else {
            int var2 = var1.b;
            int var3 = var1.c;
            int var4 = var1.d;
            switch (var1.e) {
               case 0:
                  --var3;
                  break;
               case 1:
                  ++var3;
                  break;
               case 2:
                  --var4;
                  break;
               case 3:
                  ++var4;
                  break;
               case 4:
                  --var2;
                  break;
               case 5:
                  ++var2;
            }

            if (this.o.h(var2, var3, var4)) {
               this.o.g(var2, var3, var4, yy.ar.bM);
            }
         }

         this.v();
      }

   }

   public boolean e_() {
      return false;
   }

   public boolean a(pm var1, int var2) {
      return false;
   }
}
