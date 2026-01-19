package W2;

import A4.g0;
import X2.C0688c;
import X2.C0692g;
import X3.y;
import a3.w;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import b4.InterfaceC0905c;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0692g f8870h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f8871i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C0692g c0692g, w wVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8870h = c0692g;
        this.f8871i = wVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        e eVar = (e) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        y yVar = y.a;
        eVar.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new e(this.f8870h, this.f8871i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        i5.a.a.getClass();
        N.k(new Object[0]);
        C0692g c0692g = this.f8870h;
        if (!c0692g.f9291v && !((Boolean) c0692g.f9274e.getValue()).booleanValue()) {
            c0692g.f9289t = 0;
            g0 g0Var = c0692g.f9281l;
            Boolean bool = Boolean.TRUE;
            g0Var.getClass();
            g0Var.l(null, bool);
            AbstractC1888A.y(O.i(c0692g), null, new C0688c(c0692g, null), 3);
        }
        w wVar = this.f8871i;
        wVar.getClass();
        AbstractC1888A.y(O.i(wVar), null, new a3.s(wVar, null), 3);
        return y.a;
    }
}
