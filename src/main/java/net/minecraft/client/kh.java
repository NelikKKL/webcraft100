package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class kh extends gt {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public byte[] g;
   private int h;

   public kh() {
      this.l = true;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readInt();
      this.d = var1.read() + 1;
      this.e = var1.read() + 1;
      this.f = var1.read() + 1;
      this.h = var1.readInt();
      byte[] var2 = new byte[this.h];
      var1.readFully(var2);
      this.g = new byte[this.d * this.e * this.f * 5 / 2];
      Inflater var3 = new Inflater();
      var3.setInput(var2);

      try {
         var3.inflate(this.g);
      } catch (DataFormatException var8) {
         throw new IOException("Bad compressed data format");
      } finally {
         var3.end();
      }

   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeInt(this.c);
      var1.write(this.d - 1);
      var1.write(this.e - 1);
      var1.write(this.f - 1);
      var1.writeInt(this.h);
      var1.write(this.g, 0, this.h);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 17 + this.h;
   }
}
