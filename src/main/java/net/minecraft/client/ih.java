package net.minecraft.client;

public class ih extends ia {
   public dk a;
   private int e;
   public int b = 0;
   public int c;
   private int f = 5;
   public float d = (float)(Math.random() * Math.PI * (double)2.0F);

   public ih(ry var1, double var2, double var4, double var6, dk var8) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.L = this.N / 2.0F;
      this.d(var2, var4, var6);
      this.a = var8;
      this.y = (float)(Math.random() * (double)360.0F);
      this.v = (double)((float)(Math.random() * (double)0.2F - (double)0.1F));
      this.w = (double)0.2F;
      this.x = (double)((float)(Math.random() * (double)0.2F - (double)0.1F));
   }

   protected boolean d_() {
      return false;
   }

   public ih(ry var1) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.L = this.N / 2.0F;
   }

   protected void b() {
   }

   public void a() {
      super.a();
      if (this.c > 0) {
         --this.c;
      }

      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      this.w -= (double)0.04F;
      if (this.o.e(net.minecraft.client.me.c(this.s), net.minecraft.client.me.c(this.t), net.minecraft.client.me.c(this.u)) == net.minecraft.client.p.h) {
         this.w = (double)0.2F;
         this.v = (double)((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F);
         this.x = (double)((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F);
         this.o.a(this, "random.fizz", 0.4F, 2.0F + this.Y.nextFloat() * 0.4F);
      }

      this.c(this.s, (this.C.b + this.C.e) / (double)2.0F, this.u);
      this.b(this.v, this.w, this.x);
      float var1 = 0.98F;
      if (this.D) {
         var1 = 0.58800006F;
         int var2 = this.o.a(me.c(this.s), me.c(this.C.b) - 1, me.c(this.u));
         if (var2 > 0) {
            var1 = yy.k[var2].ca * 0.98F;
         }
      }

      this.v *= (double)var1;
      this.w *= (double)0.98F;
      this.x *= (double)var1;
      if (this.D) {
         this.w *= (double)-0.5F;
      }

      ++this.e;
      ++this.b;
      if (this.b >= 6000) {
         this.v();
      }

   }

   public boolean h_() {
      return this.o.a(this.C, net.minecraft.client.p.g, this);
   }

   protected void a(int var1) {
      this.a(pm.a, var1);
   }

   public boolean a(pm var1, int var2) {
      this.G();
      this.f -= var2;
      if (this.f <= 0) {
         this.v();
      }

      return false;
   }

   public void a(ik var1) {
      var1.a("Health", (short)((byte)this.f));
      var1.a("Age", (short)this.b);
      var1.a("Item", this.a.b(new ik()));
   }

   public void b(ik var1) {
      this.f = var1.d("Health") & 255;
      this.b = var1.d("Age");
      ik var2 = var1.k("Item");
      this.a = dk.a(var2);
      if (this.a == null) {
         this.v();
      }

   }

   public void a(vi var1) {
      if (!this.o.I) {
         int var2 = this.a.a;
         if (this.c == 0 && var1.by.a(this.a)) {
            if (this.a.c == yy.J.bM) {
               var1.a((px)ut.g);
            }

            if (this.a.c == acy.aE.bM) {
               var1.a((px)ut.t);
            }

            if (this.a.c == acy.m.bM) {
               var1.a((px)ut.w);
            }

            if (this.a.c == acy.bn.bM) {
               var1.a((px)ut.z);
            }

            this.o.a(this, "random.pop", 0.2F, ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.a((ia)this, var2);
            if (this.a.a <= 0) {
               this.v();
            }
         }

      }
   }
}
