package net.minecraft.client;

import java.io.Reader;
import java.util.Arrays;

public final class oi {
   public void a(Reader var1, yc var2) throws zz, java.io.IOException {
      ud var3 = new ud(var1);
      char var4 = (char)var3.c();
      switch (var4) {
         case '[':
            var3.a(var4);
            var2.b();
            this.a(var3, var2);
            break;
         case '{':
            var3.a(var4);
            var2.b();
            this.b(var3, var2);
            break;
         default:
            throw new zz("Expected either [ or { but got [" + var4 + "].", var3);
      }

      int var5 = this.l(var3);
      if (var5 != -1) {
         throw new zz("Got unexpected trailing character [" + (char)var5 + "].", var3);
      } else {
         var2.c();
      }
   }

   private void a(ud var1, yc var2) throws zz, java.io.IOException {
      char var3 = (char)this.l(var1);
      if (var3 != '[') {
         throw new zz("Expected object to start with [ but got [" + var3 + "].", var1);
      } else {
         var2.d();
         char var4 = (char)this.l(var1);
         var1.a(var4);
         if (var4 != ']') {
            this.d(var1, var2);
         }

         boolean var5 = false;

         while(!var5) {
            char var6 = (char)this.l(var1);
            switch (var6) {
               case ',':
                  this.d(var1, var2);
                  break;
               case ']':
                  var5 = true;
                  break;
               default:
                  throw new zz("Expected either , or ] but got [" + var6 + "].", var1);
            }
         }

         var2.e();
      }
   }

   private void b(ud var1, yc var2) throws zz, java.io.IOException {
      char var3 = (char)this.l(var1);
      if (var3 != '{') {
         throw new zz("Expected object to start with { but got [" + var3 + "].", var1);
      } else {
         var2.f();
         char var4 = (char)this.l(var1);
         var1.a(var4);
         if (var4 != '}') {
            this.c(var1, var2);
         }

         boolean var5 = false;

         while(!var5) {
            char var6 = (char)this.l(var1);
            switch (var6) {
               case ',':
                  this.c(var1, var2);
                  break;
               case '}':
                  var5 = true;
                  break;
               default:
                  throw new zz("Expected either , or } but got [" + var6 + "].", var1);
            }
         }

         var2.g();
      }
   }

   private void c(ud var1, yc var2) throws zz, java.io.IOException {
      char var3 = (char)this.l(var1);
      if ('"' != var3) {
         throw new zz("Expected object identifier to begin with [\"] but got [" + var3 + "].", var1);
      } else {
         var1.a(var3);
         var2.a(this.i(var1));
         char var4 = (char)this.l(var1);
         if (var4 != ':') {
            throw new zz("Expected object identifier to be followed by : but got [" + var4 + "].", var1);
         } else {
            this.d(var1, var2);
            var2.h();
         }
      }
   }

   private void d(ud var1, yc var2) throws zz, java.io.IOException {
      char var3 = (char)this.l(var1);
      switch (var3) {
         case '"':
            var1.a(var3);
            var2.c(this.i(var1));
            break;
         case '-':
         case '0':
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9':
            var1.a(var3);
            var2.b(this.a(var1));
            break;
         case '[':
            var1.a(var3);
            this.a(var1, var2);
            break;
         case 'f':
            char[] var6 = new char[4];
            int var7 = var1.b(var6);
            if (var7 != 4 || var6[0] != 'a' || var6[1] != 'l' || var6[2] != 's' || var6[3] != 'e') {
               var1.a(var6);
               throw new zz("Expected 'f' to be followed by [[a, l, s, e]], but got [" + Arrays.toString(var6) + "].", var1);
            }

            var2.j();
            break;
         case 'n':
            char[] var8 = new char[3];
            int var9 = var1.b(var8);
            if (var9 != 3 || var8[0] != 'u' || var8[1] != 'l' || var8[2] != 'l') {
               var1.a(var8);
               throw new zz("Expected 'n' to be followed by [[u, l, l]], but got [" + Arrays.toString(var8) + "].", var1);
            }

            var2.k();
            break;
         case 't':
            char[] var4 = new char[3];
            int var5 = var1.b(var4);
            if (var5 != 3 || var4[0] != 'r' || var4[1] != 'u' || var4[2] != 'e') {
               var1.a(var4);
               throw new zz("Expected 't' to be followed by [[r, u, e]], but got [" + Arrays.toString(var4) + "].", var1);
            }

            var2.i();
            break;
         case '{':
            var1.a(var3);
            this.b(var1, var2);
            break;
         default:
            throw new zz("Invalid character at start of value [" + var3 + "].", var1);
      }

   }

