package net.minecraft.client;

import java.util.Random;

public class v extends yy {
   public v(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.e);
   }

   public int a(int var1, Random var2, int var3) {
      if (this.bM == yy.I.bM) {
         return acy.l.bM;
      } else if (this.bM == yy.aw.bM) {
         return acy.m.bM;
      } else {
         return this.bM == yy.N.bM ? acy.aV.bM : this.bM;
      }
   }

   public int a(Random var1) {
      return this.bM == yy.N.bM ? 4 + var1.nextInt(5) : 1;
   }

   public int a(int var1, Random var2) {
      if (var1 > 0 && this.bM != this.a(0, var2, var1)) {
         int var3 = var2.nextInt(var1 + 2) - 1;
         if (var3 < 0) {
            var3 = 0;
         }

         return this.a(var2) * (var3 + 1);
      } else {
         return this.a(var2);
      }
   }

   protected int a(int var1) {
      return this.bM == yy.N.bM ? 4 : 0;
   }
}
