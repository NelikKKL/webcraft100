package net.minecraft.client.netshim;

import java.io.IOException;
import java.io.Reader;

/** Шим java.io.PushbackReader (в TeaVM его нет) — буфер возврата символов размером 1..N. */
public class PushbackReader extends Reader {
    private final Reader in;
    private final int[] buf;
    private int pos;

    public PushbackReader(Reader in) { this(in, 1); }

    public PushbackReader(Reader in, int size) {
        this.in = in;
        this.buf = new int[size];
        this.pos = size;
    }

    public int read() throws IOException {
        if (pos < buf.length) return buf[pos++];
        return in.read();
    }

    public int read(char[] cbuf, int off, int len) throws IOException {
        if (len == 0) return 0;
        int n = 0;
        while (n < len && pos < buf.length) cbuf[off + n++] = (char) buf[pos++];
        if (n < len) {
            int r = in.read(cbuf, off + n, len - n);
            if (r < 0) return n == 0 ? -1 : n;
            n += r;
        }
        return n;
    }

    public void unread(int c) throws IOException {
        if (pos == 0) throw new IOException("Pushback buffer overflow");
        buf[--pos] = c;
    }

    public void unread(char[] cbuf) throws IOException {
        for (int i = cbuf.length - 1; i >= 0; i--) unread(cbuf[i]);
    }

    public boolean ready() throws IOException { return pos < buf.length || in.ready(); }

    public void close() throws IOException { in.close(); }
}
