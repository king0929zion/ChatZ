package F0;

import T.C0626q;
import h0.InterfaceC1041r;
import i1.AbstractC1087g;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class r0 extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f1516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l4.e f1517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1518h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(InterfaceC1041r interfaceC1041r, l4.e eVar, int i6, int i7) {
        super(2);
        this.f1515e = i7;
        this.f1516f = interfaceC1041r;
        this.f1517g = eVar;
        this.f1518h = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f1515e;
        C0626q c0626q = (C0626q) obj;
        ((Number) obj2).intValue();
        switch (i6) {
            case 0:
                AbstractC0137z.b(this.f1516f, this.f1517g, c0626q, T.r.J(this.f1518h | 1));
                return X3.y.a;
            default:
                AbstractC1087g.e(this.f1516f, this.f1517g, c0626q, T.r.J(this.f1518h | 1));
                return X3.y.a;
        }
    }
}
