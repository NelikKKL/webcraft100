package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class ags extends afr {
   public ags(int var1, int var2) {
      super(var1, var2, true);
      this.b(true);
   }

   public int d() {
      return 20;
   }

   public boolean g() {
      return true;
   }

   public void a(ry var1, int var2, int var3, int var4, ia var5) {
      if (!var1.I) {
         int var6 = var1.d(var2, var3, var4);
         if ((var6 & 8) == 0) {
            this.f(var1, var2, var3, var4, var6);
         }
      }
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (!var1.I) {
         int var6 = var1.d(var2, var3, var4);
         if ((var6 & 8) != 0) {
            this.f(var1, var2, var3, var4, var6);
         }
      }
   }

   public boolean b(kq var1, int var2, int var3, int var4, int var5) {
      return (var1.d(var2, var3, var4) & 8) != 0;
   }

   public boolean c(ry var1, int var2, int var3, int var4, int var5) {
      if ((var1.d(var2, var3, var4) & 8) == 0) {
         return false;
      } else {
         return var5 == 1;
      }
   }

   private void f(ry var1, int var2, int var3, int var4, int var5) {
      boolean var6 = (var5 & 8) != 0;
      boolean var7 = false;
      float var8 = 0.125F;
      List var9 = var1.a(net.minecraft.client.vm.class, net.minecraft.client.c.b((double)((float)var2 + var8), (double)var3, (double)((float)var4 + var8), (double)((float)(var2 + 1) - var8), (double)var3 + (double)0.25F, (double)((float)(var4 + 1) - var8)));
      if (var9.size() > 0) {
         var7 = true;
      }

      if (var7 && !var6) {
         var1.f(var2, var3, var4, var5 | 8);
         var1.j(var2, var3, var4, this.bM);
         var1.j(var2, var3 - 1, var4, this.bM);
         var1.c(var2, var3, var4, var2, var3, var4);
      }

      if (!var7 && var6) {
         var1.f(var2, var3, var4, var5 & 7);
         var1.j(var2, var3, var4, this.bM);
         var1.j(var2, var3 - 1, var4, this.bM);
         var1.c(var2, var3, var4, var2, var3, var4);
      }

      if (var7) {
         var1.a(var2, var3, var4, this.bM, this.d());
      }

   }
}
