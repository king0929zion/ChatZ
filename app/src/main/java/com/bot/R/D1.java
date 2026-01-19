package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class D1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14006h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14007i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E1 f14008j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l4.e f14009k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(E1 e12, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14008j = e12;
        this.f14009k = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((D1) p((InterfaceC0905c) obj2, (InterfaceC1563e1) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        D1 d12 = new D1(this.f14008j, this.f14009k, interfaceC0905c);
        d12.f14007i = obj;
        return d12;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14006h;
        if (i6 == 0) {
            X3.a.e(obj);
            InterfaceC1563e1 interfaceC1563e1 = (InterfaceC1563e1) this.f14007i;
            E1 e12 = this.f14008j;
            e12.f14022k = interfaceC1563e1;
            B1 b1 = e12.f14023l;
            this.f14006h = 1;
            Object m3 = this.f14009k.m(b1, this);
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
        return X3.y.a;
    }
}
