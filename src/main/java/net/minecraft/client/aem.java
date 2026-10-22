package net.minecraft.client;

import java.util.Random;

public class aem extends yy {
   protected aem(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.B);
      this.b(true);
   }

   public void b(kq var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      this.a(var7, 0.0F, var6, 1.0F - var6, var8, 1.0F - var6);
   }

   public void e() {
      float var1 = 0.0625F;
      float var2 = 0.5F;
      this.a(var1, 0.0F, var1, 1.0F - var1, var2, 1.0F - var1);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      return net.minecraft.client.c.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)var3 + var8 - var6), (double)((float)(var4 + 1) - var6));
   }

   public c c_(ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      return net.minecraft.client.c.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)var3 + var8), (double)((float)(var4 + 1) - var6));
   }

   public int a(int var1, int var2) {
      if (var1 == 1) {
         return this.bL;
      } else if (var1 == 0) {
         return this.bL + 3;
      } else {
         return var2 > 0 && var1 == 4 ? this.bL + 2 : this.bL + 1;
      }
   }

   public int b(int var1) {
      if (var1 == 1) {
         return this.bL;
      } else {
         return var1 == 0 ? this.bL + 3 : this.bL + 1;
      }
   }

   public boolean b() {
      return false;
   }

   public boolean a() {
      return false;
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      this.c(var1, var2, var3, var4, var5);
      return true;
   }

   public void b(ry var1, int var2, int var3, int var4, vi var5) {
      this.c(var1, var2, var3, var4, var5);
   }

   private void c(ry var1, int var2, int var3, int var4, vi var5) {
      if (var5.b(false)) {
         var5.aO().a(2, 0.1F);
         int var6 = var1.d(var2, var3, var4) + 1;
         if (var6 >= 6) {
            var1.g(var2, var3, var4, 0);
         } else {
            var1.f(var2, var3, var4, var6);
            var1.k(var2, var3, var4);
         }
      }

   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return !super.c(var1, var2, var3, var4) ? false : this.e(var1, var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (!this.e(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public boolean e(ry var1, int var2, int var3, int var4) {
      return var1.e(var2, var3 - 1, var4).b();
   }

   public int a(Random var1) {
      return 0;
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }
}
