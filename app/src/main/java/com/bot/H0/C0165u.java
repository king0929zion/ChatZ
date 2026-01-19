package H0;

import F0.AbstractC0107a;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import h0.AbstractC1040q;

/* renamed from: H0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165u extends i0 {

    /* renamed from: X, reason: collision with root package name */
    public static final L1.d f1998X;

    /* renamed from: V, reason: collision with root package name */
    public final C0 f1999V;

    /* renamed from: W, reason: collision with root package name */
    public C0164t f2000W;

    static {
        L1.d g3 = o0.y.g();
        g3.e(o0.s.f13478e);
        g3.k(1.0f);
        g3.l(1);
        f1998X = g3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, H0.C0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [H0.T] */
    public C0165u(J j3) {
        super(j3);
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f11809g = 0;
        this.f1999V = abstractC1040q;
        abstractC1040q.f11813k = this;
        this.f2000W = j3.f1741l != null ? new T(this) : null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [H0.T, H0.t] */
    @Override // H0.i0
    public final void R0() {
        if (this.f2000W == null) {
            this.f2000W = new T(this);
        }
    }

    @Override // H0.i0
    public final T U0() {
        return this.f2000W;
    }

    @Override // H0.i0
    public final AbstractC1040q W0() {
        return this.f1999V;
    }

    @Override // F0.U
    public final int a0(int i6) {
        M.q t5 = this.f1954r.t();
        F0.V p5 = t5.p();
        J j3 = (J) t5.f3179e;
        return p5.d(j3.f1721J.f1917d, j3.m(), i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // H0.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(H0.C0151g0 r19, long r20, H0.C0163s r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C0165u.c1(H0.g0, long, H0.s, int, boolean):void");
    }

    @Override // F0.U
    public final int d(int i6) {
        M.q t5 = this.f1954r.t();
        F0.V p5 = t5.p();
        J j3 = (J) t5.f3179e;
        return p5.a(j3.f1721J.f1917d, j3.m(), i6);
    }

    @Override // H0.i0
    public final void l1(o0.q qVar, r0.b bVar) {
        J j3 = this.f1954r;
        r0 a = M.a(j3);
        V.e y5 = j3.y();
        Object[] objArr = y5.f8759c;
        int i6 = y5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j4 = (J) objArr[i7];
            if (j4.I()) {
                j4.i(qVar, bVar);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC0216x) a).getShowLayoutBounds()) {
            long j5 = this.f1487f;
            qVar.r(0.5f, 0.5f, ((int) (j5 >> 32)) - 0.5f, ((int) (j5 & 4294967295L)) - 0.5f, f1998X);
        }
    }

    @Override // F0.k0
    public final void m0(long j3, float f6, l4.c cVar) {
        m1(j3, f6, cVar, null);
        if (this.f1800m) {
            return;
        }
        this.f1954r.f1722K.f1781p.B0();
    }

    @Override // F0.U
    public final int o(int i6) {
        M.q t5 = this.f1954r.t();
        F0.V p5 = t5.p();
        J j3 = (J) t5.f3179e;
        return p5.h(j3.f1721J.f1917d, j3.m(), i6);
    }

    @Override // H0.i0, F0.k0
    public final void p0(long j3, float f6, r0.b bVar) {
        m1(j3, f6, null, bVar);
        if (this.f1800m) {
            return;
        }
        this.f1954r.f1722K.f1781p.B0();
    }

    @Override // F0.U
    public final int q(int i6) {
        M.q t5 = this.f1954r.t();
        F0.V p5 = t5.p();
        J j3 = (J) t5.f3179e;
        return p5.j(j3.f1721J.f1917d, j3.m(), i6);
    }

    @Override // F0.U
    public final F0.k0 w(long j3) {
        t0(j3);
        J j4 = this.f1954r;
        V.e z5 = j4.z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            ((J) objArr[i7]).f1722K.f1781p.f1875o = H.f1707f;
        }
        p1(j4.f1712A.e(this, j4.m(), j3));
        g1();
        return this;
    }

    @Override // H0.S
    public final int x0(AbstractC0107a abstractC0107a) {
        C0164t c0164t = this.f2000W;
        if (c0164t != null) {
            return c0164t.x0(abstractC0107a);
        }
        C0139a0 c0139a0 = this.f1954r.f1722K.f1781p;
        K k3 = c0139a0.f1854B;
        if (!c0139a0.f1876p) {
            if (c0139a0.f1869i.f1769d == F.f1696c) {
                k3.f1760f = true;
                if (k3.f1756b) {
                    c0139a0.f1886z = true;
                    c0139a0.f1853A = true;
                }
            } else {
                k3.f1761g = true;
            }
        }
        C0165u g3 = c0139a0.g();
        boolean z5 = g3.f1801n;
        g3.f1801n = true;
        c0139a0.N();
        g3.f1801n = z5;
        Integer num = (Integer) k3.f1763i.get(abstractC0107a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
