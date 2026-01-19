package Q;

import T.C0626q;
import b0.AbstractC0874g;
import b0.C0873f;

/* renamed from: Q.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418h implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5824c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.e f5825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0873f f5826f;

    public /* synthetic */ C0418h(l4.e eVar, C0873f c0873f, int i6) {
        this.f5824c = i6;
        this.f5825e = eVar;
        this.f5826f = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f5824c;
        X3.y yVar = X3.y.a;
        C0873f c0873f = this.f5826f;
        l4.e eVar = this.f5825e;
        int i7 = 0;
        switch (i6) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    if (eVar == null) {
                        c0626q.b0(-1102039173);
                    } else {
                        c0626q.b0(795734342);
                        eVar.m(c0626q, 0);
                    }
                    c0626q.p(false);
                    c0873f.m(c0626q, 0);
                } else {
                    c0626q.V();
                }
                return yVar;
            default:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    float f6 = AbstractC0426j.a;
                    AbstractC0426j.b(AbstractC0874g.c(-459506658, new C0418h(eVar, c0873f, i7), c0626q2), c0626q2, 438);
                } else {
                    c0626q2.V();
                }
                return yVar;
        }
    }
}
