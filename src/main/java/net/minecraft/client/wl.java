package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

public class wl {
   private static final Map a = new HashMap();

   private wl() {
   }

   public static synchronized as a(File var0, int var1, int var2) {
      File var3 = new File(var0, "region");
      File var4 = new File(var3, "r." + (var1 >> 5) + "." + (var2 >> 5) + ".mcr");
      Reference var5 = (Reference)a.get(var4);
      if (var5 != null) {
         as var6 = (as)var5.get();
         if (var6 != null) {
            return var6;
         }
      }

      if (!var3.exists()) {
         var3.mkdirs();
      }

      if (a.size() >= 256) {
         a();
      }

      as var7 = new as(var4);
      a.put(var4, new SoftReference(var7));
      return var7;
   }

   public static synchronized void a() {
      for(Reference var1 : (Iterable<Reference>)(Iterable)(a.values())) {
         try {
            as var2 = (as)var1.get();
            if (var2 != null) {
               var2.a();
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      a.clear();
   }

   public static DataInputStream b(File var0, int var1, int var2) {
      as var3 = a(var0, var1, var2);
      return var3.a(var1 & 31, var2 & 31);
   }

   public static DataOutputStream c(File var0, int var1, int var2) {
      as var3 = a(var0, var1, var2);
      return var3.b(var1 & 31, var2 & 31);
   }
}
