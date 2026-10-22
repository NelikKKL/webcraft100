package net.minecraft.client;

public class cc extends xe {
   private xe b;
   protected String a = "Video Settings";
   private ki c;
   private boolean d = false;
   private static lp[] e;

   public cc(xe var1, ki var2) {
      this.b = var1;
      this.c = var2;
   }

   public void a() {
      qp var1 = qp.a();
      this.a = var1.a("options.videoTitle");
      int var2 = 0;

      for(lp var6 : e) {
         if (!var6.a()) {
            this.o.add(new abs(var6.c(), this.m / 2 - 155 + var2 % 2 * 160, this.n / 6 + 24 * (var2 >> 1), var6, this.c.c(var6)));
         } else {
            this.o.add(new zd(var6.c(), this.m / 2 - 155 + var2 % 2 * 160, this.n / 6 + 24 * (var2 >> 1), var6, this.c.c(var6), this.c.a(var6)));
         }

         ++var2;
      }

      this.o.add(new ct(200, this.m / 2 - 100, this.n / 6 + 168, var1.a("gui.done")));
      this.d = false;
      String[] var9 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for(String var7 : var9) {
         String var8 = System.getProperty(var7);
         if (var8 != null && var8.indexOf("64") >= 0) {
            this.d = true;
            break;
         }
      }

   }

   protected void a(ct var1) {
      if (var1.g) {
         int var2 = this.c.O;
         if (var1.f < 100 && var1 instanceof abs) {
            this.c.a(((abs)var1).a(), 1);
            var1.e = this.c.c(lp.a(var1.f));
         }

         if (var1.f == 200) {
            this.l.A.b();
            this.l.a(this.b);
         }

         if (this.c.O != var2) {
            ef var3 = new ef(this.l.A, this.l.d, this.l.e);
            int var4 = var3.a();
            int var5 = var3.b();
            this.a(this.l, var4, var5);
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.j();
      this.a(this.q, this.a, this.m / 2, 20, 16777215);
      if (!this.d && this.c.e == 0) {
         this.a(this.q, hj.a("options.farWarning1"), this.m / 2, this.n / 6 + 144, 11468800);
         this.a(this.q, hj.a("options.farWarning2"), this.m / 2, this.n / 6 + 144 + 12, 11468800);
      }

      super.a(var1, var2, var3);
   }

   static {
      e = new lp[]{lp.m, lp.g, lp.n, lp.k, lp.i, lp.h, lp.o, lp.j, lp.f, lp.p, lp.q};
   }
}
