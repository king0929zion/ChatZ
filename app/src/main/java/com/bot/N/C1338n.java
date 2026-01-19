package n;

/* renamed from: n.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1338n extends AbstractC1343r {
    public float a;

    public C1338n(float f6) {
        this.a = f6;
    }

    @Override // n.AbstractC1343r
    public final float a(int i6) {
        return i6 == 0 ? this.a : S.l.f7374V;
    }

    @Override // n.AbstractC1343r
    public final int b() {
        return 1;
    }

    @Override // n.AbstractC1343r
    public final AbstractC1343r c() {
        return new C1338n(S.l.f7374V);
    }

    @Override // n.AbstractC1343r
    public final void d() {
        this.a = S.l.f7374V;
    }

    @Override // n.AbstractC1343r
    public final void e(float f6, int i6) {
        if (i6 == 0) {
            this.a = f6;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1338n) && ((C1338n) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
