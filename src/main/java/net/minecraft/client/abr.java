package net.minecraft.client;

import java.util.ArrayList;

public class abr extends yy {
   private boolean a;
   private static boolean cb;

   public abr(int var1, int var2, boolean var3) {
      super(var1, var2, net.minecraft.client.p.D);
      this.a = var3;
      this.a(f);
      this.c(0.5F);
   }

   public int s() {
      return this.a ? 106 : 107;
   }

   public int a(int var1, int var2) {
      int var3 = e(var2);
      if (var3 > 5) {
         return this.bL;
      } else if (var1 == var3) {
         return !f(var2) && !(this.bR > (double)0.0F) && !(this.bS > (double)0.0F) && !(this.bT > (double)0.0F) && !(this.bU < (double)1.0F) && !(this.bV < (double)1.0F) && !(this.bW < (double)1.0F) ? this.bL : 110;
      } else {
         return var1 == ot.a[var3] ? 109 : 108;
      }
   }

   public int c() {
      return 16;
   }

   public boolean a() {
      return false;
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      return false;
   }

   public void a(ry var1, int var2, int var3, int var4, nq var5) {
      int var6 = c(var1, var2, var3, var4, (vi)var5);
      var1.f(var2, var3, var4, var6);
      if (!var1.I && !cb) {
         this.g(var1, var2, var3, var4);
      }

   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (!var1.I && !cb) {
         this.g(var1, var2, var3, var4);
      }

   }

   public void a(ry var1, int var2, int var3, int var4) {
      if (!var1.I && var1.b(var2, var3, var4) == null && !cb) {
         this.g(var1, var2, var3, var4);
      }

   }

   private void g(ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      int var6 = e(var5);
      boolean var7 = this.f(var1, var2, var3, var4, var6);
      if (var5 != 7) {
         if (var7 && !f(var5)) {
            if (g(var1, var2, var3, var4, var6)) {
               var1.c(var2, var3, var4, var6 | 8);
               var1.f(var2, var3, var4, 0, var6);
            }
         } else if (!var7 && f(var5)) {
            var1.c(var2, var3, var4, var6);
            var1.f(var2, var3, var4, 1, var6);
         }

      }
   }

   private boolean f(ry var1, int var2, int var3, int var4, int var5) {
      if (var5 != 0 && var1.l(var2, var3 - 1, var4, 0)) {
         return true;
      } else if (var5 != 1 && var1.l(var2, var3 + 1, var4, 1)) {
         return true;
      } else if (var5 != 2 && var1.l(var2, var3, var4 - 1, 2)) {
         return true;
      } else if (var5 != 3 && var1.l(var2, var3, var4 + 1, 3)) {
         return true;
      } else if (var5 != 5 && var1.l(var2 + 1, var3, var4, 5)) {
         return true;
      } else if (var5 != 4 && var1.l(var2 - 1, var3, var4, 4)) {
         return true;
      } else if (var1.l(var2, var3, var4, 0)) {
         return true;
      } else if (var1.l(var2, var3 + 2, var4, 1)) {
         return true;
      } else if (var1.l(var2, var3 + 1, var4 - 1, 2)) {
         return true;
      } else if (var1.l(var2, var3 + 1, var4 + 1, 3)) {
         return true;
      } else if (var1.l(var2 - 1, var3 + 1, var4, 4)) {
         return true;
      } else {
         return var1.l(var2 + 1, var3 + 1, var4, 5);
      }
   }

   public void a(ry var1, int var2, int var3, int var4, int var5, int var6) {
      cb = true;
      if (var5 == 0) {
         if (this.h(var1, var2, var3, var4, var6)) {
            var1.f(var2, var3, var4, var6 | 8);
            var1.a((double)var2 + (double)0.5F, (double)var3 + (double)0.5F, (double)var4 + (double)0.5F, "tile.piston.out", 0.5F, var1.w.nextFloat() * 0.25F + 0.6F);
         } else {
            var1.c(var2, var3, var4, var6);
         }
      } else if (var5 == 1) {
         bq var8 = var1.b(var2 + ot.b[var6], var3 + ot.c[var6], var4 + ot.d[var6]);
         if (var8 != null && var8 instanceof agb) {
            ((agb)var8).j();
         }

         var1.b(var2, var3, var4, yy.ac.bM, var6);
         var1.a(var2, var3, var4, qz.a(this.bM, var6, var6, false, true));
         if (this.a) {
            int var9 = var2 + ot.b[var6] * 2;
            int var10 = var3 + ot.c[var6] * 2;
            int var11 = var4 + ot.d[var6] * 2;
            int var12 = var1.a(var9, var10, var11);
            int var13 = var1.d(var9, var10, var11);
            boolean var14 = false;
            if (var12 == yy.ac.bM) {
               bq var15 = var1.b(var9, var10, var11);
               if (var15 != null && var15 instanceof agb) {
                  agb var16 = (agb)var15;
                  if (var16.d() == var6 && var16.c()) {
                     var16.j();
                     var12 = var16.a();
                     var13 = var16.f();
                     var14 = true;
                  }
               }
            }

            if (var14 || var12 <= 0 || !a(var12, var1, var9, var10, var11, false) || yy.k[var12].i() != 0 && var12 != yy.Z.bM && var12 != yy.V.bM) {
               if (!var14) {
                  cb = false;
                  var1.g(var2 + ot.b[var6], var3 + ot.c[var6], var4 + ot.d[var6], 0);
                  cb = true;
               }
            } else {
               var2 += ot.b[var6];
               var3 += ot.c[var6];
               var4 += ot.d[var6];
               var1.b(var2, var3, var4, yy.ac.bM, var13);
               var1.a(var2, var3, var4, qz.a(var12, var13, var6, false, false));
               cb = false;
               var1.g(var9, var10, var11, 0);
               cb = true;
            }
         } else {
            cb = false;
            var1.g(var2 + ot.b[var6], var3 + ot.c[var6], var4 + ot.d[var6], 0);
            cb = true;
         }

         var1.a((double)var2 + (double)0.5F, (double)var3 + (double)0.5F, (double)var4 + (double)0.5F, "tile.piston.in", 0.5F, var1.w.nextFloat() * 0.15F + 0.6F);
      }

      cb = false;
   }

