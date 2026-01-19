package Y3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m4.AbstractC1276k;

/* renamed from: Y3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0737d extends AbstractC0734a implements List {
    @Override // java.util.List
    public final void add(int i6, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        AbstractC1276k.f(collection, "other");
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!AbstractC1276k.b(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int i6 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i6 = (i6 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i6;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (AbstractC1276k.b(it.next(), obj)) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new K4.h(this, 5);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC1276k.b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C0735b(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i6, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i6, int i7) {
        return new C0736c(this, i6, i7);
    }

    public ListIterator listIterator(int i6) {
        return new C0735b(this, i6);
    }
}
