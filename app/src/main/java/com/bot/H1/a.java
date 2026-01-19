package H1;

import b4.InterfaceC0910h;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class a implements AutoCloseable, InterfaceC1942y {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0910h f2020c;

    public a(InterfaceC0910h interfaceC0910h) {
        AbstractC1276k.f(interfaceC0910h, "coroutineContext");
        this.f2020c = interfaceC0910h;
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f2020c;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC1888A.i(this.f2020c, null);
    }
}
