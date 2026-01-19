package N;

import B0.D;
import O.AbstractC0336u0;
import X3.y;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class j implements PointerInputEventHandler {
    public final /* synthetic */ l a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3573b;

    public j(l lVar, k kVar) {
        this.a = lVar;
        this.f3573b = kVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(D d6, InterfaceC0905c interfaceC0905c) {
        Object n3 = AbstractC0336u0.n(d6, this.a, this.f3573b, interfaceC0905c);
        return n3 == EnumC0927a.f11114c ? n3 : y.a;
    }
}
