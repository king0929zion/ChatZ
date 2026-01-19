package O;

import B0.C0033i;
import D.AbstractC0090r0;
import D.C0098v0;
import D.EnumC0075j0;
import D.d1;
import D.m1;
import I0.InterfaceC0194l0;
import S0.C0545g;
import T.C0607g0;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n0.C1353b;
import w0.InterfaceC1830a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f3992A;
    public final m1 a;

    /* renamed from: d, reason: collision with root package name */
    public C0098v0 f3995d;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1193a f3997f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0194l0 f3998g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1942y f3999h;

    /* renamed from: i, reason: collision with root package name */
    public C0341z f4000i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1830a f4001j;

    /* renamed from: k, reason: collision with root package name */
    public m0.w f4002k;

    /* renamed from: l, reason: collision with root package name */
    public final C0607g0 f4003l;

    /* renamed from: m, reason: collision with root package name */
    public final C0607g0 f4004m;

    /* renamed from: n, reason: collision with root package name */
    public long f4005n;

    /* renamed from: o, reason: collision with root package name */
    public S0.O f4006o;

    /* renamed from: p, reason: collision with root package name */
    public long f4007p;

    /* renamed from: q, reason: collision with root package name */
    public final C0607g0 f4008q;

    /* renamed from: r, reason: collision with root package name */
    public final C0607g0 f4009r;

    /* renamed from: s, reason: collision with root package name */
    public int f4010s;

    /* renamed from: t, reason: collision with root package name */
    public X0.v f4011t;

    /* renamed from: u, reason: collision with root package name */
    public C0 f4012u;

    /* renamed from: v, reason: collision with root package name */
    public S0.O f4013v;

    /* renamed from: w, reason: collision with root package name */
    public final C0607g0 f4014w;

    /* renamed from: x, reason: collision with root package name */
    public final M.q f4015x;

    /* renamed from: y, reason: collision with root package name */
    public final L0 f4016y;

    /* renamed from: z, reason: collision with root package name */
    public final C0033i f4017z;

    /* renamed from: b, reason: collision with root package name */
    public X0.p f3993b = AbstractC0090r0.f1150c;

    /* renamed from: c, reason: collision with root package name */
    public l4.c f3994c = new A2.a(5);

    /* renamed from: e, reason: collision with root package name */
    public final C0607g0 f3996e = T.r.A(new X0.v(0, (String) null, 7));

    public N0(m1 m1Var) {
        this.a = m1Var;
        Boolean bool = Boolean.TRUE;
        this.f4003l = T.r.A(bool);
        this.f4004m = T.r.A(bool);
        this.f4005n = 0L;
        this.f4007p = 0L;
        this.f4008q = T.r.A(null);
        this.f4009r = T.r.A(null);
        this.f4010s = -1;
        this.f4011t = new X0.v(0L, (String) null, 7);
        this.f4014w = T.r.A(Boolean.FALSE);
        this.f4015x = new M.q(10);
        this.f4016y = new L0(this);
        this.f4017z = new C0033i(this);
    }

    public static final X3.i a(N0 n02) {
        String str;
        S0.O o5;
        C0545g m3 = n02.m();
        if (m3 == null || (str = m3.f7630e) == null || (o5 = n02.f4013v) == null) {
            return null;
        }
        long j3 = o5.a;
        return new X3.i(str, new S0.O(S0.F.b(n02.f3993b.b((int) (j3 >> 32)), n02.f3993b.b((int) (j3 & 4294967295L)))));
    }

    public static final void b(N0 n02, S0.O o5) {
        C0545g m3;
        String str;
        InterfaceC1942y interfaceC1942y;
        if (o5 == null) {
            return;
        }
        long j3 = o5.a;
        C0341z c0341z = n02.f4000i;
        if (c0341z == null || (m3 = n02.m()) == null || (str = m3.f7630e) == null) {
            return;
        }
        X0.p pVar = n02.f3993b;
        long b5 = S0.F.b(pVar.b((int) (j3 >> 32)), pVar.b((int) (j3 & 4294967295L)));
        if (str.length() <= 0 || S0.O.c(b5) || (interfaceC1942y = n02.f3999h) == null) {
            return;
        }
        AbstractC1888A.y(interfaceC1942y, null, new J0(c0341z, str, b5, o5, n02, pVar, null), 3);
    }

    public static final long c(N0 n02, X0.v vVar, long j3, boolean z5, boolean z6, H h3, boolean z7) {
        d1 d6;
        long j4;
        long j5;
        G g3;
        boolean z8;
        boolean z9;
        InterfaceC1830a interfaceC1830a;
        int i6;
        C0098v0 c0098v0 = n02.f3995d;
        if (c0098v0 == null || (d6 = c0098v0.d()) == null) {
            return S0.O.f7610b;
        }
        X0.p pVar = n02.f3993b;
        long j6 = vVar.f9125b;
        C0545g c0545g = vVar.a;
        int i7 = S0.O.f7611c;
        long b5 = S0.F.b(pVar.b((int) (j6 >> 32)), n02.f3993b.b((int) (j6 & 4294967295L)));
        int b6 = d6.b(j3, false);
        int i8 = (z6 || z5) ? b6 : (int) (b5 >> 32);
        int i9 = (!z6 || z5) ? b6 : (int) (b5 & 4294967295L);
        C0 c02 = n02.f4012u;
        int i10 = (z5 || c02 == null || (i6 = n02.f4010s) == -1) ? -1 : i6;
        S0.L l3 = d6.a;
        if (z5) {
            j5 = j6;
            j4 = 4294967295L;
            g3 = null;
        } else {
            j4 = 4294967295L;
            int i11 = (int) (b5 >> 32);
            j5 = j6;
            F f6 = new F(AbstractC0336u0.u(l3, i11), i11, 1L);
            int i12 = (int) (b5 & 4294967295L);
            g3 = new G(f6, new F(AbstractC0336u0.u(l3, i12), i12, 1L), S0.O.g(b5));
        }
        C0 c03 = new C0(z6, 1, 1, g3, new D(1L, 1, i8, i9, i10, l3));
        if (!c03.e(c02)) {
            return j5;
        }
        n02.f4012u = c03;
        n02.f4010s = b6;
        G a = h3.a(c03);
        long b7 = S0.F.b(n02.f3993b.a(a.a.f3941b), n02.f3993b.a(a.f3945b.f3941b));
        long j7 = j5;
        if (S0.O.b(b7, j7)) {
            return j7;
        }
        boolean z10 = S0.O.g(b7) != S0.O.g(j7) && S0.O.b(S0.F.b((int) (b7 & j4), (int) (b7 >> 32)), j7);
        boolean z11 = S0.O.c(b7) && S0.O.c(j7);
        if (z7 && c0545g.f7630e.length() > 0 && !z10 && !z11 && (interfaceC1830a = n02.f4001j) != null) {
            interfaceC1830a.a(9);
        }
        n02.f3994c.f(e(c0545g, b7));
        n02.f4013v = new S0.O(b7);
        if (!z7) {
            n02.t(!S0.O.c(b7));
        }
        C0098v0 c0098v02 = n02.f3995d;
        if (c0098v02 != null) {
            c0098v02.f1198q.setValue(Boolean.valueOf(z7));
        }
        C0098v0 c0098v03 = n02.f3995d;
        if (c0098v03 != null) {
            c0098v03.f1194m.setValue(Boolean.valueOf(!S0.O.c(b7) && AbstractC0336u0.w(n02, true)));
        }
        C0098v0 c0098v04 = n02.f3995d;
        if (c0098v04 != null) {
            if (S0.O.c(b7)) {
                z8 = false;
            } else {
                z8 = false;
                if (AbstractC0336u0.w(n02, false)) {
                    z9 = true;
                    c0098v04.f1195n.setValue(Boolean.valueOf(z9));
                }
            }
            z9 = z8;
            c0098v04.f1195n.setValue(Boolean.valueOf(z9));
        } else {
            z8 = false;
        }
        C0098v0 c0098v05 = n02.f3995d;
        if (c0098v05 != null) {
            c0098v05.f1196o.setValue(Boolean.valueOf((S0.O.c(b7) && AbstractC0336u0.w(n02, true)) ? true : z8));
        }
        return b7;
    }

    public static X0.v e(C0545g c0545g, long j3) {
        return new X0.v(c0545g, j3, (S0.O) null);
    }

    public final x4.s0 d(boolean z5) {
        InterfaceC1942y interfaceC1942y = this.f3999h;
        if (interfaceC1942y != null) {
            return AbstractC1888A.y(interfaceC1942y, null, new G0(this, z5, null), 1);
        }
        return null;
    }

    public final void f() {
        InterfaceC1942y interfaceC1942y = this.f3999h;
        if (interfaceC1942y != null) {
            AbstractC1888A.y(interfaceC1942y, null, new I0(this, null), 1);
        }
    }

    public final void g(C1353b c1353b) {
        if (!S0.O.c(n().f9125b)) {
            C0098v0 c0098v0 = this.f3995d;
            d1 d6 = c0098v0 != null ? c0098v0.d() : null;
            int e6 = (c1353b == null || d6 == null) ? S0.O.e(n().f9125b) : this.f3993b.a(d6.b(c1353b.a, true));
            X0.v a = X0.v.a(n(), null, S0.F.b(e6, e6), 5);
            this.f3994c.f(a);
            this.f4013v = new S0.O(a.f9125b);
        }
        q((c1353b == null || n().a.f7630e.length() <= 0) ? EnumC0075j0.f1042c : EnumC0075j0.f1044f);
        t(false);
    }

    public final void h(boolean z5) {
        m0.w wVar;
        C0098v0 c0098v0 = this.f3995d;
        if (c0098v0 != null && !c0098v0.b() && (wVar = this.f4002k) != null) {
            m0.w.a(wVar);
        }
        this.f4011t = n();
        t(z5);
        q(EnumC0075j0.f1043e);
    }

    public final C1353b i() {
        return (C1353b) this.f4009r.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.f4003l.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.f4004m.getValue()).booleanValue();
    }

    public final long l(boolean z5) {
        d1 d6;
        long j3;
        C0098v0 c0098v0 = this.f3995d;
        if (c0098v0 == null || (d6 = c0098v0.d()) == null) {
            return 9205357640488583168L;
        }
        S0.L l3 = d6.a;
        C0545g m3 = m();
        if (m3 == null) {
            return 9205357640488583168L;
        }
        if (!AbstractC1276k.b(m3.f7630e, l3.a.a.f7630e)) {
            return 9205357640488583168L;
        }
        X0.v n3 = n();
        if (z5) {
            long j4 = n3.f9125b;
            int i6 = S0.O.f7611c;
            j3 = j4 >> 32;
        } else {
            long j5 = n3.f9125b;
            int i7 = S0.O.f7611c;
            j3 = j5 & 4294967295L;
        }
        return AbstractC0336u0.t(l3, this.f3993b.b((int) j3), z5, S0.O.g(n().f9125b));
    }

    public final C0545g m() {
        D.G0 g02;
        C0098v0 c0098v0 = this.f3995d;
        if (c0098v0 == null || (g02 = c0098v0.a) == null) {
            return null;
        }
        return g02.a;
    }

    public final X0.v n() {
        return (X0.v) this.f3996e.getValue();
    }

    public final void o() {
        x4.s0 s0Var;
        J.l lVar = (J.l) this.f4015x.f3179e;
        if (lVar == null || (s0Var = lVar.f2803x) == null) {
            return;
        }
        s0Var.f(null);
        lVar.f2803x = null;
    }

    public final void p() {
        InterfaceC1942y interfaceC1942y = this.f3999h;
        if (interfaceC1942y != null) {
            AbstractC1888A.y(interfaceC1942y, null, new K0(this, null), 1);
        }
    }

    public final void q(EnumC0075j0 enumC0075j0) {
        C0098v0 c0098v0 = this.f3995d;
        if (c0098v0 != null) {
            if (c0098v0.a() == enumC0075j0) {
                c0098v0 = null;
            }
            if (c0098v0 != null) {
                c0098v0.f1192k.setValue(enumC0075j0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (((java.lang.Boolean) r3.f1198q.getValue()).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r4 = this;
            f0.f r0 = f0.AbstractC0997t.e()
            if (r0 == 0) goto Lb
            l4.c r1 = r0.e()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            f0.f r2 = f0.AbstractC0997t.h(r0)
            boolean r3 = r4.k()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L34
            D.v0 r3 = r4.f3995d     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L29
            T.g0 r3 = r3.f1198q     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L29
            goto L34
        L29:
            f0.AbstractC0997t.k(r0, r2, r1)
            M.q r0 = r4.f4015x
            r0.w()
            return
        L32:
            r3 = move-exception
            goto L38
        L34:
            f0.AbstractC0997t.k(r0, r2, r1)
            return
        L38:
            f0.AbstractC0997t.k(r0, r2, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: O.N0.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(d4.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof O.M0
            if (r0 == 0) goto L13
            r0 = r5
            O.M0 r0 = (O.M0) r0
            int r1 = r0.f3987j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3987j = r1
            goto L18
        L13:
            O.M0 r0 = new O.M0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3985h
            int r1 = r0.f3987j
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            O.N0 r0 = r0.f3984g
            X3.a.e(r5)
            goto L5b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            X3.a.e(r5)
            I0.l0 r5 = r4.f3998g
            if (r5 == 0) goto L65
            r0.f3984g = r4
            r0.f3987j = r2
            I0.h r5 = (I0.C0185h) r5
            I0.i r5 = r5.a
            android.content.ClipboardManager r5 = r5.a
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            r0 = 0
            if (r5 == 0) goto L50
            java.lang.String r1 = "text/*"
            boolean r5 = r5.hasMimeType(r1)
            if (r5 != r2) goto L50
            goto L51
        L50:
            r2 = r0
        L51:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L5a
            return r0
        L5a:
            r0 = r4
        L5b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            T.g0 r0 = r0.f4014w
            r0.setValue(r5)
        L65:
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O.N0.s(d4.c):java.lang.Object");
    }

    public final void t(boolean z5) {
        C0098v0 c0098v0 = this.f3995d;
        if (c0098v0 != null) {
            c0098v0.f1193l.setValue(Boolean.valueOf(z5));
        }
        if (z5) {
            r();
        } else {
            o();
        }
    }
}
