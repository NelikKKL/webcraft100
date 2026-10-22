package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class sw extends gt {
   public String a;

   public sw() {
   }

   public sw(String var1) {
      this.a = var1;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = a(var1, 100);
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      a(this.a, var1);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return this.a.length();
   }
}
