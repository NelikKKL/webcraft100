package net.minecraft.client;

public final class xo extends xc {
   private static final wo a = new rx();

   static xo a(he var0, Object[] var1, wz var2) {
      return new xo(var0, var1, var2);
   }

   private xo(he var1, Object[] var2, wz var3) {
      super(b(var1, var2, var3));
   }

   private static String b(he var0, Object[] var1, wz var2) {
      return "Failed to find " + var0.a.toString() + " at [" + he.a(var0.b) + "] while resolving [" + a(var1) + "] in " + a.a(var2) + ".";
   }

   private static String a(Object[] var0) {
      StringBuilder var1 = new StringBuilder();
      boolean var2 = true;

      for(Object var6 : var0) {
         if (!var2) {
            var1.append(".");
         }

         var2 = false;
         if (var6 instanceof String) {
            var1.append("\"").append(var6).append("\"");
         } else {
            var1.append(var6);
         }
      }

      return var1.toString();
   }
}
