package Z2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import i4.AbstractC1117a;
import n.C1316c;
import x4.InterfaceC1942y;

/* renamed from: Z2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768o extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10271h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f10272i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f10273j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f10274k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0768o(C1316c c1316c, float f6, float f7, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10272i = c1316c;
        this.f10273j = f6;
        this.f10274k = f7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0768o) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0768o(this.f10272i, this.f10273j, this.f10274k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10271h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1316c c1316c = this.f10272i;
            Float f6 = new Float(AbstractC1117a.e(((Number) c1316c.d()).floatValue() + this.f10273j, -this.f10274k, S.l.f7374V));
            this.f10271h = 1;
            Object e6 = c1316c.e(this, f6);
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
        return X3.y.a;
    }
}
