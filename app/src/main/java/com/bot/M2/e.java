package M2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e {
    public final f a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3282b;

    public e(f fVar, String str) {
        this.a = fVar;
        this.f3282b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && AbstractC1276k.b(this.f3282b, eVar.f3282b);
    }

    public final int hashCode() {
        return this.f3282b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StreamBlockSnapshot(type=" + this.a + ", content=" + this.f3282b + ")";
    }
}
