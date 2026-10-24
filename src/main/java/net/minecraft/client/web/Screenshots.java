package net.minecraft.client.web;

import org.teavm.jso.JSBody;
import org.teavm.jso.typedarrays.ArrayBuffer;
import org.teavm.jso.typedarrays.Uint8Array;

/** Скриншоты (F2): PNG собирается в canvas и скачивается браузером. */
public final class Screenshots {
    private Screenshots() {}

    /** argb — пиксели в формате BufferedImage.TYPE_INT_(A)RGB, строка за строкой. */
    public static void download(String name, int w, int h, int[] argb) {
        Uint8Array rgba = new Uint8Array(new ArrayBuffer(w * h * 4));
        for (int i = 0, n = w * h; i < n; i++) {
            int p = argb[i];
            rgba.set(i * 4,     (short) ((p >> 16) & 0xFF));
            rgba.set(i * 4 + 1, (short) ((p >> 8) & 0xFF));
            rgba.set(i * 4 + 2, (short) (p & 0xFF));
            rgba.set(i * 4 + 3, (short) 255);
        }
        save(name, w, h, rgba);
    }

    @JSBody(params = { "name", "w", "h", "rgba" }, script =
        "var cv = document.createElement('canvas'); cv.width = w; cv.height = h;" +
        "var ctx2d = cv.getContext('2d');" +
        "ctx2d.putImageData(new ImageData(new Uint8ClampedArray(rgba.buffer), w, h), 0, 0);" +
        "cv.toBlob(function (blob) {" +
        "  var link = document.createElement('a'); link.href = URL.createObjectURL(blob); link.download = name;" +
        "  document.body.appendChild(link); link.click(); document.body.removeChild(link);" +
        "  setTimeout(function () { URL.revokeObjectURL(link.href); }, 5000);" +
        "}, 'image/png');")
    private static native void save(String name, int w, int h, Uint8Array rgba);
}
