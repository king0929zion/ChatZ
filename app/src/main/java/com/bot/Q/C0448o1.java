package Q;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import l4.InterfaceC1193a;

/* renamed from: Q.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448o1 implements PointerInputEventHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f6024b;

    public /* synthetic */ C0448o1(int i6, InterfaceC1193a interfaceC1193a) {
        this.a = i6;
        this.f6024b = interfaceC1193a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(B0.D d6, InterfaceC0905c interfaceC0905c) {
        switch (this.a) {
            case 0:
                Object e6 = r.f2.e(d6, null, null, new O.x0(3, this.f6024b), interfaceC0905c, 7);
                return e6 == EnumC0927a.f11114c ? e6 : X3.y.a;
            default:
                Object e7 = r.f2.e(d6, null, null, new O.x0(7, this.f6024b), interfaceC0905c, 7);
                return e7 == EnumC0927a.f11114c ? e7 : X3.y.a;
        }
    }
}
