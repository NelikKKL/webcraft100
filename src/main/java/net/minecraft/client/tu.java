package net.minecraft.client;

public class tu extends bq implements de {
   private dk[] p = new dk[36];
   public boolean a = false;
   public tu b;
   public tu j;
   public tu k;
   public tu l;
   public float m;
   public float n;
   public int o;
   private int q;

   public int c() {
      return 27;
   }

   public dk d(int var1) {
      return this.p[var1];
   }

   public dk a(int var1, int var2) {
      if (this.p[var1] != null) {
         if (this.p[var1].a <= var2) {
            dk var4 = this.p[var1];
            this.p[var1] = null;
            this.h();
            return var4;
         } else {
            dk var3 = this.p[var1].a(var2);
            if (this.p[var1].a == 0) {
               this.p[var1] = null;
            }

            this.h();
            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, dk var2) {
      this.p[var1] = var2;
      if (var2 != null && var2.a > this.e()) {
         var2.a = this.e();
      }

      this.h();
   }

   public String d() {
      return "Chest";
   }

   public void b(ik var1) {
      super.b(var1);
      yi var2 = var1.l("Items");
      this.p = new dk[this.c()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         ik var4 = (ik)var2.a(var3);
         int var5 = var4.c("Slot") & 255;
         if (var5 >= 0 && var5 < this.p.length) {
            this.p[var5] = dk.a(var4);
         }
      }

   }

   public void a(ik var1) {
      super.a(var1);
      yi var2 = new yi();

      for(int var3 = 0; var3 < this.p.length; ++var3) {
         if (this.p[var3] != null) {
            ik var4 = new ik();
            var4.a("Slot", (byte)var3);
            this.p[var3].b(var4);
            var2.a((um)var4);
         }
      }

      var1.a("Items", (um)var2);
   }

   public int e() {
      return 64;
   }

   public boolean b_(vi var1) {
      if (this.c.b(this.d, this.e, this.f) != this) {
         return false;
      } else {
         return !(var1.f((double)this.d + (double)0.5F, (double)this.e + (double)0.5F, (double)this.f + (double)0.5F) > (double)64.0F);
      }
   }

   public void n() {
      super.n();
      this.a = false;
   }

   public void a() {
      if (!this.a) {
         this.a = true;
         this.b = null;
         this.j = null;
         this.k = null;
         this.l = null;
         if (this.c.a(this.d - 1, this.e, this.f) == yy.au.bM) {
            this.k = (tu)this.c.b(this.d - 1, this.e, this.f);
         }

         if (this.c.a(this.d + 1, this.e, this.f) == yy.au.bM) {
            this.j = (tu)this.c.b(this.d + 1, this.e, this.f);
         }

         if (this.c.a(this.d, this.e, this.f - 1) == yy.au.bM) {
            this.b = (tu)this.c.b(this.d, this.e, this.f - 1);
         }

         if (this.c.a(this.d, this.e, this.f + 1) == yy.au.bM) {
            this.l = (tu)this.c.b(this.d, this.e, this.f + 1);
         }

         if (this.b != null) {
            this.b.n();
         }

         if (this.l != null) {
            this.l.n();
         }

         if (this.j != null) {
            this.j.n();
         }

         if (this.k != null) {
            this.k.n();
         }

      }
   }

   public void b() {
      super.b();
      this.a();
      if (++this.q % 20 * 4 == 0) {
         this.c.f(this.d, this.e, this.f, 1, this.o);
      }

      this.n = this.m;
      float var1 = 0.1F;
      if (this.o > 0 && this.m == 0.0F && this.b == null && this.k == null) {
         double var2 = (double)this.d + (double)0.5F;
         double var4 = (double)this.f + (double)0.5F;
         if (this.l != null) {
            var4 += (double)0.5F;
         }

         if (this.j != null) {
            var2 += (double)0.5F;
         }

         this.c.a(var2, (double)this.e + (double)0.5F, var4, "random.chestopen", 0.5F, this.c.w.nextFloat() * 0.1F + 0.9F);
      }

      if (this.o == 0 && this.m > 0.0F || this.o > 0 && this.m < 1.0F) {
         float var8 = this.m;
         if (this.o > 0) {
            this.m += var1;
         } else {
            this.m -= var1;
         }

         if (this.m > 1.0F) {
            this.m = 1.0F;
         }

         float var3 = 0.5F;
         if (this.m < var3 && var8 >= var3 && this.b == null && this.k == null) {
            double var9 = (double)this.d + (double)0.5F;
            double var6 = (double)this.f + (double)0.5F;
            if (this.l != null) {
               var6 += (double)0.5F;
            }

            if (this.j != null) {
               var9 += (double)0.5F;
            }

            this.c.a(var9, (double)this.e + (double)0.5F, var6, "random.chestclosed", 0.5F, this.c.w.nextFloat() * 0.1F + 0.9F);
         }

         if (this.m < 0.0F) {
            this.m = 0.0F;
         }
      }

   }

   public void b(int var1, int var2) {
      if (var1 == 1) {
         this.o = var2;
      }

   }

   public void j() {
      ++this.o;
      this.c.f(this.d, this.e, this.f, 1, this.o);
   }

   public void k() {
      --this.o;
      this.c.f(this.d, this.e, this.f, 1, this.o);
   }

   public void l() {
      this.n();
      this.a();
      super.l();
   }
}
