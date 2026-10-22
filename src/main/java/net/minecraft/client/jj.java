package net.minecraft.client;

import java.util.Random;

public class jj extends ig {
   public boolean a(ry var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 10; ++var6) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if (var1.h(var7, var8, var9) && yy.bz.c(var1, var7, var8, var9)) {
            var1.d(var7, var8, var9, yy.bz.bM);
         }
      }

      return true;
   }
}
