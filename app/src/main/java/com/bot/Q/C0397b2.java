package Q;

import R.C0513s;
import m4.C1285t;

/* renamed from: Q.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0397b2 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5671c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R.r f5672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1285t f5673f;

    public /* synthetic */ C0397b2(R.r rVar, C1285t c1285t, int i6) {
        this.f5671c = i6;
        this.f5672e = rVar;
        this.f5673f = c1285t;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f5671c;
        float floatValue = ((Float) obj).floatValue();
        float floatValue2 = ((Float) obj2).floatValue();
        switch (i6) {
            case 0:
                C0513s c0513s = this.f5672e.a;
                c0513s.f6833j.h(floatValue);
                c0513s.f6834k.h(floatValue2);
                this.f5673f.f12970c = floatValue;
                break;
            default:
                C0513s c0513s2 = this.f5672e.a;
                c0513s2.f6833j.h(floatValue);
                c0513s2.f6834k.h(floatValue2);
                this.f5673f.f12970c = floatValue;
                break;
        }
        return X3.y.a;
    }
}
