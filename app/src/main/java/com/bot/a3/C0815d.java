package a3;

import A4.g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: a3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815d extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public g0 f10645h;

    /* renamed from: i, reason: collision with root package name */
    public int f10646i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0818g f10647j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815d(C0818g c0818g, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10647j = c0818g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0815d) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0815d(this.f10647j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        g0 g0Var;
        int i6 = this.f10646i;
        if (i6 == 0) {
            X3.a.e(obj);
            C0818g c0818g = this.f10647j;
            g0Var = c0818g.f10657c;
            Y2.x xVar = c0818g.f10656b;
            this.f10645h = g0Var;
            this.f10646i = 1;
            obj = xVar.a(this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = this.f10645h;
            X3.a.e(obj);
        }
        g0Var.k(obj);
        return X3.y.a;
    }
}
