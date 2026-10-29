package net.minecraft.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ry implements kq {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public boolean f;
   public List g;
   private List J;
   private TreeSet K;
   private Set L;
   public List h;
   private List M;
   private List N;
   public List i;
   public List j;
   private long O;
   public int k;
   protected int l;
   protected final int m;
   protected float n;
   protected float o;
   protected float p;
   protected float q;
   protected int r;
   public int s;
   public boolean t;
   private long P;
   protected int u;
   public int v;
   public Random w;
   public boolean x;
   public final k y;
   protected List z;
   protected ej A;
   protected final nh B;
   protected si C;
   public boolean D;
   private boolean Q;
   public ew E;
   private ArrayList R;
   private boolean S;
   protected boolean F;
   protected boolean G;
   private Set T;
   private int U;
   int[] H;
   private List V;
   public boolean I;

   public vh a() {
      return this.y.b;
   }

   public ry(nh var1, String var2, k var3, yw var4) {
      this.a = 7;
      this.b = this.a + 4;
      this.c = 1 << this.a;
      this.d = this.c - 1;
      this.e = this.c / 2 - 1;
      this.f = false;
      this.g = new ArrayList();
      this.J = new ArrayList();
      this.K = new TreeSet();
      this.L = new HashSet();
      this.h = new ArrayList();
      this.M = new ArrayList();
      this.N = new ArrayList();
      this.i = new ArrayList();
      this.j = new ArrayList();
      this.O = 16777215L;
      this.k = 0;
      this.l = (new net.minecraft.client.web.JRandom()).nextInt();
      this.m = 1013904223;
      this.r = 0;
      this.s = 0;
      this.t = false;
      this.P = System.currentTimeMillis();
      this.u = 40;
      this.w = new net.minecraft.client.web.JRandom();
      this.x = false;
      this.z = new ArrayList();
      this.R = new ArrayList();
      this.F = true;
      this.G = true;
      this.T = new HashSet();
      this.U = this.w.nextInt(12000);
      this.H = new int['耀'];
      this.V = new ArrayList();
      this.I = false;
      this.B = var1;
      this.C = new si(var4, var2);
      this.y = var3;
      this.E = new ew(var1);
      var3.a(this);
      this.A = this.d();
      this.p();
      this.H();
   }

   public ry(ry var1, k var2) {
      this.a = 7;
      this.b = this.a + 4;
      this.c = 1 << this.a;
      this.d = this.c - 1;
      this.e = this.c / 2 - 1;
      this.f = false;
      this.g = new ArrayList();
      this.J = new ArrayList();
      this.K = new TreeSet();
      this.L = new HashSet();
      this.h = new ArrayList();
      this.M = new ArrayList();
      this.N = new ArrayList();
      this.i = new ArrayList();
      this.j = new ArrayList();
      this.O = 16777215L;
      this.k = 0;
      this.l = (new net.minecraft.client.web.JRandom()).nextInt();
      this.m = 1013904223;
      this.r = 0;
      this.s = 0;
      this.t = false;
      this.P = System.currentTimeMillis();
      this.u = 40;
      this.w = new net.minecraft.client.web.JRandom();
      this.x = false;
      this.z = new ArrayList();
      this.R = new ArrayList();
      this.F = true;
      this.G = true;
      this.T = new HashSet();
      this.U = this.w.nextInt(12000);
      this.H = new int['耀'];
      this.V = new ArrayList();
      this.I = false;
      this.P = var1.P;
      this.B = var1.B;
      this.C = new si(var1.C);
      this.E = new ew(this.B);
      this.y = var2;
      var2.a(this);
      this.A = this.d();
      this.p();
      this.H();
   }

   public ry(nh var1, String var2, yw var3) {
      this(var1, var2, (yw)var3, (k)null);
   }

   public ry(nh var1, String var2, yw var3, k var4) {
      this.a = 7;
      this.b = this.a + 4;
      this.c = 1 << this.a;
      this.d = this.c - 1;
      this.e = this.c / 2 - 1;
      this.f = false;
      this.g = new ArrayList();
      this.J = new ArrayList();
      this.K = new TreeSet();
      this.L = new HashSet();
      this.h = new ArrayList();
      this.M = new ArrayList();
      this.N = new ArrayList();
      this.i = new ArrayList();
      this.j = new ArrayList();
      this.O = 16777215L;
      this.k = 0;
      this.l = (new net.minecraft.client.web.JRandom()).nextInt();
      this.m = 1013904223;
      this.r = 0;
      this.s = 0;
      this.t = false;
      this.P = System.currentTimeMillis();
      this.u = 40;
      this.w = new net.minecraft.client.web.JRandom();
      this.x = false;
      this.z = new ArrayList();
      this.R = new ArrayList();
      this.F = true;
      this.G = true;
      this.T = new HashSet();
      this.U = this.w.nextInt(12000);
      this.H = new int['耀'];
      this.V = new ArrayList();
      this.I = false;
      this.B = var1;
      this.E = new ew(var1);
      this.C = var1.c();
      this.x = this.C == null;
      if (var4 != null) {
         this.y = var4;
      } else if (this.C != null && this.C.i() != 0) {
         this.y = net.minecraft.client.k.a(this.C.i());
      } else {
         this.y = net.minecraft.client.k.a(0);
      }

      boolean var5 = false;
      if (this.C == null) {
         this.C = new si(var3, var2);
         var5 = true;
      } else {
         this.C.a(var2);
      }

      this.y.a(this);
      this.A = this.d();
      if (var5) {
         this.i();
      }

      this.p();
      this.H();
   }

   protected ej d() {
      d var1 = this.B.a(this.y);
      return new jz(this, var1, this.y.c());
   }

   protected void i() {
      this.D = true;
      vh var1 = this.a();
      List var2 = var1.a();
      Random var3 = new net.minecraft.client.web.JRandom(this.t());
      am var4 = var1.a(0, 0, 256, var2, var3);
      int var5 = 0;
      int var6 = this.c / 2;
      int var7 = 0;
      if (var4 != null) {
         var5 = var4.a;
         var7 = var4.c;
      } else {
         System.out.println("Unable to find spawn biome");
      }

      int var8 = 0;

      while(!this.y.a(var5, var7)) {
         var5 += var3.nextInt(64) - var3.nextInt(64);
         var7 += var3.nextInt(64) - var3.nextInt(64);
         ++var8;
         if (var8 == 1000) {
            break;
         }
      }

      this.C.a(var5, var6, var7);
      this.D = false;
   }

   public dh j() {
      return this.y.g();
   }

   public void e() {
      if (this.C.d() <= 0) {
         this.C.b(this.c / 2);
      }

      int var1 = this.C.c();
      int var2 = this.C.e();
      int var3 = 0;

      while(this.a(var1, var2) == 0) {
         var1 += this.w.nextInt(8) - this.w.nextInt(8);
         var2 += this.w.nextInt(8) - this.w.nextInt(8);
         ++var3;
         if (var3 == 10000) {
            break;
         }
      }

      this.C.a(var1);
      this.C.c(var2);
   }

   public int a(int var1, int var2) {
      int var3;
      for(var3 = this.e; !this.h(var1, var3 + 1, var2); ++var3) {
      }

      return this.a(var1, var3, var2);
   }

   public void k() {
   }

   public void a(vi var1) {
      try {
         ik var2 = this.C.h();
         if (var2 != null) {
            var1.e(var2);
            this.C.a((ik)null);
         }

         if (this.A instanceof mv) {
            mv var3 = (mv)this.A;
            int var4 = me.d((float)((int)var1.s)) >> 4;
            int var5 = me.d((float)((int)var1.u)) >> 4;
            var3.d(var4, var5);
         }

         this.a((ia)var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public void a(boolean var1, rz var2) {
      if (this.A.b()) {
         if (var2 != null) {
            var2.a("Saving level");
         }

         this.G();
         if (var2 != null) {
            var2.b("Saving chunks");
         }

         this.A.a(var1, var2);
      }
   }

   private void G() {
      this.s();
      this.B.a(this.C, this.i);
      this.E.a();
   }

   public boolean c(int var1) {
      if (!this.A.b()) {
         return true;
      } else {
         if (var1 == 0) {
            this.G();
         }

         return this.A.a(false, (rz)null);
      }
   }

   public int a(int var1, int var2, int var3) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if (var2 < 0) {
            return 0;
         } else {
            return var2 >= this.c ? 0 : this.c(var1 >> 4, var3 >> 4).a(var1 & 15, var2, var3 & 15);
         }
      } else {
         return 0;
      }
   }

   public boolean h(int var1, int var2, int var3) {
      return this.a(var1, var2, var3) == 0;
   }

   public boolean i(int var1, int var2, int var3) {
      return var2 >= 0 && var2 < this.c ? this.g(var1 >> 4, var3 >> 4) : false;
   }

   public boolean e(int var1, int var2, int var3, int var4) {
      return this.b(var1 - var4, var2 - var4, var3 - var4, var1 + var4, var2 + var4, var3 + var4);
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 >= 0 && var2 < this.c) {
         var1 >>= 4;
         var2 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var5 >>= 4;
         var6 >>= 4;

         for(int var7 = var1; var7 <= var4; ++var7) {
            for(int var8 = var3; var8 <= var6; ++var8) {
               if (!this.g(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean g(int var1, int var2) {
      return this.A.c(var1, var2);
   }

   public zx b(int var1, int var2) {
      return this.c(var1 >> 4, var2 >> 4);
   }

   public zx c(int var1, int var2) {
      return this.A.b(var1, var2);
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if (var2 < 0) {
            return false;
         } else if (var2 >= this.c) {
            return false;
         } else {
            zx var6 = this.c(var1 >> 4, var3 >> 4);
            boolean var7 = var6.a(var1 & 15, var2, var3 & 15, var4, var5);
            this.s(var1, var2, var3);
            return var7;
         }
      } else {
         return false;
      }
   }

   public boolean d(int var1, int var2, int var3, int var4) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if (var2 < 0) {
            return false;
         } else if (var2 >= this.c) {
            return false;
         } else {
            zx var5 = this.c(var1 >> 4, var3 >> 4);
            boolean var6 = var5.a(var1 & 15, var2, var3 & 15, var4);
            this.s(var1, var2, var3);
            return var6;
         }
      } else {
         return false;
      }
   }

   public p e(int var1, int var2, int var3) {
      int var4 = this.a(var1, var2, var3);
      return var4 == 0 ? net.minecraft.client.p.a : net.minecraft.client.yy.k[var4].bZ;
   }

   public int d(int var1, int var2, int var3) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if (var2 < 0) {
            return 0;
         } else if (var2 >= this.c) {
            return 0;
         } else {
            zx var4 = this.c(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var4.b(var1, var2, var3);
         }
      } else {
         return 0;
      }
   }

   public void f(int var1, int var2, int var3, int var4) {
      if (this.c(var1, var2, var3, var4)) {
         int var5 = this.a(var1, var2, var3);
         if (yy.r[var5 & 255]) {
            this.h(var1, var2, var3, var5);
         } else {
            this.j(var1, var2, var3, var5);
         }
      }

   }

   public boolean c(int var1, int var2, int var3, int var4) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if (var2 < 0) {
            return false;
         } else if (var2 >= this.c) {
            return false;
         } else {
            zx var5 = this.c(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var5.b(var1, var2, var3, var4);
         }
      } else {
         return false;
      }
   }

   public boolean g(int var1, int var2, int var3, int var4) {
      if (this.d(var1, var2, var3, var4)) {
         this.h(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public boolean d(int var1, int var2, int var3, int var4, int var5) {
      if (this.b(var1, var2, var3, var4, var5)) {
         this.h(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void j(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.z.size(); ++var4) {
         ((bd)this.z.get(var4)).a(var1, var2, var3);
      }

   }

   protected void h(int var1, int var2, int var3, int var4) {
      this.j(var1, var2, var3);
      this.j(var1, var2, var3, var4);
   }

   public void i(int var1, int var2, int var3, int var4) {
      if (var3 > var4) {
         int var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      if (!this.y.e) {
         for(int var6 = var3; var6 <= var4; ++var6) {
            this.c(bn.a, var1, var6, var2);
         }
      }

      this.c(var1, var3, var2, var1, var4, var2);
   }

   public void k(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.z.size(); ++var4) {
         ((bd)this.z.get(var4)).a(var1, var2, var3, var1, var2, var3);
      }

   }

   public void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.z.size(); ++var7) {
         ((bd)this.z.get(var7)).a(var1, var2, var3, var4, var5, var6);
      }

   }

   public void j(int var1, int var2, int var3, int var4) {
      this.m(var1 - 1, var2, var3, var4);
      this.m(var1 + 1, var2, var3, var4);
      this.m(var1, var2 - 1, var3, var4);
      this.m(var1, var2 + 1, var3, var4);
      this.m(var1, var2, var3 - 1, var4);
      this.m(var1, var2, var3 + 1, var4);
   }

   private void m(int var1, int var2, int var3, int var4) {
      if (!this.t && !this.I) {
         yy var5 = yy.k[this.a(var1, var2, var3)];
         if (var5 != null) {
            var5.a(this, var1, var2, var3, var4);
         }

      }
   }

   public boolean l(int var1, int var2, int var3) {
      return this.c(var1 >> 4, var3 >> 4).c(var1 & 15, var2, var3 & 15);
   }

   public int m(int var1, int var2, int var3) {
      if (var2 < 0) {
         return 0;
      } else {
         if (var2 >= this.c) {
            var2 = this.c - 1;
         }

         return this.c(var1 >> 4, var3 >> 4).c(var1 & 15, var2, var3 & 15, 0);
      }
   }

   public int n(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, true);
   }

   public int a(int var1, int var2, int var3, boolean var4) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if (var4) {
            int var5 = this.a(var1, var2, var3);
            if (var5 == yy.ak.bM || var5 == yy.aA.bM || var5 == yy.aH.bM || var5 == yy.at.bM) {
               int var6 = this.a(var1, var2 + 1, var3, false);
               int var7 = this.a(var1 + 1, var2, var3, false);
               int var8 = this.a(var1 - 1, var2, var3, false);
               int var9 = this.a(var1, var2, var3 + 1, false);
               int var10 = this.a(var1, var2, var3 - 1, false);
               if (var7 > var6) {
                  var6 = var7;
               }

               if (var8 > var6) {
                  var6 = var8;
               }

               if (var9 > var6) {
                  var6 = var9;
               }

               if (var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if (var2 < 0) {
            return 0;
         } else {
            if (var2 >= this.c) {
               var2 = this.c - 1;
            }

            zx var13 = this.c(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var13.c(var1, var2, var3, this.k);
         }
      } else {
         return 15;
      }
   }

   public int d(int var1, int var2) {
      if (var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         if (!this.g(var1 >> 4, var2 >> 4)) {
            return 0;
         } else {
            zx var3 = this.c(var1 >> 4, var2 >> 4);
            return var3.b(var1 & 15, var2 & 15);
         }
      } else {
         return 0;
      }
   }

   public int a(bn var1, int var2, int var3, int var4) {
      if (this.y.e && var1 == bn.a) {
         return 0;
      } else {
         if (var3 < 0) {
            var3 = 0;
         }

         if (var3 >= this.c && var1 == bn.a) {
            return 15;
         } else if (var3 >= 0 && var3 < this.c && var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
            int var5 = var2 >> 4;
            int var6 = var4 >> 4;
            if (!this.g(var5, var6)) {
               return 0;
            } else if (yy.s[this.a(var2, var3, var4)]) {
               int var12 = this.b(var1, var2, var3 + 1, var4);
               int var8 = this.b(var1, var2 + 1, var3, var4);
               int var9 = this.b(var1, var2 - 1, var3, var4);
               int var10 = this.b(var1, var2, var3, var4 + 1);
               int var11 = this.b(var1, var2, var3, var4 - 1);
               if (var8 > var12) {
                  var12 = var8;
               }

               if (var9 > var12) {
                  var12 = var9;
               }

               if (var10 > var12) {
                  var12 = var10;
               }

               if (var11 > var12) {
                  var12 = var11;
               }

               return var12;
            } else {
               zx var7 = this.c(var5, var6);
               return var7.a(var1, var2 & 15, var3, var4 & 15);
            }
         } else {
            return var1.c;
         }
      }
   }

   public int b(bn var1, int var2, int var3, int var4) {
      if (var3 < 0) {
         var3 = 0;
      }

      if (var3 >= this.c) {
         var3 = this.c - 1;
      }

      if (var3 >= 0 && var3 < this.c && var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
         int var5 = var2 >> 4;
         int var6 = var4 >> 4;
         if (!this.g(var5, var6)) {
            return 0;
         } else {
            zx var7 = this.c(var5, var6);
            return var7.a(var1, var2 & 15, var3, var4 & 15);
         }
      } else {
         return var1.c;
      }
   }

   public void a(bn var1, int var2, int var3, int var4, int var5) {
      if (var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
         if (var3 >= 0) {
            if (var3 < this.c) {
               if (this.g(var2 >> 4, var4 >> 4)) {
                  zx var6 = this.c(var2 >> 4, var4 >> 4);
                  var6.a(var1, var2 & 15, var3, var4 & 15, var5);

                  for(int var7 = 0; var7 < this.z.size(); ++var7) {
                     ((bd)this.z.get(var7)).a(var2, var3, var4);
                  }

               }
            }
         }
      }
   }

   public int a(int var1, int var2, int var3, int var4) {
      int var5 = this.a(bn.a, var1, var2, var3);
      int var6 = this.a(bn.b, var1, var2, var3);
      if (var6 < var4) {
         var6 = var4;
      }

      return var5 << 20 | var6 << 4;
   }

   public float b(int var1, int var2, int var3, int var4) {
      int var5 = this.n(var1, var2, var3);
      if (var5 < var4) {
         var5 = var4;
      }

      return this.y.f[var5];
   }

   public float c(int var1, int var2, int var3) {
      return this.y.f[this.n(var1, var2, var3)];
   }

   public boolean l() {
      return this.k < 4;
   }

   public gv a(fb var1, fb var2) {
      return this.a(var1, var2, false, false);
   }

   public gv a(fb var1, fb var2, boolean var3) {
      return this.a(var1, var2, var3, false);
   }

   public gv a(fb var1, fb var2, boolean var3, boolean var4) {
      if (!Double.isNaN(var1.a) && !Double.isNaN(var1.b) && !Double.isNaN(var1.c)) {
         if (!Double.isNaN(var2.a) && !Double.isNaN(var2.b) && !Double.isNaN(var2.c)) {
            int var5 = me.c(var2.a);
            int var6 = me.c(var2.b);
            int var7 = me.c(var2.c);
            int var8 = me.c(var1.a);
            int var9 = me.c(var1.b);
            int var10 = me.c(var1.c);
            int var11 = this.a(var8, var9, var10);
            int var12 = this.d(var8, var9, var10);
            yy var13 = yy.k[var11];
            if ((!var4 || var13 == null || var13.b(this, var8, var9, var10) != null) && var11 > 0 && var13.a(var12, var3)) {
               gv var14 = var13.a(this, var8, var9, var10, var1, var2);
               if (var14 != null) {
                  return var14;
               }
            }

            var11 = 200;

            while(var11-- >= 0) {
               if (Double.isNaN(var1.a) || Double.isNaN(var1.b) || Double.isNaN(var1.c)) {
                  return null;
               }

               if (var8 == var5 && var9 == var6 && var10 == var7) {
                  return null;
               }

               var12 = 1;
               boolean var41 = true;
               boolean var42 = true;
               double var15 = (double)999.0F;
               double var17 = (double)999.0F;
               double var19 = (double)999.0F;
               if (var5 > var8) {
                  var15 = (double)var8 + (double)1.0F;
               } else if (var5 < var8) {
                  var15 = (double)var8 + (double)0.0F;
               } else {
                  var12 = 0;
               }

               if (var6 > var9) {
                  var17 = (double)var9 + (double)1.0F;
               } else if (var6 < var9) {
                  var17 = (double)var9 + (double)0.0F;
               } else {
                  var41 = false;
               }

               if (var7 > var10) {
                  var19 = (double)var10 + (double)1.0F;
               } else if (var7 < var10) {
                  var19 = (double)var10 + (double)0.0F;
               } else {
                  var42 = false;
               }

               double var21 = (double)999.0F;
               double var23 = (double)999.0F;
               double var25 = (double)999.0F;
               double var27 = var2.a - var1.a;
               double var29 = var2.b - var1.b;
               double var31 = var2.c - var1.c;
               if (var12 != 0) {
                  var21 = (var15 - var1.a) / var27;
               }

               if (var41) {
                  var23 = (var17 - var1.b) / var29;
               }

               if (var42) {
                  var25 = (var19 - var1.c) / var31;
               }

               byte var33 = 0;
               if (var21 < var23 && var21 < var25) {
                  if (var5 > var8) {
                     var33 = 4;
                  } else {
                     var33 = 5;
                  }

                  var1.a = var15;
                  var1.b += var29 * var21;
                  var1.c += var31 * var21;
               } else if (var23 < var25) {
                  if (var6 > var9) {
                     var33 = 0;
                  } else {
                     var33 = 1;
                  }

                  var1.a += var27 * var23;
                  var1.b = var17;
                  var1.c += var31 * var23;
               } else {
                  if (var7 > var10) {
                     var33 = 2;
                  } else {
                     var33 = 3;
                  }

                  var1.a += var27 * var25;
                  var1.b += var29 * var25;
                  var1.c = var19;
               }

               fb var34 = fb.b(var1.a, var1.b, var1.c);
               var8 = (int)(var34.a = (double)me.c(var1.a));
               if (var33 == 5) {
                  --var8;
                  ++var34.a;
               }

               var9 = (int)(var34.b = (double)me.c(var1.b));
               if (var33 == 1) {
                  --var9;
                  ++var34.b;
               }

               var10 = (int)(var34.c = (double)me.c(var1.c));
               if (var33 == 3) {
                  --var10;
                  ++var34.c;
               }

               int var35 = this.a(var8, var9, var10);
               int var36 = this.d(var8, var9, var10);
               yy var37 = yy.k[var35];
               if ((!var4 || var37 == null || var37.b(this, var8, var9, var10) != null) && var35 > 0 && var37.a(var36, var3)) {
                  gv var38 = var37.a(this, var8, var9, var10, var1, var2);
                  if (var38 != null) {
                     return var38;
                  }
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void a(ia var1, String var2, float var3, float var4) {
      for(int var5 = 0; var5 < this.z.size(); ++var5) {
         ((bd)this.z.get(var5)).a(var2, var1.s, var1.t - (double)var1.L, var1.u, var3, var4);
      }

   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9) {
      for(int var10 = 0; var10 < this.z.size(); ++var10) {
         ((bd)this.z.get(var10)).a(var7, var1, var3, var5, var8, var9);
      }

   }

   public void a(String var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < this.z.size(); ++var5) {
         ((bd)this.z.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      for(int var14 = 0; var14 < this.z.size(); ++var14) {
         ((bd)this.z.get(var14)).a(var1, var2, var4, var6, var8, var10, var12);
      }

   }

   public boolean e(ia var1) {
      this.j.add(var1);
      return true;
   }

   public boolean a(ia var1) {
      int var2 = me.c(var1.s / (double)16.0F);
      int var3 = me.c(var1.u / (double)16.0F);
      boolean var4 = false;
      if (var1 instanceof vi) {
         var4 = true;
      }

      if (!var4 && !this.g(var2, var3)) {
         return false;
      } else {
         if (var1 instanceof vi) {
            vi var5 = (vi)var1;
            this.i.add(var5);
            this.A();
         }

         this.c(var2, var3).a(var1);
         this.g.add(var1);
         this.c(var1);
         return true;
      }
   }

   protected void c(ia var1) {
      for(int var2 = 0; var2 < this.z.size(); ++var2) {
         ((bd)this.z.get(var2)).a(var1);
      }

   }

   protected void d(ia var1) {
      for(int var2 = 0; var2 < this.z.size(); ++var2) {
         ((bd)this.z.get(var2)).b(var1);
      }

   }

   public void b(ia var1) {
      if (var1.m != null) {
         var1.m.g((ia)null);
      }

      if (var1.n != null) {
         var1.g((ia)null);
      }

      var1.v();
      if (var1 instanceof vi) {
         this.i.remove((vi)var1);
         this.A();
      }

   }

   public void a(bd var1) {
      this.z.add(var1);
   }

   public void b(bd var1) {
      this.z.remove(var1);
   }

   public List a(ia var1, c var2) {
      this.R.clear();
      int var3 = me.c(var2.a);
      int var4 = me.c(var2.d + (double)1.0F);
      int var5 = me.c(var2.b);
      int var6 = me.c(var2.e + (double)1.0F);
      int var7 = me.c(var2.c);
      int var8 = me.c(var2.f + (double)1.0F);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var7; var10 < var8; ++var10) {
            if (this.i(var9, this.c / 2, var10)) {
               for(int var11 = var5 - 1; var11 < var6; ++var11) {
                  yy var12 = yy.k[this.a(var9, var11, var10)];
                  if (var12 != null) {
                     var12.a(this, var9, var11, var10, var2, this.R);
                  }
               }
            }
         }
      }

      double var14 = (double)0.25F;
      List var15 = this.b(var1, var2.b(var14, var14, var14));

      for(int var16 = 0; var16 < var15.size(); ++var16) {
         c var13 = ((ia)var15.get(var16)).A();
         if (var13 != null && var13.a(var2)) {
            this.R.add(var13);
         }

         var13 = var1.f((ia)var15.get(var16));
         if (var13 != null && var13.a(var2)) {
            this.R.add(var13);
         }
      }

      return this.R;
   }

   public int a(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (me.b(var2 * (float)Math.PI * 2.0F) * 2.0F + 0.5F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * ((double)1.0F - (double)(this.j(var1) * 5.0F) / (double)16.0F));
      var3 = (float)((double)var3 * ((double)1.0F - (double)(this.i(var1) * 5.0F) / (double)16.0F));
      var3 = 1.0F - var3;
      return (int)(var3 * 11.0F);
   }

   public float b(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (me.b(var2 * (float)Math.PI * 2.0F) * 2.0F + 0.2F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * ((double)1.0F - (double)(this.j(var1) * 5.0F) / (double)16.0F));
      var3 = (float)((double)var3 * ((double)1.0F - (double)(this.i(var1) * 5.0F) / (double)16.0F));
      return var3 * 0.8F + 0.2F;
   }

   public fb a(ia var1, float var2) {
      float var3 = this.c(var2);
      float var4 = me.b(var3 * (float)Math.PI * 2.0F) * 2.0F + 0.5F;
      if (var4 < 0.0F) {
         var4 = 0.0F;
      }

      if (var4 > 1.0F) {
         var4 = 1.0F;
      }

      int var5 = me.c(var1.s);
      int var6 = me.c(var1.u);
      float var7 = this.a().a(var5, 64, var6);
      int var8 = this.a().a(var5, var6).a(var7);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      var9 *= var4;
      var10 *= var4;
      var11 *= var4;
      float var12 = this.j(var2);
      if (var12 > 0.0F) {
         float var13 = (var9 * 0.3F + var10 * 0.59F + var11 * 0.11F) * 0.6F;
         float var14 = 1.0F - var12 * 0.75F;
         var9 = var9 * var14 + var13 * (1.0F - var14);
         var10 = var10 * var14 + var13 * (1.0F - var14);
         var11 = var11 * var14 + var13 * (1.0F - var14);
      }

      float var19 = this.i(var2);
      if (var19 > 0.0F) {
         float var20 = (var9 * 0.3F + var10 * 0.59F + var11 * 0.11F) * 0.2F;
         float var15 = 1.0F - var19 * 0.75F;
         var9 = var9 * var15 + var20 * (1.0F - var15);
         var10 = var10 * var15 + var20 * (1.0F - var15);
         var11 = var11 * var15 + var20 * (1.0F - var15);
      }

      if (this.s > 0) {
         float var21 = (float)this.s - var2;
         if (var21 > 1.0F) {
            var21 = 1.0F;
         }

         var21 *= 0.45F;
         var9 = var9 * (1.0F - var21) + 0.8F * var21;
         var10 = var10 * (1.0F - var21) + 0.8F * var21;
         var11 = var11 * (1.0F - var21) + 1.0F * var21;
      }

      return fb.b((double)var9, (double)var10, (double)var11);
   }

   public float c(float var1) {
      return this.y.a(this.C.f(), var1);
   }

   public int d(float var1) {
      return this.y.b(this.C.f(), var1);
   }

   public float e(float var1) {
      float var2 = this.c(var1);
      return var2 * (float)Math.PI * 2.0F;
   }

   public fb f(float var1) {
      float var2 = this.c(var1);
      float var3 = me.b(var2 * (float)Math.PI * 2.0F) * 2.0F + 0.5F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.O >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.O >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.O & 255L) / 255.0F;
      float var7 = this.j(var1);
      if (var7 > 0.0F) {
         float var8 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.6F;
         float var9 = 1.0F - var7 * 0.95F;
         var4 = var4 * var9 + var8 * (1.0F - var9);
         var5 = var5 * var9 + var8 * (1.0F - var9);
         var6 = var6 * var9 + var8 * (1.0F - var9);
      }

      var4 *= var3 * 0.9F + 0.1F;
      var5 *= var3 * 0.9F + 0.1F;
      var6 *= var3 * 0.85F + 0.15F;
      float var14 = this.i(var1);
      if (var14 > 0.0F) {
         float var15 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.2F;
         float var10 = 1.0F - var14 * 0.95F;
         var4 = var4 * var10 + var15 * (1.0F - var10);
         var5 = var5 * var10 + var15 * (1.0F - var10);
         var6 = var6 * var10 + var15 * (1.0F - var10);
      }

      return fb.b((double)var4, (double)var5, (double)var6);
   }

   public fb g(float var1) {
      float var2 = this.c(var1);
      return this.y.b(var2, var1);
   }

   public int e(int var1, int var2) {
      return this.b(var1, var2).c(var1 & 15, var2 & 15);
   }

   public int f(int var1, int var2) {
      zx var3 = this.b(var1, var2);
      int var4 = this.c - 1;
      var1 &= 15;

      for(int var7 = var2 & 15; var4 > 0; --var4) {
         int var5 = var3.a(var1, var4, var7);
         if (var5 != 0 && net.minecraft.client.yy.k[var5].bZ.d() && net.minecraft.client.yy.k[var5].bZ != net.minecraft.client.p.i) {
            return var4 + 1;
         }
      }

      return -1;
   }

   public float h(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (me.b(var2 * (float)Math.PI * 2.0F) * 2.0F + 0.75F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3 * var3 * 0.5F;
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      ahn var6 = new ahn(var1, var2, var3, var4);
      byte var7 = 8;
      if (this.f) {
         if (this.b(var6.a - var7, var6.b - var7, var6.c - var7, var6.a + var7, var6.b + var7, var6.c + var7)) {
            int var8 = this.a(var6.a, var6.b, var6.c);
            if (var8 == var6.d && var8 > 0) {
               yy.k[var8].a(this, var6.a, var6.b, var6.c, this.w);
            }
         }

      } else {
         if (this.b(var1 - var7, var2 - var7, var3 - var7, var1 + var7, var2 + var7, var3 + var7)) {
            if (var4 > 0) {
               var6.a((long)var5 + this.C.f());
            }

            if (!this.L.contains(var6)) {
               this.L.add(var6);
               this.K.add(var6);
            }
         }

      }
   }

   public void e(int var1, int var2, int var3, int var4, int var5) {
      ahn var6 = new ahn(var1, var2, var3, var4);
      if (var4 > 0) {
         var6.a((long)var5 + this.C.f());
      }

      if (!this.L.contains(var6)) {
         this.L.add(var6);
         this.K.add(var6);
      }

   }

   public void m() {
      pf.a("entities");
      pf.a("global");

      for(int var1 = 0; var1 < this.j.size(); ++var1) {
         ia var2 = (ia)this.j.get(var1);
         var2.a();
         if (var2.K) {
            this.j.remove(var1--);
         }
      }

      pf.c("remove");
      this.g.removeAll(this.J);

      for(int var5 = 0; var5 < this.J.size(); ++var5) {
         ia var9 = (ia)this.J.get(var5);
         int var3 = var9.ai;
         int var4 = var9.ak;
         if (var9.ah && this.g(var3, var4)) {
            this.c(var3, var4).b(var9);
         }
      }

      for(int var6 = 0; var6 < this.J.size(); ++var6) {
         this.d((ia)this.J.get(var6));
      }

      this.J.clear();
      pf.c("regular");

      for(int var7 = 0; var7 < this.g.size(); ++var7) {
         ia var10 = (ia)this.g.get(var7);
         if (var10.n != null) {
            if (!var10.n.K && var10.n.m == var10) {
               continue;
            }

            var10.n.m = null;
            var10.n = null;
         }

         if (!var10.K) {
            this.f(var10);
         }

         pf.a("remove");
         if (var10.K) {
            int var13 = var10.ai;
            int var16 = var10.ak;
            if (var10.ah && this.g(var13, var16)) {
               this.c(var13, var16).b(var10);
            }

            this.g.remove(var7--);
            this.d(var10);
         }

         pf.b();
      }

      pf.c("tileEntities");
      this.S = true;
      Iterator var8 = this.h.iterator();

      while(var8.hasNext()) {
         bq var11 = (bq)var8.next();
         if (!var11.i() && var11.c != null && this.i(var11.d, var11.e, var11.f)) {
            var11.b();
         }

         if (var11.i()) {
            var8.remove();
            if (this.g(var11.d >> 4, var11.f >> 4)) {
               zx var14 = this.c(var11.d >> 4, var11.f >> 4);
               if (var14 != null) {
                  var14.e(var11.d & 15, var11.e, var11.f & 15);
               }
            }
         }
      }

      this.S = false;
      if (!this.N.isEmpty()) {
         this.h.removeAll(this.N);
         this.N.clear();
      }

      pf.c("pendingTileEntities");
      if (!this.M.isEmpty()) {
         for(bq var15 : (Iterable<bq>)(Iterable)(this.M)) {
            if (!var15.i()) {
               if (!this.h.contains(var15)) {
                  this.h.add(var15);
               }

               if (this.g(var15.d >> 4, var15.f >> 4)) {
                  zx var17 = this.c(var15.d >> 4, var15.f >> 4);
                  if (var17 != null) {
                     var17.a(var15.d & 15, var15.e, var15.f & 15, var15);
                  }
               }

               this.j(var15.d, var15.e, var15.f);
            }
         }

         this.M.clear();
      }

      pf.b();
      pf.b();
   }

   public void a(Collection var1) {
      if (this.S) {
         this.M.addAll(var1);
      } else {
         this.h.addAll(var1);
      }

   }

   public void f(ia var1) {
      this.a(var1, true);
   }

   public void a(ia var1, boolean var2) {
      int var3 = me.c(var1.s);
      int var4 = me.c(var1.u);
      byte var5 = 32;
      if (!var2 || this.b(var3 - var5, 0, var4 - var5, var3 + var5, this.c, var4 + var5)) {
         var1.R = var1.s;
         var1.S = var1.t;
         var1.T = var1.u;
         var1.A = var1.y;
         var1.B = var1.z;
         if (var2 && var1.ah) {
            if (var1.n != null) {
               var1.M();
            } else {
               var1.a();
            }
         }

         pf.a("chunkCheck");
         if (Double.isNaN(var1.s) || Double.isInfinite(var1.s)) {
            var1.s = var1.R;
         }

         if (Double.isNaN(var1.t) || Double.isInfinite(var1.t)) {
            var1.t = var1.S;
         }

         if (Double.isNaN(var1.u) || Double.isInfinite(var1.u)) {
            var1.u = var1.T;
         }

         if (Double.isNaN((double)var1.z) || Double.isInfinite((double)var1.z)) {
            var1.z = var1.B;
         }

         if (Double.isNaN((double)var1.y) || Double.isInfinite((double)var1.y)) {
            var1.y = var1.A;
         }

         int var6 = me.c(var1.s / (double)16.0F);
         int var7 = me.c(var1.t / (double)16.0F);
         int var8 = me.c(var1.u / (double)16.0F);
         if (!var1.ah || var1.ai != var6 || var1.aj != var7 || var1.ak != var8) {
            if (var1.ah && this.g(var1.ai, var1.ak)) {
               this.c(var1.ai, var1.ak).a(var1, var1.aj);
            }

            if (this.g(var6, var8)) {
               var1.ah = true;
               this.c(var6, var8).a(var1);
            } else {
               var1.ah = false;
            }
         }

         pf.b();
         if (var2 && var1.ah && var1.m != null) {
            if (!var1.m.K && var1.m.n == var1) {
               this.f(var1.m);
            } else {
               var1.m.n = null;
               var1.m = null;
            }
         }

      }
   }

   public boolean a(c var1) {
      List var2 = this.b((ia)null, (c)var1);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         ia var4 = (ia)var2.get(var3);
         if (!var4.K && var4.l) {
            return false;
         }
      }

      return true;
   }

   public boolean b(c var1) {
      int var2 = me.c(var1.a);
      int var3 = me.c(var1.d + (double)1.0F);
      int var4 = me.c(var1.b);
      int var5 = me.c(var1.e + (double)1.0F);
      int var6 = me.c(var1.c);
      int var7 = me.c(var1.f + (double)1.0F);
      if (var1.a < (double)0.0F) {
         --var2;
      }

      if (var1.b < (double)0.0F) {
         --var4;
      }

      if (var1.c < (double)0.0F) {
         --var6;
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               yy var11 = yy.k[this.a(var8, var9, var10)];
               if (var11 != null && var11.bZ.a()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean c(c var1) {
      int var2 = me.c(var1.a);
      int var3 = me.c(var1.d + (double)1.0F);
      int var4 = me.c(var1.b);
      int var5 = me.c(var1.e + (double)1.0F);
      int var6 = me.c(var1.c);
      int var7 = me.c(var1.f + (double)1.0F);
      if (this.b(var2, var4, var6, var3, var5, var7)) {
         for(int var8 = var2; var8 < var3; ++var8) {
            for(int var9 = var4; var9 < var5; ++var9) {
               for(int var10 = var6; var10 < var7; ++var10) {
                  int var11 = this.a(var8, var9, var10);
                  if (var11 == yy.ar.bM || var11 == yy.C.bM || var11 == yy.D.bM) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public boolean a(c var1, p var2, ia var3) {
      int var4 = me.c(var1.a);
      int var5 = me.c(var1.d + (double)1.0F);
      int var6 = me.c(var1.b);
      int var7 = me.c(var1.e + (double)1.0F);
      int var8 = me.c(var1.c);
      int var9 = me.c(var1.f + (double)1.0F);
      if (!this.b(var4, var6, var8, var5, var7, var9)) {
         return false;
      } else {
         boolean var10 = false;
         fb var11 = fb.b((double)0.0F, (double)0.0F, (double)0.0F);

         for(int var12 = var4; var12 < var5; ++var12) {
            for(int var13 = var6; var13 < var7; ++var13) {
               for(int var14 = var8; var14 < var9; ++var14) {
                  yy var15 = yy.k[this.a(var12, var13, var14)];
                  if (var15 != null && var15.bZ == var2) {
                     double var16 = (double)((float)(var13 + 1) - agw.e(this.d(var12, var13, var14)));
                     if ((double)var7 >= var16) {
                        var10 = true;
                        var15.a(this, var12, var13, var14, var3, var11);
                     }
                  }
               }
            }
         }

         if (var11.d() > (double)0.0F) {
            var11 = var11.c();
            double var19 = 0.014;
            var3.v += var11.a * var19;
            var3.w += var11.b * var19;
            var3.x += var11.c * var19;
         }

         return var10;
      }
   }

   public boolean a(c var1, p var2) {
      int var3 = me.c(var1.a);
      int var4 = me.c(var1.d + (double)1.0F);
      int var5 = me.c(var1.b);
      int var6 = me.c(var1.e + (double)1.0F);
      int var7 = me.c(var1.c);
      int var8 = me.c(var1.f + (double)1.0F);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               yy var12 = yy.k[this.a(var9, var10, var11)];
               if (var12 != null && var12.bZ == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean b(c var1, p var2) {
      int var3 = me.c(var1.a);
      int var4 = me.c(var1.d + (double)1.0F);
      int var5 = me.c(var1.b);
      int var6 = me.c(var1.e + (double)1.0F);
      int var7 = me.c(var1.c);
      int var8 = me.c(var1.f + (double)1.0F);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               yy var12 = yy.k[this.a(var9, var10, var11)];
               if (var12 != null && var12.bZ == var2) {
                  int var13 = this.d(var9, var10, var11);
                  double var14 = (double)(var10 + 1);
                  if (var13 < 8) {
                     var14 = (double)(var10 + 1) - (double)var13 / (double)8.0F;
                  }

                  if (var14 >= var1.b) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public xp a(ia var1, double var2, double var4, double var6, float var8) {
      return this.a(var1, var2, var4, var6, var8, false);
   }

   public xp a(ia var1, double var2, double var4, double var6, float var8, boolean var9) {
      xp var10 = new xp(this, var1, var2, var4, var6, var8);
      var10.a = var9;
      var10.a();
      var10.a(true);
      return var10;
   }

   public float a(fb var1, c var2) {
      double var3 = (double)1.0F / ((var2.d - var2.a) * (double)2.0F + (double)1.0F);
      double var5 = (double)1.0F / ((var2.e - var2.b) * (double)2.0F + (double)1.0F);
      double var7 = (double)1.0F / ((var2.f - var2.c) * (double)2.0F + (double)1.0F);
      int var9 = 0;
      int var10 = 0;

      for(float var11 = 0.0F; var11 <= 1.0F; var11 = (float)((double)var11 + var3)) {
         for(float var12 = 0.0F; var12 <= 1.0F; var12 = (float)((double)var12 + var5)) {
            for(float var13 = 0.0F; var13 <= 1.0F; var13 = (float)((double)var13 + var7)) {
               double var14 = var2.a + (var2.d - var2.a) * (double)var11;
               double var16 = var2.b + (var2.e - var2.b) * (double)var12;
               double var18 = var2.c + (var2.f - var2.c) * (double)var13;
               if (this.a(fb.b(var14, var16, var18), var1) == null) {
                  ++var9;
               }

               ++var10;
            }
         }
      }

      return (float)var9 / (float)var10;
   }

   public void a(vi var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0) {
         --var3;
      }

      if (var5 == 1) {
         ++var3;
      }

      if (var5 == 2) {
         --var4;
      }

      if (var5 == 3) {
         ++var4;
      }

      if (var5 == 4) {
         --var2;
      }

      if (var5 == 5) {
         ++var2;
      }

      if (this.a(var2, var3, var4) == yy.ar.bM) {
         this.a(var1, 1004, var2, var3, var4, 0);
         this.g(var2, var3, var4, 0);
      }

   }

   public ia a(Class var1) {
      return null;
   }

   public String n() {
      return "All: " + this.g.size();
   }

   public String o() {
      return this.A.c();
   }

   public bq b(int var1, int var2, int var3) {
      zx var4 = this.c(var1 >> 4, var3 >> 4);
      if (var4 == null) {
         return null;
      } else {
         bq var5 = var4.d(var1 & 15, var2, var3 & 15);
         if (var5 == null) {
            for(bq var7 : (Iterable<bq>)(Iterable)(this.M)) {
               if (!var7.i() && var7.d == var1 && var7.e == var2 && var7.f == var3) {
                  var5 = var7;
                  break;
               }
            }
         }

         return var5;
      }
   }

   public void a(int var1, int var2, int var3, bq var4) {
      if (var4 != null && !var4.i()) {
         if (this.S) {
            var4.d = var1;
            var4.e = var2;
            var4.f = var3;
            this.M.add(var4);
         } else {
            this.h.add(var4);
            zx var5 = this.c(var1 >> 4, var3 >> 4);
            if (var5 != null) {
               var5.a(var1 & 15, var2, var3 & 15, var4);
            }
         }
      }

   }

   public void o(int var1, int var2, int var3) {
      bq var4 = this.b(var1, var2, var3);
      if (var4 != null && this.S) {
         var4.l();
         this.M.remove(var4);
      } else {
         if (var4 != null) {
            this.M.remove(var4);
            this.h.remove(var4);
         }

         zx var5 = this.c(var1 >> 4, var3 >> 4);
         if (var5 != null) {
            var5.e(var1 & 15, var2, var3 & 15);
         }
      }

   }

   public void a(bq var1) {
      this.N.add(var1);
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
         return var4.bZ.j() && var4.b();
      }
   }

   public boolean b(int var1, int var2, int var3, boolean var4) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         zx var5 = this.A.b(var1 >> 4, var3 >> 4);
         if (var5 != null && !var5.h()) {
            yy var6 = yy.k[this.a(var1, var2, var3)];
            if (var6 == null) {
               return false;
            } else {
               return var6.bZ.j() && var6.b();
            }
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public void a(rz var1) {
      this.a(true, var1);

      try {
         ll.a.a();
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

   }

   public void p() {
      int var1 = this.a(1.0F);
      if (var1 != this.k) {
         this.k = var1;
      }

   }

   public void a(boolean var1, boolean var2) {
      this.F = var1;
      this.G = var2;
   }

   public void c() {
      if (this.z().s() && this.v < 3) {
         this.v = 3;
      }

      this.a().b();
      this.h();
      if (this.C()) {
         boolean var1 = false;
         if (this.F && this.v >= 1) {
         }

         if (!var1) {
            long var2 = this.C.f() + 24000L;
            this.C.a(var2 - var2 % 24000L);
            this.B();
         }
      }

      pf.a("mobSpawner");
      we.a(this, this.F, this.G && this.C.f() % 400L == 0L);
      pf.c("chunkSource");
      this.A.a();
      int var4 = this.a(1.0F);
      if (var4 != this.k) {
         this.k = var4;
      }

      long var5 = this.C.f() + 1L;
      if (var5 % (long)this.u == 0L) {
         pf.c("save");
         this.a(false, (rz)null);
      }

      this.C.a(var5);
      pf.c("tickPending");
      this.a(false);
      pf.c("tickTiles");
      this.f();
      pf.b();
   }

   private void H() {
      if (this.C.o()) {
         this.o = 1.0F;
         if (this.C.m()) {
            this.q = 1.0F;
         }
      }

   }

   protected void h() {
      if (!this.y.e) {
         if (this.r > 0) {
            --this.r;
         }

         int var1 = this.C.n();
         if (var1 <= 0) {
            if (this.C.m()) {
               this.C.e(this.w.nextInt(12000) + 3600);
            } else {
               this.C.e(this.w.nextInt(168000) + 12000);
            }
         } else {
            --var1;
            this.C.e(var1);
            if (var1 <= 0) {
               this.C.a(!this.C.m());
            }
         }

         int var2 = this.C.p();
         if (var2 <= 0) {
            if (this.C.o()) {
               this.C.f(this.w.nextInt(12000) + 12000);
            } else {
               this.C.f(this.w.nextInt(168000) + 12000);
            }
         } else {
            --var2;
            this.C.f(var2);
            if (var2 <= 0) {
               this.C.b(!this.C.o());
            }
         }

         this.n = this.o;
         if (this.C.o()) {
            this.o = (float)((double)this.o + 0.01);
         } else {
            this.o = (float)((double)this.o - 0.01);
         }

         if (this.o < 0.0F) {
            this.o = 0.0F;
         }

         if (this.o > 1.0F) {
            this.o = 1.0F;
         }

         this.p = this.q;
         if (this.C.m()) {
            this.q = (float)((double)this.q + 0.01);
         } else {
            this.q = (float)((double)this.q - 0.01);
         }

         if (this.q < 0.0F) {
            this.q = 0.0F;
         }

         if (this.q > 1.0F) {
            this.q = 1.0F;
         }

      }
   }

   private void I() {
      this.C.f(0);
      this.C.b(false);
      this.C.e(0);
      this.C.a(false);
   }

   protected void f() {
      this.T.clear();
      pf.a("buildList");

      for(int var1 = 0; var1 < this.i.size(); ++var1) {
         vi var2 = (vi)this.i.get(var1);
         int var3 = me.c(var2.s / (double)16.0F);
         int var4 = me.c(var2.u / (double)16.0F);
         byte var5 = 7;

         for(int var6 = -var5; var6 <= var5; ++var6) {
            for(int var7 = -var5; var7 <= var5; ++var7) {
               this.T.add(new acm(var6 + var3, var7 + var4));
            }
         }
      }

      if (this.U > 0) {
         --this.U;
      }

      int var14 = 0;
      int var15 = 0;
      pf.b();

      for(acm var17 : (Iterable<acm>)(Iterable)(this.T)) {
         // PATCH(perf): случайные тики только для уже загруженных чанков. this.c(x,z) генерирует чанк, если его нет,
         // и обходил очередь подгрузки: до 225 чанков синхронно за один тик на каждом пересечении границы чанка.
         // Недостающие догружает web/ChunkPreloader (радиус >= 9).
         if (!this.x().c(var17.a, var17.b)) {
            continue;
         }

         int var18 = var17.a * 16;
         int var19 = var17.b * 16;
         pf.a("getChunk");
         zx var20 = this.c(var17.a, var17.b);
         pf.c("tickChunk");
         var20.j();
         pf.c("moodSound");
         if (this.U == 0) {
            this.l = this.l * 3 + 1013904223;
            int var8 = this.l >> 2;
            int var9 = var8 & 15;
            int var10 = var8 >> 8 & 15;
            int var11 = var8 >> 16 & this.d;
            int var12 = var20.a(var9, var11, var10);
            var9 += var18;
            var10 += var19;
            if (var12 == 0 && this.m(var9, var11, var10) <= this.w.nextInt(8) && this.b(bn.a, var9, var11, var10) <= 0) {
               vi var13 = this.a((double)var9 + (double)0.5F, (double)var11 + (double)0.5F, (double)var10 + (double)0.5F, (double)8.0F);
               if (var13 != null && var13.f((double)var9 + (double)0.5F, (double)var11 + (double)0.5F, (double)var10 + (double)0.5F) > (double)4.0F) {
                  this.a((double)var9 + (double)0.5F, (double)var11 + (double)0.5F, (double)var10 + (double)0.5F, "ambient.cave.cave", 0.7F, 0.8F + this.w.nextFloat() * 0.2F);
                  this.U = this.w.nextInt(12000) + 6000;
               }
            }
         }

         pf.c("thunder");
         if (this.w.nextInt(100000) == 0 && this.E() && this.D()) {
            this.l = this.l * 3 + 1013904223;
            int var21 = this.l >> 2;
            int var25 = var18 + (var21 & 15);
            int var29 = var19 + (var21 >> 8 & 15);
            int var32 = this.e(var25, var29);
            if (this.w(var25, var32, var29)) {
               this.e(new su(this, (double)var25, (double)var32, (double)var29));
               this.r = 2;
            }
         }

         pf.c("iceandsnow");
         this.l = this.l * 3 + 1013904223;
         int var22 = this.l >> 2;
         int var26 = var22 & 15;
         int var30 = var22 >> 8 & 15;
         int var33 = this.e(var26 + var18, var30 + var19);
         if (this.q(var26 + var18, var33 - 1, var30 + var19)) {
            this.g(var26 + var18, var33 - 1, var30 + var19, yy.aT.bM);
         }

         if (this.E() && this.r(var26 + var18, var33, var30 + var19)) {
            this.g(var26 + var18, var33, var30 + var19, yy.aS.bM);
         }

         pf.c("checkLight");
         this.s(var18 + this.w.nextInt(16), this.w.nextInt(this.c), var19 + this.w.nextInt(16));
         pf.c("tickTiles");

         for(int var23 = 0; var23 < 20; ++var23) {
            this.l = this.l * 3 + 1013904223;
            var26 = this.l >> 2;
            var30 = var26 & 15;
            var33 = var26 >> 8 & 15;
            int var35 = var26 >> 16 & this.d;
            int var36 = var20.b[var30 << this.b | var33 << this.a | var35] & 255;
            ++var15;
            if (yy.l[var36]) {
               ++var14;
               yy.k[var36].a(this, var30 + var18, var35, var33 + var19, this.w);
            }
         }

         pf.b();
      }

   }

   public boolean p(int var1, int var2, int var3) {
      return this.c(var1, var2, var3, false);
   }

   public boolean q(int var1, int var2, int var3) {
      return this.c(var1, var2, var3, true);
   }

   public boolean c(int var1, int var2, int var3, boolean var4) {
      float var5 = this.a().a(var1, var2, var3);
      if (var5 > 0.15F) {
         return false;
      } else {
         if (var2 >= 0 && var2 < this.c && this.b(bn.b, var1, var2, var3) < 10) {
            int var6 = this.a(var1, var2, var3);
            if ((var6 == yy.B.bM || var6 == yy.A.bM) && this.d(var1, var2, var3) == 0) {
               if (!var4) {
                  return true;
               }

               boolean var7 = true;
               if (var7 && this.e(var1 - 1, var2, var3) != net.minecraft.client.p.g) {
                  var7 = false;
               }

               if (var7 && this.e(var1 + 1, var2, var3) != net.minecraft.client.p.g) {
                  var7 = false;
               }

               if (var7 && this.e(var1, var2, var3 - 1) != net.minecraft.client.p.g) {
                  var7 = false;
               }

               if (var7 && this.e(var1, var2, var3 + 1) != net.minecraft.client.p.g) {
                  var7 = false;
               }

               if (!var7) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean r(int var1, int var2, int var3) {
      float var4 = this.a().a(var1, var2, var3);
      if (var4 > 0.15F) {
         return false;
      } else {
         if (var2 >= 0 && var2 < this.c && this.b(bn.b, var1, var2, var3) < 10) {
            int var5 = this.a(var1, var2 - 1, var3);
            int var6 = this.a(var1, var2, var3);
            if (var6 == 0 && yy.aS.c(this, var1, var2, var3) && var5 != 0 && var5 != yy.aT.bM && yy.k[var5].bZ.d()) {
               return true;
            }
         }

         return false;
      }
   }

   public void s(int var1, int var2, int var3) {
      if (!this.y.e) {
         this.c(bn.a, var1, var2, var3);
      }

      this.c(bn.b, var1, var2, var3);
   }

   private int a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if (this.l(var2, var3, var4)) {
         var7 = 15;
      } else {
         if (var6 == 0) {
            var6 = 1;
         }

         for(int var8 = 0; var8 < 6; ++var8) {
            int var9 = var8 % 2 * 2 - 1;
            int var10 = var2 + var8 / 2 % 3 / 2 * var9;
            int var11 = var3 + (var8 / 2 + 1) % 3 / 2 * var9;
            int var12 = var4 + (var8 / 2 + 2) % 3 / 2 * var9;
            int var13 = this.b(bn.a, var10, var11, var12) - var6;
            if (var13 > var7) {
               var7 = var13;
            }
         }
      }

      return var7;
   }

   private int d(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = yy.q[var5];
      int var8 = this.b(bn.b, var2 - 1, var3, var4) - var6;
      int var9 = this.b(bn.b, var2 + 1, var3, var4) - var6;
      int var10 = this.b(bn.b, var2, var3 - 1, var4) - var6;
      int var11 = this.b(bn.b, var2, var3 + 1, var4) - var6;
      int var12 = this.b(bn.b, var2, var3, var4 - 1) - var6;
      int var13 = this.b(bn.b, var2, var3, var4 + 1) - var6;
      if (var8 > var7) {
         var7 = var8;
      }

      if (var9 > var7) {
         var7 = var9;
      }

      if (var10 > var7) {
         var7 = var10;
      }

      if (var11 > var7) {
         var7 = var11;
      }

      if (var12 > var7) {
         var7 = var12;
      }

      if (var13 > var7) {
         var7 = var13;
      }

      return var7;
   }

   public void c(bn var1, int var2, int var3, int var4) {
      if (this.e(var2, var3, var4, 17)) {
         int var5 = 0;
         int var6 = 0;
         int var7 = this.b(var1, var2, var3, var4);
         int var8 = 0;
         int var10 = this.a(var2, var3, var4);
         int var11 = yy.o[var10];
         if (var11 == 0) {
            var11 = 1;
         }

         int var12 = 0;
         if (var1 == bn.a) {
            var12 = this.a(var7, var2, var3, var4, var10, var11);
         } else {
            var12 = this.d(var7, var2, var3, var4, var10, var11);
         }

         if (var12 > var7) {
            this.H[var6++] = 133152;
         } else if (var12 < var7) {
            if (var1 != bn.b) {
            }

            this.H[var6++] = 133152 + (var7 << 18);

            while(var5 < var6) {
               int var9 = this.H[var5++];
               var10 = (var9 & 63) - 32 + var2;
               var11 = (var9 >> 6 & 63) - 32 + var3;
               var12 = (var9 >> 12 & 63) - 32 + var4;
               int var13 = var9 >> 18 & 15;
               int var14 = this.b(var1, var10, var11, var12);
               if (var14 == var13) {
                  this.a((bn)var1, var10, var11, var12, 0);
                  if (var13 > 0) {
                     int var15 = var10 - var2;
                     int var16 = var11 - var3;
                     int var17 = var12 - var4;
                     if (var15 < 0) {
                        var15 = -var15;
                     }

                     if (var16 < 0) {
                        var16 = -var16;
                     }

                     if (var17 < 0) {
                        var17 = -var17;
                     }

                     if (var15 + var16 + var17 < 17) {
                        for(int var18 = 0; var18 < 6; ++var18) {
                           int var19 = var18 % 2 * 2 - 1;
                           int var20 = var10 + var18 / 2 % 3 / 2 * var19;
                           int var21 = var11 + (var18 / 2 + 1) % 3 / 2 * var19;
                           int var22 = var12 + (var18 / 2 + 2) % 3 / 2 * var19;
                           var14 = this.b(var1, var20, var21, var22);
                           int var23 = yy.o[this.a(var20, var21, var22)];
                           if (var23 == 0) {
                              var23 = 1;
                           }

                           if (var14 == var13 - var23) {
                              this.H[var6++] = var20 - var2 + 32 + (var21 - var3 + 32 << 6) + (var22 - var4 + 32 << 12) + (var13 - var23 << 18);
                           }
                        }
                     }
                  }
               }
            }

            var5 = 0;
         }

         while(var5 < var6) {
            var7 = this.H[var5++];
            var8 = (var7 & 63) - 32 + var2;
            int var26 = (var7 >> 6 & 63) - 32 + var3;
            var10 = (var7 >> 12 & 63) - 32 + var4;
            var11 = this.b(var1, var8, var26, var10);
            var12 = this.a(var8, var26, var10);
            int var34 = yy.o[var12];
            if (var34 == 0) {
               var34 = 1;
            }

            int var36 = 0;
            if (var1 == bn.a) {
               var36 = this.a(var11, var8, var26, var10, var12, var34);
            } else {
               var36 = this.d(var11, var8, var26, var10, var12, var34);
            }

            if (var36 != var11) {
               this.a(var1, var8, var26, var10, var36);
               if (var36 > var11) {
                  int var38 = var8 - var2;
                  int var39 = var26 - var3;
                  int var40 = var10 - var4;
                  if (var38 < 0) {
                     var38 = -var38;
                  }

                  if (var39 < 0) {
                     var39 = -var39;
                  }

                  if (var40 < 0) {
                     var40 = -var40;
                  }

                  if (var38 + var39 + var40 < 17 && var6 < this.H.length - 6) {
                     if (this.b(var1, var8 - 1, var26, var10) < var36) {
                        this.H[var6++] = var8 - 1 - var2 + 32 + (var26 - var3 + 32 << 6) + (var10 - var4 + 32 << 12);
                     }

                     if (this.b(var1, var8 + 1, var26, var10) < var36) {
                        this.H[var6++] = var8 + 1 - var2 + 32 + (var26 - var3 + 32 << 6) + (var10 - var4 + 32 << 12);
                     }

                     if (this.b(var1, var8, var26 - 1, var10) < var36) {
                        this.H[var6++] = var8 - var2 + 32 + (var26 - 1 - var3 + 32 << 6) + (var10 - var4 + 32 << 12);
                     }

                     if (this.b(var1, var8, var26 + 1, var10) < var36) {
                        this.H[var6++] = var8 - var2 + 32 + (var26 + 1 - var3 + 32 << 6) + (var10 - var4 + 32 << 12);
                     }

                     if (this.b(var1, var8, var26, var10 - 1) < var36) {
                        this.H[var6++] = var8 - var2 + 32 + (var26 - var3 + 32 << 6) + (var10 - 1 - var4 + 32 << 12);
                     }

                     if (this.b(var1, var8, var26, var10 + 1) < var36) {
                        this.H[var6++] = var8 - var2 + 32 + (var26 - var3 + 32 << 6) + (var10 + 1 - var4 + 32 << 12);
                     }
                  }
               }
            }
         }

      }
   }

   public boolean a(boolean var1) {
      int var2 = this.K.size();
      if (var2 != this.L.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if (var2 > 1000) {
            var2 = 1000;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            ahn var4 = (ahn)this.K.first();
            if (!var1 && var4.e > this.C.f()) {
               break;
            }

            this.K.remove(var4);
            this.L.remove(var4);
            byte var5 = 8;
            if (this.b(var4.a - var5, var4.b - var5, var4.c - var5, var4.a + var5, var4.b + var5, var4.c + var5)) {
               int var6 = this.a(var4.a, var4.b, var4.c);
               if (var6 == var4.d && var6 > 0) {
                  yy.k[var6].a(this, var4.a, var4.b, var4.c, this.w);
               }
            }
         }

         return this.K.size() != 0;
      }
   }

   public List a(zx var1, boolean var2) {
      ArrayList var3 = null;
      acm var4 = var1.k();
      int var5 = var4.a << 4;
      int var6 = var5 + 16;
      int var7 = var4.b << 4;
      int var8 = var7 + 16;
      Iterator var9 = this.L.iterator();

      while(var9.hasNext()) {
         ahn var10 = (ahn)var9.next();
         if (var10.a >= var5 && var10.a < var6 && var10.c >= var7 && var10.c < var8) {
            if (var2) {
               this.K.remove(var10);
               var9.remove();
            }

            if (var3 == null) {
               var3 = new ArrayList();
            }

            var3.add(var10);
         }
      }

      return var3;
   }

   public void t(int var1, int var2, int var3) {
      byte var4 = 16;
      Random var5 = new net.minecraft.client.web.JRandom();

      for(int var6 = 0; var6 < 1000; ++var6) {
         int var7 = var1 + this.w.nextInt(var4) - this.w.nextInt(var4);
         int var8 = var2 + this.w.nextInt(var4) - this.w.nextInt(var4);
         int var9 = var3 + this.w.nextInt(var4) - this.w.nextInt(var4);
         int var10 = this.a(var7, var8, var9);
         if (this.w.nextInt(8) > var8 && var10 == 0) {
            this.a("depthsuspend", (double)((float)var7 + this.w.nextFloat()), (double)((float)var8 + this.w.nextFloat()), (double)((float)var9 + this.w.nextFloat()), (double)0.0F, (double)0.0F, (double)0.0F);
         }

         if (var10 > 0) {
            yy.k[var10].b(this, var7, var8, var9, var5);
         }
      }

   }

   public List b(ia var1, c var2) {
      this.V.clear();
      int var3 = me.c((var2.a - (double)2.0F) / (double)16.0F);
      int var4 = me.c((var2.d + (double)2.0F) / (double)16.0F);
      int var5 = me.c((var2.c - (double)2.0F) / (double)16.0F);
      int var6 = me.c((var2.f + (double)2.0F) / (double)16.0F);

      for(int var7 = var3; var7 <= var4; ++var7) {
         for(int var8 = var5; var8 <= var6; ++var8) {
            if (this.g(var7, var8)) {
               this.c(var7, var8).a(var1, var2, this.V);
            }
         }
      }

      return this.V;
   }

   public List a(Class var1, c var2) {
      int var3 = me.c((var2.a - (double)2.0F) / (double)16.0F);
      int var4 = me.c((var2.d + (double)2.0F) / (double)16.0F);
      int var5 = me.c((var2.c - (double)2.0F) / (double)16.0F);
      int var6 = me.c((var2.f + (double)2.0F) / (double)16.0F);
      ArrayList var7 = new ArrayList();

      for(int var8 = var3; var8 <= var4; ++var8) {
         for(int var9 = var5; var9 <= var6; ++var9) {
            if (this.g(var8, var9)) {
               this.c(var8, var9).a((Class)var1, var2, var7);
            }
         }
      }

      return var7;
   }

   public List q() {
      return this.g;
   }

   public void b(int var1, int var2, int var3, bq var4) {
      if (this.i(var1, var2, var3)) {
         this.b(var1, var3).g();
      }

      for(int var5 = 0; var5 < this.z.size(); ++var5) {
         ((bd)this.z.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public int b(Class var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.g.size(); ++var3) {
         ia var4 = (ia)this.g.get(var3);
         if (var1.isAssignableFrom(var4.getClass())) {
            ++var2;
         }
      }

      return var2;
   }

   public void a(List var1) {
      this.g.addAll(var1);

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.c((ia)var1.get(var2));
      }

   }

   public void b(List var1) {
      this.J.addAll(var1);
   }

   public void r() {
      while(this.A.a()) {
      }

   }

   public boolean a(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      int var7 = this.a(var2, var3, var4);
      yy var8 = yy.k[var7];
      yy var9 = yy.k[var1];
      c var10 = var9.b(this, var2, var3, var4);
      if (var5) {
         var10 = null;
      }

      if (var10 != null && !this.a(var10)) {
         return false;
      } else {
         if (var8 == yy.A || var8 == yy.B || var8 == yy.C || var8 == yy.D || var8 == yy.ar || var8 == yy.aS || var8 == yy.bu) {
            var8 = null;
         }

         return var1 > 0 && var8 == null && var9.d(this, var2, var3, var4, var6);
      }
   }

   public dw a(ia var1, ia var2, float var3) {
      pf.a("pathfind");
      int var4 = me.c(var1.s);
      int var5 = me.c(var1.t);
      int var6 = me.c(var1.u);
      int var7 = (int)(var3 + 16.0F);
      int var8 = var4 - var7;
      int var9 = var5 - var7;
      int var10 = var6 - var7;
      int var11 = var4 + var7;
      int var12 = var5 + var7;
      int var13 = var6 + var7;
      xk var14 = new xk(this, var8, var9, var10, var11, var12, var13);
      dw var15 = (new rw(var14)).a(var1, var2, var3);
      pf.b();
      return var15;
   }

   public dw a(ia var1, int var2, int var3, int var4, float var5) {
      pf.a("pathfind");
      int var6 = me.c(var1.s);
      int var7 = me.c(var1.t);
      int var8 = me.c(var1.u);
      int var9 = (int)(var5 + 8.0F);
      int var10 = var6 - var9;
      int var11 = var7 - var9;
      int var12 = var8 - var9;
      int var13 = var6 + var9;
      int var14 = var7 + var9;
      int var15 = var8 + var9;
      xk var16 = new xk(this, var10, var11, var12, var13, var14, var15);
      dw var17 = (new rw(var16)).a(var1, var2, var3, var4, var5);
      pf.b();
      return var17;
   }

   public boolean k(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      return var5 == 0 ? false : yy.k[var5].c(this, var1, var2, var3, var4);
   }

   public boolean u(int var1, int var2, int var3) {
      if (this.k(var1, var2 - 1, var3, 0)) {
         return true;
      } else if (this.k(var1, var2 + 1, var3, 1)) {
         return true;
      } else if (this.k(var1, var2, var3 - 1, 2)) {
         return true;
      } else if (this.k(var1, var2, var3 + 1, 3)) {
         return true;
      } else if (this.k(var1 - 1, var2, var3, 4)) {
         return true;
      } else {
         return this.k(var1 + 1, var2, var3, 5);
      }
   }

   public boolean l(int var1, int var2, int var3, int var4) {
      if (this.g(var1, var2, var3)) {
         return this.u(var1, var2, var3);
      } else {
         int var5 = this.a(var1, var2, var3);
         return var5 == 0 ? false : yy.k[var5].b((kq)this, var1, var2, var3, var4);
      }
   }

   public boolean v(int var1, int var2, int var3) {
      if (this.l(var1, var2 - 1, var3, 0)) {
         return true;
      } else if (this.l(var1, var2 + 1, var3, 1)) {
         return true;
      } else if (this.l(var1, var2, var3 - 1, 2)) {
         return true;
      } else if (this.l(var1, var2, var3 + 1, 3)) {
         return true;
      } else if (this.l(var1 - 1, var2, var3, 4)) {
         return true;
      } else {
         return this.l(var1 + 1, var2, var3, 5);
      }
   }

   public vi a(ia var1, double var2) {
      return this.a(var1.s, var1.t, var1.u, var2);
   }

   public vi a(double var1, double var3, double var5, double var7) {
      double var9 = (double)-1.0F;
      vi var11 = null;

      for(int var12 = 0; var12 < this.i.size(); ++var12) {
         vi var13 = (vi)this.i.get(var12);
         double var14 = var13.f(var1, var3, var5);
         if ((var7 < (double)0.0F || var14 < var7 * var7) && (var9 == (double)-1.0F || var14 < var9)) {
            var9 = var14;
            var11 = var13;
         }
      }

      return var11;
   }

   public vi b(ia var1, double var2) {
      return this.b(var1.s, var1.t, var1.u, var2);
   }

   public vi b(double var1, double var3, double var5, double var7) {
      double var9 = (double)-1.0F;
      vi var11 = null;

      for(int var12 = 0; var12 < this.i.size(); ++var12) {
         vi var13 = (vi)this.i.get(var12);
         if (!var13.cc.a) {
            double var14 = var13.f(var1, var3, var5);
            if ((var7 < (double)0.0F || var14 < var7 * var7) && (var9 == (double)-1.0F || var14 < var9)) {
               var9 = var14;
               var11 = var13;
            }
         }
      }

      return var11;
   }

   public vi a(String var1) {
      for(int var2 = 0; var2 < this.i.size(); ++var2) {
         if (var1.equals(((vi)this.i.get(var2)).bJ)) {
            return (vi)this.i.get(var2);
         }
      }

      return null;
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7) {
      int var8 = var1 >> 4;
      int var9 = var3 >> 4;
      int var10 = var1 + var4 - 1 >> 4;
      int var11 = var3 + var6 - 1 >> 4;
      int var12 = 0;
      int var13 = var2;
      int var14 = var2 + var5;
      if (var2 < 0) {
         var13 = 0;
      }

      if (var14 > this.c) {
         var14 = this.c;
      }

      for(int var15 = var8; var15 <= var10; ++var15) {
         int var16 = var1 - var15 * 16;
         int var17 = var1 + var4 - var15 * 16;
         if (var16 < 0) {
            var16 = 0;
         }

         if (var17 > 16) {
            var17 = 16;
         }

         for(int var18 = var9; var18 <= var11; ++var18) {
            int var19 = var3 - var18 * 16;
            int var20 = var3 + var6 - var18 * 16;
            if (var19 < 0) {
               var19 = 0;
            }

            if (var20 > 16) {
               var20 = 16;
            }

            var12 = this.c(var15, var18).a(var7, var16, var13, var19, var17, var14, var20, var12);
            this.c(var15 * 16 + var16, var13, var18 * 16 + var19, var15 * 16 + var17, var14, var18 * 16 + var20);
         }
      }

   }

   public void g() {
   }

   public void s() {
      this.B.b();
   }

   public void a(long var1) {
      this.C.a(var1);
   }

   public long t() {
      return this.C.b();
   }

   public long u() {
      return this.C.f();
   }

   public dh v() {
      return new dh(this.C.c(), this.C.d(), this.C.e());
   }

   public void a(dh var1) {
      this.C.a(var1.a, var1.b, var1.c);
   }

   public void g(ia var1) {
      int var2 = me.c(var1.s / (double)16.0F);
      int var3 = me.c(var1.u / (double)16.0F);
      byte var4 = 2;

      for(int var5 = var2 - var4; var5 <= var2 + var4; ++var5) {
         for(int var6 = var3 - var4; var6 <= var3 + var4; ++var6) {
            this.c(var5, var6);
         }
      }

      if (!this.g.contains(var1)) {
         this.g.add(var1);
      }

   }

   public boolean a(vi var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(ia var1, byte var2) {
   }

   public void w() {
      this.g.removeAll(this.J);

      for(int var1 = 0; var1 < this.J.size(); ++var1) {
         ia var2 = (ia)this.J.get(var1);
         int var3 = var2.ai;
         int var4 = var2.ak;
         if (var2.ah && this.g(var3, var4)) {
            this.c(var3, var4).b(var2);
         }
      }

      for(int var5 = 0; var5 < this.J.size(); ++var5) {
         this.d((ia)this.J.get(var5));
      }

      this.J.clear();

      for(int var6 = 0; var6 < this.g.size(); ++var6) {
         ia var7 = (ia)this.g.get(var6);
         if (var7.n != null) {
            if (!var7.n.K && var7.n.m == var7) {
               continue;
            }

            var7.n.m = null;
            var7.n = null;
         }

         if (var7.K) {
            int var8 = var7.ai;
            int var9 = var7.ak;
            if (var7.ah && this.g(var8, var9)) {
               this.c(var8, var9).b(var7);
            }

            this.g.remove(var6--);
            this.d(var7);
         }
      }

   }

   public ej x() {
      return this.A;
   }

   public void f(int var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a(var1, var2, var3);
      if (var6 > 0) {
         yy.k[var6].a(this, var1, var2, var3, var4, var5);
      }

   }

   public nh y() {
      return this.B;
   }

   public si z() {
      return this.C;
   }

   public void A() {
      this.Q = !this.i.isEmpty();

      for(vi var2 : (Iterable<vi>)(Iterable)(this.i)) {
         if (!var2.ar()) {
            this.Q = false;
            break;
         }
      }

   }

   protected void B() {
      this.Q = false;

      for(vi var2 : (Iterable<vi>)(Iterable)(this.i)) {
         if (var2.ar()) {
            var2.a(false, false, true);
         }
      }

      this.I();
   }

   public boolean C() {
      if (this.Q && !this.I) {
         for(vi var2 : (Iterable<vi>)(Iterable)(this.i)) {
            if (!var2.aK()) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public float i(float var1) {
      return (this.p + (this.q - this.p) * var1) * this.j(var1);
   }

   public float j(float var1) {
      return this.n + (this.o - this.n) * var1;
   }

   public void k(float var1) {
      this.n = var1;
      this.o = var1;
   }

   public boolean D() {
      return (double)this.i(1.0F) > 0.9;
   }

   public boolean E() {
      return (double)this.j(1.0F) > 0.2;
   }

   public boolean w(int var1, int var2, int var3) {
      if (!this.E()) {
         return false;
      } else if (!this.l(var1, var2, var3)) {
         return false;
      } else if (this.e(var1, var3) > var2) {
         return false;
      } else {
         sr var4 = this.a().a(var1, var3);
         return var4.b() ? false : var4.c();
      }
   }

   public void a(String var1, afz var2) {
      this.E.a(var1, var2);
   }

   public afz a(Class var1, String var2) {
      return this.E.a(var1, var2);
   }

   public int b(String var1) {
      return this.E.a(var1);
   }

   public void g(int var1, int var2, int var3, int var4, int var5) {
      this.a((vi)null, var1, var2, var3, var4, var5);
   }

   public void a(vi var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.z.size(); ++var7) {
         ((bd)this.z.get(var7)).a(var1, var2, var3, var4, var5, var6);
      }

   }

   public int b() {
      return this.c;
   }

   public Random x(int var1, int var2, int var3) {
      long var4 = (long)var1 * 341873128712L + (long)var2 * 132897987541L + this.z().b() + (long)var3;
      this.w.setSeed(var4);
      return this.w;
   }

   public boolean F() {
      return false;
   }

   public void a(bn var1, int var2, int var3, int var4, int var5, int var6, int var7) {
   }

   public yx a(jf var1, int var2, int var3, int var4) {
      List var5 = this.x().a(var1, var2, var3, var4);
      return var5 != null && !var5.isEmpty() ? (yx)nc.a(this.w, (Collection)var5) : null;
   }

   public am b(String var1, int var2, int var3, int var4) {
      return this.x().a(this, var1, var2, var3, var4);
   }
}
