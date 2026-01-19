package Z2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import l4.InterfaceC1193a;
import x4.InterfaceC1942y;

/* renamed from: Z2.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0755h0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10218h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a3.w f10219i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f10220j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0755h0(a3.w wVar, InterfaceC1193a interfaceC1193a, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10219i = wVar;
        this.f10220j = interfaceC1193a;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0755h0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0755h0(this.f10219i, this.f10220j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10218h;
        if (i6 == 0) {
            X3.a.e(obj);
            A4.P p5 = this.f10219i.f10730b0;
            C0753g0 c0753g0 = new C0753g0(this.f10220j, null);
            this.f10218h = 1;
            Object f6 = A4.W.f(p5, c0753g0, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (f6 == enumC0927a) {
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
