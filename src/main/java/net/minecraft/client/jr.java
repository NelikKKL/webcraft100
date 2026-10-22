package net.minecraft.client;

import java.util.Map;

class jr extends yz {
   // $FF: synthetic field
   final oj a;

   jr(oj var1) {
      this.a = var1;
   }

   public boolean a(Map var1) {
      return var1.containsKey(this.a);
   }

   public String a() {
      return "\"" + this.a.c() + "\"";
   }

   public an b(Map var1) {
      return (an)var1.get(this.a);
   }

   public String toString() {
      return "a field called [\"" + this.a.c() + "\"]";
   }











   // PATCH(bridge): в декомпиляте имена a/b перепутаны относительно gz/yz — связываем вручную
   public boolean b(Object v) { return this.a((Map)v); }
   protected Object a(Object v) { return this.b((Map)v); }
}
