package net.minecraft.client;

import java.util.Random;

public class ky extends ig {
   private int a;
   private int b;

   public ky(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean a(ry var1, Random var2, int var3, int var4, int var5) {
      float var6 = var2.nextFloat() * (float)Math.PI;
      double var7 = (double)((float)(var3 + 8) + me.a(var6) * (float)this.b / 8.0F);
      double var9 = (double)((float)(var3 + 8) - me.a(var6) * (float)this.b / 8.0F);
      double var11 = (double)((float)(var5 + 8) + me.b(var6) * (float)this.b / 8.0F);
      double var13 = (double)((float)(var5 + 8) - me.b(var6) * (float)this.b / 8.0F);
      double var15 = (double)(var4 + var2.nextInt(3) - 2);
      double var17 = (double)(var4 + var2.nextInt(3) - 2);

      for(int var19 = 0; var19 <= this.b; ++var19) {
         double var20 = var7 + (var9 - var7) * (double)var19 / (double)this.b;
         double var22 = var15 + (var17 - var15) * (double)var19 / (double)this.b;
         double var24 = var11 + (var13 - var11) * (double)var19 / (double)this.b;
         double var26 = var2.nextDouble() * (double)this.b / (double)16.0F;
         double var28 = (double)(me.a((float)var19 * (float)Math.PI / (float)this.b) + 1.0F) * var26 + (double)1.0F;
         double var30 = (double)(me.a((float)var19 * (float)Math.PI / (float)this.b) + 1.0F) * var26 + (double)1.0F;
         int var32 = me.c(var20 - var28 / (double)2.0F);
         int var33 = me.c(var22 - var30 / (double)2.0F);
         int var34 = me.c(var24 - var28 / (double)2.0F);
         int var35 = me.c(var20 + var28 / (double)2.0F);
         int var36 = me.c(var22 + var30 / (double)2.0F);
         int var37 = me.c(var24 + var28 / (double)2.0F);

         for(int var38 = var32; var38 <= var35; ++var38) {
            double var39 = ((double)var38 + (double)0.5F - var20) / (var28 / (double)2.0F);
            if (var39 * var39 < (double)1.0F) {
               for(int var41 = var33; var41 <= var36; ++var41) {
                  double var42 = ((double)var41 + (double)0.5F - var22) / (var30 / (double)2.0F);
                  if (var39 * var39 + var42 * var42 < (double)1.0F) {
                     for(int var44 = var34; var44 <= var37; ++var44) {
                        double var45 = ((double)var44 + (double)0.5F - var24) / (var28 / (double)2.0F);
                        if (var39 * var39 + var42 * var42 + var45 * var45 < (double)1.0F && var1.a(var38, var41, var44) == yy.t.bM) {
                           var1.d(var38, var41, var44, this.a);
                        }
                     }
                  }
               }
            }
         }
      }

      return true;
   }
}
