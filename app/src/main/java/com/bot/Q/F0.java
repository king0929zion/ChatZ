package Q;

import T.C0626q;

/* loaded from: classes.dex */
public abstract class F0 {
    public static final float a = S.i.a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5232b = S.o.f7411b;

    /* renamed from: c, reason: collision with root package name */
    public static final v.k0 f5233c;

    static {
        float f6 = K0.f5327c;
        float f7 = 0;
        f5233c = new v.k0(f6, f7, f6, f7);
    }

    public static G0 a(long j3, C0626q c0626q) {
        long j4;
        long j5 = o0.s.f13481h;
        N n3 = (N) c0626q.j(O.a);
        G0 g02 = n3.f5410d0;
        if (g02 == null) {
            j4 = j5;
            G0 g03 = new G0(O.c(n3, S.n.f7408g), O.c(n3, S.n.f7409h), O.c(n3, S.n.f7410i), o0.s.c(S.n.f7403b, O.c(n3, S.n.a)), o0.s.c(S.n.f7405d, O.c(n3, S.n.f7404c)), o0.s.c(S.n.f7407f, O.c(n3, S.n.f7406e)));
            n3.f5410d0 = g03;
            g02 = g03;
        } else {
            j4 = j5;
        }
        return new G0(j3 != 16 ? j3 : g02.a, j4 != 16 ? j4 : g02.f5253b, j4 != 16 ? j4 : g02.f5254c, j4 != 16 ? j4 : g02.f5255d, j4 != 16 ? j4 : g02.f5256e, j4 != 16 ? j4 : g02.f5257f);
    }
}
