package net.minecraft.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import net.minecraft.client.netshim.InetAddress;
import net.minecraft.client.netshim.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class abp extends fe {
   private boolean f = false;
   private hc g;
   public String a;
   private Minecraft h;
   private ma i;
   private boolean j = false;
   public ew b = new ew((nh)null);
   private Map k = new HashMap();
   public List c = new ArrayList();
   public int d = 20;
   Random e = new Random();

   public abp(Minecraft var1, String var2, int var3) throws net.minecraft.client.netshim.ConnectException, java.net.UnknownHostException {
      this.h = var1;
      Socket var4 = new Socket(InetAddress.getByName(var2), var3);
      this.g = new hc(var4, "Client", this);
   }

   public void b() {
      if (!this.f) {
         this.g.b();
      }

      this.g.a();
   }

   public void a(aj var1) {
      this.h.c = new zn(this.h, this);
      this.h.K.a(ny.i, 1);
      this.i = new ma(this, new yw(var1.c, var1.d, false, false), var1.e, var1.f);
      this.i.I = true;
      this.h.a((ry)this.i);
      this.h.h.bK = var1.e;
      this.h.a((xe)(new acd(this)));
      this.h.h.j = var1.a;
      this.d = var1.h;
      ((zn)this.h.c).a(var1.d == 1);
   }

   public void a(ts var1) {
      double var2 = (double)var1.b / (double)32.0F;
      double var4 = (double)var1.c / (double)32.0F;
      double var6 = (double)var1.d / (double)32.0F;
      ih var8 = new ih(this.i, var2, var4, var6, new dk(var1.h, var1.i, var1.m));
      var8.v = (double)var1.e / (double)128.0F;
      var8.w = (double)var1.f / (double)128.0F;
      var8.x = (double)var1.g / (double)128.0F;
      var8.al = var1.b;
      var8.am = var1.c;
      var8.an = var1.d;
      this.i.a(var1.a, var8);
   }

   public void a(gh var1) {
      double var2 = (double)var1.b / (double)32.0F;
      double var4 = (double)var1.c / (double)32.0F;
      double var6 = (double)var1.d / (double)32.0F;
      Object var8 = null;
      if (var1.h == 10) {
         var8 = new vm(this.i, var2, var4, var6, 0);
      }

      if (var1.h == 11) {
         var8 = new vm(this.i, var2, var4, var6, 1);
      }

      if (var1.h == 12) {
         var8 = new vm(this.i, var2, var4, var6, 2);
      }

      if (var1.h == 90) {
         var8 = new ael(this.i, var2, var4, var6);
      }

      if (var1.h == 60) {
         var8 = new ro(this.i, var2, var4, var6);
      }

      if (var1.h == 61) {
         var8 = new aah(this.i, var2, var4, var6);
      }

      if (var1.h == 65) {
         var8 = new tm(this.i, var2, var4, var6);
      }

      if (var1.h == 72) {
         var8 = new bs(this.i, var2, var4, var6);
      }

      if (var1.h == 63) {
         var8 = new aad(this.i, var2, var4, var6, (double)var1.e / (double)8000.0F, (double)var1.f / (double)8000.0F, (double)var1.g / (double)8000.0F);
         var1.i = 0;
      }

      if (var1.h == 64) {
         var8 = new yn(this.i, var2, var4, var6, (double)var1.e / (double)8000.0F, (double)var1.f / (double)8000.0F, (double)var1.g / (double)8000.0F);
         var1.i = 0;
      }

      if (var1.h == 62) {
         var8 = new qw(this.i, var2, var4, var6);
      }

      if (var1.h == 73) {
         var8 = new ab(this.i, var2, var4, var6, var1.i);
         var1.i = 0;
      }

      if (var1.h == 1) {
         var8 = new no(this.i, var2, var4, var6);
      }

      if (var1.h == 50) {
         var8 = new dd(this.i, var2, var4, var6);
      }

      if (var1.h == 51) {
         var8 = new sf(this.i, var2, var4, var6);
      }

      if (var1.h == 70) {
         var8 = new uo(this.i, var2, var4, var6, yy.E.bM);
      }

      if (var1.h == 71) {
         var8 = new uo(this.i, var2, var4, var6, yy.F.bM);
      }

      if (var1.h == 74) {
         var8 = new uo(this.i, var2, var4, var6, yy.bK.bM);
      }

      if (var8 != null) {
         ((ia)var8).al = var1.b;
         ((ia)var8).am = var1.c;
         ((ia)var8).an = var1.d;
         ((ia)var8).y = 0.0F;
         ((ia)var8).z = 0.0F;
         ia[] var9 = ((ia)var8).ab();
         if (var9 != null) {
            int var10 = var1.a - ((ia)var8).j;

            for(int var11 = 0; var11 < var9.length; ++var11) {
               var9[var11].j += var10;
               System.out.println(var9[var11].j);
            }
         }

         ((ia)var8).j = var1.a;
         this.i.a(var1.a, (ia)var8);
         if (var1.i > 0) {
            if (var1.h == 60) {
               ia var12 = this.a(var1.i);
               if (var12 instanceof nq) {
                  ((ro)var8).c = (nq)var12;
               }
            }

            ((ia)var8).a((double)var1.e / (double)8000.0F, (double)var1.f / (double)8000.0F, (double)var1.g / (double)8000.0F);
         }
      }

   }

   public void a(fi var1) {
      fk var2 = new fk(this.i, (double)var1.b, (double)var1.c, (double)var1.d, var1.e);
      var2.al = var1.b;
      var2.am = var1.c;
      var2.an = var1.d;
      var2.y = 0.0F;
      var2.z = 0.0F;
      var2.j = var1.a;
      this.i.a(var1.a, var2);
   }

   public void a(abf var1) {
      double var2 = (double)var1.b / (double)32.0F;
      double var4 = (double)var1.c / (double)32.0F;
      double var6 = (double)var1.d / (double)32.0F;
      su var8 = null;
      if (var1.e == 1) {
         var8 = new su(this.i, var2, var4, var6);
      }

      if (var8 != null) {
         var8.al = var1.b;
         var8.am = var1.c;
         var8.an = var1.d;
         var8.y = 0.0F;
         var8.z = 0.0F;
         var8.j = var1.a;
         this.i.e(var8);
      }

   }

   public void a(yr var1) {
      tj var2 = new tj(this.i, var1.b, var1.c, var1.d, var1.e, var1.f);
      this.i.a(var1.a, var2);
   }

   public void a(qm var1) {
      ia var2 = this.a(var1.a);
      if (var2 != null) {
         var2.a((double)var1.b / (double)8000.0F, (double)var1.c / (double)8000.0F, (double)var1.d / (double)8000.0F);
      }
   }

   public void a(se var1) {
      ia var2 = this.a(var1.a);
      if (var2 != null && var1.c() != null) {
         var2.t().a(var1.c());
      }

   }

   public void a(ph var1) {
      double var2 = (double)var1.c / (double)32.0F;
      double var4 = (double)var1.d / (double)32.0F;
      double var6 = (double)var1.e / (double)32.0F;
      float var8 = (float)(var1.f * 360) / 256.0F;
      float var9 = (float)(var1.g * 360) / 256.0F;
      zb var10 = new zb(this.h.f, var1.b);
      var10.p = var10.R = (double)(var10.al = var1.c);
      var10.q = var10.S = (double)(var10.am = var1.d);
      var10.r = var10.T = (double)(var10.an = var1.e);
      int var11 = var1.h;
      if (var11 == 0) {
         var10.by.a[var10.by.c] = null;
      } else {
         var10.by.a[var10.by.c] = new dk(var11, 1, 0);
      }

      var10.b(var2, var4, var6, var8, var9);
      this.i.a(var1.a, var10);
   }

   public void a(be var1) {
      ia var2 = this.a(var1.a);
      if (var2 != null) {
         var2.al = var1.b;
         var2.am = var1.c;
         var2.an = var1.d;
         double var3 = (double)var2.al / (double)32.0F;
         double var5 = (double)var2.am / (double)32.0F + (double)0.015625F;
         double var7 = (double)var2.an / (double)32.0F;
         float var9 = (float)(var1.e * 360) / 256.0F;
         float var10 = (float)(var1.f * 360) / 256.0F;
         var2.a(var3, var5, var7, var9, var10, 3);
      }
   }

   public void a(rd var1) {
      ia var2 = this.a(var1.a);
      if (var2 != null) {
         var2.al += var1.b;
         var2.am += var1.c;
         var2.an += var1.d;
         double var3 = (double)var2.al / (double)32.0F;
         double var5 = (double)var2.am / (double)32.0F;
         double var7 = (double)var2.an / (double)32.0F;
         float var9 = var1.g ? (float)(var1.e * 360) / 256.0F : var2.y;
         float var10 = var1.g ? (float)(var1.f * 360) / 256.0F : var2.z;
         var2.a(var3, var5, var7, var9, var10, 3);
      }
   }

   public void a(fw var1) {
      this.i.b(var1.a);
   }

   public void a(hk var1) {
      di var2 = this.h.h;
      double var3 = var2.s;
      double var5 = var2.t;
      double var7 = var2.u;
      float var9 = var2.y;
      float var10 = var2.z;
      if (var1.h) {
         var3 = var1.a;
         var5 = var1.b;
         var7 = var1.c;
      }

      if (var1.i) {
         var9 = var1.e;
         var10 = var1.f;
      }

      var2.U = 0.0F;
      var2.v = var2.w = var2.x = (double)0.0F;
      ((vi)var2).b(var3, var5, var7, var9, var10);
      var1.a = var2.s;
      var1.b = var2.C.b;
      var1.c = var2.u;
      var1.d = var2.t;
      this.g.a((gt)var1);
      if (!this.j) {
         this.h.h.p = this.h.h.s;
         this.h.h.q = this.h.h.t;
         this.h.h.r = this.h.h.u;
         this.j = true;
         this.h.a((xe)null);
      }

   }

   public void a(t var1) {
      this.i.a(var1.a, var1.b, var1.c);
   }

   public void a(np var1) {
      zx var2 = this.i.c(var1.a, var1.b);
      int var3 = var1.a * 16;
      int var4 = var1.b * 16;

      for(int var5 = 0; var5 < var1.f; ++var5) {
         short var6 = var1.c[var5];
         int var7 = var1.d[var5] & 255;
         byte var8 = var1.e[var5];
         int var9 = var6 >> 12 & 15;
         int var10 = var6 >> 8 & 15;
         int var11 = var6 & 255;
         var2.a(var9, var11, var10, var7, var8);
         this.i.a(var9 + var3, var11, var10 + var4, var9 + var3, var11, var10 + var4);
         this.i.c(var9 + var3, var11, var10 + var4, var9 + var3, var11, var10 + var4);
      }

   }

   public void a(kh var1) {
      this.i.a(var1.a, var1.b, var1.c, var1.a + var1.d - 1, var1.b + var1.e - 1, var1.c + var1.f - 1);
      this.i.a(var1.a, var1.b, var1.c, var1.d, var1.e, var1.f, var1.g);
   }

   public void a(ack var1) {
      this.i.c(var1.a, var1.b, var1.c, var1.d, var1.e);
   }

   public void a(sw var1) {
      this.g.a("disconnect.kicked");
      this.f = true;
      this.h.a((ry)null);
      this.h.a((xe)(new aam("disconnect.disconnected", "disconnect.genericReason", new Object[]{var1.a})));
   }

   public void a(String var1, Object[] var2) {
      if (!this.f) {
         this.f = true;
         this.h.a((ry)null);
         this.h.a((xe)(new aam("disconnect.lost", var1, var2)));
      }
   }

   public void b(gt var1) {
      if (!this.f) {
         this.g.a(var1);
         this.g.c();
      }
   }

   public void c(gt var1) {
      if (!this.f) {
         this.g.a(var1);
      }
   }

   public void a(rc var1) {
      ia var2 = this.a(var1.a);
      Object var3 = (nq)this.a(var1.b);
      if (var3 == null) {
         var3 = this.h.h;
      }

      if (var2 != null) {
         this.i.a(var2, "random.pop", 0.2F, ((this.e.nextFloat() - this.e.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         this.h.j.a((wc)(new acw(this.h.f, var2, (ia)var3, -0.5F)));
         this.i.b(var1.a);
      }

   }

   public void a(abb var1) {
      this.h.w.a(var1.a);
   }

   public void a(abu var1) {
      ia var2 = this.a(var1.a);
      if (var2 != null) {
         if (var1.b == 1) {
            vi var3 = (vi)var2;
            var3.m_();
         } else if (var1.b == 2) {
            var2.T();
         } else if (var1.b == 3) {
            vi var4 = (vi)var2;
            var4.a(false, false, false);
         } else if (var1.b == 4) {
            vi var5 = (vi)var2;
            var5.r();
         } else if (var1.b == 6) {
            this.h.j.a((wc)(new hu(this.h.f, var2)));
         } else if (var1.b == 7) {
            hu var6 = new hu(this.h.f, var2, "magicCrit");
            this.h.j.a((wc)var6);
         } else if (var1.b == 5 && var2 instanceof zb) {
         }

      }
   }

   public void a(aft var1) {
      ia var2 = this.a(var1.a);
      if (var2 != null) {
         if (var1.e == 0) {
            vi var3 = (vi)var2;
            var3.d(var1.b, var1.c, var1.d);
         }

      }
   }

   public void a(hh var1) {
      boolean var2 = true;
      String var3 = var1.a;
      if (var3 != null && var3.trim().length() != 0) {
         if (!var3.equals("-")) {
            try {
               Long.parseLong(var3, 16);
            } catch (NumberFormatException var8) {
               var2 = false;
            }
         }
      } else {
         var2 = false;
      }

      if (!var2) {
         this.g.a("disconnect.genericReason", "The server responded with an invalid server key");
      } else if (var1.a.equals("-")) {
         this.c(new aj(this.h.k.b, 22));
      } else {
         try {
            URL var4 = new URL("http://session.minecraft.net/game/joinserver.jsp?user=" + this.h.k.b + "&sessionId=" + this.h.k.c + "&serverId=" + var1.a);
            BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.openStream()));
            String var6 = var5.readLine();
            var5.close();
            if (var6.equalsIgnoreCase("ok")) {
               this.c(new aj(this.h.k.b, 22));
            } else {
               this.g.a("disconnect.loginFailedInfo", var6);
            }
         } catch (Exception var7) {
            var7.printStackTrace();
            this.g.a("disconnect.genericReason", "Internal client error: " + var7.toString());
         }
      }

   }

   public void c() {
      this.f = true;
      this.g.a();
      this.g.a("disconnect.closed");
   }

   public void a(mn var1) {
      double var2 = (double)var1.c / (double)32.0F;
      double var4 = (double)var1.d / (double)32.0F;
      double var6 = (double)var1.e / (double)32.0F;
      float var8 = (float)(var1.f * 360) / 256.0F;
      float var9 = (float)(var1.g * 360) / 256.0F;
      nq var10 = (nq)afw.a(var1.b, this.h.f);
      var10.al = var1.c;
      var10.am = var1.d;
      var10.an = var1.e;
      ia[] var11 = var10.ab();
      if (var11 != null) {
         int var12 = var1.a - var10.j;

         for(int var13 = 0; var13 < var11.length; ++var13) {
            var11[var13].j += var12;
         }
      }

      var10.j = var1.a;
      var10.b(var2, var4, var6, var8, var9);
      var10.aH = true;
      this.i.a(var1.a, var10);
      List var14 = var1.c();
      if (var14 != null) {
         var10.t().a(var14);
      }

   }

   public void a(cb var1) {
      this.h.f.a(var1.a);
   }

   public void a(aee var1) {
      this.h.h.a((dh)(new dh(var1.a, var1.b, var1.c)));
      this.h.f.z().a(var1.a, var1.b, var1.c);
   }

   public void a(agx var1) {
      Object var2 = this.a(var1.a);
      ia var3 = this.a(var1.b);
      if (var1.a == this.h.h.j) {
         var2 = this.h.h;
      }

      if (var2 != null) {
         ((ia)var2).g(var3);
      }
   }

   public void a(bf var1) {
      ia var2 = this.a(var1.a);
      if (var2 != null) {
         var2.a(var1.b);
      }

   }

   private ia a(int var1) {
      return (ia)(var1 == this.h.h.j ? this.h.h : this.i.a(var1));
   }

   public void a(qg var1) {
      this.h.h.b(var1.a);
      this.h.h.aO().a(var1.b);
      this.h.h.aO().b(var1.c);
   }

   public void a(nw var1) {
      this.h.h.a(var1.a, var1.b, var1.c);
   }

   public void a(aep var1) {
      if (var1.b != this.h.h.bK || var1.a != this.h.h.o.t()) {
         this.j = false;
         this.i = new ma(this, new yw(var1.a, var1.e, false, false), var1.b, var1.c);
         this.i.I = true;
         this.h.a((ry)this.i);
         this.h.h.bK = var1.b;
         this.h.a((xe)(new acd(this)));
      }

      this.h.a(true, var1.b, false);
      ((zn)this.h.c).a(var1.e == 1);
   }

   public void a(km var1) {
      xp var2 = new xp(this.h.f, (ia)null, var1.a, var1.b, var1.c, var1.d);
      var2.g = var1.e;
      var2.a(true);
   }

   public void a(wm var1) {
      if (var1.b == 0) {
         bb var2 = new bb(var1.c, var1.d);
         this.h.h.a((de)var2);
         this.h.h.bA.f = var1.a;
      } else if (var1.b == 2) {
         oe var3 = new oe();
         this.h.h.a(var3);
         this.h.h.bA.f = var1.a;
      } else if (var1.b == 5) {
         tt var4 = new tt();
         this.h.h.a(var4);
         this.h.h.bA.f = var1.a;
      } else if (var1.b == 3) {
         bp var5 = new bp();
         this.h.h.a(var5);
         this.h.h.bA.f = var1.a;
      } else if (var1.b == 1) {
         di var6 = this.h.h;
         this.h.h.a(me.c(var6.s), me.c(var6.t), me.c(var6.u));
         this.h.h.bA.f = var1.a;
      } else if (var1.b == 4) {
         di var7 = this.h.h;
         this.h.h.b(me.c(var7.s), me.c(var7.t), me.c(var7.u));
         this.h.h.bA.f = var1.a;
      }

   }

   public void a(iu var1) {
      if (var1.a == -1) {
         this.h.h.by.b(var1.c);
      } else if (var1.a == 0 && var1.b >= 36 && var1.b < 45) {
         dk var2 = this.h.h.bz.b(var1.b).b();
         if (var1.c != null && (var2 == null || var2.a < var1.c.a)) {
            var1.c.b = 5;
         }

         this.h.h.bz.a(var1.b, var1.c);
      } else if (var1.a == this.h.h.bA.f) {
         this.h.h.bA.a(var1.b, var1.c);
      }

   }

   public void a(ly var1) {
      pj var2 = null;
      if (var1.a == 0) {
         var2 = this.h.h.bz;
      } else if (var1.a == this.h.h.bA.f) {
         var2 = this.h.h.bA;
      }

      if (var2 != null) {
         if (var1.c) {
            var2.a(var1.b);
         } else {
            var2.b(var1.b);
            this.c(new ly(var1.a, var1.b, true));
         }
      }

   }

   public void a(yh var1) {
      if (var1.a == 0) {
         this.h.h.bz.a(var1.b);
      } else if (var1.a == this.h.h.bA.f) {
         this.h.h.bA.a(var1.b);
      }

   }

   public void a(hy var1) {
      if (this.h.f.i(var1.a, var1.b, var1.c)) {
         bq var2 = this.h.f.b(var1.a, var1.b, var1.c);
         if (var2 instanceof u) {
            u var3 = (u)var2;

            for(int var4 = 0; var4 < 4; ++var4) {
               var3.a[var4] = var1.d[var4];
            }

            var3.h();
         }
      }

   }

   public void a(gb var1) {
      this.a((gt)var1);
      if (this.h.h.bA != null && this.h.h.bA.f == var1.a) {
         this.h.h.bA.a(var1.b, var1.c);
      }

   }

   public void a(lw var1) {
      ia var2 = this.a(var1.a);
      if (var2 != null) {
         var2.c(var1.b, var1.c, var1.d);
      }

   }

   public void a(hi var1) {
      this.h.h.m();
   }

   public void a(agm var1) {
      this.h.f.f(var1.a, var1.b, var1.c, var1.d, var1.e);
   }

   public void a(ho var1) {
      int var2 = var1.b;
      if (var2 >= 0 && var2 < ho.a.length && ho.a[var2] != null) {
         this.h.h.b(ho.a[var2]);
      }

      if (var2 == 1) {
         this.i.z().b(true);
         this.i.k(1.0F);
      } else if (var2 == 2) {
         this.i.z().b(false);
         this.i.k(0.0F);
      } else if (var2 == 3) {
         ((zn)this.h.c).a(var1.c == 1);
      } else if (var2 == 4) {
         this.h.a((xe)(new lt()));
      }

   }

   public void a(aej var1) {
      if (var1.a == acy.bc.bM) {
         bv.a(var1.b, this.h.f).a(var1.c);
      } else {
         System.out.println("Unknown itemid: " + var1.b);
      }

   }

   public void a(sh var1) {
      this.h.f.g(var1.a, var1.c, var1.d, var1.e, var1.b);
   }

   public void a(zl var1) {
      ((cx)this.h.h).b(ny.a(var1.a), var1.b);
   }

   public void a(ij var1) {
      ia var2 = this.a(var1.a);
      if (var2 != null && var2 instanceof nq) {
         ((nq)var2).a(new s(var1.b, var1.d, var1.c));
      }
   }

   public void a(af var1) {
      ia var2 = this.a(var1.a);
      if (var2 != null && var2 instanceof nq) {
         ((nq)var2).j(var1.b);
      }
   }

   public boolean a() {
      return false;
   }

   public void a(oz var1) {
      ao var2 = (ao)this.k.get(var1.a);
      if (var2 == null && var1.b) {
         var2 = new ao(var1.a);
         this.k.put(var1.a, var2);
         this.c.add(var2);
      }

      if (var2 != null && !var1.b) {
         this.k.remove(var1.a);
         this.c.remove(var2);
      }

      if (var1.b && var2 != null) {
         var2.b = var1.c;
      }

   }

   public void a(wf var1) {
      this.c(new wf(var1.a));
   }
}
