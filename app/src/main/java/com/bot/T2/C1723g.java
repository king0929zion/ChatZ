package t2;

import io.ktor.utils.io.u;
import m4.AbstractC1276k;

/* renamed from: t2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1723g {

    /* renamed from: c, reason: collision with root package name */
    public static final C1723g f14909c;
    public final u a;

    /* renamed from: b, reason: collision with root package name */
    public final u f14910b;

    static {
        C1718b c1718b = C1718b.f14901b;
        f14909c = new C1723g(c1718b, c1718b);
    }

    public C1723g(u uVar, u uVar2) {
        this.a = uVar;
        this.f14910b = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1723g)) {
            return false;
        }
        C1723g c1723g = (C1723g) obj;
        return AbstractC1276k.b(this.a, c1723g.a) && AbstractC1276k.b(this.f14910b, c1723g.f14910b);
    }

    public final int hashCode() {
        return this.f14910b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.f14910b + ')';
    }
}
