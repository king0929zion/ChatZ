package F0;

import T.C0626q;
import h0.InterfaceC1041r;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class s0 extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f1523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1524g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1525h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X3.e f1526i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj, InterfaceC1041r interfaceC1041r, X3.e eVar, int i6, int i7) {
        super(2);
        this.f1522e = i7;
        this.f1525h = obj;
        this.f1523f = interfaceC1041r;
        this.f1526i = eVar;
        this.f1524g = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f1522e;
        C0626q c0626q = (C0626q) obj;
        ((Number) obj2).intValue();
        switch (i6) {
            case 0:
                AbstractC0137z.a((v0) this.f1525h, this.f1523f, (l4.e) this.f1526i, c0626q, T.r.J(this.f1524g | 1));
                return X3.y.a;
            default:
                h1.k.b((l4.c) this.f1525h, this.f1523f, (l4.c) this.f1526i, c0626q, T.r.J(this.f1524g | 1));
                return X3.y.a;
        }
    }
}
