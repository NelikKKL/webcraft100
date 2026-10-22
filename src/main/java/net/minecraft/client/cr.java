package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cr {
   private static final HashMap a = new HashMap();
   private final Map b = new HashMap();
   private boolean c;

   public void a(int var1, Object var2) {
      Integer var3 = (Integer)a.get(var2.getClass());
      if (var3 == null) {
         throw new IllegalArgumentException("Unknown data type: " + var2.getClass());
      } else if (var1 > 31) {
         throw new IllegalArgumentException("Data value id is too big with " + var1 + "! (Max is " + 31 + ")");
      } else if (this.b.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id value for " + var1 + "!");
      } else {
         afh var4 = new afh(var3, var1, var2);
         this.b.put(var1, var4);
      }
   }

   public byte a(int var1) {
      return (Byte)((afh)this.b.get(var1)).b();
   }

   public short b(int var1) {
      return (Short)((afh)this.b.get(var1)).b();
   }

   public int c(int var1) {
      return (Integer)((afh)this.b.get(var1)).b();
   }

   public String d(int var1) {
      return (String)((afh)this.b.get(var1)).b();
   }

   public void b(int var1, Object var2) {
      afh var3 = (afh)this.b.get(var1);
      if (!var2.equals(var3.b())) {
         var3.a(var2);
         var3.a(true);
         this.c = true;
      }

   }

   public static void a(List var0, DataOutputStream var1) throws java.io.IOException {
      if (var0 != null) {
         for(afh var3 : (Iterable<afh>)(Iterable)(var0)) {
            a(var1, var3);
         }
      }

      var1.writeByte(127);
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      for(afh var3 : (Iterable<afh>)(Iterable)(this.b.values())) {
         a(var1, var3);
      }

      var1.writeByte(127);
   }

   private static void a(DataOutputStream var0, afh var1) throws java.io.IOException {
      int var2 = (var1.c() << 5 | var1.a() & 31) & 255;
      var0.writeByte(var2);
      switch (var1.c()) {
         case 0:
            var0.writeByte((Byte)var1.b());
            break;
         case 1:
            var0.writeShort((Short)var1.b());
            break;
         case 2:
            var0.writeInt((Integer)var1.b());
            break;
         case 3:
            var0.writeFloat((Float)var1.b());
            break;
         case 4:
            gt.a((String)var1.b(), var0);
            break;
         case 5:
            dk var4 = (dk)var1.b();
            var0.writeShort(var4.a().bM);
            var0.writeByte(var4.a);
            var0.writeShort(var4.i());
            break;
         case 6:
            dh var3 = (dh)var1.b();
            var0.writeInt(var3.a);
            var0.writeInt(var3.b);
            var0.writeInt(var3.c);
      }

   }

   public static List a(DataInputStream var0) throws java.io.IOException {
      ArrayList var1 = null;

      for(byte var2 = var0.readByte(); var2 != 127; var2 = var0.readByte()) {
         if (var1 == null) {
            var1 = new ArrayList();
         }

         int var3 = (var2 & 224) >> 5;
         int var4 = var2 & 31;
         afh var5 = null;
         switch (var3) {
            case 0:
               var5 = new afh(var3, var4, var0.readByte());
               break;
            case 1:
               var5 = new afh(var3, var4, var0.readShort());
               break;
            case 2:
               var5 = new afh(var3, var4, var0.readInt());
               break;
            case 3:
               var5 = new afh(var3, var4, var0.readFloat());
               break;
            case 4:
               var5 = new afh(var3, var4, gt.a(var0, 64));
               break;
            case 5:
               short var9 = var0.readShort();
               byte var10 = var0.readByte();
               short var11 = var0.readShort();
               var5 = new afh(var3, var4, new dk(var9, var10, var11));
               break;
            case 6:
               int var6 = var0.readInt();
               int var7 = var0.readInt();
               int var8 = var0.readInt();
               var5 = new afh(var3, var4, new dh(var6, var7, var8));
         }

         var1.add(var5);
      }

      return var1;
   }

   public void a(List var1) {
      for(afh var3 : (Iterable<afh>)(Iterable)(var1)) {
         afh var4 = (afh)this.b.get(var3.a());
         if (var4 != null) {
            var4.a(var3.b());
         }
      }

   }

   static {
      a.put(Byte.class, 0);
      a.put(Short.class, 1);
      a.put(Integer.class, 2);
      a.put(Float.class, 3);
      a.put(String.class, 4);
      a.put(dk.class, 5);
      a.put(dh.class, 6);
   }
}
