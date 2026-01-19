package F0;

import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class A0 extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0127o[] f1380f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(C0127o[] c0127oArr, int i6) {
        super(2);
        this.f1379e = i6;
        this.f1380f = c0127oArr;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f1379e) {
            case 0:
                return Float.valueOf(AbstractC0137z.d((j0) obj, true, this.f1380f, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC0137z.d((j0) obj, false, this.f1380f, ((Number) obj2).floatValue()));
        }
    }
}
