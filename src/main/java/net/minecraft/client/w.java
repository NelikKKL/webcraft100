package net.minecraft.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class w implements tq {
   protected final File a;

   public w(File var1) {
      if (!var1.exists()) {
         var1.mkdirs();
      }

      this.a = var1;
   }

   public String a() {
      return "Old Format";
   }

   public List b() {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < 5; ++var2) {
         String var3 = "World" + (var2 + 1);
         si var4 = this.a(var3);
         if (var4 != null) {
            var1.add(new rr(var3, "", var4.l(), var4.g(), var4.q(), false, var4.s()));
         }
      }

      return var1;
   }

   public void c() {
   }

   public si a(String var1) {
      File var2 = new File(this.a, var1);
      if (!var2.exists()) {
         return null;
      } else {
         File var3 = new File(var2, "level.dat");
         if (var3.exists()) {
            try {
               ik var9 = vx.a((InputStream)(new FileInputStream(var3)));
               ik var10 = var9.k("Data");
               return new si(var10);
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

         var3 = new File(var2, "level.dat_old");
         if (var3.exists()) {
            try {
               ik var4 = vx.a((InputStream)(new FileInputStream(var3)));
               ik var5 = var4.k("Data");
               return new si(var5);
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }

         return null;
      }
   }

   public void a(String var1, String var2) {
      File var3 = new File(this.a, var1);
      if (var3.exists()) {
         File var4 = new File(var3, "level.dat");
         if (var4.exists()) {
            try {
               ik var5 = vx.a((InputStream)(new FileInputStream(var4)));
               ik var6 = var5.k("Data");
               var6.a("LevelName", var2);
               vx.a(var5, (OutputStream)(new FileOutputStream(var4)));
               net.minecraft.client.web.WorldStore.changed(var4); // PATCH(1.0.0)
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

      }
   }

   public void b(String var1) {
      File var2 = new File(this.a, var1);
      if (var2.exists()) {
         net.minecraft.client.web.WorldStore.deletedTree(var2); // PATCH(1.0.0)
         a(var2.listFiles());
         var2.delete();
      }
   }

   protected static void a(File[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         if (var0[var1].isDirectory()) {
            System.out.println("Deleting " + var0[var1]);
            a(var0[var1].listFiles());
         }

         var0[var1].delete();
      }

   }

   public nh a(String var1, boolean var2) {
      return new e(this.a, var1, var2);
   }

   public boolean c(String var1) {
      return false;
   }

   public boolean a(String var1, rz var2) {
      return false;
   }
}
