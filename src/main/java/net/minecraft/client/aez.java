package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class aez {
   private static final agq[] a;

   private static nk a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1.nextInt(100);
      if (var7 >= 80) {
         nl var8 = id.a(var0, var1, var2, var3, var4, var5);
         if (var8 != null) {
            return new id(var6, var1, var8, var5);
         }
      } else if (var7 >= 70) {
         nl var9 = ra.a(var0, var1, var2, var3, var4, var5);
         if (var9 != null) {
            return new ra(var6, var1, var9, var5);
         }
      } else {
         nl var10 = aba.a(var0, var1, var2, var3, var4, var5);
         if (var10 != null) {
            return new aba(var6, var1, var10, var5);
         }
      }

      return null;
   }

   private static nk b(nk var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if (var7 > 8) {
         return null;
      } else if (Math.abs(var3 - var0.a().a) <= 80 && Math.abs(var5 - var0.a().c) <= 80) {
         nk var8 = a(var1, var2, var3, var4, var5, var6, var7 + 1);
         if (var8 != null) {
            var1.add(var8);
            var8.a(var0, var1, var2);
         }

         return var8;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static nk a(nk var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return b(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static agq[] a() {
      return a;
   }

   static {
      a = new agq[]{new agq(acy.n.bM, 0, 1, 5, 10), new agq(acy.o.bM, 0, 1, 3, 5), new agq(acy.aB.bM, 0, 4, 9, 5), new agq(acy.aV.bM, 4, 4, 9, 5), new agq(acy.m.bM, 0, 1, 2, 3), new agq(acy.l.bM, 0, 3, 8, 10), new agq(acy.T.bM, 0, 1, 3, 15), new agq(acy.f.bM, 0, 1, 1, 1), new agq(yy.aG.bM, 0, 4, 8, 1), new agq(acy.bg.bM, 0, 2, 4, 10), new agq(acy.bf.bM, 0, 2, 4, 10)};
   }
}
