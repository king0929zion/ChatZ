package v;

import T.C0616l;
import T.C0626q;
import h0.C1026c;
import h0.C1031h;
import m4.AbstractC1276k;

/* renamed from: v.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1812s {
    public static final C1813t a = new C1813t(AbstractC1799h.f15305c, C1026c.f11798p);

    public static final C1813t a(InterfaceC1797g interfaceC1797g, C1031h c1031h, C0626q c0626q, int i6) {
        if (AbstractC1276k.b(interfaceC1797g, AbstractC1799h.f15305c) && c1031h.equals(C1026c.f11798p)) {
            c0626q.b0(-1446604504);
            c0626q.p(false);
            return a;
        }
        c0626q.b0(-1446550657);
        boolean z5 = true;
        boolean z6 = (((i6 & 14) ^ 6) > 4 && c0626q.f(interfaceC1797g)) || (i6 & 6) == 4;
        if ((((i6 & 112) ^ 48) <= 32 || !c0626q.f(c1031h)) && (i6 & 48) != 32) {
            z5 = false;
        }
        boolean z7 = z6 | z5;
        Object P5 = c0626q.P();
        if (z7 || P5 == C0616l.a) {
            P5 = new C1813t(interfaceC1797g, c1031h);
            c0626q.m0(P5);
        }
        C1813t c1813t = (C1813t) P5;
        c0626q.p(false);
        return c1813t;
    }
}
