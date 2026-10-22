package net.minecraft.client;

import java.io.DataInput;
import java.io.DataOutput;

public class hx extends um {
   public int a;

   public hx(String var1) {
      super(var1);
   }

   public hx(String var1, int var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws java.io.IOException {
      var1.writeInt(this.a);
   }

   void a(DataInput var1) throws java.io.IOException {
      this.a = var1.readInt();
   }

   public byte a() {
      return 3;
   }

   public String toString() {
      return "" + this.a;
   }

   public um b() {
      return new hx(this.d(), this.a);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         hx var2 = (hx)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }
}
