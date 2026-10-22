package net.minecraft.client;

import java.util.Random;

public class qj extends ig {
   public boolean a(ry var1, Random var2, int var3, int var4, int var5) {
      int var6;
      for(var6 = var2.nextInt(4) + 5; var1.e(var3, var4 - 1, var5) == p.g; --var4) {
      }

      boolean var7 = true;
      if (var4 >= 1 && var4 + var6 + 1 <= var1.c) {
         for(int var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            byte var9 = 1;
            if (var8 == var4) {
               var9 = 0;
            }

            if (var8 >= var4 + 1 + var6 - 2) {
               var9 = 3;
            }

            for(int var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(int var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if (var8 >= 0 && var8 < var1.c) {
                     int var12 = var1.a(var10, var8, var11);
                     if (var12 != 0 && var12 != yy.K.bM) {
                        if (var12 != yy.B.bM && var12 != yy.A.bM) {
                           var7 = false;
                        } else if (var8 > var4) {
                           var7 = false;
                        }
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
                  int var20 = var17 - (var4 + var6);
                  int var23 = 2 - var20 / 2;

                  for(int var25 = var3 - var23; var25 <= var3 + var23; ++var25) {
                     int var13 = var25 - var3;

                     for(int var14 = var5 - var23; var14 <= var5 + var23; ++var14) {
                        int var15 = var14 - var5;
                        if ((Math.abs(var13) != var23 || Math.abs(var15) != var23 || var2.nextInt(2) != 0 && var20 != 0) && !yy.m[var1.a(var25, var17, var14)]) {
                           var1.d(var25, var17, var14, yy.K.bM);
                        }
                     }
                  }
               }

               for(int var18 = 0; var18 < var6; ++var18) {
                  int var21 = var1.a(var3, var4 + var18, var5);
                  if (var21 == 0 || var21 == yy.K.bM || var21 == yy.A.bM || var21 == yy.B.bM) {
                     var1.d(var3, var4 + var18, var5, yy.J.bM);
                  }
               }

               for(int var19 = var4 - 3 + var6; var19 <= var4 + var6; ++var19) {
                  int var22 = var19 - (var4 + var6);
                  int var24 = 2 - var22 / 2;

                  for(int var26 = var3 - var24; var26 <= var3 + var24; ++var26) {
                     for(int var27 = var5 - var24; var27 <= var5 + var24; ++var27) {
                        if (var1.a(var26, var19, var27) == yy.K.bM) {
                           if (var2.nextInt(4) == 0 && var1.a(var26 - 1, var19, var27) == 0) {
                              this.a(var1, var26 - 1, var19, var27, 8);
                           }

                           if (var2.nextInt(4) == 0 && var1.a(var26 + 1, var19, var27) == 0) {
                              this.a(var1, var26 + 1, var19, var27, 2);
                           }

                           if (var2.nextInt(4) == 0 && var1.a(var26, var19, var27 - 1) == 0) {
                              this.a(var1, var26, var19, var27 - 1, 1);
                           }

                           if (var2.nextInt(4) == 0 && var1.a(var26, var19, var27 + 1) == 0) {
                              this.a(var1, var26, var19, var27 + 1, 4);
                           }
                        }
                     }
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

   private void a(ry var1, int var2, int var3, int var4, int var5) {
      var1.d(var2, var3, var4, yy.bu.bM, var5);
      int var6 = 4;

      while(true) {
         --var3;
         if (var1.a(var2, var3, var4) != 0 || var6 <= 0) {
            return;
         }

         var1.d(var2, var3, var4, yy.bu.bM, var5);
         --var6;
      }
   }
}
