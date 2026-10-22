package net.minecraft.client;

import org.lwjgl.input.Keyboard;

public class or extends xe {
   private xe a;
   private dv b;
   private final String c;

   public or(xe var1, String var2) {
      this.a = var1;
      this.c = var2;
   }

   public void s_() {
      this.b.b();
   }

   public void a() {
      qp var1 = qp.a();
      Keyboard.enableRepeatEvents(true);
      this.o.clear();
      this.o.add(new ct(0, this.m / 2 - 100, this.n / 4 + 96 + 12, var1.a("selectWorld.renameButton")));
      this.o.add(new ct(1, this.m / 2 - 100, this.n / 4 + 120 + 12, var1.a("gui.cancel")));
      tq var2 = this.l.c();
      si var3 = var2.a(this.c);
      String var4 = var3.j();
      this.b = new dv(this, this.q, this.m / 2 - 100, 60, 200, 20, var4);
      this.b.a = true;
      this.b.a(32);
   }

   public void d() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f == 1) {
            this.l.a(this.a);
         } else if (var1.f == 0) {
            tq var2 = this.l.c();
            var2.a(this.c, this.b.a().trim());
            this.l.a(this.a);
         }

      }
   }

   protected void a(char var1, int var2) {
      this.b.a(var1, var2);
      ((ct)this.o.get(0)).g = this.b.a().trim().length() > 0;
      if (var1 == '\r') {
         this.a((ct)this.o.get(0));
      }

   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.b.a(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      qp var4 = qp.a();
      this.j();
      this.a(this.q, var4.a("selectWorld.renameTitle"), this.m / 2, this.n / 4 - 60 + 20, 16777215);
      this.b(this.q, var4.a("selectWorld.enterName"), this.m / 2 - 100, 47, 10526880);
      this.b.c();
      super.a(var1, var2, var3);
   }
}
