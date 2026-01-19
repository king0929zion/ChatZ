package Z2;

import T.C0626q;
import h0.C1038o;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import x.C1851b;

/* renamed from: Z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0740a implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10140c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f10141e;

    public /* synthetic */ C0740a(float f6, int i6) {
        this.f10140c = i6;
        this.f10141e = f6;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i6 = this.f10140c;
        C1851b c1851b = (C1851b) obj;
        C0626q c0626q = (C0626q) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i6) {
            case 0:
                AbstractC1276k.f(c1851b, "$this$item");
                if (c0626q.S(intValue & 1, (intValue & 17) != 16)) {
                    AbstractC1787b.h(c0626q, v.t0.j(C1038o.a, this.f10141e));
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                AbstractC1276k.f(c1851b, "$this$item");
                if (c0626q.S(intValue & 1, (intValue & 17) != 16)) {
                    AbstractC1787b.h(c0626q, v.t0.j(C1038o.a, this.f10141e));
                } else {
                    c0626q.V();
                }
                return X3.y.a;
        }
    }
}
