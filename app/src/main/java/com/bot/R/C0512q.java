package R;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: R.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512q extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f6821h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6822i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.g f6823j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0513s f6824k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0512q(l4.g gVar, C0513s c0513s, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6823j = gVar;
        this.f6824k = c0513s;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0512q) p((InterfaceC0905c) obj2, (X3.i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0512q c0512q = new C0512q(this.f6823j, this.f6824k, interfaceC0905c);
        c0512q.f6822i = obj;
        return c0512q;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6821h;
        if (i6 == 0) {
            X3.a.e(obj);
            X3.i iVar = (X3.i) this.f6822i;
            W w5 = (W) iVar.f9393c;
            Object obj2 = iVar.f9394e;
            r rVar = this.f6824k.f6837n;
            this.f6821h = 1;
            Object i7 = this.f6823j.i(rVar, w5, obj2, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (i7 == enumC0927a) {
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
