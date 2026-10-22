package net.minecraft.client;

public class qn extends aef {
   protected qn(int var1, int var2, q var3) {
      super(var1, var2, var3);
      this.a("lootBonus");
      if (var3 == net.minecraft.client.q.h) {
         this.a("lootBonusDigger");
      }

   }

   public int a(int var1) {
      return 20 + (var1 - 1) * 12;
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int a() {
      return 3;
   }

   public boolean a(aef var1) {
      return super.a(var1) && var1.t != q.t;
   }
}
