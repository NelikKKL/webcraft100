package net.minecraft.client;

public class uo extends ia {
   public int a;
   public int b = 0;

   public uo(ry var1) {
      super(var1);
   }

   public uo(ry var1, double var2, double var4, double var6, int var8) {
      super(var1);
      this.a = var8;
      this.l = true;
      this.a(0.98F, 0.98F);
      this.L = this.N / 2.0F;
      this.d(var2, var4, var6);
      this.v = (double)0.0F;
      this.w = (double)0.0F;
      this.x = (double)0.0F;
      this.p = var2;
      this.q = var4;
      this.r = var6;
   }

   protected boolean d_() {
      return false;
   }

   protected void b() {
   }

   public boolean e_() {
      return !this.K;
   }

   public void a() {
      if (this.a == 0) {
         this.v();
      } else {
         this.p = this.s;
         this.q = this.t;
         this.r = this.u;
         ++this.b;
         this.w -= (double)0.04F;
         this.b(this.v, this.w, this.x);
         this.v *= (double)0.98F;
         this.w *= (double)0.98F;
         this.x *= (double)0.98F;
         int var1 = me.c(this.s);
         int var2 = me.c(this.t);
         int var3 = me.c(this.u);
         if (this.b == 1 && this.o.a(var1, var2, var3) == this.a) {
            this.o.g(var1, var2, var3, 0);
         } else if (!this.o.I && this.b == 1) {
            this.v();
         }

         if (this.D) {
            this.v *= (double)0.7F;
            this.x *= (double)0.7F;
            this.w *= (double)-0.5F;
            if (this.o.a(var1, var2, var3) != yy.ac.bM) {
               this.v();
               if ((!this.o.a(this.a, var1, var2, var3, true, 1) || cj.b_(this.o, var1, var2 - 1, var3) || !this.o.g(var1, var2, var3, this.a)) && !this.o.I) {
                  this.b(this.a, 1);
               }
            }
         } else if (this.b > 100 && !this.o.I) {
            this.b(this.a, 1);
            this.v();
         }

      }
   }

   protected void a(ik var1) {
      var1.a("Tile", (byte)this.a);
   }

   protected void b(ik var1) {
      this.a = var1.c("Tile") & 255;
   }

   public float i_() {
      return 0.0F;
   }

   public ry g() {
      return this.o;
   }
}
