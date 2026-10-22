package net.minecraft.client;

import java.util.List;

public class abv extends acy {
   public abv(int var1) {
      super(var1);
      this.bN = 1;
   }

   public dk c(dk var1, ry var2, vi var3) {
      float var4 = 1.0F;
      float var5 = var3.B + (var3.z - var3.B) * var4;
      float var6 = var3.A + (var3.y - var3.A) * var4;
      double var7 = var3.p + (var3.s - var3.p) * (double)var4;
      double var9 = var3.q + (var3.t - var3.q) * (double)var4 + 1.62 - (double)var3.L;
      double var11 = var3.r + (var3.u - var3.r) * (double)var4;
      fb var13 = fb.b(var7, var9, var11);
      float var14 = me.b(-var6 * ((float)Math.PI / 180F) - (float)Math.PI);
      float var15 = me.a(-var6 * ((float)Math.PI / 180F) - (float)Math.PI);
      float var16 = -me.b(-var5 * ((float)Math.PI / 180F));
      float var17 = me.a(-var5 * ((float)Math.PI / 180F));
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = (double)5.0F;
      fb var23 = var13.c((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      gv var24 = var2.a(var13, var23, true);
      if (var24 == null) {
         return var1;
      } else {
         fb var25 = var3.f(var4);
         int var26 = 0;
         float var27 = 1.0F;
         List var28 = var2.b((ia)var3, (c)var3.C.a(var25.a * var21, var25.b * var21, var25.c * var21).b((double)var27, (double)var27, (double)var27));

         for(int var29 = 0; var29 < var28.size(); ++var29) {
            ia var30 = (ia)var28.get(var29);
            if (var30.e_()) {
               float var31 = var30.Q();
               c var32 = var30.C.b((double)var31, (double)var31, (double)var31);
               if (var32.a(var13)) {
                  var26 = 1;
               }
            }
         }

         if (var26 != 0) {
            return var1;
         } else {
            if (var24.a == net.minecraft.client.bo.a) {
               int var33 = var24.b;
               var26 = var24.c;
               int var35 = var24.d;
               if (!var2.I) {
                  if (var2.a(var33, var26, var35) == yy.aS.bM) {
                     --var26;
                  }

                  var2.a((ia)(new no(var2, (double)((float)var33 + 0.5F), (double)((float)var26 + 1.0F), (double)((float)var35 + 0.5F))));
               }

               if (!var3.cc.d) {
                  --var1.a;
               }
            }

            return var1;
         }
      }
   }
}
