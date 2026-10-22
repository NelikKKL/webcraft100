package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class tf extends xf {
   private int a = -1;

   public tf(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public static tf a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, 0, 0, 0, 9, 7, 12, var5);
      return a(var7) && nk.a(var0, var7) == null ? new tf(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a < 0) {
         this.a = this.b(var1, var3);
         if (this.a < 0) {
            return true;
         }

         this.e.a(0, this.a - this.e.e + 7 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 7, 4, 4, 0, 0, false);
      this.a(var1, var3, 2, 1, 6, 8, 4, 10, 0, 0, false);
      this.a(var1, var3, 2, 0, 5, 8, 0, 10, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 1, 0, 1, 7, 0, 4, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 0, 0, 0, 0, 3, 5, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 8, 0, 0, 8, 3, 10, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 1, 0, 0, 7, 2, 0, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 1, 0, 5, 2, 1, 5, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 2, 0, 6, 2, 3, 10, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 3, 0, 10, 7, 3, 10, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 1, 2, 0, 7, 3, 0, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 1, 2, 5, 2, 3, 5, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 0, 4, 1, 8, 4, 1, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 0, 4, 4, 3, 4, 4, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 0, 5, 2, 8, 5, 3, yy.x.bM, yy.x.bM, false);
      this.a(var1, yy.x.bM, 0, 0, 4, 2, var3);
      this.a(var1, yy.x.bM, 0, 0, 4, 3, var3);
      this.a(var1, yy.x.bM, 0, 8, 4, 2, var3);
      this.a(var1, yy.x.bM, 0, 8, 4, 3, var3);
      this.a(var1, yy.x.bM, 0, 8, 4, 4, var3);
      int var4 = this.c(yy.at.bM, 3);
      int var5 = this.c(yy.at.bM, 2);

      for(int var6 = -1; var6 <= 2; ++var6) {
         for(int var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, yy.at.bM, var4, var7, 4 + var6, var6, var3);
            if ((var6 > -1 || var7 <= 1) && (var6 > 0 || var7 <= 3) && (var6 > 1 || var7 <= 4 || var7 >= 6)) {
               this.a(var1, yy.at.bM, var5, var7, 4 + var6, 5 - var6, var3);
            }
         }
      }

      this.a(var1, var3, 3, 4, 5, 3, 4, 10, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 7, 4, 2, 7, 4, 10, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 4, 5, 4, 4, 5, 10, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 6, 5, 4, 6, 5, 10, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 5, 6, 3, 5, 6, 10, yy.x.bM, yy.x.bM, false);
      int var10 = this.c(yy.at.bM, 0);

      for(int var11 = 4; var11 >= 1; --var11) {
         this.a(var1, yy.x.bM, 0, var11, 2 + var11, 7 - var11, var3);

         for(int var8 = 8 - var11; var8 <= 10; ++var8) {
            this.a(var1, yy.at.bM, var10, var11, 2 + var11, var8, var3);
         }
      }

      int var12 = this.c(yy.at.bM, 1);
      this.a(var1, yy.x.bM, 0, 6, 6, 3, var3);
      this.a(var1, yy.x.bM, 0, 7, 5, 4, var3);
      this.a(var1, yy.at.bM, var12, 6, 6, 4, var3);

      for(int var13 = 6; var13 <= 8; ++var13) {
         for(int var9 = 5; var9 <= 10; ++var9) {
            this.a(var1, yy.at.bM, var12, var13, 12 - var13, var9, var3);
         }
      }

      this.a(var1, yy.J.bM, 0, 0, 2, 1, var3);
      this.a(var1, yy.J.bM, 0, 0, 2, 4, var3);
      this.a(var1, yy.bq.bM, 0, 0, 2, 2, var3);
      this.a(var1, yy.bq.bM, 0, 0, 2, 3, var3);
      this.a(var1, yy.J.bM, 0, 4, 2, 0, var3);
      this.a(var1, yy.bq.bM, 0, 5, 2, 0, var3);
      this.a(var1, yy.J.bM, 0, 6, 2, 0, var3);
      this.a(var1, yy.J.bM, 0, 8, 2, 1, var3);
      this.a(var1, yy.bq.bM, 0, 8, 2, 2, var3);
      this.a(var1, yy.bq.bM, 0, 8, 2, 3, var3);
      this.a(var1, yy.J.bM, 0, 8, 2, 4, var3);
      this.a(var1, yy.x.bM, 0, 8, 2, 5, var3);
      this.a(var1, yy.J.bM, 0, 8, 2, 6, var3);
      this.a(var1, yy.bq.bM, 0, 8, 2, 7, var3);
      this.a(var1, yy.bq.bM, 0, 8, 2, 8, var3);
      this.a(var1, yy.J.bM, 0, 8, 2, 9, var3);
      this.a(var1, yy.J.bM, 0, 2, 2, 6, var3);
      this.a(var1, yy.bq.bM, 0, 2, 2, 7, var3);
      this.a(var1, yy.bq.bM, 0, 2, 2, 8, var3);
      this.a(var1, yy.J.bM, 0, 2, 2, 9, var3);
      this.a(var1, yy.J.bM, 0, 4, 4, 10, var3);
      this.a(var1, yy.bq.bM, 0, 5, 4, 10, var3);
      this.a(var1, yy.J.bM, 0, 6, 4, 10, var3);
      this.a(var1, yy.x.bM, 0, 5, 5, 10, var3);
      this.a(var1, 0, 0, 2, 1, 0, var3);
      this.a(var1, 0, 0, 2, 2, 0, var3);
      this.a(var1, yy.aq.bM, 0, 2, 3, 1, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.c(yy.aE.bM, 1));
      this.a(var1, var3, 1, 0, -1, 3, 2, -1, 0, 0, false);
      if (this.a(var1, 2, 0, -1, var3) == 0 && this.a(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, yy.aH.bM, this.c(yy.aH.bM, 3), 2, 0, -1, var3);
      }

      for(int var14 = 0; var14 < 5; ++var14) {
         for(int var16 = 0; var16 < 9; ++var16) {
            this.b(var1, var16, 7, var14, var3);
            this.b(var1, yy.w.bM, 0, var16, -1, var14, var3);
         }
      }

      for(int var15 = 5; var15 < 11; ++var15) {
         for(int var17 = 2; var17 < 9; ++var17) {
            this.b(var1, var17, 7, var15, var3);
            this.b(var1, yy.w.bM, 0, var17, -1, var15, var3);
         }
      }

      this.a(var1, var3, 4, 1, 2, 2);
      return true;
   }
}
