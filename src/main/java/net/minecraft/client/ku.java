package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ku extends bg {
   private boolean a = false;
   private static List cb = new ArrayList();

   public int a(int var1, int var2) {
      return var1 == 1 ? yy.av.a(var1, var2) : super.a(var1, var2);
   }

   private boolean a(ry var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         cb.add(new lf(var2, var3, var4, var1.u()));
      }

      int var6 = 0;

      for(int var7 = 0; var7 < cb.size(); ++var7) {
         lf var8 = (lf)cb.get(var7);
         if (var8.a == var2 && var8.b == var3 && var8.c == var4) {
            ++var6;
            if (var6 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   protected ku(int var1, int var2, boolean var3) {
      super(var1, var2);
      this.a = var3;
      this.b(true);
   }

   public int d() {
      return 2;
   }

   public void a(ry var1, int var2, int var3, int var4) {
      if (var1.d(var2, var3, var4) == 0) {
         super.a(var1, var2, var3, var4);
      }

      if (this.a) {
         var1.j(var2, var3 - 1, var4, this.bM);
         var1.j(var2, var3 + 1, var4, this.bM);
         var1.j(var2 - 1, var3, var4, this.bM);
         var1.j(var2 + 1, var3, var4, this.bM);
         var1.j(var2, var3, var4 - 1, this.bM);
         var1.j(var2, var3, var4 + 1, this.bM);
      }

   }

   public void d(ry var1, int var2, int var3, int var4) {
      if (this.a) {
         var1.j(var2, var3 - 1, var4, this.bM);
         var1.j(var2, var3 + 1, var4, this.bM);
         var1.j(var2 - 1, var3, var4, this.bM);
         var1.j(var2 + 1, var3, var4, this.bM);
         var1.j(var2, var3, var4 - 1, this.bM);
         var1.j(var2, var3, var4 + 1, this.bM);
      }

   }

   public boolean b(kq var1, int var2, int var3, int var4, int var5) {
      if (!this.a) {
         return false;
      } else {
         int var6 = var1.d(var2, var3, var4);
         if (var6 == 5 && var5 == 1) {
            return false;
         } else if (var6 == 3 && var5 == 3) {
            return false;
         } else if (var6 == 4 && var5 == 2) {
            return false;
         } else if (var6 == 1 && var5 == 5) {
            return false;
         } else {
            return var6 != 2 || var5 != 4;
         }
      }
   }

   private boolean g(ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      if (var5 == 5 && var1.l(var2, var3 - 1, var4, 0)) {
         return true;
      } else if (var5 == 3 && var1.l(var2, var3, var4 - 1, 2)) {
         return true;
      } else if (var5 == 4 && var1.l(var2, var3, var4 + 1, 3)) {
         return true;
      } else if (var5 == 1 && var1.l(var2 - 1, var3, var4, 4)) {
         return true;
      } else {
         return var5 == 2 && var1.l(var2 + 1, var3, var4, 5);
      }
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      boolean var6 = this.g(var1, var2, var3, var4);

      while(cb.size() > 0 && var1.u() - ((lf)cb.get(0)).d > 100L) {
         cb.remove(0);
      }

      if (this.a) {
         if (var6) {
            var1.d(var2, var3, var4, yy.aP.bM, var1.d(var2, var3, var4));
            if (this.a(var1, var2, var3, var4, true)) {
               var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.w.nextFloat() - var1.w.nextFloat()) * 0.8F);

               for(int var7 = 0; var7 < 5; ++var7) {
                  double var8 = (double)var2 + var5.nextDouble() * 0.6 + 0.2;
                  double var10 = (double)var3 + var5.nextDouble() * 0.6 + 0.2;
                  double var12 = (double)var4 + var5.nextDouble() * 0.6 + 0.2;
                  var1.a("smoke", var8, var10, var12, (double)0.0F, (double)0.0F, (double)0.0F);
               }
            }
         }
      } else if (!var6 && !this.a(var1, var2, var3, var4, false)) {
         var1.d(var2, var3, var4, yy.aQ.bM, var1.d(var2, var3, var4));
      }

   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      var1.a(var2, var3, var4, this.bM, this.d());
   }

   public boolean c(ry var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 ? this.b((kq)var1, var2, var3, var4, var5) : false;
   }

   public int a(int var1, Random var2, int var3) {
      return yy.aQ.bM;
   }

   public boolean g() {
      return true;
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      if (this.a) {
         int var6 = var1.d(var2, var3, var4);
         double var7 = (double)((float)var2 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2;
         double var9 = (double)((float)var3 + 0.7F) + (double)(var5.nextFloat() - 0.5F) * 0.2;
         double var11 = (double)((float)var4 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2;
         double var13 = (double)0.22F;
         double var15 = (double)0.27F;
         if (var6 == 1) {
            var1.a("reddust", var7 - var15, var9 + var13, var11, (double)0.0F, (double)0.0F, (double)0.0F);
         } else if (var6 == 2) {
            var1.a("reddust", var7 + var15, var9 + var13, var11, (double)0.0F, (double)0.0F, (double)0.0F);
         } else if (var6 == 3) {
            var1.a("reddust", var7, var9 + var13, var11 - var15, (double)0.0F, (double)0.0F, (double)0.0F);
         } else if (var6 == 4) {
            var1.a("reddust", var7, var9 + var13, var11 + var15, (double)0.0F, (double)0.0F, (double)0.0F);
         } else {
            var1.a("reddust", var7, var9, var11, (double)0.0F, (double)0.0F, (double)0.0F);
         }

      }
   }
}
