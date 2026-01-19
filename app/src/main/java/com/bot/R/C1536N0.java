package r;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import f0.C0990m;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: r.N0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1536N0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14091h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14092i;

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1536N0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d4.i, r.N0, b4.c] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        d4.i iVar = new d4.i(2, interfaceC0905c);
        iVar.f14092i = obj;
        return iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        InterfaceC1942y interfaceC1942y;
        int i6 = this.f14091h;
        if (i6 == 0) {
            X3.a.e(obj);
            interfaceC1942y = (InterfaceC1942y) this.f14092i;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1942y = (InterfaceC1942y) this.f14092i;
            X3.a.e(obj);
        }
        while (AbstractC1888A.v(interfaceC1942y.c())) {
            C0990m c0990m = new C0990m(27);
            this.f14092i = interfaceC1942y;
            this.f14091h = 1;
            InterfaceC0910h interfaceC0910h = this.f11435e;
            AbstractC1276k.c(interfaceC0910h);
            Object a = T.r.w(interfaceC0910h).a(this, c0990m);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (a == enumC0927a) {
                return enumC0927a;
            }
        }
        return X3.y.a;
    }
}
