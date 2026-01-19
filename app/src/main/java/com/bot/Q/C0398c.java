package Q;

import T.C0626q;
import b0.C0873f;
import y.AbstractC1975o;

/* renamed from: Q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0398c implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5716c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0873f f5717e;

    public /* synthetic */ C0398c(C0873f c0873f, int i6) {
        this.f5716c = 0;
        float f6 = AbstractC0426j.a;
        float f7 = AbstractC0426j.a;
        this.f5717e = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f5716c;
        X3.y yVar = X3.y.a;
        C0873f c0873f = this.f5717e;
        switch (i6) {
            case 0:
                float f6 = AbstractC0426j.a;
                float f7 = AbstractC0426j.a;
                ((Integer) obj2).getClass();
                AbstractC0426j.b(c0873f, (C0626q) obj, T.r.J(439));
                return yVar;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0393a2.a(c0873f, (C0626q) obj, T.r.J(55));
                return yVar;
            case 2:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    c0873f.m(c0626q, 6);
                } else {
                    c0626q.V();
                }
                return yVar;
            case 3:
                ((Integer) obj2).getClass();
                S2.D0.a(c0873f, (C0626q) obj, T.r.J(439));
                return yVar;
            case 4:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c0873f.d(v.I.a, c0626q2, 6);
                } else {
                    c0626q2.V();
                }
                return yVar;
            default:
                ((Integer) obj2).getClass();
                AbstractC1975o.c(c0873f, (C0626q) obj, T.r.J(7));
                return yVar;
        }
    }

    public /* synthetic */ C0398c(C0873f c0873f, int i6, byte b5) {
        this.f5716c = i6;
        this.f5717e = c0873f;
    }

    public /* synthetic */ C0398c(C0873f c0873f, int i6, int i7) {
        this.f5716c = i7;
        this.f5717e = c0873f;
    }
}
