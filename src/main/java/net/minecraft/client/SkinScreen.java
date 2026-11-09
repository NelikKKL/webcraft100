package net.minecraft.client;

import net.minecraft.client.web.SkinStore;
import org.lwjgl.opengl.GL11;

/**
 * Экран "Skin & Name" (Options -> Skin & Name...), перенесён из старого порта: ник, файл скина, режим рук
 * и живой вращающийся предпросмотр модели. Оформлен штатными виджетами игры (кнопки ct, шрифт q, фон меню),
 * поле ввода нарисовано в том же стиле, что и в старом порте.
 *
 * Сам скин декодируется в web/extras.js и попадает в {@link SkinStore}; игрок рисуется с ним в {@code zr}.
 */
public class SkinScreen extends xe {
   private final xe parent;
   private fa classic;
   private fa modern;
   private fa slim;
   private String nick;
   private boolean focused = true;
   private int tick = 0;
   private ct armsButton;

   public SkinScreen(xe var1) {
      this.parent = var1;
      this.nick = SkinStore.nick();
   }

   private int fieldX() {
      return this.m / 2 - 100;
   }

   private int fieldY() {
      return 56;
   }

   public void a() {
      int var1 = this.m / 2 - 100;
      this.o.add(new ct(1, var1, 86, 200, 20, "Choose skin file..."));
      this.o.add(new ct(2, var1, 110, 98, 20, "Reset skin"));
      this.armsButton = new ct(3, var1 + 102, 110, 98, 20, "Arms: " + SkinStore.armModeName());
      this.o.add(this.armsButton);
      this.o.add(new ct(200, var1, this.n / 6 + 168, 200, 20, "Done"));
   }

   /** Применяет ник: сохраняет его и сразу меняет имя сессии и текущего игрока. */
   private void applyNick() {
      SkinStore.setNick(this.nick);
      String var1 = SkinStore.nick();
      if (this.l.k != null) {
         this.l.k.b = var1;
      } else {
         this.l.k = new dr(var1, "-");
      }

      if (this.l.h != null) {
         this.l.h.bJ = var1;
      }

   }

   private void close() {
      this.applyNick();
      this.l.a(this.parent);
   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f == 1) {
            SkinStore.chooseFile();
         }

         if (var1.f == 2) {
            SkinStore.reset();
         }

         if (var1.f == 3) {
            SkinStore.cycleArmMode();
            var1.e = "Arms: " + SkinStore.armModeName();
         }

         if (var1.f == 200) {
            this.close();
         }

      }
   }

   protected void a(int var1, int var2, int var3) {
      if (var3 == 0) {
         this.focused = var1 >= this.fieldX() && var1 < this.fieldX() + 200 && var2 >= this.fieldY() && var2 < this.fieldY() + 20;
      }

      super.a(var1, var2, var3);
   }

   protected void a(char var1, int var2) {
      if (var2 != 1 && var2 != 28 && var2 != 156) {
         if (this.focused) {
            if (var2 == 14) {
               if (this.nick.length() > 0) {
                  this.nick = this.nick.substring(0, this.nick.length() - 1);
               }

            } else {
               boolean var3 = var1 >= 'a' && var1 <= 'z' || var1 >= 'A' && var1 <= 'Z' || var1 >= '0' && var1 <= '9' || var1 == '_';
               if (var3 && this.nick.length() < 16) {
                  this.nick = this.nick + var1;
               }

            }
         }
      } else {
         this.close();
      }
   }

   public void s_() {
      super.s_();
      ++this.tick;
      this.armsButton.e = "Arms: " + SkinStore.armModeName();
   }

   public void a(int var1, int var2, float var3) {
      this.j();
      this.a(this.q, "Skin & Name", this.m / 2, 20, 16777215);
      int var4 = this.fieldX();
      int var5 = this.fieldY();
      this.b(this.q, "Nickname", var4, var5 - 12, 10526880);
      this.a(var4 - 1, var5 - 1, var4 + 201, var5 + 21, this.focused ? -1 : -5855578);
      this.a(var4, var5, var4 + 200, var5 + 20, -16777216);
      String var6 = this.nick + (this.focused && this.tick / 6 % 2 == 0 ? "_" : "");
      this.b(this.q, var6, var4 + 4, var5 + 6, 14737632);
      this.a(this.q, SkinStore.describe(), this.m / 2, 136, 16777215);
      this.a(this.q, "PNG 64x32, 64x64 or HD. Arms: Auto detects Alex (slim).", this.m / 2, 148, 8421504);
      super.a(var1, var2, var3);
      this.drawPreview(var3);
   }

   private fa model() {
      boolean var1 = SkinStore.isModern();
      if (var1 && SkinStore.isSlim()) {
         if (this.slim == null) {
            this.slim = new fa(0.0F, 0.0F, true, true);
         }

         return this.slim;
      } else if (var1) {
         if (this.modern == null) {
            this.modern = new fa(0.0F, 0.0F, true, false);
         }

         return this.modern;
      } else {
         if (this.classic == null) {
            this.classic = new fa(0.0F);
         }

         return this.classic;
      }
   }

   /** Предпросмотр: та же цепочка трансформаций, что у игрока в инвентаре и рендерера мобов. */
   private void drawPreview(float var1) {
      if (this.m >= 330) {
         int var2 = this.l.p.b(SkinStore.texturePath());
         float var3 = (float)(this.m / 2 + 160);
         float var4 = 130.0F;
         float var5 = 38.0F;
         fa var6 = this.model();
         GL11.glEnable(32826);
         GL11.glEnable(2903);
         GL11.glClear(256);
         GL11.glPushMatrix();
         GL11.glTranslatef(var3, var4, 100.0F);
         GL11.glScalef(-var5, var5, var5);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
         rt.b();
         GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F + ((float)this.tick + var1) * 2.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(-1.0F, -1.0F, 1.0F);
         GL11.glTranslatef(0.0F, -1.5F - 0.0078125F, 0.0F);
         GL11.glBindTexture(3553, var2);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var6.a = 0.0F;
         var6.a((ia)null, 0.0F, 0.0F, (float)this.tick + var1, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
         rt.a();
         GL11.glDisable(32826);
      }
   }
}
