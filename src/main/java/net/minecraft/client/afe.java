package net.minecraft.client;

public class afe extends vv {
   private final de a;
   private vi b;

   public afe(vi var1, de var2, de var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.b = var1;
      this.a = var2;
   }

   public boolean a(dk var1) {
      return false;
   }

   public void b(dk var1) {
      var1.c(this.b.o, this.b);
      if (var1.c == yy.ay.bM) {
         this.b.a((px)ut.h, 1);
      } else if (var1.c == acy.s.bM) {
         this.b.a((px)ut.i, 1);
      } else if (var1.c == yy.aB.bM) {
         this.b.a((px)ut.j, 1);
      } else if (var1.c == acy.M.bM) {
         this.b.a((px)ut.l, 1);
      } else if (var1.c == acy.T.bM) {
         this.b.a((px)ut.m, 1);
      } else if (var1.c == acy.aY.bM) {
         this.b.a((px)ut.n, 1);
      } else if (var1.c == acy.w.bM) {
         this.b.a((px)ut.o, 1);
      } else if (var1.c == acy.q.bM) {
         this.b.a((px)ut.r, 1);
      } else if (var1.c == yy.bE.bM) {
         this.b.a((px)ut.D, 1);
      } else if (var1.c == yy.an.bM) {
         this.b.a((px)ut.F, 1);
      }

      for(int var2 = 0; var2 < this.a.c(); ++var2) {
         dk var3 = this.a.d(var2);
         if (var3 != null) {
            this.a.a(var2, 1);
            if (var3.a().k()) {
               this.a.a(var2, new dk(var3.a().j()));
            }
         }
      }

   }
}
