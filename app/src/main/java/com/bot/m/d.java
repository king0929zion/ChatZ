package M;

import I0.S;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class d extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3139h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3140i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.c f3141j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f3142k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f3143l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l4.c cVar, e eVar, t tVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3141j = cVar;
        this.f3142k = eVar;
        this.f3143l = tVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((d) p((InterfaceC0905c) obj2, (S) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        d dVar = new d(this.f3141j, this.f3142k, this.f3143l, interfaceC0905c);
        dVar.f3140i = obj;
        return dVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f3139h;
        if (i6 == 0) {
            X3.a.e(obj);
            c cVar = new c((S) this.f3140i, this.f3141j, this.f3142k, this.f3143l, null);
            this.f3139h = 1;
            Object l3 = AbstractC1888A.l(cVar, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (l3 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        throw new RuntimeException();
    }
}
