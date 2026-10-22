package net.minecraft.client;

public class ach extends xe {
   private int a = 0;

   public void s_() {
      ++this.a;
   }

   public void a() {
      this.o.clear();
      this.o.add(new ct(0, this.m / 2 - 100, this.n / 4 + 120 + 12, "Back to title screen"));
   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f == 0) {
            this.l.a((xe)(new eh()));
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.j();
      this.a(this.q, "Level save conflict", this.m / 2, this.n / 4 - 60 + 20, 16777215);
      this.b(this.q, "Minecraft detected a conflict in the level save data.", this.m / 2 - 140, this.n / 4 - 60 + 60 + 0, 10526880);
      this.b(this.q, "This could be caused by two copies of the game", this.m / 2 - 140, this.n / 4 - 60 + 60 + 18, 10526880);
      this.b(this.q, "accessing the same level.", this.m / 2 - 140, this.n / 4 - 60 + 60 + 27, 10526880);
      this.b(this.q, "To prevent level corruption, the current game has quit.", this.m / 2 - 140, this.n / 4 - 60 + 60 + 45, 10526880);
      super.a(var1, var2, var3);
   }
}
