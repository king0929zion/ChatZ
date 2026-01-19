package D;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n0.C1354c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class X extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f956h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A.d f957i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X0.v f958j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0098v0 f959k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d1 f960l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X0.p f961m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(A.d dVar, X0.v vVar, C0098v0 c0098v0, d1 d1Var, X0.p pVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f957i = dVar;
        this.f958j = vVar;
        this.f959k = c0098v0;
        this.f960l = d1Var;
        this.f961m = pVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((X) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new X(this.f957i, this.f958j, this.f959k, this.f960l, this.f961m, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        long a;
        C1354c c1354c;
        int i6 = this.f956h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        G0 g02 = this.f959k.a;
        S0.L l3 = this.f960l.a;
        this.f956h = 1;
        int b5 = this.f961m.b(S0.O.e(this.f958j.f9125b));
        if (b5 < l3.a.a.f7630e.length()) {
            c1354c = l3.b(b5);
        } else if (b5 != 0) {
            c1354c = l3.b(b5 - 1);
        } else {
            a = M0.a(g02.f768b, g02.f773g, g02.f774h, M0.a, 1);
            c1354c = new C1354c(S.l.f7374V, S.l.f7374V, 1.0f, (int) (a & 4294967295L));
        }
        Object a6 = this.f957i.a(c1354c, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (a6 != enumC0927a) {
            a6 = yVar;
        }
        return a6 == enumC0927a ? enumC0927a : yVar;
    }
}
