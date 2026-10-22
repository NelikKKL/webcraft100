package net.minecraft.client;

public final class afx implements Comparable {
   public double a;
   public double b;
   public String c;

   public afx(String var1, double var2, double var4) {
      this.c = var1;
      this.a = var2;
      this.b = var4;
   }

   public int a(afx var1) {
      if (var1.a < this.a) {
         return -1;
      } else {
         return var1.a > this.a ? 1 : var1.c.compareTo(this.c);
      }
   }

   public int a() {
      return (this.c.hashCode() & 11184810) + 4473924;
   }

   // PATCH(bridge): bridge-метод, потерянный декомпилятором
   public int compareTo(Object v0) { return this.a((afx)v0); }
}
