package net.minecraft.client;

public class ii extends aef {
   private static final String[] w = new String[]{"all", "fire", "fall", "explosion", "projectile"};
   private static final int[] x = new int[]{1, 10, 5, 5, 3};
   private static final int[] y = new int[]{16, 8, 6, 8, 6};
   private static final int[] z = new int[]{20, 12, 10, 12, 15};
   public final int a;

   public ii(int var1, int var2, int var3) {
      super(var1, var2, net.minecraft.client.q.b);
      this.a = var3;
      if (var3 == 2) {
         this.u = net.minecraft.client.q.c;
      }

   }

   public int a(int var1) {
      return x[this.a] + (var1 - 1) * y[this.a];
   }

   public int b(int var1) {
      return this.a(var1) + z[this.a];
   }

   public int a() {
      return 4;
   }

   public int a(int var1, pm var2) {
      if (var2.f()) {
         return 0;
      } else {
         int var3 = (6 + var1 * var1) / 2;
         if (this.a == 0) {
            return var3;
         } else if (this.a == 1 && var2.k()) {
            return var3;
         } else if (this.a == 2 && var2 == pm.h) {
            return var3 * 2;
         } else if (this.a == 3 && var2 == pm.k) {
            return var3;
         } else {
            return this.a == 4 && var2.b() ? var3 : 0;
         }
      }
   }

   public String b() {
      return "enchantment.protect." + w[this.a];
   }

   public boolean a(aef var1) {
      if (var1 instanceof ii) {
         ii var2 = (ii)var1;
         if (var2.a == this.a) {
            return false;
         } else {
            return this.a == 2 || var2.a == 2;
         }
      } else {
         return super.a(var1);
      }
   }
}
