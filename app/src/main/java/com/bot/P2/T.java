package P2;

import T.C0616l;
import T.C0626q;
import java.util.List;
import l4.InterfaceC1193a;
import x.C1851b;

/* loaded from: classes.dex */
public final class T implements l4.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f4788c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f4789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I0.S0 f4790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l4.c f4791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l4.c f4792h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f4793i;

    public T(List list, List list2, I0.S0 s02, l4.c cVar, l4.c cVar2, List list3) {
        this.f4788c = list;
        this.f4789e = list2;
        this.f4790f = s02;
        this.f4791g = cVar;
        this.f4792h = cVar2;
        this.f4793i = list3;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i6;
        Object obj5 = (C1851b) obj;
        int intValue = ((Number) obj2).intValue();
        C0626q c0626q = (C0626q) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i6 = (c0626q.f(obj5) ? 4 : 2) | intValue2;
        } else {
            i6 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i6 |= c0626q.d(intValue) ? 32 : 16;
        }
        if (c0626q.S(i6 & 1, (i6 & 147) != 146)) {
            Object obj6 = (InterfaceC0346c) this.f4788c.get(intValue);
            c0626q.b0(-1074170262);
            boolean z5 = obj6 instanceof Y;
            Object obj7 = C0616l.a;
            if (z5) {
                c0626q.b0(-1074114339);
                Y y5 = (Y) obj6;
                L2.b bVar = y5.f4811b;
                int i7 = y5.a;
                Object P5 = c0626q.P();
                if (P5 == obj7) {
                    P5 = I.f4739c;
                    c0626q.m0(P5);
                }
                l4.c cVar = (l4.c) P5;
                l4.c cVar2 = this.f4791g;
                boolean f6 = c0626q.f(cVar2);
                List list = this.f4789e;
                boolean h3 = f6 | c0626q.h(list) | c0626q.h(obj6);
                Object P6 = c0626q.P();
                if (h3 || P6 == obj7) {
                    P6 = new J(cVar2, list, (Y) obj6, 0);
                    c0626q.m0(P6);
                }
                V.g(bVar, this.f4789e, i7, this.f4790f, cVar, (InterfaceC1193a) P6, c0626q, 24576);
                c0626q.p(false);
            } else {
                if (!(obj6 instanceof X)) {
                    c0626q.b0(-1420123975);
                    c0626q.p(false);
                    throw new RuntimeException();
                }
                c0626q.b0(-1073052000);
                L2.a aVar = ((X) obj6).f4809b;
                l4.c cVar3 = this.f4792h;
                boolean f7 = c0626q.f(cVar3);
                List list2 = this.f4793i;
                boolean h6 = f7 | c0626q.h(list2) | c0626q.h(obj6);
                Object P7 = c0626q.P();
                if (h6 || P7 == obj7) {
                    P7 = new J(cVar3, list2, (X) obj6, 1);
                    c0626q.m0(P7);
                }
                V.f(aVar, (InterfaceC1193a) P7, c0626q, 0);
                c0626q.p(false);
            }
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
