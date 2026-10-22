package net.minecraft.client;

public class eg extends pj {
   private oe a;
   private int b = 0;
   private int c = 0;
   private int h = 0;

   public eg(x var1, oe var2) {
      this.a = var2;
      this.a(new vv(var2, 0, 56, 17));
      this.a(new vv(var2, 1, 56, 53));
      this.a(new ie(var1.d, var2, 2, 116, 35));

      for(int var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 9; ++var4) {
            this.a(new vv(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for(int var5 = 0; var5 < 9; ++var5) {
         this.a(new vv(var1, var5, 8 + var5 * 18, 142));
      }

   }

   public void a() {
      super.a();

      for(int var1 = 0; var1 < this.g.size(); ++var1) {
         abd var2 = (abd)this.g.get(var1);
         if (this.b != this.a.j) {
            var2.a(this, 0, this.a.j);
         }

         if (this.c != this.a.a) {
            var2.a(this, 1, this.a.a);
         }

         if (this.h != this.a.b) {
            var2.a(this, 2, this.a.b);
         }
      }

      this.b = this.a.j;
      this.c = this.a.a;
      this.h = this.a.b;
   }

   public void a(int var1, int var2) {
      if (var1 == 0) {
         this.a.j = var2;
      }

      if (var1 == 1) {
         this.a.a = var2;
      }

      if (var1 == 2) {
         this.a.b = var2;
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
         if (var1 == 2) {
            if (!this.a(var4, 3, 39, true)) {
               return null;
            }
         } else if (var1 >= 3 && var1 < 30) {
            if (!this.a(var4, 30, 39, false)) {
               return null;
            }
         } else if (var1 >= 30 && var1 < 39) {
            if (!this.a(var4, 3, 30, false)) {
               return null;
            }
         } else if (!this.a(var4, 3, 39, false)) {
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
