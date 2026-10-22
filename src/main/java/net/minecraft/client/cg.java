package net.minecraft.client;

import java.io.DataInput;
import java.io.DataOutput;

public class cg extends um {
   public short a;

   public cg(String var1) {
      super(var1);
   }

   public cg(String var1, short var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws java.io.IOException {
      var1.writeShort(this.a);
   }

   void a(DataInput var1) throws java.io.IOException {
      this.a = var1.readShort();
   }

   public byte a() {
      return 2;
   }

   public String toString() {
      return "" + this.a;
   }

   public um b() {
      return new cg(this.d(), this.a);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         cg var2 = (cg)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }
}
