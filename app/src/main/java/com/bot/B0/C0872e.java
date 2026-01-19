package b0;

import T.C0626q;
import X3.y;
import e1.q;
import m4.C1266a;
import r.C1611u1;
import r.C1620x1;
import x4.AbstractC1888A;

/* renamed from: b0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0872e extends C1266a implements l4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10977k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0872e(int i6, Object obj, Class cls, String str, String str2, int i7, int i8) {
        super(i6, i7, cls, obj, str, str2);
        this.f10977k = i8;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f10977k) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                ((C0873f) this.f12949c).a(intValue, (C0626q) obj);
                return y.a;
            default:
                long j3 = ((q) obj).a;
                C1620x1 c1620x1 = (C1620x1) this.f12949c;
                AbstractC1888A.y(c1620x1.f14508N.c(), null, new C1611u1(c1620x1, j3, null), 3);
                return y.a;
        }
    }
}
