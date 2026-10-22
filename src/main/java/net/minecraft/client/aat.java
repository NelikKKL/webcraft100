package net.minecraft.client;

public class aat extends yy {
   public aat(int var1) {
      super(var1, 192, net.minecraft.client.p.e);
   }

   public int b(int var1) {
      if (var1 == 1) {
         return this.bL - 16;
      } else {
         return var1 == 0 ? this.bL + 16 : this.bL;
      }
   }
}
