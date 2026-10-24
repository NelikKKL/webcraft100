package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class vh {
   private jx c;
   private jx d;
   private jx e;
   private jx f;
   private agl g;
   private List h;
   public sr[] a;
   public float[] b;

   protected vh() {
      this.g = new agl(this);
      this.h = new ArrayList();
      this.h.add(sr.f);
      this.h.add(sr.h);
      this.h.add(sr.g);
   }

   public vh(ry var1) {
      this();
      jx[] var2 = jx.a(var1.t());
      this.c = var2[0];
      this.d = var2[1];
      this.e = var2[2];
      this.f = var2[3];
   }

   public List a() {
      return this.h;
   }

   public sr a(acm var1) {
      return this.a(var1.a << 4, var1.b << 4);
   }

   public sr a(int var1, int var2) {
      return this.g.b(var1, var2);
   }

   public float b(int var1, int var2) {
      return this.g.d(var1, var2);
   }

   public float[] b(float[] var1, int var2, int var3, int var4, int var5) {
      bm.a();
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      int[] var6 = this.f.a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         float var8 = (float)var6[var7] / 65536.0F;
         if (var8 > 1.0F) {
            var8 = 1.0F;
         }

         var1[var7] = var8;
      }

      return var1;
   }

   public float a(int var1, int var2, int var3) {
      return this.a(this.g.c(var1, var3), var2);
   }

   public float a(float var1, int var2) {
      return var1;
   }

   public float[] b(int var1, int var2, int var3, int var4) {
      this.b = this.a(this.b, var1, var2, var3, var4);
      return this.b;
   }

   public float[] a(float[] var1, int var2, int var3, int var4, int var5) {
      bm.a();
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      int[] var6 = this.e.a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         float var8 = (float)var6[var7] / 65536.0F;
         if (var8 > 1.0F) {
            var8 = 1.0F;
         }

         var1[var7] = var8;
      }

      return var1;
   }

   public sr[] b(sr[] var1, int var2, int var3, int var4, int var5) {
      bm.a();
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new sr[var4 * var5];
      }

      int[] var6 = this.c.a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         var1[var7] = sr.a[var6[var7]];
      }

      return var1;
   }

   public sr[] a(int var1, int var2, int var3, int var4) {
      if (var3 == 16 && var4 == 16 && (var1 & 15) == 0 && (var2 & 15) == 0) {
         return this.g.e(var1, var2);
      } else {
         this.a = this.a(this.a, var1, var2, var3, var4);
         return this.a;
      }
   }

   public sr[] a(sr[] var1, int var2, int var3, int var4, int var5) {
      return this.a(var1, var2, var3, var4, var5, true);
   }

   public sr[] a(sr[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      bm.a();
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new sr[var4 * var5];
      }

      if (var6 && var4 == 16 && var5 == 16 && (var2 & 15) == 0 && (var3 & 15) == 0) {
         sr[] var9 = this.g.e(var2, var3);
         System.arraycopy(var9, 0, var1, 0, var4 * var5);
         return var1;
      } else {
         int[] var7 = this.d.a(var2, var3, var4, var5);

         for(int var8 = 0; var8 < var4 * var5; ++var8) {
            var1[var8] = sr.a[var7[var8]];
         }

         return var1;
      }
   }

   public boolean a(int var1, int var2, int var3, List var4) {
      int var5 = var1 - var3 >> 2;
      int var6 = var2 - var3 >> 2;
      int var7 = var1 + var3 >> 2;
      int var8 = var2 + var3 >> 2;
      int var9 = var7 - var5 + 1;
      int var10 = var8 - var6 + 1;
      int[] var11 = this.c.a(var5, var6, var9, var10);

      for(int var12 = 0; var12 < var9 * var10; ++var12) {
         sr var13 = sr.a[var11[var12]];
         if (!var4.contains(var13)) {
            return false;
         }
      }

      return true;
   }

   public am a(int var1, int var2, int var3, List var4, Random var5) {
      int var6 = var1 - var3 >> 2;
      int var7 = var2 - var3 >> 2;
      int var8 = var1 + var3 >> 2;
      int var9 = var2 + var3 >> 2;
      int var10 = var8 - var6 + 1;
      int var11 = var9 - var7 + 1;
      int[] var12 = this.c.a(var6, var7, var10, var11);
      am var13 = null;
      int var14 = 0;

      for(int var15 = 0; var15 < var12.length; ++var15) {
         int var16 = var6 + var15 % var10 << 2;
         int var17 = var7 + var15 / var10 << 2;
         sr var18 = sr.a[var12[var15]];
         if (var4.contains(var18) && (var13 == null || var5.nextInt(var14 + 1) == 0)) {
            var13 = new am(var16, 0, var17);
            ++var14;
         }
      }

      if (var13 == null) {
         // PATCH(1.0.0): диагностика "Unable to find spawn biome" (на JVM для тех же данных позиция находится)
         int var19 = 0;
         int var20 = 0;
         int var21 = 0;
         int var22 = 0;

         for(int var23 = 0; var23 < var12.length; ++var23) {
            int var24 = var12[var23];
            if (var24 < 0 || var24 > 255) {
               ++var20;
            } else if (sr.a[var24] == null) {
               ++var21;
            } else if (var4.contains(sr.a[var24])) {
               ++var22;
            } else {
               ++var19;
            }
         }

         int var25 = 0;

         for(int var26 = 0; var26 < var4.size(); ++var26) {
            if (var4.get(var26) == null) {
               ++var25;
            }
         }

         System.out.println("SPAWNDBG len=" + var12.length + " w=" + var10 + " h=" + var11 + " listSize=" + var4.size() + " nullInList=" + var25 + " outOfRange=" + var20 + " nullBiome=" + var21 + " inList=" + var22 + " notInList=" + var19 + " first=" + (var12.length > 0 ? var12[0] : -1));
      }

      return var13;
   }

   public void b() {
      this.g.a();
   }
}
