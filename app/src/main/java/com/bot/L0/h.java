package l0;

import F0.InterfaceC0121i;
import h0.C1026c;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;
import o0.C1400k;
import o0.L;
import o0.y;
import o0.z;
import t0.AbstractC1688b;

/* loaded from: classes.dex */
public abstract class h {
    public static final InterfaceC1041r a(InterfaceC1041r interfaceC1041r, float f6) {
        return f6 == 1.0f ? interfaceC1041r : y.q(interfaceC1041r, S.l.f7374V, S.l.f7374V, f6, S.l.f7374V, S.l.f7374V, S.l.f7374V, null, 520187);
    }

    public static InterfaceC1041r b(InterfaceC1041r interfaceC1041r, float f6) {
        float f7 = 0;
        if (e1.f.b(f6, f7) > 0) {
            e1.f.b(f6, f7);
        }
        return y.o(interfaceC1041r, new C1181a(f6, f6, 0, true));
    }

    public static final InterfaceC1041r c(InterfaceC1041r interfaceC1041r, L l3) {
        return y.q(interfaceC1041r, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, l3, 518143);
    }

    public static final InterfaceC1041r d(InterfaceC1041r interfaceC1041r) {
        return y.q(interfaceC1041r, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, null, 520191);
    }

    public static final InterfaceC1041r e(InterfaceC1041r interfaceC1041r, l4.c cVar) {
        return interfaceC1041r.c(new f(cVar));
    }

    public static final InterfaceC1041r f(InterfaceC1041r interfaceC1041r, l4.c cVar) {
        return interfaceC1041r.c(new i(cVar));
    }

    public static final InterfaceC1041r g(InterfaceC1041r interfaceC1041r, l4.c cVar) {
        return interfaceC1041r.c(new j(cVar));
    }

    public static InterfaceC1041r h(InterfaceC1041r interfaceC1041r, AbstractC1688b abstractC1688b, InterfaceC1028e interfaceC1028e, InterfaceC0121i interfaceC0121i, float f6, C1400k c1400k, int i6) {
        if ((i6 & 4) != 0) {
            interfaceC1028e = C1026c.f11790h;
        }
        InterfaceC1028e interfaceC1028e2 = interfaceC1028e;
        if ((i6 & 16) != 0) {
            f6 = 1.0f;
        }
        return interfaceC1041r.c(new m(abstractC1688b, interfaceC1028e2, interfaceC0121i, f6, c1400k));
    }

    public static final InterfaceC1041r i(InterfaceC1041r interfaceC1041r, float f6) {
        return f6 == S.l.f7374V ? interfaceC1041r : y.q(interfaceC1041r, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, f6, null, 524031);
    }

    public static final InterfaceC1041r j(InterfaceC1041r interfaceC1041r, float f6, float f7) {
        return (f6 == 1.0f && f7 == 1.0f) ? interfaceC1041r : y.q(interfaceC1041r, f6, f7, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, null, 524284);
    }

    public static InterfaceC1041r k(InterfaceC1041r interfaceC1041r, float f6, L l3, int i6) {
        boolean z5;
        if ((i6 & 4) != 0) {
            z5 = e1.f.b(f6, (float) 0) > 0;
        } else {
            z5 = false;
        }
        long j3 = z.a;
        return (e1.f.b(f6, (float) 0) > 0 || z5) ? interfaceC1041r.c(new o(f6, l3, z5, j3, j3)) : interfaceC1041r;
    }
}
