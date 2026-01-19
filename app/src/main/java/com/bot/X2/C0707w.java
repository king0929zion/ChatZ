package X2;

import A4.C0022x;
import A4.InterfaceC0007h;
import A4.g0;
import B4.AbstractC0050c;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import u4.AbstractC1776n;

/* renamed from: X2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707w extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9375h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9376i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f9377j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0707w(L l3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9377j = l3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0707w) p((InterfaceC0905c) obj2, (String) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0707w c0707w = new C0707w(this.f9377j, interfaceC0905c);
        c0707w.f9376i = obj;
        return c0707w;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        L l3 = this.f9377j;
        g0 g0Var = l3.f9221v;
        String str = (String) this.f9376i;
        int i6 = this.f9375h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        if (AbstractC1776n.Q(str)) {
            l3.f9214o.clear();
            g0Var.getClass();
            g0Var.l(null, P.a);
            return yVar;
        }
        g0Var.getClass();
        g0Var.l(null, Q.a);
        I2.v vVar = l3.f9201b;
        vVar.getClass();
        C0022x c0022x = new C0022x(vVar.f2687b.observeMessages(str), vVar, 5);
        A4.Q q3 = l3.f9202c.f3401e;
        C0705u c0705u = new C0705u(l3, str, null);
        C0706v c0706v = new C0706v(l3, 0);
        this.f9376i = null;
        this.f9375h = 1;
        Object a = AbstractC0050c.a(c0706v, this, new A4.L(c0705u, (InterfaceC0905c) null), new InterfaceC0007h[]{c0022x, q3});
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (a != enumC0927a) {
            a = yVar;
        }
        return a == enumC0927a ? enumC0927a : yVar;
    }
}
