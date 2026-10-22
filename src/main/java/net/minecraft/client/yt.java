package net.minecraft.client;

import java.io.DataInput;
import java.io.DataOutput;

public class yt extends um {
   public String a;

   public yt(String var1) {
      super(var1);
   }

   public yt(String var1, String var2) {
      super(var1);
      this.a = var2;
      if (var2 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   void a(DataOutput var1) throws java.io.IOException {
      var1.writeUTF(this.a);
   }

   void a(DataInput var1) throws java.io.IOException {
      this.a = var1.readUTF();
   }

   public byte a() {
      return 8;
   }

   public String toString() {
      return "" + this.a;
   }

   public um b() {
      return new yt(this.d(), this.a);
   }

   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         yt var2 = (yt)var1;
         return this.a == null && var2.a == null || this.a != null && this.a.equals(var2.a);
      }
   }
}
