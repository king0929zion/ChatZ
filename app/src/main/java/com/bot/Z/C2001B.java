package z;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import p.x0;
import x4.InterfaceC1942y;

/* renamed from: z.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2001B extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f16030h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2004b f16031i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2001B(C2004b c2004b, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f16031i = c2004b;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C2001B) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C2001B(this.f16031i, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [d4.i, l4.e] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f16030h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        this.f16030h = 1;
        Object s5 = E.s(this.f16031i, x0.f13823c, new d4.i(2, null), this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (s5 != enumC0927a) {
            s5 = yVar;
        }
        return s5 == enumC0927a ? enumC0927a : yVar;
    }
}
