package net.minecraft.client;

public class hf extends uw {
   private final yy a;
   private String[] b;

   public hf(int var1, boolean var2) {
      super(var1);
      this.a = yy.k[this.a_()];
      if (var2) {
         this.i(0);
         this.a(true);
      }

   }

   public int c(int var1) {
      return this.a.c(var1);
   }

   public int a(int var1) {
      return this.a.a(0, var1);
   }

   public int b(int var1) {
      return var1;
   }

   public hf a(String[] var1) {
      this.b = var1;
      return this;
   }

   public String a(dk var1) {
      if (this.b == null) {
         return super.a(var1);
      } else {
         int var2 = var1.i();
         return var2 >= 0 && var2 < this.b.length ? super.a(var1) + "." + this.b[var2] : super.a(var1);
      }
   }
}
