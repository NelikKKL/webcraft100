package net.minecraft.client;

public class ak extends pj {
   private de a;
   private int b;

   public ak(de var1, de var2) {
      this.a = var2;
      this.b = var2.c() / 9;
      var2.j();
      int var3 = (this.b - 4) * 18;

      for(int var4 = 0; var4 < this.b; ++var4) {
         for(int var5 = 0; var5 < 9; ++var5) {
            this.a(new vv(var2, var5 + var4 * 9, 8 + var5 * 18, 18 + var4 * 18));
         }
      }

      for(int var6 = 0; var6 < 3; ++var6) {
         for(int var8 = 0; var8 < 9; ++var8) {
            this.a(new vv(var1, var8 + var6 * 9 + 9, 8 + var8 * 18, 103 + var6 * 18 + var3));
         }
      }

      for(int var7 = 0; var7 < 9; ++var7) {
         this.a(new vv(var1, var7, 8 + var7 * 18, 161 + var3));
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
         if (var1 < this.b * 9) {
            if (!this.a(var4, this.b * 9, this.e.size(), true)) {
               return null;
            }
         } else if (!this.a(var4, 0, this.b * 9, false)) {
            return null;
         }

         if (var4.a == 0) {
            var3.c((dk)null);
         } else {
            var3.d();
         }
      }

      return var2;
   }

   public void b(vi var1) {
      super.b(var1);
      this.a.k();
   }
}
