package a3;

import Y2.L;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class r extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10690h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f10691i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10691i = wVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((r) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new r(this.f10691i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10690h;
        if (i6 == 0) {
            X3.a.e(obj);
            L l3 = this.f10691i.f10731c;
            this.f10690h = 1;
            Object m3 = l3.m(false, this);
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
