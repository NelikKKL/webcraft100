package net.minecraft.client;

public class aie extends aef {
   protected aie(int var1, int var2) {
      super(var1, var2, net.minecraft.client.q.g);
      this.a("fire");
   }

   public int a(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int a() {
      return 2;
   }
}
