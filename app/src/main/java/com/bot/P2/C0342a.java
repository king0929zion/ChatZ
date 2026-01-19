package P2;

import Q.f3;
import T.C0626q;

/* renamed from: P2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0342a implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4818c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L2.c f4819e;

    public /* synthetic */ C0342a(L2.c cVar) {
        this.f4818c = 2;
        this.f4819e = cVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f4818c) {
            case 0:
                ((Integer) obj2).getClass();
                V.a(this.f4819e, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 1:
                ((Integer) obj2).getClass();
                L0.c(this.f4819e, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 2:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    f3.b(this.f4819e.f3059c, null, ((Q.N) c0626q.j(Q.O.a)).a, s4.j.z(16), null, 0L, null, s4.j.z(22), 0, false, 0, 0, null, c0626q, 24576, 48, 260074);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                ((Integer) obj2).getClass();
                V.o(this.f4819e, (C0626q) obj, T.r.J(1));
                return X3.y.a;
        }
    }

    public /* synthetic */ C0342a(L2.c cVar, int i6, int i7) {
        this.f4818c = i7;
        this.f4819e = cVar;
    }
}
