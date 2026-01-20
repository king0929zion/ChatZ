package B0;

import H0.AbstractC0157l;
import I0.AbstractC0204q0;
import I0.C0206s;

/* renamed from: B0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043t extends AbstractC0032h {
    @Override // B0.AbstractC0032h
    public final void N0(InterfaceC0045v interfaceC0045v) {
        InterfaceC0046w interfaceC0046w = (InterfaceC0046w) AbstractC0157l.h(this, AbstractC0204q0.f2371u);
        if (interfaceC0046w != null) {
            C0206s c0206s = (C0206s) interfaceC0046w;
            if (interfaceC0045v == null) {
                InterfaceC0045v.a.getClass();
                interfaceC0045v = AbstractC0047x.a;
            }
            I0.I.a.a(c0206s.f2383b, interfaceC0045v);
        }
    }

    @Override // B0.AbstractC0032h
    public final boolean P0(int i6) {
        return (i6 == 3 || i6 == 4) ? false : true;
    }

    @Override // H0.F0Inner
    public final /* bridge */ /* synthetic */ Object m() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
