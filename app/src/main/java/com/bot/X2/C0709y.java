package X2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: X2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709y extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f9381i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0709y(L l3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9381i = l3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((C0709y) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0709y(this.f9381i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f9380h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            throw new RuntimeException();
        }
        X3.a.e(obj);
        L l3 = this.f9381i;
        A4.P p5 = l3.f9202c.f3403g;
        C0706v c0706v = new C0706v(l3, 1);
        this.f9380h = 1;
        p5.f200c.b(c0706v, this);
        return EnumC0927a.f11114c;
    }
}
