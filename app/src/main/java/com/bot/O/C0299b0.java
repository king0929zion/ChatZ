package O;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.f2;

/* renamed from: O.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299b0 implements PointerInputEventHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l4.c f4079b;

    public /* synthetic */ C0299b0(l4.c cVar, int i6) {
        this.a = i6;
        this.f4079b = cVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(B0.D d6, InterfaceC0905c interfaceC0905c) {
        switch (this.a) {
            case 0:
                Object M02 = ((B0.X) d6).M0(new C0297a0(null, this.f4079b), interfaceC0905c);
                return M02 == EnumC0927a.f11114c ? M02 : X3.y.a;
            default:
                Object e6 = f2.e(d6, null, null, new P2.r(this.f4079b, 4), interfaceC0905c, 7);
                return e6 == EnumC0927a.f11114c ? e6 : X3.y.a;
        }
    }
}
