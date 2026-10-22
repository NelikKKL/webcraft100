package net.minecraft.client;

import java.util.Stack;

final class es implements yc {
   private final Stack a = new Stack();
   private rv b;

   wz a() {
      return (wz)this.b.b();
   }

   public void b() {
   }

   public void c() {
   }

   public void d() {
      ft var1 = tz.e();
      this.a((rv)var1);
      this.a.push(new tl(this, var1));
   }

   public void e() {
      this.a.pop();
   }

   public void f() {
      abq var1 = tz.d();
      this.a((rv)var1);
      this.a.push(new lc(this, var1));
   }

   public void g() {
      this.a.pop();
   }

   public void a(String var1) {
      aax var2 = aax.a().a(tz.b(var1));
      ((ye)this.a.peek()).a(var2);
      this.a.push(new co(this, var2));
   }

   public void h() {
      this.a.pop();
   }

   public void b(String var1) {
      this.b(tz.a(var1));
   }

   public void i() {
      this.b(tz.b());
   }

   public void c(String var1) {
      this.b((rv)tz.b(var1));
   }

   public void j() {
      this.b(tz.c());
   }

   public void k() {
      this.b(tz.a());
   }

   private void a(rv var1) {
      if (this.b == null) {
         this.b = var1;
      } else {
         this.b(var1);
      }

   }

   private void b(rv var1) {
      ((ye)this.a.peek()).a(var1);
   }
}
