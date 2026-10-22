package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class abj extends xf {
   private int a = -1;

   public abj(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public static nl a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      nl var6 = nl.a(var2, var3, var4, 0, 0, 0, 3, 4, 2, var5);
      return nk.a(var0, var6) != null ? null : var6;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a < 0) {
         this.a = this.b(var1, var3);
         if (this.a < 0) {
            return true;
         }

         this.e.a(0, this.a - this.e.e + 4 - 1, 0);
      }

      this.a(var1, var3, 0, 0, 0, 2, 3, 1, 0, 0, false);
      this.a(var1, yy.aZ.bM, 0, 1, 0, 0, var3);
      this.a(var1, yy.aZ.bM, 0, 1, 1, 0, var3);
      this.a(var1, yy.aZ.bM, 0, 1, 2, 0, var3);
      this.a(var1, yy.ab.bM, 15, 1, 3, 0, var3);
      this.a(var1, yy.aq.bM, 15, 0, 3, 0, var3);
      this.a(var1, yy.aq.bM, 15, 1, 3, 1, var3);
      this.a(var1, yy.aq.bM, 15, 2, 3, 0, var3);
      this.a(var1, yy.aq.bM, 15, 1, 3, -1, var3);
      return true;
   }
}
