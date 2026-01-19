package u0;

import H0.C0158m;
import H0.L;
import T.C0602e;
import T.C0607g0;
import f0.C0987j;
import j1.AbstractC1135a;
import n0.C1356e;
import o0.C1400k;
import q0.C1496b;
import t0.AbstractC1688b;

/* loaded from: classes.dex */
public final class J extends AbstractC1688b {

    /* renamed from: h, reason: collision with root package name */
    public final C0607g0 f14984h = T.r.A(new C1356e(0));

    /* renamed from: i, reason: collision with root package name */
    public final C0607g0 f14985i = T.r.A(Boolean.FALSE);

    /* renamed from: j, reason: collision with root package name */
    public final F f14986j;

    /* renamed from: k, reason: collision with root package name */
    public final C0607g0 f14987k;

    /* renamed from: l, reason: collision with root package name */
    public float f14988l;

    /* renamed from: m, reason: collision with root package name */
    public C1400k f14989m;

    public J(C1743d c1743d) {
        F f6 = new F(c1743d);
        f6.f14966f = new A0.b(this, 20);
        this.f14986j = f6;
        this.f14987k = new C0607g0(X3.y.a, C0602e.f8080g);
        this.f14988l = 1.0f;
    }

    @Override // t0.AbstractC1688b
    public final void c(float f6) {
        this.f14988l = f6;
    }

    @Override // t0.AbstractC1688b
    public final void d(C1400k c1400k) {
        this.f14989m = c1400k;
    }

    @Override // t0.AbstractC1688b
    public final long h() {
        return ((C1356e) this.f14984h.getValue()).a;
    }

    @Override // t0.AbstractC1688b
    public final void i(L l3) {
        C1496b c1496b = l3.f1765c;
        C1400k c1400k = this.f14989m;
        F f6 = this.f14986j;
        if (c1400k == null) {
            c1400k = (C1400k) f6.f14967g.getValue();
        }
        if (((Boolean) this.f14985i.getValue()).booleanValue() && l3.getLayoutDirection() == e1.m.f11577e) {
            long o02 = c1496b.o0();
            C0158m c0158m = c1496b.f13944e;
            long j3 = c0158m.j();
            c0158m.g().h();
            try {
                ((C0987j) c0158m.f1972e).D(-1.0f, 1.0f, o02);
                f6.e(l3, this.f14988l, c1400k);
            } finally {
                AbstractC1135a.q(c0158m, j3);
            }
        } else {
            f6.e(l3, this.f14988l, c1400k);
        }
        this.f14987k.getValue();
    }
}
