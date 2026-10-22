package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class id extends nk {
   private final int a;
   private final boolean b;

   public id(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.a = var4;
      this.e = var3;
      this.b = var3.c() > 3;
   }

   public static nl a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      nl var6 = new nl(var2, var3, var4, var2, var3 + 2, var4);
      if (var1.nextInt(4) == 0) {
         var6.e += 4;
      }

      switch (var5) {
         case 0:
            var6.a = var2 - 1;
            var6.d = var2 + 3;
            var6.f = var4 + 4;
            break;
         case 1:
            var6.a = var2 - 4;
            var6.c = var4 - 1;
            var6.f = var4 + 3;
            break;
         case 2:
            var6.a = var2 - 1;
            var6.d = var2 + 3;
            var6.c = var4 - 4;
            break;
         case 3:
            var6.d = var2 + 4;
            var6.c = var4 - 1;
            var6.f = var4 + 3;
      }

      return nk.a(var0, var6) != null ? null : var6;
   }

   public void a(nk var1, List var2, Random var3) {
      int var4 = this.b();
      switch (this.a) {
         case 0:
            aez.a(var1, var2, var3, this.e.a + 1, this.e.b, this.e.f + 1, 0, var4);
            aez.a(var1, var2, var3, this.e.a - 1, this.e.b, this.e.c + 1, 1, var4);
            aez.a(var1, var2, var3, this.e.d + 1, this.e.b, this.e.c + 1, 3, var4);
            break;
         case 1:
            aez.a(var1, var2, var3, this.e.a + 1, this.e.b, this.e.c - 1, 2, var4);
            aez.a(var1, var2, var3, this.e.a + 1, this.e.b, this.e.f + 1, 0, var4);
            aez.a(var1, var2, var3, this.e.a - 1, this.e.b, this.e.c + 1, 1, var4);
            break;
         case 2:
            aez.a(var1, var2, var3, this.e.a + 1, this.e.b, this.e.c - 1, 2, var4);
            aez.a(var1, var2, var3, this.e.a - 1, this.e.b, this.e.c + 1, 1, var4);
            aez.a(var1, var2, var3, this.e.d + 1, this.e.b, this.e.c + 1, 3, var4);
            break;
         case 3:
            aez.a(var1, var2, var3, this.e.a + 1, this.e.b, this.e.c - 1, 2, var4);
            aez.a(var1, var2, var3, this.e.a + 1, this.e.b, this.e.f + 1, 0, var4);
            aez.a(var1, var2, var3, this.e.d + 1, this.e.b, this.e.c + 1, 3, var4);
      }

      if (this.b) {
         if (var3.nextBoolean()) {
            aez.a(var1, var2, var3, this.e.a + 1, this.e.b + 3 + 1, this.e.c - 1, 2, var4);
         }

         if (var3.nextBoolean()) {
            aez.a(var1, var2, var3, this.e.a - 1, this.e.b + 3 + 1, this.e.c + 1, 1, var4);
         }

         if (var3.nextBoolean()) {
            aez.a(var1, var2, var3, this.e.d + 1, this.e.b + 3 + 1, this.e.c + 1, 3, var4);
         }

         if (var3.nextBoolean()) {
            aez.a(var1, var2, var3, this.e.a + 1, this.e.b + 3 + 1, this.e.f + 1, 0, var4);
         }
      }

   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         if (this.b) {
            this.a(var1, var3, this.e.a + 1, this.e.b, this.e.c, this.e.d - 1, this.e.b + 3 - 1, this.e.f, 0, 0, false);
            this.a(var1, var3, this.e.a, this.e.b, this.e.c + 1, this.e.d, this.e.b + 3 - 1, this.e.f - 1, 0, 0, false);
            this.a(var1, var3, this.e.a + 1, this.e.e - 2, this.e.c, this.e.d - 1, this.e.e, this.e.f, 0, 0, false);
            this.a(var1, var3, this.e.a, this.e.e - 2, this.e.c + 1, this.e.d, this.e.e, this.e.f - 1, 0, 0, false);
            this.a(var1, var3, this.e.a + 1, this.e.b + 3, this.e.c + 1, this.e.d - 1, this.e.b + 3, this.e.f - 1, 0, 0, false);
         } else {
            this.a(var1, var3, this.e.a + 1, this.e.b, this.e.c, this.e.d - 1, this.e.e, this.e.f, 0, 0, false);
            this.a(var1, var3, this.e.a, this.e.b, this.e.c + 1, this.e.d, this.e.e, this.e.f - 1, 0, 0, false);
         }

         this.a(var1, var3, this.e.a + 1, this.e.b, this.e.c + 1, this.e.a + 1, this.e.e, this.e.c + 1, yy.x.bM, 0, false);
         this.a(var1, var3, this.e.a + 1, this.e.b, this.e.f - 1, this.e.a + 1, this.e.e, this.e.f - 1, yy.x.bM, 0, false);
         this.a(var1, var3, this.e.d - 1, this.e.b, this.e.c + 1, this.e.d - 1, this.e.e, this.e.c + 1, yy.x.bM, 0, false);
         this.a(var1, var3, this.e.d - 1, this.e.b, this.e.f - 1, this.e.d - 1, this.e.e, this.e.f - 1, yy.x.bM, 0, false);
         return true;
      }
   }
}
