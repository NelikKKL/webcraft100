package net.minecraft.client;

public class na extends jx {
   private jx b;
   private jx c;

   public na(long var1, jx var3, jx var4) {
      super(var1);
      this.b = var3;
      this.c = var4;
   }

   public void b(long var1) {
      this.b.b(var1);
      this.c.b(var1);
      super.b(var1);
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.b.a(var1, var2, var3, var4);
      int[] var6 = this.c.a(var1, var2, var3, var4);
      int[] var7 = bm.a(var3 * var4);

      for(int var8 = 0; var8 < var3 * var4; ++var8) {
         if (var5[var8] == sr.b.F) {
            var7[var8] = var5[var8];
         } else if (var6[var8] >= 0) {
            if (var5[var8] == sr.n.F) {
               var7[var8] = sr.m.F;
            } else if (var5[var8] != sr.p.F && var5[var8] != sr.q.F) {
               var7[var8] = var6[var8];
            } else {
               var7[var8] = sr.q.F;
            }
         } else {
            var7[var8] = var5[var8];
         }
      }

      return var7;
   }
}
