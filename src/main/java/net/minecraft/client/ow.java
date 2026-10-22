package net.minecraft.client;

import java.util.Random;

public class ow extends yy {
   protected ow(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.w);
      this.b(true);
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (var1.h(var2, var3 + 1, var4)) {
         int var6;
         for(var6 = 1; var1.a(var2, var3 - var6, var4) == this.bM; ++var6) {
         }

         if (var6 < 3) {
            int var7 = var1.d(var2, var3, var4);
            if (var7 == 15) {
               var1.g(var2, var3 + 1, var4, this.bM);
               var1.f(var2, var3, var4, 0);
            } else {
               var1.f(var2, var3, var4, var7 + 1);
            }
         }
      }

   }

   public c b(ry var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return net.minecraft.client.c.b((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)((float)(var3 + 1) - var5), (double)((float)(var4 + 1) - var5));
   }

   public c c_(ry var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return net.minecraft.client.c.b((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)(var3 + 1), (double)((float)(var4 + 1) - var5));
   }

   public int b(int var1) {
      if (var1 == 1) {
         return this.bL - 1;
      } else {
         return var1 == 0 ? this.bL + 1 : this.bL;
      }
   }

   public boolean b() {
      return false;
   }

   public boolean a() {
      return false;
   }

   public int c() {
      return 13;
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
      if (var1.e(var2 - 1, var3, var4).b()) {
         return false;
      } else if (var1.e(var2 + 1, var3, var4).b()) {
         return false;
      } else if (var1.e(var2, var3, var4 - 1).b()) {
         return false;
      } else if (var1.e(var2, var3, var4 + 1).b()) {
         return false;
      } else {
         int var5 = var1.a(var2, var3 - 1, var4);
         return var5 == yy.aV.bM || var5 == yy.E.bM;
      }
   }

   public void a(ry var1, int var2, int var3, int var4, ia var5) {
      var5.a(pm.g, 1);
   }
}
