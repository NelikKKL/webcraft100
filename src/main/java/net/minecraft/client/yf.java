package net.minecraft.client;

public class yf extends acq {
   public yf(al var1, al var2, float var3) {
      super(var1, var3);
      this.a(var2);
   }

   protected int a(fd var1, int var2, float var3) {
      this.a("/mob/saddle.png");
      return var2 == 0 && var1.t_() ? 1 : -1;
   }

   public void a(fd var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((nq)var1, var2, var4, var6, var8, var9);
   }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected int a(nq v0, int v1, float v2) { return this.a((fd)v0, v1, v2); }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   public void a(nq v0, double v1, double v2, double v3, float v4, float v5) { this.a((fd)v0, v1, v2, v3, v4, v5); }
}
