package H0;

import B0.C0028d;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import I0.X0;
import O.C0316k;
import T.C0607g0;
import T.C0641y;
import T.InterfaceC0608h;
import T.InterfaceC0643z;
import T.e1;
import Z2.C0741a0;
import b0.C0878k;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import e1.C0959a;
import e1.InterfaceC0961c;
import h0.AbstractC1040q;
import h0.C1035l;
import h0.C1038o;
import h0.InterfaceC1039p;
import h0.InterfaceC1041r;
import h1.C1049c;
import i0.C1064c;
import java.util.List;
import m4.AbstractC1276k;
import o0.C1387I;

/* loaded from: classes.dex */
public final class J implements InterfaceC0608h, s0, InterfaceC0152h {

    /* renamed from: V, reason: collision with root package name */
    public static final E f1709V = new G("Undefined intrinsics block and it is required");

    /* renamed from: W, reason: collision with root package name */
    public static final D f1710W = new Object();

    /* renamed from: X, reason: collision with root package name */
    public static final C f1711X = new C(0);

    /* renamed from: A, reason: collision with root package name */
    public F0.V f1712A;

    /* renamed from: B, reason: collision with root package name */
    public M.q f1713B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC0961c f1714C;

    /* renamed from: D, reason: collision with root package name */
    public e1.m f1715D;

    /* renamed from: E, reason: collision with root package name */
    public X0 f1716E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC0643z f1717F;

    /* renamed from: G, reason: collision with root package name */
    public H f1718G;

    /* renamed from: H, reason: collision with root package name */
    public H f1719H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1720I;

    /* renamed from: J, reason: collision with root package name */
    public final C0149f0 f1721J;

    /* renamed from: K, reason: collision with root package name */
    public final N f1722K;

    /* renamed from: L, reason: collision with root package name */
    public F0.Q f1723L;

    /* renamed from: M, reason: collision with root package name */
    public i0 f1724M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1725N;

    /* renamed from: O, reason: collision with root package name */
    public InterfaceC1041r f1726O;

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC1041r f1727P;

    /* renamed from: Q, reason: collision with root package name */
    public C1049c f1728Q;

    /* renamed from: R, reason: collision with root package name */
    public B0.J f1729R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f1730S;

    /* renamed from: T, reason: collision with root package name */
    public int f1731T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f1732U;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1733c;

    /* renamed from: e, reason: collision with root package name */
    public int f1734e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1735f;

    /* renamed from: g, reason: collision with root package name */
    public long f1736g;

    /* renamed from: h, reason: collision with root package name */
    public long f1737h;

    /* renamed from: i, reason: collision with root package name */
    public long f1738i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1739j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1740k;

    /* renamed from: l, reason: collision with root package name */
    public J f1741l;

    /* renamed from: m, reason: collision with root package name */
    public int f1742m;

    /* renamed from: n, reason: collision with root package name */
    public final M.q f1743n;

    /* renamed from: o, reason: collision with root package name */
    public V.e f1744o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1745p;

    /* renamed from: q, reason: collision with root package name */
    public J f1746q;

    /* renamed from: r, reason: collision with root package name */
    public r0 f1747r;

    /* renamed from: s, reason: collision with root package name */
    public h1.x f1748s;

    /* renamed from: t, reason: collision with root package name */
    public int f1749t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1750u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1751v;

    /* renamed from: w, reason: collision with root package name */
    public P0.m f1752w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1753x;

    /* renamed from: y, reason: collision with root package name */
    public final V.e f1754y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1755z;

    public J(int i6) {
        this((i6 & 1) == 0, P0.n.a.addAndGet(1));
    }

    public static boolean Q(J j3) {
        C0139a0 c0139a0 = j3.f1722K.f1781p;
        return j3.P(c0139a0.f1873m ? new C0959a(c0139a0.f1488g) : null);
    }

