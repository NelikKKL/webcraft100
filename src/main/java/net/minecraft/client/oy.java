package net.minecraft.client;

import java.util.Comparator;

public class oy implements Comparator {
   private double a;
   private double b;
   private double c;

   public oy(ia var1) {
      this.a = -var1.s;
      this.b = -var1.t;
      this.c = -var1.u;
   }

   public int a(ge var1, ge var2) {
      double var3 = (double)var1.q + this.a;
      double var5 = (double)var1.r + this.b;
      double var7 = (double)var1.s + this.c;
      double var9 = (double)var2.q + this.a;
      double var11 = (double)var2.r + this.b;
      double var13 = (double)var2.s + this.c;
      return (int)((var3 * var3 + var5 * var5 + var7 * var7 - (var9 * var9 + var11 * var11 + var13 * var13)) * (double)1024.0F);
   }

   // PATCH(bridge): bridge-метод, потерянный декомпилятором
   public int compare(Object v0, Object v1) { return this.a((ge)v0, (ge)v1); }
}
