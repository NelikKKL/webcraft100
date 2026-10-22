package net.minecraft.client;

public class aex extends acy {
   public int a;

   public aex(int var1, int var2) {
      super(var1);
      this.bN = 1;
      this.a = var2;
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      if (afr.e(var8)) {
         if (!var3.I) {
            var3.a((ia)(new vm(var3, (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.a)));
         }

         --var1.a;
         return true;
      } else {
         return false;
      }
   }
}
