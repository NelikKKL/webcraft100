package net.minecraft.client;

public class ef {
   private int d;
   private int e;
   public double a;
   public double b;
   public int c;

   public ef(ki var1, int var2, int var3) {
      this.d = var2;
      this.e = var3;
      this.c = 1;
      int var4 = var1.O;
      if (var4 == 0) {
         var4 = 1000;
      }

      while(this.c < var4 && this.d / (this.c + 1) >= 320 && this.e / (this.c + 1) >= 240) {
         ++this.c;
      }

      this.a = (double)this.d / (double)this.c;
      this.b = (double)this.e / (double)this.c;
      this.d = (int)Math.ceil(this.a);
      this.e = (int)Math.ceil(this.b);
   }

   public int a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }
}
