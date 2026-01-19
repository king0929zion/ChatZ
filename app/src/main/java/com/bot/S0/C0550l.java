package S0;

import m4.AbstractC1276k;

/* renamed from: S0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550l extends AbstractC0552n {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final M f7641b;

    public C0550l(String str, M m3) {
        this.a = str;
        this.f7641b = m3;
    }

    @Override // S0.AbstractC0552n
    public final M a() {
        return this.f7641b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0550l)) {
            return false;
        }
        C0550l c0550l = (C0550l) obj;
        if (!AbstractC1276k.b(this.a, c0550l.a) || !AbstractC1276k.b(this.f7641b, c0550l.f7641b)) {
            return false;
        }
        c0550l.getClass();
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        M m3 = this.f7641b;
        return (hashCode + (m3 != null ? m3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return B3.e.r(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
