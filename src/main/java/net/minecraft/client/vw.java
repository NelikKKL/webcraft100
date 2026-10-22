package net.minecraft.client;

import java.io.DataInput;
import java.io.DataOutput;

public class vw extends um {
   public long a;

   public vw(String var1) {
      super(var1);
   }

   public vw(String var1, long var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws java.io.IOException {
      var1.writeLong(this.a);
   }

   void a(DataInput var1) throws java.io.IOException {
      this.a = var1.readLong();
   }

   public byte a() {
      return 4;
   }

   public String toString() {
      return "" + this.a;
   }

   public um b() {
      return new vw(this.d(), this.a);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         vw var2 = (vw)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }
}
