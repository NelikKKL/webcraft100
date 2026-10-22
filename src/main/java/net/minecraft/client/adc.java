package net.minecraft.client;

public class adc extends wc {
   private int a = 0;
   private int au = 0;

   public adc(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, (double)0.0F, (double)0.0F, (double)0.0F);
      this.au = 8;
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
   }

   public void a() {
      for(int var1 = 0; var1 < 6; ++var1) {
         double var2 = this.s + (this.Y.nextDouble() - this.Y.nextDouble()) * (double)4.0F;
         double var4 = this.t + (this.Y.nextDouble() - this.Y.nextDouble()) * (double)4.0F;
         double var6 = this.u + (this.Y.nextDouble() - this.Y.nextDouble()) * (double)4.0F;
         this.o.a("largeexplode", var2, var4, var6, (double)((float)this.a / (float)this.au), (double)0.0F, (double)0.0F);
      }

      ++this.a;
      if (this.a == this.au) {
         this.v();
      }

   }

   public int g() {
      return 1;
   }
}
