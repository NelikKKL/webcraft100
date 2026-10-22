package net.minecraft.client;

import org.lwjgl.opengl.GLContext;

public class mm {
   private static boolean a = true;

   public static boolean a() {
      return a && GLContext.getCapabilities().GL_ARB_occlusion_query;
   }
}
