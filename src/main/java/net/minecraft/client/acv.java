package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class acv extends gt {
   public int a;
   public int b;

   public acv() {
   }

   public acv(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readByte();
      this.b = var1.readByte();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeByte(this.a);
      var1.writeByte(this.b);
   }

   public int a() {
      return 2;
   }
}
