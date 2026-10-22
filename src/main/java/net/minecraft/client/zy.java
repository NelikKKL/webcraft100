package net.minecraft.client;

public class zy extends jx {
   public zy(long var1, jx var3) {
      super(var1);
      this.a = var3;
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.a.a(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var6 = bm.a(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.a((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + 1 + (var7 + 1) * (var3 + 2)];
            if (var9 == sr.p.F) {
               int var10 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
               int var11 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
               int var12 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
               int var13 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
               if (var10 != sr.b.F && var11 != sr.b.F && var12 != sr.b.F && var13 != sr.b.F) {
                  var6[var8 + var7 * var3] = var9;
               } else {
                  var6[var8 + var7 * var3] = sr.q.F;
               }
            } else {
               var6[var8 + var7 * var3] = var9;
            }
         }
      }

      return var6;
   }
}
