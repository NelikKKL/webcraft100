package net.minecraft.client;

public class gi extends aef {
   protected gi(int var1, int var2) {
      super(var1, var2, net.minecraft.client.q.h);
      this.a("untouching");
   }

   public int a(int var1) {
      return 25;
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int a() {
      return 1;
   }

   public boolean a(aef var1) {
      return super.a(var1) && var1.t != s.t;
   }
}
