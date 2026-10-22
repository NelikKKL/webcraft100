package net.minecraft.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class xp {
   public boolean a = false;
   private Random h = new Random();
   private ry i;
   public double b;
   public double c;
   public double d;
   public ia e;
   public float f;
   public Set g = new HashSet();

   public xp(ry var1, ia var2, double var3, double var5, double var7, float var9) {
      this.i = var1;
      this.e = var2;
      this.f = var9;
      this.b = var3;
      this.c = var5;
      this.d = var7;
   }

   public void a() {
      float var1 = this.f;
      byte var2 = 16;

      for(int var3 = 0; var3 < var2; ++var3) {
         for(int var4 = 0; var4 < var2; ++var4) {
            for(int var5 = 0; var5 < var2; ++var5) {
               if (var3 == 0 || var3 == var2 - 1 || var4 == 0 || var4 == var2 - 1 || var5 == 0 || var5 == var2 - 1) {
                  double var6 = (double)((float)var3 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                  double var8 = (double)((float)var4 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                  double var10 = (double)((float)var5 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                  double var12 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10);
                  var6 /= var12;
                  var8 /= var12;
                  var10 /= var12;
                  float var14 = this.f * (0.7F + this.i.w.nextFloat() * 0.6F);
                  double var15 = this.b;
                  double var17 = this.c;
                  double var19 = this.d;

                  for(float var21 = 0.3F; var14 > 0.0F; var14 -= var21 * 0.75F) {
                     int var22 = me.c(var15);
                     int var23 = me.c(var17);
                     int var24 = me.c(var19);
                     int var25 = this.i.a(var22, var23, var24);
                     if (var25 > 0) {
                        var14 -= (yy.k[var25].a(this.e) + 0.3F) * var21;
                     }

                     if (var14 > 0.0F) {
                        this.g.add(new am(var22, var23, var24));
                     }

                     var15 += var6 * (double)var21;
                     var17 += var8 * (double)var21;
                     var19 += var10 * (double)var21;
                  }
               }
            }
         }
      }

      this.f *= 2.0F;
      int var29 = me.c(this.b - (double)this.f - (double)1.0F);
      int var30 = me.c(this.b + (double)this.f + (double)1.0F);
      int var31 = me.c(this.c - (double)this.f - (double)1.0F);
      int var33 = me.c(this.c + (double)this.f + (double)1.0F);
      int var7 = me.c(this.d - (double)this.f - (double)1.0F);
      int var35 = me.c(this.d + (double)this.f + (double)1.0F);
      List var9 = this.i.b(this.e, net.minecraft.client.c.b((double)var29, (double)var31, (double)var7, (double)var30, (double)var33, (double)var35));
      fb var37 = fb.b(this.b, this.c, this.d);

      for(int var11 = 0; var11 < var9.size(); ++var11) {
         ia var39 = (ia)var9.get(var11);
         double var13 = var39.g(this.b, this.c, this.d) / (double)this.f;
         if (var13 <= (double)1.0F) {
            double var40 = var39.s - this.b;
            double var42 = var39.t - this.c;
            double var44 = var39.u - this.d;
            double var46 = (double)me.a(var40 * var40 + var42 * var42 + var44 * var44);
            var40 /= var46;
            var42 /= var46;
            var44 /= var46;
            double var47 = (double)this.i.a(var37, var39.C);
            double var48 = ((double)1.0F - var13) * var47;
            var39.a(pm.k, (int)((var48 * var48 + var48) / (double)2.0F * (double)8.0F * (double)this.f + (double)1.0F));
            var39.v += var40 * var48;
            var39.w += var42 * var48;
            var39.x += var44 * var48;
         }
      }

      this.f = var1;
      ArrayList var38 = new ArrayList();
      var38.addAll(this.g);
   }

   public void a(boolean var1) {
      this.i.a(this.b, this.c, this.d, "random.explode", 4.0F, (1.0F + (this.i.w.nextFloat() - this.i.w.nextFloat()) * 0.2F) * 0.7F);
      this.i.a("hugeexplosion", this.b, this.c, this.d, (double)0.0F, (double)0.0F, (double)0.0F);
      ArrayList var2 = new ArrayList();
      var2.addAll(this.g);

      for(int var3 = var2.size() - 1; var3 >= 0; --var3) {
         am var4 = (am)var2.get(var3);
         int var5 = var4.a;
         int var6 = var4.b;
         int var7 = var4.c;
         int var8 = this.i.a(var5, var6, var7);
         if (var1) {
            double var9 = (double)((float)var5 + this.i.w.nextFloat());
            double var11 = (double)((float)var6 + this.i.w.nextFloat());
            double var13 = (double)((float)var7 + this.i.w.nextFloat());
            double var15 = var9 - this.b;
            double var17 = var11 - this.c;
            double var19 = var13 - this.d;
            double var21 = (double)me.a(var15 * var15 + var17 * var17 + var19 * var19);
            var15 /= var21;
            var17 /= var21;
            var19 /= var21;
            double var23 = (double)0.5F / (var21 / (double)this.f + 0.1);
            var23 *= (double)(this.i.w.nextFloat() * this.i.w.nextFloat() + 0.3F);
            var15 *= var23;
            var17 *= var23;
            var19 *= var23;
            this.i.a("explode", (var9 + this.b * (double)1.0F) / (double)2.0F, (var11 + this.c * (double)1.0F) / (double)2.0F, (var13 + this.d * (double)1.0F) / (double)2.0F, var15, var17, var19);
            this.i.a("smoke", var9, var11, var13, var15, var17, var19);
         }

         if (var8 > 0) {
            yy.k[var8].a(this.i, var5, var6, var7, this.i.d(var5, var6, var7), 0.3F, 0);
            this.i.g(var5, var6, var7, 0);
            yy.k[var8].i(this.i, var5, var6, var7);
         }
      }

      if (this.a) {
         for(int var25 = var2.size() - 1; var25 >= 0; --var25) {
            am var26 = (am)var2.get(var25);
            int var27 = var26.a;
            int var28 = var26.b;
            int var29 = var26.c;
            int var30 = this.i.a(var27, var28, var29);
            int var31 = this.i.a(var27, var28 - 1, var29);
            if (var30 == 0 && yy.m[var31] && this.h.nextInt(3) == 0) {
               this.i.g(var27, var28, var29, yy.ar.bM);
            }
         }
      }

   }
}
