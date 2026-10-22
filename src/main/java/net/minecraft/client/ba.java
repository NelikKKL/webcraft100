package net.minecraft.client;

public abstract class ba extends yy {
   protected ba(int var1, p var2) {
      super(var1, var2);
      n[this.bM] = true;
   }

   protected ba(int var1, int var2, p var3) {
      super(var1, var2, var3);
      n[this.bM] = true;
   }

   public void a(ry var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      var1.a(var2, var3, var4, this.j_());
   }

   public void d(ry var1, int var2, int var3, int var4) {
      super.d(var1, var2, var3, var4);
      var1.o(var2, var3, var4);
   }

   public abstract bq j_();

   public void a(ry var1, int var2, int var3, int var4, int var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      bq var7 = var1.b(var2, var3, var4);
      if (var7 != null) {
         var7.b(var5, var6);
      }

   }
}
