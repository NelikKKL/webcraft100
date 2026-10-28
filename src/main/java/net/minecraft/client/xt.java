package net.minecraft.client;

public class xt extends acq {
   private int a;

   public xt() {
      super(new aaq(), 0.3F);
   }

   protected float a(gl var1) {
      return 180.0F;
   }

   public void a(gl var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = ((aaq)this.g).a();
      if (var10 != this.a) {
         this.a = var10;
         this.g = new aaq();
         System.out.println("new silverfish model");
      }

      super.a((nq)var1, var2, var4, var6, var8, var9);
   }

   protected int a(gl var1, int var2, float var3) {
      return -1;
   }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected float a(nq v0) { return this.a((gl)v0); }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   public void a(nq v0, double v1, double v2, double v3, float v4, float v5) { this.a((gl)v0, v1, v2, v3, v4, v5); }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected int a(nq v0, int v1, float v2) { return this.a((gl)v0, v1, v2); }
}
