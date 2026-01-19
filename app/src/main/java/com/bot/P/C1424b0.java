package p;

import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.C0149f0;
import H0.InterfaceC0154i;
import H0.InterfaceC0161p;
import Z2.C0741a0;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import t.C1676d;
import t.C1677e;
import t.C1682j;
import t.InterfaceC1681i;
import x4.AbstractC1888A;
import x4.C1940w;
import x4.InterfaceC1922e0;

/* renamed from: p.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1424b0 extends AbstractC0156k implements H0.A0, InterfaceC0161p, InterfaceC0154i, H0.m0, H0.F0 {

    /* renamed from: z, reason: collision with root package name */
    public static final C1423b f13676z = new Object();

    /* renamed from: t, reason: collision with root package name */
    public C1682j f13677t;

    /* renamed from: u, reason: collision with root package name */
    public final l4.c f13678u;

    /* renamed from: v, reason: collision with root package name */
    public C1676d f13679v;

    /* renamed from: w, reason: collision with root package name */
    public y.X f13680w;

    /* renamed from: x, reason: collision with root package name */
    public H0.i0 f13681x;

    /* renamed from: y, reason: collision with root package name */
    public final m0.C f13682y;

    public C1424b0(C1682j c1682j, int i6, D.P0 p02) {
        this.f13677t = c1682j;
        this.f13678u = p02;
        m0.C c6 = new m0.C(i6, new O4.j(2, this, C1424b0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 2), 10);
        M0(c6);
        this.f13682y = c6;
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // h0.AbstractC1040q
    public final void G0() {
        y.X x5 = this.f13680w;
        if (x5 != null) {
            x5.b();
        }
        this.f13680w = null;
    }

    @Override // H0.A0
    public final void I(P0.x xVar) {
        boolean b5 = this.f13682y.R0().b();
        s4.e[] eVarArr = P0.v.a;
        P0.w wVar = P0.t.f4532k;
        s4.e eVar = P0.v.a[4];
        xVar.a(wVar, Boolean.valueOf(b5));
        xVar.a(P0.l.f4488w, new P0.a(null, new I.o(0, this, C1424b0.class, "requestFocus", "requestFocus()Z", 0, 0, 6)));
    }

    public final void P0(C1682j c1682j, InterfaceC1681i interfaceC1681i) {
        if (!this.f11819q) {
            c1682j.b(interfaceC1681i);
        } else {
            InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) ((C4.c) A0()).f686c.r(C1940w.f15731e);
            AbstractC1888A.y(A0(), null, new Z(c1682j, interfaceC1681i, interfaceC1922e0 != null ? interfaceC1922e0.S(new Z2.X(12, c1682j, interfaceC1681i)) : null, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
                                                                                            public final void Q0() {
        C0149f0 c0149f0;
        if (this.f11819q) {
            if (!this.f11806c.f11819q) {
                E0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1040q abstractC1040q = this.f11806c.f11810h;
            H0.J v5 = AbstractC0157l.v(this);
            while (v5 != null) {
                if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.ATXHEADERSPACE) != 0) {
                    while (abstractC1040q != null) {
                        if ((abstractC1040q.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                            AbstractC0156k abstractC0156k = abstractC1040q;
                            int r5 = 0;
                            while (abstractC0156k != 0) {
                                if (abstractC0156k instanceof H0.F0) {
                                    if (AbstractC1426c0.f13686r.equals(((H0.F0) abstractC0156k).m())) {
                                        return;
                                    }
                                } else if ((abstractC0156k.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                                    int i6 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r5 = r5;
                                    while (abstractC1040q2 != null) {
                                        if ((abstractC1040q2.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                                            i6++;
                                            r5 = r5;
                                            if (i6 == 1) {
                                                abstractC0156k = abstractC1040q2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC0156k != 0) {
                                                    r5.b(abstractC0156k);
                                                    abstractC0156k = 0;
                                                }
                                                r5.b(abstractC1040q2);
                                            }
                                        }
                                        abstractC1040q2 = abstractC1040q2.f11811i;
                                        abstractC0156k = abstractC0156k;
                                        r5 = r5;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                abstractC0156k = AbstractC0157l.e(r5);
                            }
                        }
                        abstractC1040q = abstractC1040q.f11810h;
                    }
                }
                v5 = v5.v();
                abstractC1040q = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
            }
        }
    }

    public final void R0(C1682j c1682j) {
        C1676d c1676d;
        if (AbstractC1276k.b(this.f13677t, c1682j)) {
            return;
        }
        C1682j c1682j2 = this.f13677t;
        if (c1682j2 != null && (c1676d = this.f13679v) != null) {
            c1682j2.b(new C1677e(c1676d));
        }
        this.f13679v = null;
        this.f13677t = c1682j;
    }

        @Override // H0.m0
    public final void i0() {
        Object obj = new Object();
        AbstractC0157l.r(this, new C0741a0(4, obj, this));
        y.X x5 = (y.X) obj.f12973c;
        if (this.f13682y.R0().b()) {
            y.X x6 = this.f13680w;
            if (x6 != null) {
                x6.b();
            }
            if (x5 != null) {
                x5.a();
            } else {
                x5 = null;
            }
            this.f13680w = x5;
        }
    }

    @Override // H0.InterfaceC0161p
    public final void j0(H0.i0 i0Var) {
        this.f13681x = i0Var;
        if (this.f13682y.R0().b()) {
            if (!i0Var.W0().f11819q) {
                Q0();
                return;
            }
            H0.i0 i0Var2 = this.f13681x;
            if (i0Var2 == null || !i0Var2.W0().f11819q) {
                return;
            }
            Q0();
        }
    }

    @Override // H0.F0
    public final Object m() {
        return f13676z;
    }
}
