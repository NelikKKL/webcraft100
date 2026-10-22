package net.minecraft.client;

public class ha {
   private static int[] a = new int[65536];

   public static void a(int[] var0) {
      a = var0;
   }

   public static int a(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)(((double)1.0F - var0) * (double)255.0F);
      int var5 = (int)(((double)1.0F - var2) * (double)255.0F);
      return a[var5 << 8 | var4];
   }
}
