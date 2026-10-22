package net.minecraft.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class g extends wz {
   private final Map a;

   g(Map var1) {
      this.a = new HashMap(var1);
   }

   public Map a() {
      return new HashMap(this.a);
   }

   public pp b() {
      return pp.a;
   }

   public String c() {
      throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
   }

   public List d() {
      throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         g var2 = (g)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public String toString() {
      return "JsonObject fields:[" + this.a + "]";
   }
}
