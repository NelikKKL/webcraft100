package net.minecraft.client;

class ji extends yz {
   public boolean a(an var1) {
      return pp.c == var1.b();
   }

   public String a() {
      return "A short form string";
   }

   public String b(an var1) {
      return var1.c();
   }

   public String toString() {
      return "a value that is a string";
   }











   // PATCH(bridge): в декомпиляте имена a/b перепутаны относительно gz/yz — связываем вручную
   public boolean b(Object v) { return this.a((an)v); }
   protected Object a(Object v) { return this.b((an)v); }
}
