package net.minecraft.client;

import java.io.IOException;
import java.util.List;

public class mv implements ej {
   private zx c;
   private ej d;
   private d e;
   private zx[] f;
   private ry g;
   int a;
   int b;
   private zx h;
   private int i;
   private int j;

   public void d(int var1, int var2) {
      this.i = var1;
      this.j = var2;
   }

   public boolean e(int var1, int var2) {
      byte var3 = 15;
      return var1 >= this.i - var3 && var2 >= this.j - var3 && var1 <= this.i + var3 && var2 <= this.j + var3;
   }

   public boolean c(int var1, int var2) {
      if (!this.e(var1, var2)) {
         return false;
      } else if (var1 == this.a && var2 == this.b && this.h != null) {
         return true;
      } else {
         int var3 = var1 & 31;
         int var4 = var2 & 31;
         int var5 = var3 + var4 * 32;
         return this.f[var5] != null && (this.f[var5] == this.c || this.f[var5].a(var1, var2));
      }
   }

   public zx a(int var1, int var2) {
      return this.b(var1, var2);
   }

   public zx b(int var1, int var2) {
      if (var1 == this.a && var2 == this.b && this.h != null) {
         return this.h;
      } else if (!this.g.D && !this.e(var1, var2)) {
         return this.c;
      } else {
         int var3 = var1 & 31;
         int var4 = var2 & 31;
         int var5 = var3 + var4 * 32;
         if (!this.c(var1, var2)) {
            if (this.f[var5] != null) {
               this.f[var5].f();
               this.b(this.f[var5]);
               this.a(this.f[var5]);
            }

            zx var6 = this.f(var1, var2);
            if (var6 == null) {
               if (this.d == null) {
                  var6 = this.c;
               } else {
                  var6 = this.d.b(var1, var2);
                  var6.i();
               }
            }

            this.f[var5] = var6;
            var6.d();
            if (this.f[var5] != null) {
               this.f[var5].e();
            }

            this.f[var5].a(this, this, var1, var2);
         }

         this.a = var1;
         this.b = var2;
         this.h = this.f[var5];
         return this.f[var5];
      }
   }

   private zx f(int var1, int var2) {
      if (this.e == null) {
         return this.c;
      } else {
         try {
            zx var3 = this.e.a(this.g, var1, var2);
            if (var3 != null) {
               var3.t = this.g.u();
            }

            return var3;
         } catch (Exception var4) {
            var4.printStackTrace();
            return this.c;
         }
      }
   }

   private void a(zx var1) {
      if (this.e != null) {
         try {
            this.e.b(this.g, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }

      }
   }

   private void b(zx var1) {
      if (this.e != null) {
         try {
            var1.t = this.g.u();
            this.e.a(this.g, var1);
         } catch (IOException var3) {
            var3.printStackTrace();
         }

      }
   }

   public void a(ej var1, int var2, int var3) {
      zx var4 = this.b(var2, var3);
      if (!var4.p) {
         var4.p = true;
         if (this.d != null) {
            this.d.a(var1, var2, var3);
            var4.g();
         }
      }

   }

   public boolean a(boolean var1, rz var2) {
      int var3 = 0;
      int var4 = 0;
      if (var2 != null) {
         for(int var5 = 0; var5 < this.f.length; ++var5) {
            if (this.f[var5] != null && this.f[var5].a(var1)) {
               ++var4;
            }
         }
      }

      int var7 = 0;

      for(int var6 = 0; var6 < this.f.length; ++var6) {
         if (this.f[var6] != null) {
            if (var1 && !this.f[var6].r) {
               this.a(this.f[var6]);
            }

            if (this.f[var6].a(var1)) {
               this.b(this.f[var6]);
               this.f[var6].q = false;
               ++var3;
               if (var3 == 2 && !var1) {
                  return false;
               }

               if (var2 != null) {
                  ++var7;
                  if (var7 % 10 == 0) {
                     var2.a(var7 * 100 / var4);
                  }
               }
            }
         }
      }

      if (var1) {
         if (this.e == null) {
            return true;
         }

         this.e.b();
      }

      return true;
   }

   public boolean a() {
      if (this.e != null) {
         this.e.a();
      }

      return this.d.a();
   }

   public boolean b() {
      return true;
   }

   public String c() {
      return "ChunkCache: " + this.f.length;
   }

   public List a(jf var1, int var2, int var3, int var4) {
      return this.d.a(var1, var2, var3, var4);
   }

   public am a(ry var1, String var2, int var3, int var4, int var5) {
      return this.d.a(var1, var2, var3, var4, var5);
   }
}
