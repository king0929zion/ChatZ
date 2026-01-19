package p0;

import i4.AbstractC1117a;
import m4.AbstractC1277l;

/* renamed from: p0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1480p extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1481q f13884f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1480p(C1481q c1481q, int i6) {
        super(1);
        this.f13883e = i6;
        this.f13884f = c1481q;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f13883e) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f13884f.f13896n.e(AbstractC1117a.d(doubleValue, r10.f13887e, r10.f13888f)));
            default:
                return Double.valueOf(AbstractC1117a.d(this.f13884f.f13893k.e(((Number) obj).doubleValue()), r10.f13887e, r10.f13888f));
        }
    }
}
