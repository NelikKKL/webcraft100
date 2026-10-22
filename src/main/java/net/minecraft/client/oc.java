package net.minecraft.client;

import java.util.Random;

public class oc extends yy {
   private boolean a;

   public oc(int var1, int var2, boolean var3) {
      super(var1, var2, net.minecraft.client.p.e);
      if (var3) {
         this.b(true);
      }

      this.a = var3;
   }

   public int d() {
      return 30;
   }

   public void b(ry var1, int var2, int var3, int var4, vi var5) {
      this.g(var1, var2, var3, var4);
      super.b(var1, var2, var3, var4, var5);
   }

   public void b(ry var1, int var2, int var3, int var4, ia var5) {
      this.g(var1, var2, var3, var4);
      super.b(var1, var2, var3, var4, var5);
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      this.g(var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5);
   }

   private void g(ry var1, int var2, int var3, int var4) {
      this.h(var1, var2, var3, var4);
      if (this.bM == yy.aN.bM) {
         var1.g(var2, var3, var4, yy.aO.bM);
      }

   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (this.bM == yy.aO.bM) {
         var1.g(var2, var3, var4, yy.aN.bM);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return acy.aB.bM;
   }

   public int a(int var1, Random var2) {
      return this.a(var2) + var2.nextInt(var1 + 1);
   }

   public int a(Random var1) {
      return 4 + var1.nextInt(2);
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      if (this.a) {
         this.h(var1, var2, var3, var4);
      }

   }

   private void h(ry var1, int var2, int var3, int var4) {
      Random var5 = var1.w;
      double var6 = (double)0.0625F;

      for(int var8 = 0; var8 < 6; ++var8) {
         double var9 = (double)((float)var2 + var5.nextFloat());
         double var11 = (double)((float)var3 + var5.nextFloat());
         double var13 = (double)((float)var4 + var5.nextFloat());
         if (var8 == 0 && !var1.f(var2, var3 + 1, var4)) {
            var11 = (double)(var3 + 1) + var6;
         }

         if (var8 == 1 && !var1.f(var2, var3 - 1, var4)) {
            var11 = (double)(var3 + 0) - var6;
         }

         if (var8 == 2 && !var1.f(var2, var3, var4 + 1)) {
            var13 = (double)(var4 + 1) + var6;
         }

         if (var8 == 3 && !var1.f(var2, var3, var4 - 1)) {
            var13 = (double)(var4 + 0) - var6;
         }

         if (var8 == 4 && !var1.f(var2 + 1, var3, var4)) {
            var9 = (double)(var2 + 1) + var6;
         }

         if (var8 == 5 && !var1.f(var2 - 1, var3, var4)) {
            var9 = (double)(var2 + 0) - var6;
         }

         if (var9 < (double)var2 || var9 > (double)(var2 + 1) || var11 < (double)0.0F || var11 > (double)(var3 + 1) || var13 < (double)var4 || var13 > (double)(var4 + 1)) {
            var1.a("reddust", var9, var11, var13, (double)0.0F, (double)0.0F, (double)0.0F);
         }
      }

   }

   protected dk c_(int var1) {
      return new dk(yy.aN);
   }
}
