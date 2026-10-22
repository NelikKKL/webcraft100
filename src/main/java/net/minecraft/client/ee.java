package net.minecraft.client;

public class ee extends xe {
   private xe b;
   protected String a = "Controls";
   private ki c;
   private int d = -1;

   public ee(xe var1, ki var2) {
      this.b = var1;
      this.c = var2;
   }

   private int e() {
      return this.m / 2 - 155;
   }

   public void a() {
      qp var1 = qp.a();
      int var2 = this.e();

      for(int var3 = 0; var3 < this.c.A.length; ++var3) {
         this.o.add(new abs(var3, var2 + var3 % 2 * 160, this.n / 6 + 24 * (var3 >> 1), 70, 20, this.c.b(var3)));
      }

      this.o.add(new ct(200, this.m / 2 - 100, this.n / 6 + 168, var1.a("gui.done")));
      this.a = var1.a("controls.title");
   }

   protected void a(ct var1) {
      for(int var2 = 0; var2 < this.c.A.length; ++var2) {
         ((ct)this.o.get(var2)).e = this.c.b(var2);
      }

      if (var1.f == 200) {
         this.l.a(this.b);
      } else {
         this.d = var1.f;
         var1.e = "> " + this.c.b(var1.f) + " <";
      }

   }

   protected void a(int var1, int var2, int var3) {
      if (this.d >= 0) {
         this.c.a(this.d, -100 + var3);
         ((ct)this.o.get(this.d)).e = this.c.b(this.d);
         this.d = -1;
         aby.b();
      } else {
         super.a(var1, var2, var3);
      }

   }

   protected void a(char var1, int var2) {
      if (this.d >= 0) {
         this.c.a(this.d, var2);
         ((ct)this.o.get(this.d)).e = this.c.b(this.d);
         this.d = -1;
         aby.b();
      } else {
         super.a(var1, var2);
      }

   }

   public void a(int var1, int var2, float var3) {
      this.j();
      this.a(this.q, this.a, this.m / 2, 20, 16777215);
      int var4 = this.e();

      for(int var5 = 0; var5 < this.c.A.length; ++var5) {
         boolean var6 = false;

         for(int var7 = 0; var7 < this.c.A.length; ++var7) {
            if (var7 != var5 && this.c.A[var5].d == this.c.A[var7].d) {
               var6 = true;
            }
         }

         if (this.d == var5) {
            ((ct)this.o.get(var5)).e = "§f> §e??? §f<";
         } else if (var6) {
            ((ct)this.o.get(var5)).e = "§c" + this.c.b(var5);
         } else {
            ((ct)this.o.get(var5)).e = this.c.b(var5);
         }

         this.b(this.q, this.c.a(var5), var4 + var5 % 2 * 160 + 70 + 6, this.n / 6 + 24 * (var5 >> 1) + 7, -1);
      }

      super.a(var1, var2, var3);
   }
}
