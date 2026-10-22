package net.minecraft.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class jz implements ej {
   private Set a = new HashSet();
   private zx b;
   private ej c;
   private d d;
   private wv e = new wv();
   private List f = new ArrayList();
   private ry g;
   private int h;

   public jz(ry var1, d var2, ej var3) {
      this.b = new hn(var1, new byte[256 * var1.c], 0, 0);
      this.g = var1;
      this.d = var2;
      this.c = var3;
   }

   public boolean c(int var1, int var2) {
      return this.e.b(acm.a(var1, var2));
   }

   public void d(int var1, int var2) {
      dh var3 = this.g.v();
      int var4 = var1 * 16 + 8 - var3.a;
      int var5 = var2 * 16 + 8 - var3.c;
      short var6 = 128;
      if (var4 < -var6 || var4 > var6 || var5 < -var6 || var5 > var6) {
         this.a.add(acm.a(var1, var2));
      }

   }

   public zx a(int var1, int var2) {
      long var3 = acm.a(var1, var2);
      this.a.remove(var3);
      zx var5 = (zx)this.e.a(var3);
      if (var5 == null) {
         int var6 = 1875004;
         if (var1 < -var6 || var2 < -var6 || var1 >= var6 || var2 >= var6) {
            return this.b;
         }

         var5 = this.e(var1, var2);
         if (var5 == null) {
            if (this.c == null) {
               var5 = this.b;
            } else {
               var5 = this.c.b(var1, var2);
            }
         }

         this.e.a(var3, var5);
         this.f.add(var5);
         if (var5 != null) {
            var5.d();
            var5.e();
         }

         var5.a(this, this, var1, var2);
      }

      return var5;
   }

   public zx b(int var1, int var2) {
      zx var3 = (zx)this.e.a(acm.a(var1, var2));
      return var3 == null ? this.a(var1, var2) : var3;
   }

   private zx e(int var1, int var2) {
      if (this.d == null) {
         return null;
      } else {
         try {
            zx var3 = this.d.a(this.g, var1, var2);
            if (var3 != null) {
               var3.t = this.g.u();
            }

            return var3;
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }

   private void a(zx var1) {
      if (this.d != null) {
         try {
            this.d.b(this.g, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }

      }
   }

   private void b(zx var1) {
      if (this.d != null) {
         try {
            var1.t = this.g.u();
            this.d.a(this.g, var1);
         } catch (IOException var3) {
            var3.printStackTrace();
         }

      }
   }

   public void a(ej var1, int var2, int var3) {
      zx var4 = this.b(var2, var3);
      if (!var4.p) {
         var4.p = true;
         if (this.c != null) {
            this.c.a(var1, var2, var3);
            var4.g();
         }
      }

   }

   public boolean a(boolean var1, rz var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < this.f.size(); ++var4) {
         zx var5 = (zx)this.f.get(var4);
         if (var1 && !var5.r) {
            this.a(var5);
         }

         if (var5.a(var1)) {
            this.b(var5);
            var5.q = false;
            ++var3;
            if (var3 == 24 && !var1) {
               return false;
            }
         }
      }

      if (var1) {
         if (this.d == null) {
            return true;
         }

         this.d.b();
      }

      return true;
   }

   public boolean a() {
      for(int var1 = 0; var1 < 100; ++var1) {
         if (!this.a.isEmpty()) {
            Long var2 = (Long)this.a.iterator().next();
            zx var3 = (zx)this.e.a(var2);
            var3.f();
            this.b(var3);
            this.a(var3);
            this.a.remove(var2);
            this.e.d(var2);
            this.f.remove(var3);
         }
      }

      for(int var4 = 0; var4 < 10; ++var4) {
         if (this.h >= this.f.size()) {
            this.h = 0;
            break;
         }

         zx var5 = (zx)this.f.get(this.h++);
         vi var6 = this.g.a((double)(var5.l << 4) + (double)8.0F, (double)64.0F, (double)(var5.m << 4) + (double)8.0F, (double)288.0F);
         if (var6 == null) {
            this.d(var5.l, var5.m);
         }
      }

      if (this.d != null) {
         this.d.a();
      }

      return this.c.a();
   }

   public boolean b() {
      return true;
   }

   public String c() {
      return "ServerChunkCache: " + this.e.a() + " Drop: " + this.a.size();
   }

   public List a(jf var1, int var2, int var3, int var4) {
      return this.c.a(var1, var2, var3, var4);
   }

   public am a(ry var1, String var2, int var3, int var4, int var5) {
      return this.c.a(var1, var2, var3, var4, var5);
   }
}
