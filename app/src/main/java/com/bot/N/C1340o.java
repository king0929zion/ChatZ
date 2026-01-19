package n;

/* renamed from: n.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1340o extends AbstractC1343r {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public float f13202b;

    public C1340o(float f6, float f7) {
        this.a = f6;
        this.f13202b = f7;
    }

    @Override // n.AbstractC1343r
    public final float a(int i6) {
        return i6 != 0 ? i6 != 1 ? S.l.f7374V : this.f13202b : this.a;
    }

    @Override // n.AbstractC1343r
    public final int b() {
        return 2;
    }

    @Override // n.AbstractC1343r
    public final AbstractC1343r c() {
        return new C1340o(S.l.f7374V, S.l.f7374V);
    }

    @Override // n.AbstractC1343r
    public final void d() {
        this.a = S.l.f7374V;
        this.f13202b = S.l.f7374V;
    }

    @Override // n.AbstractC1343r
    public final void e(float f6, int i6) {
        if (i6 == 0) {
            this.a = f6;
        } else {
            if (i6 != 1) {
                return;
            }
            this.f13202b = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1340o)) {
            return false;
        }
        C1340o c1340o = (C1340o) obj;
        return c1340o.a == this.a && c1340o.f13202b == this.f13202b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13202b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.f13202b;
    }
}
