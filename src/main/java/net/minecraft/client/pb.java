package net.minecraft.client;

import java.util.Date;

class pb extends jn {
   // $FF: synthetic field
   final xz a;

   public pb(xz var1) {
      super(var1.l, var1.m, var1.n, 32, var1.n - 64, 36);
      this.a = var1;
   }

   protected int a() {
      return xz.a(this.a).size();
   }

   protected void a(int var1, boolean var2) {
      xz.a(this.a, var1);
      boolean var3 = xz.b(this.a) >= 0 && xz.b(this.a) < this.a();
      xz.c(this.a).g = var3;
      xz.d(this.a).g = var3;
      xz.e(this.a).g = var3;
      if (var2 && var3) {
         this.a.e(var1);
      }

   }

   protected boolean a(int var1) {
      return var1 == xz.b(this.a);
   }

   protected int b() {
      return xz.a(this.a).size() * 36;
   }

   protected void c() {
      this.a.j();
   }

   protected void a(int var1, int var2, int var3, int var4, cv var5) {
      rr var6 = (rr)xz.a(this.a).get(var1);
      String var7 = var6.b();
      if (var7 == null || me.a(var7)) {
         var7 = xz.f(this.a) + " " + (var1 + 1);
      }

      String var8 = var6.a();
      var8 = var8 + " (" + xz.g(this.a).format(new Date(var6.d()));
      var8 = var8 + ")";
      String var9 = "";
      if (var6.c()) {
         var9 = xz.h(this.a) + " " + var9;
      } else {
         var9 = xz.i(this.a)[var6.e()];
      }

      if (var6.f()) {
         var9 = "§4" + hj.a("gameMode.hardcore") + "§8";
      }

      this.a.b(this.a.q, var7, var2 + 2, var3 + 1, 16777215);
      this.a.b(this.a.q, var8, var2 + 2, var3 + 12, 8421504);
      this.a.b(this.a.q, var9, var2 + 2, var3 + 12 + 10, 8421504);
   }
}
