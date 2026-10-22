package net.minecraft.client;

public class rw {
   private kq a;
   private zs b = new zs();
   private ob c = new ob();
   private mo[] d = new mo[32];

   public rw(kq var1) {
      this.a = var1;
   }

   public dw a(ia var1, ia var2, float var3) {
      return this.a(var1, var2.s, var2.C.b, var2.u, var3);
   }

   public dw a(ia var1, int var2, int var3, int var4, float var5) {
      return this.a(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var5);
   }

   private dw a(ia var1, double var2, double var4, double var6, float var8) {
      this.b.a();
      this.c.a();
      mo var9 = this.a(me.c(var1.C.a), me.c(var1.C.b), me.c(var1.C.c));
      mo var10 = this.a(me.c(var2 - (double)(var1.M / 2.0F)), me.c(var4), me.c(var6 - (double)(var1.M / 2.0F)));
      mo var11 = new mo(me.d(var1.M + 1.0F), me.d(var1.N + 1.0F), me.d(var1.M + 1.0F));
      dw var12 = this.a(var1, var9, var10, var11, var8);
      return var12;
   }

   private dw a(ia var1, mo var2, mo var3, mo var4, float var5) {
      var2.e = 0.0F;
      var2.f = var2.a(var3);
      var2.g = var2.f;
      this.b.a();
      this.b.a(var2);
      mo var6 = var2;

      while(!this.b.c()) {
         mo var7 = this.b.b();
         if (var7.equals(var3)) {
            return this.a(var2, var3);
         }

         if (var7.a(var3) < var6.a(var3)) {
            var6 = var7;
         }

         var7.i = true;
         int var8 = this.b(var1, var7, var4, var3, var5);

         for(int var9 = 0; var9 < var8; ++var9) {
            mo var10 = this.d[var9];
            float var11 = var7.e + var7.a(var10);
            if (!var10.a() || var11 < var10.e) {
               var10.h = var7;
               var10.e = var11;
               var10.f = var10.a(var3);
               if (var10.a()) {
                  this.b.a(var10, var10.e + var10.f);
               } else {
                  var10.g = var10.e + var10.f;
                  this.b.a(var10);
               }
            }
         }
      }

      if (var6 == var2) {
         return null;
      } else {
         return this.a(var2, var6);
      }
   }

   private int b(ia var1, mo var2, mo var3, mo var4, float var5) {
      int var6 = 0;
      byte var7 = 0;
      if (this.a(var1, var2.a, var2.b + 1, var2.c, var3) == 1) {
         var7 = 1;
      }

      mo var8 = this.a(var1, var2.a, var2.b, var2.c + 1, var3, var7);
      mo var9 = this.a(var1, var2.a - 1, var2.b, var2.c, var3, var7);
      mo var10 = this.a(var1, var2.a + 1, var2.b, var2.c, var3, var7);
      mo var11 = this.a(var1, var2.a, var2.b, var2.c - 1, var3, var7);
      if (var8 != null && !var8.i && var8.a(var4) < var5) {
         this.d[var6++] = var8;
      }

      if (var9 != null && !var9.i && var9.a(var4) < var5) {
         this.d[var6++] = var9;
      }

      if (var10 != null && !var10.i && var10.a(var4) < var5) {
         this.d[var6++] = var10;
      }

      if (var11 != null && !var11.i && var11.a(var4) < var5) {
         this.d[var6++] = var11;
      }

      return var6;
   }

   private mo a(ia var1, int var2, int var3, int var4, mo var5, int var6) {
      mo var7 = null;
      if (this.a(var1, var2, var3, var4, var5) == 1) {
         var7 = this.a(var2, var3, var4);
      }

      if (var7 == null && var6 > 0 && this.a(var1, var2, var3 + var6, var4, var5) == 1) {
         var7 = this.a(var2, var3 + var6, var4);
         var3 += var6;
      }

      if (var7 != null) {
         int var8 = 0;
         int var9 = 0;

         while(var3 > 0 && (var9 = this.a(var1, var2, var3 - 1, var4, var5)) == 1) {
            ++var8;
            if (var8 >= 4) {
               return null;
            }

            --var3;
            if (var3 > 0) {
               var7 = this.a(var2, var3, var4);
            }
         }

         if (var9 == -2) {
            return null;
         }
      }

      return var7;
   }

   private final mo a(int var1, int var2, int var3) {
      int var4 = mo.a(var1, var2, var3);
      mo var5 = (mo)this.c.a(var4);
      if (var5 == null) {
         var5 = new mo(var1, var2, var3);
         this.c.a(var4, var5);
      }

      return var5;
   }

   private int a(ia var1, int var2, int var3, int var4, mo var5) {
      for(int var6 = var2; var6 < var2 + var5.a; ++var6) {
         for(int var7 = var3; var7 < var3 + var5.b; ++var7) {
            for(int var8 = var4; var8 < var4 + var5.c; ++var8) {
               int var9 = this.a.a(var6, var7, var8);
               if (var9 > 0) {
                  if (var9 != yy.aL.bM && var9 != yy.aE.bM) {
                     p var11 = yy.k[var9].bZ;
                     if (var11.d()) {
                        return 0;
                     }

                     if (var11 == p.g) {
                        return -1;
                     }

                     if (var11 == p.h) {
                        return -2;
                     }
                  } else {
                     int var10 = this.a.d(var6, var7, var8);
                     if (!uc.g(var10)) {
                        return 0;
                     }
                  }
               }
            }
         }
      }

      return 1;
   }

   private dw a(mo var1, mo var2) {
      int var3 = 1;

      for(mo var4 = var2; var4.h != null; var4 = var4.h) {
         ++var3;
      }

      mo[] var5 = new mo[var3];
      mo var7 = var2;
      --var3;

      for(var5[var3] = var2; var7.h != null; var5[var3] = var7) {
         var7 = var7.h;
         --var3;
      }

      return new dw(var5);
   }
}
