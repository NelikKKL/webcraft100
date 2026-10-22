package net.minecraft.client;

import java.util.List;

public class ahd extends aeo {
   public ahd(ry var1) {
      super(var1);
      this.aA = "/mob/snowman.png";
      this.a(0.4F, 1.8F);
   }

   public int f_() {
      return 4;
   }

   public void c() {
      super.c();
      if (this.h == null && !this.aB() && this.o.w.nextInt(100) == 0) {
         List var1 = this.o.a(zo.class, c.b(this.s, this.t, this.u, this.s + (double)1.0F, this.t + (double)1.0F, this.u + (double)1.0F).b((double)16.0F, (double)4.0F, (double)16.0F));
         if (!var1.isEmpty()) {
            this.a((ia)var1.get(this.o.w.nextInt(var1.size())));
         }
      }

      int var5 = me.c(this.s);
      int var2 = me.c(this.t);
      int var3 = me.c(this.u);
      if (this.o.a().a(var5, var2, var3) > 1.0F) {
         this.a(pm.b, 1);
      }

      for(int var6 = 0; var6 < 4; ++var6) {
         var2 = me.c(this.s + (double)((float)(var6 % 2 * 2 - 1) * 0.25F));
         var3 = me.c(this.t);
         int var4 = me.c(this.u + (double)((float)(var6 / 2 % 2 * 2 - 1) * 0.25F));
         if (this.o.a(var2, var3, var4) == 0 && this.o.a().a(var2, var3, var4) < 0.8F && yy.aS.c(this.o, var2, var3, var4)) {
            this.o.g(var2, var3, var4, yy.aS.bM);
         }
      }

   }

   protected void a(ia var1, float var2) {
      if (var2 < 10.0F) {
         double var3 = var1.s - this.s;
         double var5 = var1.u - this.u;
         if (this.aT == 0) {
            aah var7 = new aah(this.o, this);
            double var8 = var1.t + (double)var1.E() - (double)1.1F - var7.t;
            float var10 = me.a(var3 * var3 + var5 * var5) * 0.2F;
            this.o.a(this, "random.bow", 1.0F, 1.0F / (this.Y.nextFloat() * 0.4F + 0.8F));
            this.o.a((ia)var7);
            var7.a(var3, var8 + (double)var10, var5, 1.6F, 12.0F);
            this.aT = 10;
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
      return acy.aC.bM;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.Y.nextInt(16);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.b(acy.aC.bM, 1);
      }

   }
}
