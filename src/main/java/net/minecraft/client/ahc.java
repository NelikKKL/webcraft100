package net.minecraft.client;

class ahc {
   final long a;
   Object b;
   ahc c;
   final int d;

   ahc(int var1, long var2, Object var4, ahc var5) {
      this.b = var4;
      this.c = var5;
      this.a = var2;
      this.d = var1;
   }

   public final long a() {
      return this.a;
   }

   public final Object b() {
      return this.b;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof ahc)) {
         return false;
      } else {
         ahc var2 = (ahc)var1;
         Long var3 = this.a();
         Long var4 = var2.a();
         if (var3 == var4 || var3 != null && var3.equals(var4)) {
            Object var5 = this.b();
            Object var6 = var2.b();
            if (var5 == var6 || var5 != null && var5.equals(var6)) {
               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      return wv.f(this.a);
   }

   public final String toString() {
      return this.a() + "=" + this.b();
   }
}
