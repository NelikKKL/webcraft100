package net.minecraft.client;

import java.util.List;

public class ab extends fm {
   private int d;

   public ab(ry var1) {
      super(var1);
   }

   public ab(ry var1, nq var2, int var3) {
      super(var1, var2);
      this.d = var3;
   }

   public ab(ry var1, double var2, double var4, double var6, int var8) {
      super(var1, var2, var4, var6);
      this.d = var8;
   }

   protected float b_() {
      return 0.05F;
   }

   protected float c_() {
      return 0.5F;
   }

   protected float d() {
      return -20.0F;
   }

   public int e() {
      return this.d;
   }

   protected void a(gv var1) {
      if (!this.o.I) {
         List var2 = acy.br.d(this.d);
         if (var2 != null && !var2.isEmpty()) {
            c var3 = this.C.b((double)4.0F, (double)2.0F, (double)4.0F);
            List var4 = this.o.a(nq.class, var3);
            if (var4 != null && !var4.isEmpty()) {
               for(ia var6 : (Iterable<ia>)(Iterable)(var4)) {
                  double var7 = this.d(var6);
                  if (var7 < (double)16.0F) {
                     double var9 = (double)1.0F - Math.sqrt(var7) / (double)4.0F;
                     if (var6 == var1.g) {
                        var9 = (double)1.0F;
                     }

                     for(s var12 : (Iterable<s>)(Iterable)(var2)) {
                        int var13 = var12.a();
                        if (abg.a[var13].a()) {
                           abg.a[var13].a(this.c, (nq)var6, var12.c(), var9);
                        } else {
                           int var14 = (int)(var9 * (double)var12.b() + (double)0.5F);
                           if (var14 > 20) {
                              ((nq)var6).a(new s(var13, var14, var12.c()));
                           }
                        }
                     }
                  }
               }
            }
         }

         this.o.g(2002, (int)net.minecraft.client.web.JMath.round(this.s), (int)net.minecraft.client.web.JMath.round(this.t), (int)net.minecraft.client.web.JMath.round(this.u), this.d);
         this.v();
      }

   }
}
