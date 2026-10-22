package net.minecraft.client;

public class dw {
   private final mo[] b;
   public final int a;
   private int c;

   public dw(mo[] var1) {
      this.b = var1;
      this.a = var1.length;
   }

   public void a() {
      ++this.c;
   }

   public boolean b() {
      return this.c >= this.b.length;
   }

   public fb a(ia var1) {
      double var2 = (double)this.b[this.c].a + (double)((int)(var1.M + 1.0F)) * (double)0.5F;
      double var4 = (double)this.b[this.c].b;
      double var6 = (double)this.b[this.c].c + (double)((int)(var1.M + 1.0F)) * (double)0.5F;
      return fb.b(var2, var4, var6);
   }
}
