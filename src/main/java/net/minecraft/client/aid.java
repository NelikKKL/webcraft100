package net.minecraft.client;

import java.util.ArrayList;
import java.util.Random;

public class aid extends ba {
   public static boolean a = false;

   protected aid(int var1, p var2) {
      super(var1, 0, var2);
      this.a(1.0F);
   }

   public bq j_() {
      return new yg();
   }

   public void b(kq var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, var5, 1.0F);
   }

   public boolean a_(kq var1, int var2, int var3, int var4, int var5) {
      return var5 != 0 ? false : super.a_(var1, var2, var3, var4, var5);
   }

   public void a(ry var1, int var2, int var3, int var4, c var5, ArrayList var6) {
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(ry var1, int var2, int var3, int var4, ia var5) {
      if (var5.n == null && var5.m == null && var5 instanceof vi && !var1.I) {
         ((vi)var5).c(1);
      }

   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      double var6 = (double)((float)var2 + var5.nextFloat());
      double var8 = (double)((float)var3 + 0.8F);
      double var10 = (double)((float)var4 + var5.nextFloat());
      double var12 = (double)0.0F;
      double var14 = (double)0.0F;
      double var16 = (double)0.0F;
      var1.a("smoke", var6, var8, var10, var12, var14, var16);
   }

   public int c() {
      return -1;
   }

   public void a(ry var1, int var2, int var3, int var4) {
      if (!a) {
         if (var1.y.g != 0) {
            var1.g(var2, var3, var4, 0);
         }
      }
   }
}
