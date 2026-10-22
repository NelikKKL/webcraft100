package net.minecraft.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class age {
   public static final String a = a();
   public static final char[] b = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};

   private static String a() {
      String var0 = "";

      try {
         BufferedReader var1 = new BufferedReader(new InputStreamReader(net.minecraft.client.web.ResourceIO.getTextResourceAsStream("/font.txt"), "UTF-8"));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            if (!var2.startsWith("#")) {
               var0 = var0 + var2;
            }
         }

         var1.close();
      } catch (Exception var3) {
      }

      return var0;
   }
}
