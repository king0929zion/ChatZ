package Q;

import D.C0068g;
import H0.InterfaceC0170z;
import e1.AbstractC0960b;
import e1.C0959a;
import h0.AbstractC1040q;
import n.C1316c;
import n.C1327h0;
import t.C1682j;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class k3 extends AbstractC1040q implements InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public C1682j f5945r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5946s;

    /* renamed from: t, reason: collision with root package name */
    public C1327h0 f5947t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5948u;

    /* renamed from: v, reason: collision with root package name */
    public C1316c f5949v;

    /* renamed from: w, reason: collision with root package name */
    public C1316c f5950w;

    /* renamed from: x, reason: collision with root package name */
    public float f5951x;

    /* renamed from: y, reason: collision with root package name */
    public float f5952y;

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        AbstractC1888A.y(A0(), null, new j3(this, null), 3);
    }

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        float e02 = x5.e0(this.f5948u ? S.z.f7520n : ((u5.d(C0959a.h(j3)) != 0 && u5.q(C0959a.g(j3)) != 0) || this.f5946s) ? a3.a : a3.f5650b);
        C1316c c1316c = this.f5950w;
        int floatValue = (int) (c1316c != null ? ((Number) c1316c.d()).floatValue() : e02);
        if (!((floatValue >= 0) & (floatValue >= 0))) {
            e1.i.a("width and height must be >= 0");
        }
        F0.k0 w5 = u5.w(AbstractC0960b.h(floatValue, floatValue, floatValue, floatValue));
        float e03 = x5.e0((a3.f5652d - x5.V(e02)) / 2.0f);
        float e04 = x5.e0((a3.f5651c - a3.a) - a3.f5653e);
        boolean z5 = this.f5948u;
        if (z5 && this.f5946s) {
            e03 = e04 - x5.e0(S.z.f7527u);
        } else if (z5 && !this.f5946s) {
            e03 = x5.e0(S.z.f7527u);
        } else if (this.f5946s) {
            e03 = e04;
        }
        C1316c c1316c2 = this.f5950w;
        Float f6 = c1316c2 != null ? (Float) c1316c2.f13095e.getValue() : null;
        if (f6 == null || f6.floatValue() != e02) {
            AbstractC1888A.y(A0(), null, new h3(this, e02, null), 3);
        }
        C1316c c1316c3 = this.f5949v;
        Float f7 = c1316c3 != null ? (Float) c1316c3.f13095e.getValue() : null;
        if (f7 == null || f7.floatValue() != e03) {
            AbstractC1888A.y(A0(), null, new i3(this, e03, null), 3);
        }
        if (Float.isNaN(this.f5952y) && Float.isNaN(this.f5951x)) {
            this.f5952y = e02;
            this.f5951x = e03;
        }
        return x5.D(floatValue, floatValue, Y3.w.f9813c, new C0068g(w5, this, e03));
    }
}
