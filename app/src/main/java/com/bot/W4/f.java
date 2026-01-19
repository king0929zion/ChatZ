package W4;

import d5.C0949i;
import d5.G;
import d5.K;
import d5.r;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f implements G {

    /* renamed from: c, reason: collision with root package name */
    public final r f9036c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f9038f;

    public f(h hVar) {
        this.f9038f = hVar;
        this.f9036c = new r(hVar.f9042d.timeout());
    }

    @Override // d5.G
    public final void T(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "source");
        if (this.f9037e) {
            throw new IllegalStateException("closed");
        }
        R4.b.c(c0949i.f11482e, 0L, j3);
        this.f9038f.f9042d.T(j3, c0949i);
    }

    @Override // d5.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9037e) {
            return;
        }
        this.f9037e = true;
        r rVar = this.f9036c;
        K k3 = rVar.f11499e;
        rVar.f11499e = K.f11458d;
        k3.a();
        k3.b();
        this.f9038f.f9043e = 3;
    }

    @Override // d5.G, java.io.Flushable
    public final void flush() {
        if (this.f9037e) {
            return;
        }
        this.f9038f.f9042d.flush();
    }

    @Override // d5.G
    public final K timeout() {
        return this.f9036c;
    }
}
