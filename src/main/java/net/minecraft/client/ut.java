package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public class ut {
   public static int a;
   public static int b;
   public static int c;
   public static int d;
   public static List e = new ArrayList();
   public static ws f;
   public static ws g;
   public static ws h;
   public static ws i;
   public static ws j;
   public static ws k;
   public static ws l;
   public static ws m;
   public static ws n;
   public static ws o;
   public static ws p;
   public static ws q;
   public static ws r;
   public static ws s;
   public static ws t;
   public static ws u;
   public static ws v;
   public static ws w;
   public static ws x;
   public static ws y;
   public static ws z;
   public static ws A;
   public static ws B;
   public static ws C;
   public static ws D;
   public static ws E;
   public static ws F;

   public static void a() {
   }

   static {
      f = (new ws(0, "openInventory", 0, 0, acy.aK, (ws)null)).f().h();
      g = (new ws(1, "mineWood", 2, 1, yy.J, f)).h();
      h = (new ws(2, "buildWorkBench", 4, -1, yy.ay, g)).h();
      i = (new ws(3, "buildPickaxe", 4, 2, acy.s, h)).h();
      j = (new ws(4, "buildFurnace", 3, 4, yy.aC, i)).h();
      k = (new ws(5, "acquireIron", 1, 4, acy.n, j)).h();
      l = (new ws(6, "buildHoe", 2, -3, acy.M, h)).h();
      m = (new ws(7, "makeBread", -1, -3, acy.T, l)).h();
      n = (new ws(8, "bakeCake", 0, -5, acy.aY, l)).h();
      o = (new ws(9, "buildBetterPickaxe", 6, 2, acy.w, i)).h();
      p = (new ws(10, "cookFish", 2, 6, acy.aU, j)).h();
      q = (new ws(11, "onARail", 2, 3, yy.aG, k)).g().h();
      r = (new ws(12, "buildSword", 6, -1, acy.q, h)).h();
      s = (new ws(13, "killEnemy", 8, -1, acy.aW, r)).h();
      t = (new ws(14, "killCow", 7, -3, acy.aE, r)).h();
      u = (new ws(15, "flyPig", 8, -4, acy.az, t)).g().h();
      v = (new ws(16, "snipeSkeleton", 7, 0, acy.j, s)).g().h();
      w = (new ws(17, "diamonds", -1, 5, acy.m, k)).h();
      x = (new ws(18, "portal", -1, 7, yy.ap, w)).h();
      y = (new ws(19, "ghast", -4, 8, acy.bo, x)).g().h();
      z = (new ws(20, "blazeRod", 0, 9, acy.bn, x)).h();
      A = (new ws(21, "potion", 2, 8, acy.br, z)).h();
      B = (new ws(22, "theEnd", 3, 10, acy.bz, z)).g().h();
      C = (new ws(23, "theEnd2", 4, 13, yy.bK, B)).g().h();
      D = (new ws(24, "enchantments", -4, 4, yy.bE, w)).h();
      E = (new ws(25, "overkill", -4, 1, acy.y, D)).g().h();
      F = (new ws(26, "bookcase", -3, 6, yy.an, D)).h();
      System.out.println(e.size() + " achievements");
   }
}
