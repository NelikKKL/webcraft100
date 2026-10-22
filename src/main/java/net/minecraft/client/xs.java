package net.minecraft.client;

import java.util.Random;

public class xs extends yy {
   public static final String[] a = new String[]{"stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick"};
   private boolean cb;

   public xs(int var1, boolean var2) {
      super(var1, 6, net.minecraft.client.p.e);
      this.cb = var2;
      if (!var2) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      } else {
         m[var1] = true;
      }

      this.h(255);
   }

   public int a(int var1, int var2) {
      if (var2 == 0) {
         return var1 <= 1 ? 6 : 5;
      } else if (var2 == 1) {
         if (var1 == 0) {
            return 208;
         } else {
            return var1 == 1 ? 176 : 192;
         }
      } else if (var2 == 2) {
         return 4;
      } else if (var2 == 3) {
         return 16;
      } else if (var2 == 4) {
         return yy.al.bL;
      } else {
         return var2 == 5 ? yy.bm.bL : 6;
      }
   }

   public int b(int var1) {
      return this.a(var1, 0);
   }

   public boolean a() {
      return this.cb;
   }

   public void a(ry var1, int var2, int var3, int var4) {
   }

   public int a(int var1, Random var2, int var3) {
      return yy.ak.bM;
   }

   public int a(Random var1) {
      return this.cb ? 2 : 1;
   }

   protected int a(int var1) {
      return var1;
   }

   public boolean b() {
      return this.cb;
   }

   public boolean a_(kq var1, int var2, int var3, int var4, int var5) {
      if (this != yy.ak) {
         super.a_(var1, var2, var3, var4, var5);
      }

      if (var5 == 1) {
         return true;
      } else if (!super.a_(var1, var2, var3, var4, var5)) {
         return false;
      } else if (var5 == 0) {
         return true;
      } else {
         return var1.a(var2, var3, var4) != this.bM;
      }
   }

   protected dk c_(int var1) {
      return new dk(yy.ak.bM, 1, var1);
   }
}
