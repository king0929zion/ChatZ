package d5;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class t implements I {

    /* renamed from: c, reason: collision with root package name */
    public final C f11505c;

    /* renamed from: e, reason: collision with root package name */
    public final Inflater f11506e;

    /* renamed from: f, reason: collision with root package name */
    public int f11507f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11508g;

    public t(C c6, Inflater inflater) {
        this.f11505c = c6;
        this.f11506e = inflater;
    }

    @Override // d5.I
    public final long W(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "sink");
        do {
            Inflater inflater = this.f11506e;
            AbstractC1276k.f(c0949i, "sink");
            long j4 = 0;
            if (j3 < 0) {
                throw new IllegalArgumentException(B3.e.m("byteCount < 0: ", j3).toString());
            }
            if (this.f11508g) {
                throw new IllegalStateException("closed");
            }
            if (j3 != 0) {
                try {
                    D H3 = c0949i.H(1);
                    int min = (int) Math.min(j3, 8192 - H3.f11448c);
                    boolean needsInput = inflater.needsInput();
                    C c6 = this.f11505c;
                    if (needsInput && !c6.c()) {
                        D d6 = c6.f11445e.f11481c;
                        AbstractC1276k.c(d6);
                        int i6 = d6.f11448c;
                        int i7 = d6.f11447b;
                        int i8 = i6 - i7;
                        this.f11507f = i8;
                        inflater.setInput(d6.a, i7, i8);
                    }
                    int inflate = inflater.inflate(H3.a, H3.f11448c, min);
                    int i9 = this.f11507f;
                    if (i9 != 0) {
                        int remaining = i9 - inflater.getRemaining();
                        this.f11507f -= remaining;
                        c6.skip(remaining);
                    }
                    if (inflate > 0) {
                        H3.f11448c += inflate;
                        long j5 = inflate;
                        c0949i.f11482e += j5;
                        j4 = j5;
                    } else if (H3.f11447b == H3.f11448c) {
                        c0949i.f11481c = H3.a();
                        E.a(H3);
                    }
                } catch (DataFormatException e6) {
                    throw new IOException(e6);
                }
            }
            if (j4 > 0) {
                return j4;
            }
            Inflater inflater2 = this.f11506e;
            if (inflater2.finished() || inflater2.needsDictionary()) {
                return -1L;
            }
        } while (!this.f11505c.c());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11508g) {
            return;
        }
        this.f11506e.end();
        this.f11508g = true;
        this.f11505c.close();
    }

    @Override // d5.I
    public final K timeout() {
        return this.f11505c.f11444c.timeout();
    }
}
