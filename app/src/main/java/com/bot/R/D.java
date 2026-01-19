package R;

import Q.s3;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class D implements PointerInputEventHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s3 f6688b;

    public /* synthetic */ D(s3 s3Var, int i6) {
        this.a = i6;
        this.f6688b = s3Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(B0.D d6, InterfaceC0905c interfaceC0905c) {
        switch (this.a) {
            case 0:
                Object l3 = AbstractC1888A.l(new C(d6, this.f6688b, null), interfaceC0905c);
                return l3 == EnumC0927a.f11114c ? l3 : X3.y.a;
            default:
                Object l5 = AbstractC1888A.l(new G(d6, this.f6688b, null), interfaceC0905c);
                return l5 == EnumC0927a.f11114c ? l5 : X3.y.a;
        }
    }
}
