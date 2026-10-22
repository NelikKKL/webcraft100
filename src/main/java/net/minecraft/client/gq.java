package net.minecraft.client;

import java.util.Random;

public class gq extends ig {
   public gq(boolean var1) {
      super(var1);
   }

   public boolean a(ry var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(3) + 4;
      boolean var7 = true;
      if (var4 >= 1 && var4 + var6 + 1 <= var1.c) {
         for(int var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            byte var9 = 1;
            if (var8 == var4) {
               var9 = 0;
            }

            if (var8 >= var4 + 1 + var6 - 2) {
               var9 = 2;
            }

            for(int var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(int var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if (var8 >= 0 && var8 < var1.c) {
                     int var12 = var1.a(var10, var8, var11);
                     if (var12 != 0 && var12 != yy.K.bM) {
                        var7 = false;
                     }
                  } else {
                     var7 = false;
                  }
               }
            }
         }

         if (!var7) {
            return false;
         } else {
            int var16 = var1.a(var3, var4 - 1, var5);
            if ((var16 == yy.u.bM || var16 == yy.v.bM) && var4 < var1.c - var6 - 1) {
               var1.d(var3, var4 - 1, var5, yy.v.bM);

               for(int var17 = var4 - 3 + var6; var17 <= var4 + var6; ++var17) {
                  int var19 = var17 - (var4 + var6);
                  int var21 = 1 - var19 / 2;

                  for(int var22 = var3 - var21; var22 <= var3 + var21; ++var22) {
                     int var13 = var22 - var3;

                     for(int var14 = var5 - var21; var14 <= var5 + var21; ++var14) {
                        int var15 = var14 - var5;
                        if ((Math.abs(var13) != var21 || Math.abs(var15) != var21 || var2.nextInt(2) != 0 && var19 != 0) && !yy.m[var1.a(var22, var17, var14)]) {
                           this.a(var1, var22, var17, var14, yy.K.bM, 0);
                        }
                     }
                  }
               }

               for(int var18 = 0; var18 < var6; ++var18) {
                  int var20 = var1.a(var3, var4 + var18, var5);
                  if (var20 == 0 || var20 == yy.K.bM) {
                     this.a(var1, var3, var4 + var18, var5, yy.J.bM, 0);
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }
}
