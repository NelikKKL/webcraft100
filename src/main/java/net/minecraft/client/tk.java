package net.minecraft.client;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class tk {
   private Map a = new HashMap();
   private Map b = new HashMap();
   private boolean c = false;
   private jq d;

   public tk(dr var1, File var2) {
      File var3 = new File(var2, "stats");
      if (!var3.exists()) {
         var3.mkdir();
      }

      for(File var7 : var2.listFiles()) {
         if (var7.getName().startsWith("stats_") && var7.getName().endsWith(".dat")) {
            File var8 = new File(var3, var7.getName());
            if (!var8.exists()) {
               System.out.println("Relocating " + var7.getName());
               var7.renameTo(var8);
            }
         }
      }

      this.d = new jq(var1, this, var3);
   }

   public void a(px var1, int var2) {
      this.a(this.b, var1, var2);
      this.a(this.a, var1, var2);
      this.c = true;
   }

   private void a(Map var1, px var2, int var3) {
      Integer var4 = (Integer)var1.get(var2);
      int var5 = var4 == null ? 0 : var4;
      var1.put(var2, var5 + var3);
   }

   public Map a() {
      return new HashMap(this.b);
   }

   public void a(Map var1) {
      if (var1 != null) {
         this.c = true;

         for(px var3 : (Iterable<px>)(Iterable)(var1.keySet())) {
            this.a(this.b, var3, (Integer)var1.get(var3));
            this.a(this.a, var3, (Integer)var1.get(var3));
         }

      }
   }

   public void b(Map var1) {
      if (var1 != null) {
         for(px var3 : (Iterable<px>)(Iterable)(var1.keySet())) {
            Integer var4 = (Integer)this.b.get(var3);
            int var5 = var4 == null ? 0 : var4;
            this.a.put(var3, (Integer)var1.get(var3) + var5);
         }

      }
   }

   public void c(Map var1) {
      if (var1 != null) {
         this.c = true;

         for(px var3 : (Iterable<px>)(Iterable)(var1.keySet())) {
            this.a(this.b, var3, (Integer)var1.get(var3));
         }

      }
   }

   public static Map a(String var0) {
      HashMap var1 = new HashMap();

      try {
         String var2 = "local";
         StringBuilder var3 = new StringBuilder();
         wz var4 = (new nx()).a(var0);

         for(an var7 : (Iterable<an>)(Iterable)(var4.b(new Object[]{"stats-change"}))) {
            Map var8 = var7.a();
            Map.Entry var9 = (Map.Entry)var8.entrySet().iterator().next();
            int var10 = Integer.parseInt(((oj)var9.getKey()).c());
            int var11 = Integer.parseInt(((an)var9.getValue()).c());
            px var12 = ny.a(var10);
            if (var12 == null) {
               System.out.println(var10 + " is not a valid stat");
            } else {
               var3.append(ny.a(var10).d).append(",");
               var3.append(var11).append(",");
               var1.put(var12, var11);
            }
         }

         vz var14 = new vz(var2);
         String var15 = var14.a(var3.toString());
         if (!var15.equals(var4.a(new Object[]{"checksum"}))) {
            System.out.println("CHECKSUM MISMATCH");
            return null;
         }
      } catch (zz var13) {
         var13.printStackTrace();
      }

      return var1;
   }

   public static String a(String var0, String var1, Map var2) {
      StringBuilder var3 = new StringBuilder();
      StringBuilder var4 = new StringBuilder();
      boolean var5 = true;
      var3.append("{\r\n");
      if (var0 != null && var1 != null) {
         var3.append("  \"user\":{\r\n");
         var3.append("    \"name\":\"").append(var0).append("\",\r\n");
         var3.append("    \"sessionid\":\"").append(var1).append("\"\r\n");
         var3.append("  },\r\n");
      }

      var3.append("  \"stats-change\":[");

      for(px var7 : (Iterable<px>)(Iterable)(var2.keySet())) {
         if (!var5) {
            var3.append("},");
         } else {
            var5 = false;
         }

         var3.append("\r\n    {\"").append(var7.a).append("\":").append(var2.get(var7));
         var4.append(var7.d).append(",");
         var4.append(var2.get(var7)).append(",");
      }

      if (!var5) {
         var3.append("}");
      }

      vz var8 = new vz(var1);
      var3.append("\r\n  ],\r\n");
      var3.append("  \"checksum\":\"").append(var8.a(var4.toString())).append("\"\r\n");
      var3.append("}");
      return var3.toString();
   }

   public boolean a(ws var1) {
      return this.a.containsKey(var1);
   }

   public boolean b(ws var1) {
      return var1.j == null || this.a(var1.j);
   }

   public int a(px var1) {
      Integer var2 = (Integer)this.a.get(var1);
      return var2 == null ? 0 : var2;
   }

   public void b() {
   }

   public void c() {
      this.d.b(this.a());
   }

   public void d() {
      if (this.c && this.d.b()) {
         this.d.a(this.a());
      }

      this.d.c();
   }
}
