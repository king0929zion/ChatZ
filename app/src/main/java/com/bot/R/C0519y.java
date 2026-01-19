package R;

import B0.EnumC0041q;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.f2;

/* renamed from: R.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519y extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public int f6845f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ EnumC0041q f6847h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519y(EnumC0041q enumC0041q, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6847h = enumC0041q;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0519y) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0519y c0519y = new C0519y(this.f6847h, interfaceC0905c);
        c0519y.f6846g = obj;
        return c0519y;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6845f;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        B0.V v5 = (B0.V) this.f6846g;
        this.f6845f = 1;
        Object i7 = f2.i(v5, this.f6847h, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return i7 == enumC0927a ? enumC0927a : i7;
    }
}
