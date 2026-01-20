package B0;

import H0.AbstractC0157l;
import I0.AbstractC0204q0;
import I0.C0206s;

/* loaded from: classes.dex */
public final class O extends AbstractC0032h {
    @Override // B0.AbstractC0032h
    public final void N0(InterfaceC0045v interfaceC0045v) {
        InterfaceC0046w interfaceC0046w = (InterfaceC0046w) AbstractC0157l.h(this, AbstractC0204q0.f2371u);
        if (interfaceC0046w != null) {
            ((C0206s) interfaceC0046w).a = interfaceC0045v;
        }
    }

    @Override // B0.AbstractC0032h
    public final boolean P0(int i6) {
        return i6 == 3 || i6 == 4;
    }

    @Override // H0.F0Inner
    public final /* bridge */ /* synthetic */ Object m() {
        return "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