    public static void V(J j3, boolean z5, int i6) {
        J v5;
        if ((i6 & 1) != 0) {
            z5 = false;
        }
        boolean z6 = (i6 & 2) != 0;
        boolean z7 = (i6 & 4) != 0;
        if (j3.f1741l == null) {
            E0.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        r0 r0Var = j3.f1747r;
        if (r0Var == null || j3.f1750u || j3.f1733c) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).C(j3, true, z5, z6);
        if (z7) {
            W w5 = j3.f1722K.f1782q;
            AbstractC1276k.c(w5);
            N n3 = w5.f1823i;
            J v6 = n3.a.v();
            H h3 = n3.a.f1718G;
            if (v6 == null || h3 == H.f1707f) {
                return;
            }
            while (v6.f1718G == h3 && (v5 = v6.v()) != null) {
                v6 = v5;
            }
            int ordinal = h3.ordinal();
            if (ordinal == 0) {
                if (v6.f1741l != null) {
                    V(v6, z5, 6);
                    return;
                } else {
                    X(v6, z5, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (v6.f1741l != null) {
                v6.U(z5);
            } else {
                v6.W(z5);
            }
        }
    }

    public static void X(J j3, boolean z5, int i6) {
        r0 r0Var;
        J v5;
        if ((i6 & 1) != 0) {
            z5 = false;
        }
        boolean z6 = (i6 & 2) != 0;
        boolean z7 = (i6 & 4) != 0;
        if (j3.f1750u || j3.f1733c || (r0Var = j3.f1747r) == null) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).C(j3, false, z5, z6);
        if (z7) {
            N n3 = j3.f1722K.f1781p.f1869i;
            J v6 = n3.a.v();
            H h3 = n3.a.f1718G;
            if (v6 == null || h3 == H.f1707f) {
                return;
            }
            while (v6.f1718G == h3 && (v5 = v6.v()) != null) {
                v6 = v5;
            }
            int ordinal = h3.ordinal();
            if (ordinal == 0) {
                X(v6, z5, 6);
            } else {
                if (ordinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                v6.W(z5);
            }
        }
    }

    public static void Y(J j3) {
        N n3 = j3.f1722K;
        if (I.a[n3.f1769d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + n3.f1769d);
        }
        if (n3.f1770e) {
            V(j3, true, 6);
            return;
        }
        if (n3.f1771f) {
            j3.U(true);
        }
        if (j3.q()) {
            X(j3, true, 6);
        } else if (j3.p()) {
            j3.W(true);
        }
    }

    private final String j(J j3) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(j3);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        J j4 = j3.f1746q;
        sb.append(j4 != null ? j4.g(0) : null);
        return sb.toString();
    }

    public final void A(long j3, C0163s c0163s, int i6, boolean z5) {
        C0149f0 c0149f0 = this.f1721J;
        i0 i0Var = c0149f0.f1917d;
        C1387I c1387i = i0.f1933Q;
        c0149f0.f1917d.b1(i0.f1936T, i0Var.T0(j3), c0163s, i6, z5);
    }

    public final void B(int i6, J j3) {
        if (j3.f1746q != null && j3.f1747r != null) {
            E0.a.b(j(j3));
        }
        j3.f1746q = this;
        M.q qVar = this.f1743n;
        ((V.e) qVar.f3179e).a(i6, j3);
        ((A0.b) qVar.f3180f).b();
        O();
        if (j3.f1733c) {
            this.f1742m++;
        }
        G();
        r0 r0Var = this.f1747r;
        if (r0Var != null) {
            j3.d(r0Var);
        }
        if (j3.f1722K.f1777l > 0) {
            N n3 = this.f1722K;
            n3.d(n3.f1777l + 1);
        }
        if (j3.f1731T > 0) {
            c0(this.f1731T + 1);
        }
    }

    public final void C() {
        if (this.f1725N) {
            C0149f0 c0149f0 = this.f1721J;
            i0 i0Var = c0149f0.f1916c;
            i0 i0Var2 = c0149f0.f1917d.f1956t;
            this.f1724M = null;
            while (true) {
                if (AbstractC1276k.b(i0Var, i0Var2)) {
                    break;
                }
                if ((i0Var != null ? i0Var.f1952O : null) != null) {
                    this.f1724M = i0Var;
                    break;
                }
                i0Var = i0Var != null ? i0Var.f1956t : null;
            }
        }
        i0 i0Var3 = this.f1724M;
        if (i0Var3 != null && i0Var3.f1952O == null) {
            throw B3.e.f("layer was not set");
        }
        if (i0Var3 != null) {
            i0Var3.d1();
            return;
        }
        J v5 = v();
        if (v5 != null) {
            v5.C();
        }
    }

    public final void D() {
        C0149f0 c0149f0 = this.f1721J;
        i0 i0Var = c0149f0.f1917d;
        C0165u c0165u = c0149f0.f1916c;
        while (i0Var != c0165u) {
            AbstractC1276k.d(i0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            B b5 = (B) i0Var;
            q0 q0Var = b5.f1952O;
            if (q0Var != null) {
                q0Var.invalidate();
            }
            i0Var = b5.f1955s;
        }
        q0 q0Var2 = c0149f0.f1916c.f1952O;
        if (q0Var2 != null) {
            q0Var2.invalidate();
        }
    }

    public final void E() {
        if (this.f1733c) {
            J v5 = v();
            if (v5 != null) {
                v5.E();
                return;
            }
            return;
        }
        if (this.f1741l != null) {
            V(this, false, 7);
        } else {
            X(this, false, 7);
        }
    }

        public final void F() {
        if (this.f1753x) {
            return;
        }
        if (this.f1721J.f1915b.f11811i != null || this.f1727P != null) {
            this.f1751v = true;
            return;
        }
        P0.m mVar = this.f1752w;
        this.f1753x = true;
        Object obj = new Object();
        obj.f12973c = new P0.m();
        t0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(this)).getSnapshotObserver();
        C0028d c0028d = new C0028d(1, this, obj);
        snapshotObserver.a.d(this, snapshotObserver.f1993d, c0028d);
        this.f1753x = false;
        this.f1752w = (P0.m) obj.f12973c;
        this.f1751v = false;
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = (ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(this);
        viewTreeObserverOnGlobalLayoutListenerC0216x.getSemanticsOwner().b(this, mVar);
        viewTreeObserverOnGlobalLayoutListenerC0216x.E();
    }

    public final void G() {
        J j3;
        if (this.f1742m > 0) {
            this.f1745p = true;
        }
        if (!this.f1733c || (j3 = this.f1746q) == null) {
            return;
        }
        j3.G();
    }

    public final boolean H() {
        return this.f1747r != null;
    }

    public final boolean I() {
        return this.f1722K.f1781p.f1883w;
    }

    public final Boolean J() {
        W w5 = this.f1722K.f1782q;
        if (w5 != null) {
            return Boolean.valueOf(w5.f1835u != U.f1813f);
        }
        return null;
    }

    public final void K() {
        J v5;
        if (this.f1718G == H.f1707f) {
            f();
        }
        W w5 = this.f1722K.f1782q;
        AbstractC1276k.c(w5);
        boolean z5 = true;
        try {
            w5.f1824j = true;
            if (!w5.f1829o) {
                E0.a.b("replace() called on item that was not placed");
            }
            w5.f1822F = false;
            if (w5.f1835u == U.f1813f) {
                z5 = false;
            }
            w5.C0(w5.f1832r, w5.f1833s, w5.f1834t);
            if (z5 && !w5.f1822F && (v5 = w5.f1823i.a.v()) != null) {
                v5.U(false);
            }
            w5.f1824j = false;
        } catch (Throwable th) {
            w5.f1824j = false;
            throw th;
        }
    }

    public final void L(int i6, int i7, int i8) {
        if (i6 == i7) {
            return;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = i6 > i7 ? i6 + i9 : i6;
            int i11 = i6 > i7 ? i7 + i9 : (i7 + i8) - 2;
            M.q qVar = this.f1743n;
            V.e eVar = (V.e) qVar.f3179e;
            A0.b bVar = (A0.b) qVar.f3180f;
            Object k3 = eVar.k(i10);
            bVar.b();
            ((V.e) qVar.f3179e).a(i11, (J) k3);
            bVar.b();
        }
        O();
        G();
        E();
    }

    public final void M(J j3) {
        if (j3.f1722K.f1777l > 0) {
            this.f1722K.d(r0.f1777l - 1);
        }
        if (this.f1747r != null) {
            j3.h();
        }
        j3.f1746q = null;
        if (j3.f1731T > 0) {
            c0(this.f1731T - 1);
        }
        j3.f1721J.f1917d.f1956t = null;
        if (j3.f1733c) {
            this.f1742m--;
            V.e eVar = (V.e) j3.f1743n.f3179e;
            Object[] objArr = eVar.f8759c;
            int i6 = eVar.f8761f;
            for (int i7 = 0; i7 < i6; i7++) {
                ((J) objArr[i7]).f1721J.f1917d.f1956t = null;
            }
        }
        G();
        O();
    }

    public final void N() {
        Q0.b rectManager;
        this.f1739j = true;
        r0 r0Var = this.f1747r;
        if (r0Var == null || (rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).getRectManager()) == null) {
            return;
        }
        rectManager.d(this);
    }

    public final void O() {
        if (!this.f1733c) {
            this.f1755z = true;
            return;
        }
        J v5 = v();
        if (v5 != null) {
            v5.O();
        }
    }

    public final boolean P(C0959a c0959a) {
        if (c0959a == null) {
            return false;
        }
        if (this.f1718G == H.f1707f) {
            e();
        }
        return this.f1722K.f1781p.E0(c0959a.a);
    }

    public final void R() {
        M.q qVar = this.f1743n;
        V.e eVar = (V.e) qVar.f3179e;
        V.e eVar2 = (V.e) qVar.f3179e;
        int i6 = eVar.f8761f;
        while (true) {
            i6--;
            if (-1 >= i6) {
                eVar2.g();
                ((A0.b) qVar.f3180f).b();
                return;
            }
            M((J) eVar2.f8759c[i6]);
        }
    }

    public final void S(int i6, int i7) {
        if (i7 < 0) {
            E0.a.a("count (" + i7 + ") must be greater than 0");
        }
        int i8 = (i7 + i6) - 1;
        if (i6 > i8) {
            return;
        }
        while (true) {
            M.q qVar = this.f1743n;
            M((J) ((V.e) qVar.f3179e).f8759c[i8]);
            Object k3 = ((V.e) qVar.f3179e).k(i8);
            ((A0.b) qVar.f3180f).b();
            if (i8 == i6) {
                return;
            } else {
                i8--;
            }
        }
    }

    public final void T() {
        J v5;
        if (this.f1718G == H.f1707f) {
            f();
        }
        C0139a0 c0139a0 = this.f1722K.f1781p;
        N n3 = c0139a0.f1869i;
        try {
            c0139a0.f1870j = true;
            if (!c0139a0.f1874n) {
                E0.a.b("replace called on unplaced item");
            }
            boolean z5 = c0139a0.f1883w;
            c0139a0.C0(c0139a0.f1877q, c0139a0.f1880t, c0139a0.f1878r, c0139a0.f1879s);
            if (z5 && !c0139a0.f1862J && (v5 = n3.a.v()) != null) {
                v5.W(false);
            }
        } finally {
        }
    }

    public final void U(boolean z5) {
        r0 r0Var;
        if (this.f1733c || (r0Var = this.f1747r) == null) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).D(this, true, z5);
    }

    public final void W(boolean z5) {
        r0 r0Var;
        if (this.f1733c || (r0Var = this.f1747r) == null) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).D(this, false, z5);
    }

