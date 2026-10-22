package net.minecraft.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class xd extends du {
   private acr b;

   public void a(agb var1, double var2, double var4, double var6, float var8) {
      yy var9 = yy.k[var1.a()];
      if (var9 != null && var1.a(var8) < 1.0F) {
         cv var10 = cv.a;
         this.a("/terrain.png");
         rt.a();
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         if (Minecraft.t()) {
            GL11.glShadeModel(7425);
         } else {
            GL11.glShadeModel(7424);
         }

         var10.b();
         var10.b((double)((float)var2 - (float)var1.d + var1.b(var8)), (double)((float)var4 - (float)var1.e + var1.c(var8)), (double)((float)var6 - (float)var1.f + var1.d(var8)));
         var10.a(1, 1, 1);
         if (var9 == yy.aa && var1.a(var8) < 0.5F) {
            this.b.a(var9, var1.d, var1.e, var1.f, false);
         } else if (var1.e() && !var1.c()) {
            yy.aa.e(((abr)var9).s());
            this.b.a(yy.aa, var1.d, var1.e, var1.f, var1.a(var8) < 0.5F);
            yy.aa.s();
            var10.b((double)((float)var2 - (float)var1.d), (double)((float)var4 - (float)var1.e), (double)((float)var6 - (float)var1.f));
            this.b.d(var9, var1.d, var1.e, var1.f);
         } else {
            this.b.a(var9, var1.d, var1.e, var1.f);
         }

         var10.b((double)0.0F, (double)0.0F, (double)0.0F);
         var10.a();
         rt.b();
      }

   }

   public void a(ry var1) {
      this.b = new acr(var1);
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(bq v0, double v1, double v2, double v3, float v4) { this.a((agb)v0, v1, v2, v3, v4); }
}
