package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public class agb extends bq {
   private int a;
   private int b;
   private int j;
   private boolean k;
   private boolean l;
   private float m;
   private float n;
   private static List o = new ArrayList();

   public agb() {
   }

   public agb(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.a = var1;
      this.b = var2;
      this.j = var3;
      this.k = var4;
      this.l = var5;
   }

   public int a() {
      return this.a;
   }

   public int f() {
      return this.b;
   }

   public boolean c() {
      return this.k;
   }

   public int d() {
      return this.j;
   }

   public boolean e() {
      return this.l;
   }

   public float a(float var1) {
      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      return this.n + (this.m - this.n) * var1;
   }

   public float b(float var1) {
      return this.k ? (this.a(var1) - 1.0F) * (float)ot.b[this.j] : (1.0F - this.a(var1)) * (float)ot.b[this.j];
   }

   public float c(float var1) {
      return this.k ? (this.a(var1) - 1.0F) * (float)ot.c[this.j] : (1.0F - this.a(var1)) * (float)ot.c[this.j];
   }

   public float d(float var1) {
      return this.k ? (this.a(var1) - 1.0F) * (float)ot.d[this.j] : (1.0F - this.a(var1)) * (float)ot.d[this.j];
   }

   private void a(float var1, float var2) {
      if (!this.k) {
         --var1;
      } else {
         var1 = 1.0F - var1;
      }

      c var3 = yy.ac.b(this.c, this.d, this.e, this.f, this.a, var1, this.j);
      if (var3 != null) {
         List var4 = this.c.b((ia)null, (c)var3);
         if (!var4.isEmpty()) {
            o.addAll(var4);

            for(ia var6 : (Iterable<ia>)(Iterable)(o)) {
               var6.b((double)(var2 * (float)ot.b[this.j]), (double)(var2 * (float)ot.c[this.j]), (double)(var2 * (float)ot.d[this.j]));
            }

            o.clear();
         }
      }

   }

   public void j() {
      if (this.n < 1.0F && this.c != null) {
         this.n = this.m = 1.0F;
         this.c.o(this.d, this.e, this.f);
         this.l();
         if (this.c.a(this.d, this.e, this.f) == yy.ac.bM) {
            this.c.d(this.d, this.e, this.f, this.a, this.b);
         }
      }

   }

   public void b() {
      this.n = this.m;
      if (this.n >= 1.0F) {
         this.a(1.0F, 0.25F);
         this.c.o(this.d, this.e, this.f);
         this.l();
         if (this.c.a(this.d, this.e, this.f) == yy.ac.bM) {
            this.c.d(this.d, this.e, this.f, this.a, this.b);
         }

      } else {
         this.m += 0.5F;
         if (this.m >= 1.0F) {
            this.m = 1.0F;
         }

         if (this.k) {
            this.a(this.m, this.m - this.n + 0.0625F);
         }

      }
   }

   public void b(ik var1) {
      super.b(var1);
      this.a = var1.e("blockId");
      this.b = var1.e("blockData");
      this.j = var1.e("facing");
      this.n = this.m = var1.g("progress");
      this.k = var1.m("extending");
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("blockId", this.a);
      var1.a("blockData", this.b);
      var1.a("facing", this.j);
      var1.a("progress", this.n);
      var1.a("extending", this.k);
   }
}
