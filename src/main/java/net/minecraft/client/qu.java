package net.minecraft.client;

public class qu extends pj {
   private bp a;

   public qu(de var1, bp var2) {
      this.a = var2;

      for(int var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 3; ++var4) {
            this.a(new vv(var2, var4 + var3 * 3, 62 + var4 * 18, 17 + var3 * 18));
         }
      }

      for(int var5 = 0; var5 < 3; ++var5) {
         for(int var7 = 0; var7 < 9; ++var7) {
            this.a(new vv(var1, var7 + var5 * 9 + 9, 8 + var7 * 18, 84 + var5 * 18));
         }
      }

      for(int var6 = 0; var6 < 9; ++var6) {
         this.a(new vv(var1, var6, 8 + var6 * 18, 142));
      }

   }

   public boolean a(vi var1) {
      return this.a.b_(var1);
   }

   public dk a(int var1) {
      dk var2 = null;
      vv var3 = (vv)this.e.get(var1);
      if (var3 != null && var3.c()) {
         dk var4 = var3.b();
         var2 = var4.k();
         if (var1 < 9) {
            if (!this.a(var4, 9, 45, true)) {
               return null;
            }
         } else if (!this.a(var4, 0, 9, false)) {
            return null;
         }

         if (var4.a == 0) {
            var3.c((dk)null);
         } else {
            var3.d();
         }

         if (var4.a == var2.a) {
            return null;
         }

         var3.b(var4);
      }

      return var2;
   }
}
