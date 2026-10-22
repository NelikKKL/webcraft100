package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import net.minecraft.client.netshim.Socket;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class xi extends xe {
   private static int a = 0;
   private static Object b = new Object();
   private xe c;
   private jo d;
   private List e = new ArrayList();
   private int f = -1;
   private ct g;
   private ct h;
   private ct j;
   private boolean k = false;
   private boolean s = false;
   private boolean t = false;
   private boolean u = false;
   private String v = null;
   private lo w = null;

   public xi(xe var1) {
      this.c = var1;
   }

   public void s_() {
   }

   public void a() {
      this.p();
      Keyboard.enableRepeatEvents(true);
      this.o.clear();
      this.d = new jo(this);
      this.e();
   }

   private void p() {
      try {
         ik var1 = vx.a(new File(this.l.F, "servers.dat"));
         yi var2 = var1.l("servers");
         this.e.clear();

         for(int var3 = 0; var3 < var2.c(); ++var3) {
            this.e.add(lo.a((ik)var2.a(var3)));
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   private void q() {
      try {
         yi var1 = new yi();

         for(int var2 = 0; var2 < this.e.size(); ++var2) {
            var1.a((um)((lo)this.e.get(var2)).a());
         }

         ik var4 = new ik();
         var4.a("servers", (um)var1);
         vx.a(var4, new File(this.l.F, "servers.dat"));
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void e() {
      qp var1 = qp.a();
      this.o.add(this.g = new ct(7, this.m / 2 - 154, this.n - 28, 70, 20, var1.a("selectServer.edit")));
      this.o.add(this.j = new ct(2, this.m / 2 - 74, this.n - 28, 70, 20, var1.a("selectServer.delete")));
      this.o.add(this.h = new ct(1, this.m / 2 - 154, this.n - 52, 100, 20, var1.a("selectServer.select")));
      this.o.add(new ct(4, this.m / 2 - 50, this.n - 52, 100, 20, var1.a("selectServer.direct")));
      this.o.add(new ct(3, this.m / 2 + 4 + 50, this.n - 52, 100, 20, var1.a("selectServer.add")));
      this.o.add(new ct(8, this.m / 2 + 4, this.n - 28, 70, 20, var1.a("selectServer.refresh")));
      this.o.add(new ct(0, this.m / 2 + 4 + 76, this.n - 28, 75, 20, var1.a("gui.cancel")));
      boolean var2 = this.f >= 0 && this.f < this.d.a();
      this.h.g = var2;
      this.g.g = var2;
      this.j.g = var2;
   }

   public void d() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f == 2) {
            String var2 = ((lo)this.e.get(this.f)).a;
            if (var2 != null) {
               this.k = true;
               qp var3 = qp.a();
               String var4 = var3.a("selectServer.deleteQuestion");
               String var5 = "'" + var2 + "' " + var3.a("selectServer.deleteWarning");
               String var6 = var3.a("selectServer.deleteButton");
               String var7 = var3.a("gui.cancel");
               go var8 = new go(this, var4, var5, var6, var7, this.f);
               this.l.a((xe)var8);
            }
         } else if (var1.f == 1) {
            this.c(this.f);
         } else if (var1.f == 4) {
            this.u = true;
            this.l.a((xe)(new nn(this, this.w = new lo(hj.a("selectServer.defaultName"), ""))));
         } else if (var1.f == 3) {
            this.s = true;
            this.l.a((xe)(new iq(this, this.w = new lo(hj.a("selectServer.defaultName"), ""))));
         } else if (var1.f == 7) {
            this.t = true;
            lo var9 = (lo)this.e.get(this.f);
            this.l.a((xe)(new iq(this, this.w = new lo(var9.a, var9.b))));
         } else if (var1.f == 0) {
            this.l.a(this.c);
         } else if (var1.f == 8) {
            this.l.a((xe)(new xi(this.c)));
         } else {
            this.d.a(var1);
         }

      }
   }

   public void a(boolean var1, int var2) {
      if (this.k) {
         this.k = false;
         if (var1) {
            this.e.remove(var2);
            this.q();
         }

         this.l.a((xe)this);
      } else if (this.u) {
         this.u = false;
         if (var1) {
            this.a(this.w);
         } else {
            this.l.a((xe)this);
         }
      } else if (this.s) {
         this.s = false;
         if (var1) {
            this.e.add(this.w);
            this.q();
         }

         this.l.a((xe)this);
      } else if (this.t) {
         this.t = false;
         if (var1) {
            lo var3 = (lo)this.e.get(this.f);
            var3.a = this.w.a;
            var3.b = this.w.b;
            this.q();
         }

         this.l.a((xe)this);
      }

   }

   private int a(String var1, int var2) {
      try {
         return Integer.parseInt(var1.trim());
      } catch (Exception var4) {
         return var2;
      }
   }

   protected void a(char var1, int var2) {
      if (var1 == '\r') {
         this.a((ct)this.o.get(2));
      }

   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      this.v = null;
      qp var4 = qp.a();
      this.j();
      this.d.a(var1, var2, var3);
      this.a(this.q, var4.a("multiplayer.title"), this.m / 2, 20, 16777215);
      super.a(var1, var2, var3);
      if (this.v != null) {
         this.a(this.v, var1, var2);
      }

   }

   private void c(int var1) {
      this.a((lo)this.e.get(var1));
   }

   private void a(lo var1) {
      String var2 = var1.b;
      String[] var3 = var2.split(":");
      if (var2.startsWith("[")) {
         int var4 = var2.indexOf("]");
         if (var4 > 0) {
            String var5 = var2.substring(1, var4);
            String var6 = var2.substring(var4 + 1).trim();
            if (var6.startsWith(":") && var6.length() > 0) {
               var6 = var6.substring(1);
               var3 = new String[]{var5, var6};
            } else {
               var3 = new String[]{var5};
            }
         }
      }

      if (var3.length > 2) {
         var3 = new String[]{var2};
      }

      this.l.a((xe)(new ri(this.l, var3[0], var3.length > 1 ? this.a((String)var3[1], 25565) : 25565)));
   }

   private void b(lo var1) throws java.net.SocketException, java.io.IOException {
      String var2 = var1.b;
      String[] var3 = var2.split(":");
      if (var2.startsWith("[")) {
         int var4 = var2.indexOf("]");
         if (var4 > 0) {
            String var5 = var2.substring(1, var4);
            String var6 = var2.substring(var4 + 1).trim();
            if (var6.startsWith(":") && var6.length() > 0) {
               var6 = var6.substring(1);
               var3 = new String[]{var5, var6};
            } else {
               var3 = new String[]{var5};
            }
         }
      }

      if (var3.length > 2) {
         var3 = new String[]{var2};
      }

      String var30 = var3[0];
      int var31 = var3.length > 1 ? this.a((String)var3[1], 25565) : 25565;
      Socket var33 = null;
      DataInputStream var7 = null;
      DataOutputStream var8 = null;

      try {
         var33 = new Socket();
         var33.setSoTimeout(3000);
         var33.setTcpNoDelay(true);
         var33.setTrafficClass(18);
         var33.connect(new InetSocketAddress(var30, var31), 3000);
         var7 = new DataInputStream(var33.getInputStream());
         var8 = new DataOutputStream(var33.getOutputStream());
         var8.write(254);
         if (var7.read() != 255) {
            throw new IOException("Bad message");
         }

         String var9 = gt.a(var7, 64);
         char[] var10 = var9.toCharArray();

         for(int var11 = 0; var11 < var10.length; ++var11) {
            if (var10[var11] != 167 && age.a.indexOf(var10[var11]) < 0) {
               var10[var11] = '?';
            }
         }

         var9 = new String(var10);
         var3 = var9.split("§");
         var9 = var3[0];
         int var36 = -1;
         int var12 = -1;

         try {
            var36 = Integer.parseInt(var3[1]);
            var12 = Integer.parseInt(var3[2]);
         } catch (Exception var27) {
         }

         var1.d = "§7" + var9;
         if (var36 >= 0 && var12 > 0) {
            var1.c = "§7" + var36 + "§8/§7" + var12;
         } else {
            var1.c = "§8???";
         }
      } finally {
         try {
            if (var7 != null) {
               var7.close();
            }
         } catch (Throwable var26) {
         }

         try {
            if (var8 != null) {
               var8.close();
            }
         } catch (Throwable var25) {
         }

         try {
            if (var33 != null) {
               var33.close();
            }
         } catch (Throwable var24) {
         }

      }

   }

   protected void a(String var1, int var2, int var3) {
      if (var1 != null) {
         int var4 = var2 + 12;
         int var5 = var3 - 12;
         int var6 = this.q.a(var1);
         this.a(var4 - 3, var5 - 3, var4 + var6 + 3, var5 + 8 + 3, -1073741824, -1073741824);
         this.q.a(var1, var4, var5, -1);
      }
   }

   // $FF: synthetic method
   static List a(xi var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static int a(xi var0, int var1) {
      return var0.f = var1;
   }

   // $FF: synthetic method
   static int b(xi var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static ct c(xi var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static ct d(xi var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static ct e(xi var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static void b(xi var0, int var1) {
      var0.c(var1);
   }

   // $FF: synthetic method
   static Object l() {
      return b;
   }

   // $FF: synthetic method
   static int m() {
      return a;
   }

   // $FF: synthetic method
   static int n() {
      return a++;
   }

   // $FF: synthetic method
   static void a(xi var0, lo var1) throws java.net.SocketException, java.io.IOException {
      var0.b(var1);
   }

   // $FF: synthetic method
   static int o() {
      return a--;
   }

   // $FF: synthetic method
   static String a(xi var0, String var1) {
      return var0.v = var1;
   }
}
