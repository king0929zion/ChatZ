package M4;

import java.util.Map;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class Q implements Map.Entry, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final Object f3437c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3438e;

    public Q(Object obj, Object obj2) {
        this.f3437c = obj;
        this.f3438e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q3 = (Q) obj;
        return AbstractC1276k.b(this.f3437c, q3.f3437c) && AbstractC1276k.b(this.f3438e, q3.f3438e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3437c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3438e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f3437c;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f3438e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f3437c + ", value=" + this.f3438e + ')';
    }
}
