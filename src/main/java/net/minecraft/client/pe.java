package net.minecraft.client;

import java.util.List;

public class pe extends acy {
   public final String a;

   protected pe(int var1, String var2) {
      super(var1);
      this.a = var2;
      this.bN = 1;
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      if (var3.a(var4, var5, var6) == yy.aY.bM && var3.d(var4, var5, var6) == 0) {
         if (var3.I) {
            return true;
         } else {
            ((abl)yy.aY).f(var3, var4, var5, var6, this.bM);
            var3.a((vi)null, 1005, var4, var5, var6, this.bM);
            --var1.a;
            return true;
         }
      } else {
         return false;
      }
   }

   public void a(dk var1, List var2) {
      var2.add("C418 - " + this.a);
   }

   public ja d(dk var1) {
      return ja.c;
   }
}
