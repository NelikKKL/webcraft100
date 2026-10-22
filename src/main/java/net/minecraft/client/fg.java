package net.minecraft.client;

import java.io.DataInput;
import java.io.DataOutput;

public class fg extends um {
   public double a;

   public fg(String var1) {
      super(var1);
   }

   public fg(String var1, double var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws java.io.IOException {
      var1.writeDouble(this.a);
   }

   void a(DataInput var1) throws java.io.IOException {
      this.a = var1.readDouble();
   }

   public byte a() {
      return 6;
   }

   public String toString() {
      return "" + this.a;
   }

   public um b() {
      return new fg(this.d(), this.a);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         fg var2 = (fg)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }
}
