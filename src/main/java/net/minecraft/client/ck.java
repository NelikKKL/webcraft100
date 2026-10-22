package net.minecraft.client;

import java.io.File;
import java.util.regex.Matcher;

class ck implements Comparable {
   private final File a;
   private final int b;
   private final int c;

   public ck(File var1) {
      this.a = var1;
      Matcher var2 = rm.a.matcher(var1.getName());
      if (var2.matches()) {
         this.b = Integer.parseInt(var2.group(1), 36);
         this.c = Integer.parseInt(var2.group(2), 36);
      } else {
         this.b = 0;
         this.c = 0;
      }

   }

   public int a(ck var1) {
      int var2 = this.b >> 5;
      int var3 = var1.b >> 5;
      if (var2 == var3) {
         int var4 = this.c >> 5;
         int var5 = var1.c >> 5;
         return var4 - var5;
      } else {
         return var2 - var3;
      }
   }

   public File a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   // PATCH(bridge): bridge-метод, потерянный декомпилятором
   public int compareTo(Object v0) { return this.a((ck)v0); }
}
