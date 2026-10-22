package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aio extends gt {
   public int a;

   public aio() {
   }

   public aio(int var1) {
      this.a = var1;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readShort();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeShort(this.a);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 2;
   }
}
