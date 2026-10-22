package net.minecraft.client;

public class ex extends xe {
   private xe b;
   protected String a = "Options";
   private ki c;
   private static lp[] d;

   public ex(xe var1, ki var2) {
      this.b = var1;
      this.c = var2;
   }

   public void a() {
      qp var1 = qp.a();
      this.a = var1.a("options.title");
      int var2 = 0;

      for(lp var6 : d) {
         if (!var6.a()) {
            abs var7 = new abs(var6.c(), this.m / 2 - 155 + var2 % 2 * 160, this.n / 6 + 24 * (var2 >> 1), var6, this.c.c(var6));
            if (var6 == lp.l && this.l.f != null && this.l.f.z().s()) {
               var7.g = false;
               var7.e = hj.a("options.difficulty") + ": " + hj.a("options.difficulty.hardcore");
            }

            this.o.add(var7);
         } else {
            this.o.add(new zd(var6.c(), this.m / 2 - 155 + var2 % 2 * 160, this.n / 6 + 24 * (var2 >> 1), var6, this.c.c(var6), this.c.a(var6)));
         }

         ++var2;
      }

      this.o.add(new ct(101, this.m / 2 - 100, this.n / 6 + 96 + 12, var1.a("options.video")));
      this.o.add(new ct(100, this.m / 2 - 100, this.n / 6 + 120 + 12, var1.a("options.controls")));
      this.o.add(new ct(200, this.m / 2 - 100, this.n / 6 + 168, var1.a("gui.done")));
   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f < 100 && var1 instanceof abs) {
            this.c.a(((abs)var1).a(), 1);
            var1.e = this.c.c(lp.a(var1.f));
         }

         if (var1.f == 101) {
            this.l.A.b();
            this.l.a((xe)(new cc(this, this.c)));
         }

         if (var1.f == 100) {
            this.l.A.b();
            this.l.a((xe)(new ee(this, this.c)));
         }

         if (var1.f == 200) {
            this.l.A.b();
            this.l.a(this.b);
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.j();
      this.a(this.q, this.a, this.m / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }

   static {
      d = new lp[]{lp.a, lp.b, lp.c, lp.d, lp.e, lp.l};
   }
}
