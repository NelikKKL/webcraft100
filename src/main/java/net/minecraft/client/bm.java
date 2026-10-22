package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public class bm {
   private static int a = 256;
   private static List b = new ArrayList();
   private static List c = new ArrayList();
   private static List d = new ArrayList();
   private static List e = new ArrayList();

   public static int[] a(int var0) {
      if (var0 <= 256) {
         if (b.size() == 0) {
            int[] var5 = new int[256];
            c.add(var5);
            return var5;
         } else {
            int[] var4 = (int[])b.remove(b.size() - 1);
            c.add(var4);
            return var4;
         }
      } else if (var0 > a) {
         a = var0;
         d.clear();
         e.clear();
         int[] var3 = new int[a];
         e.add(var3);
         return var3;
      } else if (d.size() == 0) {
         int[] var2 = new int[a];
         e.add(var2);
         return var2;
      } else {
         int[] var1 = (int[])d.remove(d.size() - 1);
         e.add(var1);
         return var1;
      }
   }

   public static void a() {
      if (d.size() > 0) {
         d.remove(d.size() - 1);
      }

      if (b.size() > 0) {
         b.remove(b.size() - 1);
      }

      d.addAll(e);
      b.addAll(c);
      e.clear();
      c.clear();
   }
}
