package A;

import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f extends AbstractC1040q {

    /* renamed from: r, reason: collision with root package name */
    public d f9r;

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        d dVar = this.f9r;
        if (dVar != null) {
            dVar.a.j(this);
        }
        if (dVar != null) {
            dVar.a.b(this);
        }
        this.f9r = dVar;
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        d dVar = this.f9r;
        if (dVar != null) {
            AbstractC1276k.d(dVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            dVar.a.j(this);
        }
    }
}
