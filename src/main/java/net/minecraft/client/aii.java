package net.minecraft.client;

public class aii extends zo {
   private static boolean[] c = new boolean[256];
   public boolean b = false;
   private int d = 0;
   private int e = 0;

   public aii(ry var1) {
      super(var1);
      this.aA = "/mob/enderman.png";
      this.bw = 0.2F;
      this.a = 7;
      this.a(0.6F, 2.9F);
      this.V = 1.0F;
   }

   public int f_() {
      return 40;
   }

   protected void b() {
      super.b();
      this.ag.a(16, new Byte((byte)0));
      this.ag.a(17, new Byte((byte)0));
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("carried", (short)this.ay());
      var1.a("carriedData", (short)this.aD());
   }

   public void b(ik var1) {
      super.b(var1);
      this.b(var1.d("carried"));
      this.c(var1.d("carriedData"));
   }

   protected ia o() {
      vi var1 = this.o.b(this, (double)64.0F);
      if (var1 != null) {
         if (this.d(var1)) {
            if (this.e++ == 5) {
               this.e = 0;
               return var1;
            }
         } else {
            this.e = 0;
         }
      }

      return null;
   }

   public int a(float var1) {
      return super.a(var1);
   }

   public float b(float var1) {
      return super.b(var1);
   }

   private boolean d(vi var1) {
      dk var2 = var1.by.b[3];
      if (var2 != null && var2.c == yy.ba.bM) {
         return false;
      } else {
         fb var3 = var1.f(1.0F).c();
         fb var4 = fb.b(this.s - var1.s, this.C.b + (double)(this.N / 2.0F) - (var1.t + (double)var1.E()), this.u - var1.u);
         double var5 = var4.d();
         var4 = var4.c();
         double var7 = var3.b(var4);
         return var7 > (double)1.0F - 0.025 / var5 ? var1.i(this) : false;
      }
   }

   public void c() {
      if (this.C()) {
         this.a(pm.e, 1);
      }

      this.b = this.h != null;
      this.bw = this.h != null ? 6.5F : 0.3F;
      if (!this.o.I) {
         if (this.ay() == 0) {
            if (this.Y.nextInt(20) == 0) {
               int var1 = me.c(this.s - (double)2.0F + this.Y.nextDouble() * (double)4.0F);
               int var2 = me.c(this.t + this.Y.nextDouble() * (double)3.0F);
               int var3 = me.c(this.u - (double)2.0F + this.Y.nextDouble() * (double)4.0F);
               int var4 = this.o.a(var1, var2, var3);
               if (c[var4]) {
                  this.b(this.o.a(var1, var2, var3));
                  this.c(this.o.d(var1, var2, var3));
                  this.o.g(var1, var2, var3, 0);
               }
            }
         } else if (this.Y.nextInt(2000) == 0) {
            int var6 = me.c(this.s - (double)1.0F + this.Y.nextDouble() * (double)2.0F);
            int var9 = me.c(this.t + this.Y.nextDouble() * (double)2.0F);
            int var10 = me.c(this.u - (double)1.0F + this.Y.nextDouble() * (double)2.0F);
            int var11 = this.o.a(var6, var9, var10);
            int var5 = this.o.a(var6, var9 - 1, var10);
            if (var11 == 0 && var5 > 0 && yy.k[var5].b()) {
               this.o.d(var6, var9, var10, this.ay(), this.aD());
               this.b(0);
            }
         }
      }

      for(int var7 = 0; var7 < 2; ++var7) {
         this.o.a("portal", this.s + (this.Y.nextDouble() - (double)0.5F) * (double)this.M, this.t + this.Y.nextDouble() * (double)this.N - (double)0.25F, this.u + (this.Y.nextDouble() - (double)0.5F) * (double)this.M, (this.Y.nextDouble() - (double)0.5F) * (double)2.0F, -this.Y.nextDouble(), (this.Y.nextDouble() - (double)0.5F) * (double)2.0F);
      }

      if (this.o.l() && !this.o.I) {
         float var8 = this.b(1.0F);
         if (var8 > 0.5F && this.o.l(me.c(this.s), me.c(this.t), me.c(this.u)) && this.Y.nextFloat() * 30.0F < (var8 - 0.4F) * 2.0F) {
            this.h = null;
            this.ax();
         }
      }

      if (this.C()) {
         this.h = null;
         this.ax();
      }

      this.bu = false;
      if (this.h != null) {
         this.a(this.h, 100.0F, 100.0F);
      }

      if (!this.o.I && this.K()) {
         if (this.h != null) {
            if (this.h instanceof vi && this.d((vi)this.h)) {
               this.br = this.bs = 0.0F;
               this.bw = 0.0F;
               if (this.h.d((ia)this) < (double)16.0F) {
                  this.ax();
               }

               this.d = 0;
            } else if (this.h.d((ia)this) > (double)256.0F && this.d++ >= 30 && this.j(this.h)) {
               this.d = 0;
            }
         } else {
            this.d = 0;
         }
      }

      super.c();
   }

