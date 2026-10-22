package net.minecraft.client;

import java.util.Random;

public class js extends wg {
   protected js(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.2F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
      this.b(true);
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(25) == 0) {
         byte var6 = 4;
         int var7 = 5;

         for(int var8 = var2 - var6; var8 <= var2 + var6; ++var8) {
            for(int var9 = var4 - var6; var9 <= var4 + var6; ++var9) {
               for(int var10 = var3 - 1; var10 <= var3 + 1; ++var10) {
                  if (var1.a(var8, var10, var9) == this.bM) {
                     --var7;
                     if (var7 <= 0) {
                        return;
                     }
                  }
               }
            }
         }

         int var12 = var2 + var5.nextInt(3) - 1;
         int var13 = var3 + var5.nextInt(2) - var5.nextInt(2);
         int var14 = var4 + var5.nextInt(3) - 1;

         for(int var11 = 0; var11 < 4; ++var11) {
            if (var1.h(var12, var13, var14) && this.e(var1, var12, var13, var14)) {
               var2 = var12;
               var3 = var13;
               var4 = var14;
            }

            var12 = var2 + var5.nextInt(3) - 1;
            var13 = var3 + var5.nextInt(2) - var5.nextInt(2);
            var14 = var4 + var5.nextInt(3) - 1;
         }

         if (var1.h(var12, var13, var14) && this.e(var1, var12, var13, var14)) {
            var1.g(var12, var13, var14, this.bM);
         }
      }

   }

   protected boolean d(int var1) {
      return yy.m[var1];
   }

   public boolean e(ry var1, int var2, int var3, int var4) {
      if (var3 >= 0 && var3 < var1.c) {
         int var5 = var1.a(var2, var3 - 1, var4);
         return var5 == yy.by.bM || var1.m(var2, var3, var4) < 13 && this.d(var5);
      } else {
         return false;
      }
   }

   public boolean c(ry var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.d(var2, var3, var4);
      var1.d(var2, var3, var4, 0);
      acp var7 = null;
      if (this.bM == yy.af.bM) {
         var7 = new acp(0);
      } else if (this.bM == yy.ag.bM) {
         var7 = new acp(1);
      }

      if (var7 != null && ((ig)var7).a(var1, var5, var2, var3, var4)) {
         return true;
      } else {
         var1.b(var2, var3, var4, this.bM, var6);
         return false;
      }
   }
}
