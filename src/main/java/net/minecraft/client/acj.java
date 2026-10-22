package net.minecraft.client;

import java.util.Random;

public class acj extends ig {
   public boolean a(ry var1, Random var2, int var3, int var4, int var5) {
      byte var6 = 3;
      int var7 = var2.nextInt(2) + 2;
      int var8 = var2.nextInt(2) + 2;
      int var9 = 0;

      for(int var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
         for(int var11 = var4 - 1; var11 <= var4 + var6 + 1; ++var11) {
            for(int var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
               p var13 = var1.e(var10, var11, var12);
               if (var11 == var4 - 1 && !var13.b()) {
                  return false;
               }

               if (var11 == var4 + var6 + 1 && !var13.b()) {
                  return false;
               }

               if ((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1) && var11 == var4 && var1.h(var10, var11, var12) && var1.h(var10, var11 + 1, var12)) {
                  ++var9;
               }
            }
         }
      }

      if (var9 >= 1 && var9 <= 5) {
         for(int var19 = var3 - var7 - 1; var19 <= var3 + var7 + 1; ++var19) {
            for(int var22 = var4 + var6; var22 >= var4 - 1; --var22) {
               for(int var24 = var5 - var8 - 1; var24 <= var5 + var8 + 1; ++var24) {
                  if (var19 != var3 - var7 - 1 && var22 != var4 - 1 && var24 != var5 - var8 - 1 && var19 != var3 + var7 + 1 && var22 != var4 + var6 + 1 && var24 != var5 + var8 + 1) {
                     var1.g(var19, var22, var24, 0);
                  } else if (var22 >= 0 && !var1.e(var19, var22 - 1, var24).b()) {
                     var1.g(var19, var22, var24, 0);
                  } else if (var1.e(var19, var22, var24).b()) {
                     if (var22 == var4 - 1 && var2.nextInt(4) != 0) {
                        var1.g(var19, var22, var24, yy.ao.bM);
                     } else {
                        var1.g(var19, var22, var24, yy.w.bM);
                     }
                  }
               }
            }
         }

         for(int var20 = 0; var20 < 2; ++var20) {
            for(int var23 = 0; var23 < 3; ++var23) {
               int var25 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
               int var14 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
               if (var1.h(var25, var4, var14)) {
                  int var15 = 0;
                  if (var1.e(var25 - 1, var4, var14).b()) {
                     ++var15;
                  }

                  if (var1.e(var25 + 1, var4, var14).b()) {
                     ++var15;
                  }

                  if (var1.e(var25, var4, var14 - 1).b()) {
                     ++var15;
                  }

                  if (var1.e(var25, var4, var14 + 1).b()) {
                     ++var15;
                  }

                  if (var15 == 1) {
                     var1.g(var25, var4, var14, yy.au.bM);
                     tu var16 = (tu)var1.b(var25, var4, var14);
                     if (var16 != null) {
                        for(int var17 = 0; var17 < 8; ++var17) {
                           dk var18 = this.a(var2);
                           if (var18 != null) {
                              var16.a(var2.nextInt(var16.c()), var18);
                           }
                        }
                     }
                     break;
                  }
               }
            }
         }

         var1.g(var3, var4, var5, yy.as.bM);
         ze var21 = (ze)var1.b(var3, var4, var5);
         if (var21 != null) {
            var21.a(this.b(var2));
         } else {
            System.err.println("Failed to fetch mob spawner entity at (" + var3 + ", " + var4 + ", " + var5 + ")");
         }

         return true;
      } else {
         return false;
      }
   }

   private dk a(Random var1) {
      int var2 = var1.nextInt(11);
      if (var2 == 0) {
         return new dk(acy.az);
      } else if (var2 == 1) {
         return new dk(acy.n, var1.nextInt(4) + 1);
      } else if (var2 == 2) {
         return new dk(acy.T);
      } else if (var2 == 3) {
         return new dk(acy.S, var1.nextInt(4) + 1);
      } else if (var2 == 4) {
         return new dk(acy.L, var1.nextInt(4) + 1);
      } else if (var2 == 5) {
         return new dk(acy.J, var1.nextInt(4) + 1);
      } else if (var2 == 6) {
         return new dk(acy.av);
      } else if (var2 == 7 && var1.nextInt(100) == 0) {
         return new dk(acy.as);
      } else if (var2 == 8 && var1.nextInt(2) == 0) {
         return new dk(acy.aB, var1.nextInt(4) + 1);
      } else if (var2 == 9 && var1.nextInt(10) == 0) {
         return new dk(acy.d[acy.bB.bM + var1.nextInt(2)]);
      } else {
         return var2 == 10 ? new dk(acy.aV, 1, 3) : null;
      }
   }

   private String b(Random var1) {
      int var2 = var1.nextInt(4);
      if (var2 == 0) {
         return "Skeleton";
      } else if (var2 == 1) {
         return "Zombie";
      } else if (var2 == 2) {
         return "Zombie";
      } else {
         return var2 == 3 ? "Spider" : "";
      }
   }
}
