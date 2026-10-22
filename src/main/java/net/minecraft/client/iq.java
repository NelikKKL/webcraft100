package net.minecraft.client;

import org.lwjgl.input.Keyboard;

public class iq extends xe {
   private xe a;
   private dv b;
   private dv c;
   private lo d;

   public iq(xe var1, lo var2) {
      this.a = var1;
      this.d = var2;
   }

   public void s_() {
      this.c.b();
      this.b.b();
   }

   public void a() {
      qp var1 = qp.a();
      Keyboard.enableRepeatEvents(true);
      this.o.clear();
      this.o.add(new ct(0, this.m / 2 - 100, this.n / 4 + 96 + 12, var1.a("addServer.add")));
      this.o.add(new ct(1, this.m / 2 - 100, this.n / 4 + 120 + 12, var1.a("gui.cancel")));
      this.c = new dv(this, this.q, this.m / 2 - 100, 76, 200, 20, this.d.a);
      this.c.a = true;
      this.c.a(32);
      this.b = new dv(this, this.q, this.m / 2 - 100, 116, 200, 20, this.d.b);
      this.b.a(128);
      ((ct)this.o.get(0)).g = this.b.a().length() > 0 && this.c.a().length() > 0;
   }

   public void d() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f == 1) {
            this.a.a(false, 0);
         } else if (var1.f == 0) {
            this.d.a = this.c.a();
            this.d.b = this.b.a();
            this.a.a(true, 0);
         }

      }
   }

   protected void a(char var1, int var2) {
      this.c.a(var1, var2);
      this.b.a(var1, var2);
      if (var1 == '\t') {
         if (this.c.a) {
            this.c.a = false;
            this.b.a = true;
         } else {
            this.c.a = true;
            this.b.a = false;
         }
      }

      if (var1 == '\r') {
         this.a((ct)this.o.get(0));
      }

      ((ct)this.o.get(0)).g = this.b.a().length() > 0 && this.c.a().length() > 0;
      if (((ct)this.o.get(0)).g) {
         String var3 = this.b.a().trim();
         String[] var4 = var3.split(":");
         if (var4.length > 2) {
            ((ct)this.o.get(0)).g = false;
         }
      }

   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.b.a(var1, var2, var3);
      this.c.a(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      qp var4 = qp.a();
      this.j();
      this.a(this.q, var4.a("addServer.title"), this.m / 2, this.n / 4 - 60 + 20, 16777215);
      this.b(this.q, var4.a("addServer.enterName"), this.m / 2 - 100, 63, 10526880);
      this.b(this.q, var4.a("addServer.enterIp"), this.m / 2 - 100, 104, 10526880);
      this.c.c();
      this.b.c();
      super.a(var1, var2, var3);
   }
}
