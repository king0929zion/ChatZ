package Y3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class y {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9815b;

    public y(int i6, Object obj) {
        this.a = i6;
        this.f9815b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && AbstractC1276k.b(this.f9815b, yVar.f9815b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.f9815b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.f9815b + ')';
    }
}
