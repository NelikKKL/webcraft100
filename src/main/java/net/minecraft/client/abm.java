package net.minecraft.client;

import java.util.Random;

public class abm extends yy {
   public abm(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.r);
   }

   public int b(int var1) {
      if (var1 == 0) {
         return this.bL + 2;
      } else {
         return var1 == 1 ? this.bL + 1 : this.bL;
      }
   }

   public void a(ry var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if (var1.v(var2, var3, var4)) {
         this.e(var1, var2, var3, var4, 1);
         var1.g(var2, var3, var4, 0);
      }

   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (var5 > 0 && yy.k[var5].g() && var1.v(var2, var3, var4)) {
         this.e(var1, var2, var3, var4, 1);
         var1.g(var2, var3, var4, 0);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void i(ry var1, int var2, int var3, int var4) {
      dd var5 = new dd(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F));
      var5.a = var1.w.nextInt(var5.a / 4) + var5.a / 8;
      var1.a((ia)var5);
   }

   public void e(ry var1, int var2, int var3, int var4, int var5) {
      if (!var1.I) {
         if ((var5 & 1) == 0) {
            this.a(var1, var2, var3, var4, new dk(yy.am.bM, 1, 0));
         } else {
            dd var6 = new dd(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F));
            var1.a((ia)var6);
            var1.a(var6, "random.fuse", 1.0F, 1.0F);
         }

      }
   }

   public void b(ry var1, int var2, int var3, int var4, vi var5) {
      if (var5.aH() != null && var5.aH().c == acy.h.bM) {
         var1.c(var2, var3, var4, 1);
      }

      super.b(var1, var2, var3, var4, var5);
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      return super.a(var1, var2, var3, var4, var5);
   }

   protected dk c_(int var1) {
      return null;
   }
}
