package net.minecraft.client;

import java.util.List;

public class aik extends fx {
   private boolean a = false;
   private float b;
   private float c;
   private boolean d;
   private boolean e;
   private float f;
   private float g;

   public aik(ry var1) {
      super(var1);
      this.aA = "/mob/wolf.png";
      this.a(0.8F, 0.8F);
      this.bw = 1.1F;
   }

   public int f_() {
      return this.aG() ? 20 : 8;
   }

   protected void b() {
      super.b();
      this.ag.a(16, (byte)0);
      this.ag.a(17, "");
      this.ag.a(18, new Integer(this.ag()));
   }

   protected boolean d_() {
      return false;
   }

   public String I() {
      if (this.aG()) {
         return "/mob/wolf_tame.png";
      } else {
         return this.aF() ? "/mob/wolf_angry.png" : super.I();
      }
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("Angry", this.aF());
      var1.a("Sitting", this.aE());
      if (this.aD() == null) {
         var1.a("Owner", "");
      } else {
         var1.a("Owner", this.aD());
      }

   }

   public void b(ik var1) {
      super.b(var1);
      this.e(var1.m("Angry"));
      this.d(var1.m("Sitting"));
      String var2 = var1.i("Owner");
      if (var2.length() > 0) {
         this.a(var2);
         this.f(true);
      }

   }

   protected boolean d() {
      return this.aF();
   }

   protected String e() {
      if (this.aF()) {
         return "mob.wolf.growl";
      } else if (this.Y.nextInt(3) == 0) {
         return this.aG() && this.ag.c(18) < 10 ? "mob.wolf.whine" : "mob.wolf.panting";
      } else {
         return "mob.wolf.bark";
      }
   }

   protected String f() {
      return "mob.wolf.hurt";
   }

   protected String g() {
      return "mob.wolf.death";
   }

   protected float w_() {
      return 0.4F;
   }

   protected int k() {
      return -1;
   }

   protected void n() {
      super.n();
      if (!this.i && !this.aB() && this.aG() && this.n == null) {
         vi var3 = this.o.a(this.aD());
         if (var3 != null) {
            float var2 = var3.c(this);
            if (var2 > 5.0F) {
               this.c(var3, var2);
            }
         } else if (!this.D()) {
            this.d(true);
         }
      } else if (this.h == null && !this.aB() && !this.aG() && this.o.w.nextInt(100) == 0) {
         List var1 = this.o.a(net.minecraft.client.hm.class, net.minecraft.client.c.b(this.s, this.t, this.u, this.s + (double)1.0F, this.t + (double)1.0F, this.u + (double)1.0F).b((double)16.0F, (double)4.0F, (double)16.0F));
         if (!var1.isEmpty()) {
            this.a((ia)((ia)var1.get(this.o.w.nextInt(var1.size()))));
         }
      }

      if (this.D()) {
         this.d(false);
      }

      if (!this.o.I) {
         this.ag.b(18, this.ag());
      }

   }

   public void c() {
      super.c();
      this.a = false;
      if (this.an() && !this.aB() && !this.aF()) {
         ia var1 = this.ao();
         if (var1 instanceof vi) {
            vi var2 = (vi)var1;
            dk var3 = var2.by.a();
            if (var3 != null) {
               if (!this.aG() && var3.c == acy.aW.bM) {
                  this.a = true;
               } else if (this.aG() && acy.d[var3.c] instanceof agu) {
                  this.a = ((agu)acy.d[var3.c]).q();
               }
            }
         }
      }

      if (!this.aH && this.d && !this.e && !this.aB() && this.D) {
         this.e = true;
         this.f = 0.0F;
         this.g = 0.0F;
         this.o.a(this, (byte)8);
      }

   }

