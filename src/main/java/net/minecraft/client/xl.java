package net.minecraft.client;

public class xl extends al {
   public acf g = (new acf(this, 0, 0)).b(64, 64);
   public acf h;
   public acf i;

   public xl() {
      this.g.a(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
      this.g.c = 1.0F;
      this.g.d = 7.0F;
      this.g.e = 15.0F;
      this.i = (new acf(this, 0, 0)).b(64, 64);
      this.i.a(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
      this.i.c = 8.0F;
      this.i.d = 7.0F;
      this.i.e = 15.0F;
      this.h = (new acf(this, 0, 19)).b(64, 64);
      this.h.a(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
      this.h.c = 1.0F;
      this.h.d = 6.0F;
      this.h.e = 1.0F;
   }

   public void a() {
      this.i.f = this.g.f;
      this.g.a(0.0625F);
      this.i.a(0.0625F);
      this.h.a(0.0625F);
   }
}
