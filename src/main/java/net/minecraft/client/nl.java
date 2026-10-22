package net.minecraft.client;

public class nl {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;

   public nl() {
   }

   public static nl a() {
      return new nl(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   }

   public static nl a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      switch (var9) {
         case 0:
            return new nl(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
         case 1:
            return new nl(var0 - var8 + 1 + var5, var1 + var4, var2 + var3, var0 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         case 2:
            return new nl(var0 + var3, var1 + var4, var2 - var8 + 1 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var5);
         case 3:
            return new nl(var0 + var5, var1 + var4, var2 + var3, var0 + var8 - 1 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         default:
            return new nl(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
      }
   }

   public nl(nl var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
   }

   public nl(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public nl(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = 0;
      this.c = var2;
      this.d = var3;
      this.e = 65536;
      this.f = var4;
   }

   public boolean a(nl var1) {
      return this.d >= var1.a && this.a <= var1.d && this.f >= var1.c && this.c <= var1.f && this.e >= var1.b && this.b <= var1.e;
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      return this.d >= var1 && this.a <= var3 && this.f >= var2 && this.c <= var4;
   }

   public void b(nl var1) {
      this.a = Math.min(this.a, var1.a);
      this.b = Math.min(this.b, var1.b);
      this.c = Math.min(this.c, var1.c);
      this.d = Math.max(this.d, var1.d);
      this.e = Math.max(this.e, var1.e);
      this.f = Math.max(this.f, var1.f);
   }

   public void a(int var1, int var2, int var3) {
      this.a += var1;
      this.b += var2;
      this.c += var3;
      this.d += var1;
      this.e += var2;
      this.f += var3;
   }

   public boolean b(int var1, int var2, int var3) {
      return var1 >= this.a && var1 <= this.d && var3 >= this.c && var3 <= this.f && var2 >= this.b && var2 <= this.e;
   }

   public int b() {
      return this.d - this.a + 1;
   }

   public int c() {
      return this.e - this.b + 1;
   }

   public int d() {
      return this.f - this.c + 1;
   }

   public int e() {
      return this.a + (this.d - this.a + 1) / 2;
   }

   public int f() {
      return this.b + (this.e - this.b + 1) / 2;
   }

   public int g() {
      return this.c + (this.f - this.c + 1) / 2;
   }

   public String toString() {
      return "(" + this.a + ", " + this.b + ", " + this.c + "; " + this.d + ", " + this.e + ", " + this.f + ")";
   }
}
