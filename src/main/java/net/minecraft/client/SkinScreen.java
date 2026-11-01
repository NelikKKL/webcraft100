package net.minecraft.client;

import net.minecraft.client.web.SkinStore;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/**
 * Options -> "Skin & Name...".
 *
 * Ник (текстовое поле), выбор PNG со скином (диалог браузера, drag&drop .png на окно тоже работает),
 * режим рук (Auto / Classic / Slim) и сброс на стандартный скин. Справа — превью скина (вид спереди,
 * с учётом второго слоя и левых рук у скинов 64x64). Сам скин декодируется в web/extras.js и
 * попадает в {@link SkinStore}; игрок рисуется с ним в {@code zr} (модель {@code fa}).
 */
public class SkinScreen extends xe {
   private final xe parent;
   private dv nameField;
   private ct armsButton;
   private ct resetButton;

   public SkinScreen(xe var1) {
      this.parent = var1;
   }

   public void a() {
      Keyboard.enableRepeatEvents(true);
      int var1 = this.m / 2 - 155;
      this.nameField = new dv(this, this.q, var1, 46, 150, 20, SkinStore.nick());
      this.nameField.a = true;
      this.nameField.a(16);
      this.o.add(new ct(1, var1, 78, 150, 20, "Choose skin file..."));
      this.armsButton = new ct(2, var1, 102, 150, 20, "");
      this.o.add(this.armsButton);
      this.resetButton = new ct(3, var1, 126, 150, 20, "Reset skin");
      this.o.add(this.resetButton);
      this.o.add(new ct(200, this.m / 2 - 100, this.n - 28, 200, 20, "Done"));
      this.refresh();
   }

   private void refresh() {
      this.armsButton.e = "Arms: " + SkinStore.armModeName();
      this.resetButton.g = SkinStore.hasSkin();
   }

   public void d() {
      Keyboard.enableRepeatEvents(false);
   }

   public void s_() {
      this.nameField.b();
      this.refresh();
   }

   private void save() {
      SkinStore.setNick(this.nameField.a().trim());
      // новый ник вступает в силу при создании/загрузке мира
      this.l.k = new dr(SkinStore.nick(), "-");
   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f == 1) {
            SkinStore.chooseFile();
         } else if (var1.f == 2) {
            SkinStore.cycleArmMode();
            this.refresh();
         } else if (var1.f == 3) {
            SkinStore.reset();
            this.refresh();
         } else if (var1.f == 200) {
            this.save();
            this.l.a(this.parent);
         }

      }
   }

   protected void a(char var1, int var2) {
      if (var2 == 1 || var1 == '\r') {
         this.save();
         this.l.a(this.parent);
      } else {
         this.nameField.a(var1, var2);
      }
   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.nameField.a(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      this.j();
      this.a(this.q, "Skin & Name", this.m / 2, 15, 16777215);
      int var4 = this.m / 2 - 155;
      this.b(this.q, "Player name", var4, 34, 10526880);
      this.nameField.c();
      this.b(this.q, SkinStore.describe(), var4, 152, 10526880);
      this.b(this.q, "Tip: drop a .png onto the window", var4, 166, 6710886);
      this.drawPreview(this.m / 2 + 80, 40, 4);
      super.a(var1, var2, var3);
   }

   // ------------------------------------------------------------------ превью скина

   private float texW = 64.0F;
   private float texH = 32.0F;

   /** Рисует игрока спереди: 16x32 пикселя скина, каждый пиксель = var3 пикселей экрана. */
   private void drawPreview(int var1, int var2, int var3) {
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      GL11.glBindTexture(3553, this.l.p.b(SkinStore.texturePath()));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      // координаты берутся в «64-пиксельной» сетке; высота = 64 * H / W (32 для классики, 64 для современных)
      this.texW = 64.0F;
      this.texH = 64.0F * (float)SkinStore.textureHeight() / (float)SkinStore.textureWidth();
      boolean var4 = SkinStore.isModern();
      boolean var5 = var4 && SkinStore.isSlim();
      int var6 = var1 - 8 * var3;
      GL11.glDisable(3042);
      // голова, тело, ноги
      this.part(var6 + 4 * var3, var2, 8, 8, 8, 8, var3, false);
      this.part(var6 + 4 * var3, var2 + 8 * var3, 8, 12, 20, 20, var3, false);
      this.part(var6 + 4 * var3, var2 + 20 * var3, 4, 12, 4, 20, var3, false);
      if (var4) {
         this.part(var6 + 8 * var3, var2 + 20 * var3, 4, 12, 20, 52, var3, false);
      } else {
         this.part(var6 + 8 * var3, var2 + 20 * var3, 4, 12, 4, 20, var3, true);
      }

      // руки (у тонких — по 3 пикселя)
      int var7 = var5 ? 3 : 4;
      this.part(var6 + (var5 ? 1 : 0) * var3, var2 + 8 * var3, var7, 12, 44, 20, var3, false);
      if (var4) {
         this.part(var6 + 12 * var3, var2 + 8 * var3, var7, 12, 36, 52, var3, false);
      } else {
         this.part(var6 + 12 * var3, var2 + 8 * var3, var7, 12, 44, 20, var3, true);
      }

      // второй слой: шапка (есть и у классических), у современных — куртка, рукава, штаны
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      this.part(var6 + 4 * var3, var2, 8, 8, 40, 8, var3, false);
      if (var4) {
         this.part(var6 + 4 * var3, var2 + 8 * var3, 8, 12, 20, 36, var3, false);
         this.part(var6 + 4 * var3, var2 + 20 * var3, 4, 12, 4, 36, var3, false);
         this.part(var6 + 8 * var3, var2 + 20 * var3, 4, 12, 4, 52, var3, false);
         this.part(var6 + (var5 ? 1 : 0) * var3, var2 + 8 * var3, var7, 12, 44, 36, var3, false);
         this.part(var6 + 12 * var3, var2 + 8 * var3, var7, 12, 52, 52, var3, false);
      }

      GL11.glDisable(3042);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   /** Квад размером (var3 x var4) скин-пикселей из области (var5, var6) текстуры; var8 — зеркально по горизонтали. */
   private void part(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      float var9 = (float)var5 / this.texW;
      float var10 = (float)(var5 + var3) / this.texW;
      float var11 = (float)var6 / this.texH;
      float var12 = (float)(var6 + var4) / this.texH;
      if (var8) {
         float var13 = var9;
         var9 = var10;
         var10 = var13;
      }

      double var14 = (double)var1;
      double var16 = (double)var2;
      double var18 = (double)(var1 + var3 * var7);
      double var20 = (double)(var2 + var4 * var7);
      cv var22 = cv.a;
      var22.b();
      var22.a(var14, var20, 0.0, (double)var9, (double)var12);
      var22.a(var18, var20, 0.0, (double)var10, (double)var12);
      var22.a(var18, var16, 0.0, (double)var10, (double)var11);
      var22.a(var14, var16, 0.0, (double)var9, (double)var11);
      var22.a();
   }
}
