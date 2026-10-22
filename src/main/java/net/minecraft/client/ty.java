package net.minecraft.client;

import java.util.Random;

public class ty extends ig {
   public ty(boolean var1) {
      super(var1);
   }

   public boolean a(ry var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(4) + 6;
      int var7 = 1 + var2.nextInt(2);
      int var8 = var6 - var7;
      int var9 = 2 + var2.nextInt(2);
      boolean var10 = true;
      if (var4 >= 1 && var4 + var6 + 1 <= var1.c) {
         for(int var11 = var4; var11 <= var4 + 1 + var6 && var10; ++var11) {
            int var12 = 1;
            if (var11 - var4 < var7) {
               var12 = 0;
            } else {
               var12 = var9;
            }

            for(int var13 = var3 - var12; var13 <= var3 + var12 && var10; ++var13) {
               for(int var14 = var5 - var12; var14 <= var5 + var12 && var10; ++var14) {
                  if (var11 >= 0 && var11 < var1.c) {
                     int var15 = var1.a(var13, var11, var14);
                     if (var15 != 0 && var15 != yy.K.bM) {
                        var10 = false;
                     }
                  } else {
                     var10 = false;
                  }
               }
            }
         }

         if (!var10) {
            return false;
         } else {
            int var21 = var1.a(var3, var4 - 1, var5);
            if ((var21 == yy.u.bM || var21 == yy.v.bM) && var4 < var1.c - var6 - 1) {
               var1.d(var3, var4 - 1, var5, yy.v.bM);
               int var23 = var2.nextInt(2);
               int var24 = 1;
               byte var25 = 0;

               for(int var26 = 0; var26 <= var8; ++var26) {
                  int var16 = var4 + var6 - var26;

                  for(int var17 = var3 - var23; var17 <= var3 + var23; ++var17) {
                     int var18 = var17 - var3;

                     for(int var19 = var5 - var23; var19 <= var5 + var23; ++var19) {
                        int var20 = var19 - var5;
                        if ((Math.abs(var18) != var23 || Math.abs(var20) != var23 || var23 <= 0) && !yy.m[var1.a(var17, var16, var19)]) {
                           this.a(var1, var17, var16, var19, yy.K.bM, 1);
                        }
                     }
                  }

                  if (var23 >= var24) {
                     var23 = var25;
                     var25 = 1;
                     ++var24;
                     if (var24 > var9) {
                        var24 = var9;
                     }
                  } else {
                     ++var23;
                  }
               }

               int var27 = var2.nextInt(3);

               for(int var28 = 0; var28 < var6 - var27; ++var28) {
                  int var29 = var1.a(var3, var4 + var28, var5);
                  if (var29 == 0 || var29 == yy.K.bM) {
                     this.a(var1, var3, var4 + var28, var5, yy.J.bM, 1);
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
