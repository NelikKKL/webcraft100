package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public class aby {
   public static List a = new ArrayList();
   public static ob b = new ob();
   public String c;
   public int d;
   public boolean e;
   public int f = 0;

   public static void a(int var0) {
      aby var1 = (aby)b.a(var0);
      if (var1 != null) {
         ++var1.f;
      }

   }

   public static void a(int var0, boolean var1) {
      aby var2 = (aby)b.a(var0);
      if (var2 != null) {
         var2.e = var1;
      }

   }

   public static void a() {
      for(aby var1 : (Iterable<aby>)(Iterable)(a)) {
         var1.d();
      }

   }

   public static void b() {
      b.a();

      for(aby var1 : (Iterable<aby>)(Iterable)(a)) {
         b.a(var1.d, var1);
      }

   }

   public aby(String var1, int var2) {
      this.c = var1;
      this.d = var2;
      a.add(this);
      b.a(var2, this);
   }

   public boolean c() {
      if (this.f == 0) {
         return false;
      } else {
         --this.f;
         return true;
      }
   }

   private void d() {
      this.f = 0;
      this.e = false;
   }
}
