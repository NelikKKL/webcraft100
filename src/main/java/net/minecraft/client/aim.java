package net.minecraft.client;

import java.util.Random;

public class aim {
   private Random a = new net.minecraft.client.web.JRandom();

   public void a(ry var1, ia var2) {
      if (var1.y.g != 1) {
         if (!this.b(var1, var2)) {
            this.c(var1, var2);
            this.b(var1, var2);
         }
      } else {
         int var3 = me.c(var2.s);
         int var4 = me.c(var2.t) - 1;
         int var5 = me.c(var2.u);
         byte var6 = 1;
         byte var7 = 0;

         for(int var8 = -2; var8 <= 2; ++var8) {
            for(int var9 = -2; var9 <= 2; ++var9) {
               for(int var10 = -1; var10 < 3; ++var10) {
                  int var11 = var3 + var9 * var6 + var8 * var7;
                  int var12 = var4 + var10;
                  int var13 = var5 + var9 * var7 - var8 * var6;
                  boolean var14 = var10 < 0;
                  var1.g(var11, var12, var13, var14 ? yy.ap.bM : 0);
               }
            }
         }

         var2.c((double)var3, (double)var4, (double)var5, var2.y, 0.0F);
         var2.v = var2.w = var2.x = (double)0.0F;
      }
   }

   public boolean b(ry var1, ia var2) {
      short var3 = 128;
      double var4 = (double)-1.0F;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = me.c(var2.s);
      int var10 = me.c(var2.u);

      for(int var11 = var9 - var3; var11 <= var9 + var3; ++var11) {
         double var12 = (double)var11 + (double)0.5F - var2.s;

         for(int var14 = var10 - var3; var14 <= var10 + var3; ++var14) {
            double var15 = (double)var14 + (double)0.5F - var2.u;

            for(int var17 = var1.c - 1; var17 >= 0; --var17) {
               if (var1.a(var11, var17, var14) == yy.be.bM) {
                  while(var1.a(var11, var17 - 1, var14) == yy.be.bM) {
                     --var17;
                  }

                  double var18 = (double)var17 + (double)0.5F - var2.t;
                  double var20 = var12 * var12 + var18 * var18 + var15 * var15;
                  if (var4 < (double)0.0F || var20 < var4) {
                     var4 = var20;
                     var6 = var11;
                     var7 = var17;
                     var8 = var14;
                  }
               }
            }
         }
      }

      if (var4 >= (double)0.0F) {
         double var22 = (double)var6 + (double)0.5F;
         double var16 = (double)var7 + (double)0.5F;
         double var23 = (double)var8 + (double)0.5F;
         if (var1.a(var6 - 1, var7, var8) == yy.be.bM) {
            var22 -= (double)0.5F;
         }

         if (var1.a(var6 + 1, var7, var8) == yy.be.bM) {
            var22 += (double)0.5F;
         }

         if (var1.a(var6, var7, var8 - 1) == yy.be.bM) {
            var23 -= (double)0.5F;
         }

         if (var1.a(var6, var7, var8 + 1) == yy.be.bM) {
            var23 += (double)0.5F;
         }

         var2.c(var22, var16, var23, var2.y, 0.0F);
         var2.v = var2.w = var2.x = (double)0.0F;
         return true;
      } else {
         return false;
      }
   }

