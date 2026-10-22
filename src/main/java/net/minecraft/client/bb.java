package net.minecraft.client;

import java.util.List;

public class bb implements de {
   private String a;
   private int b;
   private dk[] c;
   private List d;

   public bb(String var1, int var2) {
      this.a = var1;
      this.b = var2;
      this.c = new dk[var2];
   }

   public dk d(int var1) {
      return this.c[var1];
   }

   public dk a(int var1, int var2) {
      if (this.c[var1] != null) {
         if (this.c[var1].a <= var2) {
            dk var4 = this.c[var1];
            this.c[var1] = null;
            this.h();
            return var4;
         } else {
            dk var3 = this.c[var1].a(var2);
            if (this.c[var1].a == 0) {
               this.c[var1] = null;
            }

            this.h();
            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, dk var2) {
      this.c[var1] = var2;
      if (var2 != null && var2.a > this.e()) {
         var2.a = this.e();
      }

      this.h();
   }

   public int c() {
      return this.b;
   }

   public String d() {
      return this.a;
   }

   public int e() {
      return 64;
   }

   public void h() {
      if (this.d != null) {
         for(int var1 = 0; var1 < this.d.size(); ++var1) {
            ((afq)this.d.get(var1)).a(this);
         }
      }

   }

   public boolean b_(vi var1) {
      return true;
   }

   public void j() {
   }

   public void k() {
   }
}
