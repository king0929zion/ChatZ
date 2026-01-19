package T;

import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class A implements B0 {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1942y f7930c;

    public A(InterfaceC1942y interfaceC1942y) {
        this.f7930c = interfaceC1942y;
    }

    @Override // T.B0
    public final void a() {
        InterfaceC1942y interfaceC1942y = this.f7930c;
        if (interfaceC1942y instanceof E0) {
            ((E0) interfaceC1942y).d();
        } else {
            AbstractC1888A.j(interfaceC1942y, new J(1));
        }
    }

    @Override // T.B0
    public final void b() {
        InterfaceC1942y interfaceC1942y = this.f7930c;
        if (interfaceC1942y instanceof E0) {
            ((E0) interfaceC1942y).d();
        } else {
            AbstractC1888A.j(interfaceC1942y, new J(1));
        }
    }

    @Override // T.B0
    public final void e() {
    }
}
