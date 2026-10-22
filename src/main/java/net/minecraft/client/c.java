package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public class c {
   private static List g = new ArrayList();
   private static int h = 0;
   public double a;
   public double b;
   public double c;
   public double d;
   public double e;
   public double f;

   public static c a(double var0, double var2, double var4, double var6, double var8, double var10) {
      return new c(var0, var2, var4, var6, var8, var10);
   }

   public static void a() {
      g.clear();
      h = 0;
   }

   public static void b() {
      h = 0;
   }

   public static c b(double var0, double var2, double var4, double var6, double var8, double var10) {
      if (h >= g.size()) {
         g.add(a((double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F));
      }

      return ((c)g.get(h++)).c(var0, var2, var4, var6, var8, var10);
   }

   private c(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var9;
      this.f = var11;
   }

   public c c(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var9;
      this.f = var11;
      return this;
   }

   public c a(double var1, double var3, double var5) {
      double var7 = this.a;
      double var9 = this.b;
      double var11 = this.c;
      double var13 = this.d;
      double var15 = this.e;
      double var17 = this.f;
      if (var1 < (double)0.0F) {
         var7 += var1;
      }

      if (var1 > (double)0.0F) {
         var13 += var1;
      }

      if (var3 < (double)0.0F) {
         var9 += var3;
      }

      if (var3 > (double)0.0F) {
         var15 += var3;
      }

      if (var5 < (double)0.0F) {
         var11 += var5;
      }

      if (var5 > (double)0.0F) {
         var17 += var5;
      }

      return b(var7, var9, var11, var13, var15, var17);
   }

   public c b(double var1, double var3, double var5) {
      double var7 = this.a - var1;
      double var9 = this.b - var3;
      double var11 = this.c - var5;
      double var13 = this.d + var1;
      double var15 = this.e + var3;
      double var17 = this.f + var5;
      return b(var7, var9, var11, var13, var15, var17);
   }

   public c c(double var1, double var3, double var5) {
      return b(this.a + var1, this.b + var3, this.c + var5, this.d + var1, this.e + var3, this.f + var5);
   }

   public double a(c var1, double var2) {
      if (!(var1.e <= this.b) && !(var1.b >= this.e)) {
         if (!(var1.f <= this.c) && !(var1.c >= this.f)) {
            if (var2 > (double)0.0F && var1.d <= this.a) {
               double var4 = this.a - var1.d;
               if (var4 < var2) {
                  var2 = var4;
               }
            }

            if (var2 < (double)0.0F && var1.a >= this.d) {
               double var6 = this.d - var1.a;
               if (var6 > var2) {
                  var2 = var6;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public double b(c var1, double var2) {
      if (!(var1.d <= this.a) && !(var1.a >= this.d)) {
         if (!(var1.f <= this.c) && !(var1.c >= this.f)) {
            if (var2 > (double)0.0F && var1.e <= this.b) {
               double var4 = this.b - var1.e;
               if (var4 < var2) {
                  var2 = var4;
               }
            }

            if (var2 < (double)0.0F && var1.b >= this.e) {
               double var6 = this.e - var1.b;
               if (var6 > var2) {
                  var2 = var6;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public double c(c var1, double var2) {
      if (!(var1.d <= this.a) && !(var1.a >= this.d)) {
         if (!(var1.e <= this.b) && !(var1.b >= this.e)) {
            if (var2 > (double)0.0F && var1.f <= this.c) {
               double var4 = this.c - var1.f;
               if (var4 < var2) {
                  var2 = var4;
               }
            }

            if (var2 < (double)0.0F && var1.c >= this.f) {
               double var6 = this.f - var1.c;
               if (var6 > var2) {
                  var2 = var6;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public boolean a(c var1) {
      if (!(var1.d <= this.a) && !(var1.a >= this.d)) {
         if (!(var1.e <= this.b) && !(var1.b >= this.e)) {
            return !(var1.f <= this.c) && !(var1.c >= this.f);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public c d(double var1, double var3, double var5) {
      this.a += var1;
      this.b += var3;
      this.c += var5;
      this.d += var1;
      this.e += var3;
      this.f += var5;
      return this;
   }

   public boolean a(fb var1) {
      if (!(var1.a <= this.a) && !(var1.a >= this.d)) {
         if (!(var1.b <= this.b) && !(var1.b >= this.e)) {
            return !(var1.c <= this.c) && !(var1.c >= this.f);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public double c() {
      double var1 = this.d - this.a;
      double var3 = this.e - this.b;
      double var5 = this.f - this.c;
      return (var1 + var3 + var5) / (double)3.0F;
   }

   public c e(double var1, double var3, double var5) {
      double var7 = this.a + var1;
      double var9 = this.b + var3;
      double var11 = this.c + var5;
      double var13 = this.d - var1;
      double var15 = this.e - var3;
      double var17 = this.f - var5;
      return b(var7, var9, var11, var13, var15, var17);
   }

   public c d() {
      return b(this.a, this.b, this.c, this.d, this.e, this.f);
   }

   public gv a(fb var1, fb var2) {
      fb var3 = var1.a(var2, this.a);
      fb var4 = var1.a(var2, this.d);
      fb var5 = var1.b(var2, this.b);
      fb var6 = var1.b(var2, this.e);
      fb var7 = var1.c(var2, this.c);
      fb var8 = var1.c(var2, this.f);
      if (!this.b(var3)) {
         var3 = null;
      }

      if (!this.b(var4)) {
         var4 = null;
      }

      if (!this.c(var5)) {
         var5 = null;
      }

      if (!this.c(var6)) {
         var6 = null;
      }

      if (!this.d(var7)) {
         var7 = null;
      }

      if (!this.d(var8)) {
         var8 = null;
      }

      fb var9 = null;
      if (var3 != null && (var9 == null || var1.e(var3) < var1.e(var9))) {
         var9 = var3;
      }

      if (var4 != null && (var9 == null || var1.e(var4) < var1.e(var9))) {
         var9 = var4;
      }

      if (var5 != null && (var9 == null || var1.e(var5) < var1.e(var9))) {
         var9 = var5;
      }

      if (var6 != null && (var9 == null || var1.e(var6) < var1.e(var9))) {
         var9 = var6;
      }

      if (var7 != null && (var9 == null || var1.e(var7) < var1.e(var9))) {
         var9 = var7;
      }

      if (var8 != null && (var9 == null || var1.e(var8) < var1.e(var9))) {
         var9 = var8;
      }

      if (var9 == null) {
         return null;
      } else {
         byte var10 = -1;
         if (var9 == var3) {
            var10 = 4;
         }

         if (var9 == var4) {
            var10 = 5;
         }

         if (var9 == var5) {
            var10 = 0;
         }

         if (var9 == var6) {
            var10 = 1;
         }

         if (var9 == var7) {
            var10 = 2;
         }

         if (var9 == var8) {
            var10 = 3;
         }

         return new gv(0, 0, 0, var10, var9);
      }
   }

   private boolean b(fb var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.b >= this.b && var1.b <= this.e && var1.c >= this.c && var1.c <= this.f;
      }
   }

   private boolean c(fb var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.a >= this.a && var1.a <= this.d && var1.c >= this.c && var1.c <= this.f;
      }
   }

   private boolean d(fb var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.a >= this.a && var1.a <= this.d && var1.b >= this.b && var1.b <= this.e;
      }
   }

   public void b(c var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
   }

   public String toString() {
      return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
   }
}
