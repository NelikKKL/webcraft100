package net.minecraft.client;

public enum dj {
   a(5, new int[]{1, 3, 2, 1}, 15),
   b(15, new int[]{2, 5, 4, 1}, 12),
   c(15, new int[]{2, 6, 5, 2}, 9),
   d(7, new int[]{2, 5, 3, 1}, 25),
   e(33, new int[]{3, 8, 6, 3}, 10);

   private int f;
   private int[] g;
   private int h;

   private dj(int var3, int[] var4, int var5) {
      this.f = var3;
      this.g = var4;
      this.h = var5;
   }

   public int a(int var1) {
      return agi.o()[var1] * this.f;
   }

   public int b(int var1) {
      return this.g[var1];
   }

   public int a() {
      return this.h;
   }
}
