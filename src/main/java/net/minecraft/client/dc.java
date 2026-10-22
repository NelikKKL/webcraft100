package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public class dc extends hl {
   private sr[] e;
   private boolean f;
   private acm[] g;

   public dc() {
      this.e = new sr[]{sr.d, sr.f, sr.e, sr.h, sr.g, sr.n, sr.o};
      this.g = new acm[3];
   }

   protected boolean a(int var1, int var2) {
      if (!this.f) {
         this.b.setSeed(this.c.t());
         double var3 = this.b.nextDouble() * Math.PI * (double)2.0F;

         for(int var5 = 0; var5 < this.g.length; ++var5) {
            double var6 = ((double)1.25F + this.b.nextDouble()) * (double)32.0F;
            int var8 = (int)Math.round(Math.cos(var3) * var6);
            int var9 = (int)Math.round(Math.sin(var3) * var6);
            ArrayList var10 = new ArrayList();

            for(sr var14 : this.e) {
               var10.add(var14);
            }

            am var18 = this.c.a().a((var8 << 4) + 8, (var9 << 4) + 8, 112, var10, this.b);
            if (var18 != null) {
               var8 = var18.a >> 4;
               var9 = var18.c >> 4;
            } else {
               System.out.println("Placed stronghold in INVALID biome at (" + var8 + ", " + var9 + ")");
            }

            this.g[var5] = new acm(var8, var9);
            var3 += (Math.PI * 2D) / (double)this.g.length;
         }

         this.f = true;
      }

      for(acm var17 : this.g) {
         if (var1 == var17.a && var2 == var17.b) {
            return true;
         }
      }

      return false;
   }

   protected List a() {
      ArrayList var1 = new ArrayList();

      for(acm var5 : this.g) {
         if (var5 != null) {
            var1.add(var5.a(64));
         }
      }

      return var1;
   }

   protected oa b(int var1, int var2) {
      kg var3;
      for(var3 = new kg(this.c, this.b, var1, var2); var3.b().isEmpty() || ((aeh)var3.b().get(0)).b == null; var3 = new kg(this.c, this.b, var1, var2)) {
      }

      return var3;
   }
}
