package net.minecraft.client;

public class mo {
   public final int a;
   public final int b;
   public final int c;
   private final int j;
   int d = -1;
   float e;
   float f;
   float g;
   mo h;
   public boolean i = false;

   public mo(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.j = a(var1, var2, var3);
   }

   public static int a(int var0, int var1, int var2) {
      return var1 & 255 | (var0 & 32767) << 8 | (var2 & 32767) << 24 | (var0 < 0 ? Integer.MIN_VALUE : 0) | (var2 < 0 ? '耀' : 0);
   }

   public float a(mo var1) {
      float var2 = (float)(var1.a - this.a);
      float var3 = (float)(var1.b - this.b);
      float var4 = (float)(var1.c - this.c);
      return me.c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof mo)) {
         return false;
      } else {
         mo var2 = (mo)var1;
         return this.j == var2.j && this.a == var2.a && this.b == var2.b && this.c == var2.c;
      }
   }

   public int hashCode() {
      return this.j;
   }

   public boolean a() {
      return this.d >= 0;
   }

   public String toString() {
      return this.a + ", " + this.b + ", " + this.c;
   }
}
