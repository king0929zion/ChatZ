package v;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15257c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f15258e;

    public /* synthetic */ L(M m3, int i6) {
        this.f15257c = i6;
        this.f15258e = m3;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        H0.F0 f02 = (H0.F0) obj;
        switch (this.f15257c) {
            case 0:
                AbstractC1276k.d(f02, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                M m3 = (M) f02;
                F0 f03 = this.f15258e.f15260s;
                if (!AbstractC1276k.b(m3.f15259r, f03)) {
                    m3.f15259r = f03;
                    m3.N0();
                }
                return H0.E0.f1693e;
            default:
                AbstractC1276k.d(f02, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                this.f15258e.f15259r = ((M) f02).f15260s;
                return Boolean.FALSE;
        }
    }
}
