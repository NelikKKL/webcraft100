package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class yo extends oa {
   private boolean c = false;

   public yo(ry var1, Random var2, int var3, int var4) {
      byte var5 = 0;
      ArrayList var6 = xy.a(var2, var5);
      yp var7 = new yp(var1.a(), 0, var2, (var3 << 4) + 2, (var4 << 4) + 2, var6, var5);
      this.a.add(var7);
      var7.a(var7, this.a, var2);
      ArrayList var8 = var7.i;
      ArrayList var9 = var7.h;

      while(!var8.isEmpty() || !var9.isEmpty()) {
         if (!var8.isEmpty()) {
            int var10 = var2.nextInt(var8.size());
            nk var11 = (nk)var8.remove(var10);
            var11.a((nk)var7, (List)this.a, (Random)var2);
         } else {
            int var13 = var2.nextInt(var9.size());
            nk var15 = (nk)var9.remove(var13);
            var15.a((nk)var7, (List)this.a, (Random)var2);
         }
      }

      this.c();
      int var14 = 0;

      for(nk var12 : (Iterable<nk>)(Iterable)(this.a)) {
         if (!(var12 instanceof za)) {
            ++var14;
         }
      }

      this.c = var14 > 2;
   }

   public boolean d() {
      return this.c;
   }
}
