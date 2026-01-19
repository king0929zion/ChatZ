package k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1156c implements Set {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1159f f12531c;

    public C1156c(C1159f c1159f) {
        this.f12531c = c1159f;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12531c.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12531c.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f12531c.b(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C1159f c1159f = this.f12531c;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (c1159f.f12539f == set.size()) {
                return c1159f.b(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C1159f c1159f = this.f12531c;
        int i6 = 0;
        for (int i7 = c1159f.f12539f - 1; i7 >= 0; i7--) {
            Object g3 = c1159f.g(i7);
            i6 += g3 == null ? 0 : g3.hashCode();
        }
        return i6;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12531c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1155b(this.f12531c, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C1159f c1159f = this.f12531c;
        int e6 = c1159f.e(obj);
        if (e6 < 0) {
            return false;
        }
        c1159f.i(e6);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1159f c1159f = this.f12531c;
        int i6 = c1159f.f12539f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c1159f.remove(it.next());
        }
        return i6 != c1159f.f12539f;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1159f c1159f = this.f12531c;
        int i6 = c1159f.f12539f;
        for (int i7 = i6 - 1; i7 >= 0; i7--) {
            if (!collection.contains(c1159f.g(i7))) {
                c1159f.i(i7);
            }
        }
        return i6 != c1159f.f12539f;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12531c.f12539f;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C1159f c1159f = this.f12531c;
        int i6 = c1159f.f12539f;
        Object[] objArr = new Object[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = c1159f.g(i7);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1159f c1159f = this.f12531c;
        int i6 = c1159f.f12539f;
        if (objArr.length < i6) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i6);
        }
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = c1159f.g(i7);
        }
        if (objArr.length > i6) {
            objArr[i6] = null;
        }
        return objArr;
    }
}
