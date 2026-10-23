package net.minecraft.client;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public final class we {
   private static HashMap b = new HashMap();
   protected static final Class[] a = new Class[]{vq.class, gr.class, it.class};

   protected static am a(ry var0, int var1, int var2) {
      int var3 = var1 + var0.w.nextInt(16);
      int var4 = var0.w.nextInt(var0.c);
      int var5 = var2 + var0.w.nextInt(16);
      return new am(var3, var4, var5);
   }

   public static final int a(ry var0, boolean var1, boolean var2) {
      if (!var1 && !var2) {
         return 0;
      } else {
         b.clear();

         for(int var3 = 0; var3 < var0.i.size(); ++var3) {
            vi var4 = (vi)var0.i.get(var3);
            int var5 = me.c(var4.s / (double)16.0F);
            int var6 = me.c(var4.u / (double)16.0F);
            byte var7 = 8;

            for(int var8 = -var7; var8 <= var7; ++var8) {
               for(int var9 = -var7; var9 <= var7; ++var9) {
                  boolean var10 = var8 == -var7 || var8 == var7 || var9 == -var7 || var9 == var7;
                  acm var11 = new acm(var8 + var5, var9 + var6);
                  if (!var10) {
                     b.put(var11, false);
                  } else if (!b.containsKey(var11)) {
                     b.put(var11, true);
                  }
               }
            }
         }

         int var31 = 0;
         dh var32 = var0.v();

         for(jf var36 : jf.values()) {
            if ((!var36.d() || var2) && (var36.d() || var1) && var0.b(var36.a()) <= var36.b() * b.size() / 256) {
               label123:
               for(acm var38 : (Iterable<acm>)(Iterable)(b.keySet())) {
                  if (!(Boolean)b.get(var38)) {
                     am var39 = a(var0, var38.a * 16, var38.b * 16);
                     int var12 = var39.a;
                     int var13 = var39.b;
                     int var14 = var39.c;
                     if (!var0.g(var12, var13, var14) && var0.e(var12, var13, var14) == var36.c()) {
                        int var15 = 0;

                        for(int var16 = 0; var16 < 3; ++var16) {
                           int var17 = var12;
                           int var18 = var13;
                           int var19 = var14;
                           byte var20 = 6;
                           yx var21 = null;

                           for(int var22 = 0; var22 < 4; ++var22) {
                              var17 += var0.w.nextInt(var20) - var0.w.nextInt(var20);
                              var18 += var0.w.nextInt(1) - var0.w.nextInt(1);
                              var19 += var0.w.nextInt(var20) - var0.w.nextInt(var20);
                              if (a(var36, var0, var17, var18, var19)) {
                                 float var23 = (float)var17 + 0.5F;
                                 float var24 = (float)var18;
                                 float var25 = (float)var19 + 0.5F;
                                 if (var0.a((double)var23, (double)var24, (double)var25, (double)24.0F) == null) {
                                    float var26 = var23 - (float)var32.a;
                                    float var27 = var24 - (float)var32.b;
                                    float var28 = var25 - (float)var32.c;
                                    float var29 = var26 * var26 + var27 * var27 + var28 * var28;
                                    if (!(var29 < 576.0F)) {
                                       if (var21 == null) {
                                          var21 = var0.a(var36, var17, var18, var19);
                                          if (var21 == null) {
                                             break;
                                          }
                                       }

                                       nq var40;
                                       try {
                                          var40 = (nq)net.minecraft.client.Reflect.newWorld(var21.a, var0);
                                       } catch (Exception var30) {
                                          var30.printStackTrace();
                                          return var31;
                                       }

                                       var40.c((double)var23, (double)var24, (double)var25, var0.w.nextFloat() * 360.0F, 0.0F);
                                       if (var40.i()) {
                                          ++var15;
                                          var0.a((ia)var40);
                                          a(var40, var0, var23, var24, var25);
                                          if (var15 >= var40.g_()) {
                                             continue label123;
                                          }
                                       }

                                       var31 += var15;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return var31;
      }
   }

   private static boolean a(jf var0, ry var1, int var2, int var3, int var4) {
      if (var0.c() == p.g) {
         return var1.e(var2, var3, var4).a() && !var1.g(var2, var3 + 1, var4);
      } else {
         return var1.g(var2, var3 - 1, var4) && !var1.g(var2, var3, var4) && !var1.e(var2, var3, var4).a() && !var1.g(var2, var3 + 1, var4);
      }
   }

   private static void a(nq var0, ry var1, float var2, float var3, float var4) {
      if (var0 instanceof vq && var1.w.nextInt(100) == 0) {
         it var5 = new it(var1);
         var5.c((double)var2, (double)var3, (double)var4, var0.y, 0.0F);
         var1.a((ia)var5);
         var5.g(var0);
      } else if (var0 instanceof hm) {
         ((hm)var0).c(hm.a(var1.w));
      }

   }

   public static void a(ry var0, sr var1, int var2, int var3, int var4, int var5, Random var6) {
      List var7 = var1.a(jf.b);
      if (!var7.isEmpty()) {
         while(var6.nextFloat() < var1.d()) {
            yx var8 = (yx)nc.a(var0.w, (Collection)var7);
            int var9 = var8.b + var6.nextInt(1 + var8.c - var8.b);
            int var10 = var2 + var6.nextInt(var4);
            int var11 = var3 + var6.nextInt(var5);
            int var12 = var10;
            int var13 = var11;

            for(int var14 = 0; var14 < var9; ++var14) {
               boolean var15 = false;

               for(int var16 = 0; !var15 && var16 < 4; ++var16) {
                  int var17 = var0.f(var10, var11);
                  if (a(jf.b, var0, var10, var17, var11)) {
                     float var18 = (float)var10 + 0.5F;
                     float var19 = (float)var17;
                     float var20 = (float)var11 + 0.5F;

                     nq var21;
                     try {
                        var21 = (nq)net.minecraft.client.Reflect.newWorld(var8.a, var0);
                     } catch (Exception var23) {
                        var23.printStackTrace();
                        continue;
                     }

                     var21.c((double)var18, (double)var19, (double)var20, var6.nextFloat() * 360.0F, 0.0F);
                     var0.a((ia)var21);
                     a(var21, var0, var18, var19, var20);
                     var15 = true;
                  }

                  var10 += var6.nextInt(5) - var6.nextInt(5);

                  for(var11 += var6.nextInt(5) - var6.nextInt(5); var10 < var2 || var10 >= var2 + var4 || var11 < var3 || var11 >= var3 + var4; var11 = var13 + var6.nextInt(5) - var6.nextInt(5)) {
                     var10 = var12 + var6.nextInt(5) - var6.nextInt(5);
                  }
               }
            }
         }

      }
   }
}
