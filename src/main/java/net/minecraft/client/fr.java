package net.minecraft.client;

public class fr extends yy {
   public fr() {
      super(35, 64, net.minecraft.client.p.m);
   }

   public int a(int var1, int var2) {
      if (var2 == 0) {
         return this.bL;
      } else {
         var2 = ~(var2 & 15);
         return 113 + ((var2 & 8) >> 3) + (var2 & 7) * 16;
      }
   }

   protected int a(int var1) {
      return var1;
   }

   public static int d_(int var0) {
      return ~var0 & 15;
   }

   public static int d(int var0) {
      return ~var0 & 15;
   }
}
