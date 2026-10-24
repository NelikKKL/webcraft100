package net.minecraft.client.web;

/** Math.round с семантикой Java (floor(x + 0.5)): в TeaVM Math.round(-2.5) = -3, в Java = -2. */
public final class JMath {
    private JMath() {}

    public static int round(float x) {
        return (int) Math.floor((double) x + 0.5D);
    }

    public static long round(double x) {
        return (long) Math.floor(x + 0.5D);
    }
}
