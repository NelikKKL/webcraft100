package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class gt {
   public static ob j = new ob();
   private static Map a = new HashMap();
   private static Set b = new HashSet();
   private static Set c = new HashSet();
   public final long k = System.currentTimeMillis();
   public boolean l = false;

   static void a(int var0, boolean var1, boolean var2, Class var3) {
      if (j.b(var0)) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      } else if (a.containsKey(var3)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var3);
      } else {
         j.a(var0, var3);
         a.put(var3, var0);
         if (var1) {
            b.add(var0);
         }

         if (var2) {
            c.add(var0);
         }

      }
   }

   public static gt a(int var0) throws java.io.IOException {
      try {
         Class var1 = (Class)j.a(var0);
         return var1 == null ? null : (gt)net.minecraft.client.Reflect.newEmpty(var1);
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public final int b() {
      return (Integer)a.get(this.getClass());
   }

   public static gt a(DataInputStream var0, boolean var1) throws java.io.IOException {
      int var2 = 0;
      gt var3 = null;

      try {
         var2 = var0.read();
         if (var2 == -1) {
            return null;
         }

         if (var1 && !c.contains(var2) || !var1 && !b.contains(var2)) {
            throw new IOException("Bad packet id " + var2);
         }

         var3 = a(var2);
         if (var3 == null) {
            throw new IOException("Bad packet id " + var2);
         }

         var3.a(var0);
      } catch (EOFException var5) {
         System.out.println("Reached end of stream");
         return null;
      }

      lg.a(var2, (long)var3.a());
      return var3;
   }

   public static void a(gt var0, DataOutputStream var1) throws java.io.IOException {
      var1.write(var0.b());
      var0.a(var1);
   }

   public static void a(String var0, DataOutputStream var1) throws java.io.IOException {
      if (var0.length() > 32767) {
         throw new IOException("String too big");
      } else {
         var1.writeShort(var0.length());
         var1.writeChars(var0);
      }
   }

   public static String a(DataInputStream var0, int var1) throws java.io.IOException {
      short var2 = var0.readShort();
      if (var2 > var1) {
         throw new IOException("Received string length longer than maximum allowed (" + var2 + " > " + var1 + ")");
      } else if (var2 < 0) {
         throw new IOException("Received string length is less than zero! Weird string!");
      } else {
         StringBuilder var3 = new StringBuilder();

         for(int var4 = 0; var4 < var2; ++var4) {
            var3.append(var0.readChar());
         }

         return var3.toString();
      }
   }

   public abstract void a(DataInputStream var1) throws java.io.IOException;

   public abstract void a(DataOutputStream var1) throws java.io.IOException;

   public abstract void a(fe var1);

   public abstract int a();

   protected dk b(DataInputStream var1) throws java.io.IOException {
      dk var2 = null;
      short var3 = var1.readShort();
      if (var3 >= 0) {
         byte var4 = var1.readByte();
         short var5 = var1.readShort();
         var2 = new dk(var3, var4, var5);
         if (acy.d[var3].h()) {
            var2.d = this.c(var1);
         }
      }

      return var2;
   }

   protected void a(dk var1, DataOutputStream var2) throws java.io.IOException {
      if (var1 == null) {
         var2.writeShort(-1);
      } else {
         var2.writeShort(var1.c);
         var2.writeByte(var1.a);
         var2.writeShort(var1.i());
         if (var1.a().h()) {
            this.a(var1.d, var2);
         }
      }

   }

   protected ik c(DataInputStream var1) throws java.io.IOException {
      short var2 = var1.readShort();
      if (var2 < 0) {
         return null;
      } else {
         byte[] var3 = new byte[var2];
         var1.readFully(var3);
         return vx.a(var3);
      }
   }

   protected void a(ik var1, DataOutputStream var2) throws java.io.IOException {
      if (var1 == null) {
         var2.writeShort(-1);
      } else {
         byte[] var3 = vx.a(var1);
         var2.writeShort((short)var3.length);
         var2.write(var3);
      }

   }

   static {
      a(0, true, true, wf.class);
      a(1, true, true, aj.class);
      a(2, true, true, hh.class);
      a(3, true, true, abb.class);
      a(4, true, false, cb.class);
      a(5, true, false, lw.class);
      a(6, true, false, aee.class);
      a(7, false, true, zm.class);
      a(8, true, false, qg.class);
      a(9, true, true, aep.class);
      a(10, true, true, hk.class);
      a(11, true, true, vb.class);
      a(12, true, true, aht.class);
      a(13, true, true, ul.class);
      a(14, false, true, sm.class);
      a(15, false, true, em.class);
      a(16, false, true, aio.class);
      a(17, true, false, aft.class);
      a(18, true, true, abu.class);
      a(19, false, true, ag.class);
      a(20, true, false, ph.class);
      a(21, true, false, ts.class);
      a(22, true, false, rc.class);
      a(23, true, false, gh.class);
      a(24, true, false, mn.class);
      a(25, true, false, yr.class);
      a(26, true, false, fi.class);
      a(27, false, true, zi.class);
      a(28, true, false, qm.class);
      a(29, true, false, fw.class);
      a(30, true, false, rd.class);
      a(31, true, false, y.class);
      a(32, true, false, ks.class);
      a(33, true, false, mc.class);
      a(34, true, false, be.class);
      a(38, true, false, bf.class);
      a(39, true, false, agx.class);
      a(40, true, false, se.class);
      a(41, true, false, ij.class);
      a(42, true, false, af.class);
      a(43, true, false, nw.class);
      a(50, true, false, t.class);
      a(51, true, false, kh.class);
      a(52, true, false, np.class);
      a(53, true, false, ack.class);
      a(54, true, false, agm.class);
      a(60, true, false, km.class);
      a(61, true, false, sh.class);
      a(70, true, false, ho.class);
      a(71, true, false, abf.class);
      a(100, true, false, wm.class);
      a(101, true, true, hi.class);
      a(102, false, true, aa.class);
      a(103, true, false, iu.class);
      a(104, true, false, yh.class);
      a(105, true, false, gb.class);
      a(106, true, true, ly.class);
      a(107, true, true, dg.class);
      a(108, false, true, acv.class);
      a(130, true, true, hy.class);
      a(131, true, false, aej.class);
      a(200, true, false, zl.class);
      a(201, true, false, oz.class);
      a(254, false, true, lx.class);
      a(255, true, true, sw.class);
   }
}
