package net.minecraft.client;

public class ahn implements Comparable {
   private static long f = 0L;
   public int a;
   public int b;
   public int c;
   public int d;
   public long e;
   private long g;

   public ahn(int var1, int var2, int var3, int var4) {
      this.g = (long)(f++);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ahn)) {
         return false;
      } else {
         ahn var2 = (ahn)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c && this.d == var2.d;
      }
   }

   public int hashCode() {
      return (this.a * 1024 * 1024 + this.c * 1024 + this.b) * 256 + this.d;
   }

   public ahn a(long var1) {
      this.e = var1;
      return this;
   }

   public int a(ahn var1) {
      if (this.e < var1.e) {
         return -1;
      } else if (this.e > var1.e) {
         return 1;
      } else if (this.g < var1.g) {
         return -1;
      } else {
         return this.g > var1.g ? 1 : 0;
      }
   }

   // PATCH(bridge): bridge-метод, потерянный декомпилятором
   public int compareTo(Object v0) { return this.a((ahn)v0); }
}
