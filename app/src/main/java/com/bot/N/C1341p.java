package n;

import j1.AbstractC1135a;

/* renamed from: n.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1341p extends AbstractC1343r {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public float f13211b;

    /* renamed from: c, reason: collision with root package name */
    public float f13212c;

    public C1341p(float f6, float f7, float f8) {
        this.a = f6;
        this.f13211b = f7;
        this.f13212c = f8;
    }

    @Override // n.AbstractC1343r
    public final float a(int i6) {
        return i6 != 0 ? i6 != 1 ? i6 != 2 ? S.l.f7374V : this.f13212c : this.f13211b : this.a;
    }

    @Override // n.AbstractC1343r
    public final int b() {
        return 3;
    }

    @Override // n.AbstractC1343r
    public final AbstractC1343r c() {
        return new C1341p(S.l.f7374V, S.l.f7374V, S.l.f7374V);
    }

    @Override // n.AbstractC1343r
    public final void d() {
        this.a = S.l.f7374V;
        this.f13211b = S.l.f7374V;
        this.f13212c = S.l.f7374V;
    }

    @Override // n.AbstractC1343r
    public final void e(float f6, int i6) {
        if (i6 == 0) {
            this.a = f6;
        } else if (i6 == 1) {
            this.f13211b = f6;
        } else {
            if (i6 != 2) {
                return;
            }
            this.f13212c = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1341p)) {
            return false;
        }
        C1341p c1341p = (C1341p) obj;
        return c1341p.a == this.a && c1341p.f13211b == this.f13211b && c1341p.f13212c == this.f13212c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13212c) + AbstractC1135a.a(this.f13211b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.f13211b + ", v3 = " + this.f13212c;
    }
}
