package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class tc {
   private static final ci[] b = new ci[]{new ci(gp.class, 40, 0), new ci(fj.class, 5, 5), new ci(hq.class, 20, 0), new ci(xg.class, 20, 0), new ci(jt.class, 10, 6), new ci(so.class, 5, 5), new ci(vl.class, 5, 5), new ci(kt.class, 5, 4), new ci(ys.class, 5, 4), new iz(zc.class, 10, 2), new th(ir.class, 20, 1)};
   private static List c;
   private static Class d;
   static int a = 0;
   private static final qa e = new qa((iz)null);

   public static void a() {
      c = new ArrayList();

      for(ci var3 : b) {
         var3.c = 0;
         c.add(var3);
      }

      d = null;
   }

   private static boolean c() {
      boolean var0 = false;
      a = 0;

      for(ci var2 : (Iterable<ci>)(Iterable)(c)) {
         if (var2.d > 0 && var2.c < var2.d) {
            var0 = true;
         }

         a += var2.b;
      }

      return var0;
   }

   private static os a(Class var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      Object var8 = null;
      if (var0 == gp.class) {
         var8 = gp.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == fj.class) {
         var8 = fj.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == hq.class) {
         var8 = hq.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == xg.class) {
         var8 = xg.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == jt.class) {
         var8 = jt.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == so.class) {
         var8 = so.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == vl.class) {
         var8 = vl.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == kt.class) {
         var8 = kt.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == ys.class) {
         var8 = ys.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == zc.class) {
         var8 = zc.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == ir.class) {
         var8 = ir.a(var1, var2, var3, var4, var5, var6, var7);
      }

      return (os)var8;
   }

   private static os b(aeh var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if (!c()) {
         return null;
      } else {
         if (d != null) {
            os var8 = a(d, var1, var2, var3, var4, var5, var6, var7);
            d = null;
            if (var8 != null) {
               return var8;
            }
         }

         int var13 = 0;

         while(var13 < 5) {
            ++var13;
            int var9 = var2.nextInt(a);

            for(ci var11 : (Iterable<ci>)(Iterable)(c)) {
               var9 -= var11.b;
               if (var9 < 0) {
                  if (!var11.a(var7) || var11 == var0.a) {
                     break;
                  }

                  os var12 = a(var11.a, var1, var2, var3, var4, var5, var6, var7);
                  if (var12 != null) {
                     ++var11.c;
                     var0.a = var11;
                     if (!var11.a()) {
                        c.remove(var11);
                     }

                     return var12;
                  }
               }
            }
         }

         nl var14 = vn.a(var1, var2, var3, var4, var5, var6);
         if (var14 != null && var14.b > 1) {
            return new vn(var7, var2, var14, var6);
         } else {
            return null;
         }
      }
   }

   private static nk c(aeh var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if (var7 > 50) {
         return null;
      } else if (Math.abs(var3 - var0.a().a) <= 112 && Math.abs(var5 - var0.a().c) <= 112) {
         os var8 = b(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if (var8 != null) {
            var1.add(var8);
            var0.c.add(var8);
         }

         return var8;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static nk a(aeh var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return c(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static Class a(Class var0) {
      d = var0;
      return var0;
   }

   // $FF: synthetic method
   static qa b() {
      return e;
   }
}
