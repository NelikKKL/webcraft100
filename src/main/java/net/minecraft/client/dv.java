package net.minecraft.client;

public class dv extends ht {
   private final abe c;
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private String h;
   private int j;
   private int k;
   public boolean a = false;
   public boolean b = true;
   private xe l;

   public dv(xe var1, abe var2, int var3, int var4, int var5, int var6, String var7) {
      this.l = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.g = var6;
      this.a(var7);
   }

   public void a(String var1) {
      this.h = var1;
   }

   public String a() {
      return this.h;
   }

   public void b() {
      ++this.k;
   }

   public void a(char var1, int var2) {
      if (this.b && this.a) {
         if (var1 == '\t') {
            this.l.k();
         }

         if (var1 == 22) {
            String var3 = xe.f();
            if (var3 == null) {
               var3 = "";
            }

            int var4 = 32 - this.h.length();
            if (var4 > var3.length()) {
               var4 = var3.length();
            }

            if (var4 > 0) {
               this.h = this.h + var3.substring(0, var4);
            }
         }

         if (var2 == 14 && this.h.length() > 0) {
            this.h = this.h.substring(0, this.h.length() - 1);
         }

         if (age.a.indexOf(var1) >= 0 && (this.h.length() < this.j || this.j == 0)) {
            this.h = this.h + var1;
         }

      }
   }

   public void a(int var1, int var2, int var3) {
      boolean var4 = this.b && var1 >= this.d && var1 < this.d + this.f && var2 >= this.e && var2 < this.e + this.g;
      this.a(var4);
   }

   public void a(boolean var1) {
      if (var1 && !this.a) {
         this.k = 0;
      }

      this.a = var1;
   }

   public void c() {
      this.a(this.d - 1, this.e - 1, this.d + this.f + 1, this.e + this.g + 1, -6250336);
      this.a(this.d, this.e, this.d + this.f, this.e + this.g, -16777216);
      if (this.b) {
         boolean var1 = this.a && this.k / 6 % 2 == 0;
         this.b(this.c, this.h + (var1 ? "_" : ""), this.d + 4, this.e + (this.g - 8) / 2, 14737632);
      } else {
         this.b(this.c, this.h, this.d + 4, this.e + (this.g - 8) / 2, 7368816);
      }

   }

   public void a(int var1) {
      this.j = var1;
   }
}
