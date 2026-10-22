package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class agx extends gt {
   public int a;
   public int b;

   public int a() {
      return 8;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = var1.readInt();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
   }

   public void a(fe var1) {
      var1.a(this);
   }
}
