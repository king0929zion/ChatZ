package Z2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import u4.AbstractC1776n;
import x4.InterfaceC1942y;

/* renamed from: Z2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777t extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10320h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a3.w f10321i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.c f10322j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777t(a3.w wVar, l4.c cVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10321i = wVar;
        this.f10322j = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0777t) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0777t(this.f10321i, this.f10322j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10320h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f10320h = 1;
            this.f10321i.B();
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if ("new" == enumC0927a) {
                return enumC0927a;
            }
            obj = "new";
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        String str = (String) obj;
        if (str != null && !AbstractC1776n.Q(str)) {
            this.f10322j.f(str);
        }
        return X3.y.a;
    }
}
