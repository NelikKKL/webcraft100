package net.minecraft.client;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class adg extends w {
   public adg(File var1) {
      super(var1);
   }

   public String a() {
      return "Scaevolus' McRegion";
   }

   public List b() {
      ArrayList var1 = new ArrayList();
      File[] var2 = this.a.listFiles();

      for(File var6 : var2) {
         if (var6.isDirectory()) {
            String var7 = var6.getName();
            si var8 = this.a(var7);
            if (var8 != null) {
               boolean var9 = var8.k() != 19132;
               String var10 = var8.j();
               if (var10 == null || me.a(var10)) {
                  var10 = var7;
               }

               long var11 = 0L;
               var1.add(new rr(var7, var10, var8.l(), var11, var8.q(), var9, var8.s()));
            }
         }
      }

      return var1;
   }

   public void c() {
      wl.a();
   }

   public nh a(String var1, boolean var2) {
      return new ar(this.a, var1, var2);
   }

   public boolean c(String var1) {
      si var2 = this.a(var1);
      return var2 != null && var2.k() == 0;
   }

   public boolean a(String var1, rz var2) {
      var2.a(0);
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      ArrayList var6 = new ArrayList();
      ArrayList var7 = new ArrayList();
      ArrayList var8 = new ArrayList();
      File var9 = new File(this.a, var1);
      File var10 = new File(var9, "DIM-1");
      File var11 = new File(var9, "DIM1");
      System.out.println("Scanning folders...");
      this.a(var9, var3, var4);
      if (var10.exists()) {
         this.a(var10, var5, var6);
      }

      if (var11.exists()) {
         this.a(var11, var7, var8);
      }

      int var12 = var3.size() + var5.size() + var7.size() + var4.size() + var6.size() + var8.size();
      System.out.println("Total conversion count is " + var12);
      this.a(var9, var3, 0, var12, var2);
      this.a(var10, var5, var3.size(), var12, var2);
      this.a(var11, var7, var3.size() + var5.size(), var12, var2);
      si var13 = this.a(var1);
      var13.d(19132);
      nh var14 = this.a(var1, false);
      var14.a(var13);
      this.a(var4, var3.size() + var5.size(), var12, var2);
      if (var10.exists()) {
         this.a(var6, var3.size() + var5.size() + var4.size(), var12, var2);
      }

      return true;
   }

   private void a(File var1, ArrayList var2, ArrayList var3) {
      agj var4 = new agj((te)null);
      rm var5 = new rm((te)null);
      File[] var6 = var1.listFiles(var4);

      for(File var10 : var6) {
         var3.add(var10);
         File[] var11 = var10.listFiles(var4);

         for(File var15 : var11) {
            File[] var16 = var15.listFiles(var5);

            for(File var20 : var16) {
               var2.add(new ck(var20));
            }
         }
      }

   }

   private void a(File var1, ArrayList var2, int var3, int var4, rz var5) {
      Collections.sort(var2);
      byte[] var6 = new byte[4096];

      for(ck var8 : (Iterable<ck>)(Iterable)(var2)) {
         int var9 = var8.b();
         int var10 = var8.c();
         as var11 = wl.a(var1, var9, var10);
         if (!var11.c(var9 & 31, var10 & 31)) {
            try {
               DataInputStream var12 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new FileInputStream(var8.a()))));
               DataOutputStream var13 = var11.b(var9 & 31, var10 & 31);
               int var14 = 0;

               while((var14 = var12.read(var6)) != -1) {
                  var13.write(var6, 0, var14);
               }

               var13.close();
               var12.close();
            } catch (IOException var15) {
               var15.printStackTrace();
            }
         }

         ++var3;
         int var16 = (int)net.minecraft.client.web.JMath.round((double)100.0F * (double)var3 / (double)var4);
         var5.a(var16);
      }

      wl.a();
   }

   private void a(ArrayList var1, int var2, int var3, rz var4) {
      for(File var6 : (Iterable<File>)(Iterable)(var1)) {
         File[] var7 = var6.listFiles();
         a(var7);
         var6.delete();
         ++var2;
         int var8 = (int)net.minecraft.client.web.JMath.round((double)100.0F * (double)var2 / (double)var3);
         var4.a(var8);
      }

   }
}
