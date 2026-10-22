package net.minecraft.client;

import java.util.Random;

public class aha extends wg {
   protected aha(int var1, int var2) {
      super(var1, var2);
      this.bL = var2;
      this.b(true);
      float var3 = 0.5F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
   }

   protected boolean d(int var1) {
      return var1 == yy.aA.bM;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if (var1.n(var2, var3 + 1, var4) >= 9) {
         int var6 = var1.d(var2, var3, var4);
         if (var6 < 7) {
            float var7 = this.j(var1, var2, var3, var4);
            if (var5.nextInt((int)(25.0F / var7) + 1) == 0) {
               ++var6;
               var1.f(var2, var3, var4, var6);
            }
         }
      }

   }

   public void g(ry var1, int var2, int var3, int var4) {
      var1.f(var2, var3, var4, 7);
   }

   private float j(ry var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      int var6 = var1.a(var2, var3, var4 - 1);
      int var7 = var1.a(var2, var3, var4 + 1);
      int var8 = var1.a(var2 - 1, var3, var4);
      int var9 = var1.a(var2 + 1, var3, var4);
      int var10 = var1.a(var2 - 1, var3, var4 - 1);
      int var11 = var1.a(var2 + 1, var3, var4 - 1);
      int var12 = var1.a(var2 + 1, var3, var4 + 1);
      int var13 = var1.a(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this.bM || var9 == this.bM;
      boolean var15 = var6 == this.bM || var7 == this.bM;
      boolean var16 = var10 == this.bM || var11 == this.bM || var12 == this.bM || var13 == this.bM;

      for(int var17 = var2 - 1; var17 <= var2 + 1; ++var17) {
         for(int var18 = var4 - 1; var18 <= var4 + 1; ++var18) {
            int var19 = var1.a(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if (var19 == yy.aA.bM) {
               var20 = 1.0F;
               if (var1.d(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if (var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if (var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public int a(int var1, int var2) {
      if (var2 < 0) {
         var2 = 7;
      }

      return this.bL + var2;
   }

   public int c() {
      return 6;
   }

   public void a(ry var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, 0);
      if (!var1.I) {
         int var8 = 3 + var7;

         for(int var9 = 0; var9 < var8; ++var9) {
            if (var1.w.nextInt(15) <= var5) {
               float var10 = 0.7F;
               float var11 = var1.w.nextFloat() * var10 + (1.0F - var10) * 0.5F;
               float var12 = var1.w.nextFloat() * var10 + (1.0F - var10) * 0.5F;
               float var13 = var1.w.nextFloat() * var10 + (1.0F - var10) * 0.5F;
               ih var14 = new ih(var1, (double)((float)var2 + var11), (double)((float)var3 + var12), (double)((float)var4 + var13), new dk(acy.R));
               var14.c = 10;
               var1.a((ia)var14);
            }
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      return var1 == 7 ? acy.S.bM : -1;
   }

   public int a(Random var1) {
      return 1;
   }
}
