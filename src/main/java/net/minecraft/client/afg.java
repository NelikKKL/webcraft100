package net.minecraft.client;

public class afg extends le {
   public afg() {
      float var1 = 0.0F;
      this.j = new acf(this, 40, 16);
      this.j.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.j.a(-5.0F, 2.0F, 0.0F);
      this.k = new acf(this, 40, 16);
      this.k.i = true;
      this.k.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.k.a(5.0F, 2.0F, 0.0F);
      this.l = new acf(this, 0, 16);
      this.l.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
      this.l.a(-2.0F, 12.0F, 0.0F);
      this.m = new acf(this, 0, 16);
      this.m.i = true;
      this.m.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
      this.m.a(2.0F, 12.0F, 0.0F);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.s = true;
      super.a(var1, var2, var3, var4, var5, var6);
   }
}
