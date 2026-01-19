package Q;

import T.C0626q;
import T.C0627q0;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.C1038o;
import h0.InterfaceC1041r;
import i1.AbstractC1094n;
import l4.InterfaceC1193a;
import v.InterfaceC1802i0;

/* renamed from: Q.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0438m {
    static {
        T.B b5 = AbstractC1094n.a;
    }

    public static final void a(C0873f c0873f, InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, boolean z5, G0 g02, InterfaceC1802i0 interfaceC1802i0, C0626q c0626q, int i6) {
        InterfaceC1041r interfaceC1041r2;
        boolean z6;
        InterfaceC1802i0 interfaceC1802i02;
        InterfaceC1802i0 interfaceC1802i03;
        InterfaceC1041r interfaceC1041r3;
        boolean z7;
        c0626q.d0(-532959117);
        int i7 = i6 | (c0626q.h(interfaceC1193a) ? 32 : 16) | 224640 | (c0626q.f(g02) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT) | 113246208;
        if (c0626q.S(i7 & 1, (38347923 & i7) != 38347922)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                interfaceC1802i03 = F0.f5233c;
                interfaceC1041r3 = C1038o.a;
                z7 = true;
            } else {
                c0626q.V();
                interfaceC1041r3 = interfaceC1041r;
                z7 = z5;
                interfaceC1802i03 = interfaceC1802i0;
            }
            c0626q.q();
            K0.b(c0873f, interfaceC1193a, interfaceC1041r3, z7, g02, interfaceC1802i03, c0626q, 268435454 & i7);
            interfaceC1041r2 = interfaceC1041r3;
            interfaceC1802i02 = interfaceC1802i03;
            z6 = z7;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            z6 = z5;
            interfaceC1802i02 = interfaceC1802i0;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0434l(c0873f, interfaceC1193a, interfaceC1041r2, z6, g02, interfaceC1802i02, i6);
        }
    }
}
