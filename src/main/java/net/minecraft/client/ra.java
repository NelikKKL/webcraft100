package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class ra extends nk {
   public ra(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public static nl a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      nl var6 = new nl(var2, var3 - 5, var4, var2, var3 + 2, var4);
      switch (var5) {
         case 0:
            var6.d = var2 + 2;
            var6.f = var4 + 8;
            break;
         case 1:
            var6.a = var2 - 8;
            var6.f = var4 + 2;
            break;
         case 2:
            var6.d = var2 + 2;
            var6.c = var4 - 8;
            break;
         case 3:
            var6.d = var2 + 8;
            var6.f = var4 + 2;
      }

      return nk.a(var0, var6) != null ? null : var6;
   }

   public void a(nk var1, List var2, Random var3) {
      int var4 = this.b();
      switch (this.f) {
         case 0:
            aez.a(var1, var2, var3, this.e.a, this.e.b, this.e.f + 1, 0, var4);
            break;
         case 1:
            aez.a(var1, var2, var3, this.e.a - 1, this.e.b, this.e.c, 1, var4);
            break;
         case 2:
            aez.a(var1, var2, var3, this.e.a, this.e.b, this.e.c - 1, 2, var4);
            break;
         case 3:
            aez.a(var1, var2, var3, this.e.d + 1, this.e.b, this.e.c, 3, var4);
      }

   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 5, 0, 2, 7, 1, 0, 0, false);
         this.a(var1, var3, 0, 0, 7, 2, 2, 8, 0, 0, false);

         for(int var4 = 0; var4 < 5; ++var4) {
            this.a(var1, var3, 0, 5 - var4 - (var4 < 4 ? 1 : 0), 2 + var4, 2, 7 - var4, 2 + var4, 0, 0, false);
         }

         return true;
      }
   }
}
