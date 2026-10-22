package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class hy extends gt {
   public int a;
   public int b;
   public int c;
   public String[] d;

   public hy() {
      this.l = true;
   }

   public hy(int var1, int var2, int var3, String[] var4) {
      this.l = true;
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readInt();
      this.d = new String[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         this.d[var2] = a(var1, 15);
      }

   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeInt(this.c);

      for(int var2 = 0; var2 < 4; ++var2) {
         a(this.d[var2], var1);
      }

   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      int var1 = 0;

      for(int var2 = 0; var2 < 4; ++var2) {
         var1 += this.d[var2].length();
      }

      return var1;
   }
}
