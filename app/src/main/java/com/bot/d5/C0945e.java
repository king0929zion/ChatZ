package d5;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.IOException;
import java.io.InputStream;
import m4.AbstractC1276k;

/* renamed from: d5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945e implements I {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11468c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11469e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11470f;

    public C0945e(InputStream inputStream, K k3) {
        AbstractC1276k.f(inputStream, FlexmarkHtmlConverter.INPUT_NODE);
        this.f11469e = inputStream;
        this.f11470f = k3;
    }

    @Override // d5.I
    public final long W(long j3, C0949i c0949i) {
        switch (this.f11468c) {
            case 0:
                AbstractC1276k.f(c0949i, "sink");
                H h3 = (H) this.f11469e;
                C0945e c0945e = (C0945e) this.f11470f;
                h3.h();
                try {
                    long W5 = c0945e.W(j3, c0949i);
                    if (h3.i()) {
                        throw h3.k(null);
                    }
                    return W5;
                } catch (IOException e6) {
                    if (h3.i()) {
                        throw h3.k(e6);
                    }
                    throw e6;
                } finally {
                    h3.i();
                }
            default:
                AbstractC1276k.f(c0949i, "sink");
                if (j3 == 0) {
                    return 0L;
                }
                if (j3 < 0) {
                    throw new IllegalArgumentException(B3.e.m("byteCount < 0: ", j3).toString());
                }
                try {
                    ((K) this.f11470f).f();
                    D H3 = c0949i.H(1);
                    int read = ((InputStream) this.f11469e).read(H3.a, H3.f11448c, (int) Math.min(j3, 8192 - H3.f11448c));
                    if (read == -1) {
                        if (H3.f11447b == H3.f11448c) {
                            c0949i.f11481c = H3.a();
                            E.a(H3);
                        }
                        return -1L;
                    }
                    H3.f11448c += read;
                    long j4 = read;
                    c0949i.f11482e += j4;
                    return j4;
                } catch (AssertionError e7) {
                    if (AbstractC0942b.f(e7)) {
                        throw new IOException(e7);
                    }
                    throw e7;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f11468c) {
            case 0:
                H h3 = (H) this.f11469e;
                C0945e c0945e = (C0945e) this.f11470f;
                h3.h();
                try {
                    c0945e.close();
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
                ((InputStream) this.f11469e).close();
                return;
        }
    }

    @Override // d5.I
    public final K timeout() {
        switch (this.f11468c) {
            case 0:
                return (H) this.f11469e;
            default:
                return (K) this.f11470f;
        }
    }

    public final String toString() {
        switch (this.f11468c) {
            case 0:
                return "AsyncTimeout.source(" + ((C0945e) this.f11470f) + ')';
            default:
                return "source(" + ((InputStream) this.f11469e) + ')';
        }
    }

    public C0945e(H h3, C0945e c0945e) {
        this.f11469e = h3;
        this.f11470f = c0945e;
    }
}
