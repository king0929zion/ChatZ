package T;

import g0.InterfaceC1015c;
import java.util.Iterator;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class K0 implements InterfaceC1015c, Iterable, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final J0 f7979c;

    /* renamed from: e, reason: collision with root package name */
    public final int f7980e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7981f;

    public K0(J0 j02, int i6, int i7) {
        this.f7979c = j02;
        this.f7980e = i6;
        this.f7981f = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        return k02.f7980e == this.f7980e && k02.f7981f == this.f7981f && AbstractC1276k.b(k02.f7979c, this.f7979c);
    }

    public final int hashCode() {
        return (this.f7979c.hashCode() * 31) + this.f7980e;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        J0 j02 = this.f7979c;
        if (j02.f7973k != this.f7981f) {
            L0.f();
        }
        int i6 = this.f7980e;
        j02.f(i6);
        return new L(j02, i6 + 1, j02.f7966c[(i6 * 5) + 3] + i6);
    }
}
