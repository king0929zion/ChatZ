package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: r.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1608t1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14481h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1620x1 f14482i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f14483j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608t1(C1620x1 c1620x1, long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14482i = c1620x1;
        this.f14483j = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1608t1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1608t1(this.f14482i, this.f14483j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14481h;
        if (i6 == 0) {
            X3.a.e(obj);
            E1 e12 = this.f14482i.f14511Q;
            C1605s1 c1605s1 = new C1605s1(this.f14483j, null);
            this.f14481h = 1;
            Object f6 = e12.f(p.x0.f13824e, c1605s1, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (f6 == enumC0927a) {
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
