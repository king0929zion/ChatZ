package B4;

import A4.C0017s;
import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class v extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f635h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f636i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0017s f637j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0008i f638k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C0017s c0017s, InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f637j = c0017s;
        this.f638k = interfaceC0008i;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((v) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        v vVar = new v(this.f637j, this.f638k, interfaceC0905c);
        vVar.f636i = obj;
        return vVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f635h;
        if (i6 == 0) {
            X3.a.e(obj);
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f636i;
            this.f635h = 1;
            Object d6 = this.f637j.d(interfaceC1942y, this.f638k, this);
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
