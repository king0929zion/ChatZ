package C4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import x4.AbstractC1888A;
import x4.AbstractC1913a;

/* loaded from: classes.dex */
public class r extends AbstractC1913a implements d4.d {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0905c f713g;

    public r(InterfaceC0905c interfaceC0905c, InterfaceC0910h interfaceC0910h) {
        super(interfaceC0910h, true, true);
        this.f713g = interfaceC0905c;
    }

    @Override // x4.l0
    public final boolean X() {
        return true;
    }

    @Override // d4.d
    public final d4.d g() {
        InterfaceC0905c interfaceC0905c = this.f713g;
        if (interfaceC0905c instanceof d4.d) {
            return (d4.d) interfaceC0905c;
        }
        return null;
    }

    @Override // x4.l0
    public void v(Object obj) {
        a.h(Y4.d.K(this.f713g), AbstractC1888A.A(obj));
    }

    @Override // x4.l0
    public void x(Object obj) {
        this.f713g.k(AbstractC1888A.A(obj));
    }
}
