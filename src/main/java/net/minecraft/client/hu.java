package net.minecraft.client;

public class hu extends wc {
   private ia a;
   private int au;
   private int av;
   private String aw;

   public hu(ry var1, ia var2) {
      this(var1, var2, "crit");
   }

   public hu(ry var1, ia var2, String var3) {
      super(var1, var2.s, var2.C.b + (double)(var2.N / 2.0F), var2.u, var2.v, var2.w, var2.x);
      this.au = 0;
      this.av = 0;
      this.a = var2;
      this.av = 3;
      this.aw = var3;
      this.a();
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
   }

   public void a() {
      for(int var1 = 0; var1 < 16; ++var1) {
         double var2 = (double)(this.Y.nextFloat() * 2.0F - 1.0F);
         double var4 = (double)(this.Y.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(this.Y.nextFloat() * 2.0F - 1.0F);
         if (!(var2 * var2 + var4 * var4 + var6 * var6 > (double)1.0F)) {
            double var8 = this.a.s + var2 * (double)this.a.M / (double)4.0F;
            double var10 = this.a.C.b + (double)(this.a.N / 2.0F) + var4 * (double)this.a.N / (double)4.0F;
            double var12 = this.a.u + var6 * (double)this.a.M / (double)4.0F;
            this.o.a(this.aw, var8, var10, var12, var2, var4 + 0.2, var6);
         }
      }

      ++this.au;
      if (this.au >= this.av) {
         this.v();
      }

   }

   public int g() {
      return 3;
   }
}
