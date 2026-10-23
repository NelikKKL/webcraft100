package net.minecraft.client;

import net.minecraft.client.awtshim.Canvas;
import net.minecraft.client.awtshim.Color;
import net.minecraft.client.awtshim.Component;
import net.minecraft.client.awtshim.Graphics;
import java.io.File;
import java.text.DecimalFormat;
import java.util.List;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public abstract class Minecraft implements Runnable {
   public static byte[] b = new byte[10485760];
   private static Minecraft a;
   public aes c;
   private boolean U = false;
   private boolean V = false;
   public int d;
   public int e;
   private mm W;
   private aij X = new aij(20.0F);
   public ry f;
   public afv g;
   public di h;
   public nq i;
   public f j;
   public dr k = null;
   public String l;
   public Canvas m;
   public boolean n = false;
   public volatile boolean o = false;
   public zh p;
   public abe q;
   public abe r;
   public xe s = null;
   public xw t;
   public adt u;
   private ng Y;
   private int Z = 0;
   private int aa = 0;
   private int ab;
   private int ac;
   public lk v = new lk(this);
   public qd w;
   public boolean x = false;
   public fa y = new fa(0.0F);
   public gv z = null;
   public ki A;
   protected MinecraftApplet B;
   public ahm C = new ahm();
   public hs D;
   public adk E;
   public File F;
   private tq ad;
   public static long[] G = new long[512];
   public static long[] H = new long[512];
   public static int I = 0;
   public static long J = 0L;
   private int ae = 0;
   public tk K;
   private String af;
   private int ag;
   private gk ah = new gk();
   private yu ai = new yu();
   private static File aj = null;
   public volatile boolean L = true;
   public String M = "";
   long N = System.currentTimeMillis();
   int O = 0;
   boolean P = false;
   long Q = -1L;
   private String ak = "root";
   public boolean R = false;
   public boolean S = false;
   long T = System.currentTimeMillis();
   private int al = 0;

   public Minecraft(Component var1, Canvas var2, MinecraftApplet var3, int var4, int var5, boolean var6) {
      ny.a();
      this.ac = var5;
      this.U = var6;
      this.B = var3;
      new yk(this, "Timer hack thread");
      this.m = var2;
      this.d = var4;
      this.e = var5;
      this.U = var6;
      if (var3 == null || "true".equals(var3.getParameter("stand-alone"))) {
         this.n = false;
      }

      a = this;
   }

   public void b(oq var1) {
      this.V = true;
      this.a(var1);
   }

   public abstract void a(oq var1);

   public void a(String var1, int var2) {
      this.af = var1;
      this.ag = var2;
   }

   public void a() throws LWJGLException {
      if (this.m != null) {
         Graphics var1 = this.m.getGraphics();
         if (var1 != null) {
            var1.setColor(Color.BLACK);
            var1.fillRect(0, 0, this.d, this.e);
            var1.dispose();
         }

         Display.setParent(this.m);
      } else if (this.U) {
         Display.setFullscreen(true);
         this.d = Display.getDisplayMode().getWidth();
         this.e = Display.getDisplayMode().getHeight();
         if (this.d <= 0) {
            this.d = 1;
         }

         if (this.e <= 0) {
            this.e = 1;
         }
      } else {
         Display.setDisplayMode(new DisplayMode(this.d, this.e));
      }

      Display.setTitle("Minecraft Minecraft 1.0.0");

      try {
         PixelFormat var7 = new PixelFormat();
         var7 = var7.withDepthBits(24);
         Display.create(var7);
      } catch (LWJGLException var6) {
         var6.printStackTrace();

         try {
            net.minecraft.client.web.Threads.sleep(1000L);
         } catch (InterruptedException var5) {
         }

         Display.create();
      }

      adx.a();
      this.F = b();
      this.ad = new adg(new File(this.F, "saves"));
      this.A = new ki(this, this.F);
      this.E = new adk(this, this.F);
      this.p = new zh(this.E, this.A);
      this.v();
      this.q = new abe(this.A, "/font/default.png", this.p);
      this.r = new abe(this.A, "/font/alternate.png", this.p);
      ya.a(this.p.a("/misc/watercolor.png"));
      ha.a(this.p.a("/misc/grasscolor.png"));
      db.a(this.p.a("/misc/foliagecolor.png"));
      this.u = new adt(this);
      wb.a.f = new n(this);
      this.K = new tk(this.k, this.F);
      ut.f.a(new qb(this));
      this.v();
      Keyboard.create();
      Mouse.create();
      this.D = new hs(this.m);

      try {
         Controllers.create();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      this.d("Pre startup");
      GL11.glEnable(3553);
      GL11.glShadeModel(7425);
      GL11.glClearDepth((double)1.0F);
      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glCullFace(1029);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      this.d("Startup");
      this.W = new mm();
      this.C.a(this.A);
      this.p.a((dt)this.ai);
      this.p.a((dt)this.ah);
      this.p.a((dt)(new vr()));
      this.p.a((dt)(new aih(this)));
      this.p.a((dt)(new at(this)));
      this.p.a((dt)(new va()));
      this.p.a((dt)(new ss()));
      this.p.a((dt)(new agp(0)));
      this.p.a((dt)(new agp(1)));
      this.g = new afv(this, this.p);
      GL11.glViewport(0, 0, this.d, this.e);
      this.j = new f(this.f, this.p);

      try {
         this.Y = new ng(this.F, this);
         this.Y.start();
      } catch (Exception var3) {
      }

      this.d("Post startup");
      this.w = new qd(this);
      if (this.af != null) {
         this.a((xe)(new ri(this, this.af, this.ag)));
      } else {
         this.a((xe)(new eh()));
      }

      this.t = new xw(this);
   }

   private void v() {
      ef var1 = new ef(this.A, this.d, this.e);
      GL11.glClear(16640);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho((double)0.0F, var1.a, var1.b, (double)0.0F, (double)1000.0F, (double)3000.0F);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glViewport(0, 0, this.d, this.e);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      cv var2 = cv.a;
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glDisable(2912);
      GL11.glBindTexture(3553, this.p.b("/title/mojang.png"));
      var2.b();
      var2.c(16777215);
      var2.a((double)0.0F, (double)this.e, (double)0.0F, (double)0.0F, (double)0.0F);
      var2.a((double)this.d, (double)this.e, (double)0.0F, (double)0.0F, (double)0.0F);
      var2.a((double)this.d, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F);
      var2.a((double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F);
      var2.a();
      short var3 = 256;
      short var4 = 256;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var2.c(16777215);
      this.a((var1.a() - var3) / 2, (var1.b() - var4) / 2, 0, 0, var3, var4);
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      Display.swapBuffers();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      cv var9 = cv.a;
      var9.b();
      var9.a((double)(var1 + 0), (double)(var2 + var6), (double)0.0F, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + var6), (double)0.0F, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + 0), (double)0.0F, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.a((double)(var1 + 0), (double)(var2 + 0), (double)0.0F, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.a();
   }

   public static File b() {
      if (aj == null) {
         aj = a("minecraft");
      }

      return aj;
   }

   public static File a(String var0) {
      // PATCH(1.0.0): метод не декомпилировался; в браузере это виртуальная ФС TeaVM
      File var1 = new File(System.getProperty("user.home", "."), "." + var0 + "/");
      if (!var1.exists() && !var1.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + var1);
      }

      return var1;
   }

   private static qe w() {
      String var0 = System.getProperty("os.name").toLowerCase();
      if (var0.contains("win")) {
         return qe.c;
      } else if (var0.contains("mac")) {
         return qe.d;
      } else if (var0.contains("solaris")) {
         return qe.b;
      } else if (var0.contains("sunos")) {
         return qe.b;
      } else if (var0.contains("linux")) {
         return qe.a;
      } else {
         return var0.contains("unix") ? qe.a : qe.e;
      }
   }

   public tq c() {
      return this.ad;
   }

   public void a(xe var1) {
      if (!(this.s instanceof aff)) {
         if (this.s != null) {
            this.s.d();
         }

         if (var1 instanceof eh) {
            this.K.b();
         }

         this.K.c();
         if (var1 == null && this.f == null) {
            var1 = new eh();
         } else if (var1 == null && this.h.ag() <= 0) {
            var1 = new j();
         }

         if (var1 instanceof eh) {
            this.A.F = false;
            this.w.b();
         }

         this.s = (xe)var1;
         if (var1 != null) {
            this.h();
            ef var2 = new ef(this.A, this.d, this.e);
            int var3 = var2.a();
            int var4 = var2.b();
            ((xe)var1).a(this, var3, var4);
            this.x = false;
         } else {
            this.g();
         }

      }
   }

   private void d(String var1) {
      int var2 = GL11.glGetError();
      if (var2 != 0) {
         String var3 = GLU.gluErrorString(var2);
         System.out.println("########## GL ERROR ##########");
         System.out.println("@ " + var1);
         System.out.println(var2 + ": " + var3);
      }

   }

   public void d() {
      try {
         this.K.b();
         this.K.c();
         if (this.B != null) {
            this.B.c();
         }

         try {
            if (this.Y != null) {
               this.Y.b();
            }
         } catch (Exception var9) {
         }

         System.out.println("Stopping!");

         try {
            this.a((ry)null);
         } catch (Throwable var8) {
         }

         try {
            bt.a();
         } catch (Throwable var7) {
         }

         this.C.b();
         Mouse.destroy();
         Keyboard.destroy();
      } finally {
         Display.destroy();
         if (!this.V) {
            System.exit(0);
         }

      }

      System.gc();
   }

   public void run() {
      this.L = true;

      try {
         this.a();
      } catch (Exception var11) {
         var11.printStackTrace();
         this.b(new oq("Failed to start game", var11));
         return;
      }

      try {
         while(this.L) {
            try {
               this.x();
            } catch (adl var9) {
               this.f = null;
               this.a((ry)null);
               this.a((xe)(new ach()));
            } catch (OutOfMemoryError var10) {
               this.e();
               this.a((xe)(new ov()));
               System.gc();
            }
         }
      } catch (adj var12) {
      } catch (Throwable var13) {
         this.e();
         var13.printStackTrace();
         this.b(new oq("Unexpected error", var13));
      } finally {
         this.d();
      }

   }

   public void x() { // PATCH(1.0.0): был private — вызывается из WebMinecraft.runOneFrame()
      if (this.B != null && !this.B.isActive()) {
         this.L = false;
      } else {
         net.minecraft.client.c.b();
         fb.b();
         pf.a("root");
         if (this.m == null && Display.isCloseRequested()) {
            this.f();
         }

         if (this.o && this.f != null) {
            float var1 = this.X.c;
            this.X.a();
            this.X.c = var1;
         } else {
            this.X.a();
         }

         long var6 = System.nanoTime();
         pf.a("tick");

         for(int var3 = 0; var3 < this.X.b; ++var3) {
            ++this.Z;

            try {
               this.k();
            } catch (adl var5) {
               this.f = null;
               this.a((ry)null);
               this.a((xe)(new ach()));
            }
         }

         pf.b();
         long var7 = System.nanoTime() - var6;
         this.d("Pre render");
         acr.b = this.A.j;
         pf.a("sound");
         this.C.a(this.h, this.X.c);
         pf.c("updatelights");
         if (this.f != null) {
            this.f.F();
         }

         pf.b();
         pf.a("render");
         pf.a("display");
         GL11.glEnable(3553);
         if (!Keyboard.isKeyDown(65)) {
            Display.update();
         }

         if (this.h != null && this.h.L()) {
            this.A.E = 0;
         }

         pf.b();
         if (!this.x) {
            pf.a("gameMode");
            if (this.c != null) {
               this.c.a(this.X.c);
            }

            pf.c("gameRenderer");
            this.u.b(this.X.c);
            pf.b();
         }

         GL11.glFlush();
         pf.b();
         if (!Display.isActive() && this.U) {
            this.j();
         }

         pf.b();
         if (this.A.F) {
            if (!pf.a) {
               pf.a();
            }

            pf.a = true;
            this.a(var7);
         } else {
            pf.a = false;
            this.Q = System.nanoTime();
         }

         this.v.a();
         pf.a("root");
         net.minecraft.client.web.Threads.yieldNow();
         if (Keyboard.isKeyDown(65)) {
            Display.update();
         }

         this.y();
         if (this.m != null && !this.U && (this.m.getWidth() != this.d || this.m.getHeight() != this.e)) {
            this.d = this.m.getWidth();
            this.e = this.m.getHeight();
            if (this.d <= 0) {
               this.d = 1;
            }

            if (this.e <= 0) {
               this.e = 1;
            }

            this.a(this.d, this.e);
         }

         this.d("Post render");
         ++this.O;

         for(this.o = !this.l() && this.s != null && this.s.b(); System.currentTimeMillis() >= this.N + 1000L; this.O = 0) {
            this.M = this.O + " fps, " + ge.b + " chunk updates";
            ge.b = 0;
            this.N += 1000L;
         }

         pf.b();
      }
   }

   public void e() {
      try {
         b = new byte[0];
         this.g.e();
      } catch (Throwable var4) {
      }

      try {
         System.gc();
         net.minecraft.client.c.a();
         fb.a();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         this.a((ry)null);
      } catch (Throwable var2) {
      }

      System.gc();
   }

   private void y() {
      if (Keyboard.isKeyDown(60)) {
         if (!this.P) {
            this.P = true;
            this.w.a(abx.a(aj, this.d, this.e));
         }
      } else {
         this.P = false;
      }

   }

   private void b(int var1) {
      List var2 = pf.b(this.ak);
      if (var2 != null && var2.size() != 0) {
         afx var3 = (afx)var2.remove(0);
         if (var1 == 0) {
            if (var3.c.length() > 0) {
               int var4 = this.ak.lastIndexOf(".");
               if (var4 >= 0) {
                  this.ak = this.ak.substring(0, var4);
               }
            }
         } else {
            --var1;
            if (var1 < var2.size() && !((afx)var2.get(var1)).c.equals("unspecified")) {
               if (this.ak.length() > 0) {
                  this.ak = this.ak + ".";
               }

               this.ak = this.ak + ((afx)var2.get(var1)).c;
            }
         }

      }
   }

   private void a(long var1) {
      List var3 = pf.b(this.ak);
      afx var4 = (afx)var3.remove(0);
      long var5 = 16666666L;
      if (this.Q == -1L) {
         this.Q = System.nanoTime();
      }

      long var7 = System.nanoTime();
      H[I & G.length - 1] = var1;
      G[I++ & G.length - 1] = var7 - this.Q;
      this.Q = var7;
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glEnable(2903);
      GL11.glLoadIdentity();
      GL11.glOrtho((double)0.0F, (double)this.d, (double)this.e, (double)0.0F, (double)1000.0F, (double)3000.0F);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      cv var9 = cv.a;
      var9.a(7);
      int var10 = (int)(var5 / 200000L);
      var9.c(536870912);
      var9.a((double)0.0F, (double)(this.e - var10), (double)0.0F);
      var9.a((double)0.0F, (double)this.e, (double)0.0F);
      var9.a((double)G.length, (double)this.e, (double)0.0F);
      var9.a((double)G.length, (double)(this.e - var10), (double)0.0F);
      var9.c(538968064);
      var9.a((double)0.0F, (double)(this.e - var10 * 2), (double)0.0F);
      var9.a((double)0.0F, (double)(this.e - var10), (double)0.0F);
      var9.a((double)G.length, (double)(this.e - var10), (double)0.0F);
      var9.a((double)G.length, (double)(this.e - var10 * 2), (double)0.0F);
      var9.a();
      long var11 = 0L;

      for(int var13 = 0; var13 < G.length; ++var13) {
         var11 += G[var13];
      }

      int var26 = (int)(var11 / 200000L / (long)G.length);
      var9.a(7);
      var9.c(541065216);
      var9.a((double)0.0F, (double)(this.e - var26), (double)0.0F);
      var9.a((double)0.0F, (double)this.e, (double)0.0F);
      var9.a((double)G.length, (double)this.e, (double)0.0F);
      var9.a((double)G.length, (double)(this.e - var26), (double)0.0F);
      var9.a();
      var9.a(1);

      for(int var14 = 0; var14 < G.length; ++var14) {
         int var15 = (var14 - I & G.length - 1) * 255 / G.length;
         int var16 = var15 * var15 / 255;
         var16 = var16 * var16 / 255;
         int var17 = var16 * var16 / 255;
         var17 = var17 * var17 / 255;
         if (G[var14] > var5) {
            var9.c(-16777216 + var16 * 65536);
         } else {
            var9.c(-16777216 + var16 * 256);
         }

         long var18 = G[var14] / 200000L;
         long var20 = H[var14] / 200000L;
         var9.a((double)((float)var14 + 0.5F), (double)((float)((long)this.e - var18) + 0.5F), (double)0.0F);
         var9.a((double)((float)var14 + 0.5F), (double)((float)this.e + 0.5F), (double)0.0F);
         var9.c(-16777216 + var16 * 65536 + var16 * 256 + var16 * 1);
         var9.a((double)((float)var14 + 0.5F), (double)((float)((long)this.e - var18) + 0.5F), (double)0.0F);
         var9.a((double)((float)var14 + 0.5F), (double)((float)((long)this.e - (var18 - var20)) + 0.5F), (double)0.0F);
      }

      var9.a();
      short var27 = 160;
      int var28 = this.d - var27 - 10;
      int var30 = this.e - var27 * 2;
      GL11.glEnable(3042);
      var9.b();
      var9.a(0, 200);
      var9.a((double)((float)var28 - (float)var27 * 1.1F), (double)((float)var30 - (float)var27 * 0.6F - 16.0F), (double)0.0F);
      var9.a((double)((float)var28 - (float)var27 * 1.1F), (double)(var30 + var27 * 2), (double)0.0F);
      var9.a((double)((float)var28 + (float)var27 * 1.1F), (double)(var30 + var27 * 2), (double)0.0F);
      var9.a((double)((float)var28 + (float)var27 * 1.1F), (double)((float)var30 - (float)var27 * 0.6F - 16.0F), (double)0.0F);
      var9.a();
      GL11.glDisable(3042);
      double var32 = (double)0.0F;

      for(int var19 = 0; var19 < var3.size(); ++var19) {
         afx var34 = (afx)var3.get(var19);
         int var21 = me.c(var34.a / (double)4.0F) + 1;
         var9.a(6);
         var9.c(var34.a());
         var9.a((double)var28, (double)var30, (double)0.0F);

         for(int var22 = var21; var22 >= 0; --var22) {
            float var23 = (float)((var32 + var34.a * (double)var22 / (double)var21) * (double)(float)Math.PI * (double)2.0F / (double)100.0F);
            float var24 = me.a(var23) * (float)var27;
            float var25 = me.b(var23) * (float)var27 * 0.5F;
            var9.a((double)((float)var28 + var24), (double)((float)var30 - var25), (double)0.0F);
         }

         var9.a();
         var9.a(5);
         var9.c((var34.a() & 16711422) >> 1);

         for(int var41 = var21; var41 >= 0; --var41) {
            float var47 = (float)((var32 + var34.a * (double)var41 / (double)var21) * (double)(float)Math.PI * (double)2.0F / (double)100.0F);
            float var48 = me.a(var47) * (float)var27;
            float var49 = me.b(var47) * (float)var27 * 0.5F;
            var9.a((double)((float)var28 + var48), (double)((float)var30 - var49), (double)0.0F);
            var9.a((double)((float)var28 + var48), (double)((float)var30 - var49 + 10.0F), (double)0.0F);
         }

         var9.a();
         var32 += var34.a;
      }

      DecimalFormat var33 = new DecimalFormat("##0.00");
      GL11.glEnable(3553);
      String var35 = "";
      if (!var4.c.equals("unspecified")) {
         var35 = var35 + "[0] ";
      }

      if (var4.c.length() == 0) {
         var35 = var35 + "ROOT ";
      } else {
         var35 = var35 + var4.c + " ";
      }

      int var39 = 16777215;
      this.q.a(var35, var28 - var27, var30 - var27 / 2 - 16, var39);
      this.q.a(var35 = var33.format(var4.b) + "%", var28 + var27 - this.q.a(var35), var30 - var27 / 2 - 16, var39);

      for(int var38 = 0; var38 < var3.size(); ++var38) {
         afx var40 = (afx)var3.get(var38);
         String var42 = "";
         if (!var40.c.equals("unspecified")) {
            var42 = var42 + "[" + (var38 + 1) + "] ";
         } else {
            var42 = var42 + "[?] ";
         }

         var42 = var42 + var40.c;
         this.q.a(var42, var28 - var27, var30 + var27 / 2 + var38 * 8 + 20, var40.a());
         this.q.a(var42 = var33.format(var40.a) + "%", var28 + var27 - 50 - this.q.a(var42), var30 + var27 / 2 + var38 * 8 + 20, var40.a());
         this.q.a(var42 = var33.format(var40.b) + "%", var28 + var27 - this.q.a(var42), var30 + var27 / 2 + var38 * 8 + 20, var40.a());
      }

   }

   public void f() {
      this.L = false;
   }

   public void g() {
      if (Display.isActive()) {
         if (!this.R) {
            this.R = true;
            this.D.a();
            this.a((xe)null);
            this.aa = 10000;
         }
      }
   }

   public void h() {
      if (this.R) {
         aby.a();
         this.R = false;
         this.D.b();
      }
   }

   public void i() {
      if (this.s == null) {
         this.a((xe)(new nd()));
      }
   }

   private void a(int var1, boolean var2) {
      if (!var2) {
         this.aa = 0;
      }

      if (var1 != 0 || this.aa <= 0) {
         if (var2 && this.z != null && this.z.a == bo.a && var1 == 0) {
            int var3 = this.z.b;
            int var4 = this.z.c;
            int var5 = this.z.d;
            this.c.c(var3, var4, var5, this.z.e);
            if (this.h.e(var3, var4, var5)) {
               this.j.a(var3, var4, var5, this.z.e);
               this.h.m_();
            }
         } else {
            this.c.b();
         }

      }
   }

   private void c(int var1) {
      if (var1 != 0 || this.aa <= 0) {
         if (var1 == 0) {
            this.h.m_();
         }

         if (var1 == 1) {
            this.ae = 4;
         }

         boolean var2 = true;
         dk var3 = this.h.by.a();
         if (this.z == null) {
            if (var1 == 0 && this.c.f()) {
               this.aa = 10;
            }
         } else if (this.z.a == bo.b) {
            if (var1 == 0) {
               this.c.a(this.h, this.z.g);
            }

            if (var1 == 1) {
               this.c.b(this.h, this.z.g);
            }
         } else if (this.z.a == bo.a) {
            int var4 = this.z.b;
            int var5 = this.z.c;
            int var6 = this.z.d;
            int var7 = this.z.e;
            if (var1 == 0) {
               this.c.b(var4, var5, var6, this.z.e);
            } else {
               int var9 = var3 != null ? var3.a : 0;
               if (this.c.a(this.h, this.f, var3, var4, var5, var6, var7)) {
                  var2 = false;
                  this.h.m_();
               }

               if (var3 == null) {
                  return;
               }

               if (var3.a == 0) {
                  this.h.by.a[this.h.by.c] = null;
               } else if (var3.a != var9 || this.c.g()) {
                  this.u.c.b();
               }
            }
         }

         if (var2 && var1 == 1) {
            dk var10 = this.h.by.a();
            if (var10 != null && this.c.a(this.h, this.f, var10)) {
               this.u.c.c();
            }
         }

      }
   }

   public void j() {
      try {
         this.U = !this.U;
         if (this.U) {
            Display.setDisplayMode(Display.getDesktopDisplayMode());
            this.d = Display.getDisplayMode().getWidth();
            this.e = Display.getDisplayMode().getHeight();
            if (this.d <= 0) {
               this.d = 1;
            }

            if (this.e <= 0) {
               this.e = 1;
            }
         } else {
            if (this.m != null) {
               this.d = this.m.getWidth();
               this.e = this.m.getHeight();
            } else {
               this.d = this.ab;
               this.e = this.ac;
            }

            if (this.d <= 0) {
               this.d = 1;
            }

            if (this.e <= 0) {
               this.e = 1;
            }
         }

         if (this.s != null) {
            this.a(this.d, this.e);
         }

         Display.setFullscreen(this.U);
         Display.update();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void a(int var1, int var2) {
      if (var1 <= 0) {
         var1 = 1;
      }

      if (var2 <= 0) {
         var2 = 1;
      }

      this.d = var1;
      this.e = var2;
      if (this.s != null) {
         ef var3 = new ef(this.A, var1, var2);
         int var4 = var3.a();
         int var5 = var3.b();
         this.s.a(this, var4, var5);
      }

   }

   private void z() {
      (new hr(this)).start();
   }

   public void k() {
      if (this.ae > 0) {
         --this.ae;
      }

      if (this.Z == 6000) {
         this.z();
      }

      pf.a("stats");
      this.K.d();
      pf.c("gui");
      if (!this.o) {
         this.w.a();
      }

      pf.c("pick");
      this.u.a(1.0F);
      pf.c("centerChunkSource");
      if (this.h != null) {
         ej var1 = this.f.x();
         if (var1 instanceof mv) {
            mv var2 = (mv)var1;
            int var3 = me.d((float)((int)this.h.s)) >> 4;
            int var4 = me.d((float)((int)this.h.u)) >> 4;
            var2.d(var3, var4);
         }
      }

      pf.c("gameMode");
      if (!this.o && this.f != null) {
         this.c.d();
      }

      GL11.glBindTexture(3553, this.p.b("/terrain.png"));
      pf.c("textures");
      if (!this.o) {
         this.p.a();
      }

      if (this.s == null && this.h != null) {
         if (this.h.ag() <= 0) {
            this.a((xe)null);
         } else if (this.h.ar() && this.f != null && this.f.I) {
            this.a((xe)(new rj()));
         }
      } else if (this.s != null && this.s instanceof rj && !this.h.ar()) {
         this.a((xe)null);
      }

      if (this.s != null) {
         this.aa = 10000;
      }

      if (this.s != null) {
         this.s.g();
         if (this.s != null) {
            this.s.r.a();
            this.s.s_();
         }
      }

      if (this.s == null || this.s.p) {
         pf.c("mouse");

         while(Mouse.next()) {
            aby.a(Mouse.getEventButton() - 100, Mouse.getEventButtonState());
            if (Mouse.getEventButtonState()) {
               aby.a(Mouse.getEventButton() - 100);
            }

            long var5 = System.currentTimeMillis() - this.T;
            if (var5 <= 200L) {
               int var9 = Mouse.getEventDWheel();
               if (var9 != 0) {
                  this.h.by.a(var9);
                  if (this.A.H) {
                     if (var9 > 0) {
                        var9 = 1;
                     }

                     if (var9 < 0) {
                        var9 = -1;
                     }

                     ki var10000 = this.A;
                     var10000.K += (float)var9 * 0.25F;
                  }
               }

               if (this.s == null) {
                  if (!this.R && Mouse.getEventButtonState()) {
                     this.g();
                  }
               } else if (this.s != null) {
                  this.s.h();
               }
            }
         }

         if (this.aa > 0) {
            --this.aa;
         }

         pf.c("keyboard");

         while(Keyboard.next()) {
            aby.a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
            if (Keyboard.getEventKeyState()) {
               aby.a(Keyboard.getEventKey());
            }

            if (Keyboard.getEventKeyState()) {
               if (Keyboard.getEventKey() == 87) {
                  this.j();
               } else {
                  if (this.s != null) {
                     this.s.i();
                  } else {
                     if (Keyboard.getEventKey() == 1) {
                        this.i();
                     }

                     if (Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61)) {
                        this.A();
                     }

                     if (Keyboard.getEventKey() == 20 && Keyboard.isKeyDown(61)) {
                        this.p.b();
                     }

                     if (Keyboard.getEventKey() == 33 && Keyboard.isKeyDown(61)) {
                        boolean var6 = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
                        this.A.a(lp.g, var6 ? -1 : 1);
                     }

                     if (Keyboard.getEventKey() == 30 && Keyboard.isKeyDown(61)) {
                        this.g.a();
                     }

                     if (Keyboard.getEventKey() == 59) {
                        this.A.D = !this.A.D;
                     }

                     if (Keyboard.getEventKey() == 61) {
                        this.A.F = !this.A.F;
                     }

                     if (Keyboard.getEventKey() == 63) {
                        ++this.A.E;
                        if (this.A.E > 2) {
                           this.A.E = 0;
                        }
                     }

                     if (Keyboard.getEventKey() == 66) {
                        this.A.I = !this.A.I;
                     }
                  }

                  for(int var7 = 0; var7 < 9; ++var7) {
                     if (Keyboard.getEventKey() == 2 + var7) {
                        this.h.by.c = var7;
                     }
                  }

                  if (this.A.F) {
                     if (Keyboard.getEventKey() == 11) {
                        this.b(0);
                     }

                     for(int var8 = 0; var8 < 9; ++var8) {
                        if (Keyboard.getEventKey() == 2 + var8) {
                           this.b(var8 + 1);
                        }
                     }
                  }
               }
            }
         }

         while(this.A.s.c()) {
            this.a((xe)(new hw(this.h)));
         }

         while(this.A.t.c()) {
            this.h.l_();
         }

         while(this.l() && this.A.u.c()) {
            this.a((xe)(new gx()));
         }

         if (this.h.az()) {
            if (!this.A.x.e) {
               this.c.a_(this.h);
            }

            while(this.A.w.c()) {
            }

            while(this.A.x.c()) {
            }

            while(this.A.z.c()) {
            }
         } else {
            while(this.A.w.c()) {
               this.c(0);
            }

            while(this.A.x.c()) {
               this.c(1);
            }

            while(this.A.z.c()) {
               this.B();
            }
         }

         if (this.A.x.e && this.ae == 0 && !this.h.az()) {
            this.c(1);
         }

         this.a(0, this.s == null && this.A.w.e && this.R);
      }

      if (this.f != null) {
         if (this.h != null) {
            ++this.al;
            if (this.al == 30) {
               this.al = 0;
               this.f.g(this.h);
            }
         }

         if (this.f.z().s()) {
            this.f.v = 3;
         } else {
            this.f.v = this.A.C;
         }

         if (this.f.I) {
            this.f.v = 1;
         }

         pf.c("gameRenderer");
         if (!this.o) {
            this.u.a();
         }

         pf.c("levelRenderer");
         if (!this.o) {
            this.g.d();
         }

         pf.c("level");
         if (!this.o) {
            if (this.f.s > 0) {
               --this.f.s;
            }

            this.f.m();
         }

         if (!this.o || this.l()) {
            this.f.a(this.f.v > 0, true);
            this.f.c();
         }

         pf.c("animateTick");
         if (!this.o && this.f != null) {
            this.f.t(me.c(this.h.s), me.c(this.h.t), me.c(this.h.u));
         }

         pf.c("particles");
         if (!this.o) {
            this.j.a();
         }
      }

      pf.b();
      this.T = System.currentTimeMillis();
   }

   private void A() {
      System.out.println("FORCING RELOAD!");
      this.C = new ahm();
      this.C.a(this.A);
      this.Y.a();
   }

   public boolean l() {
      return this.f != null && this.f.I;
   }

   public void a(String var1, String var2, yw var3) {
      this.a((ry)null);
      System.gc();
      if (this.ad.c(var1)) {
         this.b(var1, var2);
      } else {
         if (this.t != null) {
            this.t.c("Switching level");
            this.t.b("");
         }

         nh var4 = this.ad.a(var1, false);
         ry var5 = null;
         var5 = new ry(var4, var2, var3);
         if (var5.x) {
            this.K.a(ny.g, 1);
            this.K.a(ny.f, 1);
            this.a(var5, "Generating level");
         } else {
            this.K.a(ny.h, 1);
            this.K.a(ny.f, 1);
            this.a(var5, "Loading level");
         }
      }

   }

   public void a(int var1) {
      int var2 = this.h.bK;
      this.h.bK = var1;
      this.f.b((ia)this.h);
      this.h.K = false;
      double var3 = this.h.s;
      double var5 = this.h.u;
      double var7 = (double)1.0F;
      if (var2 > -1 && this.h.bK == -1) {
         var7 = (double)0.125F;
      } else if (var2 == -1 && this.h.bK > -1) {
         var7 = (double)8.0F;
      }

      var3 *= var7;
      var5 *= var7;
      if (this.h.bK == -1) {
         this.h.c(var3, this.h.t, var5, this.h.y, this.h.z);
         if (this.h.K()) {
            this.f.a((ia)this.h, false);
         }

         ry var9 = null;
         var9 = new ry(this.f, net.minecraft.client.k.a(this.h.bK));
         this.a((ry)var9, "Entering the Nether", (vi)this.h);
      } else if (this.h.bK == 0) {
         if (this.h.K()) {
            this.h.c(var3, this.h.t, var5, this.h.y, this.h.z);
            this.f.a((ia)this.h, false);
         }

         ry var14 = null;
         var14 = new ry(this.f, net.minecraft.client.k.a(this.h.bK));
         if (var2 == -1) {
            this.a((ry)var14, "Leaving the Nether", (vi)this.h);
         } else {
            this.a((ry)var14, "Leaving the End", (vi)this.h);
         }
      } else {
         ry var16 = null;
         var16 = new ry(this.f, net.minecraft.client.k.a(this.h.bK));
         dh var10 = var16.j();
         var3 = (double)var10.a;
         this.h.t = (double)var10.b;
         var5 = (double)var10.c;
         this.h.c(var3, this.h.t, var5, 90.0F, 0.0F);
         if (this.h.K()) {
            var16.a((ia)this.h, false);
         }

         this.a((ry)var16, "Entering the End", (vi)this.h);
      }

      this.h.o = this.f;
      System.out.println("Teleported to " + this.f.y.g);
      if (this.h.K() && var2 < 1) {
         this.h.c(var3, this.h.t, var5, this.h.y, this.h.z);
         this.f.a((ia)this.h, false);
         (new aim()).a(this.f, this.h);
      }

   }

   public void b(String var1) {
      this.f = null;
      this.a((ry)null, (String)var1);
   }

   public void a(ry var1) {
      this.a(var1, "");
   }

   public void a(ry var1, String var2) {
      this.a((ry)var1, var2, (vi)null);
   }

   public void a(ry var1, String var2, vi var3) {
      this.K.b();
      this.K.c();
      this.i = null;
      if (this.t != null) {
         this.t.c(var2);
         this.t.b("");
      }

      this.C.a((String)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      if (this.f != null) {
         this.f.a((rz)this.t);
      }

      this.f = var1;
      if (var1 != null) {
         if (this.c != null) {
            this.c.a(var1);
         }

         if (!this.l()) {
            if (var3 == null) {
               this.h = (di)var1.a(di.class);
            }
         } else if (this.h != null) {
            this.h.u();
            if (var1 != null) {
               var1.a((ia)this.h);
            }
         }

         if (!var1.I) {
            this.e(var2);
         }

         if (this.h == null) {
            this.h = (di)this.c.b(var1);
            this.h.u();
            this.c.a((vi)this.h);
         }

         this.h.b = new wa(this.A);
         if (this.g != null) {
            this.g.a(var1);
         }

         if (this.j != null) {
            this.j.a(var1);
         }

         if (var3 != null) {
            var1.k();
         }

         ej var4 = var1.x();
         if (var4 instanceof mv) {
            mv var5 = (mv)var4;
            int var6 = me.d((float)((int)this.h.s)) >> 4;
            int var7 = me.d((float)((int)this.h.u)) >> 4;
            var5.d(var6, var7);
         }

         var1.a((vi)this.h);
         this.c.d(this.h);
         if (var1.x) {
            var1.a((rz)this.t);
         }

         this.i = this.h;
      } else {
         this.ad.c();
         this.h = null;
      }

      System.gc();
      this.T = 0L;
   }

   private void b(String var1, String var2) {
      this.t.c("Converting World to " + this.ad.a());
      this.t.b("This may take a while :)");
      this.ad.a(var1, (rz)this.t);
      this.a(var1, var2, new yw(0L, 0, true, false));
   }

   private void e(String var1) {
      if (this.t != null) {
         this.t.c(var1);
         this.t.b("Building terrain");
      }

      short var2 = 128;
      if (this.c.i()) {
         var2 = 64;
      }

      int var3 = 0;
      int var4 = var2 * 2 / 16 + 1;
      var4 *= var4;
      ej var5 = this.f.x();
      dh var6 = this.f.v();
      if (this.h != null) {
         var6.a = (int)this.h.s;
         var6.c = (int)this.h.u;
      }

      if (var5 instanceof mv) {
         mv var7 = (mv)var5;
         var7.d(var6.a >> 4, var6.c >> 4);
      }

      for(int var11 = -var2; var11 <= var2; var11 += 16) {
         for(int var8 = -var2; var8 <= var2; var8 += 16) {
            if (this.t != null) {
               this.t.a(var3++ * 100 / var4);
            }

            this.f.a(var6.a + var11, 64, var6.c + var8);
            if (!this.c.i()) {
               while(this.f.F()) {
               }
            }
         }
      }

      if (!this.c.i()) {
         if (this.t != null) {
            this.t.b("Simulating world for a bit");
         }

         var4 = 2000;
         this.f.r();
      }

   }

   public void a(String var1, File var2) {
      int var3 = var1.indexOf("/");
      String var4 = var1.substring(0, var3);
      var1 = var1.substring(var3 + 1);
      if (var4.equalsIgnoreCase("sound")) {
         this.C.a(var1, var2);
      } else if (var4.equalsIgnoreCase("newsound")) {
         this.C.a(var1, var2);
      } else if (var4.equalsIgnoreCase("streaming")) {
         this.C.b(var1, var2);
      } else if (var4.equalsIgnoreCase("music")) {
         this.C.c(var1, var2);
      } else if (var4.equalsIgnoreCase("newmusic")) {
         this.C.c(var1, var2);
      }

   }

   public String m() {
      return this.g.b();
   }

   public String n() {
      return this.g.c();
   }

   public String o() {
      return this.f.o();
   }

   public String p() {
      return "P: " + this.j.b() + ". T: " + this.f.n();
   }

   public void a(boolean var1, int var2, boolean var3) {
      if (!this.f.I && !this.f.y.d()) {
         this.a(0);
      }

      dh var4 = null;
      dh var5 = null;
      boolean var6 = true;
      if (this.h != null && !var1) {
         var4 = this.h.aM();
         if (var4 != null) {
            var5 = vi.a(this.f, var4);
            if (var5 == null) {
               this.h.b("tile.bed.notValid");
            }
         }
      }

      if (var5 == null) {
         var5 = this.f.v();
         var6 = false;
      }

      ej var7 = this.f.x();
      if (var7 instanceof mv) {
         mv var8 = (mv)var7;
         var8.d(var5.a >> 4, var5.c >> 4);
      }

      this.f.e();
      this.f.w();
      int var10 = 0;
      if (this.h != null) {
         var10 = this.h.j;
         this.f.b((ia)this.h);
      }

      di var9 = this.h;
      this.i = null;
      this.h = (di)this.c.b(this.f);
      if (var3) {
         this.h.d(var9);
      }

      this.h.bK = var2;
      this.i = this.h;
      this.h.u();
      if (var6) {
         this.h.a((dh)var4);
         this.h.c((double)((float)var5.a + 0.5F), (double)((float)var5.b + 0.1F), (double)((float)var5.c + 0.5F), 0.0F, 0.0F);
      }

      this.c.a((vi)this.h);
      this.f.a((vi)this.h);
      this.h.b = new wa(this.A);
      this.h.j = var10;
      this.h.r();
      this.c.d(this.h);
      this.e("Respawning");
      if (this.s instanceof j) {
         this.a((xe)null);
      }

   }

      // PATCH(1.0.0): AWT-лаунчер удалён (старт — WebEntryPoint)


   

   public abp q() {
      return this.h instanceof cx ? ((cx)this.h).a : null;
   }

      // PATCH(1.0.0): AWT-лаунчер удалён (старт — WebEntryPoint)


   public static boolean r() {
      return a == null || !a.A.D;
   }

   public static boolean s() {
      return a != null && a.A.j;
   }

   public static boolean t() {
      return a != null && a.A.k;
   }

   public static boolean u() {
      return a != null && a.A.F;
   }

   public boolean c(String var1) {
      if (var1.startsWith("/")) {
      }

      return false;
   }

   private void B() {
      if (this.z != null) {
         int var1 = this.f.a(this.z.b, this.z.c, this.z.d);
         if (var1 == yy.u.bM) {
            var1 = yy.v.bM;
         }

         if (var1 == yy.aj.bM) {
            var1 = yy.ak.bM;
         }

         if (var1 == yy.z.bM) {
            var1 = yy.t.bM;
         }

         int var2 = 0;
         boolean var3 = false;
         if (acy.d[var1].f()) {
            var2 = this.f.d(this.z.b, this.z.c, this.z.d);
            var3 = true;
         }

         this.h.by.a(var1, var2, var3, this.c instanceof uq);
      }

   }
}
