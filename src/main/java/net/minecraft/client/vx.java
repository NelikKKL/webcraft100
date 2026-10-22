package net.minecraft.client;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class vx {
   public static ik a(InputStream var0) throws java.io.IOException {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)));

      ik var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void a(ik var0, OutputStream var1) throws java.io.IOException {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

   }

   public static ik a(byte[] var0) throws java.io.IOException {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(var0))));

      ik var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] a(ik var0) throws java.io.IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static void a(ik var0, File var1) throws java.io.IOException {
      File var2 = new File(var1.getAbsolutePath() + "_tmp");
      if (var2.exists()) {
         var2.delete();
      }

      b(var0, var2);
      net.minecraft.client.web.WorldStore.changed(var1); // PATCH(1.0.0)
      if (var1.exists()) {
         var1.delete();
      }

      if (var1.exists()) {
         throw new IOException("Failed to delete " + var1);
      } else {
         var2.renameTo(var1);
      }
   }

   public static void b(ik var0, File var1) throws java.io.FileNotFoundException, java.io.IOException {
      DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

   }

   public static ik a(File var0) throws java.io.FileNotFoundException, java.io.IOException {
      if (!var0.exists()) {
         return null;
      } else {
         DataInputStream var1 = new DataInputStream(new FileInputStream(var0));

         ik var2;
         try {
            var2 = a((DataInput)var1);
         } finally {
            var1.close();
         }

         return var2;
      }
   }

   public static ik a(DataInput var0) throws java.io.IOException {
      um var1 = um.b(var0);
      if (var1 instanceof ik) {
         return (ik)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(ik var0, DataOutput var1) throws java.io.IOException {
      um.a(var0, var1);
   }
}
