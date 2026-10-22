package net.minecraft.client;

public class ace extends pj {
   public lm a = new lm(this, 3, 3);
   public de b = new iy();
   private ry c;
   private int h;
   private int i;
   private int j;

   public ace(x var1, ry var2, int var3, int var4, int var5) {
      this.c = var2;
      this.h = var3;
      this.i = var4;
      this.j = var5;
      this.a((vv)(new afe(var1.d, this.a, this.b, 0, 124, 35)));

      for(int var6 = 0; var6 < 3; ++var6) {
         for(int var7 = 0; var7 < 3; ++var7) {
            this.a((vv)(new vv(this.a, var7 + var6 * 3, 30 + var7 * 18, 17 + var6 * 18)));
         }
      }

      for(int var8 = 0; var8 < 3; ++var8) {
         for(int var10 = 0; var10 < 9; ++var10) {
            this.a((vv)(new vv(var1, var10 + var8 * 9 + 9, 8 + var10 * 18, 84 + var8 * 18)));
         }
      }

      for(int var9 = 0; var9 < 9; ++var9) {
         this.a((vv)(new vv(var1, var9, 8 + var9 * 18, 142)));
      }

      this.a((de)this.a);
   }

   public void a(de var1) {
      this.b.a(0, sl.a().a(this.a));
   }

   public void b(vi var1) {
      super.b(var1);
      if (!this.c.I) {
         for(int var2 = 0; var2 < 9; ++var2) {
            dk var3 = this.a.d(var2);
            if (var3 != null) {
               var1.a(var3);
            }
         }

      }
   }

   public boolean a(vi var1) {
      if (this.c.a(this.h, this.i, this.j) != yy.ay.bM) {
         return false;
      } else {
         return !(var1.f((double)this.h + (double)0.5F, (double)this.i + (double)0.5F, (double)this.j + (double)0.5F) > (double)64.0F);
      }
   }

   public dk a(int var1) {
      dk var2 = null;
      vv var3 = (vv)this.e.get(var1);
      if (var3 != null && var3.c()) {
         dk var4 = var3.b();
         var2 = var4.k();
         if (var1 == 0) {
            if (!this.a(var4, 10, 46, true)) {
               return null;
            }
         } else if (var1 >= 10 && var1 < 37) {
            if (!this.a(var4, 37, 46, false)) {
               return null;
            }
         } else if (var1 >= 37 && var1 < 46) {
            if (!this.a(var4, 10, 37, false)) {
               return null;
            }
         } else if (!this.a(var4, 10, 46, false)) {
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
