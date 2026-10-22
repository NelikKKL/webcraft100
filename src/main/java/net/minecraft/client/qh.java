package net.minecraft.client;

public class qh extends fx {
   public boolean a = false;
   public float b = 0.0F;
   public float c = 0.0F;
   public float d;
   public float e;
   public float f = 1.0F;
   public int g;

   public qh(ry var1) {
      super(var1);
      this.aA = "/mob/chicken.png";
      this.a(0.3F, 0.7F);
      this.g = this.Y.nextInt(6000) + 6000;
   }

   public int f_() {
      return 4;
   }

   public void c() {
      super.c();
      this.e = this.b;
      this.d = this.c;
      this.c = (float)((double)this.c + (double)(this.D ? -1 : 4) * 0.3);
      if (this.c < 0.0F) {
         this.c = 0.0F;
      }

      if (this.c > 1.0F) {
         this.c = 1.0F;
      }

      if (!this.D && this.f < 1.0F) {
         this.f = 1.0F;
      }

      this.f = (float)((double)this.f * 0.9);
      if (!this.D && this.w < (double)0.0F) {
         this.w *= 0.6;
      }

      this.b += this.f * 2.0F;
      if (!this.q_() && !this.o.I && --this.g <= 0) {
         this.o.a(this, "mob.chickenplop", 1.0F, (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F);
         this.b(acy.aO.bM, 1);
         this.g = this.Y.nextInt(6000) + 6000;
      }

   }

   protected void c(float var1) {
   }

   public void a(ik var1) {
      super.a(var1);
   }

   public void b(ik var1) {
      super.b(var1);
   }

   protected String e() {
      return "mob.chicken";
   }

   protected String f() {
      return "mob.chickenhurt";
   }

   protected String g() {
      return "mob.chickenhurt";
   }

   protected int k() {
      return acy.K.bM;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.Y.nextInt(3) + this.Y.nextInt(1 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.b(acy.K.bM, 1);
      }

      if (this.V()) {
         this.b(acy.bk.bM, 1);
      } else {
         this.b(acy.bj.bM, 1);
      }

   }

   protected fx a(fx var1) {
      return new qh(this.o);
   }
}
