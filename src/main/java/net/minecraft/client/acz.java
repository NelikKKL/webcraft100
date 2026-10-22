package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class acz extends xf {
   private int a = -1;

   public acz(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public static acz a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, 0, 0, 0, 9, 7, 11, var5);
      return a(var7) && nk.a(var0, var7) == null ? new acz(var6, var1, var7, var5) : null;
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
      this.a(var1, var3, 2, 0, 6, 8, 0, 10, yy.v.bM, yy.v.bM, false);
      this.a(var1, yy.w.bM, 0, 6, 0, 6, var3);
      this.a(var1, var3, 2, 1, 6, 2, 1, 10, yy.aZ.bM, yy.aZ.bM, false);
      this.a(var1, var3, 8, 1, 6, 8, 1, 10, yy.aZ.bM, yy.aZ.bM, false);
      this.a(var1, var3, 3, 1, 10, 7, 1, 10, yy.aZ.bM, yy.aZ.bM, false);
      this.a(var1, var3, 1, 0, 1, 7, 0, 4, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 0, 0, 0, 0, 3, 5, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 8, 0, 0, 8, 3, 5, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 1, 0, 0, 7, 1, 0, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 1, 0, 5, 7, 1, 5, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 1, 2, 0, 7, 3, 0, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 1, 2, 5, 7, 3, 5, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 0, 4, 1, 8, 4, 1, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 0, 4, 4, 8, 4, 4, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 0, 5, 2, 8, 5, 3, yy.x.bM, yy.x.bM, false);
      this.a(var1, yy.x.bM, 0, 0, 4, 2, var3);
      this.a(var1, yy.x.bM, 0, 0, 4, 3, var3);
      this.a(var1, yy.x.bM, 0, 8, 4, 2, var3);
      this.a(var1, yy.x.bM, 0, 8, 4, 3, var3);
      int var4 = this.c(yy.at.bM, 3);
      int var5 = this.c(yy.at.bM, 2);

      for(int var6 = -1; var6 <= 2; ++var6) {
         for(int var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, yy.at.bM, var4, var7, 4 + var6, var6, var3);
            this.a(var1, yy.at.bM, var5, var7, 4 + var6, 5 - var6, var3);
         }
      }

      this.a(var1, yy.J.bM, 0, 0, 2, 1, var3);
      this.a(var1, yy.J.bM, 0, 0, 2, 4, var3);
      this.a(var1, yy.J.bM, 0, 8, 2, 1, var3);
      this.a(var1, yy.J.bM, 0, 8, 2, 4, var3);
      this.a(var1, yy.bq.bM, 0, 0, 2, 2, var3);
      this.a(var1, yy.bq.bM, 0, 0, 2, 3, var3);
      this.a(var1, yy.bq.bM, 0, 8, 2, 2, var3);
      this.a(var1, yy.bq.bM, 0, 8, 2, 3, var3);
      this.a(var1, yy.bq.bM, 0, 2, 2, 5, var3);
      this.a(var1, yy.bq.bM, 0, 3, 2, 5, var3);
      this.a(var1, yy.bq.bM, 0, 5, 2, 0, var3);
      this.a(var1, yy.bq.bM, 0, 6, 2, 5, var3);
      this.a(var1, yy.aZ.bM, 0, 2, 1, 3, var3);
      this.a(var1, yy.aM.bM, 0, 2, 2, 3, var3);
      this.a(var1, yy.x.bM, 0, 1, 1, 4, var3);
      this.a(var1, yy.at.bM, this.c(yy.at.bM, 3), 2, 1, 4, var3);
      this.a(var1, yy.at.bM, this.c(yy.at.bM, 1), 1, 1, 3, var3);
      this.a(var1, var3, 5, 0, 1, 7, 0, 3, yy.aj.bM, yy.aj.bM, false);
      this.a(var1, yy.aj.bM, 0, 6, 1, 1, var3);
      this.a(var1, yy.aj.bM, 0, 6, 1, 2, var3);
      this.a(var1, 0, 0, 2, 1, 0, var3);
      this.a(var1, 0, 0, 2, 2, 0, var3);
      this.a(var1, yy.aq.bM, 0, 2, 3, 1, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.c(yy.aE.bM, 1));
      if (this.a(var1, 2, 0, -1, var3) == 0 && this.a(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, yy.aH.bM, this.c(yy.aH.bM, 3), 2, 0, -1, var3);
      }

      this.a(var1, 0, 0, 6, 1, 5, var3);
      this.a(var1, 0, 0, 6, 2, 5, var3);
      this.a(var1, yy.aq.bM, 0, 6, 3, 4, var3);
      this.a(var1, var3, var2, 6, 1, 5, this.c(yy.aE.bM, 1));

      for(int var8 = 0; var8 < 5; ++var8) {
         for(int var9 = 0; var9 < 9; ++var9) {
            this.b(var1, var9, 7, var8, var3);
            this.b(var1, yy.w.bM, 0, var9, -1, var8, var3);
         }
      }

      this.a(var1, var3, 4, 1, 2, 2);
      return true;
   }

   protected int a(int var1) {
      return var1 == 0 ? 4 : 0;
   }
}
