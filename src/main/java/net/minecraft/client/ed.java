package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public class ed extends hl {
   private List e = new ArrayList();

   public ed() {
      this.e.add(new yx(qf.class, 10, 2, 3));
      this.e.add(new yx(jm.class, 10, 4, 4));
      this.e.add(new yx(aea.class, 3, 4, 4));
   }

   public List b() {
      return this.e;
   }

   protected boolean a(int var1, int var2) {
      int var3 = var1 >> 4;
      int var4 = var2 >> 4;
      this.b.setSeed((long)(var3 ^ var4 << 4) ^ this.c.t());
      this.b.nextInt();
      if (this.b.nextInt(3) != 0) {
         return false;
      } else if (var1 != (var3 << 4) + 4 + this.b.nextInt(8)) {
         return false;
      } else {
         return var2 == (var4 << 4) + 4 + this.b.nextInt(8);
      }
   }

   protected oa b(int var1, int var2) {
      return new tg(this.c, this.b, var1, var2);
   }
}
