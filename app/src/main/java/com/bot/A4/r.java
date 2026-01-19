package A4;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class r extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f294h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f295i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0007h f296j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC0007h interfaceC0007h, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f296j = interfaceC0007h;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((r) p((InterfaceC0905c) obj2, (z4.u) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        r rVar = new r(this.f296j, interfaceC0905c);
        rVar.f295i = obj;
        return rVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f294h;
        if (i6 == 0) {
            X3.a.e(obj);
            C0016q c0016q = new C0016q((z4.u) this.f295i, 0);
            this.f294h = 1;
            Object b5 = this.f296j.b(c0016q, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (b5 == enumC0927a) {
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
