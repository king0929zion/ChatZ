package Z2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.AbstractC1318d;
import n.C1316c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class r extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10296h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f10297i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1316c c1316c, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10297i = c1316c;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((r) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new r(this.f10297i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10296h;
        if (i6 == 0) {
            X3.a.e(obj);
            Float f6 = new Float(S.l.f7374V);
            n.D0 s5 = AbstractC1318d.s(200, 6, null);
            this.f10296h = 1;
            Object c6 = C1316c.c(this.f10297i, f6, s5, null, this, 12);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (c6 == enumC0927a) {
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
