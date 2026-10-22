package net.minecraft.client;

public class kj {
   private String[][] a = new String[][]{{"X", "X", "#"}};
   private Object[][] b;

   public kj() {
      this.b = new Object[][]{{yy.x, yy.w, acy.n, acy.m, acy.o}, {acy.q, acy.u, acy.p, acy.y, acy.F}};
   }

   public void a(sl var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            acy var5 = (acy)this.b[var4 + 1][var2];
            var1.a(new dk(var5), this.a[var4], '#', acy.C, 'X', var3);
         }
      }

      var1.a(new dk(acy.j, 1), " #X", "# X", " #X", 'X', acy.J, '#', acy.C);
      var1.a(new dk(acy.k, 4), "X", "#", "Y", 'Y', acy.K, 'X', acy.ao, '#', acy.C);
   }
}
