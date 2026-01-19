package H0;

import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.C0959a;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import o0.C1387I;

/* loaded from: classes.dex */
public final class Y {
    public final J a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1844c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1845d;

    /* renamed from: i, reason: collision with root package name */
    public C0959a f1850i;

    /* renamed from: b, reason: collision with root package name */
    public final C0158m f1843b = new C0158m(0);

    /* renamed from: e, reason: collision with root package name */
    public final M.q f1846e = new M.q(8);

    /* renamed from: f, reason: collision with root package name */
    public final V.e f1847f = new V.e(new J[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f1848g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final V.e f1849h = new V.e(new X[16]);

    public Y(J j3) {
        this.a = j3;
    }

    public static boolean b(J j3, C0959a c0959a) {
        boolean D0;
        J j4 = j3.f1741l;
        N n3 = j3.f1722K;
        if (j4 == null) {
            return false;
        }
        if (c0959a != null) {
            if (j4 != null) {
                W w5 = n3.f1782q;
                AbstractC1276k.c(w5);
                D0 = w5.D0(c0959a.a);
            }
            D0 = false;
        } else {
            W w6 = n3.f1782q;
            C0959a c0959a2 = w6 != null ? w6.f1831q : null;
            if (c0959a2 != null && j4 != null) {
                AbstractC1276k.c(w6);
                D0 = w6.D0(c0959a2.a);
            }
            D0 = false;
        }
        J v5 = j3.v();
        if (D0 && v5 != null) {
            if (v5.f1741l == null) {
                J.X(v5, false, 3);
                return D0;
            }
            if (j3.s() == H.f1705c) {
                J.V(v5, false, 3);
                return D0;
            }
            if (j3.s() == H.f1706e) {
                v5.U(false);
            }
        }
        return D0;
    }

    public static boolean c(J j3, C0959a c0959a) {
        boolean P5 = c0959a != null ? j3.P(c0959a) : J.Q(j3);
        J v5 = j3.v();
        if (P5 && v5 != null) {
            if (j3.r() == H.f1705c) {
                J.X(v5, false, 3);
                return P5;
            }
            if (j3.r() == H.f1706e) {
                v5.W(false);
            }
        }
        return P5;
    }

    public static boolean h(J j3) {
        W w5;
        K k3;
        if (j3.f1722K.f1770e) {
            return (j3.s() == H.f1707f && ((w5 = j3.f1722K.f1782q) == null || (k3 = w5.f1836v) == null || !k3.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(J j3) {
        if (!j3.q()) {
            return false;
        }
        do {
            if (j3.r() == H.f1707f && !j3.f1722K.f1781p.f1854B.e()) {
                J v5 = j3.v();
                if ((v5 != null ? v5.f1722K.f1769d : null) != F.f1696c) {
                    return false;
                }
            }
            j3 = j3.v();
            if (j3 == null) {
                return false;
            }
        } while (!j3.I());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r4 < r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r8) {
        /*
            r7 = this;
            r0 = 1
            M.q r1 = r7.f1846e
            if (r8 == 0) goto L17
            java.lang.Object r8 = r1.f3179e
            V.e r8 = (V.e) r8
            H0.J r2 = r7.a
            int r3 = r2.f1731T
            if (r3 <= 0) goto L17
            r8.g()
            r8.b(r2)
            r2.f1730S = r0
        L17:
            java.lang.Object r8 = r1.f3179e
            V.e r8 = (V.e) r8
            int r2 = r8.f8761f
            if (r2 == 0) goto L62
            H0.o0 r3 = H0.o0.f1979b
            java.lang.Object[] r4 = r8.f8759c
            r5 = 0
            Y3.k.A0(r4, r3, r5, r2)
            int r2 = r8.f8761f
            java.lang.Object r3 = r1.f3180f
            H0.J[] r3 = (H0.J[]) r3
            if (r3 == 0) goto L32
            int r4 = r3.length
            if (r4 >= r2) goto L3a
        L32:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            H0.J[] r3 = new H0.J[r3]
        L3a:
            r4 = 0
            r1.f3180f = r4
        L3d:
            if (r5 >= r2) goto L48
            java.lang.Object[] r6 = r8.f8759c
            r6 = r6[r5]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L48:
            r8.g()
            int r2 = r2 - r0
        L4c:
            r8 = -1
            if (r8 >= r2) goto L60
            r8 = r3[r2]
            m4.AbstractC1276k.c(r8)
            boolean r0 = r8.f1730S
            if (r0 == 0) goto L5b
            M.q.l(r8)
        L5b:
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L4c
        L60:
            r1.f3180f = r3
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.Y.a(boolean):void");
    }

    public final void d() {
        V.e eVar = this.f1849h;
        int i6 = eVar.f8761f;
        if (i6 != 0) {
            Object[] objArr = eVar.f8759c;
            for (int i7 = 0; i7 < i6; i7++) {
                X x5 = (X) objArr[i7];
                J j3 = x5.a;
                boolean z5 = x5.f1842c;
                J j4 = x5.a;
                if (j3.H()) {
                    if (x5.f1841b) {
                        J.V(j4, z5, 2);
                    } else {
                        J.X(j4, z5, 2);
                    }
                }
            }
            eVar.g();
        }
    }

    public final void e(J j3) {
        V.e z5 = j3.z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j4 = (J) objArr[i7];
            if (AbstractC1276k.b(j4.J(), Boolean.TRUE) && !j4.f1732U) {
                if (this.f1843b.d(j4)) {
                    j4.K();
                }
                e(j4);
            }
        }
    }

    public final void f(J j3, boolean z5) {
        if (!this.f1844c) {
            E0.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z5 ? j3.f1722K.f1770e : j3.q()) {
            E0.a.a("node not yet measured");
        }
        g(j3, z5);
    }

    public final void g(J j3, boolean z5) {
        W w5;
        K k3;
        V.e z6 = j3.z();
        Object[] objArr = z6.f8759c;
        int i6 = z6.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j4 = (J) objArr[i7];
            H h3 = H.f1705c;
            if ((!z5 && (j4.r() == h3 || j4.f1722K.f1781p.f1854B.e())) || (z5 && (j4.s() == h3 || ((w5 = j4.f1722K.f1782q) != null && (k3 = w5.f1836v) != null && k3.e())))) {
                boolean q3 = AbstractC0157l.q(j4);
                N n3 = j4.f1722K;
                if (q3 && !z5) {
                    if (n3.f1770e && this.f1843b.d(j4)) {
                        m(j4, true, false);
                    } else {
                        f(j4, true);
                    }
                }
                if (z5 ? n3.f1770e : j4.q()) {
                    m(j4, z5, false);
                }
                if (!(z5 ? n3.f1770e : j4.q())) {
                    g(j4, z5);
                }
            }
        }
        if (z5 ? j3.f1722K.f1770e : j3.q()) {
            m(j3, z5, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
                public final boolean j(I0.r rVar) {
        boolean z5;
        AbstractC1040q abstractC1040q;
        V.e eVar;
        int i6;
        boolean z6;
        J j3;
        boolean z7;
        C0158m c0158m = this.f1843b;
        J j4 = this.a;
        if (!j4.H()) {
            E0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!j4.I()) {
            E0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f1844c) {
            E0.a.a("performMeasureAndLayout called during measure layout");
        }
        int i7 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        if (this.f1850i != null) {
            this.f1844c = true;
            this.f1845d = true;
            try {
                boolean l3 = c0158m.l();
                A3.c cVar = (A3.c) c0158m.f1972e;
                if (l3) {
                    z5 = false;
                    while (true) {
                        A3.c cVar2 = (A3.c) c0158m.f1974g;
                        A3.c cVar3 = (A3.c) c0158m.f1973f;
                        if (!((B0) cVar.f119e).isEmpty()) {
                            j3 = (J) ((B0) cVar.f119e).first();
                            cVar.q(j3);
                            z7 = j3.f1741l != null;
                            z6 = false;
                        } else if (!((B0) cVar3.f119e).isEmpty()) {
                            j3 = (J) ((B0) cVar3.f119e).first();
                            cVar3.q(j3);
                            z7 = j3.f1741l != null;
                            z6 = true;
                        } else {
                            if (((B0) cVar2.f119e).isEmpty()) {
                                break;
                            }
                            J j5 = (J) ((B0) cVar2.f119e).first();
                            cVar2.q(j5);
                            z6 = true;
                            j3 = j5;
                            z7 = false;
                        }
                        boolean m3 = m(j3, z7, z6);
                        if (!z6) {
                            if (j3.f1722K.f1771f) {
                                c0158m.c(j3, EnumC0167w.f2005e);
                            }
                            if (j3.p()) {
                                c0158m.c(j3, EnumC0167w.f2007g);
                            }
                        }
                        if (j3 == j4 && m3) {
                            z5 = true;
                        }
                    }
                    if (rVar != null) {
                        rVar.b();
                    }
                } else {
                    z5 = false;
                }
            } finally {
            }
        } else {
            z5 = false;
        }
        V.e eVar2 = this.f1847f;
        Object[] objArr = eVar2.f8759c;
        int i8 = eVar2.f8761f;
        int i9 = 0;
        while (i9 < i8) {
            C0149f0 c0149f0 = ((J) objArr[i9]).f1721J;
            C0165u c0165u = c0149f0.f1916c;
            int i10 = PegdownExtensions.EXTANCHORLINKS;
            boolean g3 = j0.g(PegdownExtensions.EXTANCHORLINKS);
            if (g3) {
                abstractC1040q = c0165u.f1999V;
            } else {
                abstractC1040q = c0165u.f1999V.f11810h;
                if (abstractC1040q == null) {
                    i9++;
                    i7 = 0;
                }
            }
            C1387I c1387i = i0.f1933Q;
            AbstractC1040q Y02 = c0165u.Y0(g3);
            while (Y02 != null && (Y02.f11809g & i10) != 0) {
                if ((Y02.f11808f & i10) != 0) {
                    AbstractC0156k abstractC0156k = Y02;
                    V.e eVar3 = null;
                    while (abstractC0156k != 0) {
                        if (abstractC0156k instanceof InterfaceC0169y) {
                            ((InterfaceC0169y) abstractC0156k).o(c0149f0.f1916c);
                        } else if ((abstractC0156k.f11808f & i10) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                            AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                            AbstractC1040q abstractC1040q3 = abstractC0156k;
                            eVar = eVar3;
                            while (abstractC1040q2 != null) {
                                int i11 = i10;
                                if ((abstractC1040q2.f11808f & i11) != 0) {
                                    i7++;
                                    eVar = eVar;
                                    if (i7 == 1) {
                                        abstractC1040q3 = abstractC1040q2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new V.e(new AbstractC1040q[16]);
                                        }
                                        if (abstractC1040q3 != null) {
                                            eVar.b(abstractC1040q3);
                                            abstractC1040q3 = null;
                                        }
                                        eVar.b(abstractC1040q2);
                                    }
                                }
                                abstractC1040q2 = abstractC1040q2.f11811i;
                                i10 = i11;
                                abstractC1040q3 = abstractC1040q3;
                                eVar = eVar;
                            }
                            i6 = i10;
                            eVar = eVar;
                            if (i7 == 1) {
                                i10 = i6;
                                i7 = 0;
                                abstractC0156k = abstractC1040q3;
                                eVar3 = eVar;
                            }
                            abstractC1040q3 = AbstractC0157l.e(eVar);
                            i10 = i6;
                            i7 = 0;
                            abstractC0156k = abstractC1040q3;
                            eVar3 = eVar;
                        }
                        i6 = i10;
                        eVar = eVar3;
                        abstractC1040q3 = AbstractC0157l.e(eVar);
                        i10 = i6;
                        i7 = 0;
                        abstractC0156k = abstractC1040q3;
                        eVar3 = eVar;
                    }
                }
                int i12 = i10;
                if (Y02 != abstractC1040q) {
                    Y02 = Y02.f11811i;
                    i10 = i12;
                    i7 = 0;
                }
            }
            i9++;
            i7 = 0;
        }
        eVar2.g();
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
                                        public final void k(J j3, long j4) {
        AbstractC1040q abstractC1040q;
        AbstractC1040q abstractC1040q2;
        if (j3.f1732U) {
            return;
        }
        J j5 = this.a;
        if (j3.equals(j5)) {
            E0.a.a("measureAndLayout called on root");
        }
        if (!j5.H()) {
            E0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!j5.I()) {
            E0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f1844c) {
            E0.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z5 = false;
        if (this.f1850i != null) {
            this.f1844c = true;
            this.f1845d = false;
            try {
                C0158m c0158m = this.f1843b;
                ((A3.c) c0158m.f1972e).q(j3);
                ((A3.c) c0158m.f1973f).q(j3);
                ((A3.c) c0158m.f1974g).q(j3);
                if ((b(j3, new C0959a(j4)) || j3.f1722K.f1771f) && AbstractC1276k.b(j3.J(), Boolean.TRUE)) {
                    j3.K();
                }
                e(j3);
                c(j3, new C0959a(j4));
                if (j3.p() && j3.I()) {
                    j3.T();
                    M.q qVar = this.f1846e;
                    qVar.getClass();
                    if (j3.f1731T > 0) {
                        ((V.e) qVar.f3179e).b(j3);
                        j3.f1730S = true;
                    }
                }
                d();
            } finally {
            }
        }
        V.e eVar = this.f1847f;
        Object[] objArr = eVar.f8759c;
        int i6 = eVar.f8761f;
        int i7 = 0;
        while (i7 < i6) {
            C0149f0 c0149f0 = ((J) objArr[i7]).f1721J;
            C0165u c0165u = c0149f0.f1916c;
            boolean g3 = j0.g(PegdownExtensions.EXTANCHORLINKS);
            if (g3) {
                abstractC1040q = c0165u.f1999V;
            } else {
                abstractC1040q = c0165u.f1999V.f11810h;
                if (abstractC1040q == null) {
                    i7++;
                    z5 = false;
                }
            }
            C1387I c1387i = i0.f1933Q;
            AbstractC1040q Y02 = c0165u.Y0(g3);
            while (Y02 != null && (Y02.f11809g & PegdownExtensions.EXTANCHORLINKS) != 0) {
                if ((Y02.f11808f & PegdownExtensions.EXTANCHORLINKS) != 0) {
                    AbstractC0156k abstractC0156k = Y02;
                    V.e eVar2 = null;
                    while (abstractC0156k != 0) {
                        if (abstractC0156k instanceof InterfaceC0169y) {
                            ((InterfaceC0169y) abstractC0156k).o(c0149f0.f1916c);
                        } else if ((abstractC0156k.f11808f & PegdownExtensions.EXTANCHORLINKS) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                            AbstractC1040q abstractC1040q3 = abstractC0156k.f1964s;
                            Object r15 = z5;
                            abstractC1040q2 = abstractC0156k;
                            eVar2 = eVar2;
                            while (abstractC1040q3 != null) {
                                if ((abstractC1040q3.f11808f & PegdownExtensions.EXTANCHORLINKS) != 0) {
                                    r15++;
                                    eVar2 = eVar2;
                                    if (r15 == 1) {
                                        abstractC1040q2 = abstractC1040q3;
                                    } else {
                                        if (eVar2 == null) {
                                            eVar2 = new V.e(new AbstractC1040q[16]);
                                        }
                                        if (abstractC1040q2 != null) {
                                            eVar2.b(abstractC1040q2);
                                            abstractC1040q2 = null;
                                        }
                                        eVar2.b(abstractC1040q3);
                                    }
                                }
                                abstractC1040q3 = abstractC1040q3.f11811i;
                                abstractC1040q2 = abstractC1040q2;
                                eVar2 = eVar2;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z5 = false;
                                abstractC0156k = abstractC1040q2;
                                eVar2 = eVar2;
                            }
                        }
                        abstractC1040q2 = AbstractC0157l.e(eVar2);
                        z5 = false;
                        abstractC0156k = abstractC1040q2;
                        eVar2 = eVar2;
                    }
                }
                if (Y02 != abstractC1040q) {
                    Y02 = Y02.f11811i;
                    z5 = false;
                }
            }
            i7++;
            z5 = false;
        }
        eVar.g();
    }

    public final void l() {
        C0158m c0158m = this.f1843b;
        if (c0158m.l()) {
            J j3 = this.a;
            if (!j3.H()) {
                E0.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!j3.I()) {
                E0.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f1844c) {
                E0.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f1850i != null) {
                this.f1844c = true;
                this.f1845d = false;
                try {
                    if (!((B0) ((A3.c) c0158m.f1974g).f119e).isEmpty() && !((B0) ((A3.c) c0158m.f1972e).f119e).isEmpty()) {
                        if (j3.f1741l != null) {
                            o(j3, true);
                        } else {
                            n(j3);
                        }
                    }
                    o(j3, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f1844c = false;
                        this.f1845d = false;
                    }
                }
            }
        }
    }

    public final boolean m(J j3, boolean z5, boolean z6) {
        C0959a c0959a;
        boolean z7;
        F0.j0 placementScope;
        C0165u c0165u;
        J v5;
        W w5;
        K k3;
        boolean z8 = j3.f1732U;
        N n3 = j3.f1722K;
        if (z8 || (!j3.I() && !n3.f1781p.f1884x && !i(j3) && !AbstractC1276k.b(j3.J(), Boolean.TRUE) && !h(j3) && !n3.f1781p.f1854B.e() && ((w5 = n3.f1782q) == null || (k3 = w5.f1836v) == null || !k3.e()))) {
            return false;
        }
        J j4 = this.a;
        if (j3 == j4) {
            c0959a = this.f1850i;
            AbstractC1276k.c(c0959a);
        } else {
            c0959a = null;
        }
        if (z5) {
            z7 = n3.f1770e ? b(j3, c0959a) : false;
            if (z6 && ((z7 || n3.f1771f) && AbstractC1276k.b(j3.J(), Boolean.TRUE))) {
                j3.K();
            }
        } else {
            boolean c6 = j3.q() ? c(j3, c0959a) : false;
            if (z6 && j3.p() && (j3 == j4 || ((v5 = j3.v()) != null && v5.I() && n3.f1781p.f1884x))) {
                if (j3 == j4) {
                    if (j3.f1718G == H.f1707f) {
                        j3.f();
                    }
                    J v6 = j3.v();
                    if (v6 == null || (c0165u = v6.f1721J.f1916c) == null || (placementScope = c0165u.f1802o) == null) {
                        placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j3)).getPlacementScope();
                    }
                    F0.j0.l(placementScope, n3.f1781p, 0, 0);
                } else {
                    j3.T();
                }
                M.q qVar = this.f1846e;
                qVar.getClass();
                if (j3.f1731T > 0) {
                    ((V.e) qVar.f3179e).b(j3);
                    j3.f1730S = true;
                }
            }
            z7 = c6;
        }
        d();
        return z7;
    }

    public final void n(J j3) {
        V.e z5 = j3.z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j4 = (J) objArr[i7];
            if (j4.r() == H.f1705c || j4.f1722K.f1781p.f1854B.e()) {
                if (AbstractC0157l.q(j4)) {
                    o(j4, true);
                } else {
                    n(j4);
                }
            }
        }
    }

    public final void o(J j3, boolean z5) {
        C0959a c0959a;
        if (j3.f1732U) {
            return;
        }
        if (j3 == this.a) {
            c0959a = this.f1850i;
            AbstractC1276k.c(c0959a);
        } else {
            c0959a = null;
        }
        if (z5) {
            b(j3, c0959a);
        } else {
            c(j3, c0959a);
        }
    }

    public final boolean p(J j3, boolean z5) {
        int ordinal = j3.f1722K.f1769d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.f1849h.b(new X(j3, false, z5));
            } else {
                if (ordinal != 4) {
                    throw new RuntimeException();
                }
                if (!j3.q() || z5) {
                    j3.f1722K.f1781p.f1885y = true;
                    if (!j3.f1732U && (j3.I() || i(j3))) {
                        J v5 = j3.v();
                        if (v5 == null || !v5.q()) {
                            this.f1843b.c(j3, EnumC0167w.f2006f);
                        }
                        if (!this.f1845d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j3) {
        C0959a c0959a = this.f1850i;
        if (c0959a == null ? false : C0959a.b(c0959a.a, j3)) {
            return;
        }
        if (this.f1844c) {
            E0.a.a("updateRootConstraints called while measuring");
        }
        this.f1850i = new C0959a(j3);
        J j4 = this.a;
        J j5 = j4.f1741l;
        N n3 = j4.f1722K;
        if (j5 != null) {
            n3.f1770e = true;
        }
        n3.f1781p.f1885y = true;
        this.f1843b.c(j4, j5 != null ? EnumC0167w.f2004c : EnumC0167w.f2006f);
    }
}
