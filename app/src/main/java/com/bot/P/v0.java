package p;

import H0.AbstractC0157l;
import H0.InterfaceC0160o;
import H0.InterfaceC0161p;
import T.C0602e;
import T.C0607g0;
import android.view.View;
import e1.InterfaceC0961c;
import h0.AbstractC1040q;
import i4.AbstractC1120d;
import n0.C1353b;
import o4.AbstractC1410a;
import x4.AbstractC1888A;
import z4.C2057h;

/* loaded from: classes.dex */
public final class v0 extends AbstractC1040q implements InterfaceC0161p, InterfaceC0160o, H0.A0, H0.m0 {

    /* renamed from: A, reason: collision with root package name */
    public e1.l f13812A;

    /* renamed from: B, reason: collision with root package name */
    public C2057h f13813B;

    /* renamed from: r, reason: collision with root package name */
    public l4.c f13814r;

    /* renamed from: s, reason: collision with root package name */
    public l4.c f13815s;

    /* renamed from: t, reason: collision with root package name */
    public H0 f13816t;

    /* renamed from: u, reason: collision with root package name */
    public View f13817u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0961c f13818v;

    /* renamed from: w, reason: collision with root package name */
    public G0 f13819w;

    /* renamed from: y, reason: collision with root package name */
    public T.E f13821y;

    /* renamed from: x, reason: collision with root package name */
    public final C0607g0 f13820x = new C0607g0(null, C0602e.f8080g);

    /* renamed from: z, reason: collision with root package name */
    public long f13822z = 9205357640488583168L;

    public v0(l4.c cVar, l4.c cVar2, H0 h02) {
        this.f13814r = cVar;
        this.f13815s = cVar2;
        this.f13816t = h02;
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        i0();
        this.f13813B = AbstractC1120d.a(0, 7, null);
        AbstractC1888A.y(A0(), null, new u0(this, null), 1);
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        G0 g02 = this.f13819w;
        if (g02 != null) {
            ((I0) g02).b();
        }
        this.f13819w = null;
    }

    @Override // H0.A0
    public final void I(P0.x xVar) {
        xVar.a(w0.a, new t0(this, 1));
    }

    public final long M0() {
        if (this.f13821y == null) {
            this.f13821y = T.r.s(new t0(this, 2));
        }
        T.E e6 = this.f13821y;
        if (e6 != null) {
            return ((C1353b) e6.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void N0() {
        G0 g02 = this.f13819w;
        if (g02 != null) {
            ((I0) g02).b();
        }
        View view = this.f13817u;
        if (view == null) {
            view = AbstractC0157l.x(this);
        }
        this.f13817u = view;
        InterfaceC0961c interfaceC0961c = this.f13818v;
        if (interfaceC0961c == null) {
            interfaceC0961c = AbstractC0157l.v(this).f1714C;
        }
        this.f13818v = interfaceC0961c;
        this.f13819w = this.f13816t.b(view, interfaceC0961c);
        P0();
    }

    public final void O0() {
        InterfaceC0961c interfaceC0961c = this.f13818v;
        if (interfaceC0961c == null) {
            interfaceC0961c = AbstractC0157l.v(this).f1714C;
            this.f13818v = interfaceC0961c;
        }
        long j3 = ((C1353b) this.f13814r.f(interfaceC0961c)).a;
        if ((j3 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & M0()) == 9205357640488583168L) {
            this.f13822z = 9205357640488583168L;
            G0 g02 = this.f13819w;
            if (g02 != null) {
                ((I0) g02).b();
                return;
            }
            return;
        }
        this.f13822z = C1353b.f(M0(), j3);
        if (this.f13819w == null) {
            N0();
        }
        G0 g03 = this.f13819w;
        if (g03 != null) {
            g03.a(this.f13822z, 9205357640488583168L);
        }
        P0();
    }

    public final void P0() {
        InterfaceC0961c interfaceC0961c;
        G0 g02 = this.f13819w;
        if (g02 == null || (interfaceC0961c = this.f13818v) == null) {
            return;
        }
        I0 i02 = (I0) g02;
        long c6 = i02.c();
        e1.l lVar = this.f13812A;
        if (lVar != null && c6 == lVar.a) {
            return;
        }
        this.f13815s.f(new e1.h(interfaceC0961c.t(AbstractC1410a.S(i02.c()))));
        this.f13812A = new e1.l(i02.c());
    }

    @Override // H0.m0
    public final void i0() {
        AbstractC0157l.r(this, new t0(this, 0));
    }

    @Override // H0.InterfaceC0161p
    public final void j0(H0.i0 i0Var) {
        this.f13820x.setValue(i0Var);
    }

    @Override // H0.InterfaceC0160o
    public final void k0(H0.L l3) {
        l3.b();
        C2057h c2057h = this.f13813B;
        if (c2057h != null) {
            c2057h.t(X3.y.a);
        }
    }
}
