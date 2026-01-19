package U;

import T.C0627q0;
import T.InterfaceC0598c;
import T.M0;
import b0.C0876i;
import b0.C0879l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final o f8581c = new J(0, 1, 1);

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        V.e eVar;
        C0627q0 c0627q0 = (C0627q0) l3.d(0);
        k.M m3 = c0879l.f10996i;
        if (m3 == null || ((C0876i) m3.g(c0627q0)) == null) {
            return;
        }
        ArrayList arrayList = c0879l.f10997j;
        if (arrayList != null && (eVar = (V.e) arrayList.remove(arrayList.size() - 1)) != null) {
            c0879l.f10992e = eVar;
        }
        m3.k(c0627q0);
    }
}
