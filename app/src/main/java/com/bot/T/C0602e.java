package T;

import a0.C0792b;
import b4.InterfaceC0909g;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* renamed from: T.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0602e implements InterfaceC0909g, R0 {

    /* renamed from: e, reason: collision with root package name */
    public static final F0.F f8078e = new F0.F(5);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C0602e f8079f = new C0602e(1);

    /* renamed from: g, reason: collision with root package name */
    public static final C0602e f8080g = new C0602e(2);

    /* renamed from: h, reason: collision with root package name */
    public static final C0602e f8081h = new C0602e(3);

    /* renamed from: i, reason: collision with root package name */
    public static final C0602e f8082i = new C0602e(4);

    /* renamed from: j, reason: collision with root package name */
    public static final C0602e f8083j = new C0602e(5);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8084c;

    public /* synthetic */ C0602e(int i6) {
        this.f8084c = i6;
    }

    public static final void b(C0602e c0602e) {
        A4.g0 g0Var;
        W.e eVar;
        Z.b bVar;
        A4.g0 g0Var2 = C0642y0.f8270z;
        do {
            g0Var = C0642y0.f8270z;
            eVar = (W.e) g0Var.getValue();
            bVar = (Z.b) eVar;
            Y.c cVar = bVar.f9849f;
            Z.a aVar = (Z.a) cVar.get(c0602e);
            if (aVar != null) {
                Object obj = aVar.a;
                Object obj2 = aVar.f9845b;
                Y.n nVar = cVar.f9544c;
                Y.n v5 = nVar.v(c0602e != null ? c0602e.hashCode() : 0, 0, c0602e);
                if (nVar != v5) {
                    cVar = v5 == null ? Y.c.f9543f : new Y.c(v5, cVar.f9545e - 1);
                }
                C0792b c0792b = C0792b.a;
                if (obj != c0792b) {
                    Object obj3 = cVar.get(obj);
                    AbstractC1276k.c(obj3);
                    cVar = cVar.b(obj, new Z.a(((Z.a) obj3).a, obj2));
                }
                if (obj2 != c0792b) {
                    Object obj4 = cVar.get(obj2);
                    AbstractC1276k.c(obj4);
                    cVar = cVar.b(obj2, new Z.a(obj, ((Z.a) obj4).f9845b));
                }
                Object obj5 = obj != c0792b ? bVar.f9847c : obj2;
                if (obj2 != c0792b) {
                    obj = bVar.f9848e;
                }
                bVar = new Z.b(obj5, obj, cVar);
            }
            if (eVar == bVar) {
                return;
            }
        } while (!g0Var.j(eVar, bVar));
    }

    @Override // T.R0
    public boolean a(Object obj, Object obj2) {
        switch (this.f8084c) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return AbstractC1276k.b(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f8084c) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case AbstractC1787b.f15290g /* 5 */:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
