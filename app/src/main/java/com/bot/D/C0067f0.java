package D;

import O.C0329q0;
import O.C0332s0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.AbstractC1573i;
import x4.AbstractC1888A;

/* renamed from: D.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067f0 implements PointerInputEventHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1017c;

    public /* synthetic */ C0067f0(int i6, Object obj, Object obj2) {
        this.a = i6;
        this.f1016b = obj;
        this.f1017c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(B0.D d6, InterfaceC0905c interfaceC0905c) {
        switch (this.a) {
            case 0:
                Object l3 = AbstractC1888A.l(new C0065e0(d6, (H0) this.f1016b, (O.N0) this.f1017c, null), interfaceC0905c);
                return l3 == EnumC0927a.f11114c ? l3 : X3.y.a;
            default:
                Object h3 = AbstractC1573i.h(d6, new C0329q0((C0332s0) this.f1016b, (O.L) this.f1017c, null), interfaceC0905c);
                return h3 == EnumC0927a.f11114c ? h3 : X3.y.a;
        }
    }
}
