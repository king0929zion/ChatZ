package h1;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n0.C1354c;
import o4.AbstractC1410a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class o extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f11891h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f11892i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1354c f11893j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, C1354c c1354c, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f11892i = pVar;
        this.f11893j = c1354c;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((o) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new o(this.f11892i, this.f11893j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f11891h;
        if (i6 == 0) {
            X3.a.e(obj);
            A0.b bVar = new A0.b(this.f11893j, 15);
            this.f11891h = 1;
            Object h3 = AbstractC1410a.h(this.f11892i, bVar, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (h3 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return y.a;
    }
}
