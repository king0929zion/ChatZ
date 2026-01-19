package D;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.C1551a1;
import r.C1598q0;
import r.O1;
import r.f2;
import t.C1682j;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class U0 implements PointerInputEventHandler {
    public final /* synthetic */ InterfaceC1942y a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T.X f936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1682j f937c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T.X f938d;

    public U0(InterfaceC1942y interfaceC1942y, T.X x5, C1682j c1682j, T.X x6) {
        this.a = interfaceC1942y;
        this.f936b = x5;
        this.f937c = c1682j;
        this.f938d = x6;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(B0.D d6, InterfaceC0905c interfaceC0905c) {
        T0 t02 = new T0(this.a, this.f936b, this.f937c, null);
        C0103y c0103y = new C0103y(this.f938d, 2);
        C1598q0 c1598q0 = f2.a;
        Object l3 = AbstractC1888A.l(new O1(d6, t02, c0103y, new C1551a1(d6), null), interfaceC0905c);
        X3.y yVar = X3.y.a;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (l3 != enumC0927a) {
            l3 = yVar;
        }
        return l3 == enumC0927a ? l3 : yVar;
    }
}
