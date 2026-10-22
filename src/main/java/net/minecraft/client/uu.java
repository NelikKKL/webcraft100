package net.minecraft.client;

public class uu extends ql {
   protected ig L;

   public uu(sr var1) {
      super(var1);
      this.L = new oh(yy.bJ.bM);
   }

   protected void a() {
      this.b();
      if (this.b.nextInt(5) == 0) {
         int var1 = this.c + this.b.nextInt(16) + 8;
         int var2 = this.d + this.b.nextInt(16) + 8;
         int var3 = this.a.f(var1, var2);
         if (var3 > 0) {
         }

         this.L.a(this.a, this.b, var1, var3, var2);
      }

      if (this.c == 0 && this.d == 0) {
         oo var4 = new oo(this.a);
         var4.c((double)0.0F, (double)128.0F, (double)0.0F, this.b.nextFloat() * 360.0F, 0.0F);
         this.a.a((ia)var4);
      }

   }
}
