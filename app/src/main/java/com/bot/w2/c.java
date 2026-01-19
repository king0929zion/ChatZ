package W2;

import A4.P;
import A4.W;
import X2.C0692g;
import X2.L;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class c extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f8864h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f8865i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0692g f8866j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(L l3, C0692g c0692g, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8865i = l3;
        this.f8866j = c0692g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((c) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new c(this.f8865i, this.f8866j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f8864h;
        if (i6 == 0) {
            X3.a.e(obj);
            P p5 = this.f8865i.f9219t;
            b bVar = new b(this.f8866j, null);
            this.f8864h = 1;
            Object f6 = W.f(p5, bVar, this);
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
        return y.a;
    }
}
