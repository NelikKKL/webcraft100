package net.minecraft.client;

import java.util.List;

class da extends yz {
   // $FF: synthetic field
   final int a;

   da(int var1) {
      this.a = var1;
   }

   public boolean a(List var1) {
      return var1.size() > this.a;
   }

   public String a() {
      return Integer.toString(this.a);
   }

   public an b(List var1) {
      return (an)var1.get(this.a);
   }

   public String toString() {
      return "an element at index [" + this.a + "]";
   }











   // PATCH(bridge): в декомпиляте имена a/b перепутаны относительно gz/yz — связываем вручную
   public boolean b(Object v) { return this.a((List)v); }
   protected Object a(Object v) { return this.b((List)v); }
}
