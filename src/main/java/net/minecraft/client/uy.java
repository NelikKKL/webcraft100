package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class uy extends xf {
   private int a = -1;
   private final boolean b;

   public uy(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
      this.b = var2.nextBoolean();
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public static uy a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, 0, 0, 0, 5, 6, 5, var5);
      return nk.a(var0, var7) != null ? null : new uy(var6, var1, var7, var5);
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a < 0) {
         this.a = this.b(var1, var3);
         if (this.a < 0) {
            return true;
         }

         this.e.a(0, this.a - this.e.e + 6 - 1, 0);
      }

      this.a(var1, var3, 0, 0, 0, 4, 0, 4, yy.w.bM, yy.w.bM, false);
      this.a(var1, var3, 0, 4, 0, 4, 4, 4, yy.J.bM, yy.J.bM, false);
      this.a(var1, var3, 1, 4, 1, 3, 4, 3, yy.x.bM, yy.x.bM, false);
      this.a(var1, yy.w.bM, 0, 0, 1, 0, var3);
      this.a(var1, yy.w.bM, 0, 0, 2, 0, var3);
      this.a(var1, yy.w.bM, 0, 0, 3, 0, var3);
      this.a(var1, yy.w.bM, 0, 4, 1, 0, var3);
      this.a(var1, yy.w.bM, 0, 4, 2, 0, var3);
      this.a(var1, yy.w.bM, 0, 4, 3, 0, var3);
      this.a(var1, yy.w.bM, 0, 0, 1, 4, var3);
      this.a(var1, yy.w.bM, 0, 0, 2, 4, var3);
      this.a(var1, yy.w.bM, 0, 0, 3, 4, var3);
      this.a(var1, yy.w.bM, 0, 4, 1, 4, var3);
      this.a(var1, yy.w.bM, 0, 4, 2, 4, var3);
      this.a(var1, yy.w.bM, 0, 4, 3, 4, var3);
      this.a(var1, var3, 0, 1, 1, 0, 3, 3, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 4, 1, 1, 4, 3, 3, yy.x.bM, yy.x.bM, false);
      this.a(var1, var3, 1, 1, 4, 3, 3, 4, yy.x.bM, yy.x.bM, false);
      this.a(var1, yy.bq.bM, 0, 0, 2, 2, var3);
      this.a(var1, yy.bq.bM, 0, 2, 2, 4, var3);
      this.a(var1, yy.bq.bM, 0, 4, 2, 2, var3);
      this.a(var1, yy.x.bM, 0, 1, 1, 0, var3);
      this.a(var1, yy.x.bM, 0, 1, 2, 0, var3);
      this.a(var1, yy.x.bM, 0, 1, 3, 0, var3);
      this.a(var1, yy.x.bM, 0, 2, 3, 0, var3);
      this.a(var1, yy.x.bM, 0, 3, 3, 0, var3);
      this.a(var1, yy.x.bM, 0, 3, 2, 0, var3);
      this.a(var1, yy.x.bM, 0, 3, 1, 0, var3);
      if (this.a(var1, 2, 0, -1, var3) == 0 && this.a(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, yy.aH.bM, this.c(yy.aH.bM, 3), 2, 0, -1, var3);
      }

      this.a(var1, var3, 1, 1, 1, 3, 3, 3, 0, 0, false);
      if (this.b) {
         this.a(var1, yy.aZ.bM, 0, 0, 5, 0, var3);
         this.a(var1, yy.aZ.bM, 0, 1, 5, 0, var3);
         this.a(var1, yy.aZ.bM, 0, 2, 5, 0, var3);
         this.a(var1, yy.aZ.bM, 0, 3, 5, 0, var3);
         this.a(var1, yy.aZ.bM, 0, 4, 5, 0, var3);
         this.a(var1, yy.aZ.bM, 0, 0, 5, 4, var3);
         this.a(var1, yy.aZ.bM, 0, 1, 5, 4, var3);
         this.a(var1, yy.aZ.bM, 0, 2, 5, 4, var3);
         this.a(var1, yy.aZ.bM, 0, 3, 5, 4, var3);
         this.a(var1, yy.aZ.bM, 0, 4, 5, 4, var3);
         this.a(var1, yy.aZ.bM, 0, 4, 5, 1, var3);
         this.a(var1, yy.aZ.bM, 0, 4, 5, 2, var3);
         this.a(var1, yy.aZ.bM, 0, 4, 5, 3, var3);
         this.a(var1, yy.aZ.bM, 0, 0, 5, 1, var3);
         this.a(var1, yy.aZ.bM, 0, 0, 5, 2, var3);
         this.a(var1, yy.aZ.bM, 0, 0, 5, 3, var3);
      }

      if (this.b) {
         int var4 = this.c(yy.aF.bM, 3);
         this.a(var1, yy.aF.bM, var4, 3, 1, 3, var3);
         this.a(var1, yy.aF.bM, var4, 3, 2, 3, var3);
         this.a(var1, yy.aF.bM, var4, 3, 3, 3, var3);
         this.a(var1, yy.aF.bM, var4, 3, 4, 3, var3);
      }

      this.a(var1, yy.aq.bM, 0, 2, 3, 1, var3);

      for(int var6 = 0; var6 < 5; ++var6) {
         for(int var5 = 0; var5 < 5; ++var5) {
            this.b(var1, var5, 6, var6, var3);
            this.b(var1, yy.w.bM, 0, var5, -1, var6, var3);
         }
      }

      this.a(var1, var3, 1, 1, 2, 1);
      return true;
   }
}
