package net.minecraft.client;

import java.io.IOException;
import net.minecraft.client.netshim.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

class yb extends Thread {
   // $FF: synthetic field
   final lo a;
   // $FF: synthetic field
   final jo b;

   yb(jo var1, lo var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         this.a.d = "§8Polling..";
         long var1 = System.nanoTime();
         xi.a(this.b.a, this.a);
         long var3 = System.nanoTime();
         this.a.e = (var3 - var1) / 1000000L;
      } catch (UnknownHostException var28) {
         this.a.e = -1L;
         this.a.d = "§4Can't resolve hostname";
      } catch (SocketTimeoutException var29) {
         this.a.e = -1L;
         this.a.d = "§4Can't reach server";
      } catch (ConnectException var30) {
         this.a.e = -1L;
         this.a.d = "§4Can't reach server";
      } catch (IOException var31) {
         this.a.e = -1L;
         this.a.d = "§4Communication error";
      } catch (Exception var32) {
         this.a.e = -1L;
         this.a.d = "ERROR: " + var32.getClass();
      } finally {
         synchronized(xi.l()) {
            xi.o();
         }
      }

   }
}
