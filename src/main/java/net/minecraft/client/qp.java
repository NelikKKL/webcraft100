package net.minecraft.client;

import java.io.IOException;
import java.util.Properties;

public class qp {
   private static qp a = new qp();
   private Properties b = new Properties();

   private qp() {
      try {
         this.b.load(qp.class.getResourceAsStream("/lang/en_US.lang"));
         this.b.load(qp.class.getResourceAsStream("/lang/stats_US.lang"));
      } catch (IOException var2) {
         var2.printStackTrace();
      }

   }

   public static qp a() {
      return a;
   }

   public String a(String var1) {
      return this.b.getProperty(var1, var1);
   }

   public String a(String var1, Object... var2) {
      String var3 = this.b.getProperty(var1, var1);
      return String.format(var3, var2);
   }

   public String b(String var1) {
      return this.b.getProperty(var1 + ".name", "");
   }
}
