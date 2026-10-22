package net.minecraft.client;

import java.util.List;
import java.util.Random;

abstract class xf extends nk {
   private int a;

   protected xf(int var1) {
      super(var1);
   }

   protected nk a(yp var1, List var2, Random var3, int var4, int var5) {
      switch (this.f) {
         case 0:
            return xy.a((yp)var1, var2, var3, this.e.a - 1, this.e.b + var4, this.e.c + var5, 1, this.b());
         case 1:
            return xy.a((yp)var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.c - 1, 2, this.b());
         case 2:
            return xy.a((yp)var1, var2, var3, this.e.a - 1, this.e.b + var4, this.e.c + var5, 1, this.b());
         case 3:
            return xy.a((yp)var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.c - 1, 2, this.b());
         default:
            return null;
      }
   }

   protected nk b(yp var1, List var2, Random var3, int var4, int var5) {
      switch (this.f) {
         case 0:
            return xy.a((yp)var1, var2, var3, this.e.d + 1, this.e.b + var4, this.e.c + var5, 3, this.b());
         case 1:
            return xy.a((yp)var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.f + 1, 0, this.b());
         case 2:
            return xy.a((yp)var1, var2, var3, this.e.d + 1, this.e.b + var4, this.e.c + var5, 3, this.b());
         case 3:
            return xy.a((yp)var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.f + 1, 0, this.b());
         default:
            return null;
      }
   }

   protected int b(ry var1, nl var2) {
      int var3 = 0;
      int var4 = 0;

      for(int var5 = this.e.c; var5 <= this.e.f; ++var5) {
         for(int var6 = this.e.a; var6 <= this.e.d; ++var6) {
            if (var2.b(var6, 64, var5)) {
               var3 += Math.max(var1.f(var6, var5), var1.e);
               ++var4;
            }
         }
      }

      if (var4 == 0) {
         return -1;
      } else {
         return var3 / var4;
      }
   }

   protected static boolean a(nl var0) {
      return var0 != null && var0.b > 10;
   }

   protected void a(ry var1, nl var2, int var3, int var4, int var5, int var6) {
      if (this.a < var6) {
         for(int var7 = this.a; var7 < var6; ++var7) {
            int var8 = this.a(var3 + var7, var5);
            int var9 = this.b(var4);
            int var10 = this.b(var3 + var7, var5);
            if (!var2.b(var8, var9, var10)) {
               break;
            }

            ++this.a;
            ai var11 = new ai(var1, this.a(var7));
            var11.c((double)var8 + (double)0.5F, (double)var9, (double)var10 + (double)0.5F, 0.0F, 0.0F);
            var1.a((ia)var11);
         }

      }
   }

   protected int a(int var1) {
      return 0;
   }
}
