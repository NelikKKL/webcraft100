package net.minecraft.client;

public abstract class zo extends ww implements aey {
   protected int a = 2;

   public zo(ry var1) {
      super(var1);
      this.aX = 5;
   }

   public void c() {
      float var1 = this.b(1.0F);
      if (var1 > 0.5F) {
         this.bq += 2;
      }

      super.c();
   }

   public void a() {
      super.a();
      if (!this.o.I && this.o.v == 0) {
         this.v();
      }

   }

   protected ia o() {
      vi var1 = this.o.b(this, (double)16.0F);
      return var1 != null && this.i(var1) ? var1 : null;
   }

   public boolean a(pm var1, int var2) {
      if (super.a(var1, var2)) {
         ia var3 = var1.a();
         if (this.m != var3 && this.n != var3) {
            if (var3 != this) {
               this.h = var3;
            }

            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   protected boolean b(ia var1) {
      int var2 = this.a;
      if (this.a(abg.g)) {
         var2 += 3 << this.b((abg)abg.g).c();
      }

      if (this.a(abg.t)) {
         var2 -= 2 << this.b((abg)abg.t).c();
      }

      return var1.a(pm.a((nq)this), var2);
   }

   protected void a(ia var1, float var2) {
      if (this.aT <= 0 && var2 < 2.0F && var1.C.e > this.C.b && var1.C.b < this.C.e) {
         this.aT = 20;
         this.b(var1);
      }

   }

   protected float a(int var1, int var2, int var3) {
      return 0.5F - this.o.c(var1, var2, var3);
   }

   public void a(ik var1) {
      super.a((ik)var1);
   }

   public void b(ik var1) {
      super.b(var1);
   }

   protected boolean u_() {
      int var1 = me.c(this.s);
      int var2 = me.c(this.C.b);
      int var3 = me.c(this.u);
      if (this.o.b(net.minecraft.client.bn.a, var1, var2, var3) > this.Y.nextInt(32)) {
         return false;
      } else {
         int var4 = this.o.n(var1, var2, var3);
         if (this.o.D()) {
            int var5 = this.o.k;
            this.o.k = 10;
            var4 = this.o.n(var1, var2, var3);
            this.o.k = var5;
         }

         return var4 <= this.Y.nextInt(8);
      }
   }

   public boolean i() {
      return this.u_() && super.i();
   }
}
