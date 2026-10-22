package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class j extends xe {
   public void a() {
      this.o.clear();
      if (this.l.f.z().s()) {
         this.o.add(new ct(1, this.m / 2 - 100, this.n / 4 + 96, hj.a("deathScreen.deleteWorld")));
      } else {
         this.o.add(new ct(1, this.m / 2 - 100, this.n / 4 + 72, hj.a("deathScreen.respawn")));
         this.o.add(new ct(2, this.m / 2 - 100, this.n / 4 + 96, hj.a("deathScreen.titleScreen")));
         if (this.l.k == null) {
            ((ct)this.o.get(1)).g = false;
         }
      }

   }

   protected void a(char var1, int var2) {
   }

   protected void a(ct var1) {
      if (var1.f == 0) {
      }

      if (var1.f == 1) {
         if (this.l.f.z().s()) {
            ry var2 = this.l.f;
            this.l.b("Deleting world");
            tq var3 = this.l.c();
            var3.c();
            var3.b(var2.y().d());
            this.l.a((xe)(new eh()));
         } else {
            this.l.h.n_();
            this.l.a((xe)null);
         }
      }

      if (var1.f == 2) {
         this.l.a((ry)null);
         this.l.a((xe)(new eh()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.a(0, 0, this.m, this.n, 1615855616, -1602211792);
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      if (this.l.f.z().s()) {
         this.a(this.q, hj.a("deathScreen.title.hardcore"), this.m / 2 / 2, 30, 16777215);
      } else {
         this.a(this.q, hj.a("deathScreen.title"), this.m / 2 / 2, 30, 16777215);
      }

      GL11.glPopMatrix();
      if (this.l.f.z().s()) {
         this.a(this.q, hj.a("deathScreen.hardcoreInfo"), this.m / 2, 144, 16777215);
      }

      this.a(this.q, hj.a("deathScreen.score") + ": §e" + this.l.h.aE(), this.m / 2, 100, 16777215);
      super.a(var1, var2, var3);
   }

   public boolean b() {
      return false;
   }
}
