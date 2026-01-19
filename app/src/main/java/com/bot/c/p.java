package c;

import T.C0626q;
import T.r;
import X3.y;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class p extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l4.e f11096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11097g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z5, l4.e eVar, int i6) {
        super(2);
        this.f11095e = z5;
        this.f11096f = eVar;
        this.f11097g = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int J4 = r.J(this.f11097g | 1);
        h5.e.F(this.f11095e, this.f11096f, (C0626q) obj, J4);
        return y.a;
    }
}
