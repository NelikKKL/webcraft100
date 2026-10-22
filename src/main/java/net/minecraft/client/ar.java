package net.minecraft.client;

import java.io.File;
import java.util.List;

public class ar extends e {
   public ar(File var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public d a(k var1) {
      File var2 = this.a();
      if (var1 instanceof aau) {
         File var4 = new File(var2, "DIM-1");
         var4.mkdirs();
         return new tn(var4);
      } else if (var1 instanceof ol) {
         File var3 = new File(var2, "DIM1");
         var3.mkdirs();
         return new tn(var3);
      } else {
         return new tn(var2);
      }
   }

   public void a(si var1, List var2) {
      var1.d(19132);
      super.a(var1, var2);
   }
}
