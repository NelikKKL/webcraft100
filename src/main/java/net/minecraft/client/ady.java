package net.minecraft.client;

public class ady {
   private Object[][] a;

   public ady() {
      this.a = new Object[][]{{yy.ah, new dk(acy.o, 9)}, {yy.ai, new dk(acy.n, 9)}, {yy.ax, new dk(acy.m, 9)}, {yy.O, new dk(acy.aV, 9, 4)}};
   }

   public void a(sl var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         yy var3 = (yy)this.a[var2][0];
         dk var4 = (dk)this.a[var2][1];
         var1.a(new dk(var3), "###", "###", "###", '#', var4);
         var1.a(var4, "#", '#', var3);
      }

      var1.a(new dk(acy.o), "###", "###", "###", '#', acy.bp);
      var1.a(new dk(acy.bp, 9), "#", '#', acy.o);
   }
}
