package A4;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: A4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012m extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0022x f279i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0012m(C0022x c0022x, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f279i = c0022x;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0012m) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0012m(this.f279i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f278h;
        X3.y yVar = X3.y.a;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f278h = 1;
            Object b5 = this.f279i.b(B4.y.f640c, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (b5 != enumC0927a) {
                b5 = yVar;
            }
            if (b5 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return yVar;
    }
}