   public void a() {
      super.a();
      this.c = this.b;
      if (this.a) {
         this.b += (1.0F - this.b) * 0.4F;
      } else {
         this.b += (0.0F - this.b) * 0.4F;
      }

      if (this.a) {
         this.bx = 10;
      }

      if (this.C()) {
         this.d = true;
         this.e = false;
         this.f = 0.0F;
         this.g = 0.0F;
      } else if ((this.d || this.e) && this.e) {
         if (this.f == 0.0F) {
            this.o.a(this, "mob.wolf.shake", this.w_(), (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F);
         }

         this.g = this.f;
         this.f += 0.05F;
         if (this.g >= 2.0F) {
            this.d = false;
            this.e = false;
            this.g = 0.0F;
            this.f = 0.0F;
         }

         if (this.f > 0.4F) {
            float var1 = (float)this.C.b;
            int var2 = (int)(me.a((this.f - 0.4F) * (float)Math.PI) * 7.0F);

            for(int var3 = 0; var3 < var2; ++var3) {
               float var4 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M * 0.5F;
               float var5 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M * 0.5F;
               this.o.a("splash", this.s + (double)var4, (double)(var1 + 0.8F), this.u + (double)var5, this.v, this.w, this.x);
            }
         }
      }

   }

   public boolean ax() {
      return this.d;
   }

   public float g(float var1) {
      return 0.75F + (this.g + (this.f - this.g) * var1) / 2.0F * 0.25F;
   }

   public float e(float var1, float var2) {
      float var3 = (this.g + (this.f - this.g) * var1 + var2) / 1.8F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      } else if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return me.a(var3 * (float)Math.PI) * me.a(var3 * (float)Math.PI * 11.0F) * 0.15F * (float)Math.PI;
   }

   public float h(float var1) {
      return (this.c + (this.b - this.c) * var1) * 0.15F * (float)Math.PI;
   }

   public float E() {
      return this.N * 0.8F;
   }

   protected int am() {
      return this.aE() ? 20 : super.am();
   }

   private void c(ia var1, float var2) {
      dw var3 = this.o.a(this, var1, 16.0F);
      if (var3 == null && var2 > 12.0F) {
         int var4 = me.c(var1.s) - 2;
         int var5 = me.c(var1.u) - 2;
         int var6 = me.c(var1.C.b);

         for(int var7 = 0; var7 <= 4; ++var7) {
            for(int var8 = 0; var8 <= 4; ++var8) {
               if ((var7 < 1 || var8 < 1 || var7 > 3 || var8 > 3) && this.o.g(var4 + var7, var6 - 1, var5 + var8) && !this.o.g(var4 + var7, var6, var5 + var8) && !this.o.g(var4 + var7, var6 + 1, var5 + var8)) {
                  this.c((double)((float)(var4 + var7) + 0.5F), (double)var6, (double)((float)(var5 + var8) + 0.5F), this.y, this.z);
                  return;
               }
            }
         }
      } else {
         this.a((dw)var3);
      }

   }

   protected boolean az() {
      return this.aE() || this.e;
   }

   public boolean a(pm var1, int var2) {
      ia var3 = var1.a();
      this.d(false);
      if (var3 != null && !(var3 instanceof vi) && !(var3 instanceof ro)) {
         var2 = (var2 + 1) / 2;
      }

      if (!super.a(var1, var2)) {
         return false;
      } else {
         if (!this.aG() && !this.aF()) {
            if (var3 instanceof vi) {
               this.e(true);
               this.h = var3;
            }

            if (var3 instanceof ro && ((ro)var3).c != null) {
               var3 = ((ro)var3).c;
            }

            if (var3 instanceof nq) {
               for(ia var6 : (Iterable<ia>)(Iterable)(this.o.a(net.minecraft.client.aik.class, net.minecraft.client.c.b(this.s, this.t, this.u, this.s + (double)1.0F, this.t + (double)1.0F, this.u + (double)1.0F).b((double)16.0F, (double)4.0F, (double)16.0F)))) {
                  aik var7 = (aik)var6;
                  if (!var7.aG() && var7.h == null) {
                     var7.h = var3;
                     if (var3 instanceof vi) {
                        var7.e(true);
                     }
                  }
               }
            }
         } else if (var3 != this && var3 != null) {
            if (this.aG() && var3 instanceof vi && ((vi)var3).bJ.equalsIgnoreCase(this.aD())) {
               return true;
            }

            this.h = var3;
         }

         return true;
      }
   }

   protected ia o() {
      return this.aF() ? this.o.a(this, (double)16.0F) : null;
   }

