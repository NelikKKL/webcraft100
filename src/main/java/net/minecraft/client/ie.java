package net.minecraft.client;

public class ie extends vv {
   private vi a;

   public ie(vi var1, de var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.a = var1;
   }

   public boolean a(dk var1) {
      return false;
   }

   public void b(dk var1) {
      var1.c(this.a.o, this.a);
      if (var1.c == acy.n.bM) {
         this.a.a((px)ut.k, 1);
      }

      if (var1.c == acy.aU.bM) {
         this.a.a((px)ut.p, 1);
      }

      super.b(var1);
   }
}
