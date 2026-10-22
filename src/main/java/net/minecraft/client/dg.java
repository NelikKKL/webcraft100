package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class dg extends gt {
   public int a;
   public dk b;

   public dg() {
   }

   public dg(int var1, dk var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readShort();
      this.b = this.b(var1);
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeShort(this.a);
      this.a(this.b, var1);
   }

   public int a() {
      return 8;
   }
}
