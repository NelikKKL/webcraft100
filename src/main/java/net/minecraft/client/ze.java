package net.minecraft.client;

public class ze extends bq {
   public int a = -1;
   private String k = "Pig";
   public double b;
   public double j = (double)0.0F;

   public ze() {
      this.a = 20;
   }

   public String a() {
      return this.k;
   }

   public void a(String var1) {
      this.k = var1;
   }

   public boolean c() {
      return this.c.a((double)this.d + (double)0.5F, (double)this.e + (double)0.5F, (double)this.f + (double)0.5F, (double)16.0F) != null;
   }

   public void b() {
      this.j = this.b;
      if (this.c()) {
         double var1 = (double)((float)this.d + this.c.w.nextFloat());
         double var3 = (double)((float)this.e + this.c.w.nextFloat());
         double var5 = (double)((float)this.f + this.c.w.nextFloat());
         this.c.a("smoke", var1, var3, var5, (double)0.0F, (double)0.0F, (double)0.0F);
         this.c.a("flame", var1, var3, var5, (double)0.0F, (double)0.0F, (double)0.0F);

         for(this.b += (double)(1000.0F / ((float)this.a + 200.0F)); this.b > (double)360.0F; this.j -= (double)360.0F) {
            this.b -= (double)360.0F;
         }

         if (!this.c.I) {
            if (this.a == -1) {
               this.d();
            }

            if (this.a > 0) {
               --this.a;
               return;
            }

            byte var7 = 4;

            for(int var8 = 0; var8 < var7; ++var8) {
               nq var9 = (nq)afw.a(this.k, this.c);
               if (var9 == null) {
                  return;
               }

               int var10 = this.c.a(var9.getClass(), net.minecraft.client.c.b((double)this.d, (double)this.e, (double)this.f, (double)(this.d + 1), (double)(this.e + 1), (double)(this.f + 1)).b((double)8.0F, (double)4.0F, (double)8.0F)).size();
               if (var10 >= 6) {
                  this.d();
                  return;
               }

               if (var9 != null) {
                  double var11 = (double)this.d + (this.c.w.nextDouble() - this.c.w.nextDouble()) * (double)4.0F;
                  double var13 = (double)(this.e + this.c.w.nextInt(3) - 1);
                  double var15 = (double)this.f + (this.c.w.nextDouble() - this.c.w.nextDouble()) * (double)4.0F;
                  var9.c(var11, var13, var15, this.c.w.nextFloat() * 360.0F, 0.0F);
                  if (var9.i()) {
                     this.c.a((ia)var9);
                     this.c.g(2004, this.d, this.e, this.f, 0);
                     var9.af();
                     this.d();
                  }
               }
            }
         }

         super.b();
      }
   }

   private void d() {
      this.a = 200 + this.c.w.nextInt(600);
   }

   public void b(ik var1) {
      super.b(var1);
      this.k = var1.i("EntityId");
      this.a = var1.d("Delay");
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("EntityId", this.k);
      var1.a("Delay", (short)this.a);
   }
}
