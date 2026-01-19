package B;

import Q.T1;
import h0.AbstractC1024a;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import t.C1682j;

/* loaded from: classes.dex */
public abstract class c {
    public static final InterfaceC1041r a(boolean z5, T1 t12, boolean z6, P0.i iVar, InterfaceC1193a interfaceC1193a) {
        if (t12 != null) {
            return new a(z5, null, t12, false, z6, iVar, interfaceC1193a);
        }
        if (t12 == null) {
            return new a(z5, null, null, false, z6, iVar, interfaceC1193a);
        }
        return AbstractC1024a.a(C1038o.a, new b(t12, z5, z6, iVar, interfaceC1193a));
    }

    public static InterfaceC1041r b(InterfaceC1041r interfaceC1041r, boolean z5, InterfaceC1193a interfaceC1193a) {
        return interfaceC1041r.c(new a(z5, null, null, true, true, null, interfaceC1193a));
    }

    public static final InterfaceC1041r c(InterfaceC1041r interfaceC1041r, boolean z5, C1682j c1682j, boolean z6, P0.i iVar, l4.c cVar) {
        return interfaceC1041r.c(new e(z5, c1682j, z6, iVar, cVar));
    }

    public static final InterfaceC1041r d(R0.a aVar, T1 t12, boolean z5, P0.i iVar, InterfaceC1193a interfaceC1193a) {
        if (t12 != null) {
            return new j(aVar, null, t12, z5, iVar, interfaceC1193a);
        }
        if (t12 == null) {
            return new j(aVar, null, null, z5, iVar, interfaceC1193a);
        }
        return AbstractC1024a.a(C1038o.a, new f(t12, aVar, z5, iVar, interfaceC1193a));
    }
}
