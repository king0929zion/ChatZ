package b3;

import B0.D;
import T.C0599c0;
import T.X;
import X3.y;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.AbstractC1573i;
import r.f2;

/* renamed from: b3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896l implements PointerInputEventHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0599c0 f11042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f11043c;

    public /* synthetic */ C0896l(C0599c0 c0599c0, X x5, int i6) {
        this.a = i6;
        this.f11042b = c0599c0;
        this.f11043c = x5;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(D d6, InterfaceC0905c interfaceC0905c) {
        switch (this.a) {
            case 0:
                Object h3 = AbstractC1573i.h(d6, new C0895k(this.f11042b, this.f11043c, null), interfaceC0905c);
                return h3 == EnumC0927a.f11114c ? h3 : y.a;
            default:
                Object e6 = f2.e(d6, new Z2.X(2, this.f11042b, this.f11043c), null, null, interfaceC0905c, 14);
                return e6 == EnumC0927a.f11114c ? e6 : y.a;
        }
    }
}
