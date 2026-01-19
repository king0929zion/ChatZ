package B4;

import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class H extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f571h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f572i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0008i f573j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f573j = interfaceC0008i;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((H) p((InterfaceC0905c) obj2, obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        H h3 = new H(this.f573j, interfaceC0905c);
        h3.f572i = obj;
        return h3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f571h;
        if (i6 == 0) {
            X3.a.e(obj);
            Object obj2 = this.f572i;
            this.f571h = 1;
            Object a = this.f573j.a(obj2, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (a == enumC0927a) {
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
