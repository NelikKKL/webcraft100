package net.minecraft.client;

class aeb extends vv {
   private vi b;
   // $FF: synthetic field
   final ok a;

   public aeb(ok var1, vi var2, de var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.a = var1;
      this.b = var2;
   }

   public boolean a(dk var1) {
      return var1 != null && (var1.c == acy.br.bM || var1.c == acy.bs.bM);
   }

   public int a() {
      return 1;
   }

   public void b(dk var1) {
      if (var1.c == acy.br.bM && var1.i() > 0) {
         this.b.a((px)ut.A, 1);
      }

      super.b(var1);
   }
}
