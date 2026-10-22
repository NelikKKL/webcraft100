package net.minecraft.client;

public class xx {
   private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] b;

   public xx() {
      this.b = new Object[][]{{acy.aE, yy.ar, acy.n, acy.m, acy.o}, {acy.U, acy.Y, acy.ac, acy.ag, acy.ak}, {acy.V, acy.Z, acy.ad, acy.ah, acy.al}, {acy.W, acy.aa, acy.ae, acy.ai, acy.am}, {acy.X, acy.ab, acy.af, acy.aj, acy.an}};
   }

   public void a(sl var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            acy var5 = (acy)this.b[var4 + 1][var2];
            var1.a(new dk(var5), this.a[var4], 'X', var3);
         }
      }

   }
}
