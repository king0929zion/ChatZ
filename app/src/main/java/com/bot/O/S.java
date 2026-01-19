package O;

import D.AbstractC0090r0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class S implements PointerInputEventHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D.H0 f4035b;

    public /* synthetic */ S(D.H0 h02, int i6) {
        this.a = i6;
        this.f4035b = h02;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(B0.D d6, InterfaceC0905c interfaceC0905c) {
        switch (this.a) {
            case 0:
                Object p5 = AbstractC0090r0.p(d6, this.f4035b, interfaceC0905c);
                return p5 == EnumC0927a.f11114c ? p5 : X3.y.a;
            default:
                Object p6 = AbstractC0090r0.p(d6, this.f4035b, interfaceC0905c);
                return p6 == EnumC0927a.f11114c ? p6 : X3.y.a;
        }
    }
}
