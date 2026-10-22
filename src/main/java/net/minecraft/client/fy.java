package net.minecraft.client;

public class fy extends al {
   acf g;
   acf h;
   acf i;
   acf j;

   public fy(int var1) {
      this.g = new acf(this, 0, var1);
      this.g.a(-4.0F, 16.0F, -4.0F, 8, 8, 8);
      if (var1 > 0) {
         this.g = new acf(this, 0, var1);
         this.g.a(-3.0F, 17.0F, -3.0F, 6, 6, 6);
         this.h = new acf(this, 32, 0);
         this.h.a(-3.25F, 18.0F, -3.5F, 2, 2, 2);
         this.i = new acf(this, 32, 4);
         this.i.a(1.25F, 18.0F, -3.5F, 2, 2, 2);
         this.j = new acf(this, 32, 8);
         this.j.a(0.0F, 21.0F, -3.5F, 1, 1, 1);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.g.a(var7);
      if (this.h != null) {
         this.h.a(var7);
         this.i.a(var7);
         this.j.a(var7);
      }

   }
}
