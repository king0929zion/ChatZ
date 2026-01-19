package M2;

import D.C0069g0;
import P2.C0;
import P2.S;
import P2.V;
import b0.C0873f;
import java.util.List;
import m4.AbstractC1276k;
import x.C1856g;

/* renamed from: M2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0250a implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3277c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f3278e;

    public /* synthetic */ C0250a(List list, int i6) {
        this.f3277c = i6;
        this.f3278e = list;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f3277c) {
            case 0:
                A a = (A) obj;
                AbstractC1276k.f(a, "it");
                return A.a(a, null, null, null, Y3.m.J0(this.f3278e), null, null, null, null, null, 503);
            case 1:
                return A.a((A) obj, null, null, null, Y3.m.J0(this.f3278e), null, null, null, null, null, 503);
            case 2:
                C1856g c1856g = (C1856g) obj;
                AbstractC1276k.f(c1856g, "$this$LazyColumn");
                I2.x xVar = new I2.x(28);
                I2.x xVar2 = new I2.x(29);
                List list = this.f3278e;
                c1856g.o(list.size(), new C0069g0(3, xVar, list), new C0069g0(4, xVar2, list), new C0873f(new C0(list, 0), true, 802480018));
                C1856g.n(c1856g, "bottom_anchor", V.f4800c, 2);
                return X3.y.a;
            default:
                C1856g c1856g2 = (C1856g) obj;
                AbstractC1276k.f(c1856g2, "$this$LazyRow");
                List list2 = this.f3278e;
                c1856g2.o(list2.size(), null, new S(list2, 6), new C0873f(new C0(list2, 1), true, 802480018));
                return X3.y.a;
        }
    }
}
