package net.minecraft.client;

import java.util.List;
import java.util.Map;

public final class oj extends an implements Comparable {
   private final String a;

   oj(String var1) {
      if (var1 == null) {
         throw new NullPointerException("Attempt to construct a JsonString with a null value.");
      } else {
         this.a = var1;
      }
   }

   public pp b() {
      return pp.c;
   }

   public String c() {
      return this.a;
   }

   public Map a() {
      throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
   }

   public List d() {
      throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         oj var2 = (oj)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public String toString() {
      return "JsonStringNode value:[" + this.a + "]";
   }

   public int a(oj var1) {
      return this.a.compareTo(var1.a);
   }

   // PATCH(bridge): bridge-метод, потерянный декомпилятором
   public int compareTo(Object v0) { return this.a((oj)v0); }
}
