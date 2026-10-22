package net.minecraft.client;

import java.util.Random;

public class aet extends wg {
   protected aet(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.4F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (!var1.I) {
         super.a(var1, var2, var3, var4, var5);
         if (var1.n(var2, var3 + 1, var4) >= 9 && var5.nextInt(7) == 0) {
            int var6 = var1.d(var2, var3, var4);
            if ((var6 & 8) == 0) {
               var1.f(var2, var3, var4, var6 | 8);
            } else {
               this.c(var1, var2, var3, var4, var5);
            }
         }

      }
   }

   public int a(int var1, int var2) {
      var2 &= 3;
      if (var2 == 1) {
         return 63;
      } else {
         return var2 == 2 ? 79 : super.a(var1, var2);
      }
   }

   public void c(ry var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.d(var2, var3, var4) & 3;
      var1.d(var2, var3, var4, 0);
      Object var7 = null;
      if (var6 == 1) {
         var7 = new ty(true);
      } else if (var6 == 2) {
         var7 = new jp(true);
      } else {
         var7 = new gq(true);
         if (var5.nextInt(10) == 0) {
            var7 = new yd(true);
         }
      }

      if (!((ig)var7).a(var1, var5, var2, var3, var4)) {
         var1.b(var2, var3, var4, this.bM, var6);
      }

   }

   protected int a(int var1) {
      return var1 & 3;
   }
}
