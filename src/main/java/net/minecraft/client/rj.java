package net.minecraft.client;

import org.lwjgl.input.Keyboard;

public class rj extends gx {
   public void a() {
      Keyboard.enableRepeatEvents(true);
      qp var1 = qp.a();
      this.o.add(new ct(1, this.m / 2 - 100, this.n - 40, var1.a("multiplayer.stopSleeping")));
   }

   public void d() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(char var1, int var2) {
      if (var2 == 1) {
         this.e();
      } else if (var2 == 28) {
         String var3 = this.a.trim();
         if (var3.length() > 0) {
            this.l.h.a(this.a.trim());
         }

         this.a = "";
      } else {
         super.a(var1, var2);
      }

   }

   public void a(int var1, int var2, float var3) {
      super.a(var1, var2, var3);
   }

   protected void a(ct var1) {
      if (var1.f == 1) {
         this.e();
      } else {
         super.a(var1);
      }

   }

   private void e() {
      if (this.l.h instanceof cx) {
         abp var1 = ((cx)this.l.h).a;
         var1.c(new ag(this.l.h, 3));
      }

   }
}
