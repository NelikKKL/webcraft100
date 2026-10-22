package net.minecraft.client;

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class adu extends rg {
   public void a(su var1, double var2, double var4, double var6, float var8, float var9) {
      cv var10 = cv.a;
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 1);
      double[] var11 = new double[8];
      double[] var12 = new double[8];
      double var13 = (double)0.0F;
      double var15 = (double)0.0F;
      Random var17 = new Random(var1.a);

      for(int var18 = 7; var18 >= 0; --var18) {
         var11[var18] = var13;
         var12[var18] = var15;
         var13 += (double)(var17.nextInt(11) - 5);
         var15 += (double)(var17.nextInt(11) - 5);
      }

      for(int var45 = 0; var45 < 4; ++var45) {
         Random var46 = new Random(var1.a);

         for(int var19 = 0; var19 < 3; ++var19) {
            int var20 = 7;
            int var21 = 0;
            if (var19 > 0) {
               var20 = 7 - var19;
            }

            if (var19 > 0) {
               var21 = var20 - 2;
            }

            double var22 = var11[var20] - var13;
            double var24 = var12[var20] - var15;

            for(int var26 = var20; var26 >= var21; --var26) {
               double var27 = var22;
               double var29 = var24;
               if (var19 == 0) {
                  var22 += (double)(var46.nextInt(11) - 5);
                  var24 += (double)(var46.nextInt(11) - 5);
               } else {
                  var22 += (double)(var46.nextInt(31) - 15);
                  var24 += (double)(var46.nextInt(31) - 15);
               }

               var10.a(5);
               float var31 = 0.5F;
               var10.a(0.9F * var31, 0.9F * var31, 1.0F * var31, 0.3F);
               double var32 = 0.1 + (double)var45 * 0.2;
               if (var19 == 0) {
                  var32 *= (double)var26 * 0.1 + (double)1.0F;
               }

               double var34 = 0.1 + (double)var45 * 0.2;
               if (var19 == 0) {
                  var34 *= (double)(var26 - 1) * 0.1 + (double)1.0F;
               }

               for(int var36 = 0; var36 < 5; ++var36) {
                  double var37 = var2 + (double)0.5F - var32;
                  double var39 = var6 + (double)0.5F - var32;
                  if (var36 == 1 || var36 == 2) {
                     var37 += var32 * (double)2.0F;
                  }

                  if (var36 == 2 || var36 == 3) {
                     var39 += var32 * (double)2.0F;
                  }

                  double var41 = var2 + (double)0.5F - var34;
                  double var43 = var6 + (double)0.5F - var34;
                  if (var36 == 1 || var36 == 2) {
                     var41 += var34 * (double)2.0F;
                  }

                  if (var36 == 2 || var36 == 3) {
                     var43 += var34 * (double)2.0F;
                  }

                  var10.a(var41 + var22, var4 + (double)(var26 * 16), var43 + var24);
                  var10.a(var37 + var27, var4 + (double)((var26 + 1) * 16), var39 + var29);
               }

               var10.a();
            }
         }
      }

      GL11.glDisable(3042);
      GL11.glEnable(2896);
      GL11.glEnable(3553);
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(ia v0, double v1, double v2, double v3, float v4, float v5) { this.a((su)v0, v1, v2, v3, v4, v5); }
}
