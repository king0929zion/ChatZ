package L;

import B0.C0040p;
import B0.EnumC0041q;
import B0.Q;
import B0.X;
import D.C0057a0;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.C0151g0;
import H0.C0159n;
import H0.D0;
import H0.w0;
import e1.InterfaceC0961c;
import l4.InterfaceC1193a;
import m0.EnumC1245A;
import m0.h;
import m0.y;

/* loaded from: classes.dex */
public final class d extends AbstractC0156k implements w0, h, y {

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1193a f2985t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2986u;

    /* renamed from: v, reason: collision with root package name */
    public final X f2987v;

    public d(InterfaceC1193a interfaceC1193a) {
        this.f2985t = interfaceC1193a;
        C0057a0 c0057a0 = new C0057a0(this, 2);
        C0040p c0040p = Q.a;
        X x5 = new X(null, null, c0057a0);
        M0(x5);
        this.f2987v = x5;
    }

    @Override // m0.h
    public final void H(EnumC1245A enumC1245A) {
        this.f2986u = enumC1245A.b();
    }

    @Override // H0.w0
    public final void L() {
        this.f2987v.L();
    }

    @Override // H0.w0
    public final long p() {
        C0159n c0159n = b.a;
        InterfaceC0961c interfaceC0961c = AbstractC0157l.v(this).f1714C;
        c0159n.getClass();
        int i6 = D0.f1691b;
        return C0151g0.c(interfaceC0961c.l0(c0159n.a), interfaceC0961c.l0(c0159n.f1975b), interfaceC0961c.l0(c0159n.f1976c), interfaceC0961c.l0(c0159n.f1977d));
    }

    @Override // H0.w0
    public final void w(C0040p c0040p, EnumC0041q enumC0041q, long j3) {
        this.f2987v.w(c0040p, enumC0041q, j3);
    }
}
