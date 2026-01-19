package N3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;
import n4.InterfaceC1376e;

/* loaded from: classes.dex */
public final class h implements Map, InterfaceC1376e {

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3863c = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f3863c.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        AbstractC1276k.f(str, "key");
        return this.f3863c.containsKey(new i(str));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f3863c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new m(this.f3863c.entrySet(), g.f3858f, g.f3859g);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        return AbstractC1276k.b(((h) obj).f3863c, this.f3863c);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        AbstractC1276k.f(str, "key");
        return this.f3863c.get(h5.e.I(str));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f3863c.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3863c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new m(this.f3863c.keySet(), g.f3860h, g.f3861i);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        AbstractC1276k.f(str, "key");
        AbstractC1276k.f(obj2, "value");
        return this.f3863c.put(h5.e.I(str), obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        AbstractC1276k.f(map, "from");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            AbstractC1276k.f(str, "key");
            AbstractC1276k.f(value, "value");
            this.f3863c.put(h5.e.I(str), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        AbstractC1276k.f(str, "key");
        return this.f3863c.remove(h5.e.I(str));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3863c.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f3863c.values();
    }
}
