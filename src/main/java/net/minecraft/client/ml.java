package net.minecraft.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ml {
   private static final Random a = new net.minecraft.client.web.JRandom();
   private static final cp b = new cp((qt)null);
   private static final aen c = new aen((qt)null);

   private static int b(int var0, dk var1) {
      if (var1 == null) {
         return 0;
      } else {
         yi var2 = var1.p();
         if (var2 == null) {
            return 0;
         } else {
            for(int var3 = 0; var3 < var2.c(); ++var3) {
               short var4 = ((ik)var2.a(var3)).d("id");
               short var5 = ((ik)var2.a(var3)).d("lvl");
               if (var4 == var0) {
                  return var5;
               }
            }

            return 0;
         }
      }
   }

   private static int a(int var0, dk[] var1) {
      int var2 = 0;

      for(dk var6 : var1) {
         int var7 = b(var0, var6);
         if (var7 > var2) {
            var2 = var7;
         }
      }

      return var2;
   }

   private static void a(fz var0, dk var1) {
      if (var1 != null) {
         yi var2 = var1.p();
         if (var2 != null) {
            for(int var3 = 0; var3 < var2.c(); ++var3) {
               short var4 = ((ik)var2.a(var3)).d("id");
               short var5 = ((ik)var2.a(var3)).d("lvl");
               if (aef.b[var4] != null) {
                  var0.a(aef.b[var4], var5);
               }
            }

         }
      }
   }

   private static void a(fz var0, dk[] var1) {
      for(dk var5 : var1) {
         a(var0, var5);
      }

   }

   public static int a(x var0, pm var1) {
      b.a = 0;
      b.b = var1;
      a((fz)b, (dk[])var0.b);
      if (b.a > 25) {
         b.a = 25;
      }

      return (b.a + 1 >> 1) + a.nextInt((b.a >> 1) + 1);
   }

   public static int a(x var0, nq var1) {
      c.a = 0;
      c.b = var1;
      a((fz)c, (dk)var0.a());
      return c.a > 0 ? 1 + a.nextInt(c.a) : 0;
   }

   public static int b(x var0, nq var1) {
      return b(aef.m.t, var0.a());
   }

   public static int c(x var0, nq var1) {
      return b(aef.n.t, var0.a());
   }

   public static int a(x var0) {
      return a(aef.h.t, var0.b);
   }

   public static int b(x var0) {
      return b(aef.p.t, var0.a());
   }

   public static int c(x var0) {
      return b(aef.r.t, var0.a());
   }

   public static boolean d(x var0) {
      return b(aef.q.t, var0.a()) > 0;
   }

   public static int e(x var0) {
      return b(aef.s.t, var0.a());
   }

   public static int f(x var0) {
      return b(aef.o.t, var0.a());
   }

   public static boolean g(x var0) {
      return a(aef.i.t, var0.b) > 0;
   }

   public static int a(Random var0, int var1, int var2, dk var3) {
      acy var4 = var3.a();
      int var5 = var4.c();
      if (var5 <= 0) {
         return 0;
      } else {
         if (var2 > 30) {
            var2 = 30;
         }

         var2 = 1 + var0.nextInt((var2 >> 1) + 1) + var0.nextInt(var2 + 1);
         int var6 = var0.nextInt(5) + var2;
         if (var1 == 0) {
            return (var6 >> 1) + 1;
         } else {
            return var1 == 1 ? var6 * 2 / 3 + 1 : var6;
         }
      }
   }

   public static List a(Random var0, dk var1, int var2) {
      acy var3 = var1.a();
      int var4 = var3.c();
      if (var4 <= 0) {
         return null;
      } else {
         var4 = 1 + var0.nextInt((var4 >> 1) + 1) + var0.nextInt((var4 >> 1) + 1);
         int var5 = var4 + var2;
         float var6 = (var0.nextFloat() + var0.nextFloat() - 1.0F) * 0.25F;
         int var7 = (int)((float)var5 * (1.0F + var6) + 0.5F);
         ArrayList var8 = null;
         Map var9 = a(var7, var1);
         if (var9 != null && !var9.isEmpty()) {
            vs var10 = (vs)nc.a(var0, var9.values());
            if (var10 != null) {
               var8 = new ArrayList();
               var8.add(var10);

               for(int var11 = var7 >> 1; var0.nextInt(50) <= var11; var11 >>= 1) {
                  Iterator var12 = var9.keySet().iterator();

                  while(var12.hasNext()) {
                     Integer var13 = (Integer)var12.next();
                     boolean var14 = true;

                     for(vs var16 : (Iterable<vs>)(Iterable)(var8)) {
                        if (!var16.a.a(aef.b[var13])) {
                           var14 = false;
                           break;
                        }
                     }

                     if (!var14) {
                        var12.remove();
                     }
                  }

                  if (!var9.isEmpty()) {
                     vs var18 = (vs)nc.a(var0, var9.values());
                     var8.add(var18);
                  }
               }
            }
         }

         return var8;
      }
   }

   public static Map a(int var0, dk var1) {
      acy var2 = var1.a();
      HashMap var3 = null;

      for(aef var7 : aef.b) {
         if (var7 != null && var7.u.a(var2)) {
            for(int var8 = var7.d(); var8 <= var7.a(); ++var8) {
               if (var0 >= var7.a(var8) && var0 <= var7.b(var8)) {
                  if (var3 == null) {
                     var3 = new HashMap();
                  }

                  var3.put(var7.t, new vs(var7, var8));
               }
            }
         }
      }

      return var3;
   }
}
