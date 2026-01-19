package androidx.lifecycle;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class C extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10815h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10816i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.e f10817j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10817j = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C c6 = new C(this.f10817j, interfaceC0905c);
        c6.f10816i = obj;
        return c6;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10815h;
        if (i6 == 0) {
            X3.a.e(obj);
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f10816i;
            this.f10815h = 1;
            Object m3 = this.f10817j.m(interfaceC1942y, this);
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
