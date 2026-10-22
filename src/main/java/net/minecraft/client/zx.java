package net.minecraft.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class zx {
   public static boolean a;
   public byte[] b;
   public int[] c;
   public boolean[] d;
   public boolean e;
   public ry f;
   public up g;
   public up h;
   public up i;
   public byte[] j;
   public int k;
   public final int l;
   public final int m;
   private boolean v;
   public Map n;
   public List[] o;
   public boolean p;
   public boolean q;
   public boolean r;
   public boolean s;
   public long t;
   boolean u;

   public zx(ry var1, int var2, int var3) {
      this.c = new int[256];
      this.d = new boolean[256];
      this.v = false;
      this.n = new HashMap();
      this.p = false;
      this.q = false;
      this.s = false;
      this.t = 0L;
      this.u = false;
      this.o = new List[var1.c / 16];
      this.f = var1;
      this.l = var2;
      this.m = var3;
      this.j = new byte[256];

      for(int var4 = 0; var4 < this.o.length; ++var4) {
         this.o[var4] = new ArrayList();
      }

      Arrays.fill(this.c, -999);
   }

   public zx(ry var1, byte[] var2, int var3, int var4) {
      this(var1, var3, var4);
      this.b = var2;
      this.g = new up(var2.length, var1.a);
      this.h = new up(var2.length, var1.a);
      this.i = new up(var2.length, var1.a);
   }

   public boolean a(int var1, int var2) {
      return var1 == this.l && var2 == this.m;
   }

   public int b(int var1, int var2) {
      return this.j[var2 << 4 | var1] & 255;
   }

   public void a() {
   }

   public void b() {
      int var1 = this.f.c - 1;

      for(int var2 = 0; var2 < 16; ++var2) {
         for(int var3 = 0; var3 < 16; ++var3) {
            this.c[var2 + (var3 << 4)] = -999;
            int var4 = this.f.c - 1;

            for(int var5 = var2 << this.f.b | var3 << this.f.a; var4 > 0 && yy.o[this.b[var5 + var4 - 1] & 255] == 0; --var4) {
            }

            this.j[var3 << 4 | var2] = (byte)var4;
            if (var4 < var1) {
               var1 = var4;
            }
         }
      }

      this.k = var1;
      this.q = true;
   }

   public void c() {
      int var1 = this.f.c - 1;

      for(int var2 = 0; var2 < 16; ++var2) {
         for(int var3 = 0; var3 < 16; ++var3) {
            int var4 = this.f.c - 1;

            int var5;
            for(var5 = var2 << this.f.b | var3 << this.f.a; var4 > 0 && yy.o[this.b[var5 + var4 - 1] & 255] == 0; --var4) {
            }

            this.j[var3 << 4 | var2] = (byte)var4;
            if (var4 < var1) {
               var1 = var4;
            }

            if (!this.f.y.e) {
               int var6 = 15;
               int var7 = this.f.c - 1;

               while(true) {
                  var6 -= yy.o[this.b[var5 + var7] & 255];
                  if (var6 > 0) {
                     this.h.a(var2, var7, var3, var6);
                  }

                  --var7;
                  if (var7 <= 0 || var6 <= 0) {
                     break;
                  }
               }
            }
         }
      }

      this.k = var1;

      for(int var8 = 0; var8 < 16; ++var8) {
         for(int var9 = 0; var9 < 16; ++var9) {
            this.d(var8, var9);
         }
      }

      this.q = true;
   }

   public void d() {
   }

   private void d(int var1, int var2) {
      this.d[var1 + var2 * 16] = true;
      this.v = true;
   }

   private void l() {
      if (this.f.e(this.l * 16 + 8, this.f.c / 2, this.m * 16 + 8, 16)) {
         for(int var1 = 0; var1 < 16; ++var1) {
            for(int var2 = 0; var2 < 16; ++var2) {
               if (this.d[var1 + var2 * 16]) {
                  this.d[var1 + var2 * 16] = false;
                  int var3 = this.b(var1, var2);
                  int var4 = this.l * 16 + var1;
                  int var5 = this.m * 16 + var2;
                  int var6 = this.f.d(var4 - 1, var5);
                  int var7 = this.f.d(var4 + 1, var5);
                  int var8 = this.f.d(var4, var5 - 1);
                  int var9 = this.f.d(var4, var5 + 1);
                  if (var7 < var6) {
                     var6 = var7;
                  }

                  if (var8 < var6) {
                     var6 = var8;
                  }

                  if (var9 < var6) {
                     var6 = var9;
                  }

                  this.f(var4, var5, var6);
                  this.f(var4 - 1, var5, var3);
                  this.f(var4 + 1, var5, var3);
                  this.f(var4, var5 - 1, var3);
                  this.f(var4, var5 + 1, var3);
                  this.v = false;
               }
            }
         }
      }

   }

   private void f(int var1, int var2, int var3) {
      int var4 = this.f.d(var1, var2);
      if (var4 > var3) {
         this.d(var1, var2, var3, var4 + 1);
      } else if (var4 < var3) {
         this.d(var1, var2, var4, var3 + 1);
      }

   }

   private void d(int var1, int var2, int var3, int var4) {
      if (var4 > var3 && this.f.e(var1, this.f.c / 2, var2, 16)) {
         for(int var5 = var3; var5 < var4; ++var5) {
            this.f.c(bn.a, var1, var5, var2);
         }

         this.q = true;
      }

   }

   private void g(int var1, int var2, int var3) {
      int var4 = this.j[var3 << 4 | var1] & 255;
      int var5 = var4;
      if (var2 > var4) {
         var5 = var2;
      }

      for(int var6 = var1 << this.f.b | var3 << this.f.a; var5 > 0 && yy.o[this.b[var6 + var5 - 1] & 255] == 0; --var5) {
      }

      if (var5 != var4) {
         this.f.i(var1, var3, var5, var4);
         this.j[var3 << 4 | var1] = (byte)var5;
         if (var5 < this.k) {
            this.k = var5;
         } else {
            int var7 = this.f.c - 1;

            for(int var8 = 0; var8 < 16; ++var8) {
               for(int var9 = 0; var9 < 16; ++var9) {
                  if ((this.j[var9 << 4 | var8] & 255) < var7) {
                     var7 = this.j[var9 << 4 | var8] & 255;
                  }
               }
            }

            this.k = var7;
         }

         int var13 = this.l * 16 + var1;
         int var14 = this.m * 16 + var3;
         if (!this.f.y.e) {
            if (var5 < var4) {
               for(int var16 = var5; var16 < var4; ++var16) {
                  this.h.a(var1, var16, var3, 15);
               }
            } else {
               for(int var15 = var4; var15 < var5; ++var15) {
                  this.h.a(var1, var15, var3, 0);
               }
            }

            for(int var17 = 15; var5 > 0 && var17 > 0; this.h.a(var1, var5, var3, var17)) {
               --var5;
               int var10 = yy.o[this.a(var1, var5, var3)];
               if (var10 == 0) {
                  var10 = 1;
               }

               var17 -= var10;
               if (var17 < 0) {
                  var17 = 0;
               }
            }
         }

         byte var18 = this.j[var3 << 4 | var1];
         int var19 = var4;
         int var11 = var18;
         if (var18 < var4) {
            var19 = var18;
            var11 = var4;
         }

         if (!this.f.y.e) {
            this.d(var13 - 1, var14, var19, var11);
            this.d(var13 + 1, var14, var19, var11);
            this.d(var13, var14 - 1, var19, var11);
            this.d(var13, var14 + 1, var19, var11);
            this.d(var13, var14, var19, var11);
         }

         this.q = true;
      }
   }

   public int a(int var1, int var2, int var3) {
      return this.b[var1 << this.f.b | var3 << this.f.a | var2] & 255;
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = (byte)var4;
      int var7 = var3 << 4 | var1;
      if (var2 >= this.c[var7] - 1) {
         this.c[var7] = -999;
      }

      int var8 = this.j[var3 << 4 | var1] & 255;
      int var9 = this.b[var1 << this.f.b | var3 << this.f.a | var2] & 255;
      if (var9 == var4 && this.g.a(var1, var2, var3) == var5) {
         return false;
      } else {
         int var10 = this.l * 16 + var1;
         int var11 = this.m * 16 + var3;
         this.b[var1 << this.f.b | var3 << this.f.a | var2] = (byte)(var6 & 255);
         if (var9 != 0) {
            if (!this.f.I) {
               yy.k[var9].d(this.f, var10, var2, var11);
            } else if (yy.k[var9] instanceof ba) {
               this.f.o(var10, var2, var11);
            }
         }

         this.g.a(var1, var2, var3, var5);
         if (!this.f.y.e) {
            if (yy.o[var6 & 255] != 0) {
               if (var2 >= var8) {
                  this.g(var1, var2 + 1, var3);
               }
            } else if (var2 == var8 - 1) {
               this.g(var1, var2, var3);
            }

            this.f.a(bn.a, var10, var2, var11, var10, var2, var11);
         }

         this.f.a(bn.b, var10, var2, var11, var10, var2, var11);
         this.d(var1, var3);
         this.g.a(var1, var2, var3, var5);
         if (var4 != 0) {
            if (!this.f.I) {
               yy.k[var4].a(this.f, var10, var2, var11);
            }

            if (yy.k[var4] instanceof ba) {
               bq var12 = this.d(var1, var2, var3);
               if (var12 == null) {
                  var12 = ((ba)yy.k[var4]).j_();
                  this.f.a(var1, var2, var3, var12);
               }

               if (var12 != null) {
                  var12.n();
               }
            }
         } else if (var9 > 0 && yy.k[var9] instanceof ba) {
            bq var13 = this.d(var1, var2, var3);
            if (var13 != null) {
               var13.n();
            }
         }

         this.q = true;
         return true;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      byte var5 = (byte)var4;
      int var6 = var3 << 4 | var1;
      if (var2 >= this.c[var6] - 1) {
         this.c[var6] = -999;
      }

      int var7 = this.j[var6] & 255;
      int var8 = this.b[var1 << this.f.b | var3 << this.f.a | var2] & 255;
      if (var8 == var4) {
         return false;
      } else {
         int var9 = this.l * 16 + var1;
         int var10 = this.m * 16 + var3;
         this.b[var1 << this.f.b | var3 << this.f.a | var2] = (byte)(var5 & 255);
         if (var8 != 0) {
            yy.k[var8].d(this.f, var9, var2, var10);
         }

         this.g.a(var1, var2, var3, 0);
         if (yy.o[var5 & 255] != 0) {
            if (var2 >= var7) {
               this.g(var1, var2 + 1, var3);
            }
         } else if (var2 == var7 - 1) {
            this.g(var1, var2, var3);
         }

         this.f.a(bn.a, var9, var2, var10, var9, var2, var10);
         this.f.a(bn.b, var9, var2, var10, var9, var2, var10);
         this.d(var1, var3);
         if (var4 != 0) {
            if (!this.f.I) {
               yy.k[var4].a(this.f, var9, var2, var10);
            }

            if (var4 > 0 && yy.k[var4] instanceof ba) {
               bq var11 = this.d(var1, var2, var3);
               if (var11 == null) {
                  var11 = ((ba)yy.k[var4]).j_();
                  this.f.a(var1, var2, var3, var11);
               }

               if (var11 != null) {
                  var11.n();
               }
            }
         } else if (var8 > 0 && yy.k[var8] instanceof ba) {
            bq var12 = this.d(var1, var2, var3);
            if (var12 != null) {
               var12.n();
            }
         }

         this.q = true;
         return true;
      }
   }

   public int b(int var1, int var2, int var3) {
      return this.g.a(var1, var2, var3);
   }

   public boolean b(int var1, int var2, int var3, int var4) {
      this.q = true;
      int var5 = this.g.a(var1, var2, var3);
      if (var5 == var4) {
         return false;
      } else {
         this.g.a(var1, var2, var3, var4);
         int var6 = this.a(var1, var2, var3);
         if (var6 > 0 && yy.k[var6] instanceof ba) {
            bq var7 = this.d(var1, var2, var3);
            if (var7 != null) {
               var7.n();
               var7.h = var4;
            }
         }

         return true;
      }
   }

   public int a(bn var1, int var2, int var3, int var4) {
      if (var1 == bn.a) {
         return this.h.a(var2, var3, var4);
      } else {
         return var1 == bn.b ? this.i.a(var2, var3, var4) : 0;
      }
   }

   public void a(bn var1, int var2, int var3, int var4, int var5) {
      this.q = true;
      if (var1 == bn.a) {
         if (!this.f.y.e) {
            this.h.a(var2, var3, var4, var5);
         }
      } else {
         if (var1 != bn.b) {
            return;
         }

         this.i.a(var2, var3, var4, var5);
      }

   }

   public int c(int var1, int var2, int var3, int var4) {
      int var5 = this.f.y.e ? 0 : this.h.a(var1, var2, var3);
      if (var5 > 0) {
         a = true;
      }

      var5 -= var4;
      int var6 = this.i.a(var1, var2, var3);
      if (var6 > var5) {
         var5 = var6;
      }

      return var5;
   }

   public void a(ia var1) {
      this.s = true;
      int var2 = me.c(var1.s / (double)16.0F);
      int var3 = me.c(var1.u / (double)16.0F);
      if (var2 != this.l || var3 != this.m) {
         System.out.println("Wrong location! " + var1);
         (new Throwable()).printStackTrace();
      }

      int var4 = me.c(var1.t / (double)16.0F);
      if (var4 < 0) {
         var4 = 0;
      }

      if (var4 >= this.o.length) {
         var4 = this.o.length - 1;
      }

      var1.ah = true;
      var1.ai = this.l;
      var1.aj = var4;
      var1.ak = this.m;
      this.o[var4].add(var1);
   }

   public void b(ia var1) {
      this.a(var1, var1.aj);
   }

   public void a(ia var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 >= this.o.length) {
         var2 = this.o.length - 1;
      }

      this.o[var2].remove(var1);
   }

   public boolean c(int var1, int var2, int var3) {
      return var2 >= (this.j[var3 << 4 | var1] & 255);
   }

   public bq d(int var1, int var2, int var3) {
      am var4 = new am(var1, var2, var3);
      bq var5 = (bq)this.n.get(var4);
      if (var5 == null) {
         int var6 = this.a(var1, var2, var3);
         if (!yy.n[var6]) {
            return null;
         }

         if (var5 == null) {
            var5 = ((ba)yy.k[var6]).j_();
            this.f.a(this.l * 16 + var1, var2, this.m * 16 + var3, var5);
         }

         var5 = (bq)this.n.get(var4);
      }

      if (var5 != null && var5.i()) {
         this.n.remove(var4);
         return null;
      } else {
         return var5;
      }
   }

   public void a(bq var1) {
      int var2 = var1.d - this.l * 16;
      int var3 = var1.e;
      int var4 = var1.f - this.m * 16;
      this.a(var2, var3, var4, var1);
      if (this.e) {
         this.f.h.add(var1);
      }

   }

   public void a(int var1, int var2, int var3, bq var4) {
      am var5 = new am(var1, var2, var3);
      var4.c = this.f;
      var4.d = this.l * 16 + var1;
      var4.e = var2;
      var4.f = this.m * 16 + var3;
      if (this.a(var1, var2, var3) != 0 && yy.k[this.a(var1, var2, var3)] instanceof ba) {
         var4.m();
         this.n.put(var5, var4);
      }
   }

   public void e(int var1, int var2, int var3) {
      am var4 = new am(var1, var2, var3);
      if (this.e) {
         bq var5 = (bq)this.n.remove(var4);
         if (var5 != null) {
            var5.l();
         }
      }

   }

   public void e() {
      this.e = true;
      this.f.a(this.n.values());

      for(int var1 = 0; var1 < this.o.length; ++var1) {
         this.f.a(this.o[var1]);
      }

   }

   public void f() {
      this.e = false;

      for(bq var2 : (Iterable<bq>)(Iterable)(this.n.values())) {
         this.f.a(var2);
      }

      for(int var3 = 0; var3 < this.o.length; ++var3) {
         this.f.b(this.o[var3]);
      }

   }

   public void g() {
      this.q = true;
   }

   public void a(ia var1, c var2, List var3) {
      int var4 = me.c((var2.b - (double)2.0F) / (double)16.0F);
      int var5 = me.c((var2.e + (double)2.0F) / (double)16.0F);
      if (var4 < 0) {
         var4 = 0;
      }

      if (var5 >= this.o.length) {
         var5 = this.o.length - 1;
      }

      for(int var6 = var4; var6 <= var5; ++var6) {
         List var7 = this.o[var6];

         for(int var8 = 0; var8 < var7.size(); ++var8) {
            ia var9 = (ia)var7.get(var8);
            if (var9 != var1 && var9.C.a(var2)) {
               var3.add(var9);
               ia[] var10 = var9.ab();
               if (var10 != null) {
                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     var9 = var10[var11];
                     if (var9 != var1 && var9.C.a(var2)) {
                        var3.add(var9);
                     }
                  }
               }
            }
         }
      }

   }

   public void a(Class var1, c var2, List var3) {
      int var4 = me.c((var2.b - (double)2.0F) / (double)16.0F);
      int var5 = me.c((var2.e + (double)2.0F) / (double)16.0F);
      if (var4 < 0) {
         var4 = 0;
      } else if (var4 >= this.o.length) {
         var4 = this.o.length - 1;
      }

      if (var5 >= this.o.length) {
         var5 = this.o.length - 1;
      } else if (var5 < 0) {
         var5 = 0;
      }

      for(int var6 = var4; var6 <= var5; ++var6) {
         List var7 = this.o[var6];

         for(int var8 = 0; var8 < var7.size(); ++var8) {
            ia var9 = (ia)var7.get(var8);
            if (var1.isAssignableFrom(var9.getClass()) && var9.C.a(var2)) {
               var3.add(var9);
            }
         }
      }

   }

   public boolean a(boolean var1) {
      if (this.r) {
         return false;
      } else {
         if (var1) {
            if (this.s && this.f.u() != this.t) {
               return true;
            }
         } else if (this.s && this.f.u() >= this.t + 600L) {
            return true;
         }

         return this.q;
      }
   }

   public int a(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = var2; var9 < var5; ++var9) {
         for(int var10 = var4; var10 < var7; ++var10) {
            int var11 = var9 << this.f.b | var10 << this.f.a | var3;
            int var12 = var6 - var3;
            System.arraycopy(var1, var8, this.b, var11, var12);
            var8 += var12;
         }
      }

      this.b();

      for(int var13 = var2; var13 < var5; ++var13) {
         for(int var17 = var4; var17 < var7; ++var17) {
            int var21 = (var13 << this.f.b | var17 << this.f.a | var3) >> 1;
            int var24 = (var6 - var3) / 2;
            System.arraycopy(var1, var8, this.g.a, var21, var24);
            var8 += var24;
         }
      }

      for(int var14 = var2; var14 < var5; ++var14) {
         for(int var18 = var4; var18 < var7; ++var18) {
            int var22 = (var14 << this.f.b | var18 << this.f.a | var3) >> 1;
            int var25 = (var6 - var3) / 2;
            System.arraycopy(var1, var8, this.i.a, var22, var25);
            var8 += var25;
         }
      }

      for(int var15 = var2; var15 < var5; ++var15) {
         for(int var19 = var4; var19 < var7; ++var19) {
            int var23 = (var15 << this.f.b | var19 << this.f.a | var3) >> 1;
            int var26 = (var6 - var3) / 2;
            System.arraycopy(var1, var8, this.h.a, var23, var26);
            var8 += var26;
         }
      }

      for(bq var20 : (Iterable<bq>)(Iterable)(this.n.values())) {
         var20.n();
      }

      return var8;
   }

   public Random a(long var1) {
      return new Random(this.f.t() + (long)(this.l * this.l * 4987142) + (long)(this.l * 5947611) + (long)(this.m * this.m) * 4392871L + (long)(this.m * 389711) ^ var1);
   }

   public boolean h() {
      return false;
   }

   public void i() {
      aig.a(this.b);
   }

   public void a(ej var1, ej var2, int var3, int var4) {
      if (!this.p && var1.c(var3 + 1, var4 + 1) && var1.c(var3, var4 + 1) && var1.c(var3 + 1, var4)) {
         var1.a(var2, var3, var4);
      }

      if (var1.c(var3 - 1, var4) && !var1.b(var3 - 1, var4).p && var1.c(var3 - 1, var4 + 1) && var1.c(var3, var4 + 1) && var1.c(var3 - 1, var4 + 1)) {
         var1.a(var2, var3 - 1, var4);
      }

      if (var1.c(var3, var4 - 1) && !var1.b(var3, var4 - 1).p && var1.c(var3 + 1, var4 - 1) && var1.c(var3 + 1, var4 - 1) && var1.c(var3 + 1, var4)) {
         var1.a(var2, var3, var4 - 1);
      }

      if (var1.c(var3 - 1, var4 - 1) && !var1.b(var3 - 1, var4 - 1).p && var1.c(var3, var4 - 1) && var1.c(var3 - 1, var4)) {
         var1.a(var2, var3 - 1, var4 - 1);
      }

   }

   public int c(int var1, int var2) {
      int var3 = var1 | var2 << 4;
      int var4 = this.c[var3];
      if (var4 == -999) {
         int var5 = this.f.c - 1;
         var4 = -1;

         while(var5 > 0 && var4 == -1) {
            int var6 = this.a(var1, var5, var2);
            p var7 = var6 == 0 ? net.minecraft.client.p.a : net.minecraft.client.yy.k[var6].bZ;
            if (!var7.d() && !var7.a()) {
               --var5;
            } else {
               var4 = var5 + 1;
            }
         }

         this.c[var3] = var4;
      }

      return var4;
   }

   public void j() {
      if (this.v && !this.f.y.e) {
         this.l();
      }

   }

   public acm k() {
      return new acm(this.l, this.m);
   }
}
