package net.minecraft.client;

import java.util.Random;

public class wd extends yy {
   private int a;

   public wd(int var1, p var2, int var3, int var4) {
      super(var1, var3, var2);
      this.a = var4;
   }

   public int a(int var1, int var2) {
      if (var2 == 10 && var1 > 1) {
         return this.bL - 1;
      } else if (var2 >= 1 && var2 <= 9 && var1 == 1) {
         return this.bL - 16 - this.a;
      } else if (var2 >= 1 && var2 <= 3 && var1 == 2) {
         return this.bL - 16 - this.a;
      } else if (var2 >= 7 && var2 <= 9 && var1 == 3) {
         return this.bL - 16 - this.a;
      } else if ((var2 == 1 || var2 == 4 || var2 == 7) && var1 == 4) {
         return this.bL - 16 - this.a;
      } else if ((var2 == 3 || var2 == 6 || var2 == 9) && var1 == 5) {
         return this.bL - 16 - this.a;
      } else if (var2 == 14) {
         return this.bL - 16 - this.a;
      } else {
         return var2 == 15 ? this.bL - 1 : this.bL;
      }
   }

   public int a(Random var1) {
      int var2 = var1.nextInt(10) - 7;
      if (var2 < 0) {
         var2 = 0;
      }

      return var2;
   }

   public int a(int var1, Random var2, int var3) {
      return yy.af.bM + this.a;
   }
}
