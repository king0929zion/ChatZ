package N3;

import java.util.Map;
import m4.AbstractC1276k;
import n4.InterfaceC1375d;

/* loaded from: classes.dex */
public final class n implements Map.Entry, InterfaceC1375d {

    /* renamed from: c, reason: collision with root package name */
    public final Object f3873c;

    /* renamed from: e, reason: collision with root package name */
    public Object f3874e;

    public n(Object obj, Object obj2) {
        this.f3873c = obj;
        this.f3874e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC1276k.b(entry.getKey(), this.f3873c) && AbstractC1276k.b(entry.getValue(), this.f3874e)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3873c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3874e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f3873c;
        AbstractC1276k.c(obj);
        int hashCode = obj.hashCode() + 527;
        Object obj2 = this.f3874e;
        AbstractC1276k.c(obj2);
        return obj2.hashCode() + hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f3874e = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3873c);
        sb.append('=');
        sb.append(this.f3874e);
        return sb.toString();
    }
}
