package p;

import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.InterfaceC0154i;
import H0.InterfaceC0155j;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import r.C1620x1;
import r.InterfaceC1618x;
import r.InterfaceC1619x0;
import r.InterfaceC1623y1;
import r.X0;
import t.C1682j;

/* loaded from: classes.dex */
public final class R0 extends AbstractC0156k implements InterfaceC0154i, H0.m0 {

    /* renamed from: A, reason: collision with root package name */
    public C1459u f13632A;

    /* renamed from: B, reason: collision with root package name */
    public C1620x1 f13633B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC0155j f13634C;

    /* renamed from: D, reason: collision with root package name */
    public C1460v f13635D;

    /* renamed from: E, reason: collision with root package name */
    public C1459u f13636E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f13637F;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1623y1 f13638t;

    /* renamed from: u, reason: collision with root package name */
    public X0 f13639u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13640v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC1619x0 f13641w;

    /* renamed from: x, reason: collision with root package name */
    public C1682j f13642x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC1618x f13643y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13644z;

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        this.f13637F = Q0();
        P0();
        if (this.f13633B == null) {
            InterfaceC1623y1 interfaceC1623y1 = this.f13638t;
            C1459u c1459u = this.f13644z ? this.f13636E : this.f13632A;
            C1620x1 c1620x1 = new C1620x1(c1459u, this.f13643y, this.f13641w, this.f13639u, interfaceC1623y1, this.f13642x, this.f13640v, this.f13637F);
            M0(c1620x1);
            this.f13633B = c1620x1;
        }
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        InterfaceC0155j interfaceC0155j = this.f13634C;
        if (interfaceC0155j != null) {
            N0(interfaceC0155j);
        }
    }

    public final void P0() {
        InterfaceC0155j interfaceC0155j = this.f13634C;
        if (interfaceC0155j != null) {
            if (((AbstractC1040q) interfaceC0155j).f11806c.f11819q) {
                return;
            }
            M0(interfaceC0155j);
            return;
        }
        if (this.f13644z) {
            AbstractC0157l.r(this, new Y3.l(this, 16));
        }
        C1459u c1459u = this.f13644z ? this.f13636E : this.f13632A;
        if (c1459u != null) {
            AbstractC0156k abstractC0156k = c1459u.f13806i;
            if (abstractC0156k.f11806c.f11819q) {
                return;
            }
            M0(abstractC0156k);
            this.f13634C = abstractC0156k;
        }
    }

    public final boolean Q0() {
        return (this.f11819q ? AbstractC0157l.v(this).f1715D : e1.m.f11576c) != e1.m.f11577e || this.f13639u == X0.f14183c;
    }

    public final void R0(C1459u c1459u, InterfaceC1618x interfaceC1618x, InterfaceC1619x0 interfaceC1619x0, X0 x02, InterfaceC1623y1 interfaceC1623y1, C1682j c1682j, boolean z5, boolean z6) {
        boolean z7;
        this.f13638t = interfaceC1623y1;
        this.f13639u = x02;
        boolean z8 = true;
        if (this.f13644z != z5) {
            this.f13644z = z5;
            z7 = true;
        } else {
            z7 = false;
        }
        if (AbstractC1276k.b(this.f13632A, c1459u)) {
            z8 = false;
        } else {
            this.f13632A = c1459u;
        }
        if (z7 || (z8 && !z5)) {
            InterfaceC0155j interfaceC0155j = this.f13634C;
            if (interfaceC0155j != null) {
                N0(interfaceC0155j);
            }
            this.f13634C = null;
            P0();
        }
        this.f13640v = z6;
        this.f13641w = interfaceC1619x0;
        this.f13642x = c1682j;
        this.f13643y = interfaceC1618x;
        boolean Q02 = Q0();
        this.f13637F = Q02;
        C1620x1 c1620x1 = this.f13633B;
        if (c1620x1 != null) {
            c1620x1.h1(this.f13644z ? this.f13636E : this.f13632A, interfaceC1618x, interfaceC1619x0, x02, interfaceC1623y1, c1682j, z6, Q02);
        }
    }

    @Override // H0.InterfaceC0155j
    public final void U() {
        boolean Q02 = Q0();
        if (this.f13637F != Q02) {
            this.f13637F = Q02;
            InterfaceC1623y1 interfaceC1623y1 = this.f13638t;
            X0 x02 = this.f13639u;
            boolean z5 = this.f13644z;
            C1459u c1459u = z5 ? this.f13636E : this.f13632A;
            R0(c1459u, this.f13643y, this.f13641w, x02, interfaceC1623y1, this.f13642x, z5, this.f13640v);
        }
    }

    @Override // H0.m0
    public final void i0() {
        C1460v c1460v = (C1460v) AbstractC0157l.h(this, F0.a);
        if (AbstractC1276k.b(c1460v, this.f13635D)) {
            return;
        }
        this.f13635D = c1460v;
        this.f13636E = null;
        InterfaceC0155j interfaceC0155j = this.f13634C;
        if (interfaceC0155j != null) {
            N0(interfaceC0155j);
        }
        this.f13634C = null;
        P0();
        C1620x1 c1620x1 = this.f13633B;
        if (c1620x1 != null) {
            InterfaceC1623y1 interfaceC1623y1 = this.f13638t;
            X0 x02 = this.f13639u;
            C1459u c1459u = this.f13644z ? this.f13636E : this.f13632A;
            c1620x1.h1(c1459u, this.f13643y, this.f13641w, x02, interfaceC1623y1, this.f13642x, this.f13640v, this.f13637F);
        }
    }
}
