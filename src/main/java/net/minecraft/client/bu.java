package net.minecraft.client;

import java.util.Random;

public class bu extends ig {
   private int a;

   public bu(int var1) {
      this.a = var1;
   }

   public boolean a(ry var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 64; ++var6) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if (var1.h(var7, var8, var9) && ((wg)yy.k[this.a]).e(var1, var7, var8, var9)) {
            var1.d(var7, var8, var9, this.a);
         }
      }

      return true;
   }
}
