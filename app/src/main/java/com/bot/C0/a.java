package C0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class a {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public float f645b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && Float.compare(this.f645b, aVar.f645b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f645b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return AbstractC1135a.h(sb, this.f645b, ')');
    }
}
