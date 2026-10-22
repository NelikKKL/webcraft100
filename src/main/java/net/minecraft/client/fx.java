package net.minecraft.client;

import java.util.List;

public abstract class fx extends ww {
   private int a;
   private int b = 0;

   public fx(ry var1) {
      super(var1);
   }

   protected void b() {
      super.b();
      this.ag.a(12, new Integer(0));
   }

   public int m() {
      return this.ag.c(12);
   }

   public void b(int var1) {
      this.ag.b(12, var1);
   }

   public void c() {
      super.c();
      int var1 = this.m();
      if (var1 < 0) {
         ++var1;
         this.b(var1);
      } else if (var1 > 0) {
         --var1;
         this.b(var1);
      }

      if (this.a > 0) {
         --this.a;
         String var2 = "heart";
         if (this.a % 10 == 0) {
            double var3 = this.Y.nextGaussian() * 0.02;
            double var5 = this.Y.nextGaussian() * 0.02;
            double var7 = this.Y.nextGaussian() * 0.02;
            this.o.a(var2, this.s + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, this.t + (double)0.5F + (double)(this.Y.nextFloat() * this.N), this.u + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, var3, var5, var7);
         }
      } else {
         this.b = 0;
      }

   }

   protected void a(ia var1, float var2) {
      if (var1 instanceof vi) {
         if (var2 < 3.0F) {
            double var3 = var1.s - this.s;
            double var5 = var1.u - this.u;
            this.y = (float)(Math.atan2(var5, var3) * (double)180.0F / (double)(float)Math.PI) - 90.0F;
            this.i = true;
         }

         vi var7 = (vi)var1;
         if (var7.aH() == null || !this.a(var7.aH())) {
            this.h = null;
         }
      } else if (var1 instanceof fx) {
         fx var8 = (fx)var1;
         if (this.m() > 0 && var8.m() < 0) {
            if ((double)var2 < (double)2.5F) {
               this.i = true;
            }
         } else if (this.a > 0 && var8.a > 0) {
            if (var8.h == null) {
               var8.h = this;
            }

            if (var8.h == this && (double)var2 < (double)3.5F) {
               ++var8.a;
               ++this.a;
               ++this.b;
               if (this.b % 4 == 0) {
                  this.o.a("heart", this.s + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, this.t + (double)0.5F + (double)(this.Y.nextFloat() * this.N), this.u + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, (double)0.0F, (double)0.0F, (double)0.0F);
               }

               if (this.b == 60) {
                  this.b((fx)var1);
               }
            } else {
               this.b = 0;
            }
         } else {
            this.b = 0;
         }
      }

   }

   private void b(fx var1) {
      fx var2 = this.a(var1);
      if (var2 != null) {
         this.b(6000);
         var1.b(6000);
         this.a = 0;
         this.b = 0;
         this.h = null;
         var1.h = null;
         var1.b = 0;
         var1.a = 0;
         var2.b(-24000);
         var2.c(this.s, this.t, this.u, this.y, this.z);

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = this.Y.nextGaussian() * 0.02;
            double var6 = this.Y.nextGaussian() * 0.02;
            double var8 = this.Y.nextGaussian() * 0.02;
            this.o.a("heart", this.s + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, this.t + (double)0.5F + (double)(this.Y.nextFloat() * this.N), this.u + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, var4, var6, var8);
         }

         this.o.a((ia)var2);
      }

   }

   protected abstract fx a(fx var1);

   protected void b(ia var1, float var2) {
   }

   public boolean a(pm var1, int var2) {
      this.by = 60;
      this.h = null;
      this.a = 0;
      return super.a(var1, var2);
   }

   protected float a(int var1, int var2, int var3) {
      return this.o.a(var1, var2 - 1, var3) == yy.u.bM ? 10.0F : this.o.c(var1, var2, var3) - 0.5F;
   }

   public void a(ik var1) {
      super.a((ik)var1);
      var1.a("Age", this.m());
      var1.a("InLove", this.a);
   }

   public void b(ik var1) {
      super.b(var1);
      this.b(var1.e("Age"));
      this.a = var1.e("InLove");
   }

   protected ia o() {
      if (this.by > 0) {
         return null;
      } else {
         float var1 = 8.0F;
         if (this.a > 0) {
            List var2 = this.o.a(this.getClass(), this.C.a((double)var1, (double)var1, (double)var1));

            for(int var3 = 0; var3 < var2.size(); ++var3) {
               fx var4 = (fx)var2.get(var3);
               if (var4 != this && var4.a > 0) {
                  return var4;
               }
            }
         } else if (this.m() == 0) {
            List var5 = this.o.a(vi.class, this.C.a((double)var1, (double)var1, (double)var1));

            for(int var7 = 0; var7 < var5.size(); ++var7) {
               vi var9 = (vi)var5.get(var7);
               if (var9.aH() != null && this.a(var9.aH())) {
                  return var9;
               }
            }
         } else if (this.m() > 0) {
            List var6 = this.o.a(this.getClass(), this.C.a((double)var1, (double)var1, (double)var1));

            for(int var8 = 0; var8 < var6.size(); ++var8) {
               fx var10 = (fx)var6.get(var8);
               if (var10 != this && var10.m() < 0) {
                  return var10;
               }
            }
         }

         return null;
      }
   }

   public boolean i() {
      int var1 = me.c(this.s);
      int var2 = me.c(this.C.b);
      int var3 = me.c(this.u);
      return this.o.a(var1, var2 - 1, var3) == yy.u.bM && this.o.m(var1, var2, var3) > 8 && super.i();
   }

   public int p_() {
      return 120;
   }

   protected boolean d() {
      return false;
   }

   protected int b(vi var1) {
      return 1 + this.o.w.nextInt(3);
   }

   protected boolean a(dk var1) {
      return var1.c == acy.S.bM;
   }

   public boolean c(vi var1) {
      dk var2 = var1.by.a();
      if (var2 != null && this.a(var2) && this.m() == 0) {
         --var2.a;
         if (var2.a <= 0) {
            var1.by.a(var1.by.c, (dk)null);
         }

         this.a = 600;
         this.h = null;

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = this.Y.nextGaussian() * 0.02;
            double var6 = this.Y.nextGaussian() * 0.02;
            double var8 = this.Y.nextGaussian() * 0.02;
            this.o.a("heart", this.s + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, this.t + (double)0.5F + (double)(this.Y.nextFloat() * this.N), this.u + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, var4, var6, var8);
         }

         return true;
      } else {
         return super.c(var1);
      }
   }

   public boolean q_() {
      return this.m() < 0;
   }
}
