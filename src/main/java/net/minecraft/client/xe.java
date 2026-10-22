package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class xe extends ht {
   protected Minecraft l;
   public int m;
   public int n;
   protected List o = new ArrayList();
   public boolean p = false;
   protected abe q;
   public vg r;
   private ct a = null;

   public void a(int var1, int var2, float var3) {
      for(int var4 = 0; var4 < this.o.size(); ++var4) {
         ct var5 = (ct)this.o.get(var4);
         var5.a(this.l, var1, var2);
      }

   }

   protected void a(char var1, int var2) {
      if (var2 == 1) {
         this.l.a((xe)null);
         this.l.g();
      }

   }

   public static String f() {
      // PATCH(1.0.0): буфер обмена браузера (window.__clipText обновляется на paste-событии, см. index.html)
      return net.minecraft.client.web.ClipboardBridge.get();
   }

   protected void a(int var1, int var2, int var3) {
      if (var3 == 0) {
         for(int var4 = 0; var4 < this.o.size(); ++var4) {
            ct var5 = (ct)this.o.get(var4);
            if (var5.c(this.l, var1, var2)) {
               this.a = var5;
               this.l.C.a("random.click", 1.0F, 1.0F);
               this.a(var5);
            }
         }
      }

   }

   protected void b(int var1, int var2, int var3) {
      if (this.a != null && var3 == 0) {
         this.a.a(var1, var2);
         this.a = null;
      }

   }

   protected void a(ct var1) {
   }

   public void a(Minecraft var1, int var2, int var3) {
      this.r = new vg(var1);
      this.l = var1;
      this.q = var1.q;
      this.m = var2;
      this.n = var3;
      this.o.clear();
      this.a();
   }

   public void a() {
   }

   public void g() {
      while(Mouse.next()) {
         this.h();
      }

      while(Keyboard.next()) {
         this.i();
      }

   }

   public void h() {
      if (Mouse.getEventButtonState()) {
         int var1 = Mouse.getEventX() * this.m / this.l.d;
         int var2 = this.n - Mouse.getEventY() * this.n / this.l.e - 1;
         this.a(var1, var2, Mouse.getEventButton());
      } else {
         int var3 = Mouse.getEventX() * this.m / this.l.d;
         int var4 = this.n - Mouse.getEventY() * this.n / this.l.e - 1;
         this.b(var3, var4, Mouse.getEventButton());
      }

   }

   public void i() {
      if (Keyboard.getEventKeyState()) {
         if (Keyboard.getEventKey() == 87) {
            this.l.j();
            return;
         }

         this.a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
      }

   }

   public void s_() {
   }

   public void d() {
   }

   public void j() {
      this.a(0);
   }

   public void a(int var1) {
      if (this.l.f != null) {
         this.a(0, 0, this.m, this.n, -1072689136, -804253680);
      } else {
         this.b(var1);
      }

   }

   public void b(int var1) {
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      cv var2 = cv.a;
      GL11.glBindTexture(3553, this.l.p.b("/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var3 = 32.0F;
      var2.b();
      var2.c(4210752);
      var2.a((double)0.0F, (double)this.n, (double)0.0F, (double)0.0F, (double)((float)this.n / var3 + (float)var1));
      var2.a((double)this.m, (double)this.n, (double)0.0F, (double)((float)this.m / var3), (double)((float)this.n / var3 + (float)var1));
      var2.a((double)this.m, (double)0.0F, (double)0.0F, (double)((float)this.m / var3), (double)(0 + var1));
      var2.a((double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)(0 + var1));
      var2.a();
   }

   public boolean b() {
      return true;
   }

   public void a(boolean var1, int var2) {
   }

   public void k() {
   }
}
