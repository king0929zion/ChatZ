package H0;

import B0.C0028d;
import B0.InterfaceC0034j;
import F0.AbstractC0107a;
import F0.AbstractC0137z;
import F0.InterfaceC0134w;
import I0.C0219y0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import android.os.Build;
import android.view.ViewParent;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import e1.InterfaceC0961c;
import f0.AbstractC0983f;
import f0.AbstractC0997t;
import h0.AbstractC1040q;
import i4.AbstractC1121e;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import k.C1150D;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n0.C1352a;
import n0.C1353b;
import n0.C1354c;
import o0.C1382D;
import o0.C1383E;
import o0.C1384F;
import o0.C1385G;
import o0.C1387I;
import o0.C1397h;
import o0.C1403n;
import o4.AbstractC1410a;
import q0.C1496b;

/* loaded from: classes.dex */
public abstract class i0 extends S implements F0.U, InterfaceC0134w, s0 {

    /* renamed from: Q, reason: collision with root package name */
    public static final C1387I f1933Q = new C1387I();

    /* renamed from: R, reason: collision with root package name */
    public static final C0168x f1934R = new C0168x();

    /* renamed from: S, reason: collision with root package name */
    public static final float[] f1935S = C1382D.a();

    /* renamed from: T, reason: collision with root package name */
    public static final C0151g0 f1936T = new C0151g0(0);

    /* renamed from: U, reason: collision with root package name */
    public static final C0151g0 f1937U = new C0151g0(1);

    /* renamed from: A, reason: collision with root package name */
    public F0.W f1938A;

    /* renamed from: B, reason: collision with root package name */
    public k.H f1939B;

    /* renamed from: D, reason: collision with root package name */
    public float f1941D;

    /* renamed from: E, reason: collision with root package name */
    public C1352a f1942E;

    /* renamed from: F, reason: collision with root package name */
    public C0168x f1943F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1945H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1946I;

    /* renamed from: J, reason: collision with root package name */
    public r0.b f1947J;

    /* renamed from: K, reason: collision with root package name */
    public o0.q f1948K;

    /* renamed from: L, reason: collision with root package name */
    public F0.P f1949L;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1951N;

    /* renamed from: O, reason: collision with root package name */
    public q0 f1952O;

    /* renamed from: P, reason: collision with root package name */
    public r0.b f1953P;

    /* renamed from: r, reason: collision with root package name */
    public final J f1954r;

    /* renamed from: s, reason: collision with root package name */
    public i0 f1955s;

    /* renamed from: t, reason: collision with root package name */
    public i0 f1956t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1957u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1958v;

    /* renamed from: w, reason: collision with root package name */
    public l4.c f1959w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC0961c f1960x;

    /* renamed from: y, reason: collision with root package name */
    public e1.m f1961y;

    /* renamed from: z, reason: collision with root package name */
    public float f1962z = 0.8f;

    /* renamed from: C, reason: collision with root package name */
    public long f1940C = 0;

    /* renamed from: G, reason: collision with root package name */
    public o0.L f1944G = o0.y.f13496b;

    /* renamed from: M, reason: collision with root package name */
    public final C0153h0 f1950M = new C0153h0(this, 1);

    public i0(J j3) {
        this.f1954r = j3;
        this.f1960x = j3.f1714C;
        this.f1961y = j3.f1715D;
    }

