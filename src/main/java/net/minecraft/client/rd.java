package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class rd extends gt {
   public int a;
   public byte b;
   public byte c;
   public byte d;
   public byte e;
   public byte f;
   public boolean g = false;

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 4;
   }
}
