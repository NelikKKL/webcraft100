package net.minecraft.client;

public class og extends uw {
   public og(int var1) {
      super(var1);
      this.i(0);
      this.a(true);
   }

   public int b(int var1) {
      return var1 | 4;
   }

   public int a(int var1) {
      return yy.K.a(0, var1);
   }

   public int c(int var1) {
      if ((var1 & 1) == 1) {
         return db.a();
      } else {
         return (var1 & 2) == 2 ? db.b() : db.c();
      }
   }
}
