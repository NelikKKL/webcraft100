package net.minecraft.client;

public class gl extends zo {
   private int b;

   public gl(ry var1) {
      super(var1);
      this.aA = "/mob/silverfish.png";
      this.a(0.3F, 0.7F);
      this.bw = 0.6F;
      this.a = 1;
   }

   public int f_() {
      return 8;
   }

   protected boolean d_() {
      return false;
   }

   protected ia o() {
      double var1 = (double)8.0F;
      return this.o.b(this, var1);
   }

   protected String e() {
      return "mob.silverfish.say";
   }

   protected String f() {
      return "mob.silverfish.hit";
   }

   protected String g() {
      return "mob.silverfish.kill";
   }

   public boolean a(pm var1, int var2) {
      if (this.b <= 0 && var1 instanceof fq) {
         this.b = 20;
      }

      return super.a(var1, var2);
   }

   protected void a(ia var1, float var2) {
      if (this.aT <= 0 && var2 < 1.2F && var1.C.e > this.C.b && var1.C.b < this.C.e) {
         this.aT = 20;
         var1.a(pm.a((nq)this), this.a);
      }

   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.o.a(this, "mob.silverfish.step", 1.0F, 1.0F);
   }

   public void a(ik var1) {
      super.a(var1);
   }

   public void b(ik var1) {
      super.b(var1);
   }

   protected int k() {
      return 0;
   }

   public void a() {
      this.at = this.y;
      super.a();
   }

   protected void n() {
      super.n();
      if (!this.o.I) {
         if (this.b > 0) {
            --this.b;
            if (this.b == 0) {
               int var1 = me.c(this.s);
               int var2 = me.c(this.t);
               int var3 = me.c(this.u);
               boolean var4 = false;

               for(int var5 = 0; !var4 && var5 <= 5 && var5 >= -5; var5 = var5 <= 0 ? 1 - var5 : 0 - var5) {
                  for(int var6 = 0; !var4 && var6 <= 10 && var6 >= -10; var6 = var6 <= 0 ? 1 - var6 : 0 - var6) {
                     for(int var7 = 0; !var4 && var7 <= 10 && var7 >= -10; var7 = var7 <= 0 ? 1 - var7 : 0 - var7) {
                        int var8 = this.o.a(var1 + var6, var2 + var5, var3 + var7);
                        if (var8 == yy.bl.bM) {
                           this.o.g(2001, var1 + var6, var2 + var5, var3 + var7, yy.bl.bM + this.o.d(var1 + var6, var2 + var5, var3 + var7) * 256);
                           this.o.g(var1 + var6, var2 + var5, var3 + var7, 0);
                           yy.bl.e((ry)this.o, var1 + var6, var2 + var5, var3 + var7, 0);
                           if (this.Y.nextBoolean()) {
                              var4 = true;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         if (this.h == null && !this.aB()) {
            int var9 = me.c(this.s);
            int var10 = me.c(this.t + (double)0.5F);
            int var11 = me.c(this.u);
            int var12 = this.Y.nextInt(6);
            int var13 = this.o.a(var9 + ot.b[var12], var10 + ot.c[var12], var11 + ot.d[var12]);
            if (vf.e(var13)) {
               this.o.d(var9 + ot.b[var12], var10 + ot.c[var12], var11 + ot.d[var12], yy.bl.bM, vf.f(var13));
               this.af();
               this.v();
            } else {
               this.aA();
            }
         } else if (this.h != null && !this.aB()) {
            this.h = null;
         }

      }
   }

   protected float a(int var1, int var2, int var3) {
      return this.o.a(var1, var2 - 1, var3) == yy.t.bM ? 10.0F : super.a(var1, var2, var3);
   }

   protected boolean u_() {
      return true;
   }

   public boolean i() {
      if (super.i()) {
         vi var1 = this.o.a(this, (double)5.0F);
         return var1 == null;
      } else {
         return false;
      }
   }

   public el r_() {
      return el.c;
   }
}
