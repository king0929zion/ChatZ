package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: r.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1611u1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14488h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1620x1 f14489i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f14490j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611u1(C1620x1 c1620x1, long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14489i = c1620x1;
        this.f14490j = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1611u1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1611u1(this.f14489i, this.f14490j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14488h;
        if (i6 == 0) {
            X3.a.e(obj);
            E1 e12 = this.f14489i.f14511Q;
            this.f14488h = 1;
            Object b5 = e12.b(this.f14490j, true, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (b5 == enumC0927a) {
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
