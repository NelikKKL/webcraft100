package net.minecraft.client;

import java.util.Random;

public class mb extends ig {
   private int a;

   public mb(int var1) {
      this.a = var1;
   }

   public boolean a(ry var1, Random var2, int var3, int var4, int var5) {
      int var11;
      for(var11 = 0; ((var11 = var1.a(var3, var4, var5)) == 0 || var11 == yy.K.bM) && var4 > 0; --var4) {
      }

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var9 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var10 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if (var1.h(var8, var9, var10) && ((wg)yy.k[this.a]).e(var1, var8, var9, var10)) {
            var1.d(var8, var9, var10, this.a);
         }
      }

      return true;
   }
}
