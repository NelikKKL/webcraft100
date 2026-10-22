package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class aba extends nk {
   private final boolean a;
   private final boolean b;
   private boolean c;
   private int d;

   public aba(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
      this.a = var2.nextInt(3) == 0;
      this.b = !this.a && var2.nextInt(23) == 0;
      if (this.f != 2 && this.f != 0) {
         this.d = var3.b() / 5;
      } else {
         this.d = var3.d() / 5;
      }

   }

   public static nl a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      nl var6 = new nl(var2, var3, var4, var2, var3 + 2, var4);

      int var7;
      for(var7 = var1.nextInt(3) + 2; var7 > 0; --var7) {
         int var8 = var7 * 5;
         switch (var5) {
            case 0:
               var6.d = var2 + 2;
               var6.f = var4 + (var8 - 1);
               break;
            case 1:
               var6.a = var2 - (var8 - 1);
               var6.f = var4 + 2;
               break;
            case 2:
               var6.d = var2 + 2;
               var6.c = var4 - (var8 - 1);
               break;
            case 3:
               var6.d = var2 + (var8 - 1);
               var6.f = var4 + 2;
         }

         if (nk.a(var0, var6) == null) {
            break;
         }
      }

      return var7 > 0 ? var6 : null;
   }

   public void a(nk var1, List var2, Random var3) {
      int var4 = this.b();
      int var5 = var3.nextInt(4);
      switch (this.f) {
         case 0:
            if (var5 <= 1) {
               aez.a(var1, var2, var3, this.e.a, this.e.b - 1 + var3.nextInt(3), this.e.f + 1, this.f, var4);
            } else if (var5 == 2) {
               aez.a(var1, var2, var3, this.e.a - 1, this.e.b - 1 + var3.nextInt(3), this.e.f - 3, 1, var4);
            } else {
               aez.a(var1, var2, var3, this.e.d + 1, this.e.b - 1 + var3.nextInt(3), this.e.f - 3, 3, var4);
            }
            break;
         case 1:
            if (var5 <= 1) {
               aez.a(var1, var2, var3, this.e.a - 1, this.e.b - 1 + var3.nextInt(3), this.e.c, this.f, var4);
            } else if (var5 == 2) {
               aez.a(var1, var2, var3, this.e.a, this.e.b - 1 + var3.nextInt(3), this.e.c - 1, 2, var4);
            } else {
               aez.a(var1, var2, var3, this.e.a, this.e.b - 1 + var3.nextInt(3), this.e.f + 1, 0, var4);
            }
            break;
         case 2:
            if (var5 <= 1) {
               aez.a(var1, var2, var3, this.e.a, this.e.b - 1 + var3.nextInt(3), this.e.c - 1, this.f, var4);
            } else if (var5 == 2) {
               aez.a(var1, var2, var3, this.e.a - 1, this.e.b - 1 + var3.nextInt(3), this.e.c, 1, var4);
            } else {
               aez.a(var1, var2, var3, this.e.d + 1, this.e.b - 1 + var3.nextInt(3), this.e.c, 3, var4);
            }
            break;
         case 3:
            if (var5 <= 1) {
               aez.a(var1, var2, var3, this.e.d + 1, this.e.b - 1 + var3.nextInt(3), this.e.c, this.f, var4);
            } else if (var5 == 2) {
               aez.a(var1, var2, var3, this.e.d - 3, this.e.b - 1 + var3.nextInt(3), this.e.c - 1, 2, var4);
            } else {
               aez.a(var1, var2, var3, this.e.d - 3, this.e.b - 1 + var3.nextInt(3), this.e.f + 1, 0, var4);
            }
      }

      if (var4 < 8) {
         if (this.f != 2 && this.f != 0) {
            for(int var8 = this.e.a + 3; var8 + 3 <= this.e.d; var8 += 5) {
               int var9 = var3.nextInt(5);
               if (var9 == 0) {
                  aez.a(var1, var2, var3, var8, this.e.b, this.e.c - 1, 2, var4 + 1);
               } else if (var9 == 1) {
                  aez.a(var1, var2, var3, var8, this.e.b, this.e.f + 1, 0, var4 + 1);
               }
            }
         } else {
            for(int var6 = this.e.c + 3; var6 + 3 <= this.e.f; var6 += 5) {
               int var7 = var3.nextInt(5);
               if (var7 == 0) {
                  aez.a(var1, var2, var3, this.e.a - 1, this.e.b, var6, 1, var4 + 1);
               } else if (var7 == 1) {
                  aez.a(var1, var2, var3, this.e.d + 1, this.e.b, var6, 3, var4 + 1);
               }
            }
         }
      }

   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         int var8 = this.d * 5 - 1;
         this.a(var1, var3, 0, 0, 0, 2, 1, var8, 0, 0, false);
         this.a(var1, var3, var2, 0.8F, 0, 2, 0, 2, 2, var8, 0, 0, false);
         if (this.b) {
            this.a(var1, var3, var2, 0.6F, 0, 0, 0, 2, 1, var8, yy.W.bM, 0, false);
         }

         for(int var9 = 0; var9 < this.d; ++var9) {
            int var10 = 2 + var9 * 5;
            this.a(var1, var3, 0, 0, var10, 0, 1, var10, yy.aZ.bM, 0, false);
            this.a(var1, var3, 2, 0, var10, 2, 1, var10, yy.aZ.bM, 0, false);
            if (var2.nextInt(4) != 0) {
               this.a(var1, var3, 0, 2, var10, 2, 2, var10, yy.x.bM, 0, false);
            } else {
               this.a(var1, var3, 0, 2, var10, 0, 2, var10, yy.x.bM, 0, false);
               this.a(var1, var3, 2, 2, var10, 2, 2, var10, yy.x.bM, 0, false);
            }

            this.a(var1, var3, var2, 0.1F, 0, 2, var10 - 1, yy.W.bM, 0);
            this.a(var1, var3, var2, 0.1F, 2, 2, var10 - 1, yy.W.bM, 0);
            this.a(var1, var3, var2, 0.1F, 0, 2, var10 + 1, yy.W.bM, 0);
            this.a(var1, var3, var2, 0.1F, 2, 2, var10 + 1, yy.W.bM, 0);
            this.a(var1, var3, var2, 0.05F, 0, 2, var10 - 2, yy.W.bM, 0);
            this.a(var1, var3, var2, 0.05F, 2, 2, var10 - 2, yy.W.bM, 0);
            this.a(var1, var3, var2, 0.05F, 0, 2, var10 + 2, yy.W.bM, 0);
            this.a(var1, var3, var2, 0.05F, 2, 2, var10 + 2, yy.W.bM, 0);
            this.a(var1, var3, var2, 0.05F, 1, 2, var10 - 1, yy.aq.bM, 0);
            this.a(var1, var3, var2, 0.05F, 1, 2, var10 + 1, yy.aq.bM, 0);
            if (var2.nextInt(100) == 0) {
               this.a(var1, var3, var2, 2, 0, var10 - 1, aez.a(), 3 + var2.nextInt(4));
            }

            if (var2.nextInt(100) == 0) {
               this.a(var1, var3, var2, 0, 0, var10 + 1, aez.a(), 3 + var2.nextInt(4));
            }

            if (this.b && !this.c) {
               int var11 = this.b(0);
               int var12 = var10 - 1 + var2.nextInt(3);
               int var13 = this.a(1, var12);
               var12 = this.b(1, var12);
               if (var3.b(var13, var11, var12)) {
                  this.c = true;
                  var1.g(var13, var11, var12, yy.as.bM);
                  ze var14 = (ze)var1.b(var13, var11, var12);
                  if (var14 != null) {
                     var14.a("CaveSpider");
                  }
               }
            }
         }

         if (this.a) {
            for(int var15 = 0; var15 <= var8; ++var15) {
               int var16 = this.a(var1, 1, -1, var15, var3);
               if (var16 > 0 && yy.m[var16]) {
                  this.a(var1, var3, var2, 0.7F, 1, 0, var15, yy.aG.bM, this.c(yy.aG.bM, 0));
               }
            }
         }

         return true;
      }
   }
}
