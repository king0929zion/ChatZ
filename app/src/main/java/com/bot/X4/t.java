package X4;

import d5.C0949i;
import d5.G;
import d5.K;
import java.io.InterruptedIOException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class t implements G {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9506c;

    /* renamed from: e, reason: collision with root package name */
    public final C0949i f9507e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f9508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f9509g;

    /* JADX WARN: Type inference failed for: r1v1, types: [d5.i, java.lang.Object] */
    public t(w wVar, boolean z5) {
        this.f9509g = wVar;
        this.f9506c = z5;
    }

    @Override // d5.G
    public final void T(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "source");
        byte[] bArr = R4.b.a;
        C0949i c0949i2 = this.f9507e;
        c0949i2.T(j3, c0949i);
        while (c0949i2.f11482e >= 16384) {
            c(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void c(boolean z5) {
        long min;
        boolean z6;
        w wVar = this.f9509g;
        synchronized (wVar) {
            wVar.f9527l.h();
            while (wVar.f9520e >= wVar.f9521f && !this.f9506c && !this.f9508f) {
                try {
                    synchronized (wVar) {
                        int i6 = wVar.f9528m;
                        if (i6 != 0) {
                            break;
                        }
                        try {
                            wVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    wVar.f9527l.k();
                    throw th;
                }
            }
            wVar.f9527l.k();
            wVar.b();
            min = Math.min(wVar.f9521f - wVar.f9520e, this.f9507e.f11482e);
            wVar.f9520e += min;
            z6 = z5 && min == this.f9507e.f11482e;
        }
        this.f9509g.f9527l.h();
        try {
            w wVar2 = this.f9509g;
            wVar2.f9517b.p(wVar2.a, z6, this.f9507e, min);
        } finally {
            this.f9509g.f9527l.k();
        }
    }

    @Override // d5.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z5;
        w wVar = this.f9509g;
        byte[] bArr = R4.b.a;
        synchronized (wVar) {
            if (this.f9508f) {
                return;
            }
            synchronized (wVar) {
                z5 = wVar.f9528m == 0;
            }
            w wVar2 = this.f9509g;
            if (!wVar2.f9525j.f9506c) {
                if (this.f9507e.f11482e > 0) {
                    while (this.f9507e.f11482e > 0) {
                        c(true);
                    }
                } else if (z5) {
                    wVar2.f9517b.p(wVar2.a, true, null, 0L);
                }
            }
            synchronized (this.f9509g) {
                this.f9508f = true;
            }
            this.f9509g.f9517b.flush();
            this.f9509g.a();
        }
    }

    @Override // d5.G, java.io.Flushable
    public final void flush() {
        w wVar = this.f9509g;
        byte[] bArr = R4.b.a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f9507e.f11482e > 0) {
            c(false);
            this.f9509g.f9517b.flush();
        }
    }

    @Override // d5.G
    public final K timeout() {
        return this.f9509g.f9527l;
    }
}
