package net.minecraft.client;

import java.util.Random;

public class ln extends bz {
   protected void a(long var1, int var3, int var4, byte[] var5, double var6, double var8, double var10) {
      this.a(var1, var3, var4, var5, var6, var8, var10, 1.0F + this.b.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, (double)0.5F);
   }

   protected void a(long var1, int var3, int var4, byte[] var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      double var19 = (double)(var3 * 16 + 8);
      double var21 = (double)(var4 * 16 + 8);
      float var23 = 0.0F;
      float var24 = 0.0F;
      Random var25 = new Random(var1);
      if (var16 <= 0) {
         int var26 = this.a * 16 - 16;
         var16 = var26 - var25.nextInt(var26 / 4);
      }

      boolean var57 = false;
      if (var15 == -1) {
         var15 = var16 / 2;
         var57 = true;
      }

      int var27 = var25.nextInt(var16 / 2) + var16 / 4;

      for(boolean var28 = var25.nextInt(6) == 0; var15 < var16; ++var15) {
         double var29 = (double)1.5F + (double)(me.a((float)var15 * (float)Math.PI / (float)var16) * var12 * 1.0F);
         double var31 = var29 * var17;
         float var33 = me.b(var14);
         float var34 = me.a(var14);
         var6 += (double)(me.b(var13) * var33);
         var8 += (double)var34;
         var10 += (double)(me.a(var13) * var33);
         if (var28) {
            var14 *= 0.92F;
         } else {
            var14 *= 0.7F;
         }

         var14 += var24 * 0.1F;
         var13 += var23 * 0.1F;
         var24 *= 0.9F;
         var23 *= 0.75F;
         var24 += (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 2.0F;
         var23 += (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 4.0F;
         if (!var57 && var15 == var27 && var12 > 1.0F && var16 > 0) {
            this.a(var25.nextLong(), var3, var4, var5, var6, var8, var10, var25.nextFloat() * 0.5F + 0.5F, var13 - ((float)Math.PI / 2F), var14 / 3.0F, var15, var16, (double)1.0F);
            this.a(var25.nextLong(), var3, var4, var5, var6, var8, var10, var25.nextFloat() * 0.5F + 0.5F, var13 + ((float)Math.PI / 2F), var14 / 3.0F, var15, var16, (double)1.0F);
            return;
         }

         if (var57 || var25.nextInt(4) != 0) {
            double var35 = var6 - var19;
            double var37 = var10 - var21;
            double var39 = (double)(var16 - var15);
            double var41 = (double)(var12 + 2.0F + 16.0F);
            if (var35 * var35 + var37 * var37 - var39 * var39 > var41 * var41) {
               return;
            }

            if (!(var6 < var19 - (double)16.0F - var29 * (double)2.0F) && !(var10 < var21 - (double)16.0F - var29 * (double)2.0F) && !(var6 > var19 + (double)16.0F + var29 * (double)2.0F) && !(var10 > var21 + (double)16.0F + var29 * (double)2.0F)) {
               int var58 = me.c(var6 - var29) - var3 * 16 - 1;
               int var36 = me.c(var6 + var29) - var3 * 16 + 1;
               int var59 = me.c(var8 - var31) - 1;
               int var38 = me.c(var8 + var31) + 1;
               int var60 = me.c(var10 - var29) - var4 * 16 - 1;
               int var40 = me.c(var10 + var29) - var4 * 16 + 1;
               if (var58 < 0) {
                  var58 = 0;
               }

               if (var36 > 16) {
                  var36 = 16;
               }

               if (var59 < 1) {
                  var59 = 1;
               }

               if (var38 > this.c.c - 8) {
                  var38 = this.c.c - 8;
               }

               if (var60 < 0) {
                  var60 = 0;
               }

               if (var40 > 16) {
                  var40 = 16;
               }

               boolean var61 = false;

               for(int var42 = var58; !var61 && var42 < var36; ++var42) {
                  for(int var43 = var60; !var61 && var43 < var40; ++var43) {
                     for(int var44 = var38 + 1; !var61 && var44 >= var59 - 1; --var44) {
                        int var45 = (var42 * 16 + var43) * this.c.c + var44;
                        if (var44 >= 0 && var44 < this.c.c) {
                           if (var5[var45] == yy.A.bM || var5[var45] == yy.B.bM) {
                              var61 = true;
                           }

                           if (var44 != var59 - 1 && var42 != var58 && var42 != var36 - 1 && var43 != var60 && var43 != var40 - 1) {
                              var44 = var59;
                           }
                        }
                     }
                  }
               }

               if (!var61) {
                  for(int var62 = var58; var62 < var36; ++var62) {
                     double var63 = ((double)(var62 + var3 * 16) + (double)0.5F - var6) / var29;

                     for(int var64 = var60; var64 < var40; ++var64) {
                        double var46 = ((double)(var64 + var4 * 16) + (double)0.5F - var10) / var29;
                        int var48 = (var62 * 16 + var64) * this.c.c + var38;
                        boolean var49 = false;
                        if (var63 * var63 + var46 * var46 < (double)1.0F) {
                           for(int var50 = var38 - 1; var50 >= var59; --var50) {
                              double var51 = ((double)var50 + (double)0.5F - var8) / var31;
                              if (var51 > -0.7 && var63 * var63 + var51 * var51 + var46 * var46 < (double)1.0F) {
                                 byte var53 = var5[var48];
                                 if (var53 == yy.u.bM) {
                                    var49 = true;
                                 }

                                 if (var53 == yy.t.bM || var53 == yy.v.bM || var53 == yy.u.bM) {
                                    if (var50 < 10) {
                                       var5[var48] = (byte)yy.C.bM;
                                    } else {
                                       var5[var48] = 0;
                                       if (var49 && var5[var48 - 1] == yy.v.bM) {
                                          var5[var48 - 1] = this.c.a().a(var62 + var3 * 16, var64 + var4 * 16).t;
                                       }
                                    }
                                 }
                              }

                              --var48;
                           }
                        }
                     }
                  }

                  if (var57) {
                     break;
                  }
               }
            }
         }
      }

   }

   protected void a(ry var1, int var2, int var3, int var4, int var5, byte[] var6) {
      int var7 = this.b.nextInt(this.b.nextInt(this.b.nextInt(40) + 1) + 1);
      if (this.b.nextInt(15) != 0) {
         var7 = 0;
      }

      for(int var8 = 0; var8 < var7; ++var8) {
         double var9 = (double)(var2 * 16 + this.b.nextInt(16));
         double var11 = (double)this.b.nextInt(this.b.nextInt(var1.c - 8) + 8);
         double var13 = (double)(var3 * 16 + this.b.nextInt(16));
         int var15 = 1;
         if (this.b.nextInt(4) == 0) {
            this.a(this.b.nextLong(), var4, var5, var6, var9, var11, var13);
            var15 += this.b.nextInt(4);
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            float var17 = this.b.nextFloat() * (float)Math.PI * 2.0F;
            float var18 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.b.nextFloat() * 2.0F + this.b.nextFloat();
            if (this.b.nextInt(10) == 0) {
               var19 *= this.b.nextFloat() * this.b.nextFloat() * 3.0F + 1.0F;
            }

            this.a(this.b.nextLong(), var4, var5, var6, var9, var11, var13, var19, var17, var18, 0, 0, (double)1.0F);
         }
      }

   }
}
