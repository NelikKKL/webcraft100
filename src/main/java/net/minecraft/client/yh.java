package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class yh extends gt {
   public int a;
   public dk[] b;

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readByte();
      short var2 = var1.readShort();
      this.b = new dk[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.b[var3] = this.b(var1);
      }

   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeByte(this.a);
      var1.writeShort(this.b.length);

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.a(this.b[var2], var1);
      }

   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 3 + this.b.length * 5;
   }
}
