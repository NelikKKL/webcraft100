package net.minecraft.client;

import java.util.Random;

public class agk extends cs {
   private int[] d;
   public double a;
   public double b;
   public double c;

   public agk() {
      this(new Random());
   }

   public agk(Random var1) {
      this.d = new int[512];
      this.a = var1.nextDouble() * (double)256.0F;
      this.b = var1.nextDouble() * (double)256.0F;
      this.c = var1.nextDouble() * (double)256.0F;

      for(int var2 = 0; var2 < 256; this.d[var2] = var2++) {
      }

      for(int var5 = 0; var5 < 256; ++var5) {
         int var3 = var1.nextInt(256 - var5) + var5;
         int var4 = this.d[var5];
         this.d[var5] = this.d[var3];
         this.d[var3] = var4;
         this.d[var5 + 256] = this.d[var5];
      }

   }

   public final double a(double var1, double var3, double var5) {
      return var3 + var1 * (var5 - var3);
   }

   public final double a(int var1, double var2, double var4) {
      int var6 = var1 & 15;
      double var7 = (double)(1 - ((var6 & 8) >> 3)) * var2;
      double var9 = var6 < 4 ? (double)0.0F : (var6 != 12 && var6 != 14 ? var4 : var2);
      return ((var6 & 1) == 0 ? var7 : -var7) + ((var6 & 2) == 0 ? var9 : -var9);
   }

   public final double a(int var1, double var2, double var4, double var6) {
      int var8 = var1 & 15;
      double var9 = var8 < 8 ? var2 : var4;
      double var11 = var8 < 4 ? var4 : (var8 != 12 && var8 != 14 ? var6 : var2);
      return ((var8 & 1) == 0 ? var9 : -var9) + ((var8 & 2) == 0 ? var11 : -var11);
   }

   public void a(double[] var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11, double var13, double var15, double var17) {
      if (var9 == 1) {
         int var64 = 0;
         int var66 = 0;
         int var21 = 0;
         int var69 = 0;
         double var72 = (double)0.0F;
         double var76 = (double)0.0F;
         int var80 = 0;
         double var82 = (double)1.0F / var17;

         for(int var30 = 0; var30 < var8; ++var30) {
            double var83 = var2 + (double)var30 * var11 + this.a;
            int var85 = (int)var83;
            if (var83 < (double)var85) {
               --var85;
            }

            int var34 = var85 & 255;
            var83 -= (double)var85;
            double var86 = var83 * var83 * var83 * (var83 * (var83 * (double)6.0F - (double)15.0F) + (double)10.0F);

            for(int var87 = 0; var87 < var10; ++var87) {
               double var89 = var6 + (double)var87 * var15 + this.c;
               int var91 = (int)var89;
               if (var89 < (double)var91) {
                  --var91;
               }

               int var92 = var91 & 255;
               var89 -= (double)var91;
               double var93 = var89 * var89 * var89 * (var89 * (var89 * (double)6.0F - (double)15.0F) + (double)10.0F);
               var64 = this.d[var34] + 0;
               var66 = this.d[var64] + var92;
               var21 = this.d[var34 + 1] + 0;
               var69 = this.d[var21] + var92;
               var72 = this.a(var86, this.a(this.d[var66], var83, var89), this.a(this.d[var69], var83 - (double)1.0F, (double)0.0F, var89));
               var76 = this.a(var86, this.a(this.d[var66 + 1], var83, (double)0.0F, var89 - (double)1.0F), this.a(this.d[var69 + 1], var83 - (double)1.0F, (double)0.0F, var89 - (double)1.0F));
               double var94 = this.a(var93, var72, var76);
               int var97 = var80++;
               var1[var97] += var94 * var82;
            }
         }

      } else {
         int var19 = 0;
         double var20 = (double)1.0F / var17;
         int var22 = -1;
         int var23 = 0;
         int var24 = 0;
         int var25 = 0;
         int var26 = 0;
         int var27 = 0;
         int var28 = 0;
         double var29 = (double)0.0F;
         double var31 = (double)0.0F;
         double var33 = (double)0.0F;
         double var35 = (double)0.0F;

         for(int var37 = 0; var37 < var8; ++var37) {
            double var38 = var2 + (double)var37 * var11 + this.a;
            int var40 = (int)var38;
            if (var38 < (double)var40) {
               --var40;
            }

            int var41 = var40 & 255;
            var38 -= (double)var40;
            double var42 = var38 * var38 * var38 * (var38 * (var38 * (double)6.0F - (double)15.0F) + (double)10.0F);

            for(int var44 = 0; var44 < var10; ++var44) {
               double var45 = var6 + (double)var44 * var15 + this.c;
               int var47 = (int)var45;
               if (var45 < (double)var47) {
                  --var47;
               }

               int var48 = var47 & 255;
               var45 -= (double)var47;
               double var49 = var45 * var45 * var45 * (var45 * (var45 * (double)6.0F - (double)15.0F) + (double)10.0F);

               for(int var51 = 0; var51 < var9; ++var51) {
                  double var52 = var4 + (double)var51 * var13 + this.b;
                  int var54 = (int)var52;
                  if (var52 < (double)var54) {
                     --var54;
                  }

                  int var55 = var54 & 255;
                  var52 -= (double)var54;
                  double var56 = var52 * var52 * var52 * (var52 * (var52 * (double)6.0F - (double)15.0F) + (double)10.0F);
                  if (var51 == 0 || var55 != var22) {
                     var22 = var55;
                     var23 = this.d[var41] + var55;
                     var24 = this.d[var23] + var48;
                     var25 = this.d[var23 + 1] + var48;
                     var26 = this.d[var41 + 1] + var55;
                     var27 = this.d[var26] + var48;
                     var28 = this.d[var26 + 1] + var48;
                     var29 = this.a(var42, this.a(this.d[var24], var38, var52, var45), this.a(this.d[var27], var38 - (double)1.0F, var52, var45));
                     var31 = this.a(var42, this.a(this.d[var25], var38, var52 - (double)1.0F, var45), this.a(this.d[var28], var38 - (double)1.0F, var52 - (double)1.0F, var45));
                     var33 = this.a(var42, this.a(this.d[var24 + 1], var38, var52, var45 - (double)1.0F), this.a(this.d[var27 + 1], var38 - (double)1.0F, var52, var45 - (double)1.0F));
                     var35 = this.a(var42, this.a(this.d[var25 + 1], var38, var52 - (double)1.0F, var45 - (double)1.0F), this.a(this.d[var28 + 1], var38 - (double)1.0F, var52 - (double)1.0F, var45 - (double)1.0F));
                  }

                  double var58 = this.a(var56, var29, var31);
                  double var60 = this.a(var56, var33, var35);
                  double var62 = this.a(var49, var58, var60);
                  int var10001 = var19++;
                  var1[var10001] += var62 * var20;
               }
            }
         }

      }
   }
}
