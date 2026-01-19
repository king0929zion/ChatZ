package v;

import T.C0616l;
import T.C0626q;
import h0.C1026c;
import h0.C1032i;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class o0 {
    public static final p0 a = new p0(AbstractC1799h.a, C1026c.f11795m);

    public static final p0 a(InterfaceC1793e interfaceC1793e, C1032i c1032i, C0626q c0626q, int i6) {
        if (AbstractC1276k.b(interfaceC1793e, AbstractC1799h.a) && AbstractC1276k.b(c1032i, C1026c.f11795m)) {
            c0626q.b0(-1073830487);
            c0626q.p(false);
            return a;
        }
        c0626q.b0(-1073779616);
        boolean z5 = true;
        boolean z6 = (((i6 & 14) ^ 6) > 4 && c0626q.f(interfaceC1793e)) || (i6 & 6) == 4;
        if ((((i6 & 112) ^ 48) <= 32 || !c0626q.f(c1032i)) && (i6 & 48) != 32) {
            z5 = false;
        }
        boolean z7 = z6 | z5;
        Object P5 = c0626q.P();
        if (z7 || P5 == C0616l.a) {
            P5 = new p0(interfaceC1793e, c1032i);
            c0626q.m0(P5);
        }
        p0 p0Var = (p0) P5;
        c0626q.p(false);
        return p0Var;
    }
}
