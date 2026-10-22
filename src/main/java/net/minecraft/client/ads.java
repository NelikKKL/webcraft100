package net.minecraft.client;

public class ads extends acy {
   private yy[] bR;
   protected float a = 4.0F;
   private int bS;
   protected nu b;

   protected ads(int var1, int var2, nu var3, yy[] var4) {
      super(var1);
      this.b = var3;
      this.bR = var4;
      this.bN = 1;
      this.i(var3.a());
      this.a = var3.b();
      this.bS = var2 + var3.c();
   }

   public float a(dk var1, yy var2) {
      for(int var3 = 0; var3 < this.bR.length; ++var3) {
         if (this.bR[var3] == var2) {
            return this.a;
         }
      }

      return 1.0F;
   }

   public boolean a(dk var1, nq var2, nq var3) {
      var1.a(2, var3);
      return true;
   }

   public boolean a(dk var1, int var2, int var3, int var4, int var5, nq var6) {
      var1.a(1, var6);
      return true;
   }

   public int a(ia var1) {
      return this.bS;
   }

   public boolean a() {
      return true;
   }

   public int c() {
      return this.b.e();
   }
}
