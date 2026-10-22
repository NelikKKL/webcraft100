package net.minecraft.client;

public class eq {
   private int a = 20;
   private float b = 5.0F;
   private float c;
   private int d = 0;
   private int e = 20;

   public void a(int var1, float var2) {
      this.a = Math.min(var1 + this.a, 20);
      this.b = Math.min(this.b + (float)var1 * var2 * 2.0F, (float)this.a);
   }

   public void a(agu var1) {
      this.a(var1.o(), var1.p());
   }

   public void a(vi var1) {
      int var2 = var1.o.v;
      this.e = this.a;
      if (this.c > 4.0F) {
         this.c -= 4.0F;
         if (this.b > 0.0F) {
            this.b = Math.max(this.b - 1.0F, 0.0F);
         } else if (var2 > 0) {
            this.a = Math.max(this.a - 1, 0);
         }
      }

      if (this.a >= 18 && var1.aP()) {
         ++this.d;
         if (this.d >= 80) {
            var1.a_(1);
            this.d = 0;
         }
      } else if (this.a <= 0) {
         ++this.d;
         if (this.d >= 80) {
            if (var1.ag() > 10 || var2 >= 3 || var1.ag() > 1 && var2 >= 2) {
               var1.a((pm)pm.f, 1);
            }

            this.d = 0;
         }
      } else {
         this.d = 0;
      }

   }

   public void a(ik var1) {
      if (var1.b("foodLevel")) {
         this.a = var1.e("foodLevel");
         this.d = var1.e("foodTickTimer");
         this.b = var1.g("foodSaturationLevel");
         this.c = var1.g("foodExhaustionLevel");
      }

   }

   public void b(ik var1) {
      var1.a("foodLevel", this.a);
      var1.a("foodTickTimer", this.d);
      var1.a("foodSaturationLevel", this.b);
      var1.a("foodExhaustionLevel", this.c);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.e;
   }

   public boolean c() {
      return this.a < 20;
   }

   public void a(float var1) {
      this.c = Math.min(this.c + var1, 40.0F);
   }

   public float d() {
      return this.b;
   }

   public void a(int var1) {
      this.a = var1;
   }

   public void b(float var1) {
      this.b = var1;
   }
}
