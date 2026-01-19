package E4;

import b4.InterfaceC0910h;
import x4.AbstractC1939v;

/* loaded from: classes.dex */
public final class l extends AbstractC1939v {

    /* renamed from: f, reason: collision with root package name */
    public static final l f1372f = new AbstractC1939v();

    @Override // x4.AbstractC1939v
    public final void d0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        e.f1362g.f1363f.d(runnable, true, false);
    }

    @Override // x4.AbstractC1939v
    public final void e0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        e.f1362g.f1363f.d(runnable, true, true);
    }

    @Override // x4.AbstractC1939v
    public final AbstractC1939v g0(int i6) {
        C4.a.a(i6);
        return i6 >= k.f1369d ? this : super.g0(i6);
    }

    @Override // x4.AbstractC1939v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
