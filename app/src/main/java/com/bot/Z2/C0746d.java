package Z2;

import D.C0103y;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.f2;

/* renamed from: Z2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746d implements PointerInputEventHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T.X f10173b;

    public /* synthetic */ C0746d(T.X x5, int i6) {
        this.a = i6;
        this.f10173b = x5;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(B0.D d6, InterfaceC0905c interfaceC0905c) {
        switch (this.a) {
            case 0:
                Object e6 = f2.e(d6, null, null, new C0103y(this.f10173b, 15), interfaceC0905c, 7);
                return e6 == EnumC0927a.f11114c ? e6 : X3.y.a;
            case 1:
                Object e7 = f2.e(d6, null, null, new C0103y(this.f10173b, 21), interfaceC0905c, 7);
                return e7 == EnumC0927a.f11114c ? e7 : X3.y.a;
            default:
                Object e8 = f2.e(d6, null, null, new A0(this.f10173b, 10), interfaceC0905c, 7);
                return e8 == EnumC0927a.f11114c ? e8 : X3.y.a;
        }
    }
}
