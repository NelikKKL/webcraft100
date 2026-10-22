package net.minecraft.client;

final class aek {
   private final String a;

   aek(String var1) {
      this.a = var1.replace("\\", "\\\\").replace("\"", "\\\"").replace("\b", "\\b").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
   }

   public String toString() {
      return this.a;
   }
}
