package net.minecraft.client;

import java.util.LinkedList;
import java.util.List;

public final class he extends xc {
   final gz a;
   final List b;

   static xc a(gz var0) {
      return new he(var0, new LinkedList());
   }

   static xc a(he var0, dx var1) {
      LinkedList var2 = new LinkedList(var0.b);
      var2.add(var1);
      return new he(var0.a, var2);
   }

   static xc b(he var0, dx var1) {
      LinkedList var2 = new LinkedList();
      var2.add(var1);
      return new he(var0.a, var2);
   }

   private he(gz var1, List var2) {
      super("Failed to match any JSON node at [" + a(var2) + "]");
      this.a = var1;
      this.b = var2;
   }

   static String a(List var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = var0.size() - 1; var2 >= 0; --var2) {
         var1.append(((dx)var0.get(var2)).a());
         if (var2 != 0) {
            var1.append(".");
         }
      }

      return var1.toString();
   }

   public String toString() {
      return "JsonNodeDoesNotMatchJsonNodeSelectorException{failedNode=" + this.a + ", failPath=" + this.b + '}';
   }
}
