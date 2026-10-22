package net.minecraft.client;

public class qf extends zo {
   private float b = 0.5F;
   private int c;
   private int d;

   public qf(ry var1) {
      super(var1);
      this.aA = "/mob/fire.png";
      this.af = true;
      this.a = 6;
      this.aX = 10;
   }

   public int f_() {
      return 20;
   }

   protected void b() {
      super.b();
      this.ag.a(16, new Byte((byte)0));
   }

   protected String e() {
      return "mob.blaze.breathe";
   }

   protected String f() {
      return "mob.blaze.hit";
   }

   protected String g() {
      return "mob.blaze.death";
   }

   public boolean a(pm var1, int var2) {
      return super.a(var1, var2);
   }

   public void a(pm var1) {
      super.a(var1);
   }

   public int a(float var1) {
      return 15728880;
   }

   public float b(float var1) {
      return 1.0F;
   }

   public void c() {
      if (!this.o.I) {
         if (this.C()) {
            this.a(pm.e, 1);
         }

         --this.c;
         if (this.c <= 0) {
            this.c = 100;
            this.b = 0.5F + (float)this.Y.nextGaussian() * 3.0F;
         }

         if (this.aC() != null && this.aC().t + (double)this.aC().E() > this.t + (double)this.E() + (double)this.b) {
            this.w += ((double)0.3F - this.w) * (double)0.3F;
         }
      }

      if (this.Y.nextInt(24) == 0) {
         this.o.a(this.s + (double)0.5F, this.t + (double)0.5F, this.u + (double)0.5F, "fire.fire", 1.0F + this.Y.nextFloat(), this.Y.nextFloat() * 0.7F + 0.3F);
      }

      if (!this.D && this.w < (double)0.0F) {
         this.w *= 0.6;
      }

      for(int var1 = 0; var1 < 2; ++var1) {
         this.o.a("largesmoke", this.s + (this.Y.nextDouble() - (double)0.5F) * (double)this.M, this.t + this.Y.nextDouble() * (double)this.N, this.u + (this.Y.nextDouble() - (double)0.5F) * (double)this.M, (double)0.0F, (double)0.0F, (double)0.0F);
      }

      super.c();
   }

   protected void a(ia var1, float var2) {
      if (this.aT <= 0 && var2 < 2.0F && var1.C.e > this.C.b && var1.C.b < this.C.e) {
         this.aT = 20;
         this.b(var1);
      } else if (var2 < 30.0F) {
         double var3 = var1.s - this.s;
         double var5 = var1.C.b + (double)(var1.N / 2.0F) - (this.t + (double)(this.N / 2.0F));
         double var7 = var1.u - this.u;
         if (this.aT == 0) {
            ++this.d;
            if (this.d == 1) {
               this.aT = 60;
               this.b(true);
            } else if (this.d <= 4) {
               this.aT = 6;
            } else {
               this.aT = 100;
               this.d = 0;
               this.b(false);
            }

            if (this.d > 1) {
               float var9 = me.c(var2) * 0.5F;
               this.o.a((vi)null, 1009, (int)this.s, (int)this.t, (int)this.u, 0);

               for(int var10 = 0; var10 < 1; ++var10) {
                  yn var11 = new yn(this.o, this, var3 + this.Y.nextGaussian() * (double)var9, var5, var7 + this.Y.nextGaussian() * (double)var9);
                  var11.t = this.t + (double)(this.N / 2.0F) + (double)0.5F;
                  this.o.a((ia)var11);
               }
            }
         }

         this.y = (float)(Math.atan2(var7, var3) * (double)180.0F / (double)(float)Math.PI) - 90.0F;
         this.i = true;
      }

   }

   protected void c(float var1) {
   }

   public void a(ik var1) {
      super.a(var1);
   }

   public void b(ik var1) {
      super.b(var1);
   }

   protected int k() {
      return acy.bn.bM;
   }

   public boolean V() {
      return this.ax();
   }

   protected void a(boolean var1, int var2) {
      if (var1) {
         int var3 = this.Y.nextInt(2 + var2);

         for(int var4 = 0; var4 < var3; ++var4) {
            this.b(acy.bn.bM, 1);
         }
      }

   }

   public boolean ax() {
      return (this.ag.a(16) & 1) != 0;
   }

   public void b(boolean var1) {
      byte var2 = this.ag.a(16);
      if (var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 = (byte)(var2 & -2);
      }

      this.ag.b(16, var2);
   }

   protected boolean u_() {
      return true;
   }
}
