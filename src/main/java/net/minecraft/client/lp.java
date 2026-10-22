package net.minecraft.client;

public enum lp {
   a("options.music", true, false),
   b("options.sound", true, false),
   c("options.invertMouse", false, true),
   d("options.sensitivity", true, false),
   e("options.fov", true, false),
   f("options.gamma", true, false),
   g("options.renderDistance", false, false),
   h("options.viewBobbing", false, true),
   i("options.anaglyph", false, true),
   j("options.advancedOpengl", false, true),
   k("options.framerateLimit", false, false),
   l("options.difficulty", false, false),
   m("options.graphics", false, false),
   n("options.ao", false, true),
   o("options.guiScale", false, false),
   p("options.renderClouds", false, true),
   q("options.particles", false, false);

   private final boolean r;
   private final boolean s;
   private final String t;

   public static lp a(int var0) {
      for(lp var4 : values()) {
         if (var4.c() == var0) {
            return var4;
         }
      }

      return null;
   }

   private lp(String var3, boolean var4, boolean var5) {
      this.t = var3;
      this.r = var4;
      this.s = var5;
   }

   public boolean a() {
      return this.r;
   }

   public boolean b() {
      return this.s;
   }

   public int c() {
      return this.ordinal();
   }

   public String d() {
      return this.t;
   }
}
