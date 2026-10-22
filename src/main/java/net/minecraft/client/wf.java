package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class wf extends gt {
   public int a;

   public wf() {
   }

   public wf(int var1) {
      this.a = var1;
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
   }

   public int a() {
      return 4;
   }
}
