package n;

import j1.AbstractC1135a;

/* renamed from: n.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342q extends AbstractC1343r {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public float f13215b;

    /* renamed from: c, reason: collision with root package name */
    public float f13216c;

    /* renamed from: d, reason: collision with root package name */
    public float f13217d;

    public C1342q(float f6, float f7, float f8, float f9) {
        this.a = f6;
        this.f13215b = f7;
        this.f13216c = f8;
        this.f13217d = f9;
    }

    @Override // n.AbstractC1343r
    public final float a(int i6) {
        return i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? S.l.f7374V : this.f13217d : this.f13216c : this.f13215b : this.a;
    }

    @Override // n.AbstractC1343r
    public final int b() {
        return 4;
    }

    @Override // n.AbstractC1343r
    public final AbstractC1343r c() {
        return new C1342q(S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V);
    }

    @Override // n.AbstractC1343r
    public final void d() {
        this.a = S.l.f7374V;
        this.f13215b = S.l.f7374V;
        this.f13216c = S.l.f7374V;
        this.f13217d = S.l.f7374V;
    }

    @Override // n.AbstractC1343r
    public final void e(float f6, int i6) {
        if (i6 == 0) {
            this.a = f6;
            return;
        }
        if (i6 == 1) {
            this.f13215b = f6;
        } else if (i6 == 2) {
            this.f13216c = f6;
        } else {
            if (i6 != 3) {
                return;
            }
            this.f13217d = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1342q)) {
            return false;
        }
        C1342q c1342q = (C1342q) obj;
        return c1342q.a == this.a && c1342q.f13215b == this.f13215b && c1342q.f13216c == this.f13216c && c1342q.f13217d == this.f13217d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13217d) + AbstractC1135a.a(this.f13216c, AbstractC1135a.a(this.f13215b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.f13215b + ", v3 = " + this.f13216c + ", v4 = " + this.f13217d;
    }
}
