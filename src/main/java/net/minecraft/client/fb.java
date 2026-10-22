package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public class fb {
   private static List d = new ArrayList();
   private static int e = 0;
   public double a;
   public double b;
   public double c;

   public static fb a(double var0, double var2, double var4) {
      return new fb(var0, var2, var4);
   }

   public static void a() {
      d.clear();
      e = 0;
   }

   public static void b() {
      e = 0;
   }

   public static fb b(double var0, double var2, double var4) {
      if (e >= d.size()) {
         d.add(a((double)0.0F, (double)0.0F, (double)0.0F));
      }

      return ((fb)d.get(e++)).e(var0, var2, var4);
   }

   private fb(double var1, double var3, double var5) {
      if (var1 == (double)0.0F) {
         var1 = (double)0.0F;
      }

      if (var3 == (double)0.0F) {
         var3 = (double)0.0F;
      }

      if (var5 == (double)0.0F) {
         var5 = (double)0.0F;
      }

      this.a = var1;
      this.b = var3;
      this.c = var5;
   }

   private fb e(double var1, double var3, double var5) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      return this;
   }

   public fb a(fb var1) {
      return b(var1.a - this.a, var1.b - this.b, var1.c - this.c);
   }

   public fb c() {
      double var1 = (double)me.a(this.a * this.a + this.b * this.b + this.c * this.c);
      return var1 < 1.0E-4 ? b((double)0.0F, (double)0.0F, (double)0.0F) : b(this.a / var1, this.b / var1, this.c / var1);
   }

   public double b(fb var1) {
      return this.a * var1.a + this.b * var1.b + this.c * var1.c;
   }

   public fb c(fb var1) {
      return b(this.b * var1.c - this.c * var1.b, this.c * var1.a - this.a * var1.c, this.a * var1.b - this.b * var1.a);
   }

   public fb c(double var1, double var3, double var5) {
      return b(this.a + var1, this.b + var3, this.c + var5);
   }

   public double d(fb var1) {
      double var2 = var1.a - this.a;
      double var4 = var1.b - this.b;
      double var6 = var1.c - this.c;
      return (double)me.a(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double e(fb var1) {
      double var2 = var1.a - this.a;
      double var4 = var1.b - this.b;
      double var6 = var1.c - this.c;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double d(double var1, double var3, double var5) {
      double var7 = var1 - this.a;
      double var9 = var3 - this.b;
      double var11 = var5 - this.c;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double d() {
      return (double)me.a(this.a * this.a + this.b * this.b + this.c * this.c);
   }

   public fb a(fb var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if (var4 * var4 < (double)1.0E-7F) {
         return null;
      } else {
         double var10 = (var2 - this.a) / var4;
         return !(var10 < (double)0.0F) && !(var10 > (double)1.0F) ? b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10) : null;
      }
   }

   public fb b(fb var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if (var6 * var6 < (double)1.0E-7F) {
         return null;
      } else {
         double var10 = (var2 - this.b) / var6;
         return !(var10 < (double)0.0F) && !(var10 > (double)1.0F) ? b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10) : null;
      }
   }

   public fb c(fb var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if (var8 * var8 < (double)1.0E-7F) {
         return null;
      } else {
         double var10 = (var2 - this.c) / var8;
         return !(var10 < (double)0.0F) && !(var10 > (double)1.0F) ? b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10) : null;
      }
   }

   public String toString() {
      return "(" + this.a + ", " + this.b + ", " + this.c + ")";
   }

   public void a(float var1) {
      float var2 = me.b(var1);
      float var3 = me.a(var1);
      double var4 = this.a;
      double var6 = this.b * (double)var2 + this.c * (double)var3;
      double var8 = this.c * (double)var2 - this.b * (double)var3;
      this.a = var4;
      this.b = var6;
      this.c = var8;
   }

   public void b(float var1) {
      float var2 = me.b(var1);
      float var3 = me.a(var1);
      double var4 = this.a * (double)var2 + this.c * (double)var3;
      double var6 = this.b;
      double var8 = this.c * (double)var2 - this.a * (double)var3;
      this.a = var4;
      this.b = var6;
      this.c = var8;
   }
}
