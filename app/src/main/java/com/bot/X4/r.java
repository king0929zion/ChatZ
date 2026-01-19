package X4;

import com.vladsch.flexmark.util.format.TableCell;
import d5.C0949i;
import d5.C0952l;
import d5.I;
import d5.InterfaceC0951k;
import d5.K;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class r implements I {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0951k f9496c;

    /* renamed from: e, reason: collision with root package name */
    public int f9497e;

    /* renamed from: f, reason: collision with root package name */
    public int f9498f;

    /* renamed from: g, reason: collision with root package name */
    public int f9499g;

    /* renamed from: h, reason: collision with root package name */
    public int f9500h;

    /* renamed from: i, reason: collision with root package name */
    public int f9501i;

    public r(InterfaceC0951k interfaceC0951k) {
        AbstractC1276k.f(interfaceC0951k, "source");
        this.f9496c = interfaceC0951k;
    }

    @Override // d5.I
    public final long W(long j3, C0949i c0949i) {
        int i6;
        int readInt;
        AbstractC1276k.f(c0949i, "sink");
        do {
            int i7 = this.f9500h;
            InterfaceC0951k interfaceC0951k = this.f9496c;
            if (i7 == 0) {
                interfaceC0951k.skip(this.f9501i);
                this.f9501i = 0;
                if ((this.f9498f & 4) == 0) {
                    i6 = this.f9499g;
                    int s5 = R4.b.s(interfaceC0951k);
                    this.f9500h = s5;
                    this.f9497e = s5;
                    int readByte = interfaceC0951k.readByte() & 255;
                    this.f9498f = interfaceC0951k.readByte() & 255;
                    Logger logger = s.f9502g;
                    if (logger.isLoggable(Level.FINE)) {
                        C0952l c0952l = f.a;
                        logger.fine(f.a(true, this.f9499g, this.f9497e, readByte, this.f9498f));
                    }
                    readInt = interfaceC0951k.readInt() & TableCell.NOT_TRACKED;
                    this.f9499g = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long W5 = interfaceC0951k.W(Math.min(j3, i7), c0949i);
                if (W5 != -1) {
                    this.f9500h -= (int) W5;
                    return W5;
                }
            }
            return -1L;
        } while (readInt == i6);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // d5.I
    public final K timeout() {
        return this.f9496c.timeout();
    }
}
