package net.minecraft.client;

import java.util.Random;

public class pl extends ig {
   public boolean a(ry var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 64; ++var6) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if (var1.h(var7, var8, var9) && var1.a(var7, var8 - 1, var9) == yy.bb.bM) {
            var1.g(var7, var8, var9, yy.ar.bM);
         }
      }

      return true;
   }
}
