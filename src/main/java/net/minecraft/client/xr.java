package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class xr extends rh {
   public xr(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
      this.a((gc)var1, var2, var3, 5, 3, true);
   }

   public static xr a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -5, -3, 0, 13, 14, 13, var5);
      return a(var7) && nk.a(var0, var7) == null ? new xr(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      this.a(var1, var3, 0, 3, 0, 12, 4, 12, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 5, 0, 12, 13, 12, 0, 0, false);
      this.a(var1, var3, 0, 5, 0, 1, 12, 12, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 11, 5, 0, 12, 12, 12, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 2, 5, 11, 4, 12, 12, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 8, 5, 11, 10, 12, 12, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 5, 9, 11, 7, 12, 12, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 2, 5, 0, 4, 12, 1, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 8, 5, 0, 10, 12, 1, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 5, 9, 0, 7, 12, 1, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 2, 11, 2, 10, 12, 10, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 5, 8, 0, 7, 8, 0, yy.bB.bM, yy.bB.bM, false);

      for(int var4 = 1; var4 <= 11; var4 += 2) {
         this.a(var1, var3, var4, 10, 0, var4, 11, 0, yy.bB.bM, yy.bB.bM, false);
         this.a(var1, var3, var4, 10, 12, var4, 11, 12, yy.bB.bM, yy.bB.bM, false);
         this.a(var1, var3, 0, 10, var4, 0, 11, var4, yy.bB.bM, yy.bB.bM, false);
         this.a(var1, var3, 12, 10, var4, 12, 11, var4, yy.bB.bM, yy.bB.bM, false);
         this.a(var1, yy.bA.bM, 0, var4, 13, 0, var3);
         this.a(var1, yy.bA.bM, 0, var4, 13, 12, var3);
         this.a(var1, yy.bA.bM, 0, 0, 13, var4, var3);
         this.a(var1, yy.bA.bM, 0, 12, 13, var4, var3);
         this.a(var1, yy.bB.bM, 0, var4 + 1, 13, 0, var3);
         this.a(var1, yy.bB.bM, 0, var4 + 1, 13, 12, var3);
         this.a(var1, yy.bB.bM, 0, 0, 13, var4 + 1, var3);
         this.a(var1, yy.bB.bM, 0, 12, 13, var4 + 1, var3);
      }

      this.a(var1, yy.bB.bM, 0, 0, 13, 0, var3);
      this.a(var1, yy.bB.bM, 0, 0, 13, 12, var3);
      this.a(var1, yy.bB.bM, 0, 0, 13, 0, var3);
      this.a(var1, yy.bB.bM, 0, 12, 13, 0, var3);

      for(int var7 = 3; var7 <= 9; var7 += 2) {
         this.a(var1, var3, 1, 7, var7, 1, 8, var7, yy.bB.bM, yy.bB.bM, false);
         this.a(var1, var3, 11, 7, var7, 11, 8, var7, yy.bB.bM, yy.bB.bM, false);
      }

      this.a(var1, var3, 4, 2, 0, 8, 2, 12, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 2, 4, 12, 2, 8, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 4, 0, 0, 8, 1, 3, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 4, 0, 9, 8, 1, 12, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 0, 4, 3, 1, 8, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 9, 0, 4, 12, 1, 8, yy.bA.bM, yy.bA.bM, false);

      for(int var8 = 4; var8 <= 8; ++var8) {
         for(int var5 = 0; var5 <= 2; ++var5) {
            this.b(var1, yy.bA.bM, 0, var8, -1, var5, var3);
            this.b(var1, yy.bA.bM, 0, var8, -1, 12 - var5, var3);
         }
      }

      for(int var9 = 0; var9 <= 2; ++var9) {
         for(int var11 = 4; var11 <= 8; ++var11) {
            this.b(var1, yy.bA.bM, 0, var9, -1, var11, var3);
            this.b(var1, yy.bA.bM, 0, 12 - var9, -1, var11, var3);
         }
      }

      this.a(var1, var3, 5, 5, 5, 7, 5, 7, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 6, 1, 6, 6, 4, 6, 0, 0, false);
      this.a(var1, yy.bA.bM, 0, 6, 0, 6, var3);
      this.a(var1, yy.C.bM, 0, 6, 5, 6, var3);
      int var10 = this.a(6, 6);
      int var12 = this.b(5);
      int var6 = this.b(6, 6);
      if (var3.b(var10, var12, var6)) {
         var1.f = true;
         yy.k[yy.C.bM].a(var1, var10, var12, var6, var2);
         var1.f = false;
      }

      return true;
   }
}
