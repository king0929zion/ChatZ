package F0;

import H0.InterfaceC0169y;
import h0.AbstractC1040q;

/* renamed from: F0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118f0 extends AbstractC1040q implements InterfaceC0169y {

    /* renamed from: r, reason: collision with root package name */
    public l4.c f1474r;

    /* renamed from: s, reason: collision with root package name */
    public long f1475s;

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return true;
    }

    @Override // H0.InterfaceC0169y
    public final void q(long j3) {
        if (e1.l.b(this.f1475s, j3)) {
            return;
        }
        this.f1474r.f(new e1.l(j3));
        this.f1475s = j3;
    }
}
