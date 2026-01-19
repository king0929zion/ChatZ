package p;

import T.C0616l;
import T.C0626q;
import f0.C0990m;

/* loaded from: classes.dex */
public abstract class F0 {
    public static final T.B a = new T.B(new C0990m(28));

    public static final C1459u a(C0626q c0626q) {
        c0626q.b0(282942128);
        C1460v c1460v = (C1460v) c0626q.j(a);
        if (c1460v == null) {
            c0626q.p(false);
            return null;
        }
        boolean f6 = c0626q.f(c1460v);
        Object P5 = c0626q.P();
        if (f6 || P5 == C0616l.a) {
            Object c1459u = new C1459u(c1460v.a, c1460v.f13809b, c1460v.f13810c, c1460v.f13811d);
            c0626q.m0(c1459u);
            P5 = c1459u;
        }
        C1459u c1459u2 = (C1459u) P5;
        c0626q.p(false);
        return c1459u2;
    }
}
