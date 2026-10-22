package net.minecraft.client;

import org.lwjgl.input.Keyboard;

public class gx extends xe {
   protected String a = "";
   private int b = 0;
   private static final String c;

   public void a() {
      Keyboard.enableRepeatEvents(true);
   }

   public void d() {
      Keyboard.enableRepeatEvents(false);
   }

   public void s_() {
      ++this.b;
   }

   protected void a(char var1, int var2) {
      if (var2 == 1) {
         this.l.a((xe)null);
      } else if (var2 == 28) {
         String var3 = this.a.trim();
         if (var3.length() > 0) {
            String var4 = this.a.trim();
            if (!this.l.c(var4)) {
               this.l.h.a(var4);
            }
         }

         this.l.a((xe)null);
      } else {
         if (var2 == 14 && this.a.length() > 0) {
            this.a = this.a.substring(0, this.a.length() - 1);
         }

         if (c.indexOf(var1) >= 0 && this.a.length() < 100) {
            this.a = this.a + var1;
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.a(2, this.n - 14, this.m - 2, this.n - 2, Integer.MIN_VALUE);
      this.b(this.q, "> " + this.a + (this.b / 6 % 2 == 0 ? "_" : ""), 4, this.n - 12, 14737632);
      super.a(var1, var2, var3);
   }

   protected void a(int var1, int var2, int var3) {
      if (var3 == 0) {
         if (this.l.w.a != null) {
            if (this.a.length() > 0 && !this.a.endsWith(" ")) {
               this.a = this.a + " ";
            }

            this.a = this.a + this.l.w.a;
            byte var4 = 100;
            if (this.a.length() > var4) {
               this.a = this.a.substring(0, var4);
            }
         } else {
            super.a(var1, var2, var3);
         }
      }

   }

   static {
      c = age.a;
   }
}
