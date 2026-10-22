package net.minecraft.client;

public class abh extends zo {
   int b;
   int c;

   public abh(ry var1) {
      super(var1);
      this.aA = "/mob/creeper.png";
   }

   public int f_() {
      return 20;
   }

   protected void b() {
      super.b();
      this.ag.a(16, -1);
      this.ag.a(17, (byte)0);
   }

   public void a(ik var1) {
      super.a(var1);
      if (this.ag.a(17) == 1) {
         var1.a("powered", true);
      }

   }

   public void b(ik var1) {
      super.b(var1);
      this.ag.b(17, (byte)(var1.m("powered") ? 1 : 0));
   }

   protected void b(ia var1, float var2) {
      if (!this.o.I) {
         if (this.b > 0) {
            this.b(-1);
            --this.b;
            if (this.b < 0) {
               this.b = 0;
            }
         }

      }
   }

   public void a() {
      this.c = this.b;
      if (this.o.I) {
         int var1 = this.ay();
         if (var1 > 0 && this.b == 0) {
            this.o.a(this, "random.fuse", 1.0F, 0.5F);
         }

         this.b += var1;
         if (this.b < 0) {
            this.b = 0;
         }

         if (this.b >= 30) {
            this.b = 30;
         }
      }

      super.a();
      if (this.h == null && this.b > 0) {
         this.b(-1);
         --this.b;
         if (this.b < 0) {
            this.b = 0;
         }
      }

   }

   protected String f() {
      return "mob.creeper";
   }

   protected String g() {
      return "mob.creeperdeath";
   }

   public void a(pm var1) {
      super.a(var1);
      if (var1.a() instanceof it) {
         this.b(acy.bB.bM + this.Y.nextInt(2), 1);
      }

   }

   protected void a(ia var1, float var2) {
      if (!this.o.I) {
         int var3 = this.ay();
         if (var3 <= 0 && var2 < 3.0F || var3 > 0 && var2 < 7.0F) {
            if (this.b == 0) {
               this.o.a(this, "random.fuse", 1.0F, 0.5F);
            }

            this.b(1);
            ++this.b;
            if (this.b >= 30) {
               if (this.ax()) {
                  this.o.a(this, this.s, this.t, this.u, 6.0F);
               } else {
                  this.o.a(this, this.s, this.t, this.u, 3.0F);
               }

               this.v();
            }

            this.i = true;
         } else {
            this.b(-1);
            --this.b;
            if (this.b < 0) {
               this.b = 0;
            }
         }

      }
   }

   public boolean ax() {
      return this.ag.a(17) == 1;
   }

   public float g(float var1) {
      return ((float)this.c + (float)(this.b - this.c) * var1) / 28.0F;
   }

   protected int k() {
      return acy.L.bM;
   }

   private int ay() {
      return this.ag.a(16);
   }

   private void b(int var1) {
      this.ag.b(16, (byte)var1);
   }

   public void a(su var1) {
      super.a(var1);
      this.ag.b(17, (byte)1);
   }
}
