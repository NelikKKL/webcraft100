package net.minecraft.client;

import java.util.List;
import org.lwjgl.opengl.GL11;

class ju extends jn {
   // $FF: synthetic field
   final lb a;

   public ju(lb var1) {
      super(lb.a(var1), var1.m, var1.n, 32, var1.n - 55 + 4, 36);
      this.a = var1;
   }

   protected int a() {
      List var1 = lb.b(this.a).E.b();
      return var1.size();
   }

   protected void a(int var1, boolean var2) {
      List var3 = lb.c(this.a).E.b();

      try {
         lb.d(this.a).E.a((afs)var3.get(var1));
         lb.e(this.a).p.b();
      } catch (Exception var5) {
         lb.f(this.a).E.a((afs)var3.get(0));
         lb.g(this.a).p.b();
      }

   }

   protected boolean a(int var1) {
      List var2 = lb.h(this.a).E.b();
      return lb.i(this.a).E.a == var2.get(var1);
   }

   protected int b() {
      return this.a() * 36;
   }

   protected void c() {
      this.a.j();
   }

   protected void a(int var1, int var2, int var3, int var4, cv var5) {
      afs var6 = (afs)lb.j(this.a).E.b().get(var1);
      var6.b(lb.k(this.a));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var5.b();
      var5.c(16777215);
      var5.a((double)var2, (double)(var3 + var4), (double)0.0F, (double)0.0F, (double)1.0F);
      var5.a((double)(var2 + 32), (double)(var3 + var4), (double)0.0F, (double)1.0F, (double)1.0F);
      var5.a((double)(var2 + 32), (double)var3, (double)0.0F, (double)1.0F, (double)0.0F);
      var5.a((double)var2, (double)var3, (double)0.0F, (double)0.0F, (double)0.0F);
      var5.a();
      this.a.b(lb.l(this.a), var6.a, var2 + 32 + 2, var3 + 1, 16777215);
      this.a.b(lb.m(this.a), var6.b, var2 + 32 + 2, var3 + 12, 8421504);
      this.a.b(lb.n(this.a), var6.c, var2 + 32 + 2, var3 + 12 + 10, 8421504);
   }
}
