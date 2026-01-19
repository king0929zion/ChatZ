package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: r.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14307h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l4.e f14308i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f14309j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f14310k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564f(l4.e eVar, Object obj, InterfaceC1942y interfaceC1942y, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14308i = eVar;
        this.f14309j = obj;
        this.f14310k = interfaceC1942y;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1564f) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1564f(this.f14308i, this.f14309j, this.f14310k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14307h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f14307h = 1;
            Object m3 = this.f14308i.m(this.f14309j, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (m3 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        AbstractC1888A.j(this.f14310k, new C1549a());
        return X3.y.a;
    }
}
