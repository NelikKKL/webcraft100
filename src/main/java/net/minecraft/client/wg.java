package net.minecraft.client;

import java.util.Random;

public class wg extends yy {
   protected wg(int var1, int var2) {
      super(var1, net.minecraft.client.p.j);
      this.bL = var2;
      this.b(true);
      float var3 = 0.2F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 3.0F, 0.5F + var3);
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return super.c(var1, var2, var3, var4) && this.d(var1.a(var2, var3 - 1, var4));
   }

   protected boolean d(int var1) {
      return var1 == yy.u.bM || var1 == yy.v.bM || var1 == yy.aA.bM;
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      this.h(var1, var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      this.h(var1, var2, var3, var4);
   }

   protected final void h(ry var1, int var2, int var3, int var4) {
      if (!this.e(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public boolean e(ry var1, int var2, int var3, int var4) {
      return (var1.m(var2, var3, var4) >= 8 || var1.l(var2, var3, var4)) && this.d(var1.a(var2, var3 - 1, var4));
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int c() {
      return 1;
   }
}
