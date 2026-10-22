package net.minecraft.client;

public class sf extends ia {
   public int a;
   public int b;

   public sf(ry var1) {
      super(var1);
      this.a = 0;
      this.l = true;
      this.a(2.0F, 2.0F);
      this.L = this.N / 2.0F;
      this.b = 5;
      this.a = this.Y.nextInt(100000);
   }

   public sf(ry var1, double var2, double var4, double var6) {
      this(var1);
      this.d(var2, var4, var6);
   }

   protected boolean d_() {
      return false;
   }

   protected void b() {
      this.ag.a(8, this.b);
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      ++this.a;
      this.ag.b(8, this.b);
      int var1 = me.c(this.s);
      int var2 = me.c(this.t);
      int var3 = me.c(this.u);
      if (this.o.a(var1, var2, var3) != yy.ar.bM) {
         this.o.g(var1, var2, var3, yy.ar.bM);
      }

   }

   protected void a(ik var1) {
   }

   protected void b(ik var1) {
   }

   public float i_() {
      return 0.0F;
   }

   public boolean e_() {
      return true;
   }

   public boolean a(pm var1, int var2) {
      if (!this.K && !this.o.I) {
         this.b = 0;
         if (this.b <= 0) {
            if (!this.o.I) {
               this.v();
               this.o.a((ia)null, this.s, this.t, this.u, 6.0F);
            } else {
               this.v();
            }
         }
      }

      return true;
   }
}
