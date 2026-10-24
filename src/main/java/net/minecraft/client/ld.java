package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class ld extends rh {
   private int a;

   public ld(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
      this.a = var2.nextInt();
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public static ld a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      return a(var7) && nk.a(var0, var7) == null ? new ld(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      Random var4 = new net.minecraft.client.web.JRandom((long)this.a);

      for(int var5 = 0; var5 <= 4; ++var5) {
         for(int var6 = 3; var6 <= 4; ++var6) {
            int var7 = var4.nextInt(8);
            this.a(var1, var3, var5, var6, 0, var5, var6, var7, yy.bA.bM, yy.bA.bM, false);
         }
      }

      int var8 = var4.nextInt(8);
      this.a(var1, var3, 0, 5, 0, 0, 5, var8, yy.bA.bM, yy.bA.bM, false);
      var8 = var4.nextInt(8);
      this.a(var1, var3, 4, 5, 0, 4, 5, var8, yy.bA.bM, yy.bA.bM, false);

      for(int var10 = 0; var10 <= 4; ++var10) {
         int var12 = var4.nextInt(5);
         this.a(var1, var3, var10, 2, 0, var10, 2, var12, yy.bA.bM, yy.bA.bM, false);
      }

      for(int var11 = 0; var11 <= 4; ++var11) {
         for(int var13 = 0; var13 <= 1; ++var13) {
            int var14 = var4.nextInt(3);
            this.a(var1, var3, var11, var13, 0, var11, var13, var14, yy.bA.bM, yy.bA.bM, false);
         }
      }

      return true;
   }
}
