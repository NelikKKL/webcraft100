package net.minecraft.client;

public class dq extends aef {
   protected dq(int var1, int var2) {
      super(var1, var2, net.minecraft.client.q.h);
      this.a("durability");
   }

   public int a(int var1) {
      return 5 + (var1 - 1) * 10;
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int a() {
      return 3;
   }
}
