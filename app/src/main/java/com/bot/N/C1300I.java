package n;

import T.C0602e;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;

/* renamed from: n.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300I {
    public final V.e a = new V.e(new C1297F[16]);

    /* renamed from: b, reason: collision with root package name */
    public final C0607g0 f13005b = T.r.A(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public long f13006c = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final C0607g0 f13007d = T.r.A(Boolean.TRUE);

    public final void a(int i6, C0626q c0626q) {
        c0626q.d0(-318043801);
        int i7 = (c0626q.h(this) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = T.r.A(null);
                c0626q.m0(P5);
            }
            T.X x5 = (T.X) P5;
            if (((Boolean) this.f13007d.getValue()).booleanValue() || ((Boolean) this.f13005b.getValue()).booleanValue()) {
                c0626q.b0(-144841960);
                boolean h3 = c0626q.h(this);
                Object P6 = c0626q.P();
                if (h3 || P6 == c0602e) {
                    P6 = new C1299H(x5, this, null);
                    c0626q.m0(P6);
                }
                T.r.f(c0626q, this, (l4.e) P6);
            } else {
                c0626q.b0(-151918981);
            }
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new B4.D(i6, 27, this);
        }
    }
}
