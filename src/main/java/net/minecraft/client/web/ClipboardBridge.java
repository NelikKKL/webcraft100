package net.minecraft.client.web;

import org.teavm.jso.JSBody;

/** Буфер обмена: index.html кладёт текст вставки в window.__clipText. */
public final class ClipboardBridge {
    private ClipboardBridge() {}

    @JSBody(script = "return (typeof window.__clipText === 'string') ? window.__clipText : null;")
    public static native String get();
}
