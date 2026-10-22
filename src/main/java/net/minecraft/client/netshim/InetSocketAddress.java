package net.minecraft.client.netshim;

/** Шим java.net.InetSocketAddress (в TeaVM его нет). Хранит только хост и порт. */
public class InetSocketAddress extends SocketAddress {
    private final String host;
    private final int port;

    public InetSocketAddress(String host, int port) { this.host = host; this.port = port; }
    public InetSocketAddress(InetAddress address, int port) { this.host = address == null ? null : address.getHostName(); this.port = port; }

    public String getHostName() { return host; }
    public int getPort() { return port; }
    public String toString() { return host + ":" + port; }
}
