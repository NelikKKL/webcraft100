package net.minecraft.client;

final class zk implements gz {
   private final dx a;
   private final dx b;

   zk(dx var1, dx var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean b(Object var1) {
      return this.a.a(var1) && this.b.a(this.a.b(var1));
   }

   public Object c(Object var1) {
      Object var2;
      try {
         var2 = this.a.b(var1);
      } catch (he var6) {
         throw he.b(var6, this.a);
      }

      try {
         Object var3 = this.b.b(var2);
         return var3;
      } catch (he var5) {
         throw he.a(var5, this.a);
      }
   }

   public String a() {
      return this.b.a();
   }

   public String toString() {
      return this.a.toString() + ", with " + this.b.toString();
   }
}
