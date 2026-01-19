package Q;

import o0.C1387I;

/* renamed from: Q.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0454q implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6039c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0405d2 f6040e;

    public /* synthetic */ C0454q(C0405d2 c0405d2, int i6) {
        this.f6039c = i6;
        this.f6040e = c0405d2;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        C1387I c1387i = (C1387I) obj;
        switch (this.f6039c) {
            case 0:
                C0405d2 c0405d2 = this.f6040e;
                float g3 = c0405d2.f5767d.f6833j.g();
                float c6 = c0405d2.f5767d.d().c();
                float f6 = g3 < c6 ? c6 - g3 : 0.0f;
                c1387i.k(f6 > S.l.f7374V ? (Float.intBitsToFloat((int) (c1387i.f13428s & 4294967295L)) + f6) / Float.intBitsToFloat((int) (4294967295L & c1387i.f13428s)) : 1.0f);
                c1387i.p(o0.y.h(0.5f, S.l.f7374V));
                break;
            default:
                C0405d2 c0405d22 = this.f6040e;
                float g6 = c0405d22.f5767d.f6833j.g();
                float c7 = c0405d22.f5767d.d().c();
                float f7 = g6 < c7 ? c7 - g6 : 0.0f;
                c1387i.k(f7 > S.l.f7374V ? 1 / ((Float.intBitsToFloat((int) (c1387i.f13428s & 4294967295L)) + f7) / Float.intBitsToFloat((int) (c1387i.f13428s & 4294967295L))) : 1.0f);
                c1387i.p(o0.y.h(0.5f, S.l.f7374V));
                break;
        }
        return X3.y.a;
    }
}
