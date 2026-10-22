package net.minecraft.client;

import java.util.Random;

public class aif extends yy {
   protected aif(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.u);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.b(true);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4) & 7;
      return var5 >= 3 ? net.minecraft.client.c.b((double)var2 + this.bR, (double)var3 + this.bS, (double)var4 + this.bT, (double)var2 + this.bU, (double)((float)var3 + 0.5F), (double)var4 + this.bW) : null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public void b(kq var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4) & 7;
      float var6 = (float)(2 * (1 + var5)) / 16.0F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, var6, 1.0F);
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      return var5 != 0 && yy.k[var5].a() ? var1.e(var2, var3 - 1, var4).d() : false;
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      this.g(var1, var2, var3, var4);
   }

   private boolean g(ry var1, int var2, int var3, int var4) {
      if (!this.c(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public void a(ry var1, vi var2, int var3, int var4, int var5, int var6) {
      int var7 = acy.aC.bM;
      float var8 = 0.7F;
      double var9 = (double)(var1.w.nextFloat() * var8) + (double)(1.0F - var8) * (double)0.5F;
      double var11 = (double)(var1.w.nextFloat() * var8) + (double)(1.0F - var8) * (double)0.5F;
      double var13 = (double)(var1.w.nextFloat() * var8) + (double)(1.0F - var8) * (double)0.5F;
      ih var15 = new ih(var1, (double)var3 + var9, (double)var4 + var11, (double)var5 + var13, new dk(var7, 1, 0));
      var15.c = 10;
      var1.a((ia)var15);
      var1.g(var3, var4, var5, 0);
      var2.a((px)ny.C[this.bM], 1);
   }

   public int a(int var1, Random var2, int var3) {
      return acy.aC.bM;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (var1.b(net.minecraft.client.bn.b, var2, var3, var4) > 11) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public boolean a_(kq var1, int var2, int var3, int var4, int var5) {
      return var5 == 1 ? true : super.a_(var1, var2, var3, var4, var5);
   }
}
