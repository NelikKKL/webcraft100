package net.minecraft.client;

public class dh implements Comparable {
   public int a;
   public int b;
   public int c;

   public dh() {
   }

   public dh(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public dh(dh var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof dh)) {
         return false;
      } else {
         dh var2 = (dh)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c;
      }
   }

   public int hashCode() {
      return this.a + this.c << 8 + this.b << 16;
   }

   public int a(dh var1) {
      if (this.b == var1.b) {
         return this.c == var1.c ? this.a - var1.a : this.c - var1.c;
      } else {
         return this.b - var1.b;
      }
   }

   public double a(int var1, int var2, int var3) {
      int var4 = this.a - var1;
      int var5 = this.b - var2;
      int var6 = this.c - var3;
      return Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6));
   }

   // PATCH(bridge): bridge-метод, потерянный декомпилятором
   public int compareTo(Object v0) { return this.a((dh)v0); }
}
