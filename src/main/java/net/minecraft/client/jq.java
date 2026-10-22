package net.minecraft.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Map;

public class jq {
   private volatile boolean a = false;
   private volatile Map b = null;
   private volatile Map c = null;
   private tk d;
   private File e;
   private File f;
   private File g;
   private File h;
   private File i;
   private File j;
   private dr k;
   private int l = 0;
   private int m = 0;

   public jq(dr var1, tk var2, File var3) {
      this.e = new File(var3, "stats_" + var1.b.toLowerCase() + "_unsent.dat");
      this.f = new File(var3, "stats_" + var1.b.toLowerCase() + ".dat");
      this.i = new File(var3, "stats_" + var1.b.toLowerCase() + "_unsent.old");
      this.j = new File(var3, "stats_" + var1.b.toLowerCase() + ".old");
      this.g = new File(var3, "stats_" + var1.b.toLowerCase() + "_unsent.tmp");
      this.h = new File(var3, "stats_" + var1.b.toLowerCase() + ".tmp");
      if (!var1.b.toLowerCase().equals(var1.b)) {
         this.a(var3, "stats_" + var1.b + "_unsent.dat", this.e);
         this.a(var3, "stats_" + var1.b + ".dat", this.f);
         this.a(var3, "stats_" + var1.b + "_unsent.old", this.i);
         this.a(var3, "stats_" + var1.b + ".old", this.j);
         this.a(var3, "stats_" + var1.b + "_unsent.tmp", this.g);
         this.a(var3, "stats_" + var1.b + ".tmp", this.h);
      }

      this.d = var2;
      this.k = var1;
      if (this.e.exists()) {
         var2.a(this.a(this.e, this.g, this.i));
      }

      this.a();
   }

   private void a(File var1, String var2, File var3) {
      File var4 = new File(var1, var2);
      if (var4.exists() && !var4.isDirectory() && !var3.exists()) {
         var4.renameTo(var3);
      }

   }

   private Map a(File var1, File var2, File var3) {
      if (var1.exists()) {
         return this.a(var1);
      } else if (var3.exists()) {
         return this.a(var3);
      } else {
         return var2.exists() ? this.a(var2) : null;
      }
   }

   private Map a(File var1) {
      BufferedReader var2 = null;

      try {
         var2 = new BufferedReader(new FileReader(var1));
         String var3 = "";
         StringBuilder var4 = new StringBuilder();

         while((var3 = var2.readLine()) != null) {
            var4.append(var3);
         }

         Map var5 = tk.a(var4.toString());
         return var5;
      } catch (Exception var15) {
         var15.printStackTrace();
      } finally {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Exception var14) {
               var14.printStackTrace();
            }
         }

      }

      return null;
   }

   private void a(Map var1, File var2, File var3, File var4) throws java.io.IOException {
      PrintWriter var5 = new PrintWriter(new FileWriter(var3, false));

      try {
         var5.print(tk.a(this.k.b, "local", var1));
      } finally {
         var5.close();
      }

      if (var4.exists()) {
         var4.delete();
      }

      if (var2.exists()) {
         var2.renameTo(var4);
      }

      var3.renameTo(var2);
   }

   public void a() {
      if (this.a) {
         throw new IllegalStateException("Can't get stats from server while StatsSyncher is busy!");
      } else {
         this.l = 100;
         this.a = true;
         (new uf(this)).start();
      }
   }

   public void a(Map var1) {
      if (this.a) {
         throw new IllegalStateException("Can't save stats while StatsSyncher is busy!");
      } else {
         this.l = 100;
         this.a = true;
         (new mi(this, var1)).start();
      }
   }

   public void b(Map var1) {
      int var2 = 30;

      while(this.a) {
         --var2;
         if (var2 <= 0) {
            break;
         }

         try {
            Thread.sleep(100L);
         } catch (InterruptedException var10) {
            var10.printStackTrace();
         }
      }

      this.a = true;

      try {
         this.a(var1, this.e, this.g, this.i);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         this.a = false;
      }

   }

   public boolean b() {
      return this.l <= 0 && !this.a && this.c == null;
   }

   public void c() {
      if (this.l > 0) {
         --this.l;
      }

      if (this.m > 0) {
         --this.m;
      }

      if (this.c != null) {
         this.d.c(this.c);
         this.c = null;
      }

      if (this.b != null) {
         this.d.b(this.b);
         this.b = null;
      }

   }

   // $FF: synthetic method
   static Map a(jq var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static File b(jq var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static File c(jq var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static File d(jq var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static void a(jq var0, Map var1, File var2, File var3, File var4) throws java.io.IOException {
      var0.a(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   static Map a(jq var0, Map var1) {
      return var0.b = var1;
   }

   // $FF: synthetic method
   static Map a(jq var0, File var1, File var2, File var3) {
      return var0.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static boolean a(jq var0, boolean var1) {
      return var0.a = var1;
   }

   // $FF: synthetic method
   static File e(jq var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static File f(jq var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static File g(jq var0) {
      return var0.i;
   }
}
