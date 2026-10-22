package net.minecraft.client;

import java.util.Random;

public class kv extends wg {
   protected kv(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.4F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.8F, 0.5F + var3);
   }

   public int a(int var1, int var2) {
      if (var2 == 1) {
         return this.bL;
      } else if (var2 == 2) {
         return this.bL + 16 + 1;
      } else {
         return var2 == 0 ? this.bL + 16 : this.bL;
      }
   }

   public int f() {
      double var1 = (double)0.5F;
      double var3 = (double)1.0F;
      return ha.a(var1, var3);
   }

   public int c(int var1) {
      return var1 == 0 ? 16777215 : db.c();
   }

   public int a(kq var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      return var5 == 0 ? 16777215 : var1.a().a(var2, var4).a(var1, var2, var3, var4);
   }

   public int a(int var1, Random var2, int var3) {
      return var2.nextInt(8) == 0 ? acy.R.bM : -1;
   }

   public int a(int var1, Random var2) {
      return 1 + var2.nextInt(var1 * 2 + 1);
   }

   public void a(ry var1, vi var2, int var3, int var4, int var5, int var6) {
      if (!var1.I && var2.aH() != null && var2.aH().c == acy.bd.bM) {
         var2.a((px)ny.C[this.bM], 1);
         this.a(var1, var3, var4, var5, new dk(yy.X, 1, var6));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }
}
