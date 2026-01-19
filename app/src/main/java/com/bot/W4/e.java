package W4;

import d5.C0949i;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: g, reason: collision with root package name */
    public long f9034g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f9035h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, long j3) {
        super(hVar);
        this.f9035h = hVar;
        this.f9034g = j3;
        if (j3 == 0) {
            c();
        }
    }

    @Override // W4.b, d5.I
    public final long W(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(B3.e.m("byteCount < 0: ", j3).toString());
        }
        if (this.f9025e) {
            throw new IllegalStateException("closed");
        }
        long j4 = this.f9034g;
        if (j4 == 0) {
            return -1L;
        }
        long W5 = super.W(Math.min(j4, j3), c0949i);
        if (W5 == -1) {
            this.f9035h.f9040b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }
        long j5 = this.f9034g - W5;
        this.f9034g = j5;
        if (j5 == 0) {
            c();
        }
        return W5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z5;
        if (this.f9025e) {
            return;
        }
        if (this.f9034g != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = R4.b.a;
            AbstractC1276k.f(timeUnit, "timeUnit");
            try {
                z5 = R4.b.t(this, 100);
            } catch (IOException unused) {
                z5 = false;
            }
            if (!z5) {
                this.f9035h.f9040b.k();
                c();
            }
        }
        this.f9025e = true;
    }
}
