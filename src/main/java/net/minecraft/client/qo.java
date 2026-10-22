package net.minecraft.client;

import java.util.Random;

public class qo extends zt {
   private int cc;
   int[] a;

   protected qo(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.i, false);
      this.cc = var2;
      this.b(true);
   }

   public int f() {
      double var1 = (double)0.5F;
      double var3 = (double)1.0F;
      return db.a(var1, var3);
   }

   public int c(int var1) {
      if ((var1 & 1) == 1) {
         return db.a();
      } else {
         return (var1 & 2) == 2 ? db.b() : db.c();
      }
   }

   public int a(kq var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      if ((var5 & 1) == 1) {
         return db.a();
      } else {
         return (var5 & 2) == 2 ? db.b() : var1.a().a(var2, var4).b(var1, var2, var3, var4);
      }
   }

   public void d(ry var1, int var2, int var3, int var4) {
      byte var5 = 1;
      int var6 = var5 + 1;
      if (var1.b(var2 - var6, var3 - var6, var4 - var6, var2 + var6, var3 + var6, var4 + var6)) {
         for(int var7 = -var5; var7 <= var5; ++var7) {
            for(int var8 = -var5; var8 <= var5; ++var8) {
               for(int var9 = -var5; var9 <= var5; ++var9) {
                  int var10 = var1.a(var2 + var7, var3 + var8, var4 + var9);
                  if (var10 == yy.K.bM) {
                     int var11 = var1.d(var2 + var7, var3 + var8, var4 + var9);
                     var1.c(var2 + var7, var3 + var8, var4 + var9, var11 | 8);
                  }
               }
            }
         }
      }

   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (!var1.I) {
         int var6 = var1.d(var2, var3, var4);
         if ((var6 & 8) != 0 && (var6 & 4) == 0) {
            byte var7 = 4;
            int var8 = var7 + 1;
            byte var9 = 32;
            int var10 = var9 * var9;
            int var11 = var9 / 2;
            if (this.a == null) {
               this.a = new int[var9 * var9 * var9];
            }

            if (var1.b(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
               for(int var12 = -var7; var12 <= var7; ++var12) {
                  for(int var13 = -var7; var13 <= var7; ++var13) {
                     for(int var14 = -var7; var14 <= var7; ++var14) {
                        int var15 = var1.a(var2 + var12, var3 + var13, var4 + var14);
                        if (var15 == yy.J.bM) {
                           this.a[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = 0;
                        } else if (var15 == yy.K.bM) {
                           this.a[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -2;
                        } else {
                           this.a[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -1;
                        }
                     }
                  }
               }

               for(int var16 = 1; var16 <= 4; ++var16) {
                  for(int var18 = -var7; var18 <= var7; ++var18) {
                     for(int var19 = -var7; var19 <= var7; ++var19) {
                        for(int var20 = -var7; var20 <= var7; ++var20) {
                           if (this.a[(var18 + var11) * var10 + (var19 + var11) * var9 + var20 + var11] == var16 - 1) {
                              if (this.a[(var18 + var11 - 1) * var10 + (var19 + var11) * var9 + var20 + var11] == -2) {
                                 this.a[(var18 + var11 - 1) * var10 + (var19 + var11) * var9 + var20 + var11] = var16;
                              }

                              if (this.a[(var18 + var11 + 1) * var10 + (var19 + var11) * var9 + var20 + var11] == -2) {
                                 this.a[(var18 + var11 + 1) * var10 + (var19 + var11) * var9 + var20 + var11] = var16;
                              }

                              if (this.a[(var18 + var11) * var10 + (var19 + var11 - 1) * var9 + var20 + var11] == -2) {
                                 this.a[(var18 + var11) * var10 + (var19 + var11 - 1) * var9 + var20 + var11] = var16;
                              }

                              if (this.a[(var18 + var11) * var10 + (var19 + var11 + 1) * var9 + var20 + var11] == -2) {
                                 this.a[(var18 + var11) * var10 + (var19 + var11 + 1) * var9 + var20 + var11] = var16;
                              }

                              if (this.a[(var18 + var11) * var10 + (var19 + var11) * var9 + (var20 + var11 - 1)] == -2) {
                                 this.a[(var18 + var11) * var10 + (var19 + var11) * var9 + (var20 + var11 - 1)] = var16;
                              }

                              if (this.a[(var18 + var11) * var10 + (var19 + var11) * var9 + var20 + var11 + 1] == -2) {
                                 this.a[(var18 + var11) * var10 + (var19 + var11) * var9 + var20 + var11 + 1] = var16;
                              }
                           }
                        }
                     }
                  }
               }
            }

            int var17 = this.a[var11 * var10 + var11 * var9 + var11];
            if (var17 >= 0) {
               var1.c(var2, var3, var4, var6 & -9);
            } else {
               this.g(var1, var2, var3, var4);
            }
         }

      }
   }

   private void g(ry var1, int var2, int var3, int var4) {
      this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
      var1.g(var2, var3, var4, 0);
   }

   public int a(Random var1) {
      return var1.nextInt(20) == 0 ? 1 : 0;
   }

   public int a(int var1, Random var2, int var3) {
      return yy.y.bM;
   }

   public void a(ry var1, vi var2, int var3, int var4, int var5, int var6) {
      if (!var1.I && var2.aH() != null && var2.aH().c == acy.bd.bM) {
         var2.a((px)ny.C[this.bM], 1);
         this.a(var1, var3, var4, var5, new dk(yy.K.bM, 1, var6 & 3));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }

   protected int a(int var1) {
      return var1 & 3;
   }

   public boolean a() {
      return !this.cb;
   }

   public int a(int var1, int var2) {
      return (var2 & 3) == 1 ? this.bL + 80 : this.bL;
   }

   public void a(boolean var1) {
      this.cb = var1;
      this.bL = this.cc + (var1 ? 0 : 1);
   }

   public void b(ry var1, int var2, int var3, int var4, ia var5) {
      super.b(var1, var2, var3, var4, var5);
   }
}
