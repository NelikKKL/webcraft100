package net.minecraft.client;

import java.io.File;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class lb extends xe {
   protected xe a;
   private int b = -1;
   private String c = "";
   private ju d;

   public lb(xe var1) {
      this.a = var1;
   }

   public void a() {
      qp var1 = qp.a();
      this.o.add(new abs(5, this.m / 2 - 154, this.n - 48, var1.a("texturePack.openFolder")));
      this.o.add(new abs(6, this.m / 2 + 4, this.n - 48, var1.a("gui.done")));
      this.l.E.a();
      this.c = (new File(Minecraft.b(), "texturepacks")).getAbsolutePath();
      this.d = new ju(this);
      this.d.a(this.o, 7, 8);
   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f == 5) {
            // PATCH(texturepacks): вместо папки — системный выбор .zip (разбор в web/extras.js)
            net.minecraft.client.web.TexturePackStore.openFilePicker();
         } else if (var1.f == 6) {
            this.l.p.b();
            this.l.a(this.a);
         } else {
            this.d.a(var1);
         }

      }
   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   protected void b(int var1, int var2, int var3) {
      super.b(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      this.d.a(var1, var2, var3);
      if (this.b <= 0) {
         this.l.E.a();
         this.b += 20;
      }

      qp var4 = qp.a();
      this.a(this.q, var4.a("texturePack.title"), this.m / 2, 16, 16777215);
      this.a(this.q, "Or drop a .zip file onto the window", this.m / 2 - 77, this.n - 26, 8421504);
      super.a(var1, var2, var3);
   }

   public void s_() {
      super.s_();
      --this.b;
   }

   // $FF: synthetic method
   static Minecraft a(lb var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static Minecraft b(lb var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static Minecraft c(lb var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static Minecraft d(lb var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static Minecraft e(lb var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static Minecraft f(lb var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static Minecraft g(lb var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static Minecraft h(lb var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static Minecraft i(lb var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static Minecraft j(lb var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static Minecraft k(lb var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static abe l(lb var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static abe m(lb var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static abe n(lb var0) {
      return var0.q;
   }
}
