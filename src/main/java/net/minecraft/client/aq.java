package net.minecraft.client;

public class aq extends acq {
   private int a;

   public aq() {
      super(new adm(), 0.5F);
      this.a = ((adm)this.g).a();
   }

   public void a(qf var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = ((adm)this.g).a();
      if (var10 != this.a) {
         this.a = var10;
         this.g = new adm();
      }

      super.a((nq)var1, var2, var4, var6, var8, var9);
   }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   public void a(nq v0, double v1, double v2, double v3, float v4, float v5) { this.a((qf)v0, v1, v2, v3, v4, v5); }
}
