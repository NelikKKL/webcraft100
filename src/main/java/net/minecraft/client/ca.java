package net.minecraft.client;

import java.io.DataInput;
import java.io.DataOutput;

public class ca extends um {
   public byte[] a;

   public ca(String var1) {
      super(var1);
   }

   public ca(String var1, byte[] var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws java.io.IOException {
      var1.writeInt(this.a.length);
      var1.write(this.a);
   }

   void a(DataInput var1) throws java.io.IOException {
      int var2 = var1.readInt();
      this.a = new byte[var2];
      var1.readFully(this.a);
   }

   public byte a() {
      return 7;
   }

   public String toString() {
      return "[" + this.a.length + " bytes]";
   }

   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         ca var2 = (ca)var1;
         return this.a == null && var2.a == null || this.a != null && this.a.equals(var2.a);
      }
   }

   public um b() {
      byte[] var1 = new byte[this.a.length];
      System.arraycopy(this.a, 0, var1, 0, this.a.length);
      return new ca(this.d(), var1);
   }
}
