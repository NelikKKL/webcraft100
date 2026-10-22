package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class ahk extends pj {
   public de a = new li(this, "Enchant", 1);
   private ry h;
   private int i;
   private int j;
   private int k;
   private Random l = new Random();
   public long b;
   public int[] c = new int[3];

   public ahk(x var1, ry var2, int var3, int var4, int var5) {
      this.h = var2;
      this.i = var3;
      this.j = var4;
      this.k = var5;
      this.a((vv)(new ur(this, this.a, 0, 25, 47)));

      for(int var6 = 0; var6 < 3; ++var6) {
         for(int var7 = 0; var7 < 9; ++var7) {
            this.a((vv)(new vv(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18)));
         }
      }

      for(int var8 = 0; var8 < 9; ++var8) {
         this.a((vv)(new vv(var1, var8, 8 + var8 * 18, 142)));
      }

   }

   public void a() {
      super.a();

      for(int var1 = 0; var1 < this.g.size(); ++var1) {
         abd var2 = (abd)this.g.get(var1);
         var2.a(this, 0, this.c[0]);
         var2.a(this, 1, this.c[1]);
         var2.a(this, 2, this.c[2]);
      }

   }

   public void a(int var1, int var2) {
      if (var1 >= 0 && var1 <= 2) {
         this.c[var1] = var2;
      } else {
         super.a(var1, var2);
      }

   }

   public void a(de var1) {
      if (var1 == this.a) {
         dk var2 = var1.d(0);
         if (var2 != null && var2.t()) {
            this.b = this.l.nextLong();
            if (!this.h.I) {
               int var6 = 0;

               for(int var4 = -1; var4 <= 1; ++var4) {
                  for(int var5 = -1; var5 <= 1; ++var5) {
                     if ((var4 != 0 || var5 != 0) && this.h.h(this.i + var5, this.j, this.k + var4) && this.h.h(this.i + var5, this.j + 1, this.k + var4)) {
                        if (this.h.a(this.i + var5 * 2, this.j, this.k + var4 * 2) == yy.an.bM) {
                           ++var6;
                        }

                        if (this.h.a(this.i + var5 * 2, this.j + 1, this.k + var4 * 2) == yy.an.bM) {
                           ++var6;
                        }

                        if (var5 != 0 && var4 != 0) {
                           if (this.h.a(this.i + var5 * 2, this.j, this.k + var4) == yy.an.bM) {
                              ++var6;
                           }

                           if (this.h.a(this.i + var5 * 2, this.j + 1, this.k + var4) == yy.an.bM) {
                              ++var6;
                           }

                           if (this.h.a(this.i + var5, this.j, this.k + var4 * 2) == yy.an.bM) {
                              ++var6;
                           }

                           if (this.h.a(this.i + var5, this.j + 1, this.k + var4 * 2) == yy.an.bM) {
                              ++var6;
                           }
                        }
                     }
                  }
               }

               for(int var7 = 0; var7 < 3; ++var7) {
                  this.c[var7] = ml.a(this.l, var7, var6, var2);
               }

               this.a();
            }
         } else {
            for(int var3 = 0; var3 < 3; ++var3) {
               this.c[var3] = 0;
            }
         }
      }

   }

   public boolean a(vi var1, int var2) {
      dk var3 = this.a.d(0);
      if (this.c[var2] > 0 && var3 != null && var1.cd >= this.c[var2]) {
         if (!this.h.I) {
            List var4 = ml.a(this.l, var3, this.c[var2]);
            if (var4 != null) {
               var1.l(this.c[var2]);

               for(vs var6 : (Iterable<vs>)(Iterable)(var4)) {
                  var3.a(var6.a, var6.b);
               }

               this.a(this.a);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(vi var1) {
      super.b(var1);
      if (!this.h.I) {
         dk var2 = this.a.d(0);
         if (var2 != null) {
            var1.a(var2);
         }

      }
   }

   public boolean a(vi var1) {
      if (this.h.a(this.i, this.j, this.k) != yy.bE.bM) {
         return false;
      } else {
         return !(var1.f((double)this.i + (double)0.5F, (double)this.j + (double)0.5F, (double)this.k + (double)0.5F) > (double)64.0F);
      }
   }

   public dk a(int var1) {
      dk var2 = null;
      vv var3 = (vv)this.e.get(var1);
      if (var3 != null && var3.c()) {
         dk var4 = var3.b();
         var2 = var4.k();
         if (var1 != 0) {
            return null;
         }

         if (!this.a(var4, 1, 37, true)) {
            return null;
         }

         if (var4.a == 0) {
            var3.c((dk)null);
         } else {
            var3.d();
         }

         if (var4.a == var2.a) {
            return null;
         }

         var3.b(var4);
      }

      return var2;
   }
}
