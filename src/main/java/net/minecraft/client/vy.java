package net.minecraft.client;

import java.util.Random;

public class vy extends wg {
   protected vy(int var1) {
      super(var1, 226);
      this.b(true);
      float var2 = 0.5F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 0.25F, 0.5F + var2);
   }

   protected boolean d(int var1) {
      return var1 == yy.bc.bM;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.d(var2, var3, var4);
      if (var6 < 3) {
         vh var7 = var1.a();
         if (var7 != null) {
            sr var8 = var7.a(var2, var4);
            if (var8 instanceof av && var5.nextInt(15) == 0) {
               ++var6;
               var1.f(var2, var3, var4, var6);
            }
         }
      }

      super.a(var1, var2, var3, var4, var5);
   }

   public int a(int var1, int var2) {
      if (var2 >= 3) {
         return this.bL + 2;
      } else {
         return var2 > 0 ? this.bL + 1 : this.bL;
      }
   }

   public int c() {
      return 6;
   }

   public void a(ry var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (!var1.I) {
         int var8 = 1;
         if (var5 >= 3) {
            var8 = 2 + var1.w.nextInt(3);
            if (var7 > 0) {
               var8 += var1.w.nextInt(var7 + 1);
            }
         }

         for(int var9 = 0; var9 < var8; ++var9) {
            this.a(var1, var2, var3, var4, new dk(acy.bq));
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }
}
