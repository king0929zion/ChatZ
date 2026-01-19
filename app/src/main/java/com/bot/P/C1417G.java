package p;

/* renamed from: p.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417G {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final o0.N f13581b;

    public C1417G(float f6, o0.N n3) {
        this.a = f6;
        this.f13581b = n3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1417G)) {
            return false;
        }
        C1417G c1417g = (C1417G) obj;
        return e1.f.c(this.a, c1417g.a) && this.f13581b.equals(c1417g.f13581b);
    }

    public final int hashCode() {
        return this.f13581b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) e1.f.d(this.a)) + ", brush=" + this.f13581b + ')';
    }
}
