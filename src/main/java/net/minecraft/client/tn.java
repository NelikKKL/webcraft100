package net.minecraft.client;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tn implements d, pz {
   private List a = new ArrayList();
   private Set b = new HashSet();
   private Object c = new Object();
   private final File d;

   public tn(File var1) {
      this.d = var1;
   }

   public zx a(ry var1, int var2, int var3) throws java.io.IOException {
      ik var4 = null;
      acm var5 = new acm(var2, var3);
      synchronized(this.c) {
         if (this.b.contains(var5)) {
            for(int var7 = 0; var7 < this.a.size(); ++var7) {
               if (((vp)this.a.get(var7)).a.equals(var5)) {
                  var4 = ((vp)this.a.get(var7)).b;
                  break;
               }
            }
         }
      }

      if (var4 == null) {
         DataInputStream var6 = wl.b(this.d, var2, var3);
         if (var6 == null) {
            return null;
         }

         var4 = vx.a((DataInput)var6);
      }

      if (!var4.b("Level")) {
         System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
         return null;
      } else if (!var4.k("Level").b("Blocks")) {
         System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
         return null;
      } else {
         zx var10 = gy.a(var1, var4.k("Level"));
         if (!var10.a(var2, var3)) {
            System.out.println("Chunk file at " + var2 + "," + var3 + " is in the wrong location; relocating. (Expected " + var2 + ", " + var3 + ", got " + var10.l + ", " + var10.m + ")");
            var4.a("xPos", var2);
            var4.a("zPos", var3);
            var10 = gy.a(var1, var4.k("Level"));
         }

         var10.i();
         return var10;
      }
   }

   public void a(ry var1, zx var2) {
      var1.s();

      try {
         ik var3 = new ik();
         ik var4 = new ik();
         var3.a("Level", (um)var4);
         gy.a(var2, var1, var4);
         this.a(var2.k(), var3);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   private void a(acm var1, ik var2) {
      synchronized(this.c) {
         if (this.b.contains(var1)) {
            for(int var4 = 0; var4 < this.a.size(); ++var4) {
               if (((vp)this.a.get(var4)).a.equals(var1)) {
                  this.a.set(var4, new vp(var1, var2));
                  return;
               }
            }
         }

         this.a.add(new vp(var1, var2));
         this.b.add(var1);
         ll.a.a(this);
      }
   }

   public boolean c() {
      vp var1 = null;
      synchronized(this.c) {
         if (this.a.size() <= 0) {
            return false;
         }

         var1 = (vp)this.a.remove(0);
         this.b.remove(var1.a);
      }

      if (var1 != null) {
         try {
            this.a(var1);
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      return true;
   }

   public void a(vp var1) throws java.io.IOException {
      DataOutputStream var2 = wl.c(this.d, var1.a.a, var1.a.b);
      vx.a(var1.b, (DataOutput)var2);
      var2.close();
   }

   public void b(ry var1, zx var2) {
   }

   public void a() {
   }

   public void b() {
   }
}