   protected void a(ia var1, float var2) {
      if (var2 > 2.0F && var2 < 6.0F && this.Y.nextInt(10) == 0) {
         if (this.D) {
            double var8 = var1.s - this.s;
            double var5 = var1.u - this.u;
            float var7 = me.a(var8 * var8 + var5 * var5);
            this.v = var8 / (double)var7 * (double)0.5F * (double)0.8F + this.v * (double)0.2F;
            this.x = var5 / (double)var7 * (double)0.5F * (double)0.8F + this.x * (double)0.2F;
            this.w = (double)0.4F;
         }
      } else if ((double)var2 < (double)1.5F && var1.C.e > this.C.b && var1.C.b < this.C.e) {
         this.aT = 20;
         byte var3 = 2;
         if (this.aG()) {
            var3 = 4;
         }

         var1.a(pm.a((nq)this), var3);
      }

   }

   public boolean c(vi var1) {
      dk var2 = var1.by.a();
      if (!this.aG()) {
         if (var2 != null && var2.c == acy.aW.bM && !this.aF()) {
            --var2.a;
            if (var2.a <= 0) {
               var1.by.a(var1.by.c, (dk)null);
            }

            if (!this.o.I) {
               if (this.Y.nextInt(3) == 0) {
                  this.f(true);
                  this.a((dw)null);
                  this.d(true);
                  this.h(20);
                  this.a(var1.bJ);
                  this.b(true);
                  this.o.a(this, (byte)7);
               } else {
                  this.b(false);
                  this.o.a(this, (byte)6);
               }
            }

            return true;
         }
      } else {
         if (var2 != null && acy.d[var2.c] instanceof agu) {
            agu var3 = (agu)acy.d[var2.c];
            if (var3.q() && this.ag.c(18) < 20) {
               --var2.a;
               this.a_(var3.o());
               if (var2.a <= 0) {
                  var1.by.a(var1.by.c, (dk)null);
               }

               return true;
            }
         }

         if (var1.bJ.equalsIgnoreCase(this.aD())) {
            if (!this.o.I) {
               this.d(!this.aE());
               this.bu = false;
               this.a((dw)null);
            }

            return true;
         }
      }

      return super.c(var1);
   }

   void b(boolean var1) {
      String var2 = "heart";
      if (!var1) {
         var2 = "smoke";
      }

      for(int var3 = 0; var3 < 7; ++var3) {
         double var4 = this.Y.nextGaussian() * 0.02;
         double var6 = this.Y.nextGaussian() * 0.02;
         double var8 = this.Y.nextGaussian() * 0.02;
         this.o.a(var2, this.s + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, this.t + (double)0.5F + (double)(this.Y.nextFloat() * this.N), this.u + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, var4, var6, var8);
      }

   }

   public void a(byte var1) {
      if (var1 == 7) {
         this.b(true);
      } else if (var1 == 6) {
         this.b(false);
      } else if (var1 == 8) {
         this.e = true;
         this.f = 0.0F;
         this.g = 0.0F;
      } else {
         super.a(var1);
      }

   }

   public float ay() {
      if (this.aF()) {
         return 1.5393804F;
      } else {
         return this.aG() ? (0.55F - (float)(20 - this.ag.c(18)) * 0.02F) * (float)Math.PI : ((float)Math.PI / 5F);
      }
   }

   public int g_() {
      return 8;
   }

   public String aD() {
      return this.ag.d(17);
   }

   public void a(String var1) {
      this.ag.b(17, var1);
   }

   public boolean aE() {
      return (this.ag.a(16) & 1) != 0;
   }

   public void d(boolean var1) {
      byte var2 = this.ag.a(16);
      if (var1) {
         this.ag.b(16, (byte)(var2 | 1));
      } else {
         this.ag.b(16, (byte)(var2 & -2));
      }

   }

   public boolean aF() {
      return (this.ag.a(16) & 2) != 0;
   }

   public void e(boolean var1) {
      byte var2 = this.ag.a(16);
      if (var1) {
         this.ag.b(16, (byte)(var2 | 2));
      } else {
         this.ag.b(16, (byte)(var2 & -3));
      }

   }

   public boolean aG() {
      return (this.ag.a(16) & 4) != 0;
   }

   public void f(boolean var1) {
      byte var2 = this.ag.a(16);
      if (var1) {
         this.ag.b(16, (byte)(var2 | 4));
      } else {
         this.ag.b(16, (byte)(var2 & -5));
      }

   }

   protected fx a(fx var1) {
      return new aik(this.o);
   }
}
