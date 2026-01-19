package Q;

import T.AbstractC0623o0;
import T.C0626q;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public abstract class W1 {
    public static final T.e1 a = new AbstractC0623o0(new O.A(15));

    public static final o0.L a(S.t tVar, C0626q c0626q) {
        V1 v12 = (V1) c0626q.j(a);
        switch (tVar.ordinal()) {
            case 0:
                return v12.f5550h;
            case 1:
                return v12.f5547e;
            case 2:
                return v12.f5549g;
            case 3:
                return b(v12.f5547e);
            case 4:
                return v12.a;
            case AbstractC1787b.f15290g /* 5 */:
                return b(v12.a);
            case 6:
                return C.e.a;
            case 7:
                return v12.f5546d;
            case 8:
                C.d dVar = v12.f5546d;
                C.b bVar = U1.f5537i;
                return C.d.b(dVar, bVar, null, null, bVar, 6);
            case AbstractC1787b.f15287d /* 9 */:
                return v12.f5548f;
            case AbstractC1787b.f15289f /* 10 */:
                C.d dVar2 = v12.f5546d;
                C.b bVar2 = U1.f5537i;
                return C.d.b(dVar2, null, bVar2, bVar2, null, 9);
            case 11:
                return b(v12.f5546d);
            case 12:
                return v12.f5545c;
            case 13:
                return o0.y.f13496b;
            case 14:
                return v12.f5544b;
            default:
                throw new RuntimeException();
        }
    }

    public static C.d b(C.d dVar) {
        C.b bVar = U1.f5537i;
        return C.d.b(dVar, null, null, bVar, bVar, 3);
    }
}
