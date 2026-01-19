package T;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class V0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f8039h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f8040i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.e f8041j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X f8042k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(l4.e eVar, X x5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8041j = eVar;
        this.f8042k = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((V0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        V0 v02 = new V0(this.f8041j, this.f8042k, interfaceC0905c);
        v02.f8040i = obj;
        return v02;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f8039h;
        if (i6 == 0) {
            X3.a.e(obj);
            C0621n0 c0621n0 = new C0621n0(this.f8042k, ((InterfaceC1942y) this.f8040i).c());
            this.f8039h = 1;
            Object m3 = this.f8041j.m(c0621n0, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (m3 == enumC0927a) {
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
