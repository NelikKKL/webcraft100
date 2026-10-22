package net.minecraft.client;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class adk {
   private List b = new ArrayList();
   private afs c = new ax();
   public afs a;
   private Map d = new HashMap();
   private Minecraft e;
   private File f;
   private String g;

   public adk(Minecraft var1, File var2) {
      this.e = var1;
      this.f = new File(var2, "texturepacks");
      if (!this.f.exists()) {
         this.f.mkdirs();
      }

      this.g = var1.A.m;
      this.a();
      this.a.a();
   }

   public boolean a(afs var1) {
      if (var1 == this.a) {
         return false;
      } else {
         this.a.b();
         this.g = var1.a;
         this.a = var1;
         this.e.A.m = this.g;
         this.e.A.b();
         this.a.a();
         return true;
      }
   }

   public void a() {
      ArrayList var1 = new ArrayList();
      this.a = null;
      var1.add(this.c);
      if (this.f.exists() && this.f.isDirectory()) {
         File[] var2 = this.f.listFiles();

         for(File var6 : var2) {
            if (var6.isFile() && var6.getName().toLowerCase().endsWith(".zip")) {
               String var7 = var6.getName() + ":" + var6.length() + ":" + var6.lastModified();

               try {
                  if (!this.d.containsKey(var7)) {
                     adw var8 = new adw(var6);
                     var8.d = var7;
                     this.d.put(var7, var8);
                     ((afs)var8).c(this.e);
                  }

                  afs var12 = (afs)this.d.get(var7);
                  if (var12.a.equals(this.g)) {
                     this.a = var12;
                  }

                  var1.add(var12);
               } catch (IOException var9) {
                  var9.printStackTrace();
               }
            }
         }
      }

      if (this.a == null) {
         this.a = this.c;
      }

      this.b.removeAll(var1);

      for(afs var11 : (Iterable<afs>)(Iterable)(this.b)) {
         var11.a(this.e);
         this.d.remove(var11.d);
      }

      this.b = var1;
   }

   public List b() {
      return new ArrayList(this.b);
   }
}
