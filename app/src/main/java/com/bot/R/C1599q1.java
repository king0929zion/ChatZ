package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: r.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1599q1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14447h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14448i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1586m0 f14449j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E1 f14450k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1599q1(C1586m0 c1586m0, E1 e12, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14449j = c1586m0;
        this.f14450k = e12;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1599q1) p((InterfaceC0905c) obj2, (B1) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1599q1 c1599q1 = new C1599q1(this.f14449j, this.f14450k, interfaceC0905c);
        c1599q1.f14448i = obj;
        return c1599q1;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14447h;
        if (i6 == 0) {
            X3.a.e(obj);
            Z2.X x5 = new Z2.X(16, (B1) this.f14448i, this.f14450k);
            this.f14447h = 1;
            Object m3 = this.f14449j.m(x5, this);
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
