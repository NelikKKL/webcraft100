package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class kx extends wz {
   private final List a;

   kx(Iterable var1) {
      this.a = a(var1);
   }

   public pp b() {
      return pp.b;
   }

   public List d() {
      return new ArrayList(this.a);
   }

   public String c() {
      throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
   }

   public Map a() {
      throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         kx var2 = (kx)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public String toString() {
      return "JsonArray elements:[" + this.a + "]";
   }

   private static List a(Iterable var0) {
      return new abn(var0);
   }
}
