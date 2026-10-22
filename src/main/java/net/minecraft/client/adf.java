package net.minecraft.client;

public class adf extends acy {
   private int a;
   private int b;

   public adf(int var1, int var2, int var3) {
      super(var1);
      this.a = var2;
      this.b = var3;
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      if (var7 != 1) {
         return false;
      } else if (var2.e(var4, var5, var6) && var2.e(var4, var5 + 1, var6)) {
         int var8 = var3.a(var4, var5, var6);
         if (var8 == this.b && var3.h(var4, var5 + 1, var6)) {
            var3.g(var4, var5 + 1, var6, this.a);
            --var1.a;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
