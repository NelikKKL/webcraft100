package net.minecraft.client;

import java.util.Random;

public class au extends ba {
   private Random a = new net.minecraft.client.web.JRandom();

   protected au(int var1) {
      super(var1, net.minecraft.client.p.d);
      this.bL = 26;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int c() {
      return 22;
   }

   public void a(ry var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      this.a_(var1, var2, var3, var4);
      int var5 = var1.a(var2, var3, var4 - 1);
      int var6 = var1.a(var2, var3, var4 + 1);
      int var7 = var1.a(var2 - 1, var3, var4);
      int var8 = var1.a(var2 + 1, var3, var4);
      if (var5 == this.bM) {
         this.a_(var1, var2, var3, var4 - 1);
      }

      if (var6 == this.bM) {
         this.a_(var1, var2, var3, var4 + 1);
      }

      if (var7 == this.bM) {
         this.a_(var1, var2 - 1, var3, var4);
      }

      if (var8 == this.bM) {
         this.a_(var1, var2 + 1, var3, var4);
      }

   }

   public void a(ry var1, int var2, int var3, int var4, nq var5) {
      int var6 = var1.a(var2, var3, var4 - 1);
      int var7 = var1.a(var2, var3, var4 + 1);
      int var8 = var1.a(var2 - 1, var3, var4);
      int var9 = var1.a(var2 + 1, var3, var4);
      byte var10 = 0;
      int var11 = me.c((double)(var5.y * 4.0F / 360.0F) + (double)0.5F) & 3;
      if (var11 == 0) {
         var10 = 2;
      }

      if (var11 == 1) {
         var10 = 5;
      }

      if (var11 == 2) {
         var10 = 3;
      }

      if (var11 == 3) {
         var10 = 4;
      }

      if (var6 != this.bM && var7 != this.bM && var8 != this.bM && var9 != this.bM) {
         var1.f(var2, var3, var4, var10);
      } else {
         if ((var6 == this.bM || var7 == this.bM) && (var10 == 4 || var10 == 5)) {
            if (var6 == this.bM) {
               var1.f(var2, var3, var4 - 1, var10);
            } else {
               var1.f(var2, var3, var4 + 1, var10);
            }

            var1.f(var2, var3, var4, var10);
         }

         if ((var8 == this.bM || var9 == this.bM) && (var10 == 2 || var10 == 3)) {
            if (var8 == this.bM) {
               var1.f(var2 - 1, var3, var4, var10);
            } else {
               var1.f(var2 + 1, var3, var4, var10);
            }

            var1.f(var2, var3, var4, var10);
         }
      }

   }

   public void a_(ry var1, int var2, int var3, int var4) {
      if (!var1.I) {
         int var5 = var1.a(var2, var3, var4 - 1);
         int var6 = var1.a(var2, var3, var4 + 1);
         int var7 = var1.a(var2 - 1, var3, var4);
         int var8 = var1.a(var2 + 1, var3, var4);
         byte var9 = 4;
         if (var5 != this.bM && var6 != this.bM) {
            if (var7 != this.bM && var8 != this.bM) {
               var9 = 3;
               if (yy.m[var5] && !yy.m[var6]) {
                  var9 = 3;
               }

               if (yy.m[var6] && !yy.m[var5]) {
                  var9 = 2;
               }

               if (yy.m[var7] && !yy.m[var8]) {
                  var9 = 5;
               }

               if (yy.m[var8] && !yy.m[var7]) {
                  var9 = 4;
               }
            } else {
               int var14 = var1.a(var7 == this.bM ? var2 - 1 : var2 + 1, var3, var4 - 1);
               int var15 = var1.a(var7 == this.bM ? var2 - 1 : var2 + 1, var3, var4 + 1);
               var9 = 3;
               int var17 = -1;
               if (var7 == this.bM) {
                  var17 = var1.d(var2 - 1, var3, var4);
               } else {
                  var17 = var1.d(var2 + 1, var3, var4);
               }

               if (var17 == 2) {
                  var9 = 2;
               }

               if ((yy.m[var5] || yy.m[var14]) && !yy.m[var6] && !yy.m[var15]) {
                  var9 = 3;
               }

               if ((yy.m[var6] || yy.m[var15]) && !yy.m[var5] && !yy.m[var14]) {
                  var9 = 2;
               }
            }
         } else {
            int var10 = var1.a(var2 - 1, var3, var5 == this.bM ? var4 - 1 : var4 + 1);
            int var11 = var1.a(var2 + 1, var3, var5 == this.bM ? var4 - 1 : var4 + 1);
            var9 = 5;
            int var12 = -1;
            if (var5 == this.bM) {
               var12 = var1.d(var2, var3, var4 - 1);
            } else {
               var12 = var1.d(var2, var3, var4 + 1);
            }

            if (var12 == 4) {
               var9 = 4;
            }

            if ((yy.m[var7] || yy.m[var10]) && !yy.m[var8] && !yy.m[var11]) {
               var9 = 5;
            }

            if ((yy.m[var8] || yy.m[var11]) && !yy.m[var7] && !yy.m[var10]) {
               var9 = 4;
            }
         }

         var1.f(var2, var3, var4, var9);
      }
   }

   public int a(kq var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return this.bL - 1;
      } else if (var5 == 0) {
         return this.bL - 1;
      } else {
         int var6 = var1.a(var2, var3, var4 - 1);
         int var7 = var1.a(var2, var3, var4 + 1);
         int var8 = var1.a(var2 - 1, var3, var4);
         int var9 = var1.a(var2 + 1, var3, var4);
         if (var6 != this.bM && var7 != this.bM) {
            if (var8 != this.bM && var9 != this.bM) {
               byte var15 = 3;
               if (yy.m[var6] && !yy.m[var7]) {
                  var15 = 3;
               }

               if (yy.m[var7] && !yy.m[var6]) {
                  var15 = 2;
               }

               if (yy.m[var8] && !yy.m[var9]) {
                  var15 = 5;
               }

               if (yy.m[var9] && !yy.m[var8]) {
                  var15 = 4;
               }

               return var5 == var15 ? this.bL + 1 : this.bL;
            } else if (var5 != 4 && var5 != 5) {
               int var14 = 0;
               if (var8 == this.bM) {
                  var14 = -1;
               }

               int var16 = var1.a(var8 == this.bM ? var2 - 1 : var2 + 1, var3, var4 - 1);
               int var17 = var1.a(var8 == this.bM ? var2 - 1 : var2 + 1, var3, var4 + 1);
               if (var5 == 3) {
                  var14 = -1 - var14;
               }

               byte var18 = 3;
               if ((yy.m[var6] || yy.m[var16]) && !yy.m[var7] && !yy.m[var17]) {
                  var18 = 3;
               }

               if ((yy.m[var7] || yy.m[var17]) && !yy.m[var6] && !yy.m[var16]) {
                  var18 = 2;
               }

               return (var5 == var18 ? this.bL + 16 : this.bL + 32) + var14;
            } else {
               return this.bL;
            }
         } else if (var5 != 2 && var5 != 3) {
            int var10 = 0;
            if (var6 == this.bM) {
               var10 = -1;
            }

            int var11 = var1.a(var2 - 1, var3, var6 == this.bM ? var4 - 1 : var4 + 1);
            int var12 = var1.a(var2 + 1, var3, var6 == this.bM ? var4 - 1 : var4 + 1);
            if (var5 == 4) {
               var10 = -1 - var10;
            }

            byte var13 = 5;
            if ((yy.m[var8] || yy.m[var11]) && !yy.m[var9] && !yy.m[var12]) {
               var13 = 5;
            }

            if ((yy.m[var9] || yy.m[var12]) && !yy.m[var8] && !yy.m[var11]) {
               var13 = 4;
            }

            return (var5 == var13 ? this.bL + 16 : this.bL + 32) + var10;
         } else {
            return this.bL;
         }
      }
   }

