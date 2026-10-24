package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class hn extends zx {
   public hn(ry var1, int var2, int var3) {
      super(var1, var2, var3);
      this.r = true;
   }

   public hn(ry var1, byte[] var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.r = true;
   }

   public boolean a(int var1, int var2) {
      return var1 == this.l && var2 == this.m;
   }

   public int b(int var1, int var2) {
      return 0;
   }

   public void a() {
   }

   public void b() {
   }

   public void c() {
   }

   public void d() {
   }

   public int a(int var1, int var2, int var3) {
      return 0;
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      return true;
   }

   public int b(int var1, int var2, int var3) {
      return 0;
   }

   public boolean b(int var1, int var2, int var3, int var4) {
      return false;
   }

   public int a(bn var1, int var2, int var3, int var4) {
      return 0;
   }

   public void a(bn var1, int var2, int var3, int var4, int var5) {
   }

   public int c(int var1, int var2, int var3, int var4) {
      return 0;
   }

   public void a(ia var1) {
   }

   public void b(ia var1) {
   }

   public void a(ia var1, int var2) {
   }

   public boolean c(int var1, int var2, int var3) {
      return false;
   }

   public bq d(int var1, int var2, int var3) {
      return null;
   }

   public void a(bq var1) {
   }

   public void a(int var1, int var2, int var3, bq var4) {
   }

   public void e(int var1, int var2, int var3) {
   }

   public void e() {
   }

   public void f() {
   }

   public void g() {
   }

   public void a(ia var1, c var2, List var3) {
   }

   public void a(Class var1, c var2, List var3) {
   }

   public boolean a(boolean var1) {
      return false;
   }

   public int a(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var5 - var2;
      int var10 = var6 - var3;
      int var11 = var7 - var4;
      int var12 = var9 * var10 * var11;
      return var12 + var12 / 2 * 3;
   }

   public Random a(long var1) {
      return new net.minecraft.client.web.JRandom(this.f.t() + (long)(this.l * this.l * 4987142) + (long)(this.l * 5947611) + (long)(this.m * this.m) * 4392871L + (long)(this.m * 389711) ^ var1);
   }

   public boolean h() {
      return true;
   }
}
