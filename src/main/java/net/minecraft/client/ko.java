package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class ko extends xf {
   private int a = -1;

   public ko(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public static ko a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, 0, 0, 0, 10, 6, 7, var5);
      return a(var7) && nk.a(var0, var7) == null ? new ko(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a < 0) {
         this.a = this.b(var1, var3);
         if (this.a < 0) {
            return true;
         }

         this.e.a(0, this.a - this.e.e + 6 - 1, 0);
      }

      this.a(var1, var3, 0, 1, 0, 9, 4, 6, 0, 0, false);
      this.a(var1, var3, 0, 0, 0, 9, 0, 6, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 0, 4, 0, 9, 4, 6, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 0, 5, 0, 9, 5, 6, yy.ak.bM, yy.ak.bM, false);
      this.a(var1, var3, 1, 5, 1, 8, 5, 5, 0, 0, false);
      this.a(var1, var3, 1, 1, 0, 2, 3, 0, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 0, 1, 0, 0, 4, 0, yy.J.bM, yy.J.bM, false);
      this.a(var1, var3, 3, 1, 0, 3, 4, 0, yy.J.bM, yy.J.bM, false);
      this.a(var1, var3, 0, 1, 6, 0, 4, 6, yy.J.bM, yy.J.bM, false);
      this.a(var1, yy.x.bM, 0, 3, 3, 1, var3);
      this.a(var1, var3, 3, 1, 2, 3, 3, 2, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 4, 1, 3, 5, 3, 3, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 0, 1, 1, 0, 3, 5, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 1, 1, 6, 5, 3, 6, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 5, 1, 0, 5, 3, 0, yy.aZ.bM, yy.aZ.bM, false);
      this.a(var1, var3, 9, 1, 0, 9, 3, 0, yy.aZ.bM, yy.aZ.bM, false);
      this.a(var1, var3, 6, 1, 4, 9, 4, 6, yy.w.bM, yy.w.bM, false);
      this.a(var1, yy.C.bM, 0, 7, 1, 5, var3);
      this.a(var1, yy.C.bM, 0, 8, 1, 5, var3);
      this.a(var1, yy.bp.bM, 0, 9, 2, 5, var3);
      this.a(var1, yy.bp.bM, 0, 9, 2, 4, var3);
      this.a(var1, var3, 7, 2, 4, 8, 2, 5, 0, 0, false);
      this.a(var1, yy.w.bM, 0, 6, 1, 3, var3);
      this.a(var1, yy.aB.bM, 0, 6, 2, 3, var3);
      this.a(var1, yy.aB.bM, 0, 6, 3, 3, var3);
      this.a(var1, yy.aj.bM, 0, 8, 1, 1, var3);
      this.a(var1, yy.bq.bM, 0, 0, 2, 2, var3);
      this.a(var1, yy.bq.bM, 0, 0, 2, 4, var3);
      this.a(var1, yy.bq.bM, 0, 2, 2, 6, var3);
      this.a(var1, yy.bq.bM, 0, 4, 2, 6, var3);
      this.a(var1, yy.aZ.bM, 0, 2, 1, 4, var3);
      this.a(var1, yy.aM.bM, 0, 2, 2, 4, var3);
      this.a(var1, yy.x.bM, 0, 1, 1, 5, var3);
      this.a(var1, yy.at.bM, this.c(yy.at.bM, 3), 2, 1, 5, var3);
      this.a(var1, yy.at.bM, this.c(yy.at.bM, 1), 1, 1, 4, var3);

      for(int var4 = 6; var4 <= 8; ++var4) {
         if (this.a(var1, var4, 0, -1, var3) == 0 && this.a(var1, var4, -1, -1, var3) != 0) {
            this.a(var1, yy.aH.bM, this.c(yy.aH.bM, 3), var4, 0, -1, var3);
         }
      }

      for(int var6 = 0; var6 < 7; ++var6) {
         for(int var5 = 0; var5 < 10; ++var5) {
            this.b(var1, var5, 6, var6, var3);
            this.b(var1, yy.w.bM, 0, var5, -1, var6, var3);
         }
      }

      this.a(var1, var3, 7, 1, 1, 1);
      return true;
   }

   protected int a(int var1) {
      return 3;
   }
}
