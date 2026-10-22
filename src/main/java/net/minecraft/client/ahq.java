package net.minecraft.client;

import java.util.Random;

public class ahq extends aaf {
   public ahq(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.t, false);
      this.ca = 0.98F;
      this.b(true);
   }

   public int h() {
      return 1;
   }

   public boolean a_(kq var1, int var2, int var3, int var4, int var5) {
      return super.a_(var1, var2, var3, var4, 1 - var5);
   }

   public void a(ry var1, vi var2, int var3, int var4, int var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      p var7 = var1.e(var3, var4 - 1, var5);
      if (var7.d() || var7.a()) {
         var1.g(var3, var4, var5, yy.A.bM);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (var1.b(net.minecraft.client.bn.b, var2, var3, var4) > 11 - net.minecraft.client.yy.o[this.bM]) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, yy.B.bM);
      }

   }

   public int i() {
      return 0;
   }

   protected dk c_(int var1) {
      return null;
   }
}
