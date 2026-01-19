package Q;

import T.C0626q;
import T.C0627q0;
import b0.AbstractC0874g;
import i1.AbstractC1087g;
import i1.C1102v;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class W {
    public static final W a = new Object();

    public final void a(B0.H h3, C0626q c0626q, int i6) {
        C0626q c0626q2;
        c0626q.d0(1565826668);
        int i7 = (c0626q.f(h3) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            c0626q2 = c0626q;
            AbstractC1087g.c((InterfaceC1193a) h3.f391c, (C1102v) h3.f393f, AbstractC0874g.c(1163527043, new V(h3, 0), c0626q), c0626q2, 384, 0);
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new I.m(i6, 8, this, h3);
        }
    }
}
