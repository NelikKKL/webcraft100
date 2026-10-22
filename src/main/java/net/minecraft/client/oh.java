package net.minecraft.client;

import java.util.Random;

public class oh extends ig {
   private int a;

   public oh(int var1) {
      this.a = var1;
   }

   public boolean a(ry var1, Random var2, int var3, int var4, int var5) {
      if (var1.h(var3, var4, var5) && var1.a(var3, var4 - 1, var5) == this.a) {
         int var6 = var2.nextInt(32) + 6;
         int var7 = var2.nextInt(4) + 1;

         for(int var8 = var3 - var7; var8 <= var3 + var7; ++var8) {
            for(int var9 = var5 - var7; var9 <= var5 + var7; ++var9) {
               int var10 = var8 - var3;
               int var11 = var9 - var5;
               if (var10 * var10 + var11 * var11 <= var7 * var7 + 1 && var1.a(var8, var4 - 1, var9) != this.a) {
                  return false;
               }
            }
         }

         for(int var13 = var4; var13 < var4 + var6 && var13 < var1.c; ++var13) {
            for(int var15 = var3 - var7; var15 <= var3 + var7; ++var15) {
               for(int var16 = var5 - var7; var16 <= var5 + var7; ++var16) {
                  int var17 = var15 - var3;
                  int var12 = var16 - var5;
                  if (var17 * var17 + var12 * var12 <= var7 * var7 + 1) {
                     var1.g(var15, var13, var16, yy.ap.bM);
                  }
               }
            }
         }

         sf var14 = new sf(var1);
         ((ia)var14).c((double)((float)var3 + 0.5F), (double)(var4 + var6), (double)((float)var5 + 0.5F), var2.nextFloat() * 360.0F, 0.0F);
         var1.a((ia)var14);
         var1.g(var3, var4 + var6, var5, yy.z.bM);
         return true;
      } else {
         return false;
      }
   }
}
