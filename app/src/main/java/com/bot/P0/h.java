package P0;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f4438d = new h(S.l.f7374V, new r4.d(S.l.f7374V, S.l.f7374V), 0);
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final r4.d f4439b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4440c;

    public h(float f6, r4.d dVar, int i6) {
        this.a = f6;
        this.f4439b = dVar;
        this.f4440c = i6;
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final r4.d a() {
        return this.f4439b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && AbstractC1276k.b(this.f4439b, hVar.f4439b) && this.f4440c == hVar.f4440c;
    }

    public final int hashCode() {
        return ((this.f4439b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.f4440c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.f4439b);
        sb.append(", steps=");
        return B3.e.q(sb, this.f4440c, ')');
    }
}
