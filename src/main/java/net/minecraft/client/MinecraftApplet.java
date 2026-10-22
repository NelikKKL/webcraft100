package net.minecraft.client;

/** Заглушка вместо java.applet.Applet-версии: в браузере аплета нет. */
public class MinecraftApplet {
    public boolean isActive() { return true; }
    public void c() {}
    public void b() {}
    public String getParameter(String n) { return null; }
}
