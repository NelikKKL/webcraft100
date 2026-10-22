package net.minecraft.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class ki {
   private static final String[] Q = new String[]{"options.renderDistance.far", "options.renderDistance.normal", "options.renderDistance.short", "options.renderDistance.tiny"};
   private static final String[] R = new String[]{"options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard"};
   private static final String[] S = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
   private static final String[] T = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
   private static final String[] U = new String[]{"performance.max", "performance.balanced", "performance.powersaver"};
   public float a = 1.0F;
   public float b = 1.0F;
   public float c = 0.5F;
   public boolean d = false;
   public int e = 0;
   public boolean f = true;
   public boolean g = false;
   public boolean h = false;
   public int i = 1;
   public boolean j = true;
   public boolean k = true;
   public boolean l = true;
   public String m = "Default";
   public aby n = new aby("key.forward", 17);
   public aby o = new aby("key.left", 30);
   public aby p = new aby("key.back", 31);
   public aby q = new aby("key.right", 32);
   public aby r = new aby("key.jump", 57);
   public aby s = new aby("key.inventory", 18);
   public aby t = new aby("key.drop", 16);
   public aby u = new aby("key.chat", 20);
   public aby v = new aby("key.sneak", 42);
   public aby w = new aby("key.attack", -100);
   public aby x = new aby("key.use", -99);
   public aby y = new aby("key.playerlist", 15);
   public aby z = new aby("key.pickItem", -98);
   public aby[] A;
   protected Minecraft B;
   private File V;
   public int C;
   public boolean D;
   public int E;
   public boolean F;
   public String G;
   public boolean H;
   public boolean I;
   public boolean J;
   public float K;
   public float L;
   public float M;
   public float N;
   public int O;
   public int P;

   public ki(Minecraft var1, File var2) {
      this.A = new aby[]{this.w, this.x, this.n, this.o, this.p, this.q, this.r, this.v, this.t, this.s, this.u, this.y, this.z};
      this.C = 2;
      this.D = false;
      this.E = 0;
      this.F = false;
      this.G = "";
      this.H = false;
      this.I = false;
      this.J = false;
      this.K = 1.0F;
      this.L = 1.0F;
      this.M = 0.0F;
      this.N = 0.0F;
      this.O = 0;
      this.P = 0;
      this.B = var1;
      this.V = new File(var2, "options.txt");
      this.a();
   }

   public ki() {
      this.A = new aby[]{this.w, this.x, this.n, this.o, this.p, this.q, this.r, this.v, this.t, this.s, this.u, this.y, this.z};
      this.C = 2;
      this.D = false;
      this.E = 0;
      this.F = false;
      this.G = "";
      this.H = false;
      this.I = false;
      this.J = false;
      this.K = 1.0F;
      this.L = 1.0F;
      this.M = 0.0F;
      this.N = 0.0F;
      this.O = 0;
      this.P = 0;
   }

   public String a(int var1) {
      qp var2 = qp.a();
      return var2.a(this.A[var1].c);
   }

   public String b(int var1) {
      int var2 = this.A[var1].d;
      return c(var2);
   }

   public static String c(int var0) {
      return var0 < 0 ? hj.a("key.mouseButton", var0 + 101) : Keyboard.getKeyName(var0);
   }

   public void a(int var1, int var2) {
      this.A[var1].d = var2;
      this.b();
   }

   public void a(lp var1, float var2) {
      if (var1 == lp.a) {
         this.a = var2;
         this.B.C.a();
      }

      if (var1 == lp.b) {
         this.b = var2;
         this.B.C.a();
      }

      if (var1 == lp.d) {
         this.c = var2;
      }

      if (var1 == lp.e) {
         this.M = var2;
      }

      if (var1 == lp.f) {
         this.N = var2;
      }

   }

   public void a(lp var1, int var2) {
      if (var1 == lp.c) {
         this.d = !this.d;
      }

      if (var1 == lp.g) {
         this.e = this.e + var2 & 3;
      }

      if (var1 == lp.o) {
         this.O = this.O + var2 & 3;
      }

      if (var1 == lp.q) {
         this.P = (this.P + var2) % 3;
      }

      if (var1 == lp.h) {
         this.f = !this.f;
      }

      if (var1 == lp.p) {
         this.l = !this.l;
      }

      if (var1 == lp.j) {
         this.h = !this.h;
         this.B.g.a();
      }

      if (var1 == lp.i) {
         this.g = !this.g;
         this.B.p.b();
      }

      if (var1 == lp.k) {
         this.i = (this.i + var2 + 3) % 3;
      }

      if (var1 == lp.l) {
         this.C = this.C + var2 & 3;
      }

      if (var1 == lp.m) {
         this.j = !this.j;
         this.B.g.a();
      }

      if (var1 == lp.n) {
         this.k = !this.k;
         this.B.g.a();
      }

      this.b();
   }

   public float a(lp var1) {
      if (var1 == lp.e) {
         return this.M;
      } else if (var1 == lp.f) {
         return this.N;
      } else if (var1 == lp.a) {
         return this.a;
      } else if (var1 == lp.b) {
         return this.b;
      } else {
         return var1 == lp.d ? this.c : 0.0F;
      }
   }

   /** PATCH(1.0.0): метод не декомпилировался. Значение булевой опции (GameSettings.getOptionOrdinalValue). */
   public boolean b(lp var1) {
      if (var1 == lp.c) {
         return this.d;
      } else if (var1 == lp.h) {
         return this.f;
      } else if (var1 == lp.i) {
         return this.g;
      } else if (var1 == lp.j) {
         return this.h;
      } else if (var1 == lp.n) {
         return this.k;
      } else {
         return var1 == lp.p ? this.l : false;
      }
   }

   public String c(lp var1) {
      qp var2 = qp.a();
      String var3 = var2.a(var1.d()) + ": ";
      if (var1.a()) {
         float var5 = this.a(var1);
         if (var1 == lp.d) {
            if (var5 == 0.0F) {
               return var3 + var2.a("options.sensitivity.min");
            } else {
               return var5 == 1.0F ? var3 + var2.a("options.sensitivity.max") : var3 + (int)(var5 * 200.0F) + "%";
            }
         } else if (var1 == lp.e) {
            if (var5 == 0.0F) {
               return var3 + var2.a("options.fov.min");
            } else {
               return var5 == 1.0F ? var3 + var2.a("options.fov.max") : var3 + (int)(70.0F + var5 * 40.0F);
            }
         } else if (var1 == lp.f) {
            if (var5 == 0.0F) {
               return var3 + var2.a("options.gamma.min");
            } else {
               return var5 == 1.0F ? var3 + var2.a("options.gamma.max") : var3 + "+" + (int)(var5 * 100.0F) + "%";
            }
         } else {
            return var5 == 0.0F ? var3 + var2.a("options.off") : var3 + (int)(var5 * 100.0F) + "%";
         }
      } else if (var1.b()) {
         boolean var4 = this.b(var1);
         return var4 ? var3 + var2.a("options.on") : var3 + var2.a("options.off");
      } else if (var1 == lp.g) {
         return var3 + var2.a(Q[this.e]);
      } else if (var1 == lp.l) {
         return var3 + var2.a(R[this.C]);
      } else if (var1 == lp.o) {
         return var3 + var2.a(S[this.O]);
      } else if (var1 == lp.q) {
         return var3 + var2.a(T[this.P]);
      } else if (var1 == lp.k) {
         return var3 + hj.a(U[this.i]);
      } else if (var1 == lp.m) {
         return this.j ? var3 + var2.a("options.graphics.fancy") : var3 + var2.a("options.graphics.fast");
      } else {
         return var3;
      }
   }

   public void a() {
      try {
         if (!this.V.exists()) {
            return;
         }

         BufferedReader var1 = new BufferedReader(new FileReader(this.V));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            try {
               String[] var3 = var2.split(":");
               if (var3[0].equals("music")) {
                  this.a = this.a(var3[1]);
               }

               if (var3[0].equals("sound")) {
                  this.b = this.a(var3[1]);
               }

               if (var3[0].equals("mouseSensitivity")) {
                  this.c = this.a(var3[1]);
               }

               if (var3[0].equals("fov")) {
                  this.M = this.a(var3[1]);
               }

               if (var3[0].equals("gamma")) {
                  this.N = this.a(var3[1]);
               }

               if (var3[0].equals("invertYMouse")) {
                  this.d = var3[1].equals("true");
               }

               if (var3[0].equals("viewDistance")) {
                  this.e = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("guiScale")) {
                  this.O = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("particles")) {
                  this.P = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("bobView")) {
                  this.f = var3[1].equals("true");
               }

               if (var3[0].equals("anaglyph3d")) {
                  this.g = var3[1].equals("true");
               }

               if (var3[0].equals("advancedOpengl")) {
                  this.h = var3[1].equals("true");
               }

               if (var3[0].equals("fpsLimit")) {
                  this.i = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("difficulty")) {
                  this.C = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("fancyGraphics")) {
                  this.j = var3[1].equals("true");
               }

               if (var3[0].equals("ao")) {
                  this.k = var3[1].equals("true");
               }

               if (var3[0].equals("clouds")) {
                  this.l = var3[1].equals("true");
               }

               if (var3[0].equals("skin")) {
                  this.m = var3[1];
               }

               if (var3[0].equals("lastServer") && var3.length >= 2) {
                  this.G = var3[1];
               }

               for(int var4 = 0; var4 < this.A.length; ++var4) {
                  if (var3[0].equals("key_" + this.A[var4].c)) {
                     this.A[var4].d = Integer.parseInt(var3[1]);
                  }
               }
            } catch (Exception var5) {
               System.out.println("Skipping bad option: " + var2);
            }
         }

         aby.b();
         var1.close();
      } catch (Exception var6) {
         System.out.println("Failed to load options");
         var6.printStackTrace();
      }

   }

   private float a(String var1) {
      if (var1.equals("true")) {
         return 1.0F;
      } else {
         return var1.equals("false") ? 0.0F : Float.parseFloat(var1);
      }
   }

   public void b() {
      net.minecraft.client.web.WorldStore.changed(this.V); // PATCH(1.0.0)
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.V));
         var1.println("music:" + this.a);
         var1.println("sound:" + this.b);
         var1.println("invertYMouse:" + this.d);
         var1.println("mouseSensitivity:" + this.c);
         var1.println("fov:" + this.M);
         var1.println("gamma:" + this.N);
         var1.println("viewDistance:" + this.e);
         var1.println("guiScale:" + this.O);
         var1.println("particles:" + this.P);
         var1.println("bobView:" + this.f);
         var1.println("anaglyph3d:" + this.g);
         var1.println("advancedOpengl:" + this.h);
         var1.println("fpsLimit:" + this.i);
         var1.println("difficulty:" + this.C);
         var1.println("fancyGraphics:" + this.j);
         var1.println("ao:" + this.k);
         var1.println("clouds:" + this.l);
         var1.println("skin:" + this.m);
         var1.println("lastServer:" + this.G);

         for(int var2 = 0; var2 < this.A.length; ++var2) {
            var1.println("key_" + this.A[var2].c + ":" + this.A[var2].d);
         }

         var1.close();
      } catch (Exception var3) {
         System.out.println("Failed to save options");
         var3.printStackTrace();
      }

   }

   public boolean c() {
      return this.e < 2 && this.l;
   }
}
