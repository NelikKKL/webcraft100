package net.minecraft.client;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class ah {
   private Map m = new HashMap();
   public static ah a = new ah();
   private abe n;
   public static double b;
   public static double c;
   public static double d;
   public zh e;
   public ry f;
   public nq g;
   public float h;
   public float i;
   public double j;
   public double k;
   public double l;

   private ah() {
      this.m.put(u.class, new aeu());
      this.m.put(ze.class, new on());
      this.m.put(agb.class, new xd());
      this.m.put(tu.class, new fv());
      this.m.put(rq.class, new wn());
      this.m.put(yg.class, new abi());

      for(du var2 : (Iterable<du>)(Iterable)(this.m.values())) {
         var2.a(this);
      }

   }

   public du a(Class var1) {
      du var2 = (du)this.m.get(var1);
      if (var2 == null && var1 != bq.class) {
         var2 = this.a(var1.getSuperclass());
         this.m.put(var1, var2);
      }

      return var2;
   }

   public boolean a(bq var1) {
      return this.b(var1) != null;
   }

   public du b(bq var1) {
      return var1 == null ? null : this.a(var1.getClass());
   }

   public void a(ry var1, zh var2, abe var3, nq var4, float var5) {
      if (this.f != var1) {
         this.a(var1);
      }

      this.e = var2;
      this.g = var4;
      this.n = var3;
      this.h = var4.A + (var4.y - var4.A) * var5;
      this.i = var4.B + (var4.z - var4.B) * var5;
      this.j = var4.R + (var4.s - var4.R) * (double)var5;
      this.k = var4.S + (var4.t - var4.S) * (double)var5;
      this.l = var4.T + (var4.u - var4.T) * (double)var5;
   }

   public void a() {
   }

   public void a(bq var1, float var2) {
      if (var1.a(this.j, this.k, this.l) < (double)4096.0F) {
         int var3 = this.f.a(var1.d, var1.e, var1.f, 0);
         int var4 = var3 % 65536;
         int var5 = var3 / 65536;
         adx.a(adx.b, (float)var4 / 1.0F, (float)var5 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.a(var1, (double)var1.d - b, (double)var1.e - c, (double)var1.f - d, var2);
      }

   }

   public void a(bq var1, double var2, double var4, double var6, float var8) {
      du var9 = this.b(var1);
      if (var9 != null) {
         var9.a(var1, var2, var4, var6, var8);
      }

   }

   public void a(ry var1) {
      this.f = var1;

      for(du var3 : (Iterable<du>)(Iterable)(this.m.values())) {
         if (var3 != null) {
            var3.a(var1);
         }
      }

   }

   public abe b() {
      return this.n;
   }
}
