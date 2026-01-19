package S0;

import m4.AbstractC1276k;

/* renamed from: S0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551m extends AbstractC0552n {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final M f7642b;

    public C0551m(String str, M m3) {
        this.a = str;
        this.f7642b = m3;
    }

    @Override // S0.AbstractC0552n
    public final M a() {
        return this.f7642b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0551m)) {
            return false;
        }
        C0551m c0551m = (C0551m) obj;
        if (!AbstractC1276k.b(this.a, c0551m.a) || !AbstractC1276k.b(this.f7642b, c0551m.f7642b)) {
            return false;
        }
        c0551m.getClass();
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        M m3 = this.f7642b;
        return (hashCode + (m3 != null ? m3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return B3.e.r(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }

    public /* synthetic */ C0551m(String str, M m3, int i6) {
        this(str, (i6 & 2) != 0 ? null : m3);
    }
}
