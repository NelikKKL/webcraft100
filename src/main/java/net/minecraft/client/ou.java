package net.minecraft.client;

public class ou extends acy {
   public ou(int var1) {
      super(var1);
      this.bN = 1;
      this.i(64);
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      if (var7 == 0) {
         --var5;
      }

      if (var7 == 1) {
         ++var5;
      }

      if (var7 == 2) {
         --var6;
      }

      if (var7 == 3) {
         ++var6;
      }

      if (var7 == 4) {
         --var4;
      }

      if (var7 == 5) {
         ++var4;
      }

      if (!var2.e(var4, var5, var6)) {
         return false;
      } else {
         int var8 = var3.a(var4, var5, var6);
         if (var8 == 0) {
            var3.a((double)var4 + (double)0.5F, (double)var5 + (double)0.5F, (double)var6 + (double)0.5F, "fire.ignite", 1.0F, c.nextFloat() * 0.4F + 0.8F);
            var3.g(var4, var5, var6, yy.ar.bM);
         }

         var1.a(1, var2);
         return true;
      }
   }
}
