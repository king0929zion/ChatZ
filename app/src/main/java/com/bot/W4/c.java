package W4;

import d5.C0949i;
import d5.G;
import d5.InterfaceC0950j;
import d5.K;
import d5.r;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class c implements G {

    /* renamed from: c, reason: collision with root package name */
    public final r f9027c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f9029f;

    public c(h hVar) {
        this.f9029f = hVar;
        this.f9027c = new r(hVar.f9042d.timeout());
    }

    @Override // d5.G
    public final void T(long j3, C0949i c0949i) {
        InterfaceC0950j interfaceC0950j = this.f9029f.f9042d;
        AbstractC1276k.f(c0949i, "source");
        if (this.f9028e) {
            throw new IllegalStateException("closed");
        }
        if (j3 == 0) {
            return;
        }
        interfaceC0950j.L(j3);
        interfaceC0950j.F("\r\n");
        interfaceC0950j.T(j3, c0949i);
        interfaceC0950j.F("\r\n");
    }

    @Override // d5.G, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f9028e) {
            return;
        }
        this.f9028e = true;
        this.f9029f.f9042d.F("0\r\n\r\n");
        r rVar = this.f9027c;
        K k3 = rVar.f11499e;
        rVar.f11499e = K.f11458d;
        k3.a();
        k3.b();
        this.f9029f.f9043e = 3;
    }

    @Override // d5.G, java.io.Flushable
    public final synchronized void flush() {
        if (this.f9028e) {
            return;
        }
        this.f9029f.f9042d.flush();
    }

    @Override // d5.G
    public final K timeout() {
        return this.f9027c;
    }
}
