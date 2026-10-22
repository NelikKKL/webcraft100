package net.minecraft.client;

public class rn extends yy {
   protected rn(int var1) {
      super(var1, net.minecraft.client.p.d);
      this.bL = 59;
   }

   public int b(int var1) {
      if (var1 == 1) {
         return this.bL - 16;
      } else if (var1 == 0) {
         return yy.x.b(0);
      } else {
         return var1 != 2 && var1 != 4 ? this.bL : this.bL + 1;
      }
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      if (var1.I) {
         return true;
      } else {
         var5.a(var2, var3, var4);
         return true;
      }
   }
}
