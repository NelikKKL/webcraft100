package net.minecraft.client;

import java.util.ArrayList;
import java.util.Random;

public class rl extends yy {
   public rl(int var1) {
      super(var1, 159, net.minecraft.client.p.q);
   }

   public int a(int var1, int var2) {
      if (var1 == 1) {
         return this.bL - 1;
      } else {
         return var1 == 0 ? this.bL + 16 : this.bL;
      }
   }

   public boolean a() {
      return false;
   }

   public int c() {
      return 26;
   }

   public void e() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
   }

   public void a(ry var1, int var2, int var3, int var4, c var5, ArrayList var6) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
      int var7 = var1.d(var2, var3, var4);
      if (e(var7)) {
         this.a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
         super.a(var1, var2, var3, var4, var5, var6);
      }

      this.e();
   }

   public static boolean e(int var0) {
      return (var0 & 4) != 0;
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public void a(ry var1, int var2, int var3, int var4, nq var5) {
      int var6 = ((me.c((double)(var5.y * 4.0F / 360.0F) + (double)0.5F) & 3) + 2) % 4;
      var1.f(var2, var3, var4, var6);
   }
}
