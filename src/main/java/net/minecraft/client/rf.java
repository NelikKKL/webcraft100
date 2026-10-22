package net.minecraft.client;

import java.util.Random;

public class rf extends bz {
   private float[] d = new float[1024];

   protected void a(long var1, int var3, int var4, byte[] var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      Random var19 = new Random(var1);
      double var20 = (double)(var3 * 16 + 8);
      double var22 = (double)(var4 * 16 + 8);
      float var24 = 0.0F;
      float var25 = 0.0F;
      if (var16 <= 0) {
         int var26 = this.a * 16 - 16;
         var16 = var26 - var19.nextInt(var26 / 4);
      }

      boolean var56 = false;
      if (var15 == -1) {
         var15 = var16 / 2;
         var56 = true;
      }

      float var27 = 1.0F;

      for(int var28 = 0; var28 < this.c.c; ++var28) {
         if (var28 == 0 || var19.nextInt(3) == 0) {
            var27 = 1.0F + var19.nextFloat() * var19.nextFloat() * 1.0F;
         }

         this.d[var28] = var27 * var27;
      }

      for(; var15 < var16; ++var15) {
         double var57 = (double)1.5F + (double)(me.a((float)var15 * (float)Math.PI / (float)var16) * var12 * 1.0F);
         double var30 = var57 * var17;
         var57 *= (double)var19.nextFloat() * (double)0.25F + (double)0.75F;
         var30 *= (double)var19.nextFloat() * (double)0.25F + (double)0.75F;
         float var32 = me.b(var14);
         float var33 = me.a(var14);
         var6 += (double)(me.b(var13) * var32);
         var8 += (double)var33;
         var10 += (double)(me.a(var13) * var32);
         var14 *= 0.7F;
         var14 += var25 * 0.05F;
         var13 += var24 * 0.05F;
         var25 *= 0.8F;
         var24 *= 0.5F;
         var25 += (var19.nextFloat() - var19.nextFloat()) * var19.nextFloat() * 2.0F;
         var24 += (var19.nextFloat() - var19.nextFloat()) * var19.nextFloat() * 4.0F;
         if (var56 || var19.nextInt(4) != 0) {
            double var34 = var6 - var20;
            double var36 = var10 - var22;
            double var38 = (double)(var16 - var15);
            double var40 = (double)(var12 + 2.0F + 16.0F);
            if (var34 * var34 + var36 * var36 - var38 * var38 > var40 * var40) {
               return;
            }

            if (!(var6 < var20 - (double)16.0F - var57 * (double)2.0F) && !(var10 < var22 - (double)16.0F - var57 * (double)2.0F) && !(var6 > var20 + (double)16.0F + var57 * (double)2.0F) && !(var10 > var22 + (double)16.0F + var57 * (double)2.0F)) {
               int var60 = me.c(var6 - var57) - var3 * 16 - 1;
               int var35 = me.c(var6 + var57) - var3 * 16 + 1;
               int var61 = me.c(var8 - var30) - 1;
               int var37 = me.c(var8 + var30) + 1;
               int var62 = me.c(var10 - var57) - var4 * 16 - 1;
               int var39 = me.c(var10 + var57) - var4 * 16 + 1;
               if (var60 < 0) {
                  var60 = 0;
               }

               if (var35 > 16) {
                  var35 = 16;
               }

               if (var61 < 1) {
                  var61 = 1;
               }

               if (var37 > this.c.c - 8) {
                  var37 = this.c.c - 8;
               }

               if (var62 < 0) {
                  var62 = 0;
               }

               if (var39 > 16) {
                  var39 = 16;
               }

               boolean var63 = false;

               for(int var41 = var60; !var63 && var41 < var35; ++var41) {
                  for(int var42 = var62; !var63 && var42 < var39; ++var42) {
                     for(int var43 = var37 + 1; !var63 && var43 >= var61 - 1; --var43) {
                        int var44 = (var41 * 16 + var42) * this.c.c + var43;
                        if (var43 >= 0 && var43 < this.c.c) {
                           if (var5[var44] == yy.A.bM || var5[var44] == yy.B.bM) {
                              var63 = true;
                           }

                           if (var43 != var61 - 1 && var41 != var60 && var41 != var35 - 1 && var42 != var62 && var42 != var39 - 1) {
                              var43 = var61;
                           }
                        }
                     }
                  }
               }

               if (!var63) {
                  for(int var64 = var60; var64 < var35; ++var64) {
                     double var65 = ((double)(var64 + var3 * 16) + (double)0.5F - var6) / var57;

                     for(int var66 = var62; var66 < var39; ++var66) {
                        double var45 = ((double)(var66 + var4 * 16) + (double)0.5F - var10) / var57;
                        int var47 = (var64 * 16 + var66) * this.c.c + var37;
                        boolean var48 = false;
                        if (var65 * var65 + var45 * var45 < (double)1.0F) {
                           for(int var49 = var37 - 1; var49 >= var61; --var49) {
                              double var50 = ((double)var49 + (double)0.5F - var8) / var30;
                              if ((var65 * var65 + var45 * var45) * (double)this.d[var49] + var50 * var50 / (double)6.0F < (double)1.0F) {
                                 byte var52 = var5[var47];
                                 if (var52 == yy.u.bM) {
                                    var48 = true;
                                 }

                                 if (var52 == yy.t.bM || var52 == yy.v.bM || var52 == yy.u.bM) {
                                    if (var49 < 10) {
                                       var5[var47] = (byte)yy.C.bM;
                                    } else {
                                       var5[var47] = 0;
                                       if (var48 && var5[var47 - 1] == yy.v.bM) {
                                          var5[var47 - 1] = this.c.a().a(var64 + var3 * 16, var66 + var4 * 16).t;
                                       }
                                    }
                                 }
                              }

                              --var47;
                           }
                        }
                     }
                  }

                  if (var56) {
                     break;
                  }
               }
            }
         }
      }

   }

   protected void a(ry var1, int var2, int var3, int var4, int var5, byte[] var6) {
      if (this.b.nextInt(50) == 0) {
         double var7 = (double)(var2 * 16 + this.b.nextInt(16));
         double var9 = (double)(this.b.nextInt(this.b.nextInt(40) + 8) + 20);
         double var11 = (double)(var3 * 16 + this.b.nextInt(16));
         byte var13 = 1;

         for(int var14 = 0; var14 < var13; ++var14) {
            float var15 = this.b.nextFloat() * (float)Math.PI * 2.0F;
            float var16 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var17 = (this.b.nextFloat() * 2.0F + this.b.nextFloat()) * 2.0F;
            this.a(this.b.nextLong(), var4, var5, var6, var7, var9, var11, var17, var15, var16, 0, 0, (double)3.0F);
         }

      }
   }
}
