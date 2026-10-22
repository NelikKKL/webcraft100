package net.minecraft.client;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import net.minecraft.client.netshim.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hc {
   public static final Object a = new Object();
   public static int b;
   public static int c;
   private Object g = new Object();
   private Socket h;
   private final SocketAddress i;
   private DataInputStream j;
   private DataOutputStream k;
   private boolean l = true;
   private List m = Collections.synchronizedList(new ArrayList());
   private List n = Collections.synchronizedList(new ArrayList());
   private List o = Collections.synchronizedList(new ArrayList());
   private fe p;
   private boolean q = false;
   private Thread r;
   private Thread s;
   private boolean t = false;
   private String u = "";
   private Object[] v;
   private int w = 0;
   private int x = 0;
   public static int[] d = new int[256];
   public static int[] e = new int[256];
   public int f = 0;
   private int y = 50;

   public hc(Socket var1, String var2, fe var3) {
      this.h = var1;
      this.i = var1.getRemoteSocketAddress();
      this.p = var3;

      try {
         var1.setSoTimeout(30000);
         var1.setTrafficClass(24);
      } catch (SocketException var5) {
         System.err.println(var5.getMessage());
      }

      this.j = new DataInputStream(var1.getInputStream());
      this.k = new DataOutputStream(new BufferedOutputStream(var1.getOutputStream(), 5120));
      this.s = new pa(this, var2 + " read thread");
      this.r = new agv(this, var2 + " write thread");
      this.s.start();
      this.r.start();
   }

   public void a(gt var1) {
      if (!this.q) {
         synchronized(this.g) {
            this.x += var1.a() + 1;
            if (var1.l) {
               this.o.add(var1);
            } else {
               this.n.add(var1);
            }

         }
      }
   }

   private boolean d() {
      boolean var1 = false;

      try {
         if (!this.n.isEmpty() && (this.f == 0 || System.currentTimeMillis() - ((gt)this.n.get(0)).k >= (long)this.f)) {
            gt var2;
            synchronized(this.g) {
               var2 = (gt)this.n.remove(0);
               this.x -= var2.a() + 1;
            }

            gt.a(var2, this.k);
            int[] var10000 = e;
            int var10001 = var2.b();
            var10000[var10001] += var2.a() + 1;
            var1 = true;
         }

         if (this.y-- <= 0 && !this.o.isEmpty() && (this.f == 0 || System.currentTimeMillis() - ((gt)this.o.get(0)).k >= (long)this.f)) {
            gt var9;
            synchronized(this.g) {
               var9 = (gt)this.o.remove(0);
               this.x -= var9.a() + 1;
            }

            gt.a(var9, this.k);
            int[] var10 = e;
            int var11 = var9.b();
            var10[var11] += var9.a() + 1;
            this.y = 0;
            var1 = true;
         }

         return var1;
      } catch (Exception var8) {
         if (!this.t) {
            this.a(var8);
         }

         return false;
      }
   }

   public void a() {
      this.s.interrupt();
      this.r.interrupt();
   }

   private boolean e() {
      boolean var1 = false;

      try {
         gt var2 = gt.a(this.j, this.p.a());
         if (var2 != null) {
            int[] var10000 = d;
            int var10001 = var2.b();
            var10000[var10001] += var2.a() + 1;
            this.m.add(var2);
            var1 = true;
         } else {
            this.a("disconnect.endOfStream");
         }

         return var1;
      } catch (Exception var3) {
         if (!this.t) {
            this.a(var3);
         }

         return false;
      }
   }

   private void a(Exception var1) {
      var1.printStackTrace();
      this.a("disconnect.genericReason", "Internal exception: " + var1.toString());
   }

   public void a(String var1, Object... var2) {
      if (this.l) {
         this.t = true;
         this.u = var1;
         this.v = var2;
         (new acx(this)).start();
         this.l = false;

         try {
            this.j.close();
            this.j = null;
         } catch (Throwable var6) {
         }

         try {
            this.k.close();
            this.k = null;
         } catch (Throwable var5) {
         }

         try {
            this.h.close();
            this.h = null;
         } catch (Throwable var4) {
         }

      }
   }

   public void b() {
      if (this.x > 1048576) {
         this.a("disconnect.overflow");
      }

      if (this.m.isEmpty()) {
         if (this.w++ == 1200) {
            this.a("disconnect.timeout");
         }
      } else {
         this.w = 0;
      }

      int var1 = 1000;

      while(!this.m.isEmpty() && var1-- >= 0) {
         gt var2 = (gt)this.m.remove(0);
         var2.a(this.p);
      }

      this.a();
      if (this.t && this.m.isEmpty()) {
         this.p.a(this.u, this.v);
      }

   }

   public void c() {
      this.a();
      this.q = true;
      this.s.interrupt();
      (new po(this)).start();
   }

   // $FF: synthetic method
   static boolean a(hc var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static boolean b(hc var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static boolean c(hc var0) {
      return var0.e();
   }

   // $FF: synthetic method
   static boolean d(hc var0) {
      return var0.d();
   }

   // $FF: synthetic method
   static DataOutputStream e(hc var0) {
      return var0.k;
   }

   // $FF: synthetic method
   static boolean f(hc var0) {
      return var0.t;
   }

   // $FF: synthetic method
   static void a(hc var0, Exception var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static Thread g(hc var0) {
      return var0.s;
   }

   // $FF: synthetic method
   static Thread h(hc var0) {
      return var0.r;
   }
}
