package L;

import B0.N;
import H0.C0159n;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public abstract class b {
    public static final C0159n a;

    static {
        float f6 = 40;
        float f7 = 10;
        a = new C0159n(f7, f6, f7, f6);
    }

    public static final InterfaceC1041r a(boolean z5, boolean z6, InterfaceC1193a interfaceC1193a) {
        InterfaceC1041r interfaceC1041r = C1038o.a;
        if (!z5 || !e.a) {
            return interfaceC1041r;
        }
        if (z6) {
            interfaceC1041r = new N(a);
        }
        return interfaceC1041r.c(new a(interfaceC1193a));
    }
}
