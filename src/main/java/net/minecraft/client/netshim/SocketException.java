package net.minecraft.client.netshim;

import java.io.IOException;

/** Шим java.net.SocketException (в TeaVM его нет). */
public class SocketException extends IOException {
    public SocketException() { super(); }
    public SocketException(String message) { super(message); }
}
