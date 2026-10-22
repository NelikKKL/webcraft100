package net.minecraft.client;

public class zu extends ads {
   private static yy[] bR;

   protected zu(int var1, nu var2) {
      super(var1, 2, var2, bR);
   }

   public boolean a(yy var1) {
      if (var1 == yy.ap) {
         return this.b.d() == 3;
      } else if (var1 != yy.ax && var1 != yy.aw) {
         if (var1 != yy.ah && var1 != yy.G) {
            if (var1 != yy.ai && var1 != yy.H) {
               if (var1 != yy.O && var1 != yy.N) {
                  if (var1 != yy.aN && var1 != yy.aO) {
                     if (var1.bZ == net.minecraft.client.p.e) {
                        return true;
                     } else {
                        return var1.bZ == net.minecraft.client.p.f;
                     }
                  } else {
                     return this.b.d() >= 2;
                  }
               } else {
                  return this.b.d() >= 1;
               }
            } else {
               return this.b.d() >= 1;
            }
         } else {
            return this.b.d() >= 2;
         }
      } else {
         return this.b.d() >= 2;
      }
   }

   public float a(dk var1, yy var2) {
      return var2 == null || var2.bZ != net.minecraft.client.p.f && var2.bZ != net.minecraft.client.p.e ? super.a(var1, var2) : this.a;
   }

   static {
      bR = new yy[]{yy.w, yy.aj, yy.ak, yy.t, yy.Q, yy.ao, yy.H, yy.ai, yy.I, yy.ah, yy.G, yy.aw, yy.ax, yy.aT, yy.bb, yy.N, yy.O, yy.aN, yy.aO, yy.aG, yy.U, yy.T};
   }
}
