package net.minecraft.client;

public class adv implements de {
   private String a;
   private de b;
   private de c;

   public adv(String var1, de var2, de var3) {
      this.a = var1;
      if (var2 == null) {
         var2 = var3;
      }

      if (var3 == null) {
         var3 = var2;
      }

      this.b = var2;
      this.c = var3;
   }

   public int c() {
      return this.b.c() + this.c.c();
   }

   public String d() {
      return this.a;
   }

   public dk d(int var1) {
      return var1 >= this.b.c() ? this.c.d(var1 - this.b.c()) : this.b.d(var1);
   }

   public dk a(int var1, int var2) {
      return var1 >= this.b.c() ? this.c.a(var1 - this.b.c(), var2) : this.b.a(var1, var2);
   }

   public void a(int var1, dk var2) {
      if (var1 >= this.b.c()) {
         this.c.a(var1 - this.b.c(), var2);
      } else {
         this.b.a(var1, var2);
      }

   }

   public int e() {
      return this.b.e();
   }

   public void h() {
      this.b.h();
      this.c.h();
   }

   public boolean b_(vi var1) {
      return this.b.b_(var1) && this.c.b_(var1);
   }

   public void j() {
      this.b.j();
      this.c.j();
   }

   public void k() {
      this.b.k();
      this.c.k();
   }
}
