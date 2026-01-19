package m;

import h0.InterfaceC1028e;
import m4.AbstractC1276k;
import n.InterfaceC1351z;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197D {
    public final InterfaceC1028e a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.c f12709b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1351z f12710c;

    public C1197D(InterfaceC1028e interfaceC1028e, l4.c cVar, InterfaceC1351z interfaceC1351z) {
        this.a = interfaceC1028e;
        this.f12709b = cVar;
        this.f12710c = interfaceC1351z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1197D)) {
            return false;
        }
        C1197D c1197d = (C1197D) obj;
        return AbstractC1276k.b(this.a, c1197d.a) && AbstractC1276k.b(this.f12709b, c1197d.f12709b) && AbstractC1276k.b(this.f12710c, c1197d.f12710c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f12710c.hashCode() + ((this.f12709b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.f12709b + ", animationSpec=" + this.f12710c + ", clip=true)";
    }
}
