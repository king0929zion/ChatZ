package I0;

import java.util.List;
import k.AbstractC1167n;
import k.C1148B;

/* loaded from: classes.dex */
public final class R0 {
    public final P0.m a;

    /* renamed from: b, reason: collision with root package name */
    public final C1148B f2241b;

    public R0(P0.p pVar, AbstractC1167n abstractC1167n) {
        this.a = pVar.f4499d;
        this.f2241b = new C1148B(P0.p.j(4, pVar).size());
        List j3 = P0.p.j(4, pVar);
        int size = j3.size();
        for (int i6 = 0; i6 < size; i6++) {
            P0.p pVar2 = (P0.p) j3.get(i6);
            if (abstractC1167n.a(pVar2.f4502g)) {
                this.f2241b.a(pVar2.f4502g);
            }
        }
    }
}
