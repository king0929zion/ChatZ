package T;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: T.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634u0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f8213h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f8214i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0640x0 f8215j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I0.Z f8216k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0634u0(C0640x0 c0640x0, I0.Z z5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8215j = c0640x0;
        this.f8216k = z5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0634u0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0634u0 c0634u0 = new C0634u0(this.f8215j, this.f8216k, interfaceC0905c);
        c0634u0.f8214i = obj;
        return c0634u0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f8213h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return X3.y.a;
        }
        X3.a.e(obj);
        InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f8214i;
        this.f8213h = 1;
        this.f8215j.d(interfaceC1942y, this.f8216k, this);
        return EnumC0927a.f11114c;
    }
}
