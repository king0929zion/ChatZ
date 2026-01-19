package B4;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: B4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f586h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f587i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC0054g f588j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053f(AbstractC0054g abstractC0054g, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f588j = abstractC0054g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0053f) p((InterfaceC0905c) obj2, (z4.u) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0053f c0053f = new C0053f(this.f588j, interfaceC0905c);
        c0053f.f587i = obj;
        return c0053f;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f586h;
        if (i6 == 0) {
            X3.a.e(obj);
            z4.u uVar = (z4.u) this.f587i;
            this.f586h = 1;
            Object e6 = this.f588j.e(uVar, this);
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
