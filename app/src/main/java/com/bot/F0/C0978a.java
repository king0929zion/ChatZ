package f0;

import D.C0069g0;
import T.U;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978a extends C0979b {
    @Override // f0.C0979b
    public final C0979b C(l4.c cVar, l4.c cVar2) {
        return (C0979b) ((AbstractC0983f) AbstractC0992o.e(new P2.r(new C0069g0(18, cVar, cVar2), 5)));
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final void c() {
        synchronized (AbstractC0992o.f11707c) {
            o();
        }
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final void k() {
        AbstractC0997t.l();
        throw null;
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final void l() {
        AbstractC0997t.l();
        throw null;
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final void m() {
        AbstractC0992o.a();
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final AbstractC0983f u(l4.c cVar) {
        return (C0982e) ((AbstractC0983f) AbstractC0992o.e(new P2.r(new U(cVar, 1), 5)));
    }

    @Override // f0.C0979b
    public final AbstractC0997t w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
