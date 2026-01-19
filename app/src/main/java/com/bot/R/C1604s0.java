package r;

import Q.B2;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: r.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1604s0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14462h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14463i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1586m0 f14464j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1613v0 f14465k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1604s0(C1586m0 c1586m0, C1613v0 c1613v0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14464j = c1586m0;
        this.f14465k = c1613v0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1604s0) p((InterfaceC0905c) obj2, (B2) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1604s0 c1604s0 = new C1604s0(this.f14464j, this.f14465k, interfaceC0905c);
        c1604s0.f14463i = obj;
        return c1604s0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14462h;
        if (i6 == 0) {
            X3.a.e(obj);
            Z2.X x5 = new Z2.X(15, (B2) this.f14463i, this.f14465k);
            this.f14462h = 1;
            Object m3 = this.f14464j.m(x5, this);
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
