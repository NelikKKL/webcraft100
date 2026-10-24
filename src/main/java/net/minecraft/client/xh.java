package net.minecraft.client;

import java.util.Random;
import org.lwjgl.input.Keyboard;

public class xh extends xe {
   private xe a;
   private dv b;
   private dv c;
   private String d;
   private String e = "survival";
   private boolean f = true;
   private boolean g = false;
   private boolean h;
   private boolean j;
   private ct k;
   private ct s;
   private ct t;
   private ct u;
   private String v;
   private String w;
   private String x;
   private String y;

   public xh(xe var1) {
      this.a = var1;
      this.x = "";
      this.y = hj.a("selectWorld.newWorld");
   }

   public void s_() {
      this.b.b();
      this.c.b();
   }

   public void a() {
      qp var1 = qp.a();
      Keyboard.enableRepeatEvents(true);
      this.o.clear();
      this.o.add(new ct(0, this.m / 2 - 155, this.n - 28, 150, 20, var1.a("selectWorld.create")));
      this.o.add(new ct(1, this.m / 2 + 5, this.n - 28, 150, 20, var1.a("gui.cancel")));
      this.o.add(this.k = new ct(2, this.m / 2 - 75, 100, 150, 20, var1.a("selectWorld.gameMode")));
      this.o.add(this.s = new ct(3, this.m / 2 - 75, 172, 150, 20, var1.a("selectWorld.moreWorldOptions")));
      this.o.add(this.t = new ct(4, this.m / 2 - 155, 100, 150, 20, var1.a("selectWorld.mapFeatures")));
      this.t.h = false;
      this.o.add(this.u = new ct(5, this.m / 2 + 5, 100, 150, 20, var1.a("selectWorld.mapType")));
      this.u.h = false;
      this.u.g = false;
      this.b = new dv(this, this.q, this.m / 2 - 100, 60, 200, 20, this.y);
      this.b.a = true;
      this.b.a(32);
      this.c = new dv(this, this.q, this.m / 2 - 100, 60, 200, 20, this.x);
      this.e();
      this.l();
   }

   private void e() {
      this.d = this.b.a().trim();

      for(char var4 : age.b) {
         this.d = this.d.replace(var4, '_');
      }

      if (me.a(this.d)) {
         this.d = "World";
      }

      this.d = a(this.l.c(), this.d);
   }

   private void l() {
      qp var1 = qp.a();
      this.k.e = var1.a("selectWorld.gameMode") + " " + var1.a("selectWorld.gameMode." + this.e);
      this.v = var1.a("selectWorld.gameMode." + this.e + ".line1");
      this.w = var1.a("selectWorld.gameMode." + this.e + ".line2");
      this.t.e = var1.a("selectWorld.mapFeatures") + " ";
      if (this.f) {
         StringBuilder var10000 = new StringBuilder();
         ct var10002 = this.t;
         var10002.e = var10000.append(var10002.e).append(var1.a("options.on")).toString();
      } else {
         StringBuilder var2 = new StringBuilder();
         ct var3 = this.t;
         var3.e = var2.append(var3.e).append(var1.a("options.off")).toString();
      }

      this.u.e = var1.a("selectWorld.mapType") + " " + var1.a("selectWorld.mapType.normal");
   }

   public static String a(tq var0, String var1) {
      while(var0.a(var1) != null) {
         var1 = var1 + "-";
      }

      return var1;
   }

   public void d() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f == 1) {
            this.l.a(this.a);
         } else if (var1.f == 0) {
            this.l.a((xe)null);
            if (this.h) {
               return;
            }

            this.h = true;
            long var2 = (new net.minecraft.client.web.JRandom()).nextLong();
            String var4 = this.c.a();
            if (!me.a(var4)) {
               try {
                  long var5 = Long.parseLong(var4);
                  if (var5 != 0L) {
                     var2 = var5;
                  }
               } catch (NumberFormatException var7) {
                  var2 = (long)var4.hashCode();
               }
            }

            byte var10 = 0;
            if (this.e.equals("creative")) {
               var10 = 1;
               this.l.c = new uq(this.l);
            } else {
               this.l.c = new dm(this.l);
            }

            this.l.a(this.d, this.b.a(), new yw(var2, var10, this.f, this.g));
            this.l.a((xe)null);
         } else if (var1.f == 3) {
            this.j = !this.j;
            this.k.h = !this.j;
            this.t.h = this.j;
            this.u.h = this.j;
            if (this.j) {
               qp var8 = qp.a();
               this.s.e = var8.a("gui.done");
            } else {
               qp var9 = qp.a();
               this.s.e = var9.a("selectWorld.moreWorldOptions");
            }
         } else if (var1.f == 2) {
            if (this.e.equals("survival")) {
               this.g = false;
               this.e = "hardcore";
               this.g = true;
               this.l();
            } else if (this.e.equals("hardcore")) {
               this.g = false;
               this.e = "creative";
               this.l();
               this.g = false;
            } else {
               this.e = "survival";
               this.l();
               this.g = false;
            }

            this.l();
         } else if (var1.f == 4) {
            this.f = !this.f;
            this.l();
         }

      }
   }

   protected void a(char var1, int var2) {
      if (this.b.a && !this.j) {
         this.b.a(var1, var2);
         this.y = this.b.a();
      } else if (this.c.a && this.j) {
         this.c.a(var1, var2);
         this.x = this.c.a();
      }

      if (var1 == '\r') {
         this.a((ct)this.o.get(0));
      }

      ((ct)this.o.get(0)).g = this.b.a().length() > 0;
      this.e();
   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (!this.j) {
         this.b.a(var1, var2, var3);
      } else {
         this.c.a(var1, var2, var3);
      }

   }

   public void a(int var1, int var2, float var3) {
      qp var4 = qp.a();
      this.j();
      this.a(this.q, var4.a("selectWorld.create"), this.m / 2, 20, 16777215);
      if (!this.j) {
         this.b(this.q, var4.a("selectWorld.enterName"), this.m / 2 - 100, 47, 10526880);
         this.b(this.q, var4.a("selectWorld.resultFolder") + " " + this.d, this.m / 2 - 100, 85, 10526880);
         this.b.c();
         this.b(this.q, this.v, this.m / 2 - 100, 122, 10526880);
         this.b(this.q, this.w, this.m / 2 - 100, 134, 10526880);
      } else {
         this.b(this.q, var4.a("selectWorld.enterSeed"), this.m / 2 - 100, 47, 10526880);
         this.b(this.q, var4.a("selectWorld.seedInfo"), this.m / 2 - 100, 85, 10526880);
         this.b(this.q, var4.a("selectWorld.mapFeatures.info"), this.m / 2 - 150, 122, 10526880);
         this.c.c();
      }

      super.a(var1, var2, var3);
   }

   public void k() {
      if (this.b.a) {
         this.b.a(false);
         this.c.a(true);
      } else {
         this.b.a(true);
         this.c.a(false);
      }

   }
}
