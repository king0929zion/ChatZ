package k;

import F0.x0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* renamed from: k.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176x implements Map, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final M f12583c;

    /* renamed from: e, reason: collision with root package name */
    public C1162i f12584e;

    /* renamed from: f, reason: collision with root package name */
    public C1162i f12585f;

    /* renamed from: g, reason: collision with root package name */
    public x0 f12586g;

    public C1176x(M m3) {
        AbstractC1276k.f(m3, "parent");
        this.f12583c = m3;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f12583c.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f12583c.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1162i c1162i = this.f12584e;
        if (c1162i != null) {
            return c1162i;
        }
        C1162i c1162i2 = new C1162i(this.f12583c, 0);
        this.f12584e = c1162i2;
        return c1162i2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1176x.class != obj.getClass()) {
            return false;
        }
        return AbstractC1276k.b(this.f12583c, ((C1176x) obj).f12583c);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f12583c.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f12583c.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f12583c.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1162i c1162i = this.f12585f;
        if (c1162i != null) {
            return c1162i;
        }
        C1162i c1162i2 = new C1162i(this.f12583c, 1);
        this.f12585f = c1162i2;
        return c1162i2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12583c.f12488e;
    }

    public final String toString() {
        return this.f12583c.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        x0 x0Var = this.f12586g;
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0Var2 = new x0(this.f12583c);
        this.f12586g = x0Var2;
        return x0Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
