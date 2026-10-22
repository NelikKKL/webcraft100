package net.minecraft.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pf {
   public static boolean a = false;
   private static List b = new ArrayList();
   private static List c = new ArrayList();
   private static String d = "";
   private static Map e = new HashMap();

   public static void a() {
      e.clear();
   }

   public static void a(String var0) {
      if (a) {
         if (d.length() > 0) {
            d = d + ".";
         }

         d = d + var0;
         b.add(d);
         c.add(System.nanoTime());
      }
   }

   public static void b() {
      if (a) {
         long var0 = System.nanoTime();
         long var2 = (Long)c.remove(c.size() - 1);
         b.remove(b.size() - 1);
         long var4 = var0 - var2;
         if (e.containsKey(d)) {
            e.put(d, (Long)e.get(d) + var4);
         } else {
            e.put(d, var4);
         }

         d = b.size() > 0 ? (String)b.get(b.size() - 1) : "";
      }
   }

   public static List b(String var0) {
      if (!a) {
         return null;
      } else {
         String var1 = var0;
         long var2 = e.containsKey("root") ? (Long)e.get("root") : 0L;
         long var4 = e.containsKey(var0) ? (Long)e.get(var0) : -1L;
         ArrayList var6 = new ArrayList();
         if (var0.length() > 0) {
            var0 = var0 + ".";
         }

         long var7 = 0L;

         for(String var10 : (Iterable<String>)(Iterable)(e.keySet())) {
            if (var10.length() > var0.length() && var10.startsWith(var0) && var10.indexOf(".", var0.length() + 1) < 0) {
               var7 += (Long)e.get(var10);
            }
         }

         float var19 = (float)var7;
         if (var7 < var4) {
            var7 = var4;
         }

         if (var2 < var7) {
            var2 = var7;
         }

         for(String var11 : (Iterable<String>)(Iterable)(e.keySet())) {
            if (var11.length() > var0.length() && var11.startsWith(var0) && var11.indexOf(".", var0.length() + 1) < 0) {
               long var12 = (Long)e.get(var11);
               double var14 = (double)var12 * (double)100.0F / (double)var7;
               double var16 = (double)var12 * (double)100.0F / (double)var2;
               String var18 = var11.substring(var0.length());
               var6.add(new afx(var18, var14, var16));
            }
         }

         for(String var22 : (Iterable<String>)(Iterable)(e.keySet())) {
            e.put(var22, (Long)e.get(var22) * 999L / 1000L);
         }

         if ((float)var7 > var19) {
            var6.add(new afx("unspecified", (double)((float)var7 - var19) * (double)100.0F / (double)var7, (double)((float)var7 - var19) * (double)100.0F / (double)var2));
         }

         Collections.sort(var6);
         var6.add(0, new afx(var1, (double)100.0F, (double)var7 * (double)100.0F / (double)var2));
         return var6;
      }
   }

   public static void c(String var0) {
      b();
      a(var0);
   }
}