   public void b(kq var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      if (f(var5)) {
         switch (e(var5)) {
            case 0:
               this.a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
               break;
            case 1:
               this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
               break;
            case 2:
               this.a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
               break;
            case 3:
               this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
               break;
            case 4:
               this.a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
               break;
            case 5:
               this.a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
         }
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void e() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(ry var1, int var2, int var3, int var4, c var5, ArrayList var6) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean b() {
      return false;
   }

   public static int e(int var0) {
      return var0 & 7;
   }

   public static boolean f(int var0) {
      return (var0 & 8) != 0;
   }

   private static int c(ry var0, int var1, int var2, int var3, vi var4) {
      if (me.e((float)var4.s - (float)var1) < 2.0F && me.e((float)var4.u - (float)var3) < 2.0F) {
         double var5 = var4.t + 1.82 - (double)var4.L;
         if (var5 - (double)var2 > (double)2.0F) {
            return 1;
         }

         if ((double)var2 - var5 > (double)0.0F) {
            return 0;
         }
      }

      int var7 = me.c((double)(var4.y * 4.0F / 360.0F) + (double)0.5F) & 3;
      if (var7 == 0) {
         return 2;
      } else if (var7 == 1) {
         return 5;
      } else if (var7 == 2) {
         return 3;
      } else {
         return var7 == 3 ? 4 : 0;
      }
   }

   private static boolean a(int var0, ry var1, int var2, int var3, int var4, boolean var5) {
      if (var0 == yy.ap.bM) {
         return false;
      } else {
         if (var0 != yy.Z.bM && var0 != yy.V.bM) {
            if (yy.k[var0].n() == -1.0F) {
               return false;
            }

            if (yy.k[var0].i() == 2) {
               return false;
            }

            if (!var5 && yy.k[var0].i() == 1) {
               return false;
            }
         } else if (f(var1.d(var2, var3, var4))) {
            return false;
         }

         return !(yy.k[var0] instanceof ba);
      }
   }

   private static boolean g(ry var0, int var1, int var2, int var3, int var4) {
      int var5 = var1 + ot.b[var4];
      int var6 = var2 + ot.c[var4];
      int var7 = var3 + ot.d[var4];
      int var8 = 0;

      while(true) {
         if (var8 < 13) {
            if (var6 <= 0 || var6 >= var0.c - 1) {
               return false;
            }

            int var9 = var0.a(var5, var6, var7);
            if (var9 != 0) {
               if (!a(var9, var0, var5, var6, var7, true)) {
                  return false;
               }

               if (yy.k[var9].i() != 1) {
                  if (var8 == 12) {
                     return false;
                  }

                  var5 += ot.b[var4];
                  var6 += ot.c[var4];
                  var7 += ot.d[var4];
                  ++var8;
                  continue;
               }
            }
         }

         return true;
      }
   }

   private boolean h(ry var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 + ot.b[var5];
      int var7 = var3 + ot.c[var5];
      int var8 = var4 + ot.d[var5];
      int var9 = 0;

      while(true) {
         if (var9 < 13) {
            if (var7 <= 0 || var7 >= var1.c - 1) {
               return false;
            }

            int var10 = var1.a(var6, var7, var8);
            if (var10 != 0) {
               if (!a(var10, var1, var6, var7, var8, true)) {
                  return false;
               }

               if (yy.k[var10].i() != 1) {
                  if (var9 == 12) {
                     return false;
                  }

                  var6 += ot.b[var5];
                  var7 += ot.c[var5];
                  var8 += ot.d[var5];
                  ++var9;
                  continue;
               }

               yy.k[var10].b(var1, var6, var7, var8, var1.d(var6, var7, var8), 0);
               var1.g(var6, var7, var8, 0);
            }
         }

         while(var6 != var2 || var7 != var3 || var8 != var4) {
            var9 = var6 - ot.b[var5];
            int var15 = var7 - ot.c[var5];
            int var11 = var8 - ot.d[var5];
            int var12 = var1.a(var9, var15, var11);
            int var13 = var1.d(var9, var15, var11);
            if (var12 == this.bM && var9 == var2 && var15 == var3 && var11 == var4) {
               var1.b(var6, var7, var8, yy.ac.bM, var5 | (this.a ? 8 : 0));
               var1.a(var6, var7, var8, qz.a(yy.aa.bM, var5 | (this.a ? 8 : 0), var5, true, false));
            } else {
               var1.b(var6, var7, var8, yy.ac.bM, var13);
               var1.a(var6, var7, var8, qz.a(var12, var13, var5, true, false));
            }

            var6 = var9;
            var7 = var15;
            var8 = var11;
         }

         return true;
      }
   }
}