   protected boolean ax() {
      double var1 = this.s + (this.Y.nextDouble() - (double)0.5F) * (double)64.0F;
      double var3 = this.t + (double)(this.Y.nextInt(64) - 32);
      double var5 = this.u + (this.Y.nextDouble() - (double)0.5F) * (double)64.0F;
      return this.j(var1, var3, var5);
   }

   protected boolean j(ia var1) {
      fb var2 = fb.b(this.s - var1.s, this.C.b + (double)(this.N / 2.0F) - var1.t + (double)var1.E(), this.u - var1.u);
      var2 = var2.c();
      double var3 = (double)16.0F;
      double var5 = this.s + (this.Y.nextDouble() - (double)0.5F) * (double)8.0F - var2.a * var3;
      double var7 = this.t + (double)(this.Y.nextInt(16) - 8) - var2.b * var3;
      double var9 = this.u + (this.Y.nextDouble() - (double)0.5F) * (double)8.0F - var2.c * var3;
      return this.j(var5, var7, var9);
   }

   protected boolean j(double var1, double var3, double var5) {
      double var7 = this.s;
      double var9 = this.t;
      double var11 = this.u;
      this.s = var1;
      this.t = var3;
      this.u = var5;
      boolean var13 = false;
      int var14 = me.c(this.s);
      int var15 = me.c(this.t);
      int var16 = me.c(this.u);
      if (this.o.i(var14, var15, var16)) {
         boolean var17 = false;

         while(!var17 && var15 > 0) {
            int var18 = this.o.a(var14, var15 - 1, var16);
            if (var18 != 0 && yy.k[var18].bZ.d()) {
               var17 = true;
            } else {
               --this.t;
               --var15;
            }
         }

         if (var17) {
            this.d(this.s, this.t, this.u);
            if (this.o.a((ia)this, (c)this.C).size() == 0 && !this.o.b(this.C)) {
               var13 = true;
            }
         }
      }

      if (!var13) {
         this.d(var7, var9, var11);
         return false;
      } else {
         short var30 = 128;

         for(int var31 = 0; var31 < var30; ++var31) {
            double var19 = (double)var31 / ((double)var30 - (double)1.0F);
            float var21 = (this.Y.nextFloat() - 0.5F) * 0.2F;
            float var22 = (this.Y.nextFloat() - 0.5F) * 0.2F;
            float var23 = (this.Y.nextFloat() - 0.5F) * 0.2F;
            double var24 = var7 + (this.s - var7) * var19 + (this.Y.nextDouble() - (double)0.5F) * (double)this.M * (double)2.0F;
            double var26 = var9 + (this.t - var9) * var19 + this.Y.nextDouble() * (double)this.N;
            double var28 = var11 + (this.u - var11) * var19 + (this.Y.nextDouble() - (double)0.5F) * (double)this.M * (double)2.0F;
            this.o.a("portal", var24, var26, var28, (double)var21, (double)var22, (double)var23);
         }

         this.o.a(var7, var9, var11, "mob.endermen.portal", 1.0F, 1.0F);
         this.o.a(this, "mob.endermen.portal", 1.0F, 1.0F);
         return true;
      }
   }

   protected String e() {
      return "mob.endermen.idle";
   }

   protected String f() {
      return "mob.endermen.hit";
   }

   protected String g() {
      return "mob.endermen.death";
   }

   protected int k() {
      return acy.bm.bM;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.k();
      if (var3 > 0) {
         int var4 = this.Y.nextInt(2 + var2);

         for(int var5 = 0; var5 < var4; ++var5) {
            this.b(var3, 1);
         }
      }

   }

   public void b(int var1) {
      this.ag.b(16, (byte)(var1 & 255));
   }

   public int ay() {
      return this.ag.a(16);
   }

   public void c(int var1) {
      this.ag.b(17, (byte)(var1 & 255));
   }

   public int aD() {
      return this.ag.a(17);
   }

   public boolean a(pm var1, int var2) {
      if (var1 instanceof qq) {
         for(int var3 = 0; var3 < 64; ++var3) {
            if (this.ax()) {
               return true;
            }
         }

         return false;
      } else {
         return super.a(var1, var2);
      }
   }

   static {
      c[yy.u.bM] = true;
      c[yy.v.bM] = true;
      c[yy.E.bM] = true;
      c[yy.F.bM] = true;
      c[yy.ad.bM] = true;
      c[yy.ae.bM] = true;
      c[yy.af.bM] = true;
      c[yy.ag.bM] = true;
      c[yy.am.bM] = true;
      c[yy.aV.bM] = true;
      c[yy.aW.bM] = true;
      c[yy.ba.bM] = true;
      c[yy.br.bM] = true;
      c[yy.by.bM] = true;
   }
}
