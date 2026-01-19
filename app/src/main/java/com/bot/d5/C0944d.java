package d5;

import java.io.IOException;
import java.io.OutputStream;
import m4.AbstractC1276k;

/* renamed from: d5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944d implements G {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11465c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11466e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11467f;

    public /* synthetic */ C0944d(int i6, Object obj, Object obj2) {
        this.f11465c = i6;
        this.f11466e = obj;
        this.f11467f = obj2;
    }

    @Override // d5.G
    public final void T(long j3, C0949i c0949i) {
        switch (this.f11465c) {
            case 0:
                AbstractC1276k.f(c0949i, "source");
                AbstractC0942b.e(c0949i.f11482e, 0L, j3);
                long j4 = j3;
                while (true) {
                    long j5 = 0;
                    if (j4 <= 0) {
                        return;
                    }
                    D d6 = c0949i.f11481c;
                    AbstractC1276k.c(d6);
                    while (true) {
                        if (j5 < 65536) {
                            j5 += d6.f11448c - d6.f11447b;
                            if (j5 >= j4) {
                                j5 = j4;
                            } else {
                                d6 = d6.f11451f;
                                AbstractC1276k.c(d6);
                            }
                        }
                    }
                    H h3 = (H) this.f11466e;
                    C0944d c0944d = (C0944d) this.f11467f;
                    h3.h();
                    try {
                        try {
                            c0944d.T(j5, c0949i);
                            if (h3.i()) {
                                throw h3.k(null);
                            }
                            j4 -= j5;
                        } catch (IOException e6) {
                            if (!h3.i()) {
                                throw e6;
                            }
                            throw h3.k(e6);
                        }
                    } catch (Throwable th) {
                        h3.i();
                        throw th;
                    }
                }
            default:
                AbstractC1276k.f(c0949i, "source");
                AbstractC0942b.e(c0949i.f11482e, 0L, j3);
                while (j3 > 0) {
                    ((K) this.f11467f).f();
                    D d7 = c0949i.f11481c;
                    AbstractC1276k.c(d7);
                    int min = (int) Math.min(j3, d7.f11448c - d7.f11447b);
                    ((OutputStream) this.f11466e).write(d7.a, d7.f11447b, min);
                    int i6 = d7.f11447b + min;
                    d7.f11447b = i6;
                    long j6 = min;
                    j3 -= j6;
                    c0949i.f11482e -= j6;
                    if (i6 == d7.f11448c) {
                        c0949i.f11481c = d7.a();
                        E.a(d7);
                    }
                }
                return;
        }
    }

    @Override // d5.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f11465c) {
            case 0:
                H h3 = (H) this.f11466e;
                C0944d c0944d = (C0944d) this.f11467f;
                h3.h();
                try {
                    c0944d.close();
                    if (h3.i()) {
                        throw h3.k(null);
                    }
                    return;
                } catch (IOException e6) {
                    if (!h3.i()) {
                        throw e6;
                    }
                    throw h3.k(e6);
                } finally {
                    h3.i();
                }
            default:
                ((OutputStream) this.f11466e).close();
                return;
        }
    }

    @Override // d5.G, java.io.Flushable
    public final void flush() {
        switch (this.f11465c) {
            case 0:
                H h3 = (H) this.f11466e;
                C0944d c0944d = (C0944d) this.f11467f;
                h3.h();
                try {
                    c0944d.flush();
                    if (h3.i()) {
                        throw h3.k(null);
                    }
                    return;
                } catch (IOException e6) {
                    if (!h3.i()) {
                        throw e6;
                    }
                    throw h3.k(e6);
                } finally {
                    h3.i();
                }
            default:
                ((OutputStream) this.f11466e).flush();
                return;
        }
    }

    @Override // d5.G
    public final K timeout() {
        switch (this.f11465c) {
            case 0:
                return (H) this.f11466e;
            default:
                return (K) this.f11467f;
        }
    }

    public final String toString() {
        switch (this.f11465c) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0944d) this.f11467f) + ')';
            default:
                return "sink(" + ((OutputStream) this.f11466e) + ')';
        }
    }
}
