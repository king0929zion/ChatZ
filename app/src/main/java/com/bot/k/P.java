package k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;
import n4.InterfaceC1377f;

/* loaded from: classes.dex */
public final class P implements InterfaceC1377f, Set, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final N f12506c;

    /* renamed from: e, reason: collision with root package name */
    public final N f12507e;

    public P(N n3) {
        this.f12506c = n3;
        this.f12507e = n3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f12507e.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        N n3 = this.f12507e;
        int i6 = n3.f12492d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            n3.j(it.next());
        }
        return i6 != n3.f12492d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12507e.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12506c.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f12506c.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P.class != obj.getClass()) {
            return false;
        }
        return AbstractC1276k.b(this.f12506c, ((P) obj).f12506c);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f12506c.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12506c.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Z.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f12507e.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        N n3 = this.f12507e;
        n3.getClass();
        int i6 = n3.f12492d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            n3.i(it.next());
        }
        return i6 != n3.f12492d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z5;
        AbstractC1276k.f(collection, "elements");
        N n3 = this.f12507e;
        n3.getClass();
        Object[] objArr = n3.f12490b;
        int i6 = n3.f12492d;
        long[] jArr = n3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j3 = jArr[i7];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j3) < 128) {
                            int i10 = (i7 << 3) + i9;
                            if (!Y3.m.j0(collection, objArr[i10])) {
                                n3.m(i10);
                            }
                        }
                        j3 >>= 8;
                    }
                    z5 = false;
                    if (i8 != 8) {
                        break;
                    }
                } else {
                    z5 = false;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        } else {
            z5 = false;
        }
        if (i6 != n3.f12492d) {
            return true;
        }
        return z5;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12506c.f12492d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1275j.a(this);
    }

    public final String toString() {
        return this.f12506c.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC1276k.f(objArr, "array");
        return AbstractC1275j.b(this, objArr);
    }
}
