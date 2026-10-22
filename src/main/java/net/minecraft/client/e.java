package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Logger;

public class e implements nh {
   private static final Logger a = Logger.getLogger("Minecraft");
   private final File b;
   private final File c;
   private final File d;
   private final long e = System.currentTimeMillis();
   private final String f;

   public e(File var1, String var2, boolean var3) {
      this.b = new File(var1, var2);
      this.b.mkdirs();
      this.c = new File(this.b, "players");
      this.d = new File(this.b, "data");
      this.d.mkdirs();
      this.f = var2;
      if (var3) {
         this.c.mkdirs();
      }

      this.e();
   }

   private void e() {
      try {
         File var1 = new File(this.b, "session.lock");
         DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

         try {
            var2.writeLong(this.e);
         } finally {
            var2.close();
         }

      } catch (IOException var7) {
         var7.printStackTrace();
         throw new RuntimeException("Failed to check session lock, aborting");
      }
   }

   protected File a() {
      return this.b;
   }

   public void b() {
      try {
         File var1 = new File(this.b, "session.lock");
         DataInputStream var2 = new DataInputStream(new FileInputStream(var1));

         try {
            if (var2.readLong() != this.e) {
               throw new adl("The save is being accessed from another location, aborting");
            }
         } finally {
            var2.close();
         }

      } catch (IOException var7) {
         throw new adl("Failed to check session lock, aborting");
      }
   }

   public d a(k var1) {
      if (var1 instanceof aau) {
         File var3 = new File(this.b, "DIM-1");
         var3.mkdirs();
         return new gy(var3, true);
      } else if (var1 instanceof ol) {
         File var2 = new File(this.b, "DIM1");
         var2.mkdirs();
         return new gy(var2, true);
      } else {
         return new gy(this.b, true);
      }
   }

   public si c() {
      File var1 = new File(this.b, "level.dat");
      if (var1.exists()) {
         try {
            ik var7 = vx.a((InputStream)(new FileInputStream(var1)));
            ik var8 = var7.k("Data");
            return new si(var8);
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }

      var1 = new File(this.b, "level.dat_old");
      if (var1.exists()) {
         try {
            ik var2 = vx.a((InputStream)(new FileInputStream(var1)));
            ik var3 = var2.k("Data");
            return new si(var3);
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      return null;
   }

   public void a(si var1, List var2) {
      ik var3 = var1.a(var2);
      ik var4 = new ik();
      var4.a("Data", (um)var3);

      try {
         File var5 = new File(this.b, "level.dat_new");
         File var6 = new File(this.b, "level.dat_old");
         File var7 = new File(this.b, "level.dat");
         vx.a(var4, (OutputStream)(new FileOutputStream(var5)));
         net.minecraft.client.web.WorldStore.changed(var7); // PATCH(1.0.0)
         if (var6.exists()) {
            var6.delete();
         }

         var7.renameTo(var6);
         if (var7.exists()) {
            var7.delete();
         }

         var5.renameTo(var7);
         if (var5.exists()) {
            var5.delete();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public void a(si var1) {
      ik var2 = var1.a();
      ik var3 = new ik();
      var3.a("Data", (um)var2);

      try {
         File var4 = new File(this.b, "level.dat_new");
         File var5 = new File(this.b, "level.dat_old");
         File var6 = new File(this.b, "level.dat");
         vx.a(var3, (OutputStream)(new FileOutputStream(var4)));
         net.minecraft.client.web.WorldStore.changed(var6); // PATCH(1.0.0)
         if (var5.exists()) {
            var5.delete();
         }

         var6.renameTo(var5);
         if (var6.exists()) {
            var6.delete();
         }

         var4.renameTo(var6);
         if (var4.exists()) {
            var4.delete();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public File a(String var1) {
      return new File(this.d, var1 + ".dat");
   }

   public String d() {
      return this.f;
   }
}
