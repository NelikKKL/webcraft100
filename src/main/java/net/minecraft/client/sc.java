package net.minecraft.client;

import java.util.Random;

public class sc extends aaf {
   public sc(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.A, false);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return null;
   }

   public void b(kq var1, int var2, int var3, int var4) {
      if (var1.a(var2 - 1, var3, var4) != this.bM && var1.a(var2 + 1, var3, var4) != this.bM) {
         float var7 = 0.125F;
         float var8 = 0.5F;
         this.a(0.5F - var7, 0.0F, 0.5F - var8, 0.5F + var7, 1.0F, 0.5F + var8);
      } else {
         float var5 = 0.5F;
         float var6 = 0.125F;
         this.a(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
      }

   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean g(ry var1, int var2, int var3, int var4) {
      byte var5 = 0;
      byte var6 = 0;
      if (var1.a(var2 - 1, var3, var4) == yy.ap.bM || var1.a(var2 + 1, var3, var4) == yy.ap.bM) {
         var5 = 1;
      }

      if (var1.a(var2, var3, var4 - 1) == yy.ap.bM || var1.a(var2, var3, var4 + 1) == yy.ap.bM) {
         var6 = 1;
      }

      if (var5 == var6) {
         return false;
      } else {
         if (var1.a(var2 - var5, var3, var4 - var6) == 0) {
            var2 -= var5;
            var4 -= var6;
         }

         for(int var7 = -1; var7 <= 2; ++var7) {
            for(int var8 = -1; var8 <= 3; ++var8) {
               boolean var9 = var7 == -1 || var7 == 2 || var8 == -1 || var8 == 3;
               if (var7 != -1 && var7 != 2 || var8 != -1 && var8 != 3) {
                  int var10 = var1.a(var2 + var5 * var7, var3 + var8, var4 + var6 * var7);
                  if (var9) {
                     if (var10 != yy.ap.bM) {
                        return false;
                     }
                  } else if (var10 != 0 && var10 != yy.ar.bM) {
                     return false;
                  }
               }
            }
         }

         var1.t = true;

         for(int var11 = 0; var11 < 2; ++var11) {
            for(int var12 = 0; var12 < 3; ++var12) {
               var1.g(var2 + var5 * var11, var3 + var12, var4 + var6 * var11, yy.be.bM);
            }
         }

         var1.t = false;
         return true;
      }
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      byte var7 = 1;
      if (var1.a(var2 - 1, var3, var4) == this.bM || var1.a(var2 + 1, var3, var4) == this.bM) {
         var6 = 1;
         var7 = 0;
      }

      int var8;
      for(var8 = var3; var1.a(var2, var8 - 1, var4) == this.bM; --var8) {
      }

      if (var1.a(var2, var8 - 1, var4) != yy.ap.bM) {
         var1.g(var2, var3, var4, 0);
      } else {
         int var9;
         for(var9 = 1; var9 < 4 && var1.a(var2, var8 + var9, var4) == this.bM; ++var9) {
         }

         if (var9 == 3 && var1.a(var2, var8 + var9, var4) == yy.ap.bM) {
            boolean var10 = var1.a(var2 - 1, var3, var4) == this.bM || var1.a(var2 + 1, var3, var4) == this.bM;
            boolean var11 = var1.a(var2, var3, var4 - 1) == this.bM || var1.a(var2, var3, var4 + 1) == this.bM;
            if (var10 && var11) {
               var1.g(var2, var3, var4, 0);
            } else if ((var1.a(var2 + var6, var3, var4 + var7) != yy.ap.bM || var1.a(var2 - var6, var3, var4 - var7) != this.bM) && (var1.a(var2 - var6, var3, var4 - var7) != yy.ap.bM || var1.a(var2 + var6, var3, var4 + var7) != this.bM)) {
               var1.g(var2, var3, var4, 0);
            }
         } else {
            var1.g(var2, var3, var4, 0);
         }
      }
   }

   public boolean a_(kq var1, int var2, int var3, int var4, int var5) {
      if (var1.a(var2, var3, var4) == this.bM) {
         return false;
      } else {
         boolean var6 = var1.a(var2 - 1, var3, var4) == this.bM && var1.a(var2 - 2, var3, var4) != this.bM;
         boolean var7 = var1.a(var2 + 1, var3, var4) == this.bM && var1.a(var2 + 2, var3, var4) != this.bM;
         boolean var8 = var1.a(var2, var3, var4 - 1) == this.bM && var1.a(var2, var3, var4 - 2) != this.bM;
         boolean var9 = var1.a(var2, var3, var4 + 1) == this.bM && var1.a(var2, var3, var4 + 2) != this.bM;
         boolean var10 = var6 || var7;
         boolean var11 = var8 || var9;
         if (var10 && var5 == 4) {
            return true;
         } else if (var10 && var5 == 5) {
            return true;
         } else if (var11 && var5 == 2) {
            return true;
         } else {
            return var11 && var5 == 3;
         }
      }
   }

   public int a(Random var1) {
      return 0;
   }

   public int h() {
      return 1;
   }

   public void a(ry var1, int var2, int var3, int var4, ia var5) {
      if (var5.n == null && var5.m == null) {
         var5.S();
      }

   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(100) == 0) {
         var1.a((double)var2 + (double)0.5F, (double)var3 + (double)0.5F, (double)var4 + (double)0.5F, "portal.portal", 0.5F, var5.nextFloat() * 0.4F + 0.8F);
      }

      for(int var6 = 0; var6 < 4; ++var6) {
         double var7 = (double)((float)var2 + var5.nextFloat());
         double var9 = (double)((float)var3 + var5.nextFloat());
         double var11 = (double)((float)var4 + var5.nextFloat());
         double var13 = (double)0.0F;
         double var15 = (double)0.0F;
         double var17 = (double)0.0F;
         int var19 = var5.nextInt(2) * 2 - 1;
         var13 = ((double)var5.nextFloat() - (double)0.5F) * (double)0.5F;
         var15 = ((double)var5.nextFloat() - (double)0.5F) * (double)0.5F;
         var17 = ((double)var5.nextFloat() - (double)0.5F) * (double)0.5F;
         if (var1.a(var2 - 1, var3, var4) != this.bM && var1.a(var2 + 1, var3, var4) != this.bM) {
            var7 = (double)var2 + (double)0.5F + (double)0.25F * (double)var19;
            var13 = (double)(var5.nextFloat() * 2.0F * (float)var19);
         } else {
            var11 = (double)var4 + (double)0.5F + (double)0.25F * (double)var19;
            var17 = (double)(var5.nextFloat() * 2.0F * (float)var19);
         }

         var1.a("portal", var7, var9, var11, var13, var15, var17);
      }

   }
}
