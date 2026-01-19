package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: r.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1585m extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14381h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1588n f14382i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1543U f14383j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1585m(C1588n c1588n, C1543U c1543u, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14382i = c1588n;
        this.f14383j = c1543u;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1585m) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1585m(this.f14382i, this.f14383j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14381h;
        if (i6 == 0) {
            X3.a.e(obj);
            long j3 = this.f14383j.a;
            C1588n c1588n = this.f14382i;
            long f6 = e1.q.f(c1588n.i1() ? -1.0f : 1.0f, j3);
            float c6 = c1588n.f14393M == X0.f14183c ? e1.q.c(f6) : e1.q.b(f6);
            this.f14381h = 1;
            Object h12 = C1588n.h1(c1588n, c6, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (h12 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1 && i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
