package net.minecraft.client;

import java.util.Random;

public class ql {
   protected ry a;
   protected Random b;
   protected int c;
   protected int d;
   protected sr e;
   protected ig f = new adp(4);
   protected ig g;
   protected ig h;
   protected ig i;
   protected ig j;
   protected ig k;
   protected ig l;
   protected ig m;
   protected ig n;
   protected ig o;
   protected ig p;
   protected ig q;
   protected ig r;
   protected ig s;
   protected ig t;
   protected ig u;
   protected ig v;
   protected ig w;
   protected ig x;
   protected int y;
   protected int z;
   protected int A;
   protected int B;
   protected int C;
   protected int D;
   protected int E;
   protected int F;
   protected int G;
   protected int H;
   protected int I;
   protected int J;
   public boolean K;

   public ql(sr var1) {
      this.g = new fc(7, yy.E.bM);
      this.h = new fc(6, yy.F.bM);
      this.i = new ky(yy.v.bM, 32);
      this.j = new ky(yy.F.bM, 32);
      this.k = new ky(yy.I.bM, 16);
      this.l = new ky(yy.H.bM, 8);
      this.m = new ky(yy.G.bM, 8);
      this.n = new ky(yy.aN.bM, 7);
      this.o = new ky(yy.aw.bM, 7);
      this.p = new ky(yy.N.bM, 6);
      this.q = new bu(yy.ad.bM);
      this.r = new bu(yy.ae.bM);
      this.s = new bu(yy.af.bM);
      this.t = new bu(yy.ag.bM);
      this.u = new acp();
      this.v = new tw();
      this.w = new ade();
      this.x = new jj();
      this.y = 0;
      this.z = 0;
      this.A = 2;
      this.B = 1;
      this.C = 0;
      this.D = 0;
      this.E = 0;
      this.F = 0;
      this.G = 1;
      this.H = 3;
      this.I = 1;
      this.J = 0;
      this.K = true;
      this.e = var1;
   }

   public void a(ry var1, Random var2, int var3, int var4) {
      if (this.a != null) {
         throw new RuntimeException("Already decorating!!");
      } else {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.a();
         this.a = null;
         this.b = null;
      }
   }

