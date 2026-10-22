package net.minecraft.client;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class on extends du {
   private Map b = new HashMap();

   public void a(ze var1, double var2, double var4, double var6, float var8) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      ia var9 = (ia)this.b.get(var1.a());
      if (var9 == null) {
         var9 = afw.a((String)var1.a(), (ry)null);
         this.b.put(var1.a(), var9);
      }

      if (var9 != null) {
         var9.a(var1.c);
         float var10 = 0.4375F;
         GL11.glTranslatef(0.0F, 0.4F, 0.0F);
         GL11.glRotatef((float)(var1.j + (var1.b - var1.j) * (double)var8) * 10.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.4F, 0.0F);
         GL11.glScalef(var10, var10, var10);
         var9.c(var2, var4, var6, 0.0F, 0.0F);
         wb.a.a(var9, (double)0.0F, (double)0.0F, (double)0.0F, 0.0F, var8);
      }

      GL11.glPopMatrix();
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(bq v0, double v1, double v2, double v3, float v4) { this.a((ze)v0, v1, v2, v3, v4); }
}
