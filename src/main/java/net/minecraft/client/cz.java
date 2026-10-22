package net.minecraft.client;

import java.util.Random;

public class cz extends bz {
   protected void a(int var1, int var2, byte[] var3, double var4, double var6, double var8) {
      this.a(var1, var2, var3, var4, var6, var8, 1.0F + this.b.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, (double)0.5F);
   }

   protected void a(int var1, int var2, byte[] var3, double var4, double var6, double var8, float var10, float var11, float var12, int var13, int var14, double var15) {
      double var17 = (double)(var1 * 16 + 8);
      double var19 = (double)(var2 * 16 + 8);
      float var21 = 0.0F;
      float var22 = 0.0F;
      Random var23 = new Random(this.b.nextLong());
      if (var14 <= 0) {
         int var24 = this.a * 16 - 16;
         var14 = var24 - var23.nextInt(var24 / 4);
      }

      boolean var54 = false;
      if (var13 == -1) {
         var13 = var14 / 2;
         var54 = true;
      }

      int var25 = var23.nextInt(var14 / 2) + var14 / 4;

      for(boolean var26 = var23.nextInt(6) == 0; var13 < var14; ++var13) {
         double var27 = (double)1.5F + (double)(me.a((float)var13 * (float)Math.PI / (float)var14) * var10 * 1.0F);
         double var29 = var27 * var15;
         float var31 = me.b(var12);
         float var32 = me.a(var12);
         var4 += (double)(me.b(var11) * var31);
         var6 += (double)var32;
         var8 += (double)(me.a(var11) * var31);
         if (var26) {
            var12 *= 0.92F;
         } else {
            var12 *= 0.7F;
         }

         var12 += var22 * 0.1F;
         var11 += var21 * 0.1F;
         var22 *= 0.9F;
         var21 *= 0.75F;
         var22 += (var23.nextFloat() - var23.nextFloat()) * var23.nextFloat() * 2.0F;
         var21 += (var23.nextFloat() - var23.nextFloat()) * var23.nextFloat() * 4.0F;
         if (!var54 && var13 == var25 && var10 > 1.0F) {
            this.a(var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 - ((float)Math.PI / 2F), var12 / 3.0F, var13, var14, (double)1.0F);
            this.a(var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 + ((float)Math.PI / 2F), var12 / 3.0F, var13, var14, (double)1.0F);
            return;
         }

         if (var54 || var23.nextInt(4) != 0) {
            double var33 = var4 - var17;
            double var35 = var8 - var19;
            double var37 = (double)(var14 - var13);
            double var39 = (double)(var10 + 2.0F + 16.0F);
            if (var33 * var33 + var35 * var35 - var37 * var37 > var39 * var39) {
               return;
            }

            if (!(var4 < var17 - (double)16.0F - var27 * (double)2.0F) && !(var8 < var19 - (double)16.0F - var27 * (double)2.0F) && !(var4 > var17 + (double)16.0F + var27 * (double)2.0F) && !(var8 > var19 + (double)16.0F + var27 * (double)2.0F)) {
               int var55 = me.c(var4 - var27) - var1 * 16 - 1;
               int var34 = me.c(var4 + var27) - var1 * 16 + 1;
               int var56 = me.c(var6 - var29) - 1;
               int var36 = me.c(var6 + var29) + 1;
               int var57 = me.c(var8 - var27) - var2 * 16 - 1;
               int var38 = me.c(var8 + var27) - var2 * 16 + 1;
               if (var55 < 0) {
                  var55 = 0;
               }

               if (var34 > 16) {
                  var34 = 16;
               }

               if (var56 < 1) {
                  var56 = 1;
               }

               if (var36 > this.c.c - 8) {
                  var36 = this.c.c - 8;
               }

               if (var57 < 0) {
                  var57 = 0;
               }

               if (var38 > 16) {
                  var38 = 16;
               }

               boolean var58 = false;

               for(int var40 = var55; !var58 && var40 < var34; ++var40) {
                  for(int var41 = var57; !var58 && var41 < var38; ++var41) {
                     for(int var42 = var36 + 1; !var58 && var42 >= var56 - 1; --var42) {
                        int var43 = (var40 * 16 + var41) * this.c.c + var42;
                        if (var42 >= 0 && var42 < this.c.c) {
                           if (var3[var43] == yy.C.bM || var3[var43] == yy.D.bM) {
                              var58 = true;
                           }

                           if (var42 != var56 - 1 && var40 != var55 && var40 != var34 - 1 && var41 != var57 && var41 != var38 - 1) {
                              var42 = var56;
                           }
                        }
                     }
                  }
               }

               if (!var58) {
                  for(int var59 = var55; var59 < var34; ++var59) {
                     double var60 = ((double)(var59 + var1 * 16) + (double)0.5F - var4) / var27;

                     for(int var61 = var57; var61 < var38; ++var61) {
                        double var44 = ((double)(var61 + var2 * 16) + (double)0.5F - var8) / var27;
                        int var46 = (var59 * 16 + var61) * this.c.c + var36;

                        for(int var47 = var36 - 1; var47 >= var56; --var47) {
                           double var48 = ((double)var47 + (double)0.5F - var6) / var29;
                           if (var48 > -0.7 && var60 * var60 + var48 * var48 + var44 * var44 < (double)1.0F) {
                              byte var50 = var3[var46];
                              if (var50 == yy.bb.bM || var50 == yy.v.bM || var50 == yy.u.bM) {
                                 var3[var46] = 0;
                              }
                           }

                           --var46;
                        }
                     }
                  }

                  if (var54) {
                     break;
                  }
               }
            }
         }
      }

   }

   protected void a(ry var1, int var2, int var3, int var4, int var5, byte[] var6) {
      int var7 = this.b.nextInt(this.b.nextInt(this.b.nextInt(10) + 1) + 1);
      if (this.b.nextInt(5) != 0) {
         var7 = 0;
      }

      for(int var8 = 0; var8 < var7; ++var8) {
         double var9 = (double)(var2 * 16 + this.b.nextInt(16));
         double var11 = (double)this.b.nextInt(var1.c);
         double var13 = (double)(var3 * 16 + this.b.nextInt(16));
         int var15 = 1;
         if (this.b.nextInt(4) == 0) {
            this.a(var4, var5, var6, var9, var11, var13);
            var15 += this.b.nextInt(4);
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            float var17 = this.b.nextFloat() * (float)Math.PI * 2.0F;
            float var18 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.b.nextFloat() * 2.0F + this.b.nextFloat();
            this.a(var4, var5, var6, var9, var11, var13, var19 * 2.0F, var17, var18, 0, 0, (double)0.5F);
         }
      }

   }
}
