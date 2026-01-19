package B4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;

/* loaded from: classes.dex */
public final class F implements InterfaceC0905c, d4.d {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0905c f569c;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0910h f570e;

    public F(InterfaceC0905c interfaceC0905c, InterfaceC0910h interfaceC0910h) {
        this.f569c = interfaceC0905c;
        this.f570e = interfaceC0910h;
    }

    @Override // d4.d
    public final d4.d g() {
        InterfaceC0905c interfaceC0905c = this.f569c;
        if (interfaceC0905c instanceof d4.d) {
            return (d4.d) interfaceC0905c;
        }
        return null;
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        this.f569c.k(obj);
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        return this.f570e;
    }
}
