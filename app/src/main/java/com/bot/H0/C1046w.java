package h0;

import B0.F;
import F0.U;
import F0.W;
import F0.X;
import F0.k0;
import H0.InterfaceC0170z;
import j1.AbstractC1135a;

/* renamed from: h0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046w extends AbstractC1040q implements InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public float f11826r;

    @Override // H0.InterfaceC0170z
    public final W d(X x5, U u5, long j3) {
        k0 w5 = u5.w(j3);
        return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new F(11, w5, this));
    }

    public final String toString() {
        return AbstractC1135a.h(new StringBuilder("ZIndexModifier(zIndex="), this.f11826r, ')');
    }
}
