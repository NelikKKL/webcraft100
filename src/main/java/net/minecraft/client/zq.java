package net.minecraft.client;

public class zq {
   private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] b;

   public zq() {
      this.b = new Object[][]{{yy.x, yy.w, acy.n, acy.m, acy.o}, {acy.s, acy.w, acy.f, acy.A, acy.H}, {acy.r, acy.v, acy.e, acy.z, acy.G}, {acy.t, acy.x, acy.g, acy.B, acy.I}, {acy.M, acy.N, acy.O, acy.P, acy.Q}};
   }

   public void a(sl var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            acy var5 = (acy)this.b[var4 + 1][var2];
            var1.a(new dk(var5), this.a[var4], '#', acy.C, 'X', var3);
         }
      }

      var1.a(new dk(acy.bd), " #", "# ", '#', acy.n);
   }
}
