package k;

import i1.AbstractC1087g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1162i implements Set, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12556c;

    /* renamed from: e, reason: collision with root package name */
    public final M f12557e;

    public C1162i(M m3, int i6) {
        this.f12556c = i6;
        switch (i6) {
            case 1:
                AbstractC1276k.f(m3, "parent");
                this.f12557e = m3;
                return;
            default:
                AbstractC1276k.f(m3, "parent");
                this.f12557e = m3;
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f12556c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f12556c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f12556c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f12556c) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1276k.f(entry, "element");
                return AbstractC1276k.b(this.f12557e.g(entry.getKey()), entry.getValue());
            default:
                return this.f12557e.c(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f12556c) {
            case 0:
                AbstractC1276k.f(collection, "elements");
                Collection<Map.Entry> collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : collection2) {
                    if (!AbstractC1276k.b(this.f12557e.g(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            default:
                AbstractC1276k.f(collection, "elements");
                Collection collection3 = collection;
                if (collection3.isEmpty()) {
                    return true;
                }
                Iterator it = collection3.iterator();
                while (it.hasNext()) {
                    if (!this.f12557e.c(it.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f12556c) {
            case 0:
                return this.f12557e.i();
            default:
                return this.f12557e.i();
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f12556c) {
            case 0:
                return AbstractC1087g.m(new C1161h(this, null));
            default:
                return AbstractC1087g.m(new C1170q(this, null));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f12556c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f12556c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f12556c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f12556c) {
            case 0:
                return this.f12557e.f12488e;
            default:
                return this.f12557e.f12488e;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f12556c) {
            case 0:
                return AbstractC1275j.a(this);
            default:
                return AbstractC1275j.a(this);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f12556c) {
            case 0:
                AbstractC1276k.f(objArr, "array");
                return AbstractC1275j.b(this, objArr);
            default:
                AbstractC1276k.f(objArr, "array");
                return AbstractC1275j.b(this, objArr);
        }
    }
}
