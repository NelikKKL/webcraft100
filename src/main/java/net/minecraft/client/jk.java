package net.minecraft.client;

import java.util.Random;

public class jk extends yy {
   protected jk(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.v);
      this.b(true);
   }

   public int a(int var1, Random var2, int var3) {
      return acy.aC.bM;
   }

   public int a(Random var1) {
      return 4;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (var1.b(net.minecraft.client.bn.b, var2, var3, var4) > 11) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }
}
