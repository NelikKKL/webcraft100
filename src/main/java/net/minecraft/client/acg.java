package net.minecraft.client;

public class acg extends acy {
   public acg(int var1) {
      super(var1);
      this.bN = 1;
   }

   public void a(dk var1, nq var2) {
      if (var2 instanceof fd) {
         fd var3 = (fd)var2;
         if (!var3.t_()) {
            var3.b(true);
            --var1.a;
         }
      }

   }

   public boolean a(dk var1, nq var2, nq var3) {
      this.a(var1, var2);
      return true;
   }
}
