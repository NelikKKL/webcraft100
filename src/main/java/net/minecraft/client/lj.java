package net.minecraft.client;

public class lj extends acq {
   public lj(al var1, float var2) {
      super(var1, var2);
   }

   public void a(adr var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((nq)var1, var2, var4, var6, var8, var9);
   }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   public void a(nq v0, double v1, double v2, double v3, float v4, float v5) { this.a((adr)v0, v1, v2, v3, v4, v5); }
}
