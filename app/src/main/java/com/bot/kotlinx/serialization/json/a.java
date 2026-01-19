package kotlinx.serialization.json;

import N4.e;
import Y3.m;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

@I4.d(with = e.class)
/* loaded from: classes.dex */
public final class a extends b implements List<b>, InterfaceC1372a {
    public static final JsonArray$Companion Companion = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final List f12632c;

    public a(List list) {
        AbstractC1276k.f(list, "content");
        this.f12632c = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i6, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        AbstractC1276k.f(bVar, "element");
        return this.f12632c.contains(bVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        return this.f12632c.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC1276k.b(this.f12632c, obj);
    }

    @Override // java.util.List
    public final b get(int i6) {
        return (b) this.f12632c.get(i6);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f12632c.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        b bVar = (b) obj;
        AbstractC1276k.f(bVar, "element");
        return this.f12632c.indexOf(bVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f12632c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f12632c.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        b bVar = (b) obj;
        AbstractC1276k.f(bVar, "element");
        return this.f12632c.lastIndexOf(bVar);
    }

    @Override // java.util.List
    public final ListIterator<b> listIterator() {
        return this.f12632c.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ b remove(int i6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<b> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ b set(int i6, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f12632c.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super b> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<b> subList(int i6, int i7) {
        return this.f12632c.subList(i6, i7);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1275j.a(this);
    }

    public final String toString() {
        return m.v0(this.f12632c, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<b> listIterator(int i6) {
        return this.f12632c.listIterator(i6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC1276k.f(objArr, "array");
        return AbstractC1275j.b(this, objArr);
    }
}
