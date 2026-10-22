package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class ns extends oa {
   public ns(ry var1, Random var2, int var3, int var4) {
      uk var5 = new uk(0, var2, (var3 << 4) + 2, (var4 << 4) + 2);
      this.a.add(var5);
      var5.a((nk)var5, (List)this.a, (Random)var2);
      this.c();
      this.a(var1, var2, 10);
   }
}
