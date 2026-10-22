package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public class agl {
   private final vh a;
   private long b = 0L;
   private wv c = new wv();
   private List d = new ArrayList();

   public agl(vh var1) {
      this.a = var1;
   }

   public cq a(int var1, int var2) {
      var1 >>= 4;
      var2 >>= 4;
      long var3 = (long)var1 & 4294967295L | ((long)var2 & 4294967295L) << 32;
      cq var5 = (cq)this.c.a(var3);
      if (var5 == null) {
         var5 = new cq(this, var1, var2);
         this.c.a(var3, var5);
         this.d.add(var5);
      }

      var5.f = System.currentTimeMillis();
      return var5;
   }

   public sr b(int var1, int var2) {
      return this.a(var1, var2).a(var1, var2);
   }

   public float c(int var1, int var2) {
      return this.a(var1, var2).b(var1, var2);
   }

   public float d(int var1, int var2) {
      return this.a(var1, var2).c(var1, var2);
   }

   public void a() {
      long var1 = System.currentTimeMillis();
      long var3 = var1 - this.b;
      if (var3 > 7500L || var3 < 0L) {
         this.b = var1;

         for(int var5 = 0; var5 < this.d.size(); ++var5) {
            cq var6 = (cq)this.d.get(var5);
            long var7 = var1 - var6.f;
            if (var7 > 30000L || var7 < 0L) {
               this.d.remove(var5--);
               long var9 = (long)var6.d & 4294967295L | ((long)var6.e & 4294967295L) << 32;
               this.c.d(var9);
            }
         }
      }

   }

   public sr[] e(int var1, int var2) {
      return this.a(var1, var2).c;
   }

   // $FF: synthetic method
   static vh a(agl var0) {
      return var0.a;
   }
}
