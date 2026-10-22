package net.minecraft.client;

public class afc extends jx {
   public afc(jx var1) {
      super(0L);
      this.a = var1;
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.a.a(var1, var2, var3, var4);
      int[] var6 = bm.a(var3 * var4);

      for(int var7 = 0; var7 < var3 * var4; ++var7) {
         var6[var7] = sr.a[var5[var7]].f();
      }

      return var6;
   }
}
