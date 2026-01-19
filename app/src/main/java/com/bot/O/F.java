package O;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class F {
    public final d1.j a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3941b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3942c;

    public F(d1.j jVar, int i6, long j3) {
        this.a = jVar;
        this.f3941b = i6;
        this.f3942c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        return this.a == f6.a && this.f3941b == f6.f3941b && this.f3942c == f6.f3942c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3942c) + AbstractC1135a.b(this.f3941b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.f3941b + ", selectableId=" + this.f3942c + ')';
    }
}