   private String a(ud var1) throws java.io.IOException, zz {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if ('-' == var3) {
         var2.append('-');
      } else {
         var1.a(var3);
      }

      var2.append(this.b(var1));
      return var2.toString();
   }

   private String b(ud var1) throws java.io.IOException, zz {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if ('0' == var3) {
         var2.append('0');
         var2.append(this.f(var1));
         var2.append(this.g(var1));
      } else {
         var1.a(var3);
         var2.append(this.c(var1));
         var2.append(this.e(var1));
         var2.append(this.f(var1));
         var2.append(this.g(var1));
      }

      return var2.toString();
   }

   private char c(ud var1) throws zz, java.io.IOException {
      char var3 = (char)var1.c();
      switch (var3) {
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9':
            return var3;
         default:
            throw new zz("Expected a digit 1 - 9 but got [" + var3 + "].", var1);
      }
   }

   private char d(ud var1) throws zz, java.io.IOException {
      char var3 = (char)var1.c();
      switch (var3) {
         case '0':
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9':
            return var3;
         default:
            throw new zz("Expected a digit 1 - 9 but got [" + var3 + "].", var1);
      }
   }

   private String e(ud var1) throws java.io.IOException {
      StringBuilder var2 = new StringBuilder();
      boolean var3 = false;

      while(!var3) {
         char var4 = (char)var1.c();
         switch (var4) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
               var2.append(var4);
               break;
            default:
               var3 = true;
               var1.a(var4);
         }
      }

      return var2.toString();
   }

   private String f(ud var1) throws java.io.IOException, zz {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if (var3 == '.') {
         var2.append('.');
         var2.append(this.d(var1));
         var2.append(this.e(var1));
      } else {
         var1.a(var3);
      }

      return var2.toString();
   }

   private String g(ud var1) throws java.io.IOException, zz {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if (var3 != '.' && var3 != 'E') {
         var1.a(var3);
      } else {
         var2.append('E');
         var2.append(this.h(var1));
         var2.append(this.d(var1));
         var2.append(this.e(var1));
      }

      return var2.toString();
   }

   private String h(ud var1) throws java.io.IOException {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if (var3 != '+' && var3 != '-') {
         var1.a(var3);
      } else {
         var2.append(var3);
      }

      return var2.toString();
   }

   private String i(ud var1) throws zz, java.io.IOException {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if ('"' != var3) {
         throw new zz("Expected [\"] but got [" + var3 + "].", var1);
      } else {
         boolean var4 = false;

         while(!var4) {
            char var5 = (char)var1.c();
            switch (var5) {
               case '"':
                  var4 = true;
                  break;
               case '\\':
                  char var6 = this.j(var1);
                  var2.append(var6);
                  break;
               default:
                  var2.append(var5);
            }
         }

         return var2.toString();
      }
   }

   private char j(ud var1) throws zz, java.io.IOException {
      char var3 = (char)var1.c();
      char var2;
      switch (var3) {
         case '"':
            var2 = '"';
            break;
         case '/':
            var2 = '/';
            break;
         case '\\':
            var2 = '\\';
            break;
         case 'b':
            var2 = '\b';
            break;
         case 'f':
            var2 = '\f';
            break;
         case 'n':
            var2 = '\n';
            break;
         case 'r':
            var2 = '\r';
            break;
         case 't':
            var2 = '\t';
            break;
         case 'u':
            var2 = (char)this.k(var1);
            break;
         default:
            throw new zz("Unrecognised escape character [" + var3 + "].", var1);
      }

      return var2;
   }

   private int k(ud var1) throws zz, java.io.IOException {
      char[] var2 = new char[4];
      int var3 = var1.b(var2);
      if (var3 != 4) {
         throw new zz("Expected a 4 digit hexidecimal number but got only [" + var3 + "], namely [" + String.valueOf(var2, 0, var3) + "].", var1);
      } else {
         try {
            int var4 = Integer.parseInt(String.valueOf(var2), 16);
            return var4;
         } catch (NumberFormatException var6) {
            var1.a(var2);
            throw new zz("Unable to parse [" + String.valueOf(var2) + "] as a hexidecimal number.", var6, var1);
         }
      }
   }

   private int l(ud var1) throws java.io.IOException {
      boolean var3 = false;

      int var2;
      do {
         var2 = var1.c();
         switch (var2) {
            case 9:
            case 10:
            case 13:
            case 32:
               break;
            default:
               var3 = true;
         }
      } while(!var3);

      return var2;
   }
}
