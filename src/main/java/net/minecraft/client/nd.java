package net.minecraft.client;

public class nd extends xe {
   private int a = 0;
   private int b = 0;

   public void a() {
      this.a = 0;
      this.o.clear();
      byte var1 = -16;
      this.o.add(new ct(1, this.m / 2 - 100, this.n / 4 + 120 + var1, "Save and quit to title"));
      if (this.l.l()) {
         ((ct)this.o.get(0)).e = "Disconnect";
      }

      this.o.add(new ct(4, this.m / 2 - 100, this.n / 4 + 24 + var1, "Back to game"));
      this.o.add(new ct(0, this.m / 2 - 100, this.n / 4 + 96 + var1, "Options..."));
      this.o.add(new ct(5, this.m / 2 - 100, this.n / 4 + 48 + var1, 98, 20, hj.a("gui.achievements")));
      this.o.add(new ct(6, this.m / 2 + 2, this.n / 4 + 48 + var1, 98, 20, hj.a("gui.stats")));
   }

   protected void a(ct var1) {
      if (var1.f == 0) {
         this.l.a((xe)(new ex(this, this.l.A)));
      }

      if (var1.f == 1) {
         this.l.K.a(ny.j, 1);
         if (this.l.l()) {
            this.l.f.g();
         }

         this.l.a((ry)null);
         this.l.a((xe)(new eh()));
      }

      if (var1.f == 4) {
         this.l.a((xe)null);
         this.l.g();
      }

      if (var1.f == 5) {
         this.l.a((xe)(new qx(this.l.K)));
      }

      if (var1.f == 6) {
         this.l.a((xe)(new in(this, this.l.K)));
      }

   }

   public void s_() {
      super.s_();
      ++this.b;
   }

   public void a(int var1, int var2, float var3) {
      this.j();
      boolean var4 = !this.l.f.c(this.a++);
      if (var4 || this.b < 20) {
         float var5 = ((float)(this.b % 10) + var3) / 10.0F;
         var5 = me.a(var5 * (float)Math.PI * 2.0F) * 0.2F + 0.8F;
         int var6 = (int)(255.0F * var5);
         this.b(this.q, "Saving level..", 8, this.n - 16, var6 << 16 | var6 << 8 | var6);
      }

      this.a(this.q, "Game menu", this.m / 2, 40, 16777215);
      super.a(var1, var2, var3);
   }
}
