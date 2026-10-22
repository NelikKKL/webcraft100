package net.minecraft.client;

import org.lwjgl.opengl.GL11;

class jo extends jn {
   // $FF: synthetic field
   final xi a;

   public jo(xi var1) {
      super(var1.l, var1.m, var1.n, 32, var1.n - 64, 36);
      this.a = var1;
   }

   protected int a() {
      return xi.a(this.a).size();
   }

   protected void a(int var1, boolean var2) {
      xi.a(this.a, var1);
      boolean var3 = xi.b(this.a) >= 0 && xi.b(this.a) < this.a();
      xi.c(this.a).g = var3;
      xi.d(this.a).g = var3;
      xi.e(this.a).g = var3;
      if (var2 && var3) {
         xi.b(this.a, var1);
      }

   }

   protected boolean a(int var1) {
      return var1 == xi.b(this.a);
   }

   protected int b() {
      return xi.a(this.a).size() * 36;
   }

   protected void c() {
      this.a.j();
   }

   protected void a(int var1, int var2, int var3, int var4, cv var5) {
      lo var6 = (lo)xi.a(this.a).get(var1);
      synchronized(xi.l()) {
         if (xi.m() < 5 && !var6.f) {
            var6.f = true;
            var6.e = -2L;
            var6.d = "";
            var6.c = "";
            xi.n();
            (new yb(this, var6)).start();
         }
      }

      this.a.b(this.a.q, var6.a, var2 + 2, var3 + 1, 16777215);
      this.a.b(this.a.q, var6.d, var2 + 2, var3 + 12, 8421504);
      this.a.b(this.a.q, var6.c, var2 + 215 - this.a.q.a(var6.c), var3 + 12, 8421504);
      this.a.b(this.a.q, var6.b, var2 + 2, var3 + 12 + 11, 3158064);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.a.l.p.b(this.a.l.p.b("/gui/icons.png"));
      byte var7 = 0;
      int var8 = 0;
      String var9 = "";
      if (var6.f && var6.e != -2L) {
         var7 = 0;
         var8 = 0;
         if (var6.e < 0L) {
            var8 = 5;
         } else if (var6.e < 150L) {
            var8 = 0;
         } else if (var6.e < 300L) {
            var8 = 1;
         } else if (var6.e < 600L) {
            var8 = 2;
         } else if (var6.e < 1000L) {
            var8 = 3;
         } else {
            var8 = 4;
         }

         if (var6.e < 0L) {
            var9 = "(no connection)";
         } else {
            var9 = var6.e + "ms";
         }
      } else {
         var7 = 1;
         var8 = (int)(System.currentTimeMillis() / 100L + (long)(var1 * 2) & 7L);
         if (var8 > 4) {
            var8 = 8 - var8;
         }

         var9 = "Polling..";
      }

      this.a.b(var2 + 205, var3, 0 + var7 * 10, 176 + var8 * 8, 10, 8);
      byte var10 = 4;
      if (this.e >= var2 + 205 - var10 && this.f >= var3 - var10 && this.e <= var2 + 205 + 10 + var10 && this.f <= var3 + 8 + var10) {
         xi.a(this.a, var9);
      }

   }
}
