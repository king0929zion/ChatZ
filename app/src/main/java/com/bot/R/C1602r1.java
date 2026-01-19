package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: r.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602r1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14456h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1543U f14457i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1620x1 f14458j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602r1(C1543U c1543u, C1620x1 c1620x1, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14457i = c1543u;
        this.f14458j = c1620x1;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1602r1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1602r1(this.f14457i, this.f14458j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14456h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1543U c1543u = this.f14457i;
            float f6 = c1543u.f14154b ? -1.0f : 1.0f;
            E1 e12 = this.f14458j.f14511Q;
            long f7 = e1.q.f(f6, c1543u.a);
            this.f14456h = 1;
            Object b5 = e12.b(f7, false, this);
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