    public final void Z() {
        V.e z5 = z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j3 = (J) objArr[i7];
            H h3 = j3.f1719H;
            j3.f1718G = h3;
            if (h3 != H.f1707f) {
                j3.Z();
            }
        }
    }

                    public final void a(InterfaceC1041r interfaceC1041r) {
        Object r7;
        C0149f0 c0149f0;
        C0147e0 c0147e0;
        V.e eVar;
        boolean z5;
        boolean z6;
        boolean z7;
        V.e eVar2;
        boolean z8;
        B0.G g3;
        C0149f0 c0149f02 = this.f1721J;
        boolean d6 = c0149f02.d(16);
        AbstractC1040q abstractC1040q = c0149f02.f1918e;
        boolean d7 = c0149f02.d(PegdownExtensions.ANCHORLINKS);
        this.f1726O = interfaceC1041r;
        C0165u c0165u = c0149f02.f1916c;
        J j3 = c0149f02.a;
        AbstractC1040q abstractC1040q2 = c0149f02.f1919f;
        C0147e0 c0147e02 = c0149f02.f1915b;
        if (abstractC1040q2 == c0147e02) {
            E0.a.b("padChain called on already padded chain");
        }
        AbstractC1040q abstractC1040q3 = c0149f02.f1919f;
        abstractC1040q3.f11810h = c0147e02;
        c0147e02.f11811i = abstractC1040q3;
        V.e eVar3 = c0149f02.f1920g;
        int i6 = eVar3 != null ? eVar3.f8761f : 0;
        V.e eVar4 = c0149f02.f1921h;
        if (eVar4 == null) {
            eVar4 = new V.e(new InterfaceC1039p[16]);
        }
        V.e eVar5 = c0149f02.f1922i;
        eVar5.b(interfaceC1041r);
        B0.G g6 = null;
        while (true) {
            int i7 = eVar5.f8761f;
            if (i7 == 0) {
                break;
            }
            InterfaceC1041r interfaceC1041r2 = (InterfaceC1041r) eVar5.k(i7 - 1);
            if (interfaceC1041r2 instanceof C1035l) {
                C1035l c1035l = (C1035l) interfaceC1041r2;
                eVar5.b(c1035l.f11804b);
                eVar5.b(c1035l.a);
            } else if (interfaceC1041r2 instanceof InterfaceC1039p) {
                eVar4.b(interfaceC1041r2);
            } else {
                if (g6 == null) {
                    g3 = new B0.G(eVar4, 3);
                    g6 = g3;
                } else {
                    g3 = g6;
                }
                interfaceC1041r2.b(g3);
            }
        }
        int i8 = eVar4.f8761f;
        if (i8 == i6) {
            AbstractC1040q abstractC1040q4 = c0147e02.f11811i;
            int i9 = 0;
            while (abstractC1040q4 != null && i9 < i6) {
                if (eVar3 == null) {
                    throw B3.e.f("expected prior modifier list to be non-empty");
                }
                InterfaceC1039p interfaceC1039p = (InterfaceC1039p) eVar3.f8759c[i9];
                InterfaceC1039p interfaceC1039p2 = (InterfaceC1039p) eVar4.f8759c[i9];
                if (AbstractC1276k.b(interfaceC1039p, interfaceC1039p2)) {
                    eVar2 = eVar3;
                    z8 = 2;
                } else {
                    eVar2 = eVar3;
                    z8 = interfaceC1039p.getClass() == interfaceC1039p2.getClass();
                }
                if (!z8) {
                    abstractC1040q4 = abstractC1040q4.f11810h;
                    break;
                }
                if (z8) {
                    C0149f0.h(interfaceC1039p, interfaceC1039p2, abstractC1040q4);
                }
                abstractC1040q4 = abstractC1040q4.f11811i;
                i9++;
                eVar3 = eVar2;
            }
            eVar2 = eVar3;
            if (i9 >= i6) {
                c0149f02 = c0149f02;
                eVar3 = eVar2;
                z6 = false;
                c0149f0 = c0149f02;
                c0147e0 = c0147e02;
                eVar = eVar4;
                z5 = false;
                r7 = z6;
            } else {
                if (eVar2 == null) {
                    throw B3.e.f("expected prior modifier list to be non-empty");
                }
                if (abstractC1040q4 == null) {
                    throw B3.e.f("structuralUpdate requires a non-null tail");
                }
                boolean z9 = j3.f1727P != null;
                AbstractC1040q abstractC1040q5 = abstractC1040q4;
                c0149f0 = c0149f02;
                eVar = eVar4;
                eVar3 = eVar2;
                z7 = false;
                c0149f0.f(i9, eVar3, eVar, abstractC1040q5, !z9);
                c0147e0 = c0147e02;
                z5 = true;
                r7 = z7;
            }
        } else {
            r7 = 0;
            z7 = false;
            z6 = false;
            InterfaceC1041r interfaceC1041r3 = j3.f1727P;
            if (interfaceC1041r3 != null && i6 == 0) {
                AbstractC1040q abstractC1040q6 = c0147e02;
                for (int i10 = 0; i10 < eVar4.f8761f; i10++) {
                    abstractC1040q6 = C0149f0.b((InterfaceC1039p) eVar4.f8759c[i10], abstractC1040q6);
                }
                int i11 = 0;
                for (AbstractC1040q abstractC1040q7 = abstractC1040q.f11810h; abstractC1040q7 != null && abstractC1040q7 != c0147e02; abstractC1040q7 = abstractC1040q7.f11810h) {
                    i11 |= abstractC1040q7.f11808f;
                    abstractC1040q7.f11809g = i11;
                }
                c0149f0 = c0149f02;
                c0147e0 = c0147e02;
                eVar = eVar4;
                z5 = true;
                r7 = z7;
            } else if (i8 != 0) {
                if (eVar3 == null) {
                    eVar3 = new V.e(new InterfaceC1039p[16]);
                }
                c0149f0 = c0149f02;
                c0147e0 = c0147e02;
                eVar = eVar4;
                c0149f0.f(0, eVar3, eVar, c0147e0, !(interfaceC1041r3 != null));
                z5 = true;
            } else {
                if (eVar3 == null) {
                    throw B3.e.f("expected prior modifier list to be non-empty");
                }
                AbstractC1040q abstractC1040q8 = c0147e02.f11811i;
                for (int i12 = 0; abstractC1040q8 != null && i12 < eVar3.f8761f; i12++) {
                    abstractC1040q8 = C0149f0.c(abstractC1040q8).f11811i;
                }
                J v5 = j3.v();
                c0165u.f1956t = v5 != null ? v5.f1721J.f1916c : null;
                c0149f02.f1917d = c0165u;
                c0149f0 = c0149f02;
                c0147e0 = c0147e02;
                eVar = eVar4;
                z5 = false;
                r7 = z6;
            }
        }
        c0149f0.f1920g = eVar;
        if (eVar3 != null) {
            eVar3.g();
        } else {
            eVar3 = r7;
        }
        c0149f0.f1921h = eVar3;
        AbstractC1040q abstractC1040q9 = c0147e0.f11811i;
        if (abstractC1040q9 != null) {
            abstractC1040q = abstractC1040q9;
        }
        abstractC1040q.f11810h = r7;
        c0147e0.f11811i = r7;
        c0147e0.f11809g = -1;
        c0147e0.f11813k = r7;
        if (abstractC1040q == c0147e0) {
            E0.a.b("trimChain did not update the head");
        }
        c0149f0.f1919f = abstractC1040q;
        if (z5) {
            c0149f0.g();
        }
        boolean d8 = c0149f0.d(16);
        boolean d9 = c0149f0.d(PegdownExtensions.ANCHORLINKS);
        this.f1722K.j();
        if (this.f1741l == null && c0149f0.d(PegdownExtensions.STRIKETHROUGH)) {
            d0(this);
        }
        if (d6 == d8 && d7 == d9) {
            return;
        }
        Q0.b rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(this)).getRectManager();
        rectManager.getClass();
        if (H()) {
            C0316k c0316k = rectManager.a;
            int i13 = this.f1734e & 33554431;
            long[] jArr = (long[]) c0316k.f4140c;
            int i14 = c0316k.f4139b;
            for (int i15 = 0; i15 < jArr.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                long j4 = jArr[i16];
                if ((((int) j4) & 33554431) == i13) {
                    jArr[i16] = ((d8 ? 1L : 0L) * 4611686018427387904L) | ((-6917529027641081857L) & j4) | ((d9 ? 1L : 0L) * 2305843009213693952L);
                    return;
                }
            }
        }
    }

    public final void a0(Throwable th) {
        InterfaceC0643z interfaceC0643z = this.f1717F;
        e1 e1Var = g0.e.a;
        C0878k c0878k = (C0878k) interfaceC0643z;
        c0878k.getClass();
        g0.d dVar = (g0.d) T.r.B(c0878k, e1Var);
        if (dVar == null) {
            throw th;
        }
        s4.j.O(th, new C0741a0(1, dVar, this));
        throw th;
    }

    @Override // T.InterfaceC0608h
    public final void b() {
        h1.x xVar = this.f1748s;
        if (xVar != null) {
            xVar.b();
        }
        F0.Q q3 = this.f1723L;
        if (q3 != null) {
            q3.b();
        }
        C0149f0 c0149f0 = this.f1721J;
        i0 i0Var = c0149f0.f1916c.f1955s;
        for (i0 i0Var2 = c0149f0.f1917d; !AbstractC1276k.b(i0Var2, i0Var) && i0Var2 != null; i0Var2 = i0Var2.f1955s) {
            i0Var2.i1();
        }
    }

    public final void b0(InterfaceC0961c interfaceC0961c) {
        if (AbstractC1276k.b(this.f1714C, interfaceC0961c)) {
            return;
        }
        this.f1714C = interfaceC0961c;
        E();
        J v5 = v();
        if (v5 != null) {
            v5.C();
        }
        D();
        for (AbstractC1040q abstractC1040q = this.f1721J.f1919f; abstractC1040q != null; abstractC1040q = abstractC1040q.f11811i) {
            abstractC1040q.b();
        }
    }

    @Override // T.InterfaceC0608h
    public final void c() {
        C1064c c1064c;
        h1.x xVar = this.f1748s;
        if (xVar != null) {
            xVar.c();
        }
        F0.Q q3 = this.f1723L;
        if (q3 != null) {
            q3.i(true);
        }
        this.f1732U = true;
        AbstractC1040q abstractC1040q = this.f1721J.f1918e;
        for (AbstractC1040q abstractC1040q2 = abstractC1040q; abstractC1040q2 != null; abstractC1040q2 = abstractC1040q2.f11810h) {
            if (abstractC1040q2.f11819q) {
                abstractC1040q2.H0();
            }
        }
        for (AbstractC1040q abstractC1040q3 = abstractC1040q; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11810h) {
            if (abstractC1040q3.f11819q) {
                abstractC1040q3.J0();
            }
        }
        while (abstractC1040q != null) {
            if (abstractC1040q.f11819q) {
                abstractC1040q.D0();
            }
            abstractC1040q = abstractC1040q.f11810h;
        }
        if (H()) {
            this.f1752w = null;
            this.f1751v = false;
        }
        r0 r0Var = this.f1747r;
        if (r0Var == null || (c1064c = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).f2431O) == null || !c1064c.f11947k.e(this.f1734e)) {
            return;
        }
        c1064c.f11940c.z(c1064c.f11942f, this.f1734e, false);
    }

    public final void c0(int i6) {
        J v5;
        J v6;
        int i7 = this.f1731T;
        if (i7 != i6) {
            if (i6 > 0 && i7 == 0 && (v6 = v()) != null) {
                v6.c0(v6.f1731T + 1);
            }
            if (i6 == 0 && this.f1731T > 0 && (v5 = v()) != null) {
                v5.c0(v5.f1731T - 1);
            }
            this.f1731T = i6;
        }
    }

    public final void d(r0 r0Var) {
        J j3;
        P0.m x5;
        if (this.f1747r != null) {
            E0.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        J j4 = this.f1746q;
        if (j4 != null && !AbstractC1276k.b(j4.f1747r, r0Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(r0Var);
            sb.append(") than the parent's owner(");
            J v5 = v();
            sb.append(v5 != null ? v5.f1747r : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            J j5 = this.f1746q;
            sb.append(j5 != null ? j5.g(0) : null);
            E0.a.b(sb.toString());
        }
        J v6 = v();
        N n3 = this.f1722K;
        if (v6 == null) {
            n3.f1781p.f1883w = true;
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).getRectManager().e(this, false);
            W w5 = n3.f1782q;
            if (w5 != null) {
                w5.f1835u = U.f1811c;
            }
        }
        C0149f0 c0149f0 = this.f1721J;
        c0149f0.f1917d.f1956t = v6 != null ? v6.f1721J.f1916c : null;
        this.f1747r = r0Var;
        this.f1749t = (v6 != null ? v6.f1749t : -1) + 1;
        InterfaceC1041r interfaceC1041r = this.f1727P;
        if (interfaceC1041r != null) {
            a(interfaceC1041r);
        }
        this.f1727P = null;
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = (ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var;
        viewTreeObserverOnGlobalLayoutListenerC0216x.m9getLayoutNodes().i(this.f1734e, this);
        J j6 = this.f1746q;
        if (j6 == null || (j3 = j6.f1741l) == null) {
            j3 = this.f1741l;
        }
        d0(j3);
        if (this.f1741l == null && c0149f0.d(PegdownExtensions.STRIKETHROUGH)) {
            d0(this);
        }
        if (!this.f1732U) {
            for (AbstractC1040q abstractC1040q = c0149f0.f1919f; abstractC1040q != null; abstractC1040q = abstractC1040q.f11811i) {
                abstractC1040q.C0();
            }
        }
        V.e eVar = (V.e) this.f1743n.f3179e;
        Object[] objArr = eVar.f8759c;
        int i6 = eVar.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            ((J) objArr[i7]).d(r0Var);
        }
        if (!this.f1732U) {
            c0149f0.e();
        }
        E();
        if (v6 != null) {
            v6.E();
        }
        C1049c c1049c = this.f1728Q;
        if (c1049c != null) {
            c1049c.f(r0Var);
        }
        n3.j();
        if (!this.f1732U && c0149f0.d(8)) {
            F();
        }
        C1064c c1064c = viewTreeObserverOnGlobalLayoutListenerC0216x.f2431O;
        if (c1064c == null || (x5 = x()) == null || !x5.f4492c.b(P0.t.f4538q)) {
            return;
        }
        c1064c.f11947k.a(this.f1734e);
        c1064c.f11940c.z(c1064c.f11942f, this.f1734e, true);
    }

    public final void d0(J j3) {
        if (AbstractC1276k.b(j3, this.f1741l)) {
            return;
        }
        this.f1741l = j3;
        N n3 = this.f1722K;
        if (j3 != null) {
            if (n3.f1782q == null) {
                n3.f1782q = new W(n3);
            }
            C0149f0 c0149f0 = this.f1721J;
            i0 i0Var = c0149f0.f1916c.f1955s;
            for (i0 i0Var2 = c0149f0.f1917d; !AbstractC1276k.b(i0Var2, i0Var) && i0Var2 != null; i0Var2 = i0Var2.f1955s) {
                i0Var2.R0();
            }
        } else {
            n3.f1782q = null;
            n3.f1771f = false;
            n3.f1770e = false;
        }
        E();
    }

    public final void e() {
        this.f1719H = this.f1718G;
        this.f1718G = H.f1707f;
        V.e z5 = z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j3 = (J) objArr[i7];
            if (j3.f1718G != H.f1707f) {
                j3.e();
            }
        }
    }

    public final void e0(F0.V v5) {
        if (AbstractC1276k.b(this.f1712A, v5)) {
            return;
        }
        this.f1712A = v5;
        M.q qVar = this.f1713B;
        if (qVar != null) {
            ((C0607g0) qVar.f3180f).setValue(v5);
        }
        E();
    }

    public final void f() {
        this.f1719H = this.f1718G;
        this.f1718G = H.f1707f;
        V.e z5 = z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j3 = (J) objArr[i7];
            if (j3.f1718G == H.f1706e) {
                j3.f();
            }
        }
    }

    public final void f0(InterfaceC1041r interfaceC1041r) {
        if (this.f1733c && this.f1726O != C1038o.a) {
            E0.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f1732U) {
            E0.a.a("modifier is updated when deactivated");
        }
        if (!H()) {
            this.f1727P = interfaceC1041r;
            return;
        }
        a(interfaceC1041r);
        if (this.f1751v) {
            F();
        }
    }

    public final String g(int i6) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < i6; i7++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        V.e z5 = z();
        Object[] objArr = z5.f8759c;
        int i8 = z5.f8761f;
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append(((J) objArr[i9]).g(i6 + 1));
        }
        String sb2 = sb.toString();
        if (i6 != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    /* JADX WARN: Multi-variable type inference failed */
                                                                                            public final void g0(X0 x02) {
        if (AbstractC1276k.b(this.f1716E, x02)) {
            return;
        }
        this.f1716E = x02;
        AbstractC1040q abstractC1040q = this.f1721J.f1919f;
        if ((abstractC1040q.f11809g & 16) != 0) {
            while (abstractC1040q != null) {
                if ((abstractC1040q.f11808f & 16) != 0) {
                    AbstractC0156k abstractC0156k = abstractC1040q;
                    int r32 = 0;
                    while (abstractC0156k != 0) {
                        if (abstractC0156k instanceof w0) {
                            ((w0) abstractC0156k).t0();
                        } else if ((abstractC0156k.f11808f & 16) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                            AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                            int i6 = 0;
                            abstractC0156k = abstractC0156k;
                            r32 = r32;
                            while (abstractC1040q2 != null) {
                                if ((abstractC1040q2.f11808f & 16) != 0) {
                                    i6++;
                                    r32 = r32;
                                    if (i6 == 1) {
                                        abstractC0156k = abstractC1040q2;
                                    } else {
                                        if (r32 == 0) {
                                            r32 = new V.e(new AbstractC1040q[16]);
                                        }
                                        if (abstractC0156k != 0) {
                                            r32.b(abstractC0156k);
                                            abstractC0156k = 0;
                                        }
                                        r32.b(abstractC1040q2);
                                    }
                                }
                                abstractC1040q2 = abstractC1040q2.f11811i;
                                abstractC0156k = abstractC0156k;
                                r32 = r32;
                            }
                            if (i6 == 1) {
                            }
                        }
                        abstractC0156k = AbstractC0157l.e(r32);
                    }
                }
                if ((abstractC1040q.f11809g & 16) == 0) {
                    return;
                } else {
                    abstractC1040q = abstractC1040q.f11811i;
                }
            }
        }
    }

    public final void h() {
        K k3;
        r0 r0Var = this.f1747r;
        if (r0Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            J v5 = v();
            sb.append(v5 != null ? v5.g(0) : null);
            E0.a.c(sb.toString());
            throw new RuntimeException();
        }
        J v6 = v();
        N n3 = this.f1722K;
        if (v6 != null) {
            v6.C();
            v6.E();
            C0139a0 c0139a0 = n3.f1781p;
            H h3 = H.f1707f;
            c0139a0.f1875o = h3;
            W w5 = n3.f1782q;
            if (w5 != null) {
                w5.f1827m = h3;
            }
        }
        K k5 = n3.f1781p.f1854B;
        k5.f1756b = true;
        k5.f1757c = false;
        k5.f1759e = false;
        k5.f1758d = false;
        k5.f1760f = false;
        k5.f1761g = false;
        k5.f1762h = null;
        W w6 = n3.f1782q;
        if (w6 != null && (k3 = w6.f1836v) != null) {
            k3.f1756b = true;
            k3.f1757c = false;
            k3.f1759e = false;
            k3.f1758d = false;
            k3.f1760f = false;
            k3.f1761g = false;
            k3.f1762h = null;
        }
        C0149f0 c0149f0 = this.f1721J;
        AbstractC1040q abstractC1040q = c0149f0.f1918e;
        i0 i0Var = c0149f0.f1916c.f1955s;
        for (i0 i0Var2 = c0149f0.f1917d; !AbstractC1276k.b(i0Var2, i0Var) && i0Var2 != null; i0Var2 = i0Var2.f1955s) {
            i0Var2.o1();
            if (i0Var2.f1954r.I()) {
                i0Var2.j1();
            }
        }
        B0.J j3 = this.f1729R;
        if (j3 != null) {
            j3.f(r0Var);
        }
        for (AbstractC1040q abstractC1040q2 = abstractC1040q; abstractC1040q2 != null; abstractC1040q2 = abstractC1040q2.f11810h) {
            if (abstractC1040q2.f11819q) {
                abstractC1040q2.J0();
            }
        }
        this.f1750u = true;
        V.e eVar = (V.e) this.f1743n.f3179e;
        Object[] objArr = eVar.f8759c;
        int i6 = eVar.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            ((J) objArr[i7]).h();
        }
        this.f1750u = false;
        while (abstractC1040q != null) {
            if (abstractC1040q.f11819q) {
                abstractC1040q.D0();
            }
            abstractC1040q = abstractC1040q.f11810h;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = (ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var;
        viewTreeObserverOnGlobalLayoutListenerC0216x.m9getLayoutNodes().g(this.f1734e);
        Y y5 = viewTreeObserverOnGlobalLayoutListenerC0216x.f2440a0;
        C0158m c0158m = y5.f1843b;
        ((A3.c) c0158m.f1972e).q(this);
        ((A3.c) c0158m.f1973f).q(this);
        ((A3.c) c0158m.f1974g).q(this);
        ((V.e) y5.f1846e.f3179e).j(this);
        viewTreeObserverOnGlobalLayoutListenerC0216x.f2432P = true;
        C1064c c1064c = viewTreeObserverOnGlobalLayoutListenerC0216x.f2431O;
        if (c1064c != null && c1064c.f11947k.e(this.f1734e)) {
            c1064c.f11940c.z(c1064c.f11942f, this.f1734e, false);
        }
        viewTreeObserverOnGlobalLayoutListenerC0216x.getRectManager().g(this);
        this.f1747r = null;
        d0(null);
        this.f1749t = 0;
        C0139a0 c0139a02 = n3.f1781p;
        c0139a02.f1872l = TableCell.NOT_TRACKED;
        c0139a02.f1871k = TableCell.NOT_TRACKED;
        c0139a02.f1883w = false;
        W w7 = n3.f1782q;
        if (w7 != null) {
            w7.f1826l = TableCell.NOT_TRACKED;
            w7.f1825k = TableCell.NOT_TRACKED;
            w7.f1835u = U.f1813f;
        }
        if (c0149f0.d(8)) {
            P0.m mVar = this.f1752w;
            this.f1752w = null;
            this.f1751v = false;
            viewTreeObserverOnGlobalLayoutListenerC0216x.getSemanticsOwner().b(this, mVar);
            viewTreeObserverOnGlobalLayoutListenerC0216x.E();
        }
    }

    public final void h0() {
        if (this.f1742m <= 0 || !this.f1745p) {
            return;
        }
        this.f1745p = false;
        V.e eVar = this.f1744o;
        if (eVar == null) {
            eVar = new V.e(new J[16]);
            this.f1744o = eVar;
        }
        eVar.g();
        V.e eVar2 = (V.e) this.f1743n.f3179e;
        Object[] objArr = eVar2.f8759c;
        int i6 = eVar2.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j3 = (J) objArr[i7];
            if (j3.f1733c) {
                eVar.c(eVar.f8761f, j3.z());
            } else {
                eVar.b(j3);
            }
        }
        N n3 = this.f1722K;
        n3.f1781p.f1856D = true;
        W w5 = n3.f1782q;
        if (w5 != null) {
            w5.f1838x = true;
        }
    }

    public final void i(o0.q qVar, r0.b bVar) {
        try {
            this.f1721J.f1917d.P0(qVar, bVar);
        } catch (Throwable th) {
            a0(th);
            throw null;
        }
    }

    public final void k() {
        if (this.f1741l != null) {
            V(this, false, 5);
        } else {
            X(this, false, 5);
        }
        C0139a0 c0139a0 = this.f1722K.f1781p;
        C0959a c0959a = c0139a0.f1873m ? new C0959a(c0139a0.f1488g) : null;
        if (c0959a != null) {
            r0 r0Var = this.f1747r;
            if (r0Var != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).x(this, c0959a.a);
                return;
            }
            return;
        }
        r0 r0Var2 = this.f1747r;
        if (r0Var2 != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var2).w(true);
        }
    }

    public final List l() {
        W w5 = this.f1722K.f1782q;
        AbstractC1276k.c(w5);
        V.e eVar = w5.f1837w;
        N n3 = w5.f1823i;
        n3.a.n();
        if (!w5.f1838x) {
            return eVar.f();
        }
        J j3 = n3.a;
        V.e z5 = j3.z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j4 = (J) objArr[i7];
            if (eVar.f8761f <= i7) {
                W w6 = j4.f1722K.f1782q;
                AbstractC1276k.c(w6);
                eVar.b(w6);
            } else {
                W w7 = j4.f1722K.f1782q;
                AbstractC1276k.c(w7);
                Object[] objArr2 = eVar.f8759c;
                Object obj = objArr2[i7];
                objArr2[i7] = w7;
            }
        }
        eVar.l(((V.e) ((V.b) j3.n()).f8751e).f8761f, eVar.f8761f);
        w5.f1838x = false;
        return eVar.f();
    }

    public final List m() {
        return this.f1722K.f1781p.v0();
    }

    public final List n() {
        return z().f();
    }

    public final List o() {
        return ((V.e) this.f1743n.f3179e).f();
    }

    public final boolean p() {
        return this.f1722K.f1781p.f1886z;
    }

    public final boolean q() {
        return this.f1722K.f1781p.f1885y;
    }

    public final H r() {
        return this.f1722K.f1781p.f1875o;
    }

    public final H s() {
        H h3;
        W w5 = this.f1722K.f1782q;
        return (w5 == null || (h3 = w5.f1827m) == null) ? H.f1707f : h3;
    }

    public final M.q t() {
        M.q qVar = this.f1713B;
        if (qVar != null) {
            return qVar;
        }
        M.q qVar2 = new M.q(this, this.f1712A);
        this.f1713B = qVar2;
        return qVar2;
    }

    public final String toString() {
        return I0.K.q(this) + " children: " + ((V.e) ((V.b) n()).f8751e).f8761f + " measurePolicy: " + this.f1712A + " deactivated: " + this.f1732U;
    }

    @Override // H0.s0
    public final boolean u() {
        return H();
    }

    public final J v() {
        J j3 = this.f1746q;
        while (j3 != null && j3.f1733c) {
            j3 = j3.f1746q;
        }
        return j3;
    }

    public final int w() {
        return this.f1722K.f1781p.f1872l;
    }

    public final P0.m x() {
        if (H() && !this.f1732U && this.f1721J.d(8)) {
            return this.f1752w;
        }
        return null;
    }

    public final V.e y() {
        boolean z5 = this.f1755z;
        V.e eVar = this.f1754y;
        if (z5) {
            eVar.g();
            eVar.c(eVar.f8761f, z());
            Y3.k.A0(eVar.f8759c, f1711X, 0, eVar.f8761f);
            this.f1755z = false;
        }
        return eVar;
    }

    public final V.e z() {
        h0();
        if (this.f1742m == 0) {
            return (V.e) this.f1743n.f3179e;
        }
        V.e eVar = this.f1744o;
        AbstractC1276k.c(eVar);
        return eVar;
    }

    public J(boolean z5, int i6) {
        this.f1733c = z5;
        this.f1734e = i6;
        this.f1736g = 9223372034707292159L;
        this.f1737h = 0L;
        this.f1738i = 9223372034707292159L;
        this.f1739j = true;
        this.f1743n = new M.q(7, new V.e(new J[16]), new A0.b(this, 4));
        this.f1754y = new V.e(new J[16]);
        this.f1755z = true;
        this.f1712A = f1709V;
        this.f1714C = M.a;
        this.f1715D = e1.m.f11576c;
        this.f1716E = f1710W;
        InterfaceC0643z.f8295b.getClass();
        this.f1717F = C0641y.f8268b;
        H h3 = H.f1707f;
        this.f1718G = h3;
        this.f1719H = h3;
        this.f1721J = new C0149f0(this);
        this.f1722K = new N(this);
        this.f1725N = true;
        this.f1726O = C1038o.a;
    }
}
