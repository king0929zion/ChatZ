package D;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: D.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061c0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f991h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B0.D f992i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H0 f993j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061c0(B0.D d6, H0 h02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f992i = d6;
        this.f993j = h02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0061c0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0061c0(this.f992i, this.f993j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f991h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f991h = 1;
            Object p5 = AbstractC0090r0.p(this.f992i, this.f993j, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (p5 == enumC0927a) {
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
