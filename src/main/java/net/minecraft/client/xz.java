package net.minecraft.client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

public class xz extends xe {
   private final DateFormat c = new SimpleDateFormat();
   protected xe a;
   protected String b = "Select world";
   private boolean d = false;
   private int e;
   private List f;
   private pb g;
   private String h;
   private String j;
   private String[] k = new String[2];
   private boolean s;
   private ct t;
   private ct u;
   private ct v;

   public xz(xe var1) {
      this.a = var1;
   }

   public void a() {
      qp var1 = qp.a();
      this.b = var1.a("selectWorld.title");
      this.h = var1.a("selectWorld.world");
      this.j = var1.a("selectWorld.conversion");
      this.k[0] = var1.a("gameMode.survival");
      this.k[1] = var1.a("gameMode.creative");
      this.l();
      this.g = new pb(this);
      this.g.a(this.o, 4, 5);
      this.e();
   }

   private void l() {
      tq var1 = this.l.c();
      this.f = var1.b();
      Collections.sort(this.f);
      this.e = -1;
   }

   protected String c(int var1) {
      return ((rr)this.f.get(var1)).a();
   }

   protected String d(int var1) {
      String var2 = ((rr)this.f.get(var1)).b();
      if (var2 == null || me.a(var2)) {
         qp var3 = qp.a();
         var2 = var3.a("selectWorld.world") + " " + (var1 + 1);
      }

      return var2;
   }

   public void e() {
      qp var1 = qp.a();
      this.o.add(this.u = new ct(1, this.m / 2 - 154, this.n - 52, 150, 20, var1.a("selectWorld.select")));
      this.o.add(this.v = new ct(6, this.m / 2 - 154, this.n - 28, 70, 20, var1.a("selectWorld.rename")));
      this.o.add(this.t = new ct(2, this.m / 2 - 74, this.n - 28, 70, 20, var1.a("selectWorld.delete")));
      this.o.add(new ct(3, this.m / 2 + 4, this.n - 52, 150, 20, var1.a("selectWorld.create")));
      this.o.add(new ct(0, this.m / 2 + 4, this.n - 28, 150, 20, var1.a("gui.cancel")));
      this.u.g = false;
      this.t.g = false;
      this.v.g = false;
   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f == 2) {
            String var2 = this.d(this.e);
            if (var2 != null) {
               this.s = true;
               qp var3 = qp.a();
               String var4 = var3.a("selectWorld.deleteQuestion");
               String var5 = "'" + var2 + "' " + var3.a("selectWorld.deleteWarning");
               String var6 = var3.a("selectWorld.deleteButton");
               String var7 = var3.a("gui.cancel");
               go var8 = new go(this, var4, var5, var6, var7, this.e);
               this.l.a((xe)var8);
            }
         } else if (var1.f == 1) {
            this.e(this.e);
         } else if (var1.f == 3) {
            this.l.a((xe)(new xh(this)));
         } else if (var1.f == 6) {
            this.l.a((xe)(new or(this, this.c(this.e))));
         } else if (var1.f == 0) {
            this.l.a(this.a);
         } else {
            this.g.a(var1);
         }

      }
   }

   public void e(int var1) {
      this.l.a((xe)null);
      if (!this.d) {
         this.d = true;
         int var2 = ((rr)this.f.get(var1)).e();
         if (var2 == 0) {
            this.l.c = new dm(this.l);
         } else {
            this.l.c = new uq(this.l);
         }

         String var3 = this.c(var1);
         if (var3 == null) {
            var3 = "World" + var1;
         }

         this.l.a((String)var3, this.d(var1), (yw)null);
         this.l.a((xe)null);
      }
   }

   public void a(boolean var1, int var2) {
      if (this.s) {
         this.s = false;
         if (var1) {
            tq var3 = this.l.c();
            var3.c();
            var3.b(this.c(var2));
            this.l();
         }

         this.l.a((xe)this);
      }

   }

   public void a(int var1, int var2, float var3) {
      this.g.a(var1, var2, var3);
      this.a(this.q, this.b, this.m / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static List a(xz var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static int a(xz var0, int var1) {
      return var0.e = var1;
   }

   // $FF: synthetic method
   static int b(xz var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static ct c(xz var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static ct d(xz var0) {
      return var0.t;
   }

   // $FF: synthetic method
   static ct e(xz var0) {
      return var0.v;
   }

   // $FF: synthetic method
   static String f(xz var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static DateFormat g(xz var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static String h(xz var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static String[] i(xz var0) {
      return var0.k;
   }
}
