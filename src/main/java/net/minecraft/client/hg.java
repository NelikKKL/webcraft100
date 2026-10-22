package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class hg extends rh {
   public hg(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
      this.a((gc)var1, var2, var3, 1, 0, true);
   }

   public static hg a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      return a(var7) && nk.a(var0, var7) == null ? new hg(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      this.a(var1, var3, 0, 0, 0, 4, 1, 4, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 2, 0, 4, 5, 4, 0, 0, false);
      this.a(var1, var3, 0, 2, 0, 0, 5, 4, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 4, 2, 0, 4, 5, 4, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 3, 1, 0, 4, 1, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 0, 3, 3, 0, 4, 3, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 4, 3, 1, 4, 4, 1, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 4, 3, 3, 4, 4, 3, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 0, 6, 0, 4, 6, 4, yy.bA.bM, yy.bA.bM, false);

      for(int var4 = 0; var4 <= 4; ++var4) {
         for(int var5 = 0; var5 <= 4; ++var5) {
            this.b(var1, yy.bA.bM, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
