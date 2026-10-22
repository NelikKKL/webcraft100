package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class uz extends xf {
   private int a = -1;

   public uz(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public static uz a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, 0, 0, 0, 5, 12, 9, var5);
      return a(var7) && nk.a(var0, var7) == null ? new uz(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a < 0) {
         this.a = this.b(var1, var3);
         if (this.a < 0) {
            return true;
         }

         this.e.a(0, this.a - this.e.e + 12 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 3, 3, 7, 0, 0, false);
      this.a(var1, var3, 1, 5, 1, 3, 9, 3, 0, 0, false);
      this.a(var1, var3, 1, 0, 0, 3, 0, 8, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 1, 1, 0, 3, 10, 0, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 0, 1, 1, 0, 10, 3, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 4, 1, 1, 4, 10, 3, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 0, 0, 4, 0, 4, 7, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 4, 0, 4, 4, 4, 7, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 1, 1, 8, 3, 4, 8, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 1, 5, 4, 3, 10, 4, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 1, 5, 5, 3, 5, 7, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 0, 9, 0, 4, 9, 4, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 0, 4, 0, 4, 4, 4, yy.w.bM, yy.w.bM, false);
      this.a(var1, yy.w.bM, 0, 0, 11, 2, var3);
      this.a(var1, yy.w.bM, 0, 4, 11, 2, var3);
      this.a(var1, yy.w.bM, 0, 2, 11, 0, var3);
      this.a(var1, yy.w.bM, 0, 2, 11, 4, var3);
      this.a(var1, yy.w.bM, 0, 1, 1, 6, var3);
      this.a(var1, yy.w.bM, 0, 1, 1, 7, var3);
      this.a(var1, yy.w.bM, 0, 2, 1, 7, var3);
      this.a(var1, yy.w.bM, 0, 3, 1, 6, var3);
      this.a(var1, yy.w.bM, 0, 3, 1, 7, var3);
      this.a(var1, yy.aH.bM, this.c(yy.aH.bM, 3), 1, 1, 5, var3);
      this.a(var1, yy.aH.bM, this.c(yy.aH.bM, 3), 2, 1, 6, var3);
      this.a(var1, yy.aH.bM, this.c(yy.aH.bM, 3), 3, 1, 5, var3);
      this.a(var1, yy.aH.bM, this.c(yy.aH.bM, 1), 1, 2, 7, var3);
      this.a(var1, yy.aH.bM, this.c(yy.aH.bM, 0), 3, 2, 7, var3);
      this.a(var1, yy.bq.bM, 0, 0, 2, 2, var3);
      this.a(var1, yy.bq.bM, 0, 0, 3, 2, var3);
      this.a(var1, yy.bq.bM, 0, 4, 2, 2, var3);
      this.a(var1, yy.bq.bM, 0, 4, 3, 2, var3);
      this.a(var1, yy.bq.bM, 0, 0, 6, 2, var3);
      this.a(var1, yy.bq.bM, 0, 0, 7, 2, var3);
      this.a(var1, yy.bq.bM, 0, 4, 6, 2, var3);
      this.a(var1, yy.bq.bM, 0, 4, 7, 2, var3);
      this.a(var1, yy.bq.bM, 0, 2, 6, 0, var3);
      this.a(var1, yy.bq.bM, 0, 2, 7, 0, var3);
      this.a(var1, yy.bq.bM, 0, 2, 6, 4, var3);
      this.a(var1, yy.bq.bM, 0, 2, 7, 4, var3);
      this.a(var1, yy.bq.bM, 0, 0, 3, 6, var3);
      this.a(var1, yy.bq.bM, 0, 4, 3, 6, var3);
      this.a(var1, yy.bq.bM, 0, 2, 3, 8, var3);
      this.a(var1, yy.aq.bM, 0, 2, 4, 7, var3);
      this.a(var1, yy.aq.bM, 0, 1, 4, 6, var3);
      this.a(var1, yy.aq.bM, 0, 3, 4, 6, var3);
      this.a(var1, yy.aq.bM, 0, 2, 4, 5, var3);
      int var4 = this.c(yy.aF.bM, 4);

      for(int var5 = 1; var5 <= 9; ++var5) {
         this.a(var1, yy.aF.bM, var4, 3, var5, 3, var3);
      }

      this.a(var1, 0, 0, 2, 1, 0, var3);
      this.a(var1, 0, 0, 2, 2, 0, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.c(yy.aE.bM, 1));
      if (this.a(var1, 2, 0, -1, var3) == 0 && this.a(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, yy.aH.bM, this.c(yy.aH.bM, 3), 2, 0, -1, var3);
      }

      for(int var7 = 0; var7 < 9; ++var7) {
         for(int var6 = 0; var6 < 5; ++var6) {
            this.b(var1, var6, 12, var7, var3);
            this.b(var1, yy.w.bM, 0, var6, -1, var7, var3);
         }
      }

      this.a(var1, var3, 2, 1, 2, 1);
      return true;
   }

   protected int a(int var1) {
      return 2;
   }
}
