package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class zm extends gt {
   public int a;
   public int b;
   public int c;

   public zm() {
   }

   public zm(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readByte();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeByte(this.c);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 9;
   }
}
