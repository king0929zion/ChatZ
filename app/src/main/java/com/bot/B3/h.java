package B3;

import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class h extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public static final h f524e = new AbstractC1277l(0);

    @Override // l4.InterfaceC1193a
    public final Object b() {
        int i6 = i.a;
        A3.c cVar = new A3.c(2, (byte) 0);
        try {
            return !(f5.b.c() instanceof h5.b) ? new s(cVar) : new s(new M.q(Class.forName("android.util.Log"), cVar));
        } catch (ClassNotFoundException unused) {
            return new s(cVar);
        }
    }
}