   public boolean c(ry var1, ia var2) {
      byte var3 = 16;
      double var4 = (double)-1.0F;
      int var6 = me.c(var2.s);
      int var7 = me.c(var2.t);
      int var8 = me.c(var2.u);
      int var9 = var6;
      int var10 = var7;
      int var11 = var8;
      int var12 = 0;
      int var13 = this.a.nextInt(4);

      for(int var14 = var6 - var3; var14 <= var6 + var3; ++var14) {
         double var15 = (double)var14 + (double)0.5F - var2.s;

         for(int var17 = var8 - var3; var17 <= var8 + var3; ++var17) {
            double var18 = (double)var17 + (double)0.5F - var2.u;

            label299:
            for(int var20 = var1.c - 1; var20 >= 0; --var20) {
               if (var1.h(var14, var20, var17)) {
                  while(var20 > 0 && var1.h(var14, var20 - 1, var17)) {
                     --var20;
                  }

                  for(int var21 = var13; var21 < var13 + 4; ++var21) {
                     int var22 = var21 % 2;
                     int var23 = 1 - var22;
                     if (var21 % 4 >= 2) {
                        var22 = -var22;
                        var23 = -var23;
                     }

                     for(int var24 = 0; var24 < 3; ++var24) {
                        for(int var25 = 0; var25 < 4; ++var25) {
                           for(int var26 = -1; var26 < 4; ++var26) {
                              int var27 = var14 + (var25 - 1) * var22 + var24 * var23;
                              int var28 = var20 + var26;
                              int var29 = var17 + (var25 - 1) * var23 - var24 * var22;
                              if (var26 < 0 && !var1.e(var27, var28, var29).b() || var26 >= 0 && !var1.h(var27, var28, var29)) {
                                 continue label299;
                              }
                           }
                        }
                     }

                     double var52 = (double)var20 + (double)0.5F - var2.t;
                     double var62 = var15 * var15 + var52 * var52 + var18 * var18;
                     if (var4 < (double)0.0F || var62 < var4) {
                        var4 = var62;
                        var9 = var14;
                        var10 = var20;
                        var11 = var17;
                        var12 = var21 % 4;
                     }
                  }
               }
            }
         }
      }

      if (var4 < (double)0.0F) {
         for(int var30 = var6 - var3; var30 <= var6 + var3; ++var30) {
            double var31 = (double)var30 + (double)0.5F - var2.s;

            for(int var33 = var8 - var3; var33 <= var8 + var3; ++var33) {
               double var35 = (double)var33 + (double)0.5F - var2.u;

               label236:
               for(int var37 = var1.c - 1; var37 >= 0; --var37) {
                  if (var1.h(var30, var37, var33)) {
                     while(var37 > 0 && var1.h(var30, var37 - 1, var33)) {
                        --var37;
                     }

                     for(int var40 = var13; var40 < var13 + 2; ++var40) {
                        int var44 = var40 % 2;
                        int var48 = 1 - var44;

                        for(int var53 = 0; var53 < 4; ++var53) {
                           for(int var58 = -1; var58 < 4; ++var58) {
                              int var63 = var30 + (var53 - 1) * var44;
                              int var67 = var37 + var58;
                              int var68 = var33 + (var53 - 1) * var48;
                              if (var58 < 0 && !var1.e(var63, var67, var68).b() || var58 >= 0 && !var1.h(var63, var67, var68)) {
                                 continue label236;
                              }
                           }
                        }

                        double var54 = (double)var37 + (double)0.5F - var2.t;
                        double var64 = var31 * var31 + var54 * var54 + var35 * var35;
                        if (var4 < (double)0.0F || var64 < var4) {
                           var4 = var64;
                           var9 = var30;
                           var10 = var37;
                           var11 = var33;
                           var12 = var40 % 2;
                        }
                     }
                  }
               }
            }
         }
      }

      int var32 = var9;
      int var16 = var10;
      int var34 = var11;
      int var36 = var12 % 2;
      int var19 = 1 - var36;
      if (var12 % 4 >= 2) {
         var36 = -var36;
         var19 = -var19;
      }

      if (var4 < (double)0.0F) {
         if (var10 < 70) {
            var10 = 70;
         }

         if (var10 > var1.c - 10) {
            var10 = var1.c - 10;
         }

         var16 = var10;

         for(int var38 = -1; var38 <= 1; ++var38) {
            for(int var41 = 1; var41 < 3; ++var41) {
               for(int var45 = -1; var45 < 3; ++var45) {
                  int var49 = var32 + (var41 - 1) * var36 + var38 * var19;
                  int var55 = var16 + var45;
                  int var59 = var34 + (var41 - 1) * var19 - var38 * var36;
                  boolean var65 = var45 < 0;
                  var1.g(var49, var55, var59, var65 ? yy.ap.bM : 0);
               }
            }
         }
      }

      for(int var39 = 0; var39 < 4; ++var39) {
         var1.t = true;

         for(int var42 = 0; var42 < 4; ++var42) {
            for(int var46 = -1; var46 < 4; ++var46) {
               int var50 = var32 + (var42 - 1) * var36;
               int var56 = var16 + var46;
               int var60 = var34 + (var42 - 1) * var19;
               boolean var66 = var42 == 0 || var42 == 3 || var46 == -1 || var46 == 3;
               var1.g(var50, var56, var60, var66 ? yy.ap.bM : yy.be.bM);
            }
         }

         var1.t = false;

         for(int var43 = 0; var43 < 4; ++var43) {
            for(int var47 = -1; var47 < 4; ++var47) {
               int var51 = var32 + (var43 - 1) * var36;
               int var57 = var16 + var47;
               int var61 = var34 + (var43 - 1) * var19;
               var1.j(var51, var57, var61, var1.a(var51, var57, var61));
            }
         }
      }

      return true;
   }
}
