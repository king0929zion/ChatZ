package n;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: n.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1301J {
    public final Float a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1349x f13008b;

    public C1301J(Float f6, InterfaceC1349x interfaceC1349x) {
        this.a = f6;
        this.f13008b = interfaceC1349x;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1301J)) {
            return false;
        }
        C1301J c1301j = (C1301J) obj;
        return c1301j.a.equals(this.a) && AbstractC1276k.b(c1301j.f13008b, this.f13008b);
    }

    public final int hashCode() {
        return this.f13008b.hashCode() + AbstractC1135a.b(0, this.a.hashCode() * 31, 31);
    }
}
