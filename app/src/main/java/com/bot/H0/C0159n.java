package H0;

import j1.AbstractC1135a;

/* renamed from: H0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159n {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1975b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1976c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1977d;

    public C0159n(float f6, float f7, float f8, float f9) {
        this.a = f6;
        this.f1975b = f7;
        this.f1976c = f8;
        this.f1977d = f9;
        if (f6 < S.l.f7374V) {
            E0.a.a("Left must be non-negative");
        }
        if (f7 < S.l.f7374V) {
            E0.a.a("Top must be non-negative");
        }
        if (f8 < S.l.f7374V) {
            E0.a.a("Right must be non-negative");
        }
        if (f9 >= S.l.f7374V) {
            return;
        }
        E0.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0159n)) {
            return false;
        }
        C0159n c0159n = (C0159n) obj;
        return e1.f.c(this.a, c0159n.a) && e1.f.c(this.f1975b, c0159n.f1975b) && e1.f.c(this.f1976c, c0159n.f1976c) && e1.f.c(this.f1977d, c0159n.f1977d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC1135a.a(this.f1977d, AbstractC1135a.a(this.f1976c, AbstractC1135a.a(this.f1975b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) e1.f.d(this.a)) + ", top=" + ((Object) e1.f.d(this.f1975b)) + ", end=" + ((Object) e1.f.d(this.f1976c)) + ", bottom=" + ((Object) e1.f.d(this.f1977d)) + ", isLayoutDirectionAware=true)";
    }
}
