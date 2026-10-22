package net.minecraft.client;

import java.util.HashSet;
import java.util.Set;

public class ob {
   private transient aei[] a = new aei[16];
   private transient int b;
   private int c = 12;
   private final float d = 0.75F;
   private transient volatile int e;
   private Set f = new HashSet();

   private static int g(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int a(int var0, int var1) {
      return var0 & var1 - 1;
   }

   public Object a(int var1) {
      int var2 = g(var1);

      for(aei var3 = this.a[a(var2, this.a.length)]; var3 != null; var3 = var3.c) {
         if (var3.a == var1) {
            return var3.b;
         }
      }

      return null;
   }

   public boolean b(int var1) {
      return this.c(var1) != null;
   }

   final aei c(int var1) {
      int var2 = g(var1);

      for(aei var3 = this.a[a(var2, this.a.length)]; var3 != null; var3 = var3.c) {
         if (var3.a == var1) {
            return var3;
         }
      }

      return null;
   }

   public void a(int var1, Object var2) {
      this.f.add(var1);
      int var3 = g(var1);
      int var4 = a(var3, this.a.length);

      for(aei var5 = this.a[var4]; var5 != null; var5 = var5.c) {
         if (var5.a == var1) {
            var5.b = var2;
         }
      }

      ++this.e;
      this.a(var3, var1, var2, var4);
   }

   private void h(int var1) {
      aei[] var2 = this.a;
      int var3 = var2.length;
      if (var3 == 1073741824) {
         this.c = Integer.MAX_VALUE;
      } else {
         aei[] var4 = new aei[var1];
         this.a(var4);
         this.a = var4;
         this.c = (int)((float)var1 * this.d);
      }
   }

   private void a(aei[] var1) {
      aei[] var2 = this.a;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         aei var5 = var2[var4];
         if (var5 != null) {
            var2[var4] = null;

            while(true) {
               aei var6 = var5.c;
               int var7 = a(var5.d, var3);
               var5.c = var1[var7];
               var1[var7] = var5;
               var5 = var6;
               if (var6 == null) {
                  break;
               }
            }
         }
      }

   }

   public Object d(int var1) {
      this.f.remove(var1);
      aei var2 = this.e(var1);
      return var2 == null ? null : var2.b;
   }

   final aei e(int var1) {
      int var2 = g(var1);
      int var3 = a(var2, this.a.length);
      aei var4 = this.a[var3];

      aei var5;
      aei var6;
      for(var5 = var4; var5 != null; var5 = var6) {
         var6 = var5.c;
         if (var5.a == var1) {
            ++this.e;
            --this.b;
            if (var4 == var5) {
               this.a[var3] = var6;
            } else {
               var4.c = var6;
            }

            return var5;
         }

         var4 = var5;
      }

      return var5;
   }

   public void a() {
      ++this.e;
      aei[] var1 = this.a;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = null;
      }

      this.b = 0;
   }

   private void a(int var1, int var2, Object var3, int var4) {
      aei var5 = this.a[var4];
      this.a[var4] = new aei(var1, var2, var3, var5);
      if (this.b++ >= this.c) {
         this.h(2 * this.a.length);
      }

   }

   public Set b() {
      return this.f;
   }

   // $FF: synthetic method
   static int f(int var0) {
      return g(var0);
   }
}
