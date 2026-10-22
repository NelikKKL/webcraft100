package net.minecraft.client;

public class it extends zo {
   private static final dk b;

   public it(ry var1) {
      super(var1);
      this.aA = "/mob/skeleton.png";
   }

   public int f_() {
      return 20;
   }

   protected String e() {
      return "mob.skeleton";
   }

   protected String f() {
      return "mob.skeletonhurt";
   }

   protected String g() {
      return "mob.skeletonhurt";
   }

   public boolean a(pm var1, int var2) {
      return super.a(var1, var2);
   }

   public void a(pm var1) {
      super.a(var1);
      if (var1.g() instanceof ro && var1.a() instanceof vi) {
         vi var2 = (vi)var1.a();
         double var3 = var2.s - this.s;
         double var5 = var2.u - this.u;
         if (var3 * var3 + var5 * var5 >= (double)2500.0F) {
            var2.a((px)ut.v);
         }
      }

   }

   public void c() {
      if (this.o.l() && !this.o.I) {
         float var1 = this.b(1.0F);
         if (var1 > 0.5F && this.o.l(me.c(this.s), me.c(this.t), me.c(this.u)) && this.Y.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.e(8);
         }
      }

      super.c();
   }

   protected void a(ia var1, float var2) {
      if (var2 < 10.0F) {
         double var3 = var1.s - this.s;
         double var5 = var1.u - this.u;
         if (this.aT == 0) {
            ro var7 = new ro(this.o, this, 1.0F);
            double var8 = var1.t + (double)var1.E() - (double)0.7F - var7.t;
            float var10 = me.a(var3 * var3 + var5 * var5) * 0.2F;
            this.o.a(this, "random.bow", 1.0F, 1.0F / (this.Y.nextFloat() * 0.4F + 0.8F));
            this.o.a((ia)var7);
            var7.a(var3, var8 + (double)var10, var5, 1.6F, 12.0F);
            this.aT = 60;
         }

         this.y = (float)(Math.atan2(var5, var3) * (double)180.0F / (double)(float)Math.PI) - 90.0F;
         this.i = true;
      }

   }

   public void a(ik var1) {
      super.a(var1);
   }

   public void b(ik var1) {
      super.b(var1);
   }

   protected int k() {
      return acy.k.bM;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.Y.nextInt(3 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.b(acy.k.bM, 1);
      }

      var3 = this.Y.nextInt(3 + var2);

      for(int var6 = 0; var6 < var3; ++var6) {
         this.b(acy.aW.bM, 1);
      }

   }

   public dk s() {
      return b;
   }

   public el r_() {
      return el.b;
   }

   static {
      b = new dk(acy.j, 1);
   }
}
