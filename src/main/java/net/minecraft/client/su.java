package net.minecraft.client;

import java.util.List;

public class su extends sd {
   private int b;
   public long a = 0L;
   private int c;

   public su(ry var1, double var2, double var4, double var6) {
      super(var1);
      this.c(var2, var4, var6, 0.0F, 0.0F);
      this.b = 2;
      this.a = this.Y.nextLong();
      this.c = this.Y.nextInt(3) + 1;
      if (var1.v >= 2 && var1.e(me.c(var2), me.c(var4), me.c(var6), 10)) {
         int var8 = me.c(var2);
         int var9 = me.c(var4);
         int var10 = me.c(var6);
         if (var1.a(var8, var9, var10) == 0 && yy.ar.c(var1, var8, var9, var10)) {
            var1.g(var8, var9, var10, yy.ar.bM);
         }

         for(int var12 = 0; var12 < 4; ++var12) {
            var9 = me.c(var2) + this.Y.nextInt(3) - 1;
            var10 = me.c(var4) + this.Y.nextInt(3) - 1;
            int var11 = me.c(var6) + this.Y.nextInt(3) - 1;
            if (var1.a(var9, var10, var11) == 0 && yy.ar.c(var1, var9, var10, var11)) {
               var1.g(var9, var10, var11, yy.ar.bM);
            }
         }
      }

   }

   public void a() {
      super.a();
      if (this.b == 2) {
         this.o.a(this.s, this.t, this.u, "ambient.weather.thunder", 10000.0F, 0.8F + this.Y.nextFloat() * 0.2F);
         this.o.a(this.s, this.t, this.u, "random.explode", 2.0F, 0.5F + this.Y.nextFloat() * 0.2F);
      }

      --this.b;
      if (this.b < 0) {
         if (this.c == 0) {
            this.v();
         } else if (this.b < -this.Y.nextInt(10)) {
            --this.c;
            this.b = 1;
            this.a = this.Y.nextLong();
            if (this.o.e(me.c(this.s), me.c(this.t), me.c(this.u), 10)) {
               int var1 = me.c(this.s);
               int var2 = me.c(this.t);
               int var3 = me.c(this.u);
               if (this.o.a(var1, var2, var3) == 0 && yy.ar.c(this.o, var1, var2, var3)) {
                  this.o.g(var1, var2, var3, yy.ar.bM);
               }
            }
         }
      }

      if (this.b >= 0) {
         double var6 = (double)3.0F;
         List var7 = this.o.b((ia)this, (c)net.minecraft.client.c.b(this.s - var6, this.t - var6, this.u - var6, this.s + var6, this.t + (double)6.0F + var6, this.u + var6));

         for(int var4 = 0; var4 < var7.size(); ++var4) {
            ia var5 = (ia)var7.get(var4);
            var5.a(this);
         }

         this.o.s = 2;
      }

   }

   protected void b() {
   }

   protected void b(ik var1) {
   }

   protected void a(ik var1) {
   }

   public boolean a(fb var1) {
      return this.b >= 0;
   }
}
