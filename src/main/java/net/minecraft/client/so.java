package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class so extends os {
   private final mj a;

   public so(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.a = this.a(var2);
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
      this.a((aeh)var1, var2, var3, 1, 1);
   }

   public static so a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
      return a(var7) && nk.a(var0, var7) == null ? new so(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 10, 7, true, var2, tc.b());
         this.a(var1, var2, var3, this.a, 1, 7, 0);
         this.a(var1, var2, var3, mj.a, 1, 1, 7);
         int var4 = this.c(yy.aH.bM, 2);

         for(int var5 = 0; var5 < 6; ++var5) {
            this.a(var1, yy.aH.bM, var4, 1, 6 - var5, 1 + var5, var3);
            this.a(var1, yy.aH.bM, var4, 2, 6 - var5, 1 + var5, var3);
            this.a(var1, yy.aH.bM, var4, 3, 6 - var5, 1 + var5, var3);
            if (var5 < 5) {
               this.a(var1, yy.bm.bM, 0, 1, 5 - var5, 1 + var5, var3);
               this.a(var1, yy.bm.bM, 0, 2, 5 - var5, 1 + var5, var3);
               this.a(var1, yy.bm.bM, 0, 3, 5 - var5, 1 + var5, var3);
            }
         }

         return true;
      }
   }
}
