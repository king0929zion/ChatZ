package a3;

import A4.g0;
import Y2.U;
import Y2.W;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.List;
import x4.InterfaceC1942y;

/* renamed from: a3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825n extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10678h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f10679i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0825n(w wVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10679i = wVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0825n) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0825n(this.f10679i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10678h;
        w wVar = this.f10679i;
        if (i6 == 0) {
            X3.a.e(obj);
            List list = (List) wVar.f10743i.getValue();
            W w5 = wVar.f10729b;
            this.f10678h = 1;
            w5.getClass();
            obj = w5.c(this, new U(list, w5, null));
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        D2.i iVar = (D2.i) obj;
        if (!(iVar instanceof D2.h)) {
            if (iVar instanceof D2.f) {
                g0 g0Var = wVar.f10720S;
                String str = ((D2.f) iVar).a;
                g0Var.getClass();
                g0Var.l(null, str);
            } else if (!(iVar instanceof D2.g)) {
                throw new RuntimeException();
            }
        }
        return X3.y.a;
    }
}
