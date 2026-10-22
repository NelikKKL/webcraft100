package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class gc extends bw {
   public aaz a;
   public List b = new ArrayList();
   public List c;
   public ArrayList d = new ArrayList();

   public gc(Random var1, int var2, int var3) {
      super(var1, var2, var3);

      for(aaz var7 : rp.a()) {
         var7.c = 0;
         this.b.add(var7);
      }

      this.c = new ArrayList();

      for(aaz var11 : rp.b()) {
         var11.c = 0;
         this.c.add(var11);
      }

   }
}
