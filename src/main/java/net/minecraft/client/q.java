package net.minecraft.client;

public enum q {
   a,
   b,
   c,
   d,
   e,
   f,
   g,
   h;

   public boolean a(acy var1) {
      if (this == a) {
         return true;
      } else if (var1 instanceof agi) {
         if (this == b) {
            return true;
         } else {
            agi var2 = (agi)var1;
            if (var2.a == 0) {
               return this == f;
            } else if (var2.a == 2) {
               return this == d;
            } else if (var2.a == 1) {
               return this == e;
            } else if (var2.a == 3) {
               return this == c;
            } else {
               return false;
            }
         }
      } else if (var1 instanceof zp) {
         return this == g;
      } else if (var1 instanceof ads) {
         return this == h;
      } else {
         return false;
      }
   }
}
