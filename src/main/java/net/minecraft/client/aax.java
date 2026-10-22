package net.minecraft.client;

final class aax {
   private rv a;
   private rv b;

   private aax() {
   }

   static aax a() {
      return new aax();
   }

   aax a(rv var1) {
      this.a = var1;
      return this;
   }

   aax b(rv var1) {
      this.b = var1;
      return this;
   }

   oj b() {
      return (oj)this.a.b();
   }

   an c() {
      return this.b.b();
   }
}
