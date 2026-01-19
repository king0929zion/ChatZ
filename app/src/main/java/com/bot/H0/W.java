package H0;

import F0.AbstractC0107a;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.C0959a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class W extends F0.k0 implements F0.U, InterfaceC0138a, InterfaceC0143c0 {

    /* renamed from: B, reason: collision with root package name */
    public Object f1818B;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1822F;

    /* renamed from: i, reason: collision with root package name */
    public final N f1823i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1824j;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1828n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1829o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1830p;

    /* renamed from: q, reason: collision with root package name */
    public C0959a f1831q;

    /* renamed from: s, reason: collision with root package name */
    public l4.c f1833s;

    /* renamed from: t, reason: collision with root package name */
    public r0.b f1834t;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1839y;

    /* renamed from: k, reason: collision with root package name */
    public int f1825k = TableCell.NOT_TRACKED;

    /* renamed from: l, reason: collision with root package name */
    public int f1826l = TableCell.NOT_TRACKED;

    /* renamed from: m, reason: collision with root package name */
    public H f1827m = H.f1707f;

    /* renamed from: r, reason: collision with root package name */
    public long f1832r = 0;

    /* renamed from: u, reason: collision with root package name */
    public U f1835u = U.f1813f;

    /* renamed from: v, reason: collision with root package name */
    public final K f1836v = new K(this, 1);

    /* renamed from: w, reason: collision with root package name */
    public final V.e f1837w = new V.e(new W[16]);

    /* renamed from: x, reason: collision with root package name */
    public boolean f1838x = true;

    /* renamed from: z, reason: collision with root package name */
    public final V f1840z = new V(this, 0);

    /* renamed from: A, reason: collision with root package name */
    public boolean f1817A = true;

    /* renamed from: C, reason: collision with root package name */
    public long f1819C = AbstractC0960b.b(0, 0, 15);

    /* renamed from: D, reason: collision with root package name */
    public final V f1820D = new V(this, 2);

    /* renamed from: E, reason: collision with root package name */
    public final V f1821E = new V(this, 1);

    public W(N n3) {
        this.f1823i = n3;
        this.f1818B = n3.f1781p.f1882v;
    }

    public final void A0() {
        N n3 = this.f1823i;
        J.V(n3.a, false, 7);
        J j3 = n3.a;
        J v5 = j3.v();
        if (v5 == null || j3.f1718G != H.f1707f) {
            return;
        }
        int ordinal = v5.f1722K.f1769d.ordinal();
        j3.f1718G = ordinal != 0 ? ordinal != 2 ? v5.f1718G : H.f1706e : H.f1705c;
    }

    public final void B0() {
        F f6;
        this.f1822F = true;
        N n3 = this.f1823i;
        J v5 = n3.a.v();
        U u5 = this.f1835u;
        if ((u5 != U.f1811c && !n3.f1768c) || (u5 != U.f1812e && n3.f1768c)) {
            y0();
            if (this.f1824j && v5 != null) {
                v5.U(false);
            }
        }
        if (v5 != null) {
            N n5 = v5.f1722K;
            if (!this.f1824j && ((f6 = n5.f1769d) == F.f1698f || f6 == F.f1699g)) {
                if (this.f1826l != Integer.MAX_VALUE) {
                    E0.a.b("Place was called on a node which was placed already");
                }
                int i6 = n5.f1773h;
                this.f1826l = i6;
                n5.f1773h = i6 + 1;
            }
        } else {
            this.f1826l = 0;
        }
        N();
    }

    public final void C0(long j3, l4.c cVar, r0.b bVar) {
        N n3 = this.f1823i;
        J j4 = n3.a;
        J j5 = n3.a;
        try {
            J v5 = j4.v();
            F f6 = v5 != null ? v5.f1722K.f1769d : null;
            F f7 = F.f1699g;
            if (f6 == f7) {
                n3.f1768c = false;
            }
            if (j5.f1732U) {
                E0.a.a("place is called on a deactivated node");
            }
            n3.f1769d = f7;
            boolean z5 = true;
            this.f1829o = true;
            this.f1822F = false;
            if (!e1.j.c(j3, this.f1832r)) {
                if (n3.f1779n || n3.f1778m) {
                    n3.f1771f = true;
                }
                z0();
            }
            r0 a = M.a(j5);
            this.f1832r = j3;
            if (!n3.f1771f) {
                if (this.f1835u == U.f1813f) {
                    z5 = false;
                }
                if (z5) {
                    T U02 = n3.a().U0();
                    AbstractC1276k.c(U02);
                    U02.N0(e1.j.e(j3, U02.f1489h));
                    B0();
                    this.f1833s = cVar;
                    this.f1834t = bVar;
                    n3.f1769d = F.f1700h;
                }
            }
            n3.h(false);
            this.f1836v.f1761g = false;
            t0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) a).getSnapshotObserver();
            snapshotObserver.a.d(j5, snapshotObserver.f1996g, this.f1821E);
            this.f1833s = cVar;
            this.f1834t = bVar;
            n3.f1769d = F.f1700h;
        } catch (Throwable th) {
            j4.a0(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x0081, B:34:0x008b, B:38:0x009c, B:39:0x00a1, B:41:0x00b7, B:46:0x0084), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x0081, B:34:0x008b, B:38:0x009c, B:39:0x00a1, B:41:0x00b7, B:46:0x0084), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x0081, B:34:0x008b, B:38:0x009c, B:39:0x00a1, B:41:0x00b7, B:46:0x0084), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x0081, B:34:0x008b, B:38:0x009c, B:39:0x00a1, B:41:0x00b7, B:46:0x0084), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x0081, B:34:0x008b, B:38:0x009c, B:39:0x00a1, B:41:0x00b7, B:46:0x0084), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D0(long r13) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.W.D0(long):boolean");
    }

    @Override // H0.InterfaceC0138a
    public final void F(B0.G g3) {
        V.e z5 = this.f1823i.a.z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            W w5 = ((J) objArr[i7]).f1722K.f1782q;
            AbstractC1276k.c(w5);
            g3.f(w5);
        }
    }

    @Override // F0.k0, F0.U
    public final Object H() {
        return this.f1818B;
    }

    @Override // H0.InterfaceC0143c0
    public final void M(boolean z5) {
        T U02;
        N n3 = this.f1823i;
        T U03 = n3.a().U0();
        if (Boolean.valueOf(z5).equals(U03 != null ? Boolean.valueOf(U03.f1799l) : null) || (U02 = n3.a().U0()) == null) {
            return;
        }
        U02.f1799l = z5;
    }

    @Override // H0.InterfaceC0138a
    public final void N() {
        this.f1839y = true;
        K k3 = this.f1836v;
        k3.h();
        N n3 = this.f1823i;
        boolean z5 = n3.f1771f;
        J j3 = n3.a;
        if (z5) {
            V.e z6 = j3.z();
            Object[] objArr = z6.f8759c;
            int i6 = z6.f8761f;
            for (int i7 = 0; i7 < i6; i7++) {
                J j4 = (J) objArr[i7];
                N n5 = j4.f1722K;
                if (n5.f1770e && j4.s() == H.f1705c) {
                    W w5 = n5.f1782q;
                    AbstractC1276k.c(w5);
                    W w6 = n5.f1782q;
                    C0959a c0959a = w6 != null ? w6.f1831q : null;
                    AbstractC1276k.c(c0959a);
                    if (w5.D0(c0959a.a)) {
                        J.V(j3, false, 7);
                    }
                }
            }
        }
        C0164t c0164t = g().f2000W;
        AbstractC1276k.c(c0164t);
        if (n3.f1772g || (!this.f1828n && !c0164t.f1801n && n3.f1771f)) {
            n3.f1771f = false;
            F f6 = n3.f1769d;
            n3.f1769d = F.f1699g;
            n3.i(false);
            t0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j3)).getSnapshotObserver();
            snapshotObserver.a.d(j3, snapshotObserver.f1997h, this.f1840z);
            n3.f1769d = f6;
            if (n3.f1778m && c0164t.f1801n) {
                requestLayout();
            }
            n3.f1772g = false;
        }
        if (k3.f1758d) {
            k3.f1759e = true;
        }
        if (k3.f1756b && k3.e()) {
            k3.g();
        }
        this.f1839y = false;
    }

    @Override // H0.InterfaceC0138a
    public final void Y() {
        J.V(this.f1823i.a, false, 7);
    }

    @Override // F0.U
    public final int a0(int i6) {
        A0();
        T U02 = this.f1823i.a().U0();
        AbstractC1276k.c(U02);
        return U02.a0(i6);
    }

    @Override // H0.InterfaceC0138a
    public final K b() {
        return this.f1836v;
    }

    @Override // F0.U
    public final int d(int i6) {
        A0();
        T U02 = this.f1823i.a().U0();
        AbstractC1276k.c(U02);
        return U02.d(i6);
    }

    @Override // F0.k0
    public final int f0(AbstractC0107a abstractC0107a) {
        N n3 = this.f1823i;
        J v5 = n3.a.v();
        F f6 = v5 != null ? v5.f1722K.f1769d : null;
        F f7 = F.f1697e;
        K k3 = this.f1836v;
        if (f6 == f7) {
            k3.f1757c = true;
        } else {
            J v6 = n3.a.v();
            if ((v6 != null ? v6.f1722K.f1769d : null) == F.f1699g) {
                k3.f1758d = true;
            }
        }
        this.f1828n = true;
        T U02 = n3.a().U0();
        AbstractC1276k.c(U02);
        int f02 = U02.f0(abstractC0107a);
        this.f1828n = false;
        return f02;
    }

    @Override // H0.InterfaceC0138a
    public final C0165u g() {
        return this.f1823i.a.f1721J.f1916c;
    }

    @Override // H0.InterfaceC0138a
    public final InterfaceC0138a h() {
        N n3;
        J v5 = this.f1823i.a.v();
        if (v5 == null || (n3 = v5.f1722K) == null) {
            return null;
        }
        return n3.f1782q;
    }

    @Override // F0.k0
    public final int i0() {
        T U02 = this.f1823i.a().U0();
        AbstractC1276k.c(U02);
        return U02.i0();
    }

    @Override // F0.k0
    public final int j0() {
        T U02 = this.f1823i.a().U0();
        AbstractC1276k.c(U02);
        return U02.j0();
    }

    @Override // F0.k0
    public final void m0(long j3, float f6, l4.c cVar) {
        C0(j3, cVar, null);
    }

    @Override // F0.U
    public final int o(int i6) {
        A0();
        T U02 = this.f1823i.a().U0();
        AbstractC1276k.c(U02);
        return U02.o(i6);
    }

    @Override // H0.InterfaceC0138a
    public final int p() {
        return this.f1826l;
    }

    @Override // F0.k0
    public final void p0(long j3, float f6, r0.b bVar) {
        C0(j3, null, bVar);
    }

    @Override // F0.U
    public final int q(int i6) {
        A0();
        T U02 = this.f1823i.a().U0();
        AbstractC1276k.c(U02);
        return U02.q(i6);
    }

    @Override // H0.InterfaceC0138a
    public final void requestLayout() {
        this.f1823i.a.U(false);
    }

    public final boolean v0() {
        N n3 = this.f1823i;
        return AbstractC0157l.q(n3.a) || n3.f1768c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.f1722K.f1769d : null) == H0.F.f1699g) goto L13;
     */
    @Override // F0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F0.k0 w(long r6) {
        /*
            r5 = this;
            H0.N r0 = r5.f1823i
            H0.J r1 = r0.a
            H0.J r1 = r1.v()
            r2 = 0
            if (r1 == 0) goto L10
            H0.N r1 = r1.f1722K
            H0.F r1 = r1.f1769d
            goto L11
        L10:
            r1 = r2
        L11:
            H0.F r3 = H0.F.f1697e
            if (r1 == r3) goto L25
            H0.J r1 = r0.a
            H0.J r1 = r1.v()
            if (r1 == 0) goto L21
            H0.N r1 = r1.f1722K
            H0.F r2 = r1.f1769d
        L21:
            H0.F r1 = H0.F.f1699g
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.f1767b = r1
        L28:
            H0.J r1 = r0.a
            H0.J r2 = r1.v()
            if (r2 == 0) goto L72
            H0.N r2 = r2.f1722K
            H0.H r3 = r5.f1827m
            H0.H r4 = H0.H.f1707f
            if (r3 == r4) goto L42
            boolean r1 = r1.f1720I
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            E0.a.b(r1)
        L42:
            H0.F r1 = r2.f1769d
            int r1 = r1.ordinal()
            if (r1 == 0) goto L6d
            r3 = 1
            if (r1 == r3) goto L6d
            r3 = 2
            if (r1 == r3) goto L6a
            r3 = 3
            if (r1 != r3) goto L54
            goto L6a
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            H0.F r0 = r2.f1769d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6a:
            H0.H r1 = H0.H.f1706e
            goto L6f
        L6d:
            H0.H r1 = H0.H.f1705c
        L6f:
            r5.f1827m = r1
            goto L76
        L72:
            H0.H r1 = H0.H.f1707f
            r5.f1827m = r1
        L76:
            H0.J r0 = r0.a
            H0.H r1 = r0.f1718G
            H0.H r2 = H0.H.f1707f
            if (r1 != r2) goto L81
            r0.e()
        L81:
            r5.D0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.W.w(long):F0.k0");
    }

    public final void x0(boolean z5) {
        if (z5 && v0()) {
            return;
        }
        if (z5 || v0()) {
            this.f1835u = U.f1813f;
            V.e z6 = this.f1823i.a.z();
            Object[] objArr = z6.f8759c;
            int i6 = z6.f8761f;
            for (int i7 = 0; i7 < i6; i7++) {
                W w5 = ((J) objArr[i7]).f1722K.f1782q;
                AbstractC1276k.c(w5);
                w5.x0(true);
            }
        }
    }

    public final void y0() {
        U u5 = this.f1835u;
        N n3 = this.f1823i;
        boolean z5 = n3.f1768c;
        J j3 = n3.a;
        U u6 = U.f1811c;
        if (z5) {
            this.f1835u = U.f1812e;
        } else {
            this.f1835u = u6;
        }
        if (u5 != u6 && n3.f1770e) {
            J.V(j3, true, 6);
        }
        V.e z6 = j3.z();
        Object[] objArr = z6.f8759c;
        int i6 = z6.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j4 = (J) objArr[i7];
            W w5 = j4.f1722K.f1782q;
            if (w5 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (w5.f1826l != Integer.MAX_VALUE) {
                w5.y0();
                J.Y(j4);
            }
        }
    }

    public final void z0() {
        N n3 = this.f1823i;
        if (n3.f1780o > 0) {
            V.e z5 = n3.a.z();
            Object[] objArr = z5.f8759c;
            int i6 = z5.f8761f;
            for (int i7 = 0; i7 < i6; i7++) {
                J j3 = (J) objArr[i7];
                N n5 = j3.f1722K;
                if ((n5.f1778m || n5.f1779n) && !n5.f1771f) {
                    j3.U(false);
                }
                W w5 = n5.f1782q;
                if (w5 != null) {
                    w5.z0();
                }
            }
        }
    }
}
