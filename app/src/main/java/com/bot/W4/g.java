package W4;

import d5.C0949i;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: g, reason: collision with root package name */
    public boolean f9039g;

    @Override // W4.b, d5.I
    public final long W(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(B3.e.m("byteCount < 0: ", j3).toString());
        }
        if (this.f9025e) {
            throw new IllegalStateException("closed");
        }
        if (this.f9039g) {
            return -1L;
        }
        long W5 = super.W(j3, c0949i);
        if (W5 != -1) {
            return W5;
        }
        this.f9039g = true;
        c();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9025e) {
            return;
        }
        if (!this.f9039g) {
            c();
        }
        this.f9025e = true;
    }
}
