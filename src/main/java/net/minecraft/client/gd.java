package net.minecraft.client;

public class gd extends pj {
   public lm a;
   public de b;
   public boolean c;

   public gd(x var1) {
      this(var1, true);
   }

   public gd(x var1, boolean var2) {
      this.a = new lm(this, 2, 2);
      this.b = new iy();
      this.c = false;
      this.c = var2;
      this.a((vv)(new afe(var1.d, this.a, this.b, 0, 144, 36)));

      for(int var3 = 0; var3 < 2; ++var3) {
         for(int var4 = 0; var4 < 2; ++var4) {
            this.a((vv)(new vv(this.a, var4 + var3 * 2, 88 + var4 * 18, 26 + var3 * 18)));
         }
      }

      for(int var5 = 0; var5 < 4; ++var5) {
         this.a((vv)(new pi(this, var1, var1.c() - 1 - var5, 8, 8 + var5 * 18, var5)));
      }

      for(int var6 = 0; var6 < 3; ++var6) {
         for(int var8 = 0; var8 < 9; ++var8) {
            this.a((vv)(new vv(var1, var8 + (var6 + 1) * 9, 8 + var8 * 18, 84 + var6 * 18)));
         }
      }

      for(int var7 = 0; var7 < 9; ++var7) {
         this.a((vv)(new vv(var1, var7, 8 + var7 * 18, 142)));
      }

      this.a((de)this.a);
   }

   public void a(de var1) {
      this.b.a(0, sl.a().a(this.a));
   }

   public void b(vi var1) {
      super.b(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         dk var3 = this.a.d(var2);
         if (var3 != null) {
            var1.a(var3);
            this.a.a(var2, (dk)null);
         }
      }

   }

   public boolean a(vi var1) {
      return true;
   }

   public dk a(int var1) {
      dk var2 = null;
      vv var3 = (vv)this.e.get(var1);
      if (var3 != null && var3.c()) {
         dk var4 = var3.b();
         var2 = var4.k();
         if (var1 == 0) {
            if (!this.a(var4, 9, 45, true)) {
               return null;
            }
         } else if (var1 >= 9 && var1 < 36) {
            if (!this.a(var4, 36, 45, false)) {
               return null;
            }
         } else if (var1 >= 36 && var1 < 45) {
            if (!this.a(var4, 9, 36, false)) {
               return null;
            }
         } else if (!this.a(var4, 9, 45, false)) {
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
