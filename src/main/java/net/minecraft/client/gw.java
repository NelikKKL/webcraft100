package net.minecraft.client;

import java.util.List;
import java.util.Map;

final class gw extends an {
   static final gw a;
   static final gw b;
   static final gw c;
   private final pp d;

   private gw(pp var1) {
      this.d = var1;
   }

   public pp b() {
      return this.d;
   }

   public String c() {
      throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
   }

   public Map a() {
      throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
   }

   public List d() {
      throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
   }

   static {
      a = new gw(pp.g);
      b = new gw(pp.e);
      c = new gw(pp.f);
   }
}
