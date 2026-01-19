package v;

import H0.AbstractC0157l;
import h0.AbstractC1040q;

/* loaded from: classes.dex */
public abstract class M extends AbstractC1040q implements H0.F0 {

    /* renamed from: r, reason: collision with root package name */
    public F0 f15259r;

    /* renamed from: s, reason: collision with root package name */
    public F0 f15260s;

    public M() {
        C1777A c1777a = AbstractC1787b.f15286c;
        this.f15259r = c1777a;
        this.f15260s = c1777a;
    }

    @Override // h0.AbstractC1040q
    public void E0() {
        AbstractC0157l.y(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new L(this, 1));
        N0();
    }

    @Override // h0.AbstractC1040q
    public void F0() {
        this.f15260s = this.f15259r;
        AbstractC0157l.A(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new L(this, 0));
    }

    @Override // h0.AbstractC1040q
    public final void G0() {
        this.f15259r = AbstractC1787b.f15286c;
    }

    public abstract x0 M0(F0 f02);

    public void N0() {
        this.f15260s = M0(this.f15259r);
        AbstractC0157l.A(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new L(this, 0));
    }

    @Override // H0.F0
    public final Object m() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
