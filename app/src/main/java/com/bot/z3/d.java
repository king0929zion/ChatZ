package Z3;

import java.util.ConcurrentModificationException;
import java.util.Map;
import m4.AbstractC1276k;
import n4.InterfaceC1375d;

/* loaded from: classes.dex */
public final class d implements Map.Entry, InterfaceC1375d {

    /* renamed from: c, reason: collision with root package name */
    public final f f10518c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10519e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10520f;

    public d(f fVar, int i6) {
        AbstractC1276k.f(fVar, "map");
        this.f10518c = fVar;
        this.f10519e = i6;
        this.f10520f = fVar.f10533k;
    }

    public final void a() {
        if (this.f10518c.f10533k != this.f10520f) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC1276k.b(entry.getKey(), getKey()) && AbstractC1276k.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f10518c.f10526c[this.f10519e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f10518c.f10527e;
        AbstractC1276k.c(objArr);
        return objArr[this.f10519e];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.f10518c;
        fVar.c();
        Object[] objArr = fVar.f10527e;
        if (objArr == null) {
            int length = fVar.f10526c.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f10527e = objArr;
        }
        int i6 = this.f10519e;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
