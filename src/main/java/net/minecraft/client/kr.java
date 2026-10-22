package net.minecraft.client;

public class kr extends aef {
   protected kr(int var1, int var2) {
      super(var1, var2, net.minecraft.client.q.h);
      this.a("digging");
   }

   public int a(int var1) {
      return 1 + 15 * (var1 - 1);
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int a() {
      return 5;
   }
}
