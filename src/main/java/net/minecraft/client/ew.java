package net.minecraft.client;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ew {
   private nh a;
   private Map b = new HashMap();
   private List c = new ArrayList();
   private Map d = new HashMap();

   public ew(nh var1) {
      this.a = var1;
      this.b();
   }

   public afz a(Class var1, String var2) {
      afz var3 = (afz)this.b.get(var2);
      if (var3 != null) {
         return var3;
      } else {
         if (this.a != null) {
            try {
               File var4 = this.a.a(var2);
               if (var4 != null && var4.exists()) {
                  try {
                     var3 = (afz)var1.getConstructor(String.class).newInstance(var2);
                  } catch (Exception var7) {
                     throw new RuntimeException("Failed to instantiate " + var1.toString(), var7);
                  }

                  FileInputStream var5 = new FileInputStream(var4);
                  ik var6 = vx.a((InputStream)var5);
                  var5.close();
                  var3.a(var6.k("data"));
               }
            } catch (Exception var8) {
               var8.printStackTrace();
            }
         }

         if (var3 != null) {
            this.b.put(var2, var3);
            this.c.add(var3);
         }

         return var3;
      }
   }

   public void a(String var1, afz var2) {
      if (var2 == null) {
         throw new RuntimeException("Can't set null data");
      } else {
         if (this.b.containsKey(var1)) {
            this.c.remove(this.b.remove(var1));
         }

         this.b.put(var1, var2);
         this.c.add(var2);
      }
   }

   public void a() {
      for(int var1 = 0; var1 < this.c.size(); ++var1) {
         afz var2 = (afz)this.c.get(var1);
         if (var2.b()) {
            this.a(var2);
            var2.a(false);
         }
      }

   }

   private void a(afz var1) {
      if (this.a != null) {
         try {
            File var2 = this.a.a(var1.i);
            if (var2 != null) {
               ik var3 = new ik();
               var1.b(var3);
               ik var4 = new ik();
               var4.a("data", var3);
               FileOutputStream var5 = new FileOutputStream(var2);
               vx.a(var4, (OutputStream)var5);
               var5.close();
               net.minecraft.client.web.WorldStore.changed(var2); // PATCH(1.0.0)
            }
         } catch (Exception var6) {
            var6.printStackTrace();
         }

      }
   }

   private void b() {
      try {
         this.d.clear();
         if (this.a == null) {
            return;
         }

         File var1 = this.a.a("idcounts");
         if (var1 != null && var1.exists()) {
            DataInputStream var2 = new DataInputStream(new FileInputStream(var1));
            ik var3 = vx.a((DataInput)var2);
            var2.close();

            for(um var5 : (Iterable<um>)(Iterable)(var3.c())) {
               if (var5 instanceof cg) {
                  cg var6 = (cg)var5;
                  String var7 = var6.d();
                  short var8 = var6.a;
                  this.d.put(var7, var8);
               }
            }
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public int a(String var1) {
      Short var2 = (Short)this.d.get(var1);
      if (var2 == null) {
         var2 = 0;
      } else {
         var2 = (short)(var2 + 1);
      }

      this.d.put(var1, var2);
      if (this.a == null) {
         return var2;
      } else {
         try {
            File var3 = this.a.a("idcounts");
            if (var3 != null) {
               ik var4 = new ik();

               for(String var6 : (Iterable<String>)(Iterable)(this.d.keySet())) {
                  short var7 = (Short)this.d.get(var6);
                  var4.a(var6, var7);
               }

               DataOutputStream var10 = new DataOutputStream(new FileOutputStream(var3));
               vx.a(var4, (DataOutput)var10);
               var10.close();
               net.minecraft.client.web.WorldStore.changed(var3); // PATCH(1.0.0)
            }
         } catch (Exception var8) {
            var8.printStackTrace();
         }

         return var2;
      }
   }
}
