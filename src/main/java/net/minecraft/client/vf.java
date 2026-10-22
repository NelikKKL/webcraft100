package net.minecraft.client;

import java.util.Random;

public class vf extends yy {
   public vf(int var1) {
      super(var1, 1, net.minecraft.client.p.x);
      this.c(0.0F);
   }

   public void a(ry var1, vi var2, int var3, int var4, int var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public int a(int var1, int var2) {
      if (var2 == 1) {
         return yy.w.bL;
      } else {
         return var2 == 2 ? yy.bm.bL : yy.t.bL;
      }
   }

   public void e(ry var1, int var2, int var3, int var4, int var5) {
      if (!var1.I) {
         gl var6 = new gl(var1);
         var6.c((double)var2 + (double)0.5F, (double)var3, (double)var4 + (double)0.5F, 0.0F, 0.0F);
         var1.a((ia)var6);
         var6.af();
      }

      super.e(var1, var2, var3, var4, var5);
   }

   public int a(Random var1) {
      return 0;
   }

   public static boolean e(int var0) {
      return var0 == yy.t.bM || var0 == yy.w.bM || var0 == yy.bm.bM;
   }

   public static int f(int var0) {
      if (var0 == yy.w.bM) {
         return 1;
      } else {
         return var0 == yy.bm.bM ? 2 : 0;
      }
   }

   protected dk c_(int var1) {
      yy var2 = yy.t;
      if (var1 == 1) {
         var2 = yy.w;
      }

      if (var1 == 2) {
         var2 = yy.bm;
      }

      return new dk(var2);
   }
}
