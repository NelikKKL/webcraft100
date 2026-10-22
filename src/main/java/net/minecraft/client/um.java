package net.minecraft.client;

import java.io.DataInput;
import java.io.DataOutput;

public abstract class um {
   private String a;

   abstract void a(DataOutput var1) throws java.io.IOException;

   abstract void a(DataInput var1) throws java.io.IOException;

   public abstract byte a();

   protected um(String var1) {
      if (var1 == null) {
         this.a = "";
      } else {
         this.a = var1;
      }

   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof um) {
         um var2 = (um)var1;
         if (this.a() != var2.a()) {
            return false;
         } else if ((this.a != null || var2.a == null) && (this.a == null || var2.a != null)) {
            return this.a == null || this.a.equals(var2.a);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public um n(String var1) {
      if (var1 == null) {
         this.a = "";
      } else {
         this.a = var1;
      }

      return this;
   }

   public String d() {
      return this.a == null ? "" : this.a;
   }

   public static um b(DataInput var0) throws java.io.IOException {
      byte var1 = var0.readByte();
      if (var1 == 0) {
         return new hp();
      } else {
         String var2 = var0.readUTF();
         um var3 = a(var1, var2);
         var3.a(var0);
         return var3;
      }
   }

   public static void a(um var0, DataOutput var1) throws java.io.IOException {
      var1.writeByte(var0.a());
      if (var0.a() != 0) {
         var1.writeUTF(var0.d());
         var0.a(var1);
      }
   }

   public static um a(byte var0, String var1) {
      switch (var0) {
         case 0:
            return new hp();
         case 1:
            return new xq(var1);
         case 2:
            return new cg(var1);
         case 3:
            return new hx(var1);
         case 4:
            return new vw(var1);
         case 5:
            return new vd(var1);
         case 6:
            return new fg(var1);
         case 7:
            return new ca(var1);
         case 8:
            return new yt(var1);
         case 9:
            return new yi(var1);
         case 10:
            return new ik(var1);
         default:
            return null;
      }
   }

   public static String a(byte var0) {
      switch (var0) {
         case 0:
            return "TAG_End";
         case 1:
            return "TAG_Byte";
         case 2:
            return "TAG_Short";
         case 3:
            return "TAG_Int";
         case 4:
            return "TAG_Long";
         case 5:
            return "TAG_Float";
         case 6:
            return "TAG_Double";
         case 7:
            return "TAG_Byte_Array";
         case 8:
            return "TAG_String";
         case 9:
            return "TAG_List";
         case 10:
            return "TAG_Compound";
         default:
            return "UNKNOWN";
      }
   }

   public abstract um b();
}
