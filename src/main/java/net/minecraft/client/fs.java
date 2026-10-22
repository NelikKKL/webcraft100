package net.minecraft.client;

public class fs {
   public fb a;
   public float b;
   public float c;

   public fs(float var1, float var2, float var3, float var4, float var5) {
      this(fb.a((double)var1, (double)var2, (double)var3), var4, var5);
   }

   public fs a(float var1, float var2) {
      return new fs(this, var1, var2);
   }

   public fs(fs var1, float var2, float var3) {
      this.a = var1.a;
      this.b = var2;
      this.c = var3;
   }

   public fs(fb var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }
}
