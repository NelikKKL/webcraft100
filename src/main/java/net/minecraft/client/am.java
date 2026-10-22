package net.minecraft.client;

public class am {
   public final int a;
   public final int b;
   public final int c;

   public am(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public am(fb var1) {
      this(me.c(var1.a), me.c(var1.b), me.c(var1.c));
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof am)) {
         return false;
      } else {
         am var2 = (am)var1;
         return var2.a == this.a && var2.b == this.b && var2.c == this.c;
      }
   }

   public int hashCode() {
      return this.a * 8976890 + this.b * 981131 + this.c;
   }
}
