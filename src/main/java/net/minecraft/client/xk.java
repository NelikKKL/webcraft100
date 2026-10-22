package net.minecraft.client;

public class xk implements kq {
   private int a;
   private int b;
   private zx[][] c;
   private ry d;

   public xk(ry var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.d = var1;
      this.a = var2 >> 4;
      this.b = var4 >> 4;
      int var8 = var5 >> 4;
      int var9 = var7 >> 4;
      this.c = new zx[var8 - this.a + 1][var9 - this.b + 1];

      for(int var10 = this.a; var10 <= var8; ++var10) {
         for(int var11 = this.b; var11 <= var9; ++var11) {
            this.c[var10 - this.a][var11 - this.b] = var1.c(var10, var11);
         }
      }

   }

   public int a(int var1, int var2, int var3) {
      if (var2 < 0) {
         return 0;
      } else if (var2 >= this.d.c) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.a;
         int var5 = (var3 >> 4) - this.b;
         if (var4 >= 0 && var4 < this.c.length && var5 >= 0 && var5 < this.c[var4].length) {
            zx var6 = this.c[var4][var5];
            return var6 == null ? 0 : var6.a(var1 & 15, var2, var3 & 15);
         } else {
            return 0;
         }
      }
   }

   public bq b(int var1, int var2, int var3) {
      int var4 = (var1 >> 4) - this.a;
      int var5 = (var3 >> 4) - this.b;
      return this.c[var4][var5].d(var1 & 15, var2, var3 & 15);
   }

   public float b(int var1, int var2, int var3, int var4) {
      int var5 = this.i(var1, var2, var3);
      if (var5 < var4) {
         var5 = var4;
      }

      return this.d.y.f[var5];
   }

   public int a(int var1, int var2, int var3, int var4) {
      int var5 = this.a(bn.a, var1, var2, var3);
      int var6 = this.a(bn.b, var1, var2, var3);
      if (var6 < var4) {
         var6 = var4;
      }

      return var5 << 20 | var6 << 4;
   }

   public float c(int var1, int var2, int var3) {
      return this.d.y.f[this.i(var1, var2, var3)];
   }

   public int i(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, true);
   }

   public int a(int var1, int var2, int var3, boolean var4) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 <= 30000000) {
         if (var4) {
            int var5 = this.a(var1, var2, var3);
            if (var5 == yy.ak.bM || var5 == yy.aA.bM || var5 == yy.at.bM || var5 == yy.aH.bM) {
               int var13 = this.a(var1, var2 + 1, var3, false);
               int var7 = this.a(var1 + 1, var2, var3, false);
               int var8 = this.a(var1 - 1, var2, var3, false);
               int var9 = this.a(var1, var2, var3 + 1, false);
               int var10 = this.a(var1, var2, var3 - 1, false);
               if (var7 > var13) {
                  var13 = var7;
               }

               if (var8 > var13) {
                  var13 = var8;
               }

               if (var9 > var13) {
                  var13 = var9;
               }

               if (var10 > var13) {
                  var13 = var10;
               }

               return var13;
            }
         }

         if (var2 < 0) {
            return 0;
         } else if (var2 >= this.d.c) {
            int var12 = 15 - this.d.k;
            if (var12 < 0) {
               var12 = 0;
            }

            return var12;
         } else {
            int var11 = (var1 >> 4) - this.a;
            int var6 = (var3 >> 4) - this.b;
            return this.c[var11][var6].c(var1 & 15, var2, var3 & 15, this.d.k);
         }
      } else {
         return 15;
      }
   }

   public int d(int var1, int var2, int var3) {
      if (var2 < 0) {
         return 0;
      } else if (var2 >= this.d.c) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.a;
         int var5 = (var3 >> 4) - this.b;
         return this.c[var4][var5].b(var1 & 15, var2, var3 & 15);
      }
   }

   public p e(int var1, int var2, int var3) {
      int var4 = this.a(var1, var2, var3);
      return var4 == 0 ? p.a : yy.k[var4].bZ;
   }

   public vh a() {
      return this.d.a();
   }

   public boolean f(int var1, int var2, int var3) {
      yy var4 = yy.k[this.a(var1, var2, var3)];
      return var4 == null ? false : var4.a();
   }

   public boolean g(int var1, int var2, int var3) {
      yy var4 = yy.k[this.a(var1, var2, var3)];
      if (var4 == null) {
         return false;
      } else {
         return var4.bZ.d() && var4.b();
      }
   }

   public boolean h(int var1, int var2, int var3) {
      yy var4 = yy.k[this.a(var1, var2, var3)];
      return var4 == null;
   }

   public int a(bn var1, int var2, int var3, int var4) {
      if (var3 < 0) {
         var3 = 0;
      }

      if (var3 >= this.d.c) {
         var3 = this.d.c - 1;
      }

      if (var3 >= 0 && var3 < this.d.c && var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 <= 30000000) {
         if (yy.s[this.a(var2, var3, var4)]) {
            int var10 = this.b(var1, var2, var3 + 1, var4);
            int var11 = this.b(var1, var2 + 1, var3, var4);
            int var7 = this.b(var1, var2 - 1, var3, var4);
            int var8 = this.b(var1, var2, var3, var4 + 1);
            int var9 = this.b(var1, var2, var3, var4 - 1);
            if (var11 > var10) {
               var10 = var11;
            }

            if (var7 > var10) {
               var10 = var7;
            }

            if (var8 > var10) {
               var10 = var8;
            }

            if (var9 > var10) {
               var10 = var9;
            }

            return var10;
         } else {
            int var5 = (var2 >> 4) - this.a;
            int var6 = (var4 >> 4) - this.b;
            return this.c[var5][var6].a(var1, var2 & 15, var3, var4 & 15);
         }
      } else {
         return var1.c;
      }
   }

   public int b(bn var1, int var2, int var3, int var4) {
      if (var3 < 0) {
         var3 = 0;
      }

      if (var3 >= this.d.c) {
         var3 = this.d.c - 1;
      }

      if (var3 >= 0 && var3 < this.d.c && var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 <= 30000000) {
         int var5 = (var2 >> 4) - this.a;
         int var6 = (var4 >> 4) - this.b;
         return this.c[var5][var6].a(var1, var2 & 15, var3, var4 & 15);
      } else {
         return var1.c;
      }
   }

   public int b() {
      return this.d.c;
   }
}
