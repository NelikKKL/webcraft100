package net.minecraft.client;

import java.io.DataInput;
import java.io.DataOutput;

public class xq extends um {
   public byte a;

   public xq(String var1) {
      super(var1);
   }

   public xq(String var1, byte var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws java.io.IOException {
      var1.writeByte(this.a);
   }

   void a(DataInput var1) throws java.io.IOException {
      this.a = var1.readByte();
   }

   public byte a() {
      return 1;
   }

   public String toString() {
      return "" + this.a;
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         xq var2 = (xq)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }

   public um b() {
      return new xq(this.d(), this.a);
   }
}
