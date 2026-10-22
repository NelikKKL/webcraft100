package net.minecraft.client;

public abstract class wk extends nq {
   public wk(ry var1) {
      super(var1);
   }

   protected void c(float var1) {
   }

   public void d(float var1, float var2) {
      if (this.D()) {
         this.a(var1, var2, 0.02F);
         this.b(this.v, this.w, this.x);
         this.v *= (double)0.8F;
         this.w *= (double)0.8F;
         this.x *= (double)0.8F;
      } else if (this.F()) {
         this.a(var1, var2, 0.02F);
         this.b(this.v, this.w, this.x);
         this.v *= (double)0.5F;
         this.w *= (double)0.5F;
         this.x *= (double)0.5F;
      } else {
         float var3 = 0.91F;
         if (this.D) {
            var3 = 0.54600006F;
            int var4 = this.o.a(me.c(this.s), me.c(this.C.b) - 1, me.c(this.u));
            if (var4 > 0) {
               var3 = yy.k[var4].ca * 0.91F;
            }
         }

         float var10 = 0.16277136F / (var3 * var3 * var3);
         this.a(var1, var2, this.D ? 0.1F * var10 : 0.02F);
         var3 = 0.91F;
         if (this.D) {
            var3 = 0.54600006F;
            int var5 = this.o.a(me.c(this.s), me.c(this.C.b) - 1, me.c(this.u));
            if (var5 > 0) {
               var3 = yy.k[var5].ca * 0.91F;
            }
         }

         this.b(this.v, this.w, this.x);
         this.v *= (double)var3;
         this.w *= (double)var3;
         this.x *= (double)var3;
      }

      this.ba = this.bb;
      double var9 = this.s - this.p;
      double var11 = this.u - this.r;
      float var7 = me.a(var9 * var9 + var11 * var11) * 4.0F;
      if (var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.bb += (var7 - this.bb) * 0.4F;
      this.bc += this.bb;
   }

   public boolean ah() {
      return false;
   }
}
