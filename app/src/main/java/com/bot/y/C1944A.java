package y;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.C1316c;
import x4.InterfaceC1942y;

/* renamed from: y.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1944A extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f15747h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1948E f15748i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1944A(C1948E c1948e, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15748i = c1948e;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1944A) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1944A(this.f15748i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f15747h;
        C1948E c1948e = this.f15748i;
        if (i6 == 0) {
            X3.a.e(obj);
            C1316c c1316c = c1948e.f15770o;
            e1.j jVar = new e1.j(0L);
            this.f15747h = 1;
            Object e6 = c1316c.e(this, jVar);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (e6 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        int i7 = C1948E.f15756t;
        c1948e.g(0L);
        c1948e.f(false);
        return X3.y.a;
    }
}
