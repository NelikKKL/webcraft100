package net.minecraft.client;

public class tb extends adr {
   public tb(ry var1) {
      super(var1);
      this.aA = "/mob/redcow.png";
      this.a(0.9F, 1.3F);
   }

   public boolean c(vi var1) {
      dk var2 = var1.by.a();
      if (var2 != null && var2.c == acy.D.bM && this.m() >= 0) {
         var1.by.a(var1.by.c, new dk(acy.E));
         return true;
      } else if (var2 != null && var2.c == acy.bd.bM && this.m() >= 0) {
         this.v();
         adr var3 = new adr(this.o);
         var3.c(this.s, this.t, this.u, this.y, this.z);
         var3.h(this.ag());
         var3.at = this.at;
         this.o.a((ia)var3);
         this.o.a("largeexplode", this.s, this.t + (double)(this.N / 2.0F), this.u, (double)0.0F, (double)0.0F, (double)0.0F);

         for(int var4 = 0; var4 < 5; ++var4) {
            this.o.a((ia)(new ih(this.o, this.s, this.t + (double)this.N, this.u, new dk(yy.ag))));
         }

         return true;
      } else {
         return super.c(var1);
      }
   }

   protected fx a(fx var1) {
      return new tb(this.o);
   }
}
