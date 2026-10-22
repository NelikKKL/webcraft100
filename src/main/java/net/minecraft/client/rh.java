package net.minecraft.client;

import java.util.List;
import java.util.Random;

abstract class rh extends nk {
   protected rh(int var1) {
      super(var1);
   }

   private int a(List var1) {
      boolean var2 = false;
      int var3 = 0;

      for(aaz var5 : (Iterable<aaz>)(Iterable)(var1)) {
         if (var5.d > 0 && var5.c < var5.d) {
            var2 = true;
         }

         var3 += var5.b;
      }

      return var2 ? var3 : -1;
   }

   private rh a(gc var1, List var2, List var3, Random var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = this.a(var2);
      boolean var11 = var10 > 0 && var9 <= 30;
      int var12 = 0;

      while(var12 < 5 && var11) {
         ++var12;
         int var13 = var4.nextInt(var10);

         for(aaz var15 : (Iterable<aaz>)(Iterable)(var2)) {
            var13 -= var15.b;
            if (var13 < 0) {
               if (!var15.a(var9) || var15 == var1.a && !var15.e) {
                  break;
               }

               rh var16 = rp.a(var15, var3, var4, var5, var6, var7, var8, var9);
               if (var16 != null) {
                  ++var15.c;
                  var1.a = var15;
                  if (!var15.a()) {
                     var2.remove(var15);
                  }

                  return var16;
               }
            }
         }
      }

      ld var17 = ld.a(var3, var4, var5, var6, var7, var8, var9);
      return var17;
   }

   private nk a(gc var1, List var2, Random var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (Math.abs(var4 - var1.a().a) <= 112 && Math.abs(var6 - var1.a().c) <= 112) {
         List var12 = var1.b;
         if (var9) {
            var12 = var1.c;
         }

         rh var11 = this.a(var1, var12, var2, var3, var4, var5, var6, var7, var8 + 1);
         if (var11 != null) {
            var2.add(var11);
            var1.d.add(var11);
         }

         return var11;
      } else {
         ld var10 = ld.a(var2, var3, var4, var5, var6, var7, var8);
         return var10;
      }
   }

   protected nk a(gc var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch (this.f) {
         case 0:
            return this.a(var1, var2, var3, this.e.a + var4, this.e.b + var5, this.e.f + 1, this.f, this.b(), var6);
         case 1:
            return this.a(var1, var2, var3, this.e.a - 1, this.e.b + var5, this.e.c + var4, this.f, this.b(), var6);
         case 2:
            return this.a(var1, var2, var3, this.e.a + var4, this.e.b + var5, this.e.c - 1, this.f, this.b(), var6);
         case 3:
            return this.a(var1, var2, var3, this.e.d + 1, this.e.b + var5, this.e.c + var4, this.f, this.b(), var6);
         default:
            return null;
      }
   }

   protected nk b(gc var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch (this.f) {
         case 0:
            return this.a(var1, var2, var3, this.e.a - 1, this.e.b + var4, this.e.c + var5, 1, this.b(), var6);
         case 1:
            return this.a(var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.c - 1, 2, this.b(), var6);
         case 2:
            return this.a(var1, var2, var3, this.e.a - 1, this.e.b + var4, this.e.c + var5, 1, this.b(), var6);
         case 3:
            return this.a(var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.c - 1, 2, this.b(), var6);
         default:
            return null;
      }
   }

   protected nk c(gc var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch (this.f) {
         case 0:
            return this.a(var1, var2, var3, this.e.d + 1, this.e.b + var4, this.e.c + var5, 3, this.b(), var6);
         case 1:
            return this.a(var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.f + 1, 0, this.b(), var6);
         case 2:
            return this.a(var1, var2, var3, this.e.d + 1, this.e.b + var4, this.e.c + var5, 3, this.b(), var6);
         case 3:
            return this.a(var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.f + 1, 0, this.b(), var6);
         default:
            return null;
      }
   }

   protected static boolean a(nl var0) {
      return var0 != null && var0.b > 10;
   }
}
