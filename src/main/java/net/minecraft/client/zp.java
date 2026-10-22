package net.minecraft.client;

public class zp extends acy {
   private int a;
   private final nu b;

   public zp(int var1, nu var2) {
      super(var1);
      this.b = var2;
      this.bN = 1;
      this.i(var2.a());
      this.a = 4 + var2.c();
   }

   public float a(dk var1, yy var2) {
      return var2.bM == yy.W.bM ? 15.0F : 1.5F;
   }

   public boolean a(dk var1, nq var2, nq var3) {
      var1.a(1, var3);
      return true;
   }

   public boolean a(dk var1, int var2, int var3, int var4, int var5, nq var6) {
      var1.a(2, var6);
      return true;
   }

   public int a(ia var1) {
      return this.a;
   }

   public boolean a() {
      return true;
   }

   public ps c(dk var1) {
      return ps.d;
   }

   public int b(dk var1) {
      return 72000;
   }

   public dk c(dk var1, ry var2, vi var3) {
      var3.c(var1, this.b(var1));
      return var1;
   }

   public boolean a(yy var1) {
      return var1.bM == yy.W.bM;
   }

   public int c() {
      return this.b.e();
   }
}
