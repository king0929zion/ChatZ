package x4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;

/* loaded from: classes.dex */
public final class m0 extends s0 {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0905c f15718g;

    public m0(InterfaceC0910h interfaceC0910h, l4.e eVar) {
        super(interfaceC0910h, true, false);
        this.f15718g = Y4.d.x(this, this, eVar);
    }

    @Override // x4.l0
    public final void g0() {
        try {
            C4.a.h(Y4.d.K(this.f15718g), X3.y.a);
        } catch (Throwable th) {
            k(X3.a.b(th));
            throw th;
        }
    }
}
