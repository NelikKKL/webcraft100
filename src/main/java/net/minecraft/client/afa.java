package net.minecraft.client;

public class afa extends jx {
   private sr[] b;

   public afa(long var1, jx var3) {
      super(var1);
      this.b = new sr[]{sr.d, sr.f, sr.e, sr.h, sr.c, sr.g};
      this.a = var3;
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.a.a(var1, var2, var3, var4);
      int[] var6 = bm.a(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.a((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + var7 * var3];
            if (var9 == 0) {
               var6[var8 + var7 * var3] = 0;
            } else if (var9 == sr.p.F) {
               var6[var8 + var7 * var3] = var9;
            } else if (var9 == 1) {
               var6[var8 + var7 * var3] = this.b[this.a(this.b.length)].F;
            } else {
               var6[var8 + var7 * var3] = sr.n.F;
            }
         }
      }

      return var6;
   }
}