   public int b(int var1) {
      if (var1 == 1) {
         return this.bL - 1;
      } else if (var1 == 0) {
         return this.bL - 1;
      } else {
         return var1 == 3 ? this.bL + 1 : this.bL;
      }
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (var1.a(var2 - 1, var3, var4) == this.bM) {
         ++var5;
      }

      if (var1.a(var2 + 1, var3, var4) == this.bM) {
         ++var5;
      }

      if (var1.a(var2, var3, var4 - 1) == this.bM) {
         ++var5;
      }

      if (var1.a(var2, var3, var4 + 1) == this.bM) {
         ++var5;
      }

      if (var5 > 1) {
         return false;
      } else if (this.g(var1, var2 - 1, var3, var4)) {
         return false;
      } else if (this.g(var1, var2 + 1, var3, var4)) {
         return false;
      } else if (this.g(var1, var2, var3, var4 - 1)) {
         return false;
      } else {
         return !this.g(var1, var2, var3, var4 + 1);
      }
   }

   private boolean g(ry var1, int var2, int var3, int var4) {
      if (var1.a(var2, var3, var4) != this.bM) {
         return false;
      } else if (var1.a(var2 - 1, var3, var4) == this.bM) {
         return true;
      } else if (var1.a(var2 + 1, var3, var4) == this.bM) {
         return true;
      } else if (var1.a(var2, var3, var4 - 1) == this.bM) {
         return true;
      } else {
         return var1.a(var2, var3, var4 + 1) == this.bM;
      }
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      tu var6 = (tu)var1.b(var2, var3, var4);
      if (var6 != null) {
         var6.n();
      }

   }

