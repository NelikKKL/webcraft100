package net.minecraft.client;

public class acb extends acq {
   public acb(al var1, float var2) {
      super(var1, var2);
   }

   public void a(aik var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((nq)var1, var2, var4, var6, var8, var9);
   }

   protected float a(aik var1, float var2) {
      return var1.ay();
   }

   protected void b(aik var1, float var2) {
   }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   public void a(nq v0, double v1, double v2, double v3, float v4, float v5) { this.a((aik)v0, v1, v2, v3, v4, v5); }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected void b(nq v0, float v1) { this.b((aik)v0, v1); }

   // PATCH(bridge3): float-хук RenderLiving.c(nq,float) (угол крыла/хвоста/щупалец), переопределён методом с другим именем
   protected float c(nq v0, float v1) { return this.a((aik)v0, v1); }
}
