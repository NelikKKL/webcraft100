package net.minecraft.client;

import java.io.DataInput;
import java.io.DataOutput;

public class vd extends um {
   public float a;

   public vd(String var1) {
      super(var1);
   }

   public vd(String var1, float var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws java.io.IOException {
      var1.writeFloat(this.a);
   }

   void a(DataInput var1) throws java.io.IOException {
      this.a = var1.readFloat();
   }

   public byte a() {
      return 5;
   }

   public String toString() {
      return "" + this.a;
   }

   public um b() {
      return new vd(this.d(), this.a);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         vd var2 = (vd)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }
}
