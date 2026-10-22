package net.minecraft.client;

import java.util.HashMap;
import java.util.Map;

public class lg {
   public static boolean a = true;
   private static final Map b = new HashMap();
   private static final Map c = new HashMap();
   private static final Object d = new Object();

   public static void a(int var0, long var1) {
      if (a) {
         synchronized(d) {
            if (b.containsKey(var0)) {
               b.put(var0, (Long)b.get(var0) + 1L);
               c.put(var0, (Long)c.get(var0) + var1);
            } else {
               b.put(var0, 1L);
               c.put(var0, var1);
            }

         }
      }
   }
}
