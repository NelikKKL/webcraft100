package net.minecraft.client;

public class ov extends xe {
   private int a = 0;

   public void s_() {
      ++this.a;
   }

   public void a() {
   }

   protected void a(ct var1) {
   }

   protected void a(char var1, int var2) {
   }

   public void a(int var1, int var2, float var3) {
      this.j();
      this.a(this.q, "Out of memory!", this.m / 2, this.n / 4 - 60 + 20, 16777215);
      this.b(this.q, "Minecraft has run out of memory.", this.m / 2 - 140, this.n / 4 - 60 + 60 + 0, 10526880);
      this.b(this.q, "This could be caused by a bug in the game or by the", this.m / 2 - 140, this.n / 4 - 60 + 60 + 18, 10526880);
      this.b(this.q, "Java Virtual Machine not being allocated enough", this.m / 2 - 140, this.n / 4 - 60 + 60 + 27, 10526880);
      this.b(this.q, "memory. If you are playing in a web browser, try", this.m / 2 - 140, this.n / 4 - 60 + 60 + 36, 10526880);
      this.b(this.q, "downloading the game and playing it offline.", this.m / 2 - 140, this.n / 4 - 60 + 60 + 45, 10526880);
      this.b(this.q, "To prevent level corruption, the current game has quit.", this.m / 2 - 140, this.n / 4 - 60 + 60 + 63, 10526880);
      this.b(this.q, "Please restart the game.", this.m / 2 - 140, this.n / 4 - 60 + 60 + 81, 10526880);
      super.a(var1, var2, var3);
   }
}