   public void d(ry var1, int var2, int var3, int var4) {
      tu var5 = (tu)var1.b(var2, var3, var4);
      if (var5 != null) {
         for(int var6 = 0; var6 < var5.c(); ++var6) {
            dk var7 = var5.d(var6);
            if (var7 != null) {
               float var8 = this.a.nextFloat() * 0.8F + 0.1F;
               float var9 = this.a.nextFloat() * 0.8F + 0.1F;

               ih var12;
               for(float var10 = this.a.nextFloat() * 0.8F + 0.1F; var7.a > 0; var1.a((ia)var12)) {
                  int var11 = this.a.nextInt(21) + 10;
                  if (var11 > var7.a) {
                     var11 = var7.a;
                  }

                  var7.a -= var11;
                  var12 = new ih(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new dk(var7.c, var11, var7.i()));
                  float var13 = 0.05F;
                  var12.v = (double)((float)this.a.nextGaussian() * var13);
                  var12.w = (double)((float)this.a.nextGaussian() * var13 + 0.2F);
                  var12.x = (double)((float)this.a.nextGaussian() * var13);
                  if (var7.n()) {
                     var12.a.d((ik)var7.o().b());
                  }
               }
            }
         }
      }

      super.d(var1, var2, var3, var4);
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      Object var6 = (tu)var1.b(var2, var3, var4);
      if (var6 == null) {
         return true;
      } else if (var1.g(var2, var3 + 1, var4)) {
         return true;
      } else if (var1.a(var2 - 1, var3, var4) == this.bM && var1.g(var2 - 1, var3 + 1, var4)) {
         return true;
      } else if (var1.a(var2 + 1, var3, var4) == this.bM && var1.g(var2 + 1, var3 + 1, var4)) {
         return true;
      } else if (var1.a(var2, var3, var4 - 1) == this.bM && var1.g(var2, var3 + 1, var4 - 1)) {
         return true;
      } else if (var1.a(var2, var3, var4 + 1) == this.bM && var1.g(var2, var3 + 1, var4 + 1)) {
         return true;
      } else {
         if (var1.a(var2 - 1, var3, var4) == this.bM) {
            var6 = new adv("Large chest", (tu)var1.b(var2 - 1, var3, var4), (de)var6);
         }

         if (var1.a(var2 + 1, var3, var4) == this.bM) {
            var6 = new adv("Large chest", (de)var6, (tu)var1.b(var2 + 1, var3, var4));
         }

         if (var1.a(var2, var3, var4 - 1) == this.bM) {
            var6 = new adv("Large chest", (tu)var1.b(var2, var3, var4 - 1), (de)var6);
         }

         if (var1.a(var2, var3, var4 + 1) == this.bM) {
            var6 = new adv("Large chest", (de)var6, (tu)var1.b(var2, var3, var4 + 1));
         }

         if (var1.I) {
            return true;
         } else {
            var5.a((de)var6);
            return true;
         }
      }
   }

   public bq j_() {
      return new tu();
   }
}
