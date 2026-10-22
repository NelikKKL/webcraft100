package net.minecraft.client;

import java.util.ArrayList;
import java.util.Random;

public class uh extends yy {
   private int a;
   private final boolean cb;

   protected uh(int var1, int var2, int var3, p var4, boolean var5) {
      super(var1, var2, var4);
      this.a = var3;
      this.cb = var5;
   }

   public int a(int var1, Random var2, int var3) {
      return !this.cb ? 0 : super.a(var1, var2, var3);
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int c() {
      return 18;
   }

   public boolean a_(kq var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.a(var2, var3, var4);
      return var6 == this.bM ? false : super.a_(var1, var2, var3, var4, var5);
   }

   public void a(ry var1, int var2, int var3, int var4, c var5, ArrayList var6) {
      boolean var7 = this.e(var1.a(var2, var3, var4 - 1));
      boolean var8 = this.e(var1.a(var2, var3, var4 + 1));
      boolean var9 = this.e(var1.a(var2 - 1, var3, var4));
      boolean var10 = this.e(var1.a(var2 + 1, var3, var4));
      if ((!var9 || !var10) && (var9 || var10 || var7 || var8)) {
         if (var9 && !var10) {
            this.a(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
            super.a(var1, var2, var3, var4, var5, var6);
         } else if (!var9 && var10) {
            this.a(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
            super.a(var1, var2, var3, var4, var5, var6);
         }
      } else {
         this.a(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
         super.a(var1, var2, var3, var4, var5, var6);
      }

      if ((!var7 || !var8) && (var9 || var10 || var7 || var8)) {
         if (var7 && !var8) {
            this.a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
            super.a(var1, var2, var3, var4, var5, var6);
         } else if (!var7 && var8) {
            this.a(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
         }
      } else {
         this.a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }

   public void e() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void b(kq var1, int var2, int var3, int var4) {
      float var5 = 0.4375F;
      float var6 = 0.5625F;
      float var7 = 0.4375F;
      float var8 = 0.5625F;
      boolean var9 = this.e(var1.a(var2, var3, var4 - 1));
      boolean var10 = this.e(var1.a(var2, var3, var4 + 1));
      boolean var11 = this.e(var1.a(var2 - 1, var3, var4));
      boolean var12 = this.e(var1.a(var2 + 1, var3, var4));
      if ((!var11 || !var12) && (var11 || var12 || var9 || var10)) {
         if (var11 && !var12) {
            var5 = 0.0F;
         } else if (!var11 && var12) {
            var6 = 1.0F;
         }
      } else {
         var5 = 0.0F;
         var6 = 1.0F;
      }

      if ((!var9 || !var10) && (var11 || var12 || var9 || var10)) {
         if (var9 && !var10) {
            var7 = 0.0F;
         } else if (!var9 && var10) {
            var8 = 1.0F;
         }
      } else {
         var7 = 0.0F;
         var8 = 1.0F;
      }

      this.a(var5, 0.0F, var7, var6, 1.0F, var8);
   }

   public int j() {
      return this.a;
   }

   public final boolean e(int var1) {
      return yy.m[var1] || var1 == this.bM || var1 == yy.M.bM;
   }
}
