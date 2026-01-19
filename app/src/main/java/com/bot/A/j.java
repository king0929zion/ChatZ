package A;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import o4.AbstractC1410a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class j extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f21h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f22i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f23j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, g gVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f22i = lVar;
        this.f23j = gVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((j) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new j(this.f22i, this.f23j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f21h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f21h = 1;
            Object h3 = AbstractC1410a.h(this.f22i, this.f23j, this);
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
