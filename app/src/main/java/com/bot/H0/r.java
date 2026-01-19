package H0;

import h0.AbstractC1040q;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class r implements List, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final int f1985c;

    /* renamed from: e, reason: collision with root package name */
    public final int f1986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0163s f1987f;

    public r(C0163s c0163s, int i6, int i7) {
        this.f1987f = c0163s;
        this.f1985c = i6;
        this.f1986e = i7;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i6, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof AbstractC1040q) && indexOf((AbstractC1040q) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC1040q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        Object f6 = this.f1987f.f1988c.f(i6 + this.f1985c);
        AbstractC1276k.d(f6, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC1040q) f6;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC1040q)) {
            return -1;
        }
        AbstractC1040q abstractC1040q = (AbstractC1040q) obj;
        int i6 = this.f1985c;
        int i7 = this.f1986e;
        if (i6 <= i7) {
            int i8 = i6;
            while (!AbstractC1276k.b(this.f1987f.f1988c.f(i8), abstractC1040q)) {
                if (i8 != i7) {
                    i8++;
                }
            }
            return i8 - i6;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i6 = this.f1985c;
        return new C0162q(this.f1987f, i6, i6, this.f1986e);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC1040q)) {
            return -1;
        }
        AbstractC1040q abstractC1040q = (AbstractC1040q) obj;
        int i6 = this.f1986e;
        int i7 = this.f1985c;
        if (i7 <= i6) {
            while (!AbstractC1276k.b(this.f1987f.f1988c.f(i6), abstractC1040q)) {
                if (i6 != i7) {
                    i6--;
                }
            }
            return i6 - i7;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i6 = this.f1985c;
        return new C0162q(this.f1987f, i6, i6, this.f1986e);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f1986e - this.f1985c;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i6, int i7) {
        int i8 = this.f1985c;
        return new r(this.f1987f, i6 + i8, i8 + i7);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1275j.a(this);
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
    public final ListIterator listIterator(int i6) {
        int i7 = this.f1985c;
        int i8 = this.f1986e;
        return new C0162q(this.f1987f, i6 + i7, i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1275j.b(this, objArr);
    }
}
