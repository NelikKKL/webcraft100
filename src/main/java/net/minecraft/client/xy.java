package net.minecraft.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class xy {
   public static ArrayList a(Random var0, int var1) {
      ArrayList var2 = new ArrayList();
      var2.add(new aan(uy.class, 4, me.a(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new aan(uz.class, 20, me.a(var0, 0 + var1, 1 + var1)));
      var2.add(new aan(gs.class, 20, me.a(var0, 0 + var1, 2 + var1)));
      var2.add(new aan(wi.class, 3, me.a(var0, 2 + var1, 5 + var1 * 3)));
      var2.add(new aan(acz.class, 15, me.a(var0, 0 + var1, 2 + var1)));
      var2.add(new aan(ec.class, 3, me.a(var0, 1 + var1, 4 + var1)));
      var2.add(new aan(agr.class, 3, me.a(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new aan(ko.class, 15, me.a(var0, 0, 1 + var1)));
      var2.add(new aan(tf.class, 8, me.a(var0, 0 + var1, 3 + var1 * 2)));
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         if (((aan)var3.next()).d == 0) {
            var3.remove();
         }
      }

      return var2;
   }

   private static int a(ArrayList var0) {
      boolean var1 = false;
      int var2 = 0;

      for(aan var4 : (Iterable<aan>)(Iterable)(var0)) {
         if (var4.d > 0 && var4.c < var4.d) {
            var1 = true;
         }

         var2 += var4.b;
      }

      return var1 ? var2 : -1;
   }

   private static xf a(aan var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      Class var8 = var0.a;
      Object var9 = null;
      if (var8 == uy.class) {
         var9 = uy.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == uz.class) {
         var9 = uz.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == gs.class) {
         var9 = gs.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == wi.class) {
         var9 = wi.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == acz.class) {
         var9 = acz.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == ec.class) {
         var9 = ec.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == agr.class) {
         var9 = agr.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == ko.class) {
         var9 = ko.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == tf.class) {
         var9 = tf.a(var1, var2, var3, var4, var5, var6, var7);
      }

      return (xf)var9;
   }

   private static xf c(yp var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = a(var0.d);
      if (var8 <= 0) {
         return null;
      } else {
         int var9 = 0;

         while(var9 < 5) {
            ++var9;
            int var10 = var2.nextInt(var8);

            for(aan var12 : (Iterable<aan>)(Iterable)(var0.d)) {
               var10 -= var12.b;
               if (var10 < 0) {
                  if (!var12.a(var7) || var12 == var0.c && var0.d.size() > 1) {
                     break;
                  }

                  xf var13 = a(var12, var1, var2, var3, var4, var5, var6, var7);
                  if (var13 != null) {
                     ++var12.c;
                     var0.c = var12;
                     if (!var12.a()) {
                        var0.d.remove(var12);
                     }

                     return var13;
                  }
               }
            }
         }

         nl var14 = abj.a(var1, var2, var3, var4, var5, var6);
         if (var14 != null) {
            return new abj(var7, var2, var14, var6);
         } else {
            return null;
         }
      }
   }

   private static nk d(yp var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if (var7 > 50) {
         return null;
      } else if (Math.abs(var3 - var0.a().a) <= 112 && Math.abs(var5 - var0.a().c) <= 112) {
         xf var8 = c(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if (var8 != null) {
            int var9 = (var8.e.a + var8.e.d) / 2;
            int var10 = (var8.e.c + var8.e.f) / 2;
            int var11 = var8.e.d - var8.e.a;
            int var12 = var8.e.f - var8.e.c;
            int var13 = var11 > var12 ? var11 : var12;
            if (var0.d().a(var9, var10, var13 / 2 + 4, xn.e)) {
               var1.add(var8);
               var0.h.add(var8);
               return var8;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static nk e(yp var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if (var7 > 3 + var0.b) {
         return null;
      } else if (Math.abs(var3 - var0.a().a) <= 112 && Math.abs(var5 - var0.a().c) <= 112) {
         nl var8 = ahz.a(var0, var1, var2, var3, var4, var5, var6);
         if (var8 != null && var8.b > 10) {
            ahz var9 = new ahz(var7, var2, var8, var6);
            int var10 = (var9.e.a + var9.e.d) / 2;
            int var11 = (var9.e.c + var9.e.f) / 2;
            int var12 = var9.e.d - var9.e.a;
            int var13 = var9.e.f - var9.e.c;
            int var14 = var12 > var13 ? var12 : var13;
            if (var0.d().a(var10, var11, var14 / 2 + 4, xn.e)) {
               var1.add(var9);
               var0.i.add(var9);
               return var9;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static nk a(yp var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return d(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static nk b(yp var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return e(var0, var1, var2, var3, var4, var5, var6, var7);
   }
}
