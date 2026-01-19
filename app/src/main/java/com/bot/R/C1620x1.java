package r;

import B0.C0040p;
import B0.EnumC0041q;
import H0.AbstractC0157l;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import b0.C0872e;
import c4.EnumC0927a;
import e1.InterfaceC0961c;
import f0.C0987j;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import n.C1347v;
import p.AbstractC1462x;
import p.C1459u;
import t.C1682j;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;
import z0.AbstractC2013a;
import z0.AbstractC2015c;

/* renamed from: r.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1620x1 extends AbstractC1592o0 implements z0.e, H0.A0 {

    /* renamed from: L, reason: collision with root package name */
    public C1459u f14506L;

    /* renamed from: M, reason: collision with root package name */
    public InterfaceC1619x0 f14507M;

    /* renamed from: N, reason: collision with root package name */
    public final A0.e f14508N;

    /* renamed from: O, reason: collision with root package name */
    public final C1566f1 f14509O;

    /* renamed from: P, reason: collision with root package name */
    public final C1521G f14510P;

    /* renamed from: Q, reason: collision with root package name */
    public final E1 f14511Q;

    /* renamed from: R, reason: collision with root package name */
    public final C1593o1 f14512R;

    /* renamed from: S, reason: collision with root package name */
    public final m0.C f14513S;

    /* renamed from: T, reason: collision with root package name */
    public final C1515D f14514T;

    /* renamed from: U, reason: collision with root package name */
    public B4.D f14515U;

    /* renamed from: V, reason: collision with root package name */
    public C1617w1 f14516V;

    /* renamed from: W, reason: collision with root package name */
    public M1.b f14517W;

    /* JADX WARN: Multi-variable type inference failed */
                    public C1620x1(C1459u c1459u, InterfaceC1618x interfaceC1618x, InterfaceC1619x0 interfaceC1619x0, X0 x02, InterfaceC1623y1 interfaceC1623y1, C1682j c1682j, boolean z5, boolean z6) {
        super(AbstractC1587m1.a, z5, c1682j, x02);
        this.f14506L = c1459u;
        this.f14507M = interfaceC1619x0;
        A0.e eVar = new A0.e();
        this.f14508N = eVar;
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f14316r = z5;
        M0(abstractC1040q);
        this.f14509O = abstractC1040q;
        C1521G c1521g = new C1521G(new C1347v(new C0987j(AbstractC1587m1.f14391d)));
        this.f14510P = c1521g;
        C1459u c1459u2 = this.f14506L;
        Object r12 = this.f14507M;
        E1 e12 = new E1(interfaceC1623y1, c1459u2, r12 == 0 ? c1521g : r12, x02, z6, eVar, this, new C1596p1(this, 0));
        this.f14511Q = e12;
        C1593o1 c1593o1 = new C1593o1(e12, z5);
        this.f14512R = c1593o1;
        m0.C c6 = new m0.C(2, null, 10);
        M0(c6);
        this.f14513S = c6;
        C1515D c1515d = new C1515D(x02, e12, z6, interfaceC1618x, new C1596p1(this, 1));
        M0(c1515d);
        this.f14514T = c1515d;
        M0(new A0.j(c1593o1, eVar));
        AbstractC1040q abstractC1040q2 = new AbstractC1040q();
        abstractC1040q2.f29r = c1515d;
        M0(abstractC1040q2);
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        if (this.f11819q) {
            InterfaceC0961c interfaceC0961c = AbstractC0157l.v(this).f1714C;
            C1521G c1521g = this.f14510P;
            c1521g.getClass();
            c1521g.a = new C1347v(new C0987j(interfaceC0961c));
        }
        M1.b bVar = this.f14517W;
        if (bVar != null) {
            bVar.f3236e = AbstractC0157l.v(this).f1714C;
        }
    }

    @Override // z0.e
    public final boolean F(KeyEvent keyEvent) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        if (!this.f14422v) {
            return false;
        }
        if ((!AbstractC2013a.a(AbstractC2015c.b(keyEvent), AbstractC2013a.f16189D) && !AbstractC2013a.a(AbstractC2015c.a(keyEvent.getKeyCode()), AbstractC2013a.f16188C)) || AbstractC2015c.c(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        X0 x02 = this.f14511Q.f14015d;
        X0 x03 = X0.f14183c;
        C1515D c1515d = this.f14514T;
        if (x02 == x03) {
            int i6 = (int) (c1515d.f14001y & 4294967295L);
            float f6 = AbstractC2013a.a(AbstractC2015c.a(keyEvent.getKeyCode()), AbstractC2013a.f16188C) ? i6 : -i6;
            floatToRawIntBits = Float.floatToRawIntBits(S.l.f7374V);
            floatToRawIntBits2 = Float.floatToRawIntBits(f6);
        } else {
            int i7 = (int) (c1515d.f14001y >> 32);
            floatToRawIntBits = Float.floatToRawIntBits(AbstractC2013a.a(AbstractC2015c.a(keyEvent.getKeyCode()), AbstractC2013a.f16188C) ? i7 : -i7);
            floatToRawIntBits2 = Float.floatToRawIntBits(S.l.f7374V);
        }
        AbstractC1888A.y(A0(), null, new C1608t1(this, (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), null), 3);
        return true;
    }

    @Override // H0.A0
    public final void I(P0.x xVar) {
        if (this.f14422v && (this.f14515U == null || this.f14516V == null)) {
            this.f14515U = new B4.D(this, 29);
            this.f14516V = new C1617w1(this, null);
        }
        B4.D d6 = this.f14515U;
        if (d6 != null) {
            s4.e[] eVarArr = P0.v.a;
            xVar.a(P0.l.f4469d, new P0.a(null, d6));
        }
        C1617w1 c1617w1 = this.f14516V;
        if (c1617w1 != null) {
            s4.e[] eVarArr2 = P0.v.a;
            xVar.a(P0.l.f4470e, c1617w1);
        }
    }

    @Override // r.AbstractC1592o0
    public final Object T0(C1586m0 c1586m0, C1589n0 c1589n0) {
        E1 e12 = this.f14511Q;
        Object f6 = e12.f(p.x0.f13824e, new C1599q1(c1586m0, e12, null), c1589n0);
        return f6 == EnumC0927a.f11114c ? f6 : X3.y.a;
    }

    @Override // r.AbstractC1592o0
    public final void Y0(long j3) {
    }

    @Override // r.AbstractC1592o0
    public final void Z0(C1543U c1543u) {
        AbstractC1888A.y(this.f14508N.c(), null, new C1602r1(c1543u, this, null), 3);
    }

    @Override // H0.InterfaceC0155j, H0.w0
    public final void b() {
        L();
        if (this.f11819q) {
            InterfaceC0961c interfaceC0961c = AbstractC0157l.v(this).f1714C;
            C1521G c1521g = this.f14510P;
            c1521g.getClass();
            c1521g.a = new C1347v(new C0987j(interfaceC0961c));
        }
        M1.b bVar = this.f14517W;
        if (bVar != null) {
            bVar.f3236e = AbstractC0157l.v(this).f1714C;
        }
    }

    @Override // r.AbstractC1592o0
    public final boolean e1() {
        E1 e12 = this.f14511Q;
        if (e12.a.b()) {
            return true;
        }
        C1459u c1459u = e12.f14013b;
        if (c1459u == null) {
            return false;
        }
        p.X x5 = c1459u.f13800c;
        EdgeEffect edgeEffect = x5.f13660d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1462x.b(edgeEffect) : 0.0f) != S.l.f7374V) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = x5.f13661e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1462x.b(edgeEffect2) : 0.0f) != S.l.f7374V) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = x5.f13662f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1462x.b(edgeEffect3) : 0.0f) != S.l.f7374V) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = x5.f13663g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC1462x.b(edgeEffect4) : 0.0f) != S.l.f7374V;
        }
        return false;
    }

    public final void h1(C1459u c1459u, InterfaceC1618x interfaceC1618x, InterfaceC1619x0 interfaceC1619x0, X0 x02, InterfaceC1623y1 interfaceC1623y1, C1682j c1682j, boolean z5, boolean z6) {
        boolean z7;
        boolean z8 = true;
        boolean z9 = false;
        if (this.f14422v != z5) {
            this.f14512R.f14428e = z5;
            this.f14509O.f14316r = z5;
            z7 = true;
        } else {
            z7 = false;
        }
        InterfaceC1619x0 interfaceC1619x02 = interfaceC1619x0 == null ? this.f14510P : interfaceC1619x0;
        E1 e12 = this.f14511Q;
        if (!AbstractC1276k.b(e12.a, interfaceC1623y1)) {
            e12.a = interfaceC1623y1;
            z9 = true;
        }
        e12.f14013b = c1459u;
        if (e12.f14015d != x02) {
            e12.f14015d = x02;
            z9 = true;
        }
        if (e12.f14016e != z6) {
            e12.f14016e = z6;
        } else {
            z8 = z9;
        }
        e12.f14014c = interfaceC1619x02;
        e12.f14017f = this.f14508N;
        C1515D c1515d = this.f14514T;
        c1515d.f13994r = x02;
        c1515d.f13996t = z6;
        c1515d.f13997u = interfaceC1618x;
        this.f14506L = c1459u;
        this.f14507M = interfaceC1619x0;
        p.O0 o02 = AbstractC1587m1.a;
        X0 x03 = e12.f14015d;
        X0 x04 = X0.f14183c;
        if (x03 != x04) {
            x04 = X0.f14184e;
        }
        g1(o02, z5, c1682j, x04, z8);
        if (z7) {
            this.f14515U = null;
            this.f14516V = null;
            AbstractC0157l.m(this);
        }
    }

    @Override // z0.e
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

            @Override // r.AbstractC1592o0, H0.w0
    public final void w(C0040p c0040p, EnumC0041q enumC0041q, long j3) {
        Object r02 = c0040p.a;
        Object r10 = c0040p.a;
        int size = r02.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            if (((Boolean) this.f14421u.f(new B0.L(((B0.y) r02.get(i6)).f489i))).booleanValue()) {
                super.w(c0040p, enumC0041q, j3);
                break;
            }
            i6++;
        }
        if (this.f14422v) {
            EnumC0041q enumC0041q2 = EnumC0041q.f475c;
            if (enumC0041q == enumC0041q2 && c0040p.f474f == 6) {
                if (this.f14517W == null) {
                    this.f14517W = new M1.b(this.f14511Q, new C0987j(ViewConfiguration.get(AbstractC0157l.x(this).getContext()), 16), new C0872e(2, this, C1620x1.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), AbstractC0157l.v(this).f1714C);
                }
                M1.b bVar = this.f14517W;
                if (bVar != null) {
                    InterfaceC1942y A02 = A0();
                    if (((x4.s0) bVar.f3238g) == null) {
                        bVar.f3238g = AbstractC1888A.y(A02, null, new T0(bVar, null), 3);
                    }
                }
            }
            M1.b bVar2 = this.f14517W;
            if (bVar2 == null || c0040p.f474f != 6) {
                return;
            }
            int size2 = r10.size();
            for (int i7 = 0; i7 < size2; i7++) {
                if (((B0.y) r10.get(i7)).b()) {
                    return;
                }
            }
            if (enumC0041q == enumC0041q2 && bVar2.a) {
                bVar2.d(c0040p);
                int size3 = r10.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    ((B0.y) r10.get(i8)).a();
                }
            }
            if (enumC0041q == EnumC0041q.f476e && !bVar2.a && bVar2.d(c0040p)) {
                int size4 = r10.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    ((B0.y) r10.get(i9)).a();
                }
            }
        }
    }
}
