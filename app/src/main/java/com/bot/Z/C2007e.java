package z;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.AbstractC1573i;
import x4.InterfaceC1942y;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2007e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f16102h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B0.D f16103i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C2004b f16104j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2007e(B0.D d6, C2004b c2004b, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f16103i = d6;
        this.f16104j = c2004b;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C2007e) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C2007e(this.f16103i, this.f16104j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f16102h;
        if (i6 == 0) {
            X3.a.e(obj);
            C2006d c2006d = new C2006d(this.f16104j, null);
            this.f16102h = 1;
            Object h3 = AbstractC1573i.h(this.f16103i, c2006d, this);
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
        return X3.y.a;
    }
}
