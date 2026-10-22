package net.minecraft.client;

import java.util.Collection;
import java.util.Random;

public class nc {
   public static int a(Collection var0) {
      int var1 = 0;

      for(abt var3 : (Iterable<abt>)(Iterable)(var0)) {
         var1 += var3.d;
      }

      return var1;
   }

   public static abt a(Random var0, Collection var1, int var2) {
      if (var2 <= 0) {
         throw new IllegalArgumentException();
      } else {
         int var3 = var0.nextInt(var2);

         for(abt var5 : (Iterable<abt>)(Iterable)(var1)) {
            var3 -= var5.d;
            if (var3 < 0) {
               return var5;
            }
         }

         return null;
      }
   }

   public static abt a(Random var0, Collection var1) {
      return a(var0, var1, a(var1));
   }

   public static int a(abt[] var0) {
      int var1 = 0;

      for(abt var5 : var0) {
         var1 += var5.d;
      }

      return var1;
   }

   public static abt a(Random var0, abt[] var1, int var2) {
      if (var2 <= 0) {
         throw new IllegalArgumentException();
      } else {
         int var3 = var0.nextInt(var2);

         for(abt var7 : var1) {
            var3 -= var7.d;
            if (var3 < 0) {
               return var7;
            }
         }

         return null;
      }
   }

   public static abt a(Random var0, abt[] var1) {
      return a(var0, var1, a(var1));
   }
}
