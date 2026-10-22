package net.minecraft.client;

public enum nu {
   a(0, 59, 2.0F, 0, 15),
   b(1, 131, 4.0F, 1, 5),
   c(2, 250, 6.0F, 2, 14),
   d(3, 1561, 8.0F, 3, 10),
   e(0, 32, 12.0F, 0, 22);

   private final int f;
   private final int g;
   private final float h;
   private final int i;
   private final int j;

   private nu(int var3, int var4, float var5, int var6, int var7) {
      this.f = var3;
      this.g = var4;
      this.h = var5;
      this.i = var6;
      this.j = var7;
   }

   public int a() {
      return this.g;
   }

   public float b() {
      return this.h;
   }

   public int c() {
      return this.i;
   }

   public int d() {
      return this.f;
   }

   public int e() {
      return this.j;
   }
}
