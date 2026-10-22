package net.minecraft.client;

public class adb extends ads {
   private static yy[] bR;

   public adb(int var1, nu var2) {
      super(var1, 1, var2, bR);
   }

   public boolean a(yy var1) {
      if (var1 == yy.aS) {
         return true;
      } else {
         return var1 == yy.aU;
      }
   }

   static {
      bR = new yy[]{yy.u, yy.v, yy.E, yy.F, yy.aS, yy.aU, yy.aW, yy.aA, yy.bc, yy.by};
   }
}
