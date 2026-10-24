package net.minecraft.client;

import java.util.Random;

public class bz {
   protected int a = 8;
   protected Random b = new net.minecraft.client.web.JRandom();
   protected ry c;

   public void a(ej var1, ry var2, int var3, int var4, byte[] var5) {
      int var6 = this.a;
      this.c = var2;
      this.b.setSeed(var2.t());
      long var7 = this.b.nextLong();
      long var9 = this.b.nextLong();

      for(int var11 = var3 - var6; var11 <= var3 + var6; ++var11) {
         for(int var12 = var4 - var6; var12 <= var4 + var6; ++var12) {
            long var13 = (long)var11 * var7;
            long var15 = (long)var12 * var9;
            this.b.setSeed(var13 ^ var15 ^ var2.t());
            this.a(var2, var11, var12, var3, var4, var5);
         }
      }

   }

   protected void a(ry var1, int var2, int var3, int var4, int var5, byte[] var6) {
   }
}