   protected void a() {
      this.b();

      for(int var1 = 0; var1 < this.H; ++var1) {
         int var2 = this.c + this.b.nextInt(16) + 8;
         int var3 = this.d + this.b.nextInt(16) + 8;
         this.g.a(this.a, this.b, var2, this.a.f(var2, var3), var3);
      }

      for(int var7 = 0; var7 < this.I; ++var7) {
         int var10 = this.c + this.b.nextInt(16) + 8;
         int var27 = this.d + this.b.nextInt(16) + 8;
         this.f.a(this.a, this.b, var10, this.a.f(var10, var27), var27);
      }

      for(int var8 = 0; var8 < this.G; ++var8) {
         int var11 = this.c + this.b.nextInt(16) + 8;
         int var28 = this.d + this.b.nextInt(16) + 8;
         this.g.a(this.a, this.b, var11, this.a.f(var11, var28), var28);
      }

      int var9 = this.z;
      if (this.b.nextInt(10) == 0) {
         ++var9;
      }

      for(int var12 = 0; var12 < var9; ++var12) {
         int var29 = this.c + this.b.nextInt(16) + 8;
         int var4 = this.d + this.b.nextInt(16) + 8;
         ig var5 = this.e.a(this.b);
         var5.a((double)1.0F, (double)1.0F, (double)1.0F);
         var5.a(this.a, this.b, var29, this.a.d(var29, var4), var4);
      }

      for(int var13 = 0; var13 < this.J; ++var13) {
         int var30 = this.c + this.b.nextInt(16) + 8;
         int var46 = this.d + this.b.nextInt(16) + 8;
         this.u.a(this.a, this.b, var30, this.a.d(var30, var46), var46);
      }

      for(int var14 = 0; var14 < this.A; ++var14) {
         int var31 = this.c + this.b.nextInt(16) + 8;
         int var47 = this.b.nextInt(this.a.c);
         int var62 = this.d + this.b.nextInt(16) + 8;
         this.q.a(this.a, this.b, var31, var47, var62);
         if (this.b.nextInt(4) == 0) {
            var31 = this.c + this.b.nextInt(16) + 8;
            var47 = this.b.nextInt(this.a.c);
            var62 = this.d + this.b.nextInt(16) + 8;
            this.r.a(this.a, this.b, var31, var47, var62);
         }
      }

      for(int var15 = 0; var15 < this.B; ++var15) {
         byte var33 = 1;
         int var49 = this.c + this.b.nextInt(16) + 8;
         int var64 = this.b.nextInt(this.a.c);
         int var6 = this.d + this.b.nextInt(16) + 8;
         (new ahu(yy.X.bM, var33)).a(this.a, this.b, var49, var64, var6);
      }

      for(int var16 = 0; var16 < this.C; ++var16) {
         int var34 = this.c + this.b.nextInt(16) + 8;
         int var50 = this.b.nextInt(this.a.c);
         int var65 = this.d + this.b.nextInt(16) + 8;
         (new mb(yy.Y.bM)).a(this.a, this.b, var34, var50, var65);
      }

      for(int var17 = 0; var17 < this.y; ++var17) {
         int var35 = this.c + this.b.nextInt(16) + 8;
         int var51 = this.d + this.b.nextInt(16) + 8;

         int var66;
         for(var66 = this.b.nextInt(this.a.c); var66 > 0 && this.a.a(var35, var66 - 1, var51) == 0; --var66) {
         }

         this.x.a(this.a, this.b, var35, var66, var51);
      }

      for(int var18 = 0; var18 < this.D; ++var18) {
         if (this.b.nextInt(4) == 0) {
            int var36 = this.c + this.b.nextInt(16) + 8;
            int var52 = this.d + this.b.nextInt(16) + 8;
            int var67 = this.a.d(var36, var52);
            this.s.a(this.a, this.b, var36, var67, var52);
         }

         if (this.b.nextInt(8) == 0) {
            int var37 = this.c + this.b.nextInt(16) + 8;
            int var53 = this.d + this.b.nextInt(16) + 8;
            int var68 = this.b.nextInt(this.a.c);
            this.t.a(this.a, this.b, var37, var68, var53);
         }
      }

      if (this.b.nextInt(4) == 0) {
         int var19 = this.c + this.b.nextInt(16) + 8;
         int var38 = this.b.nextInt(this.a.c);
         int var54 = this.d + this.b.nextInt(16) + 8;
         this.s.a(this.a, this.b, var19, var38, var54);
      }

      if (this.b.nextInt(8) == 0) {
         int var20 = this.c + this.b.nextInt(16) + 8;
         int var39 = this.b.nextInt(this.a.c);
         int var55 = this.d + this.b.nextInt(16) + 8;
         this.t.a(this.a, this.b, var20, var39, var55);
      }

      for(int var21 = 0; var21 < this.E; ++var21) {
         int var40 = this.c + this.b.nextInt(16) + 8;
         int var56 = this.d + this.b.nextInt(16) + 8;
         int var69 = this.b.nextInt(this.a.c);
         this.v.a(this.a, this.b, var40, var69, var56);
      }

      for(int var22 = 0; var22 < 10; ++var22) {
         int var41 = this.c + this.b.nextInt(16) + 8;
         int var57 = this.b.nextInt(this.a.c);
         int var70 = this.d + this.b.nextInt(16) + 8;
         this.v.a(this.a, this.b, var41, var57, var70);
      }

      if (this.b.nextInt(32) == 0) {
         int var23 = this.c + this.b.nextInt(16) + 8;
         int var42 = this.b.nextInt(this.a.c);
         int var58 = this.d + this.b.nextInt(16) + 8;
         (new sz()).a(this.a, this.b, var23, var42, var58);
      }

      for(int var24 = 0; var24 < this.F; ++var24) {
         int var43 = this.c + this.b.nextInt(16) + 8;
         int var59 = this.b.nextInt(this.a.c);
         int var71 = this.d + this.b.nextInt(16) + 8;
         this.w.a(this.a, this.b, var43, var59, var71);
      }

      if (this.K) {
         for(int var25 = 0; var25 < 50; ++var25) {
            int var44 = this.c + this.b.nextInt(16) + 8;
            int var60 = this.b.nextInt(this.b.nextInt(this.a.c - 8) + 8);
            int var72 = this.d + this.b.nextInt(16) + 8;
            (new ib(yy.A.bM)).a(this.a, this.b, var44, var60, var72);
         }

         for(int var26 = 0; var26 < 20; ++var26) {
            int var45 = this.c + this.b.nextInt(16) + 8;
            int var61 = this.b.nextInt(this.b.nextInt(this.b.nextInt(this.a.c - 16) + 8) + 8);
            int var73 = this.d + this.b.nextInt(16) + 8;
            (new ib(yy.C.bM)).a(this.a, this.b, var45, var61, var73);
         }
      }

   }

   protected void a(int var1, ig var2, int var3, int var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = this.c + this.b.nextInt(16);
         int var7 = this.b.nextInt(var4 - var3) + var3;
         int var8 = this.d + this.b.nextInt(16);
         var2.a(this.a, this.b, var6, var7, var8);
      }

   }

   protected void b(int var1, ig var2, int var3, int var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = this.c + this.b.nextInt(16);
         int var7 = this.b.nextInt(var4) + this.b.nextInt(var4) + (var3 - var4);
         int var8 = this.d + this.b.nextInt(16);
         var2.a(this.a, this.b, var6, var7, var8);
      }

   }

   protected void b() {
      this.a(20, this.i, 0, this.a.c);
      this.a(10, this.j, 0, this.a.c);
      this.a(20, this.k, 0, this.a.c);
      this.a(20, this.l, 0, this.a.c / 2);
      this.a(2, this.m, 0, this.a.c / 4);
      this.a(8, this.n, 0, this.a.c / 8);
      this.a(1, this.o, 0, this.a.c / 8);
      this.b(1, this.p, this.a.c / 8, this.a.c / 8);
   }
}
