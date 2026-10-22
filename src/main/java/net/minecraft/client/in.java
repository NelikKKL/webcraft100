package net.minecraft.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class in extends xe {
   private static iw c = new iw();
   protected xe a;
   protected String b = "Select world";
   private b d;
   private xa e;
   private hz f;
   private tk g;
   private jn h = null;

   public in(xe var1, tk var2) {
      this.a = var1;
      this.g = var2;
   }

   public void a() {
      this.b = hj.a("gui.stats");
      this.d = new b(this);
      this.d.a(this.o, 1, 1);
      this.e = new xa(this);
      this.e.a(this.o, 1, 1);
      this.f = new hz(this);
      this.f.a(this.o, 1, 1);
      this.h = this.d;
      this.e();
   }

   public void e() {
      qp var1 = qp.a();
      this.o.add(new ct(0, this.m / 2 + 4, this.n - 28, 150, 20, var1.a("gui.done")));
      this.o.add(new ct(1, this.m / 2 - 154, this.n - 52, 100, 20, var1.a("stat.generalButton")));
      ct var2;
      this.o.add(var2 = new ct(2, this.m / 2 - 46, this.n - 52, 100, 20, var1.a("stat.blocksButton")));
      ct var3;
      this.o.add(var3 = new ct(3, this.m / 2 + 62, this.n - 52, 100, 20, var1.a("stat.itemsButton")));
      if (this.f.a() == 0) {
         var2.g = false;
      }

      if (this.e.a() == 0) {
         var3.g = false;
      }

   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f == 0) {
            this.l.a(this.a);
         } else if (var1.f == 1) {
            this.h = this.d;
         } else if (var1.f == 3) {
            this.h = this.e;
         } else if (var1.f == 2) {
            this.h = this.f;
         } else {
            this.h.a(var1);
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.h.a(var1, var2, var3);
      this.a(this.q, this.b, this.m / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }

   private void c(int var1, int var2, int var3) {
      this.a(var1 + 1, var2 + 1);
      GL11.glEnable(32826);
      rt.c();
      c.a(this.q, this.l.p, var3, 0, acy.d[var3].a(0), var1 + 2, var2 + 2);
      rt.a();
      GL11.glDisable(32826);
   }

   private void a(int var1, int var2) {
      this.c(var1, var2, 0, 0);
   }

   private void c(int var1, int var2, int var3, int var4) {
      int var5 = this.l.p.b("/gui/slot.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.l.p.b(var5);
      cv var10 = cv.a;
      var10.b();
      var10.a((double)(var1 + 0), (double)(var2 + 18), (double)this.i, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.a((double)(var1 + 18), (double)(var2 + 18), (double)this.i, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.a((double)(var1 + 18), (double)(var2 + 0), (double)this.i, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.a((double)(var1 + 0), (double)(var2 + 0), (double)this.i, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.a();
   }

   // $FF: synthetic method
   static Minecraft a(in var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static abe b(in var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static tk c(in var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static abe d(in var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static abe e(in var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static Minecraft f(in var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static void a(in var0, int var1, int var2, int var3, int var4) {
      var0.c(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   static Minecraft g(in var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static abe h(in var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static abe i(in var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static abe j(in var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static abe k(in var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static abe l(in var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static void a(in var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.a(var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   static abe m(in var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static abe n(in var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static void b(in var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.a(var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   static abe o(in var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static void a(in var0, int var1, int var2, int var3) {
      var0.c(var1, var2, var3);
   }
}
