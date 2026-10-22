package net.minecraft.client;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class oa {
   protected LinkedList a = new LinkedList();
   protected nl b;

   protected oa() {
   }

   public nl a() {
      return this.b;
   }

   public LinkedList b() {
      return this.a;
   }

   public void a(ry var1, Random var2, nl var3) {
      Iterator var4 = this.a.iterator();

      while(var4.hasNext()) {
         nk var5 = (nk)var4.next();
         if (var5.a().a(var3) && !var5.a(var1, var2, var3)) {
            var4.remove();
         }
      }

   }

   protected void c() {
      this.b = nl.a();

      for(nk var2 : (Iterable<nk>)(Iterable)(this.a)) {
         this.b.b(var2.a());
      }

   }

   protected void a(ry var1, Random var2, int var3) {
      int var4 = var1.e - var3;
      int var5 = this.b.c() + 1;
      if (var5 < var4) {
         var5 += var2.nextInt(var4 - var5);
      }

      int var6 = var5 - this.b.e;
      this.b.a(0, var6, 0);

      for(nk var8 : (Iterable<nk>)(Iterable)(this.a)) {
         var8.a().a(0, var6, 0);
      }

   }

   protected void a(ry var1, Random var2, int var3, int var4) {
      int var5 = var4 - var3 + 1 - this.b.c();
      int var6 = 1;
      if (var5 > 1) {
         var6 = var3 + var2.nextInt(var5);
      } else {
         var6 = var3;
      }

      int var7 = var6 - this.b.b;
      this.b.a(0, var7, 0);

      for(nk var9 : (Iterable<nk>)(Iterable)(this.a)) {
         var9.a().a(0, var7, 0);
      }

   }

   public boolean d() {
      return true;
   }
}
