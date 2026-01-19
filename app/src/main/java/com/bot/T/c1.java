package T;

import g0.InterfaceC1015c;
import java.util.Iterator;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class c1 implements InterfaceC1015c, Iterable, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final J0 f8073c;

    /* renamed from: e, reason: collision with root package name */
    public final int f8074e;

    /* renamed from: f, reason: collision with root package name */
    public final A0 f8075f;

    public c1(J0 j02, int i6, M m3, A0 a02) {
        this.f8073c = j02;
        this.f8074e = i6;
        this.f8075f = a02;
        m3.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return c1Var.f8074e == this.f8074e && c1Var.f8073c.equals(this.f8073c) && c1Var.f8075f.equals(this.f8075f);
    }

    public final int hashCode() {
        return this.f8075f.hashCode() + ((this.f8073c.hashCode() + (this.f8074e * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b1(this.f8073c, this.f8074e, null, this.f8075f);
    }
}
