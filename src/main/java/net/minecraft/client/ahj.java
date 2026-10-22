package net.minecraft.client;

import java.util.List;

class ahj extends yz {
   public boolean a(an var1) {
      return pp.b == var1.b();
   }

   public String a() {
      return "A short form array";
   }

   public List b(an var1) {
      return var1.d();
   }

   public String toString() {
      return "an array";
   }











   // PATCH(bridge): в декомпиляте имена a/b перепутаны относительно gz/yz — связываем вручную
   public boolean b(Object v) { return this.a((an)v); }
   protected Object a(Object v) { return this.b((an)v); }
}
