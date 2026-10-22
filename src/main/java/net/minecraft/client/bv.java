package net.minecraft.client;

public class bv extends fu {
   protected bv(int var1) {
      super(var1);
      this.h(1);
   }

   public static kl a(short var0, ry var1) {
      (new StringBuilder()).append("map_").append(var0).toString();
      kl var3 = (kl)var1.a(kl.class, "map_" + var0);
      if (var3 == null) {
         int var4 = var1.b("map");
         String var2 = "map_" + var4;
         var3 = new kl(var2);
         var1.a((String)var2, (afz)var3);
      }

      return var3;
   }

   public kl a(dk var1, ry var2) {
      (new StringBuilder()).append("map_").append(var1.i()).toString();
      kl var4 = (kl)var2.a(kl.class, "map_" + var1.i());
      if (var4 == null) {
         var1.b(var2.b("map"));
         String var3 = "map_" + var1.i();
         var4 = new kl(var3);
         var4.a = var2.z().c();
         var4.b = var2.z().e();
         var4.d = 3;
         var4.c = (byte)var2.y.g;
         var4.a();
         var2.a((String)var3, (afz)var4);
      }

      return var4;
   }

   public void a(ry var1, ia var2, kl var3) {
      if (var1.y.g == var3.c) {
         short var4 = 128;
         short var5 = 128;
         int var6 = 1 << var3.d;
         int var7 = var3.a;
         int var8 = var3.b;
         int var9 = me.c(var2.s - (double)var7) / var6 + var4 / 2;
         int var10 = me.c(var2.u - (double)var8) / var6 + var5 / 2;
         int var11 = 128 / var6;
         if (var1.y.e) {
            var11 /= 2;
         }

         ++var3.f;

         for(int var12 = var9 - var11 + 1; var12 < var9 + var11; ++var12) {
            if ((var12 & 15) == (var3.f & 15)) {
               int var13 = 255;
               int var14 = 0;
               double var15 = (double)0.0F;

               for(int var17 = var10 - var11 - 1; var17 < var10 + var11; ++var17) {
                  if (var12 >= 0 && var17 >= -1 && var12 < var4 && var17 < var5) {
                     int var18 = var12 - var9;
                     int var19 = var17 - var10;
                     boolean var20 = var18 * var18 + var19 * var19 > (var11 - 2) * (var11 - 2);
                     int var21 = (var7 / var6 + var12 - var4 / 2) * var6;
                     int var22 = (var8 / var6 + var17 - var5 / 2) * var6;
                     byte var23 = 0;
                     byte var24 = 0;
                     byte var25 = 0;
                     int[] var26 = new int[256];
                     zx var27 = var1.b(var21, var22);
                     int var28 = var21 & 15;
                     int var29 = var22 & 15;
                     int var30 = 0;
                     double var31 = (double)0.0F;
                     if (var1.y.e) {
                        int var33 = var21 + var22 * 231871;
                        var33 = var33 * var33 * 31287121 + var33 * 11;
                        if ((var33 >> 20 & 1) == 0) {
                           int var10001 = yy.v.bM;
                           var26[var10001] += 10;
                        } else {
                           int var57 = yy.t.bM;
                           var26[var57] += 10;
                        }

                        var31 = (double)100.0F;
                     } else {
                        for(int var43 = 0; var43 < var6; ++var43) {
                           for(int var34 = 0; var34 < var6; ++var34) {
                              int var35 = var27.b(var43 + var28, var34 + var29) + 1;
                              int var36 = 0;
                              if (var35 > 1) {
                                 boolean var37 = false;

                                 do {
                                    var37 = true;
                                    var36 = var27.a(var43 + var28, var35 - 1, var34 + var29);
                                    if (var36 == 0) {
                                       var37 = false;
                                    } else if (var35 > 0 && var36 > 0 && yy.k[var36].bZ.E == aav.b) {
                                       var37 = false;
                                    }

                                    if (!var37) {
                                       --var35;
                                       var36 = var27.a(var43 + var28, var35 - 1, var34 + var29);
                                    }
                                 } while(var35 > 0 && !var37);

                                 if (var35 > 0 && var36 != 0 && yy.k[var36].bZ.a()) {
                                    int var38 = var35 - 1;
                                    int var39 = 0;

                                    do {
                                       var39 = var27.a(var43 + var28, var38--, var34 + var29);
                                       ++var30;
                                    } while(var38 > 0 && var39 != 0 && yy.k[var39].bZ.a());
                                 }
                              }

                              var31 += (double)var35 / (double)(var6 * var6);
                              int var59 = var26[var36]++;
                           }
                        }
                     }

                     var30 /= var6 * var6;
                     int var10000 = var23 / (var6 * var6);
                     var10000 = var24 / (var6 * var6);
                     var10000 = var25 / (var6 * var6);
                     int var44 = 0;
                     int var45 = 0;

                     for(int var46 = 0; var46 < 256; ++var46) {
                        if (var26[var46] > var44) {
                           var45 = var46;
                           var44 = var26[var46];
                        }
                     }

                     double var47 = (var31 - var15) * (double)4.0F / (double)(var6 + 4) + ((double)(var12 + var17 & 1) - (double)0.5F) * 0.4;
                     byte var50 = 1;
                     if (var47 > 0.6) {
                        var50 = 2;
                     }

                     if (var47 < -0.6) {
                        var50 = 0;
                     }

                     int var51 = 0;
                     if (var45 > 0) {
                        aav var53 = yy.k[var45].bZ.E;
                        if (var53 == aav.n) {
                           var47 = (double)var30 * 0.1 + (double)(var12 + var17 & 1) * 0.2;
                           var50 = 1;
                           if (var47 < (double)0.5F) {
                              var50 = 2;
                           }

                           if (var47 > 0.9) {
                              var50 = 0;
                           }
                        }

                        var51 = var53.q;
                     }

                     var15 = var31;
                     if (var17 >= 0 && var18 * var18 + var19 * var19 < var11 * var11 && (!var20 || (var12 + var17 & 1) != 0)) {
                        byte var54 = var3.e[var12 + var17 * var4];
                        byte var40 = (byte)(var51 * 4 + var50);
                        if (var54 != var40) {
                           if (var13 > var17) {
                              var13 = var17;
                           }

                           if (var14 < var17) {
                              var14 = var17;
                           }

                           var3.e[var12 + var17 * var4] = var40;
                        }
                     }
                  }
               }

               if (var13 <= var14) {
                  var3.a(var12, var13, var14);
               }
            }
         }

      }
   }

   public void a(dk var1, ry var2, ia var3, int var4, boolean var5) {
      if (!var2.I) {
         kl var6 = this.a(var1, var2);
         if (var3 instanceof vi) {
            vi var7 = (vi)var3;
            var6.a(var7, var1);
         }

         if (var5) {
            this.a(var2, var3, var6);
         }

      }
   }

   public void b(dk var1, ry var2, vi var3) {
      var1.b(var2.b("map"));
      String var4 = "map_" + var1.i();
      kl var5 = new kl(var4);
      var2.a((String)var4, (afz)var5);
      var5.a = me.c(var3.s);
      var5.b = me.c(var3.u);
      var5.d = 3;
      var5.c = (byte)var2.y.g;
      var5.a();
   }
}
