package net.minecraft.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class al {
   public float a;
   public boolean b = false;
   public List c = new ArrayList();
   public boolean d = true;
   private Map g = new HashMap();
   public int e = 64;
   public int f = 32;

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
   }

   public void a(nq var1, float var2, float var3, float var4) {
   }

   protected void a(String var1, int var2, int var3) {
      this.g.put(var1, new sx(var2, var3));
   }

   public sx a(String var1) {
      return (sx)this.g.get(var1);
   }
}
