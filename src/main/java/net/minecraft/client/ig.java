package net.minecraft.client;

import java.util.Random;

public abstract class ig {
   private final boolean a;

   public ig() {
      this.a = false;
   }

   public ig(boolean var1) {
      this.a = var1;
   }

   public abstract boolean a(ry var1, Random var2, int var3, int var4, int var5);

   public void a(double var1, double var3, double var5) {
   }

   protected void a(ry var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.a) {
         var1.d(var2, var3, var4, var5, var6);
      } else {
         var1.b(var2, var3, var4, var5, var6);
      }

   }
}
