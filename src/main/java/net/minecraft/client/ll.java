package net.minecraft.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ll implements Runnable {
   public static final ll a = new ll();
   private List b = Collections.synchronizedList(new ArrayList());
   private volatile long c = 0L;
   private volatile long d = 0L;
   private volatile boolean e = false;

   private ll() {
      Thread var1 = new Thread(this, "File IO Thread");
      var1.setPriority(1);
      var1.start();
   }

   public void run() {
      while(true) {
         this.b();
      }
   }

   private void b() {
      for(int var1 = 0; var1 < this.b.size(); ++var1) {
         pz var2 = (pz)this.b.get(var1);
         boolean var3 = var2.c();
         if (!var3) {
            this.b.remove(var1--);
            ++this.d;
         }

         try {
            if (!this.e) {
               Thread.sleep(10L);
            } else {
               Thread.sleep(0L);
            }
         } catch (InterruptedException var6) {
            var6.printStackTrace();
         }
      }

      if (this.b.isEmpty()) {
         try {
            Thread.sleep(25L);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }
      }

   }

   public void a(pz var1) {
      if (!this.b.contains(var1)) {
         ++this.c;
         this.b.add(var1);
      }
   }

   public void a() throws InterruptedException {
      this.e = true;

      while(this.c != this.d) {
         Thread.sleep(10L);
      }

      this.e = false;
   }
}
