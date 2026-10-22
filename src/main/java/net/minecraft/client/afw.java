package net.minecraft.client;

import java.util.HashMap;
import java.util.Map;

public class afw {
   private static Map a = new HashMap();
   private static Map b = new HashMap();
   private static Map c = new HashMap();
   private static Map d = new HashMap();

   private static void a(Class var0, String var1, int var2) {
      a.put(var1, var0);
      b.put(var0, var1);
      c.put(var2, var0);
      d.put(var0, var2);
   }

   public static ia a(String var0, ry var1) {
      ia var2 = null;

      try {
         Class var3 = (Class)a.get(var0);
         if (var3 != null) {
            var2 = (ia)var3.getConstructor(ry.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static ia a(ik var0, ry var1) {
      ia var2 = null;

      try {
         Class var3 = (Class)a.get(var0.i("id"));
         if (var3 != null) {
            var2 = (ia)var3.getConstructor(ry.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 != null) {
         var2.e(var0);
      } else {
         System.out.println("Skipping Entity with id " + var0.i("id"));
      }

      return var2;
   }

   public static ia a(int var0, ry var1) {
      ia var2 = null;

      try {
         Class var3 = (Class)c.get(var0);
         if (var3 != null) {
            var2 = (ia)var3.getConstructor(ry.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 == null) {
         System.out.println("Skipping Entity with id " + var0);
      }

      return var2;
   }

   public static int a(ia var0) {
      return (Integer)d.get(var0.getClass());
   }

   public static String b(ia var0) {
      return (String)b.get(var0.getClass());
   }

   static {
      a(ih.class, "Item", 1);
      a(fk.class, "XPOrb", 2);
      a(tj.class, "Painting", 9);
      a(ro.class, "Arrow", 10);
      a(aah.class, "Snowball", 11);
      a(aad.class, "Fireball", 12);
      a(yn.class, "SmallFireball", 13);
      a(tm.class, "ThrownEnderpearl", 14);
      a(bs.class, "EyeOfEnderSignal", 15);
      a(dd.class, "PrimedTnt", 20);
      a(uo.class, "FallingSand", 21);
      a(vm.class, "Minecart", 40);
      a(no.class, "Boat", 41);
      a(nq.class, "Mob", 48);
      a(zo.class, "Monster", 49);
      a(abh.class, "Creeper", 50);
      a(it.class, "Skeleton", 51);
      a(vq.class, "Spider", 52);
      a(abc.class, "Giant", 53);
      a(gr.class, "Zombie", 54);
      a(aed.class, "Slime", 55);
      a(is.class, "Ghast", 56);
      a(jm.class, "PigZombie", 57);
      a(aii.class, "Enderman", 58);
      a(aco.class, "CaveSpider", 59);
      a(gl.class, "Silverfish", 60);
      a(qf.class, "Blaze", 61);
      a(aea.class, "LavaSlime", 62);
      a(oo.class, "EnderDragon", 63);
      a(fd.class, "Pig", 90);
      a(hm.class, "Sheep", 91);
      a(adr.class, "Cow", 92);
      a(qh.class, "Chicken", 93);
      a(yv.class, "Squid", 94);
      a(aik.class, "Wolf", 95);
      a(tb.class, "MushroomCow", 96);
      a(ahd.class, "SnowMan", 97);
      a(ai.class, "Villager", 120);
      a(sf.class, "EnderCrystal", 200);
   }
}
