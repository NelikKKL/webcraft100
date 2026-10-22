package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class rp {
   private static final aaz[] a = new aaz[]{new aaz(ac.class, 30, 0, true), new aaz(bw.class, 10, 4), new aaz(ui.class, 10, 4), new aaz(bl.class, 10, 3), new aaz(kf.class, 5, 2), new aaz(xr.class, 5, 1)};
   private static final aaz[] b = new aaz[]{new aaz(hg.class, 25, 0, true), new aaz(yj.class, 15, 5), new aaz(lu.class, 5, 10), new aaz(ahw.class, 5, 10), new aaz(tr.class, 10, 3, true), new aaz(acs.class, 7, 2), new aaz(io.class, 5, 2)};

   private static rh b(aaz var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      Class var8 = var0.a;
      Object var9 = null;
      if (var8 == ac.class) {
         var9 = ac.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == bw.class) {
         var9 = bw.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == ui.class) {
         var9 = ui.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == bl.class) {
         var9 = bl.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == kf.class) {
         var9 = kf.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == xr.class) {
         var9 = xr.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == hg.class) {
         var9 = hg.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == lu.class) {
         var9 = lu.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == ahw.class) {
         var9 = ahw.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == tr.class) {
         var9 = tr.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == acs.class) {
         var9 = acs.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == yj.class) {
         var9 = yj.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == io.class) {
         var9 = io.a(var1, var2, var3, var4, var5, var6, var7);
      }

      return (rh)var9;
   }

   // $FF: synthetic method
   static rh a(aaz var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return b(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static aaz[] a() {
      return a;
   }

   // $FF: synthetic method
   static aaz[] b() {
      return b;
   }
}
