package m;

import T.C0616l;
import T.C0626q;
import T.d1;
import n.AbstractC1318d;
import n.AbstractC1324g;
import n.E0;
import n.InterfaceC1351z;

/* renamed from: m.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1218Z {
    static {
        AbstractC1318d.r(S.l.f7374V, S.l.f7374V, null, 7);
    }

    public static final d1 a(long j3, InterfaceC1351z interfaceC1351z, String str, C0626q c0626q, int i6, int i7) {
        if ((i7 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean f6 = c0626q.f(o0.s.g(j3));
        Object P5 = c0626q.P();
        if (f6 || P5 == C0616l.a) {
            E0 e02 = new E0(C1221c.f12774i, new B0.G(o0.s.g(j3), 24));
            c0626q.m0(e02);
            P5 = e02;
        }
        return AbstractC1324g.c(new o0.s(j3), (E0) P5, interfaceC1351z, null, str2, c0626q, (i6 << 6) & 57344, 8);
    }
}
