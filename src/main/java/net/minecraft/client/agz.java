package net.minecraft.client;

import java.util.Map;

class agz extends yz {
   public boolean a(an var1) {
      return pp.a == var1.b();
   }

   public String a() {
      return "A short form object";
   }

   public Map b(an var1) {
      return var1.a();
   }

   public String toString() {
      return "an object";
   }











   // PATCH(bridge): в декомпиляте имена a/b перепутаны относительно gz/yz — связываем вручную
   public boolean b(Object v) { return this.a((an)v); }
   protected Object a(Object v) { return this.b((an)v); }
}
