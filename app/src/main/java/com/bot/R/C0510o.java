package R;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: R.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510o extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f6813h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6814i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.f f6815j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0513s f6816k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0510o(l4.f fVar, C0513s c0513s, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6815j = fVar;
        this.f6816k = c0513s;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0510o) p((InterfaceC0905c) obj2, (W) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0510o c0510o = new C0510o(this.f6815j, this.f6816k, interfaceC0905c);
        c0510o.f6814i = obj;
        return c0510o;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6813h;
        if (i6 == 0) {
            X3.a.e(obj);
            W w5 = (W) this.f6814i;
            r rVar = this.f6816k.f6837n;
            this.f6813h = 1;
            Object d6 = this.f6815j.d(rVar, w5, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (d6 == enumC0927a) {
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
