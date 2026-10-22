package net.minecraft.client;

public class aam extends xe {
   private String a;
   private String b;

   public aam(String var1, String var2, Object... var3) {
      qp var4 = qp.a();
      this.a = var4.a(var1);
      if (var3 != null) {
         this.b = var4.a(var2, var3);
      } else {
         this.b = var4.a(var2);
      }

   }

   public void s_() {
   }

   protected void a(char var1, int var2) {
   }

   public void a() {
      qp var1 = qp.a();
      this.o.clear();
      this.o.add(new ct(0, this.m / 2 - 100, this.n / 4 + 120 + 12, var1.a("gui.toMenu")));
   }

   protected void a(ct var1) {
      if (var1.f == 0) {
         this.l.a((xe)(new eh()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.j();
      this.a(this.q, this.a, this.m / 2, this.n / 2 - 50, 16777215);
      this.a(this.q, this.b, this.m / 2, this.n / 2 - 10, 16777215);
      super.a(var1, var2, var3);
   }
}
