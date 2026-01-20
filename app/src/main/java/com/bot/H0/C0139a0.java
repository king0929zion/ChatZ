package H0;

import F0.AbstractC0107a;
import F0.U;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import java.util.List;
import m4.AbstractC1276k;

/* renamed from: H0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139a0 extends F0.k0 implements F0.U, InterfaceC0138a, InterfaceC0143c0 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f1853A;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1857E;

    /* renamed from: I, reason: collision with root package name */
    public float f1861I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1862J;

    /* renamed from: K, reason: collision with root package name */
    public l4.c f1863K;

    /* renamed from: L, reason: collision with root package name */
    public r0.b f1864L;

    /* renamed from: N, reason: collision with root package name */
    public float f1866N;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1868P;

    /* renamed from: i, reason: collision with root package name */
    public final N f1869i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1870j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1873m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1874n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1876p;

    /* renamed from: r, reason: collision with root package name */
    public l4.c f1878r;

    /* renamed from: s, reason: collision with root package name */
    public r0.b f1879s;

    /* renamed from: t, reason: collision with root package name */
    public float f1880t;

    /* renamed from: v, reason: collision with root package name */
    public Object f1882v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1883w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1884x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1885y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1886z;

    /* renamed from: k, reason: collision with root package name */
    public int f1871k = TableCell.NOT_TRACKED;

    /* renamed from: l, reason: collision with root package name */
    public int f1872l = TableCell.NOT_TRACKED;

    /* renamed from: o, reason: collision with root package name */
    public H f1875o = H.f1707f;

    /* renamed from: q, reason: collision with root package name */
    public long f1877q = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1881u = true;

    /* renamed from: B, reason: collision with root package name */
    public final K f1854B = new K(this, 0);

    /* renamed from: C, reason: collision with root package name */
    public final V.e f1855C = new V.e(new C0139a0[16]);

    /* renamed from: D, reason: collision with root package name */
    public boolean f1856D = true;

    /* renamed from: F, reason: collision with root package name */
    public long f1858F = AbstractC0960b.b(0, 0, 15);

    /* renamed from: G, reason: collision with root package name */
    public final Z f1859G = new Z(this, 1);

    /* renamed from: H, reason: collision with root package name */
    public final Z f1860H = new Z(this, 0);

    /* renamed from: M, reason: collision with root package name */
    public long f1865M = 0;

    /* renamed from: O, reason: collision with root package name */
    public final Z f1867O = new Z(this, 2);

    public C0139a0(N n3) {
        this.f1869i = n3;
    }

    public final void A0() {
        N n3 = this.f1869i;
        J.X(n3.a, false, 7);
        J j3 = n3.a;
        J v5 = j3.v();
        if (v5 == null || j3.f1718G != H.f1707f) {
            return;
        }
        int ordinal = v5.f1722K.f1769d.ordinal();
        j3.f1718G = ordinal != 0 ? ordinal != 2 ? v5.f1718G : H.f1706e : H.f1705c;
    }

    public final void B0() {
        this.f1862J = true;
        N n3 = this.f1869i;
        J v5 = n3.a.v();
        float f6 = g().f1941D;
        J j3 = n3.a;
        C0149f0 c0149f0 = j3.f1721J;
        i0 i0Var = c0149f0.f1917d;
        C0165u c0165u = c0149f0.f1916c;
        while (i0Var != c0165u) {
            AbstractC1276k.d(i0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            B b5 = (B) i0Var;
            f6 += b5.f1941D;
            i0Var = b5.f1955s;
        }
        if (f6 != this.f1861I) {
            this.f1861I = f6;
            if (v5 != null) {
                v5.O();
            }
            if (v5 != null) {
                v5.C();
            }
        }
        if (!g().f1801n) {
            boolean z5 = this.f1883w;
            if (!z5 || this.f1854B.d()) {
                x0();
            }
            if (z5) {
                j3.f1721J.f1916c.h1();
            } else {
                if (v5 != null) {
                    v5.C();
                }
                if (this.f1870j && v5 != null) {
                    v5.W(false);
                }
            }
        }
        if (v5 != null) {
            N n5 = v5.f1722K;
            if (!this.f1870j && n5.f1769d == F.f1698f) {
                if (this.f1872l != Integer.MAX_VALUE) {
                    E0.a.b("Place was called on a node which was placed already");
                }
                int i6 = n5.f1774i;
                this.f1872l = i6;
                n5.f1774i = i6 + 1;
            }
        } else {
            this.f1872l = 0;
        }
        N();
    }

    public final void C0(long j3, float f6, l4.c cVar, r0.b bVar) {
        N n3 = this.f1869i;
        J j4 = n3.a;
        J j5 = n3.a;
        if (j4.f1732U) {
            E0.a.a("place is called on a deactivated node");
        }
        n3.f1769d = F.f1698f;
        this.f1877q = j3;
        this.f1880t = f6;
        this.f1878r = cVar;
        this.f1879s = bVar;
        this.f1862J = false;
        r0 a = M.a(j5);
        if (this.f1886z || !this.f1883w) {
            this.f1854B.f1761g = false;
            n3.f(false);
            this.f1863K = cVar;
            this.f1865M = j3;
            this.f1866N = f6;
            this.f1864L = bVar;
            t0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) a).getSnapshotObserver();
            snapshotObserver.a.d(j5, snapshotObserver.f1995f, this.f1867O);
        } else {
            i0 a6 = n3.a();
            a6.m1(e1.j.e(j3, a6.f1489h), f6, cVar, bVar);
            B0();
        }
        n3.f1769d = F.f1700h;
        if (n3.a().f1801n && (n3.f1776k || n3.f1775j)) {
            requestLayout();
        }
        this.f1874n = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002e, B:10:0x0032, B:12:0x003a, B:15:0x0043, B:16:0x0045, B:18:0x0049, B:20:0x004f, B:22:0x0057, B:24:0x0065, B:26:0x0070, B:27:0x0074, B:28:0x005b, B:29:0x0088, B:31:0x008c, B:33:0x0090, B:34:0x0095, B:38:0x001b, B:40:0x001f, B:42:0x0023, B:44:0x002b, B:45:0x0027), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002e, B:10:0x0032, B:12:0x003a, B:15:0x0043, B:16:0x0045, B:18:0x0049, B:20:0x004f, B:22:0x0057, B:24:0x0065, B:26:0x0070, B:27:0x0074, B:28:0x005b, B:29:0x0088, B:31:0x008c, B:33:0x0090, B:34:0x0095, B:38:0x001b, B:40:0x001f, B:42:0x0023, B:44:0x002b, B:45:0x0027), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(long r9, float r11, l4.c r12, r0.b r13) {
        /*
            r8 = this;
            H0.N r0 = r8.f1869i
            H0.J r1 = r0.a
            H0.J r2 = r0.a
            r3 = 1
            r8.f1884x = r3     // Catch: java.lang.Throwable -> L17
            long r4 = r8.f1877q     // Catch: java.lang.Throwable -> L17
            boolean r4 = e1.j.c(r9, r4)     // Catch: java.lang.Throwable -> L17
            r5 = 0
            if (r4 == 0) goto L1b
            boolean r4 = r8.f1868P     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2e
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            goto L9e
        L1b:
            boolean r4 = r0.f1776k     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L27
            boolean r4 = r0.f1775j     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L27
            boolean r4 = r8.f1868P     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2b
        L27:
            r8.f1886z = r3     // Catch: java.lang.Throwable -> L17
            r8.f1868P = r5     // Catch: java.lang.Throwable -> L17
        L2b:
            r8.z0()     // Catch: java.lang.Throwable -> L17
        L2e:
            H0.W r4 = r0.f1782q     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L45
            H0.N r6 = r4.f1823i     // Catch: java.lang.Throwable -> L17
            H0.U r4 = r4.f1835u     // Catch: java.lang.Throwable -> L17
            H0.U r7 = H0.U.f1813f     // Catch: java.lang.Throwable -> L17
            if (r4 != r7) goto L45
            H0.J r4 = r6.a     // Catch: java.lang.Throwable -> L17
            boolean r4 = H0.AbstractC0157l.q(r4)     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L43
            goto L45
        L43:
            r6.f1768c = r3     // Catch: java.lang.Throwable -> L17
        L45:
            H0.W r4 = r0.f1782q     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L88
            boolean r4 = r4.v0()     // Catch: java.lang.Throwable -> L17
            if (r4 != r3) goto L88
            H0.i0 r3 = r0.a()     // Catch: java.lang.Throwable -> L17
            H0.i0 r3 = r3.f1956t     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L5b
            F0.S r3 = r3.f1802o     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L65
        L5b:
            H0.r0 r3 = H0.M.a(r2)     // Catch: java.lang.Throwable -> L17
            I0.x r3 = (I0.ViewTreeObserverOnGlobalLayoutListenerC0216x) r3     // Catch: java.lang.Throwable -> L17
            F0.j0 r3 = r3.getPlacementScope()     // Catch: java.lang.Throwable -> L17
        L65:
            H0.W r4 = r0.f1782q     // Catch: java.lang.Throwable -> L17
            m4.AbstractC1276k.c(r4)     // Catch: java.lang.Throwable -> L17
            H0.J r2 = r2.v()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L74
            H0.N r2 = r2.f1722K     // Catch: java.lang.Throwable -> L17
            r2.f1773h = r5     // Catch: java.lang.Throwable -> L17
        L74:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4.f1826l = r2     // Catch: java.lang.Throwable -> L17
            r2 = 32
            long r5 = r9 >> r2
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L17
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L17
            F0.j0.j(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L17
        L88:
            H0.W r0 = r0.f1782q     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L95
            boolean r0 = r0.f1829o     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L95
            java.lang.String r0 = "Error: Placement happened before lookahead."
            E0.a.b(r0)     // Catch: java.lang.Throwable -> L17
        L95:
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r2.C0(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L17
            return
        L9e:
            r1.a0(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C0139a0.D0(long, float, l4.c, r0.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E0(long r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C0139a0.E0(long):boolean");
    }

    @Override // H0.InterfaceC0138a
    public final void F(B0.G g3) {
        V.e z5 = this.f1869i.a.z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            g3.f(((J) objArr[i7]).f1722K.f1781p);
        }
    }

    @Override // F0.k0, F0.U
    public final Object H() {
        return this.f1882v;
    }

    @Override // H0.InterfaceC0143c0
    public final void M(boolean z5) {
        N n3 = this.f1869i;
        if (z5 != n3.a().f1799l) {
            n3.a().f1799l = z5;
            this.f1868P = true;
        }
    }

    @Override // H0.InterfaceC0138a
    public final void N() {
        this.f1857E = true;
        K k3 = this.f1854B;
        k3.h();
        boolean z5 = this.f1886z;
        N n3 = this.f1869i;
        if (z5) {
            V.e z6 = n3.a.z();
            Object[] objArr = z6.f8759c;
            int i6 = z6.f8761f;
            for (int i7 = 0; i7 < i6; i7++) {
                J j3 = (J) objArr[i7];
                if (j3.q() && j3.r() == H.f1705c && J.Q(j3)) {
                    J.X(n3.a, false, 7);
                }
            }
        }
        if (this.f1853A || (!this.f1876p && !g().f1801n && this.f1886z)) {
            this.f1886z = false;
            F f6 = n3.f1769d;
            n3.f1769d = F.f1698f;
            n3.g(false);
            J j4 = n3.a;
            t0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j4)).getSnapshotObserver();
            snapshotObserver.a.d(j4, snapshotObserver.f1994e, this.f1860H);
            n3.f1769d = f6;
            this.f1853A = false;
        }
        if (k3.f1758d) {
            k3.f1759e = true;
        }
        if (k3.f1756b && k3.e()) {
            k3.g();
        }
        this.f1857E = false;
    }

    @Override // H0.InterfaceC0138a
    public final void Y() {
        J.X(this.f1869i.a, false, 7);
    }

    @Override // F0.U
    public final int a0(int i6) {
        N n3 = this.f1869i;
        if (!AbstractC0157l.q(n3.a)) {
            A0();
            return n3.a().a0(i6);
        }
        W w5 = n3.f1782q;
        AbstractC1276k.c(w5);
        return w5.a0(i6);
    }

    @Override // H0.InterfaceC0138a
    public final K b() {
        return this.f1854B;
    }

    @Override // F0.U
    public final int d(int i6) {
        N n3 = this.f1869i;
        if (!AbstractC0157l.q(n3.a)) {
            A0();
            return n3.a().d(i6);
        }
        W w5 = n3.f1782q;
        AbstractC1276k.c(w5);
        return w5.d(i6);
    }

    @Override // F0.k0
    public final int f0(AbstractC0107a abstractC0107a) {
        N n3 = this.f1869i;
        J v5 = n3.a.v();
        F f6 = v5 != null ? v5.f1722K.f1769d : null;
        F f7 = F.f1696c;
        K k3 = this.f1854B;
        if (f6 == f7) {
            k3.f1757c = true;
        } else {
            J v6 = n3.a.v();
            if ((v6 != null ? v6.f1722K.f1769d : null) == F.f1698f) {
                k3.f1758d = true;
            }
        }
        this.f1876p = true;
        int f02 = n3.a().f0(abstractC0107a);
        this.f1876p = false;
        return f02;
    }

    @Override // H0.InterfaceC0138a
    public final C0165u g() {
        return this.f1869i.a.f1721J.f1916c;
    }

    @Override // H0.InterfaceC0138a
    public final InterfaceC0138a h() {
        N n3;
        J v5 = this.f1869i.a.v();
        if (v5 == null || (n3 = v5.f1722K) == null) {
            return null;
        }
        return n3.f1781p;
    }

    @Override // F0.k0
    public final int i0() {
        return this.f1869i.a().i0();
    }

    @Override // F0.k0
    public final int j0() {
        return this.f1869i.a().j0();
    }

    @Override // F0.k0
    public final void m0(long j3, float f6, l4.c cVar) {
        D0(j3, f6, cVar, null);
    }

    @Override // F0.U
    public final int o(int i6) {
        N n3 = this.f1869i;
        if (!AbstractC0157l.q(n3.a)) {
            A0();
            return n3.a().o(i6);
        }
        W w5 = n3.f1782q;
        AbstractC1276k.c(w5);
        return w5.o(i6);
    }

    @Override // H0.InterfaceC0138a
    public final int p() {
        return this.f1872l;
    }

    @Override // F0.k0
    public final void p0(long j3, float f6, r0.b bVar) {
        D0(j3, f6, null, bVar);
    }

    @Override // F0.U
    public final int q(int i6) {
        N n3 = this.f1869i;
        if (!AbstractC0157l.q(n3.a)) {
            A0();
            return n3.a().q(i6);
        }
        W w5 = n3.f1782q;
        AbstractC1276k.c(w5);
        return w5.q(i6);
    }

    @Override // H0.InterfaceC0138a
    public final void requestLayout() {
        this.f1869i.a.W(false);
    }

    public final List v0() {
        N n3 = this.f1869i;
        n3.a.h0();
        boolean z5 = this.f1856D;
        V.e eVar = this.f1855C;
        if (!z5) {
            return eVar.f();
        }
        J j3 = n3.a;
        V.e z6 = j3.z();
        Object[] objArr = z6.f8759c;
        int i6 = z6.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j4 = (J) objArr[i7];
            if (eVar.f8761f <= i7) {
                eVar.b(j4.f1722K.f1781p);
            } else {
                C0139a0 c0139a0 = j4.f1722K.f1781p;
                Object[] objArr2 = eVar.f8759c;
                Object obj = objArr2[i7];
                objArr2[i7] = c0139a0;
            }
        }
        eVar.l(((V.e) ((V.b) j3.n()).f8751e).f8761f, eVar.f8761f);
        this.f1856D = false;
        return eVar.f();
    }

    @Override // F0.U
    public final F0.k0 w(long j3) {
        H h3;
        N n3 = this.f1869i;
        J j4 = n3.a;
        H h6 = j4.f1718G;
        H h7 = H.f1707f;
        if (h6 == h7) {
            j4.e();
        }
        if (AbstractC0157l.q(n3.a)) {
            W w5 = n3.f1782q;
            AbstractC1276k.c(w5);
            w5.f1827m = h7;
            w5.w(j3);
        }
        J j5 = n3.a;
        J v5 = j5.v();
        if (v5 != null) {
            N n5 = v5.f1722K;
            if (this.f1875o != h7 && !j5.f1720I) {
                E0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = n5.f1769d.ordinal();
            if (ordinal == 0) {
                h3 = H.f1705c;
            } else {
                if (ordinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + n5.f1769d);
                }
                h3 = H.f1706e;
            }
            this.f1875o = h3;
        } else {
            this.f1875o = h7;
        }
        E0(j3);
        return this;
    }

    public final void x0() {
        boolean z5 = this.f1883w;
        this.f1883w = true;
        N n3 = this.f1869i;
        J j3 = n3.a;
        C0149f0 c0149f0 = j3.f1721J;
        if (!z5) {
            c0149f0.f1916c.h1();
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j3)).getRectManager().e(n3.a, true);
            if (j3.q()) {
                J.X(j3, true, 6);
            } else if (j3.f1722K.f1770e) {
                J.V(j3, true, 6);
            }
        }
        i0 i0Var = c0149f0.f1916c.f1955s;
        for (i0 i0Var2 = c0149f0.f1917d; !AbstractC1276k.b(i0Var2, i0Var) && i0Var2 != null; i0Var2 = i0Var2.f1955s) {
            if (i0Var2.f1951N) {
                i0Var2.d1();
            }
        }
        V.e z6 = j3.z();
        Object[] objArr = z6.f8759c;
        int i6 = z6.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j4 = (J) objArr[i7];
            if (j4.w() != Integer.MAX_VALUE) {
                j4.f1722K.f1781p.x0();
                J.Y(j4);
            }
        }
    }

    public final void y0() {
        if (this.f1883w) {
            this.f1883w = false;
            N n3 = this.f1869i;
            J j3 = n3.a;
            J j4 = n3.a;
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j3)).getRectManager().g(j4);
            C0149f0 c0149f0 = j4.f1721J;
            i0 i0Var = c0149f0.f1916c.f1955s;
            for (i0 i0Var2 = c0149f0.f1917d; !AbstractC1276k.b(i0Var2, i0Var) && i0Var2 != null; i0Var2 = i0Var2.f1955s) {
                i0Var2.j1();
                i0Var2.o1();
            }
            V.e z5 = j4.z();
            Object[] objArr = z5.f8759c;
            int i6 = z5.f8761f;
            for (int i7 = 0; i7 < i6; i7++) {
                ((J) objArr[i7]).f1722K.f1781p.y0();
            }
        }
    }

    public final void z0() {
        N n3 = this.f1869i;
        if (n3.f1777l > 0) {
            V.e z5 = n3.a.z();
            Object[] objArr = z5.f8759c;
            int i6 = z5.f8761f;
            for (int i7 = 0; i7 < i6; i7++) {
                J j3 = (J) objArr[i7];
                N n5 = j3.f1722K;
                boolean z6 = n5.f1775j;
                C0139a0 c0139a0 = n5.f1781p;
                if ((z6 || n5.f1776k) && !c0139a0.f1886z) {
                    j3.W(false);
                }
                c0139a0.z0();
            }
        }
    }
}
