package net.minecraft.client;

public class rk extends jx {
   private jx b;
   private int c;

   public rk(jx var1, jx var2, int var3) {
      super(0L);
      this.a = var2;
      this.b = var1;
      this.c = var3;
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.a.a(var1, var2, var3, var4);
      int[] var6 = this.b.a(var1, var2, var3, var4);
      int[] var7 = bm.a(var3 * var4);

      for(int var8 = 0; var8 < var3 * var4; ++var8) {
         var7[var8] = var6[var8] + (sr.a[var5[var8]].f() - var6[var8]) / (this.c * 2 + 1);
      }

      return var7;
   }
}
