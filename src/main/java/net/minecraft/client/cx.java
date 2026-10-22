package net.minecraft.client;

import net.minecraft.client.Minecraft;

public class cx extends di {
   public abp a;
   private int cj = 0;
   private boolean ck = false;
   private double cl;
   private double cm;
   private double cn;
   private double co;
   private float cp;
   private float cq;
   private boolean cr = false;
   private boolean cs = false;
   private boolean ct = false;
   private int cu = 0;

   public cx(Minecraft var1, ry var2, dr var3, abp var4) {
      super(var1, var2, var3, 0);
      this.a = var4;
   }

   public boolean a(pm var1, int var2) {
      return false;
   }

   public void a_(int var1) {
   }

   public void a() {
      if (this.o.i(me.c(this.s), this.o.c / 2, me.c(this.u))) {
         super.a();
         this.k_();
      }
   }

   public void k_() {
      if (this.cj++ == 20) {
         this.j();
         this.cj = 0;
      }

      boolean var1 = this.X();
      if (var1 != this.ct) {
         if (var1) {
            this.a.c(new ag(this, 4));
         } else {
            this.a.c(new ag(this, 5));
         }

         this.ct = var1;
      }

      boolean var2 = this.q();
      if (var2 != this.cs) {
         if (var2) {
            this.a.c(new ag(this, 1));
         } else {
            this.a.c(new ag(this, 2));
         }

         this.cs = var2;
      }

      double var3 = this.s - this.cl;
      double var5 = this.C.b - this.cm;
      double var7 = this.t - this.cn;
      double var9 = this.u - this.co;
      double var11 = (double)(this.y - this.cp);
      double var13 = (double)(this.z - this.cq);
      boolean var15 = var5 != (double)0.0F || var7 != (double)0.0F || var3 != (double)0.0F || var9 != (double)0.0F;
      boolean var16 = var11 != (double)0.0F || var13 != (double)0.0F;
      if (this.n != null) {
         if (var16) {
            this.a.c(new vb(this.v, (double)-999.0F, (double)-999.0F, this.x, this.D));
         } else {
            this.a.c(new ul(this.v, (double)-999.0F, (double)-999.0F, this.x, this.y, this.z, this.D));
         }

         var15 = false;
      } else if (var15 && var16) {
         this.a.c(new ul(this.s, this.C.b, this.t, this.u, this.y, this.z, this.D));
         this.cu = 0;
      } else if (var15) {
         this.a.c(new vb(this.s, this.C.b, this.t, this.u, this.D));
         this.cu = 0;
      } else if (var16) {
         this.a.c(new aht(this.y, this.z, this.D));
         this.cu = 0;
      } else {
         this.a.c(new hk(this.D));
         if (this.cr == this.D && this.cu <= 200) {
            ++this.cu;
         } else {
            this.cu = 0;
         }
      }

      this.cr = this.D;
      if (var15) {
         this.cl = this.s;
         this.cm = this.C.b;
         this.cn = this.t;
         this.co = this.u;
      }

      if (var16) {
         this.cp = this.y;
         this.cq = this.z;
      }

   }

   public void l_() {
      this.a.c(new sm(4, 0, 0, 0, 0));
   }

   public void j() {
   }

   protected void a(ih var1) {
   }

   public void a(String var1) {
      this.a.c(new abb(var1));
   }

   public void m_() {
      super.m_();
      this.a.c(new abu(this, 1));
   }

   public void n_() {
      this.j();
      this.a.c(new aep((byte)this.bK, (byte)this.o.v, this.o.t(), this.o.c, 0));
   }

   protected void b(pm var1, int var2) {
      this.h(this.ag() - var2);
   }

   public void m() {
      this.a.c(new hi(this.bA.f));
      this.by.b((dk)null);
      super.m();
   }

   public void b(int var1) {
      if (this.ck) {
         super.b(var1);
      } else {
         this.h(var1);
         this.ck = true;
      }

   }

   public void a(px var1, int var2) {
      if (var1 != null) {
         if (var1.c) {
            super.a(var1, var2);
         }

      }
   }

   public void b(px var1, int var2) {
      if (var1 != null) {
         if (!var1.c) {
            super.a(var1, var2);
         }

      }
   }
}
