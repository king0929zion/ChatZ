package b3;

import A4.C0010k;
import A4.W;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;
import z.C2004b;

/* renamed from: b3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894j extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f11035h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2004b f11036i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.c f11037j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0894j(C2004b c2004b, l4.c cVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f11036i = c2004b;
        this.f11037j = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0894j) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0894j(this.f11036i, this.f11037j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f11035h;
        if (i6 == 0) {
            X3.a.e(obj);
            C0010k H3 = T.r.H(new C0892h(this.f11036i, 0));
            C0893i c0893i = new C0893i(null, this.f11037j);
            this.f11035h = 1;
            Object f6 = W.f(H3, c0893i, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (f6 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return y.a;
    }
}
