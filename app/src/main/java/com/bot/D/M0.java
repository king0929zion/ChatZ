package D;

import S0.C0539a;
import e1.AbstractC0960b;
import e1.InterfaceC0961c;

/* loaded from: classes.dex */
public abstract class M0 {
    public static final String a = u4.u.A("H", 10);

    public static final long a(S0.P p5, InterfaceC0961c interfaceC0961c, W0.d dVar, String str, int i6) {
        C0539a a6 = S0.F.a(str, p5, AbstractC0960b.b(0, 0, 15), interfaceC0961c, dVar, i6, 64);
        return (AbstractC0090r0.o(a6.a.b()) << 32) | (AbstractC0090r0.o(a6.b()) & 4294967295L);
    }

    public static /* synthetic */ long b(S0.P p5, InterfaceC0961c interfaceC0961c, W0.d dVar) {
        return a(p5, interfaceC0961c, dVar, a, 1);
    }
}
