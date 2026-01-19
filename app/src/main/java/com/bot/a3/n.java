package A3;

import I3.AbstractC0239c;
import I3.C0241e;
import I3.InterfaceC0242f;
import Y3.v;
import java.util.List;
import m4.AbstractC1276k;
import u4.u;

/* loaded from: classes.dex */
public final class n implements InterfaceC0242f {

    /* renamed from: c, reason: collision with root package name */
    public static final n f148c = new Object();

    @Override // I3.InterfaceC0242f
    public final boolean a(C0241e c0241e) {
        AbstractC1276k.f(c0241e, "contentType");
        if (c0241e.f(AbstractC0239c.a)) {
            return true;
        }
        if (!((List) c0241e.f2280c).isEmpty()) {
            c0241e = new C0241e(c0241e.f2742d, c0241e.f2743e, v.f9812c);
        }
        String abstractC0173b = c0241e.toString();
        return u.D(abstractC0173b, "application/", false) && u.w(abstractC0173b, "+json", false);
    }
}
