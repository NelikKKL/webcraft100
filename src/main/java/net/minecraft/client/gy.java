package net.minecraft.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class gy implements d {
   private File a;
   private boolean b;

   public gy(File var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   private File a(int var1, int var2) {
      String var3 = "c." + Integer.toString(var1, 36) + "." + Integer.toString(var2, 36) + ".dat";
      String var4 = Integer.toString(var1 & 63, 36);
      String var5 = Integer.toString(var2 & 63, 36);
      File var6 = new File(this.a, var4);
      if (!var6.exists()) {
         if (!this.b) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var5);
      if (!var6.exists()) {
         if (!this.b) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var3);
      return !var6.exists() && !this.b ? null : var6;
   }

   public zx a(ry var1, int var2, int var3) {
      File var4 = this.a(var2, var3);
      if (var4 != null && var4.exists()) {
         try {
            FileInputStream var5 = new FileInputStream(var4);
            ik var6 = vx.a((InputStream)var5);
            if (!var6.b("Level")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
               return null;
            }

            if (!var6.k("Level").b("Blocks")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
               return null;
            }

            zx var7 = a(var1, var6.k("Level"));
            if (!var7.a(var2, var3)) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is in the wrong location; relocating. (Expected " + var2 + ", " + var3 + ", got " + var7.l + ", " + var7.m + ")");
               var6.a("xPos", var2);
               var6.a("zPos", var3);
               var7 = a(var1, var6.k("Level"));
            }

            var7.i();
            return var7;
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      return null;
   }

   public void a(ry var1, zx var2) {
      var1.s();
      File var3 = this.a(var2.l, var2.m);
      if (var3.exists()) {
         si var4 = var1.z();
         var4.b(var4.g() - var3.length());
      }

      try {
         File var10 = new File(this.a, "tmp_chunk.dat");
         FileOutputStream var5 = new FileOutputStream(var10);
         ik var6 = new ik();
         ik var7 = new ik();
         var6.a("Level", (um)var7);
         a(var2, var1, var7);
         vx.a(var6, (OutputStream)var5);
         var5.close();
         if (var3.exists()) {
            var3.delete();
         }

         var10.renameTo(var3);
         net.minecraft.client.web.WorldStore.changed(var3); // PATCH(1.0.0)
         si var8 = var1.z();
         var8.b(var8.g() + var3.length());
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public static void a(zx var0, ry var1, ik var2) {
      var1.s();
      var2.a("xPos", var0.l);
      var2.a("zPos", var0.m);
      var2.a("LastUpdate", var1.u());
      var2.a("Blocks", var0.b);
      var2.a("Data", var0.g.a);
      var2.a("SkyLight", var0.h.a);
      var2.a("BlockLight", var0.i.a);
      var2.a("HeightMap", var0.j);
      var2.a("TerrainPopulated", var0.p);
      var0.s = false;
      yi var3 = new yi();

      for(int var4 = 0; var4 < var0.o.length; ++var4) {
         for(ia var6 : (Iterable<ia>)(Iterable)(var0.o[var4])) {
            var0.s = true;
            ik var7 = new ik();
            if (var6.c(var7)) {
               var3.a((um)var7);
            }
         }
      }

      var2.a("Entities", (um)var3);
      yi var12 = new yi();

      for(bq var15 : (Iterable<bq>)(Iterable)(var0.n.values())) {
         ik var17 = new ik();
         var15.a(var17);
         var12.a((um)var17);
      }

      var2.a("TileEntities", (um)var12);
      List var14 = var1.a(var0, false);
      if (var14 != null) {
         long var16 = var1.u();
         yi var8 = new yi();

         for(ahn var10 : (Iterable<ahn>)(Iterable)(var14)) {
            ik var11 = new ik();
            var11.a("i", var10.d);
            var11.a("x", var10.a);
            var11.a("y", var10.b);
            var11.a("z", var10.c);
            var11.a("t", (int)(var10.e - var16));
            var8.a((um)var11);
         }

         var2.a("TileTicks", (um)var8);
      }

   }

   public static zx a(ry var0, ik var1) {
      int var2 = var1.e("xPos");
      int var3 = var1.e("zPos");
      zx var4 = new zx(var0, var2, var3);
      var4.b = var1.j("Blocks");
      var4.g = new up(var1.j("Data"), var0.a);
      var4.h = new up(var1.j("SkyLight"), var0.a);
      var4.i = new up(var1.j("BlockLight"), var0.a);
      var4.j = var1.j("HeightMap");
      var4.p = var1.m("TerrainPopulated");
      if (!var4.g.a()) {
         var4.g = new up(var4.b.length, var0.a);
      }

      if (var4.j == null || !var4.h.a()) {
         var4.j = new byte[256];
         var4.h = new up(var4.b.length, var0.a);
         var4.c();
      }

      if (!var4.i.a()) {
         var4.i = new up(var4.b.length, var0.a);
         var4.a();
      }

      yi var5 = var1.l("Entities");
      if (var5 != null) {
         for(int var6 = 0; var6 < var5.c(); ++var6) {
            ik var7 = (ik)var5.a(var6);
            ia var8 = afw.a(var7, var0);
            var4.s = true;
            if (var8 != null) {
               var4.a(var8);
            }
         }
      }

      yi var10 = var1.l("TileEntities");
      if (var10 != null) {
         for(int var11 = 0; var11 < var10.c(); ++var11) {
            ik var13 = (ik)var10.a(var11);
            bq var9 = bq.c(var13);
            if (var9 != null) {
               var4.a(var9);
            }
         }
      }

      if (var1.b("TileTicks")) {
         yi var12 = var1.l("TileTicks");
         if (var12 != null) {
            for(int var14 = 0; var14 < var12.c(); ++var14) {
               ik var15 = (ik)var12.a(var14);
               var0.e(var15.e("x"), var15.e("y"), var15.e("z"), var15.e("i"), var15.e("t"));
            }
         }
      }

      return var4;
   }

   public void a() {
   }

   public void b() {
   }

   public void b(ry var1, zx var2) {
   }
}