    public static i0 q1(InterfaceC0134w interfaceC0134w) {
        i0 i0Var;
        F0.T t5 = interfaceC0134w instanceof F0.T ? (F0.T) interfaceC0134w : null;
        if (t5 != null && (i0Var = t5.f1460c.f1805r) != null) {
            return i0Var;
        }
        AbstractC1276k.d(interfaceC0134w, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (i0) interfaceC0134w;
    }

    @Override // H0.S
    public final S A0() {
        return this.f1955s;
    }

    @Override // H0.S
    public final InterfaceC0134w B0() {
        return this;
    }

    @Override // H0.S
    public final boolean C0() {
        return this.f1938A != null;
    }

    @Override // H0.S
    public final J D0() {
        return this.f1954r;
    }

    @Override // H0.S
    public final F0.W E0() {
        F0.W w5 = this.f1938A;
        if (w5 != null) {
            return w5;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // H0.S
    public final S F0() {
        return this.f1956t;
    }

    @Override // H0.S
    public final long G0() {
        return this.f1940C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // F0.k0, F0.U
    public final Object H() {
        J j3 = this.f1954r;
        if (!j3.f1721J.d(64)) {
            return null;
        }
        W0();
        Object obj = null;
        for (AbstractC1040q abstractC1040q = j3.f1721J.f1918e; abstractC1040q != null; abstractC1040q = abstractC1040q.f11810h) {
            if ((abstractC1040q.f11808f & 64) != 0) {
                AbstractC0156k abstractC0156k = abstractC1040q;
                int r6 = 0;
                while (abstractC0156k != 0) {
                    if (abstractC0156k instanceof u0) {
                        obj = ((u0) abstractC0156k).g(j3.f1714C, obj);
                    } else if ((abstractC0156k.f11808f & 64) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                        AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                        int i6 = 0;
                        abstractC0156k = abstractC0156k;
                        r6 = r6;
                        while (abstractC1040q2 != null) {
                            if ((abstractC1040q2.f11808f & 64) != 0) {
                                i6++;
                                r6 = r6;
                                if (i6 == 1) {
                                    abstractC0156k = abstractC1040q2;
                                } else {
                                    if (r6 == 0) {
                                        r6 = new V.e(new AbstractC1040q[16]);
                                    }
                                    if (abstractC0156k != 0) {
                                        r6.b(abstractC0156k);
                                        abstractC0156k = 0;
                                    }
                                    r6.b(abstractC1040q2);
                                }
                            }
                            abstractC1040q2 = abstractC1040q2.f11811i;
                            abstractC0156k = abstractC0156k;
                            r6 = r6;
                        }
                        if (i6 == 1) {
                        }
                    }
                    abstractC0156k = AbstractC0157l.e(r6);
                }
            }
        }
        return obj;
    }

    @Override // F0.InterfaceC0134w
    public final InterfaceC0134w I() {
        boolean z5 = W0().f11819q;
        J j3 = this.f1954r;
        if (!z5) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (J j4 = j3; j4 != null; j4 = j4.v()) {
                sb.append("\n|");
                sb.append(j4);
                sb.append(" isAttached=");
                sb.append(j4.H());
                sb.append(" modifier=");
                sb.append(j4.f1726O);
                sb.append(" tail=");
                sb.append(W0());
            }
            E0.a.b(sb.toString());
        }
        f1();
        return j3.f1721J.f1917d.f1956t;
    }

    @Override // H0.S
    public final void K0() {
        r0.b bVar = this.f1953P;
        if (bVar != null) {
            p0(this.f1940C, this.f1941D, bVar);
        } else {
            m0(this.f1940C, this.f1941D, this.f1959w);
        }
    }

    @Override // F0.InterfaceC0134w
    public final void L(InterfaceC0134w interfaceC0134w, float[] fArr) {
        i0 q12 = q1(interfaceC0134w);
        q12.f1();
        i0 S02 = S0(q12);
        C1382D.d(fArr);
        q12.t1(S02, fArr);
        s1(S02, fArr);
    }

    public final void L0(i0 i0Var, C1352a c1352a, boolean z5) {
        if (i0Var == this) {
            return;
        }
        i0 i0Var2 = this.f1956t;
        if (i0Var2 != null) {
            i0Var2.L0(i0Var, c1352a, z5);
        }
        long j3 = this.f1940C;
        float f6 = (int) (j3 >> 32);
        c1352a.a -= f6;
        c1352a.f13292c -= f6;
        float f7 = (int) (j3 & 4294967295L);
        c1352a.f13291b -= f7;
        c1352a.f13293d -= f7;
        q0 q0Var = this.f1952O;
        if (q0Var != null) {
            C0219y0 c0219y0 = (C0219y0) q0Var;
            float[] a = c0219y0.a();
            if (!c0219y0.f2509v) {
                if (a == null) {
                    c1352a.a = S.l.f7374V;
                    c1352a.f13291b = S.l.f7374V;
                    c1352a.f13292c = S.l.f7374V;
                    c1352a.f13293d = S.l.f7374V;
                } else {
                    C1382D.c(a, c1352a);
                }
            }
            if (this.f1958v && z5) {
                long j4 = this.f1487f;
                c1352a.a(S.l.f7374V, S.l.f7374V, (int) (j4 >> 32), (int) (j4 & 4294967295L));
            }
        }
    }

    public final long M0(i0 i0Var, long j3) {
        if (i0Var == this) {
            return j3;
        }
        i0 i0Var2 = this.f1956t;
        return (i0Var2 == null || AbstractC1276k.b(i0Var, i0Var2)) ? T0(j3) : T0(i0Var2.M0(i0Var, j3));
    }

    public final long N0(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - j0();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - i0();
        float max = Math.max(S.l.f7374V, intBitsToFloat / 2.0f);
        float max2 = Math.max(S.l.f7374V, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final float O0(long j3, long j4) {
        if (j0() >= Float.intBitsToFloat((int) (j4 >> 32)) && i0() >= Float.intBitsToFloat((int) (j4 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long N02 = N0(j4);
        float intBitsToFloat = Float.intBitsToFloat((int) (N02 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (N02 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        float max = Math.max(S.l.f7374V, intBitsToFloat3 < S.l.f7374V ? -intBitsToFloat3 : intBitsToFloat3 - j0());
        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(S.l.f7374V, Float.intBitsToFloat((int) (j3 & 4294967295L)) < S.l.f7374V ? -r9 : r9 - i0())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > S.l.f7374V || intBitsToFloat2 > S.l.f7374V) {
            int i6 = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i6) <= intBitsToFloat) {
                int i7 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i7) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i6);
                    float intBitsToFloat5 = Float.intBitsToFloat(i7);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // F0.InterfaceC0134w
    public final long P(long j3) {
        if (!W0().f11819q) {
            E0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return l(AbstractC0137z.h(this), ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(this.f1954r)).J(j3));
    }

    public final void P0(o0.q qVar, r0.b bVar) {
        q0 q0Var = this.f1952O;
        if (q0Var == null) {
            long j3 = this.f1940C;
            float f6 = (int) (j3 >> 32);
            float f7 = (int) (j3 & 4294967295L);
            qVar.n(f6, f7);
            Q0(qVar, bVar);
            qVar.n(-f6, -f7);
            return;
        }
        C0219y0 c0219y0 = (C0219y0) q0Var;
        C1496b c1496b = c0219y0.f2503p;
        c0219y0.f();
        c0219y0.f2510w = c0219y0.f2491c.a.L() > S.l.f7374V;
        C0158m c0158m = c1496b.f13944e;
        c0158m.p(qVar);
        c0158m.f1973f = bVar;
        AbstractC1121e.l(c1496b, c0219y0.f2491c);
    }

    @Override // F0.InterfaceC0134w
    public final C1354c Q(InterfaceC0134w interfaceC0134w, boolean z5) {
        if (!W0().f11819q) {
            E0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC0134w.j()) {
            E0.a.b("LayoutCoordinates " + interfaceC0134w + " is not attached!");
        }
        i0 q12 = q1(interfaceC0134w);
        q12.f1();
        i0 S02 = S0(q12);
        C1352a c1352a = this.f1942E;
        if (c1352a == null) {
            c1352a = new C1352a();
            this.f1942E = c1352a;
        }
        c1352a.a = S.l.f7374V;
        c1352a.f13291b = S.l.f7374V;
        c1352a.f13292c = (int) (interfaceC0134w.m() >> 32);
        c1352a.f13293d = (int) (interfaceC0134w.m() & 4294967295L);
        while (q12 != S02) {
            q12.n1(c1352a, z5, false);
            if (c1352a.b()) {
                return C1354c.f13294e;
            }
            q12 = q12.f1956t;
            AbstractC1276k.c(q12);
        }
        L0(S02, c1352a, z5);
        return new C1354c(c1352a.a, c1352a.f13291b, c1352a.f13292c, c1352a.f13293d);
    }

    public final void Q0(o0.q qVar, r0.b bVar) {
        o0.q qVar2;
        r0.b bVar2;
        AbstractC1040q X02 = X0(4);
        if (X02 == null) {
            l1(qVar, bVar);
            return;
        }
        J j3 = this.f1954r;
        j3.getClass();
        L sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j3)).getSharedDrawScope();
        long S5 = AbstractC1410a.S(this.f1487f);
        sharedDrawScope.getClass();
        V.e eVar = null;
        while (X02 != null) {
            if (X02 instanceof InterfaceC0160o) {
                qVar2 = qVar;
                bVar2 = bVar;
                sharedDrawScope.d(qVar2, S5, this, (InterfaceC0160o) X02, bVar2);
            } else {
                qVar2 = qVar;
                bVar2 = bVar;
                if ((X02.f11808f & 4) != 0 && (X02 instanceof AbstractC0156k)) {
                    int i6 = 0;
                    for (AbstractC1040q abstractC1040q = ((AbstractC0156k) X02).f1964s; abstractC1040q != null; abstractC1040q = abstractC1040q.f11811i) {
                        if ((abstractC1040q.f11808f & 4) != 0) {
                            i6++;
                            if (i6 == 1) {
                                X02 = abstractC1040q;
                            } else {
                                if (eVar == null) {
                                    eVar = new V.e(new AbstractC1040q[16]);
                                }
                                if (X02 != null) {
                                    eVar.b(X02);
                                    X02 = null;
                                }
                                eVar.b(abstractC1040q);
                            }
                        }
                    }
                    if (i6 == 1) {
                        qVar = qVar2;
                        bVar = bVar2;
                    }
                }
            }
            X02 = AbstractC0157l.e(eVar);
            qVar = qVar2;
            bVar = bVar2;
        }
    }

    @Override // F0.InterfaceC0134w
    public final long R(InterfaceC0134w interfaceC0134w, long j3) {
        return l(interfaceC0134w, j3);
    }

    public abstract void R0();

    public final i0 S0(i0 i0Var) {
        J j3 = i0Var.f1954r;
        J j4 = this.f1954r;
        if (j3 == j4) {
            AbstractC1040q W02 = i0Var.W0();
            AbstractC1040q W03 = W0();
            if (!W03.f11806c.f11819q) {
                E0.a.b("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC1040q abstractC1040q = W03.f11806c.f11810h; abstractC1040q != null; abstractC1040q = abstractC1040q.f11810h) {
                if ((abstractC1040q.f11808f & 2) != 0 && abstractC1040q == W02) {
                    return i0Var;
                }
            }
            return this;
        }
        while (j3.f1749t > j4.f1749t) {
            j3 = j3.v();
            AbstractC1276k.c(j3);
        }
        J j5 = j4;
        while (j5.f1749t > j3.f1749t) {
            j5 = j5.v();
            AbstractC1276k.c(j5);
        }
        while (j3 != j5) {
            j3 = j3.v();
            j5 = j5.v();
            if (j3 == null || j5 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (j5 != j4) {
            if (j3 != i0Var.f1954r) {
                return j3.f1721J.f1916c;
            }
            return i0Var;
        }
        return this;
    }

    public final long T0(long j3) {
        long j4 = this.f1940C;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - ((int) (j4 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        q0 q0Var = this.f1952O;
        return q0Var != null ? ((C0219y0) q0Var).c(floatToRawIntBits, true) : floatToRawIntBits;
    }

    @Override // F0.InterfaceC0134w
    public final long U(long j3) {
        if (!W0().f11819q) {
            E0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        f1();
        for (i0 i0Var = this; i0Var != null; i0Var = i0Var.f1956t) {
            J j4 = i0Var.f1954r;
            if (i0Var == j4.f1721J.f1917d && !j4.f1735f) {
                long b5 = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j4)).getRectManager().b(j4);
                if (!e1.j.c(b5, 9223372034707292159L)) {
                    return Y3.C.O(j3, b5);
                }
            }
            q0 q0Var = i0Var.f1952O;
            if (q0Var != null) {
                j3 = ((C0219y0) q0Var).c(j3, false);
            }
            j3 = Y3.C.O(j3, i0Var.f1940C);
        }
        return j3;
    }

    public abstract T U0();

    public final long V0() {
        return this.f1960x.r0(this.f1954r.f1716E.d());
    }

    public abstract AbstractC1040q W0();

    public final AbstractC1040q X0(int i6) {
        boolean g3 = j0.g(i6);
        AbstractC1040q W02 = W0();
        if (!g3 && (W02 = W02.f11810h) == null) {
            return null;
        }
        for (AbstractC1040q Y02 = Y0(g3); Y02 != null && (Y02.f11809g & i6) != 0; Y02 = Y02.f11811i) {
            if ((Y02.f11808f & i6) != 0) {
                return Y02;
            }
            if (Y02 == W02) {
                return null;
            }
        }
        return null;
    }

    public final AbstractC1040q Y0(boolean z5) {
        AbstractC1040q W02;
        C0149f0 c0149f0 = this.f1954r.f1721J;
        if (c0149f0.f1917d == this) {
            return c0149f0.f1919f;
        }
        if (!z5) {
            i0 i0Var = this.f1956t;
            if (i0Var != null) {
                return i0Var.W0();
            }
            return null;
        }
        i0 i0Var2 = this.f1956t;
        if (i0Var2 == null || (W02 = i0Var2.W0()) == null) {
            return null;
        }
        return W02.f11811i;
    }

    public final void Z0(AbstractC1040q abstractC1040q, C0151g0 c0151g0, long j3, C0163s c0163s, int i6, boolean z5) {
        if (abstractC1040q == null) {
            c1(c0151g0, j3, c0163s, i6, z5);
            return;
        }
        int i7 = c0163s.f1990f;
        k.I i8 = c0163s.f1988c;
        c0163s.b(i7 + 1, i8.f12466b);
        c0163s.f1990f++;
        i8.a(abstractC1040q);
        c0163s.f1989e.a(AbstractC0157l.a(-1.0f, z5, false));
        Z0(AbstractC0157l.d(abstractC1040q, c0151g0.b()), c0151g0, j3, c0163s, i6, z5);
        c0163s.f1990f = i7;
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f1954r.f1714C.a();
    }

    public final void a1(AbstractC1040q abstractC1040q, C0151g0 c0151g0, long j3, C0163s c0163s, int i6, boolean z5, float f6) {
        if (abstractC1040q == null) {
            c1(c0151g0, j3, c0163s, i6, z5);
            return;
        }
        int i7 = c0163s.f1990f;
        k.I i8 = c0163s.f1988c;
        c0163s.b(i7 + 1, i8.f12466b);
        c0163s.f1990f++;
        i8.a(abstractC1040q);
        c0163s.f1989e.a(AbstractC0157l.a(f6, z5, false));
        k1(AbstractC0157l.d(abstractC1040q, c0151g0.b()), c0151g0, j3, c0163s, i6, z5, f6, true);
        c0163s.f1990f = i7;
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f1954r.f1714C.b0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (H0.AbstractC0157l.g(r18.a(), H0.AbstractC0157l.a(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b1(H0.C0151g0 r15, long r16, H0.C0163s r18, int r19, boolean r20) {
        /*
            r14 = this;
            r3 = r16
            r5 = r18
            r6 = r19
            int r0 = r15.b()
            h0.q r1 = r14.X0(r0)
            boolean r0 = r14.w1(r3)
            r8 = 0
            r9 = 2139095040(0x7f800000, float:Infinity)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1
            if (r0 != 0) goto L4b
            if (r6 != r11) goto L4a
            long r11 = r14.V0()
            float r0 = r14.O0(r3, r11)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r10
            if (r2 >= r9) goto L4a
            int r2 = r5.f1990f
            int r7 = Y4.l.C(r5)
            if (r2 != r7) goto L35
            goto L43
        L35:
            long r7 = H0.AbstractC0157l.a(r0, r8, r8)
            long r9 = r5.a()
            int r2 = H0.AbstractC0157l.g(r9, r7)
            if (r2 <= 0) goto L4a
        L43:
            r7 = 0
            r2 = r15
            r8 = r0
            r0 = r14
            r0.a1(r1, r2, r3, r5, r6, r7, r8)
        L4a:
            return
        L4b:
            if (r1 != 0) goto L51
            r14.c1(r15, r16, r18, r19, r20)
            return
        L51:
            r0 = 32
            long r2 = r16 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r16 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L8f
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L8f
            int r3 = r14.j0()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L8f
            int r0 = r14.i0()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8f
            r0 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.Z0(r1, r2, r3, r5, r6, r7)
            return
        L8f:
            r3 = r16
            r5 = r18
            r6 = r19
            if (r6 != r11) goto La0
            long r12 = r14.V0()
            float r2 = r14.O0(r3, r12)
            goto La2
        La0:
            r2 = 2139095040(0x7f800000, float:Infinity)
        La2:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r10
            if (r7 >= r9) goto Lc9
            int r7 = r5.f1990f
            int r9 = Y4.l.C(r5)
            if (r7 != r9) goto Lb4
            r7 = r20
            goto Lc4
        Lb4:
            r7 = r20
            long r9 = H0.AbstractC0157l.a(r2, r7, r8)
            long r12 = r5.a()
            int r9 = H0.AbstractC0157l.g(r12, r9)
            if (r9 <= 0) goto Lcb
        Lc4:
            r9 = r11
        Lc5:
            r0 = r14
            r8 = r2
            r2 = r15
            goto Lcd
        Lc9:
            r7 = r20
        Lcb:
            r9 = r8
            goto Lc5
        Lcd:
            r0.k1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.i0.b1(H0.g0, long, H0.s, int, boolean):void");
    }

    public void c1(C0151g0 c0151g0, long j3, C0163s c0163s, int i6, boolean z5) {
        i0 i0Var = this.f1955s;
        if (i0Var != null) {
            i0Var.b1(c0151g0, i0Var.T0(j3), c0163s, i6, z5);
        }
    }

    public final void d1() {
        q0 q0Var = this.f1952O;
        if (q0Var != null) {
            q0Var.invalidate();
            return;
        }
        i0 i0Var = this.f1956t;
        if (i0Var != null) {
            i0Var.d1();
        }
    }

    @Override // F0.InterfaceC0134w
    public final long e(long j3) {
        long U5 = U(j3);
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = (ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(this.f1954r);
        viewTreeObserverOnGlobalLayoutListenerC0216x.F();
        return C1382D.b(U5, viewTreeObserverOnGlobalLayoutListenerC0216x.f2446e0);
    }

    public final boolean e1() {
        if (this.f1952O != null && this.f1962z <= S.l.f7374V) {
            return true;
        }
        i0 i0Var = this.f1956t;
        if (i0Var != null) {
            return i0Var.e1();
        }
        return false;
    }

    public final void f1() {
        this.f1954r.f1722K.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r7v7, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void g1() {
        AbstractC1040q abstractC1040q;
        boolean g3 = j0.g(PegdownExtensions.FENCED_CODE_BLOCKS);
        AbstractC1040q Y02 = Y0(g3);
        if (Y02 == null || (Y02.f11806c.f11809g & PegdownExtensions.FENCED_CODE_BLOCKS) == 0) {
            return;
        }
        AbstractC0983f e6 = AbstractC0997t.e();
        l4.c e7 = e6 != null ? e6.e() : null;
        AbstractC0983f h3 = AbstractC0997t.h(e6);
        try {
            if (g3) {
                abstractC1040q = W0();
            } else {
                abstractC1040q = W0().f11810h;
                if (abstractC1040q == null) {
                }
            }
            for (AbstractC1040q Y03 = Y0(g3); Y03 != null; Y03 = Y03.f11811i) {
                if ((Y03.f11809g & PegdownExtensions.FENCED_CODE_BLOCKS) == 0) {
                    break;
                }
                if ((Y03.f11808f & PegdownExtensions.FENCED_CODE_BLOCKS) != 0) {
                    AbstractC0156k abstractC0156k = Y03;
                    int r8 = 0;
                    while (abstractC0156k != 0) {
                        if (abstractC0156k instanceof InterfaceC0169y) {
                            ((InterfaceC0169y) abstractC0156k).q(this.f1487f);
                        } else if ((abstractC0156k.f11808f & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                            AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                            int i6 = 0;
                            abstractC0156k = abstractC0156k;
                            r8 = r8;
                            while (abstractC1040q2 != null) {
                                if ((abstractC1040q2.f11808f & PegdownExtensions.FENCED_CODE_BLOCKS) != 0) {
                                    i6++;
                                    r8 = r8;
                                    if (i6 == 1) {
                                        abstractC0156k = abstractC1040q2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new V.e(new AbstractC1040q[16]);
                                        }
                                        if (abstractC0156k != 0) {
                                            r8.b(abstractC0156k);
                                            abstractC0156k = 0;
                                        }
                                        r8.b(abstractC1040q2);
                                    }
                                }
                                abstractC1040q2 = abstractC1040q2.f11811i;
                                abstractC0156k = abstractC0156k;
                                r8 = r8;
                            }
                            if (i6 == 1) {
                            }
                        }
                        abstractC0156k = AbstractC0157l.e(r8);
                    }
                }
                if (Y03 == abstractC1040q) {
                    break;
                }
            }
        } finally {
            AbstractC0997t.k(e6, h3, e7);
        }
    }

    @Override // F0.r
    public final e1.m getLayoutDirection() {
        return this.f1954r.f1715D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void h1() {
        boolean g3 = j0.g(PegdownExtensions.EXTANCHORLINKS);
        AbstractC1040q W02 = W0();
        if (!g3 && (W02 = W02.f11810h) == null) {
            return;
        }
        for (AbstractC1040q Y02 = Y0(g3); Y02 != null && (Y02.f11809g & PegdownExtensions.EXTANCHORLINKS) != 0; Y02 = Y02.f11811i) {
            if ((Y02.f11808f & PegdownExtensions.EXTANCHORLINKS) != 0) {
                AbstractC0156k abstractC0156k = Y02;
                int r5 = 0;
                while (abstractC0156k != 0) {
                    if (abstractC0156k instanceof InterfaceC0169y) {
                        ((InterfaceC0169y) abstractC0156k).o(this);
                    } else if ((abstractC0156k.f11808f & PegdownExtensions.EXTANCHORLINKS) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                        AbstractC1040q abstractC1040q = abstractC0156k.f1964s;
                        int i6 = 0;
                        abstractC0156k = abstractC0156k;
                        r5 = r5;
                        while (abstractC1040q != null) {
                            if ((abstractC1040q.f11808f & PegdownExtensions.EXTANCHORLINKS) != 0) {
                                i6++;
                                r5 = r5;
                                if (i6 == 1) {
                                    abstractC0156k = abstractC1040q;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new V.e(new AbstractC1040q[16]);
                                    }
                                    if (abstractC0156k != 0) {
                                        r5.b(abstractC0156k);
                                        abstractC0156k = 0;
                                    }
                                    r5.b(abstractC1040q);
                                }
                            }
                            abstractC1040q = abstractC1040q.f11811i;
                            abstractC0156k = abstractC0156k;
                            r5 = r5;
                        }
                        if (i6 == 1) {
                        }
                    }
                    abstractC0156k = AbstractC0157l.e(r5);
                }
            }
            if (Y02 == W02) {
                return;
            }
        }
    }

    public final void i1() {
        this.f1957u = true;
        this.f1950M.b();
        o1();
        if (e1.j.c(this.f1940C, 0L)) {
            return;
        }
        this.f1954r.N();
    }

    @Override // F0.InterfaceC0134w
    public final boolean j() {
        return W0().f11819q;
    }

    public final void j1() {
        boolean g3 = j0.g(PegdownExtensions.RELAXEDHRULES);
        AbstractC1040q Y02 = Y0(g3);
        if (Y02 == null || (Y02.f11806c.f11809g & PegdownExtensions.RELAXEDHRULES) == 0) {
            return;
        }
        AbstractC1040q W02 = W0();
        if (!g3 && (W02 = W02.f11810h) == null) {
            return;
        }
        for (AbstractC1040q Y03 = Y0(g3); Y03 != null && (Y03.f11809g & PegdownExtensions.RELAXEDHRULES) != 0; Y03 = Y03.f11811i) {
            if ((Y03.f11808f & PegdownExtensions.RELAXEDHRULES) != 0) {
                AbstractC1040q abstractC1040q = Y03;
                V.e eVar = null;
                while (abstractC1040q != null) {
                    if ((abstractC1040q.f11808f & PegdownExtensions.RELAXEDHRULES) != 0 && (abstractC1040q instanceof AbstractC0156k)) {
                        int i6 = 0;
                        for (AbstractC1040q abstractC1040q2 = ((AbstractC0156k) abstractC1040q).f1964s; abstractC1040q2 != null; abstractC1040q2 = abstractC1040q2.f11811i) {
                            if ((abstractC1040q2.f11808f & PegdownExtensions.RELAXEDHRULES) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    abstractC1040q = abstractC1040q2;
                                } else {
                                    if (eVar == null) {
                                        eVar = new V.e(new AbstractC1040q[16]);
                                    }
                                    if (abstractC1040q != null) {
                                        eVar.b(abstractC1040q);
                                        abstractC1040q = null;
                                    }
                                    eVar.b(abstractC1040q2);
                                }
                            }
                        }
                        if (i6 == 1) {
                        }
                    }
                    abstractC1040q = AbstractC0157l.e(eVar);
                }
            }
            if (Y03 == W02) {
                return;
            }
        }
    }

    @Override // F0.InterfaceC0134w
    public final void k(float[] fArr) {
        r0 a = M.a(this.f1954r);
        i0 q12 = q1(AbstractC0137z.h(this));
        t1(q12, fArr);
        if (a instanceof InterfaceC0034j) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) ((InterfaceC0034j) a)).u(fArr);
            return;
        }
        long r5 = q12.r(0L);
        if ((9223372034707292159L & r5) != 9205357640488583168L) {
            C1382D.f(fArr, Float.intBitsToFloat((int) (r5 >> 32)), Float.intBitsToFloat((int) (r5 & 4294967295L)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r4v10, types: [V.e] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [V.e] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r8v19 */
    public final void k1(AbstractC1040q abstractC1040q, C0151g0 c0151g0, long j3, C0163s c0163s, int i6, boolean z5, float f6, boolean z6) {
        AbstractC1040q e6;
        if (abstractC1040q == null) {
            c1(c0151g0, j3, c0163s, i6, z5);
            return;
        }
        int i7 = i6;
        boolean z7 = z5;
        if (i7 == 3 || i7 == 4) {
            AbstractC0156k abstractC0156k = abstractC1040q;
            V.e eVar = null;
            while (true) {
                if (abstractC0156k == 0) {
                    break;
                }
                if (abstractC0156k instanceof w0) {
                    long p5 = ((w0) abstractC0156k).p();
                    int i8 = (int) (j3 >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i8);
                    J j4 = this.f1954r;
                    e1.m mVar = j4.f1715D;
                    int i9 = D0.f1691b;
                    long j5 = p5 & Long.MIN_VALUE;
                    e1.m mVar2 = e1.m.f11576c;
                    if (intBitsToFloat >= (-((j5 == 0 || mVar == mVar2) ? C0151g0.a(p5, 0) : C0151g0.a(p5, 2)))) {
                        if (Float.intBitsToFloat(i8) < j0() + ((j5 == 0 || j4.f1715D == mVar2) ? C0151g0.a(p5, 2) : C0151g0.a(p5, 0))) {
                            int i10 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i10) >= (-C0151g0.a(p5, 1))) {
                                if (Float.intBitsToFloat(i10) < C0151g0.a(p5, 3) + i0()) {
                                    C1150D c1150d = c0163s.f1989e;
                                    k.I i11 = c0163s.f1988c;
                                    if (c0163s.f1990f == Y4.l.C(c0163s)) {
                                        int i12 = c0163s.f1990f;
                                        c0163s.b(i12 + 1, i11.f12466b);
                                        c0163s.f1990f++;
                                        i11.a(abstractC1040q);
                                        c1150d.a(AbstractC0157l.a(S.l.f7374V, z7, true));
                                        k1(AbstractC0157l.d(abstractC1040q, c0151g0.b()), c0151g0, j3, c0163s, i7, z7, f6, z6);
                                        c0163s.f1990f = i12;
                                        return;
                                    }
                                    long a = c0163s.a();
                                    int i13 = c0163s.f1990f;
                                    if (!AbstractC0157l.n(a)) {
                                        if (AbstractC0157l.j(a) > S.l.f7374V) {
                                            int i14 = c0163s.f1990f;
                                            c0163s.b(i14 + 1, i11.f12466b);
                                            c0163s.f1990f++;
                                            i11.a(abstractC1040q);
                                            c1150d.a(AbstractC0157l.a(S.l.f7374V, z7, true));
                                            k1(AbstractC0157l.d(abstractC1040q, c0151g0.b()), c0151g0, j3, c0163s, i6, z7, f6, z6);
                                            c0163s.f1990f = i14;
                                            return;
                                        }
                                        return;
                                    }
                                    int C5 = Y4.l.C(c0163s);
                                    c0163s.f1990f = C5;
                                    c0163s.b(C5 + 1, i11.f12466b);
                                    c0163s.f1990f++;
                                    i11.a(abstractC1040q);
                                    c1150d.a(AbstractC0157l.a(S.l.f7374V, z7, true));
                                    k1(AbstractC0157l.d(abstractC1040q, c0151g0.b()), c0151g0, j3, c0163s, i6, z7, f6, z6);
                                    c0163s.f1990f = C5;
                                    if (AbstractC0157l.j(c0163s.a()) < S.l.f7374V) {
                                        c0163s.b(i13 + 1, c0163s.f1990f + 1);
                                    }
                                    c0163s.f1990f = i13;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    int i15 = 16;
                    if ((abstractC0156k.f11808f & 16) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                        AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                        int i16 = 0;
                        e6 = abstractC0156k;
                        eVar = eVar;
                        while (abstractC1040q2 != null) {
                            if ((abstractC1040q2.f11808f & 16) != 0) {
                                i16++;
                                eVar = eVar;
                                if (i16 == 1) {
                                    e6 = abstractC1040q2;
                                } else {
                                    if (eVar == null) {
                                        eVar = new V.e(new AbstractC1040q[i15]);
                                    }
                                    if (e6 != null) {
                                        eVar.b(e6);
                                        e6 = null;
                                    }
                                    eVar.b(abstractC1040q2);
                                }
                            }
                            abstractC1040q2 = abstractC1040q2.f11811i;
                            i15 = 16;
                            e6 = e6;
                            eVar = eVar;
                        }
                        if (i16 == 1) {
                            i7 = i6;
                            z7 = z5;
                            abstractC0156k = e6;
                            eVar = eVar;
                        }
                    }
                    e6 = AbstractC0157l.e(eVar);
                    i7 = i6;
                    z7 = z5;
                    abstractC0156k = e6;
                    eVar = eVar;
                }
            }
        }
        if (z6) {
            a1(abstractC1040q, c0151g0, j3, c0163s, i6, z5, f6);
            return;
        }
        switch (c0151g0.a) {
            case 0:
                AbstractC0156k abstractC0156k2 = abstractC1040q;
                int r42 = 0;
                while (abstractC0156k2 != 0) {
                    if (abstractC0156k2 instanceof w0) {
                        ((w0) abstractC0156k2).R();
                    } else if ((abstractC0156k2.f11808f & 16) != 0 && (abstractC0156k2 instanceof AbstractC0156k)) {
                        AbstractC1040q abstractC1040q3 = abstractC0156k2.f1964s;
                        int i17 = 0;
                        abstractC0156k2 = abstractC0156k2;
                        r42 = r42;
                        while (abstractC1040q3 != null) {
                            if ((abstractC1040q3.f11808f & 16) != 0) {
                                i17++;
                                r42 = r42;
                                if (i17 == 1) {
                                    abstractC0156k2 = abstractC1040q3;
                                } else {
                                    if (r42 == 0) {
                                        r42 = new V.e(new AbstractC1040q[16]);
                                    }
                                    if (abstractC0156k2 != 0) {
                                        r42.b(abstractC0156k2);
                                        abstractC0156k2 = 0;
                                    }
                                    r42.b(abstractC1040q3);
                                }
                            }
                            abstractC1040q3 = abstractC1040q3.f11811i;
                            abstractC0156k2 = abstractC0156k2;
                            r42 = r42;
                        }
                        if (i17 == 1) {
                        }
                    }
                    abstractC0156k2 = AbstractC0157l.e(r42);
                }
                break;
        }
        k1(AbstractC0157l.d(abstractC1040q, c0151g0.b()), c0151g0, j3, c0163s, i6, z5, f6, false);
    }

    @Override // F0.InterfaceC0134w
    public final long l(InterfaceC0134w interfaceC0134w, long j3) {
        if (interfaceC0134w instanceof F0.T) {
            F0.T t5 = (F0.T) interfaceC0134w;
            t5.f1460c.f1805r.f1();
            return t5.l(this, j3 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        i0 q12 = q1(interfaceC0134w);
        q12.f1();
        i0 S02 = S0(q12);
        while (q12 != S02) {
            q0 q0Var = q12.f1952O;
            if (q0Var != null) {
                j3 = ((C0219y0) q0Var).c(j3, false);
            }
            j3 = Y3.C.O(j3, q12.f1940C);
            q12 = q12.f1956t;
            AbstractC1276k.c(q12);
        }
        return M0(S02, j3);
    }

    public abstract void l1(o0.q qVar, r0.b bVar);

    @Override // F0.InterfaceC0134w
    public final long m() {
        return this.f1487f;
    }

    public final void m1(long j3, float f6, l4.c cVar, r0.b bVar) {
        J j4 = this.f1954r;
        if (bVar != null) {
            if (cVar != null) {
                E0.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.f1953P != bVar) {
                this.f1953P = null;
                u1(null, false);
                this.f1953P = bVar;
            }
            if (this.f1952O == null) {
                r0 a = M.a(j4);
                F0.P p5 = this.f1949L;
                if (p5 == null) {
                    F0.P p6 = new F0.P(1, this, new C0153h0(this, 0));
                    this.f1949L = p6;
                    p5 = p6;
                }
                C0153h0 c0153h0 = this.f1950M;
                q0 l3 = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) a).l(p5, c0153h0, bVar);
                C0219y0 c0219y0 = (C0219y0) l3;
                c0219y0.e(this.f1487f);
                c0219y0.d(j3);
                this.f1952O = l3;
                j4.f1725N = true;
                c0153h0.b();
            }
        } else {
            if (this.f1953P != null) {
                this.f1953P = null;
                u1(null, false);
            }
            u1(cVar, false);
        }
        if (!e1.j.c(this.f1940C, j3)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j4)).P(-4.0f);
            this.f1940C = j3;
            j4.f1722K.f1781p.z0();
            q0 q0Var = this.f1952O;
            if (q0Var != null) {
                ((C0219y0) q0Var).d(j3);
            } else {
                i0 i0Var = this.f1956t;
                if (i0Var != null) {
                    i0Var.d1();
                }
            }
            j4.N();
            S.I0(this);
            r0 r0Var = j4.f1747r;
            if (r0Var != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).B(j4);
            }
        }
        this.f1941D = f6;
        if (this == j4.f1721J.f1917d) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j4)).getRectManager().e(j4, false);
        }
        if (this.f1801n) {
            return;
        }
        z0(E0());
    }

    public final void n1(C1352a c1352a, boolean z5, boolean z6) {
        q0 q0Var = this.f1952O;
        if (q0Var != null) {
            if (this.f1958v) {
                if (z6) {
                    long V02 = V0();
                    float intBitsToFloat = Float.intBitsToFloat((int) (V02 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (V02 & 4294967295L)) / 2.0f;
                    long j3 = this.f1487f;
                    c1352a.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j3 >> 32)) + intBitsToFloat, ((int) (j3 & 4294967295L)) + intBitsToFloat2);
                } else if (z5) {
                    long j4 = this.f1487f;
                    c1352a.a(S.l.f7374V, S.l.f7374V, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (c1352a.b()) {
                    return;
                }
            }
            C0219y0 c0219y0 = (C0219y0) q0Var;
            float[] b5 = c0219y0.b();
            if (!c0219y0.f2509v) {
                if (b5 == null) {
                    c1352a.a = S.l.f7374V;
                    c1352a.f13291b = S.l.f7374V;
                    c1352a.f13292c = S.l.f7374V;
                    c1352a.f13293d = S.l.f7374V;
                } else {
                    C1382D.c(b5, c1352a);
                }
            }
        }
        long j5 = this.f1940C;
        float f6 = (int) (j5 >> 32);
        c1352a.a += f6;
        c1352a.f13292c += f6;
        float f7 = (int) (j5 & 4294967295L);
        c1352a.f13291b += f7;
        c1352a.f13293d += f7;
    }

    public final void o1() {
        if (this.f1952O != null) {
            if (this.f1953P != null) {
                this.f1953P = null;
            }
            u1(null, false);
            this.f1954r.W(false);
        }
    }

    @Override // F0.k0
    public abstract void p0(long j3, float f6, r0.b bVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [V.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [V.e] */
    public final void p1(F0.W w5) {
        i0 i0Var;
        F0.W w6 = this.f1938A;
        if (w5 != w6) {
            this.f1938A = w5;
            J j3 = this.f1954r;
            int i6 = 0;
            if (w6 == null || w5.e() != w6.e() || w5.d() != w6.d()) {
                int e6 = w5.e();
                int d6 = w5.d();
                q0 q0Var = this.f1952O;
                if (q0Var != null) {
                    ((C0219y0) q0Var).e((e6 << 32) | (d6 & 4294967295L));
                } else if (j3.I() && (i0Var = this.f1956t) != null) {
                    i0Var.d1();
                }
                s0((d6 & 4294967295L) | (e6 << 32));
                if (this.f1959w != null) {
                    v1(false);
                }
                boolean g3 = j0.g(4);
                AbstractC1040q W02 = W0();
                if (g3 || (W02 = W02.f11810h) != null) {
                    for (AbstractC1040q Y02 = Y0(g3); Y02 != null && (Y02.f11809g & 4) != 0; Y02 = Y02.f11811i) {
                        if ((Y02.f11808f & 4) != 0) {
                            AbstractC0156k abstractC0156k = Y02;
                            int r9 = 0;
                            while (abstractC0156k != 0) {
                                if (abstractC0156k instanceof InterfaceC0160o) {
                                    ((InterfaceC0160o) abstractC0156k).Q();
                                } else if ((abstractC0156k.f11808f & 4) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q = abstractC0156k.f1964s;
                                    int i7 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r9 = r9;
                                    while (abstractC1040q != null) {
                                        if ((abstractC1040q.f11808f & 4) != 0) {
                                            i7++;
                                            r9 = r9;
                                            if (i7 == 1) {
                                                abstractC0156k = abstractC1040q;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC0156k != 0) {
                                                    r9.b(abstractC0156k);
                                                    abstractC0156k = 0;
                                                }
                                                r9.b(abstractC1040q);
                                            }
                                        }
                                        abstractC1040q = abstractC1040q.f11811i;
                                        abstractC0156k = abstractC0156k;
                                        r9 = r9;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC0156k = AbstractC0157l.e(r9);
                            }
                        }
                        if (Y02 == W02) {
                            break;
                        }
                    }
                }
                r0 r0Var = j3.f1747r;
                if (r0Var != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).B(j3);
                }
            }
            k.H h3 = this.f1939B;
            if ((h3 == null || h3.f12464e == 0) && w5.b().isEmpty()) {
                return;
            }
            k.H h6 = this.f1939B;
            Map b5 = w5.b();
            if (h6 != null && h6.f12464e == b5.size()) {
                Object[] objArr = h6.f12461b;
                int[] iArr = h6.f12462c;
                long[] jArr = h6.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i8 = 0;
                loop0: while (true) {
                    long j4 = jArr[i8];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = i6; i10 < i9; i10++) {
                            if ((255 & j4) < 128) {
                                int i11 = (i8 << 3) + i10;
                                Object obj = objArr[i11];
                                int i12 = iArr[i11];
                                Integer num = (Integer) b5.get((AbstractC0107a) obj);
                                if (num == null || num.intValue() != i12) {
                                    break loop0;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i9 != 8) {
                            return;
                        }
                    }
                    if (i8 == length) {
                        return;
                    }
                    i8++;
                    i6 = 0;
                }
            }
            j3.f1722K.f1781p.f1854B.f();
            k.H h7 = this.f1939B;
            if (h7 == null) {
                k.H h8 = k.S.a;
                h7 = new k.H();
                this.f1939B = h7;
            }
            h7.a();
            for (Map.Entry entry : w5.b().entrySet()) {
                h7.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // F0.InterfaceC0134w
    public final long r(long j3) {
        if (!W0().f11819q) {
            E0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(this.f1954r)).v(U(j3));
    }

    public final C1354c r1() {
        if (W0().f11819q) {
            InterfaceC0134w h3 = AbstractC0137z.h(this);
            C1352a c1352a = this.f1942E;
            if (c1352a == null) {
                c1352a = new C1352a();
                this.f1942E = c1352a;
            }
            long N02 = N0(V0());
            int i6 = (int) (N02 >> 32);
            c1352a.a = -Float.intBitsToFloat(i6);
            int i7 = (int) (N02 & 4294967295L);
            c1352a.f13291b = -Float.intBitsToFloat(i7);
            c1352a.f13292c = Float.intBitsToFloat(i6) + j0();
            c1352a.f13293d = Float.intBitsToFloat(i7) + i0();
            i0 i0Var = this;
            while (i0Var != h3) {
                i0Var.n1(c1352a, false, true);
                if (!c1352a.b()) {
                    i0Var = i0Var.f1956t;
                    AbstractC1276k.c(i0Var);
                }
            }
            return new C1354c(c1352a.a, c1352a.f13291b, c1352a.f13292c, c1352a.f13293d);
        }
        return C1354c.f13294e;
    }

    public final void s1(i0 i0Var, float[] fArr) {
        float[] a;
        if (AbstractC1276k.b(i0Var, this)) {
            return;
        }
        i0 i0Var2 = this.f1956t;
        AbstractC1276k.c(i0Var2);
        i0Var2.s1(i0Var, fArr);
        if (!e1.j.c(this.f1940C, 0L)) {
            float[] fArr2 = f1935S;
            C1382D.d(fArr2);
            long j3 = this.f1940C;
            C1382D.f(fArr2, -((int) (j3 >> 32)), -((int) (j3 & 4294967295L)));
            C1382D.e(fArr, fArr2);
        }
        q0 q0Var = this.f1952O;
        if (q0Var == null || (a = ((C0219y0) q0Var).a()) == null) {
            return;
        }
        C1382D.e(fArr, a);
    }

    public final void t1(i0 i0Var, float[] fArr) {
        i0 i0Var2 = this;
        while (!i0Var2.equals(i0Var)) {
            q0 q0Var = i0Var2.f1952O;
            if (q0Var != null) {
                C1382D.e(fArr, ((C0219y0) q0Var).b());
            }
            if (!e1.j.c(i0Var2.f1940C, 0L)) {
                float[] fArr2 = f1935S;
                C1382D.d(fArr2);
                C1382D.f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                C1382D.e(fArr, fArr2);
            }
            i0Var2 = i0Var2.f1956t;
            AbstractC1276k.c(i0Var2);
        }
    }

    @Override // H0.s0
    public final boolean u() {
        return (this.f1952O == null || this.f1957u || !this.f1954r.H()) ? false : true;
    }

    public final void u1(l4.c cVar, boolean z5) {
        r0 r0Var;
        V.e eVar;
        Reference poll;
        if (cVar != null && this.f1953P != null) {
            E0.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        J j3 = this.f1954r;
        boolean z6 = (!z5 && this.f1959w == cVar && AbstractC1276k.b(this.f1960x, j3.f1714C) && this.f1961y == j3.f1715D) ? false : true;
        this.f1960x = j3.f1714C;
        this.f1961y = j3.f1715D;
        boolean H3 = j3.H();
        C0153h0 c0153h0 = this.f1950M;
        if (H3 && cVar != null) {
            this.f1959w = cVar;
            if (this.f1952O != null) {
                if (z6) {
                    v1(true);
                    return;
                }
                return;
            }
            r0 a = M.a(j3);
            F0.P p5 = this.f1949L;
            if (p5 == null) {
                F0.P p6 = new F0.P(1, this, new C0153h0(this, 0));
                this.f1949L = p6;
                p5 = p6;
            }
            q0 l3 = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) a).l(p5, c0153h0, null);
            C0219y0 c0219y0 = (C0219y0) l3;
            c0219y0.e(this.f1487f);
            c0219y0.d(this.f1940C);
            this.f1952O = l3;
            v1(true);
            j3.f1725N = true;
            c0153h0.b();
            return;
        }
        this.f1959w = null;
        q0 q0Var = this.f1952O;
        if (q0Var != null) {
            C0219y0 c0219y02 = (C0219y0) q0Var;
            ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = c0219y02.f2493f;
            if (!o0.y.r(c0219y02.b())) {
                j3.N();
            }
            c0219y02.f2494g = null;
            c0219y02.f2495h = null;
            c0219y02.f2497j = true;
            if (c0219y02.f2500m) {
                c0219y02.f2500m = false;
                viewTreeObserverOnGlobalLayoutListenerC0216x.z(c0219y02, false);
            }
            o0.w wVar = c0219y02.f2492e;
            if (wVar != null) {
                wVar.a(c0219y02.f2491c);
                M.q qVar = viewTreeObserverOnGlobalLayoutListenerC0216x.f2488z0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) qVar.f3180f;
                    eVar = (V.e) qVar.f3179e;
                    poll = referenceQueue.poll();
                    if (poll != null) {
                        eVar.j(poll);
                    }
                } while (poll != null);
                eVar.b(new WeakReference(c0219y02, (ReferenceQueue) qVar.f3180f));
                viewTreeObserverOnGlobalLayoutListenerC0216x.f2418G.j(c0219y02);
            }
            j3.f1725N = true;
            c0153h0.b();
            if (W0().f11819q && j3.I() && (r0Var = j3.f1747r) != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).B(j3);
            }
        }
        this.f1952O = null;
        this.f1951N = false;
    }

    public final void v1(boolean z5) {
        char c6;
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x;
        boolean z6;
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x2;
        r0 r0Var;
        InterfaceC1193a interfaceC1193a;
        int i6;
        InterfaceC1193a interfaceC1193a2;
        if (this.f1953P != null) {
            return;
        }
        q0 q0Var = this.f1952O;
        if (q0Var == null) {
            if (this.f1959w == null) {
                return;
            }
            E0.a.b("null layer with a non-null layerBlock");
            return;
        }
        l4.c cVar = this.f1959w;
        if (cVar == null) {
            throw B3.e.f("updateLayerParameters requires a non-null layerBlock");
        }
        C1387I c1387i = f1933Q;
        c1387i.b();
        J j3 = this.f1954r;
        c1387i.f13429t = j3.f1714C;
        c1387i.f13430u = j3.f1715D;
        c1387i.f13428s = AbstractC1410a.S(this.f1487f);
        ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j3)).getSnapshotObserver().a.d(this, C0144d.f1892i, new C0028d(2, cVar, this));
        C0168x c0168x = this.f1943F;
        if (c0168x == null) {
            c0168x = new C0168x();
            this.f1943F = c0168x;
        }
        C0168x c0168x2 = f1934R;
        c0168x2.getClass();
        c0168x2.a = c0168x.a;
        c0168x2.f2009b = c0168x.f2009b;
        c0168x2.f2010c = c0168x.f2010c;
        c0168x2.f2011d = c0168x.f2011d;
        c0168x2.f2012e = c0168x.f2012e;
        c0168x2.f2013f = c0168x.f2013f;
        c0168x2.f2014g = c0168x.f2014g;
        float f6 = c1387i.f13414e;
        c0168x.a = f6;
        c0168x.f2009b = c1387i.f13415f;
        c0168x.f2010c = c1387i.f13417h;
        c0168x.f2011d = c1387i.f13418i;
        c0168x.f2012e = c1387i.f13422m;
        c0168x.f2013f = c1387i.f13423n;
        long j4 = c1387i.f13424o;
        c0168x.f2014g = j4;
        C0219y0 c0219y0 = (C0219y0) q0Var;
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x3 = c0219y0.f2493f;
        int i7 = c1387i.f13413c | c0219y0.f2504q;
        c0219y0.f2502o = c1387i.f13430u;
        c0219y0.f2501n = c1387i.f13429t;
        int i8 = i7 & 4096;
        if (i8 != 0) {
            c0219y0.f2505r = j4;
        }
        if ((i7 & 1) != 0) {
            r0.d dVar = c0219y0.f2491c.a;
            if (dVar.b() != f6) {
                dVar.A(f6);
            }
        }
        if ((i7 & 2) != 0) {
            r0.b bVar = c0219y0.f2491c;
            float f7 = c1387i.f13415f;
            r0.d dVar2 = bVar.a;
            if (dVar2.N() != f7) {
                dVar2.l(f7);
            }
        }
        if ((i7 & 4) != 0) {
            c0219y0.f2491c.f(c1387i.f13416g);
        }
        if ((i7 & 8) != 0) {
            r0.b bVar2 = c0219y0.f2491c;
            float f8 = c1387i.f13417h;
            r0.d dVar3 = bVar2.a;
            if (dVar3.C() != f8) {
                dVar3.G(f8);
            }
        }
        if ((i7 & 16) != 0) {
            r0.b bVar3 = c0219y0.f2491c;
            float f9 = c1387i.f13418i;
            r0.d dVar4 = bVar3.a;
            if (dVar4.v() != f9) {
                dVar4.f(f9);
            }
        }
        if ((i7 & 32) != 0) {
            r0.b bVar4 = c0219y0.f2491c;
            float f10 = c1387i.f13419j;
            r0.d dVar5 = bVar4.a;
            if (dVar5.L() != f10) {
                dVar5.c(f10);
                bVar4.f14539g = true;
                bVar4.a();
            }
            if (c1387i.f13419j > S.l.f7374V && !c0219y0.f2510w && (interfaceC1193a2 = c0219y0.f2495h) != null) {
                interfaceC1193a2.b();
            }
        }
        if ((i7 & 64) != 0) {
            r0.b bVar5 = c0219y0.f2491c;
            long j5 = c1387i.f13420k;
            r0.d dVar6 = bVar5.a;
            if (!o0.s.d(j5, dVar6.s())) {
                dVar6.y(j5);
            }
        }
        if ((i7 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0) {
            r0.b bVar6 = c0219y0.f2491c;
            long j6 = c1387i.f13421l;
            r0.d dVar7 = bVar6.a;
            if (!o0.s.d(j6, dVar7.x())) {
                dVar7.H(j6);
            }
        }
        if ((i7 & PegdownExtensions.ANCHORLINKS) != 0) {
            r0.b bVar7 = c0219y0.f2491c;
            float f11 = c1387i.f13422m;
            r0.d dVar8 = bVar7.a;
            if (dVar8.q() != f11) {
                dVar8.e(f11);
            }
        }
        if ((i7 & PegdownExtensions.WIKILINKS) != 0) {
            r0.d dVar9 = c0219y0.f2491c.a;
            if (dVar9.E() != S.l.f7374V) {
                dVar9.t();
            }
        }
        if ((i7 & PegdownExtensions.STRIKETHROUGH) != 0) {
            r0.d dVar10 = c0219y0.f2491c.a;
            if (dVar10.o() != S.l.f7374V) {
                dVar10.w();
            }
        }
        if ((i7 & 2048) != 0) {
            r0.b bVar8 = c0219y0.f2491c;
            float f12 = c1387i.f13423n;
            r0.d dVar11 = bVar8.a;
            if (dVar11.B() != f12) {
                dVar11.K(f12);
            }
        }
        if (i8 != 0) {
            long j7 = c0219y0.f2505r;
            c6 = SequenceUtils.SPC;
            if (o0.O.a(j7, o0.O.f13454b)) {
                r0.b bVar9 = c0219y0.f2491c;
                if (!C1353b.c(bVar9.f14554v, 9205357640488583168L)) {
                    bVar9.f14554v = 9205357640488583168L;
                    bVar9.a.r(9205357640488583168L);
                }
            } else {
                r0.b bVar10 = c0219y0.f2491c;
                long floatToRawIntBits = (Float.floatToRawIntBits(o0.O.b(c0219y0.f2505r) * ((int) (c0219y0.f2496i >> 32))) << 32) | (Float.floatToRawIntBits(o0.O.c(c0219y0.f2505r) * ((int) (c0219y0.f2496i & 4294967295L))) & 4294967295L);
                if (!C1353b.c(bVar10.f14554v, floatToRawIntBits)) {
                    bVar10.f14554v = floatToRawIntBits;
                    bVar10.a.r(floatToRawIntBits);
                }
            }
        } else {
            c6 = SequenceUtils.SPC;
        }
        if ((i7 & 16384) != 0) {
            r0.b bVar11 = c0219y0.f2491c;
            boolean z7 = c1387i.f13426q;
            if (bVar11.f14555w != z7) {
                bVar11.f14555w = z7;
                bVar11.f14539g = true;
                bVar11.a();
            }
        }
        if ((131072 & i7) != 0) {
            r0.b bVar12 = c0219y0.f2491c;
            C1403n c1403n = c1387i.f13431v;
            r0.d dVar12 = bVar12.a;
            if (!AbstractC1276k.b(dVar12.d(), c1403n)) {
                dVar12.J(c1403n);
            }
        }
        if ((262144 & i7) != 0) {
            r0.d dVar13 = c0219y0.f2491c.a;
            if (!AbstractC1276k.b(dVar13.k(), null)) {
                dVar13.z();
            }
        }
        if ((524288 & i7) != 0) {
            r0.b bVar13 = c0219y0.f2491c;
            int i9 = c1387i.f13432w;
            r0.d dVar14 = bVar13.a;
            if (dVar14.O() != i9) {
                dVar14.h(i9);
            }
        }
        if ((32768 & i7) != 0) {
            r0.b bVar14 = c0219y0.f2491c;
            int i10 = c1387i.f13427r;
            if (i10 == 0) {
                i6 = 0;
            } else if (i10 == 1) {
                i6 = 1;
            } else {
                i6 = 2;
                if (i10 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            r0.d dVar15 = bVar14.a;
            if (dVar15.j() != i6) {
                dVar15.F(i6);
            }
        }
        if ((i7 & 7963) != 0) {
            c0219y0.f2507t = true;
            c0219y0.f2508u = true;
        }
        if (AbstractC1276k.b(c0219y0.f2506s, c1387i.f13433x)) {
            viewTreeObserverOnGlobalLayoutListenerC0216x = viewTreeObserverOnGlobalLayoutListenerC0216x3;
            z6 = false;
        } else {
            o0.y yVar = c1387i.f13433x;
            c0219y0.f2506s = yVar;
            if (yVar == null) {
                viewTreeObserverOnGlobalLayoutListenerC0216x = viewTreeObserverOnGlobalLayoutListenerC0216x3;
            } else {
                r0.b bVar15 = c0219y0.f2491c;
                if (yVar instanceof C1384F) {
                    C1354c c1354c = ((C1384F) yVar).f13410f;
                    float f13 = c1354c.a;
                    float f14 = c1354c.f13295b;
                    viewTreeObserverOnGlobalLayoutListenerC0216x = viewTreeObserverOnGlobalLayoutListenerC0216x3;
                    bVar15.g((Float.floatToRawIntBits(f13) << c6) | (Float.floatToRawIntBits(f14) & 4294967295L), (Float.floatToRawIntBits(c1354c.f13296c - f13) << c6) | (Float.floatToRawIntBits(c1354c.f13297d - f14) & 4294967295L), S.l.f7374V);
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC0216x = viewTreeObserverOnGlobalLayoutListenerC0216x3;
                    if (yVar instanceof C1383E) {
                        C1397h c1397h = ((C1383E) yVar).f13409f;
                        bVar15.f14543k = null;
                        bVar15.f14541i = 9205357640488583168L;
                        bVar15.f14540h = 0L;
                        bVar15.f14542j = S.l.f7374V;
                        bVar15.f14539g = true;
                        bVar15.f14546n = false;
                        bVar15.f14544l = c1397h;
                        bVar15.a();
                    } else {
                        if (!(yVar instanceof C1385G)) {
                            throw new RuntimeException();
                        }
                        C1385G c1385g = (C1385G) yVar;
                        C1397h c1397h2 = c1385g.f13412g;
                        if (c1397h2 != null) {
                            bVar15.f14543k = null;
                            bVar15.f14541i = 9205357640488583168L;
                            bVar15.f14540h = 0L;
                            bVar15.f14542j = S.l.f7374V;
                            bVar15.f14539g = true;
                            bVar15.f14546n = false;
                            bVar15.f14544l = c1397h2;
                            bVar15.a();
                        } else {
                            bVar15.g((Float.floatToRawIntBits(r8.a) << c6) | (Float.floatToRawIntBits(r8.f13298b) & 4294967295L), (Float.floatToRawIntBits(r8.b()) << c6) | (Float.floatToRawIntBits(r8.a()) & 4294967295L), Float.intBitsToFloat((int) (c1385g.f13411f.f13304h >> c6)));
                        }
                    }
                }
                if ((yVar instanceof C1383E) && Build.VERSION.SDK_INT < 33 && (interfaceC1193a = c0219y0.f2495h) != null) {
                    interfaceC1193a.b();
                }
            }
            z6 = true;
        }
        c0219y0.f2504q = c1387i.f13413c;
        if (i7 != 0 || z6) {
            ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0216x.getParent();
            if (parent != null) {
                viewTreeObserverOnGlobalLayoutListenerC0216x2 = viewTreeObserverOnGlobalLayoutListenerC0216x;
                parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0216x2, viewTreeObserverOnGlobalLayoutListenerC0216x2);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC0216x2 = viewTreeObserverOnGlobalLayoutListenerC0216x;
            }
            if (viewTreeObserverOnGlobalLayoutListenerC0216x2.f2465o) {
                viewTreeObserverOnGlobalLayoutListenerC0216x2.P(S.l.f7374V);
            }
        }
        boolean z8 = this.f1958v;
        this.f1958v = c1387i.f13426q;
        this.f1962z = c1387i.f13416g;
        boolean z9 = c0168x2.a == c0168x.a && c0168x2.f2009b == c0168x.f2009b && c0168x2.f2010c == c0168x.f2010c && c0168x2.f2011d == c0168x.f2011d && c0168x2.f2012e == c0168x.f2012e && c0168x2.f2013f == c0168x.f2013f && o0.O.a(c0168x2.f2014g, c0168x.f2014g);
        if (z5 && ((!z9 || z8 != this.f1958v) && (r0Var = j3.f1747r) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).B(j3);
        }
        if (z9) {
            return;
        }
        N n3 = j3.f1722K;
        if (n3.f1777l > 0) {
            if (n3.f1776k || n3.f1775j) {
                j3.W(false);
            }
            n3.f1781p.z0();
        }
        j3.N();
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x4 = (ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j3);
        Q0.b rectManager = viewTreeObserverOnGlobalLayoutListenerC0216x4.getRectManager();
        if (this == j3.f1721J.f1917d) {
            rectManager.e(j3, false);
        } else {
            rectManager.getClass();
            if (j3.I()) {
                long f15 = Q0.b.f(j3);
                if (e1.j.c(f15, 9223372034707292159L)) {
                    rectManager.c(j3);
                } else {
                    j3.f1738i = f15;
                    j3.f1739j = false;
                    V.e z10 = j3.z();
                    Object[] objArr = z10.f8759c;
                    int i11 = z10.f8761f;
                    for (int i12 = 0; i12 < i11; i12++) {
                        rectManager.e((J) objArr[i12], false);
                    }
                    rectManager.d(j3);
                }
            }
        }
        if (j3.f1731T > 0) {
            M.q qVar = viewTreeObserverOnGlobalLayoutListenerC0216x4.f2440a0.f1846e;
            qVar.getClass();
            if (j3.f1731T > 0) {
                ((V.e) qVar.f3179e).b(j3);
                j3.f1730S = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC0216x4.I(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w1(long r26) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.i0.w1(long):boolean");
    }

    @Override // F0.InterfaceC0134w
    public final long z(long j3) {
        if (!W0().f11819q) {
            E0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC0134w h3 = AbstractC0137z.h(this);
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = (ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(this.f1954r);
        viewTreeObserverOnGlobalLayoutListenerC0216x.F();
        return l(h3, C1353b.e(C1382D.b(j3, viewTreeObserverOnGlobalLayoutListenerC0216x.f2448f0), h3.U(0L)));
    }
}
