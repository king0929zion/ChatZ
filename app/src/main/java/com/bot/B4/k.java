package B4;

import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class k extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f596h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f597i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0008i f598j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f599k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, InterfaceC0008i interfaceC0008i, Object obj, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f597i = oVar;
        this.f598j = interfaceC0008i;
        this.f599k = obj;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((k) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new k(this.f597i, this.f598j, this.f599k, interfaceC0905c);
    }

        @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f596h;
        if (i6 == 0) {
            X3.a.e(obj);
            Object r32 = this.f597i.f614h;
            this.f596h = 1;
            Object d6 = r32.d(this.f598j, this.f599k, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (d6 == enumC0927a) {
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
