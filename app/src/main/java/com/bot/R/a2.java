package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class a2 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14230h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14231i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B0.D f14232j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l4.f f14233k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l4.c f14234l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l4.c f14235m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l4.c f14236n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(B0.D d6, l4.f fVar, l4.c cVar, l4.c cVar2, l4.c cVar3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14232j = d6;
        this.f14233k = fVar;
        this.f14234l = cVar;
        this.f14235m = cVar2;
        this.f14236n = cVar3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((a2) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        a2 a2Var = new a2(this.f14232j, this.f14233k, this.f14234l, this.f14235m, this.f14236n, interfaceC0905c);
        a2Var.f14231i = obj;
        return a2Var;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14230h;
        if (i6 == 0) {
            X3.a.e(obj);
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f14231i;
            B0.D d6 = this.f14232j;
            C1551a1 c1551a1 = new C1551a1(d6);
            Z1 z12 = new Z1(interfaceC1942y, this.f14233k, this.f14234l, this.f14235m, this.f14236n, c1551a1, null);
            this.f14230h = 1;
            Object h3 = AbstractC1573i.h(d6, z12, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (h3 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
