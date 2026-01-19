package T;

import g0.InterfaceC1015c;
import m4.AbstractC1276k;

/* renamed from: T.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637w implements InterfaceC1015c {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0631t f8223c;

    public C0637w(InterfaceC0631t interfaceC0631t) {
        this.f8223c = interfaceC0631t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0637w) {
            return AbstractC1276k.b(this.f8223c, ((C0637w) obj).f8223c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8223c.hashCode() * 31;
    }
}
