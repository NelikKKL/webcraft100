package net.minecraft.client;

import java.util.Random;

public class of extends yy {
   protected of(int var1) {
      super(var1, net.minecraft.client.p.y);
      this.bL = 136;
   }

   public int a(int var1, int var2) {
      return var1 != 1 && var1 != 0 ? 136 : 137;
   }

   public int b(int var1) {
      return var1 != 1 && var1 != 0 ? 136 : 137;
   }

   public int a(int var1, Random var2, int var3) {
      return acy.be.bM;
   }

   public int a(Random var1) {
      return 3 + var1.nextInt(5);
   }

   public int a(int var1, Random var2) {
      int var3 = this.a(var2) + var2.nextInt(1 + var1);
      if (var3 > 9) {
         var3 = 9;
      }

      return var3;
   }
}
