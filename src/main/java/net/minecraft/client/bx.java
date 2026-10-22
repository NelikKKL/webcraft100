package net.minecraft.client;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class bx extends vh {
   private sr c;
   private float d;
   private float e;

   public bx(sr var1, float var2, float var3) {
      this.c = var1;
      this.d = var2;
      this.e = var3;
   }

   public sr a(acm var1) {
      return this.c;
   }

   public sr a(int var1, int var2) {
      return this.c;
   }

   public sr[] a(int var1, int var2, int var3, int var4) {
      this.a = this.a(this.a, var1, var2, var3, var4);
      return this.a;
   }

   public float[] a(float[] var1, int var2, int var3, int var4, int var5) {
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.d);
      return var1;
   }

   public float[] b(int var1, int var2, int var3, int var4) {
      return this.a(new float[var3 * var4], var1, var2, var3, var4);
   }

   public float[] b(float[] var1, int var2, int var3, int var4, int var5) {
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.e);
      return var1;
   }

   public float b(int var1, int var2) {
      return this.e;
   }

   public sr[] a(sr[] var1, int var2, int var3, int var4, int var5) {
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new sr[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.c);
      return var1;
   }

   public sr[] a(sr[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return this.a(var1, var2, var3, var4, var5);
   }

   public am a(int var1, int var2, int var3, List var4, Random var5) {
      return var4.contains(this.c) ? new am(var1 - var3 + var5.nextInt(var3 * 2 + 1), 0, var2 - var3 + var5.nextInt(var3 * 2 + 1)) : null;
   }

   public boolean a(int var1, int var2, int var3, List var4) {
      return var4.contains(this.c);
   }
}
