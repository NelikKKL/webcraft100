package net.minecraft.client;

public class ap extends aef {
   private static final String[] w = new String[]{"all", "undead", "arthropods"};
   private static final int[] x = new int[]{1, 5, 5};
   private static final int[] y = new int[]{16, 8, 8};
   private static final int[] z = new int[]{20, 20, 20};
   public final int a;

   public ap(int var1, int var2, int var3) {
      super(var1, var2, net.minecraft.client.q.g);
      this.a = var3;
   }

   public int a(int var1) {
      return x[this.a] + (var1 - 1) * y[this.a];
   }

   public int b(int var1) {
      return this.a(var1) + z[this.a];
   }

   public int a() {
      return 5;
   }

   public int a(int var1, nq var2) {
      if (this.a == 0) {
         return var1 * 3;
      } else if (this.a == 1 && var2.r_() == el.b) {
         return var1 * 4;
      } else {
         return this.a == 2 && var2.r_() == el.c ? var1 * 4 : 0;
      }
   }

   public String b() {
      return "enchantment.damage." + w[this.a];
   }

   public boolean a(aef var1) {
      return !(var1 instanceof ap);
   }
}
