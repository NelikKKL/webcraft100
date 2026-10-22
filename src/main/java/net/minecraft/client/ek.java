package net.minecraft.client;

import java.util.Arrays;

public final class ek {
   private ek() {
   }

   public static dx a(Object... var0) {
      return a(var0, new dx(new ji()));
   }

   public static dx b(Object... var0) {
      return a(var0, new dx(new ahj()));
   }

   public static dx c(Object... var0) {
      return a(var0, new dx(new agz()));
   }

   public static dx a(String var0) {
      return a(ahf.a(var0));
   }

   public static dx a(oj var0) {
      return new dx(new jr(var0));
   }

   public static dx b(String var0) {
      return c().a(a(var0));
   }

   public static dx a(int var0) {
      return new dx(new da(var0));
   }

   public static dx b(int var0) {
      return b().a(a(var0));
   }

   private static dx a(Object[] var0, dx var1) {
      dx var2 = var1;

      for(int var3 = var0.length - 1; var3 >= 0; --var3) {
         if (var0[var3] instanceof Integer) {
            var2 = a(b((Integer)var0[var3]), var2);
         } else {
            if (!(var0[var3] instanceof String)) {
               throw new IllegalArgumentException("Element [" + var0[var3] + "] of path elements" + " [" + Arrays.toString(var0) + "] was of illegal type [" + var0[var3].getClass().getCanonicalName() + "]; only Integer and String are valid.");
            }

            var2 = a(b((String)var0[var3]), var2);
         }
      }

      return var2;
   }

   private static dx a(dx var0, dx var1) {
      return new dx(new zk(var0, var1));
   }
}
