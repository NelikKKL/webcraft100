package net.minecraft.client;

public class mq extends yy {
   public mq(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.o);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      float var5 = 0.125F;
      return net.minecraft.client.c.b((double)var2, (double)var3, (double)var4, (double)(var2 + 1), (double)((float)(var3 + 1) - var5), (double)(var4 + 1));
   }

   public void a(ry var1, int var2, int var3, int var4, ia var5) {
      var5.v *= 0.4;
      var5.x *= 0.4;
   }
}
