package net.minecraft.client;

public class acm {
   public final int a;
   public final int b;

   public acm(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public static long a(int var0, int var1) {
      long var2 = (long)var0;
      long var4 = (long)var1;
      return var2 & 4294967295L | (var4 & 4294967295L) << 32;
   }

   public int hashCode() {
      long var1 = a(this.a, this.b);
      int var3 = (int)var1;
      int var4 = (int)(var1 >> 32);
      return var3 ^ var4;
   }

   public boolean equals(Object var1) {
      acm var2 = (acm)var1;
      return var2.a == this.a && var2.b == this.b;
   }

   public int a() {
      return (this.a << 4) + 8;
   }

   public int b() {
      return (this.b << 4) + 8;
   }

   public am a(int var1) {
      return new am(this.a(), var1, this.b());
   }

   public String toString() {
      return "[" + this.a + ", " + this.b + "]";
   }
}
