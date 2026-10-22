package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class cb extends gt {
   public long a;

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readLong();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeLong(this.a);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
