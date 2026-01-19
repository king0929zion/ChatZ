package Z3;

import H0.C0162q;
import Y3.AbstractC0739f;
import Y3.k;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m4.AbstractC1276k;
import s4.j;

/* loaded from: classes.dex */
public final class a extends AbstractC0739f implements RandomAccess, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public Object[] f10508c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10509e;

    /* renamed from: f, reason: collision with root package name */
    public int f10510f;

    /* renamed from: g, reason: collision with root package name */
    public final a f10511g;

    /* renamed from: h, reason: collision with root package name */
    public final b f10512h;

    public a(Object[] objArr, int i6, int i7, a aVar, b bVar) {
        int i8;
        AbstractC1276k.f(objArr, "backing");
        AbstractC1276k.f(bVar, "root");
        this.f10508c = objArr;
        this.f10509e = i6;
        this.f10510f = i7;
        this.f10511g = aVar;
        this.f10512h = bVar;
        i8 = ((AbstractList) bVar).modCount;
        ((AbstractList) this).modCount = i8;
    }

    @Override // Y3.AbstractC0739f
    public final int a() {
        f();
        return this.f10510f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f10509e + this.f10510f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.f10509e + this.f10510f, collection, size);
        return size > 0;
    }

    @Override // Y3.AbstractC0739f
    public final Object b(int i6) {
        g();
        f();
        int i7 = this.f10510f;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
        }
        return h(this.f10509e + i6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f10509e, this.f10510f);
    }

    public final void d(int i6, Collection collection, int i7) {
        ((AbstractList) this).modCount++;
        b bVar = this.f10512h;
        a aVar = this.f10511g;
        if (aVar != null) {
            aVar.d(i6, collection, i7);
        } else {
            b bVar2 = b.f10513g;
            bVar.d(i6, collection, i7);
        }
        this.f10508c = bVar.f10514c;
        this.f10510f += i7;
    }

    public final void e(int i6, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f10512h;
        a aVar = this.f10511g;
        if (aVar != null) {
            aVar.e(i6, obj);
        } else {
            b bVar2 = b.f10513g;
            bVar.e(i6, obj);
        }
        this.f10508c = bVar.f10514c;
        this.f10510f++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f10508c;
            int i6 = this.f10510f;
            if (i6 == list.size()) {
                for (int i7 = 0; i7 < i6; i7++) {
                    if (AbstractC1276k.b(objArr[this.f10509e + i7], list.get(i7))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i6;
        i6 = ((AbstractList) this.f10512h).modCount;
        if (i6 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.f10512h.f10516f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        f();
        int i7 = this.f10510f;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
        }
        return this.f10508c[this.f10509e + i6];
    }

    public final Object h(int i6) {
        Object h3;
        ((AbstractList) this).modCount++;
        a aVar = this.f10511g;
        if (aVar != null) {
            h3 = aVar.h(i6);
        } else {
            b bVar = b.f10513g;
            h3 = this.f10512h.h(i6);
        }
        this.f10510f--;
        return h3;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f10508c;
        int i6 = this.f10510f;
        int i7 = 1;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = objArr[this.f10509e + i8];
            i7 = (i7 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i7;
    }

    public final void i(int i6, int i7) {
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.f10511g;
        if (aVar != null) {
            aVar.i(i6, i7);
        } else {
            b bVar = b.f10513g;
            this.f10512h.i(i6, i7);
        }
        this.f10510f -= i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i6 = 0; i6 < this.f10510f; i6++) {
            if (AbstractC1276k.b(this.f10508c[this.f10509e + i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f10510f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i6, int i7, Collection collection, boolean z5) {
        int j3;
        a aVar = this.f10511g;
        if (aVar != null) {
            j3 = aVar.j(i6, i7, collection, z5);
        } else {
            b bVar = b.f10513g;
            j3 = this.f10512h.j(i6, i7, collection, z5);
        }
        if (j3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f10510f -= j3;
        return j3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i6 = this.f10510f - 1; i6 >= 0; i6--) {
            if (AbstractC1276k.b(this.f10508c[this.f10509e + i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        g();
        f();
        return j(this.f10509e, this.f10510f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        g();
        f();
        return j(this.f10509e, this.f10510f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        g();
        f();
        int i7 = this.f10510f;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
        }
        Object[] objArr = this.f10508c;
        int i8 = this.f10509e;
        Object obj2 = objArr[i8 + i6];
        objArr[i8 + i6] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i6, int i7) {
        j.l(i6, i7, this.f10510f);
        return new a(this.f10508c, this.f10509e + i6, i7 - i6, this, this.f10512h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1276k.f(objArr, "array");
        f();
        int length = objArr.length;
        int i6 = this.f10510f;
        int i7 = this.f10509e;
        if (length < i6) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f10508c, i7, i6 + i7, objArr.getClass());
            AbstractC1276k.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        k.j0(this.f10508c, objArr, 0, i7, i6 + i7);
        int i8 = this.f10510f;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return j.d(this.f10508c, this.f10509e, this.f10510f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        f();
        int i7 = this.f10510f;
        if (i6 >= 0 && i6 <= i7) {
            return new C0162q(this, i6);
        }
        throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        g();
        f();
        int i7 = this.f10510f;
        if (i6 >= 0 && i6 <= i7) {
            e(this.f10509e + i6, obj);
            return;
        }
        throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection collection) {
        AbstractC1276k.f(collection, "elements");
        g();
        f();
        int i7 = this.f10510f;
        if (i6 >= 0 && i6 <= i7) {
            int size = collection.size();
            d(this.f10509e + i6, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f10508c;
        int i6 = this.f10510f;
        int i7 = this.f10509e;
        return k.n0(objArr, i7, i6 + i7);
    }
}
