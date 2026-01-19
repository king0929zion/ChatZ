package Z3;

import H0.C0162q;
import Y3.AbstractC0739f;
import Y3.k;
import com.vladsch.flexmark.util.format.TableCell;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m4.AbstractC1276k;
import s4.j;

/* loaded from: classes.dex */
public final class b extends AbstractC0739f implements RandomAccess, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final b f10513g;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f10514c;

    /* renamed from: e, reason: collision with root package name */
    public int f10515e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10516f;

    static {
        b bVar = new b(0);
        bVar.f10516f = true;
        f10513g = bVar;
    }

    public b(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f10514c = new Object[i6];
    }

    @Override // Y3.AbstractC0739f
    public final int a() {
        return this.f10515e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i6 = this.f10515e;
        ((AbstractList) this).modCount++;
        g(i6, 1);
        this.f10514c[i6] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        f();
        int size = collection.size();
        d(this.f10515e, collection, size);
        return size > 0;
    }

    @Override // Y3.AbstractC0739f
    public final Object b(int i6) {
        f();
        int i7 = this.f10515e;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
        }
        return h(i6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.f10515e);
    }

    public final void d(int i6, Collection collection, int i7) {
        ((AbstractList) this).modCount++;
        g(i6, i7);
        Iterator it = collection.iterator();
        for (int i8 = 0; i8 < i7; i8++) {
            this.f10514c[i6 + i8] = it.next();
        }
    }

    public final void e(int i6, Object obj) {
        ((AbstractList) this).modCount++;
        g(i6, 1);
        this.f10514c[i6] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f10514c;
            int i6 = this.f10515e;
            if (i6 == list.size()) {
                for (int i7 = 0; i7 < i6; i7++) {
                    if (AbstractC1276k.b(objArr[i7], list.get(i7))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f10516f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i6, int i7) {
        int i8 = this.f10515e + i7;
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f10514c;
        if (i8 > objArr.length) {
            int length = objArr.length;
            int i9 = length + (length >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 > 0) {
                i9 = i8 > 2147483639 ? TableCell.NOT_TRACKED : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i9);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.f10514c = copyOf;
        }
        Object[] objArr2 = this.f10514c;
        k.j0(objArr2, objArr2, i6 + i7, i6, this.f10515e);
        this.f10515e += i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        int i7 = this.f10515e;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
        }
        return this.f10514c[i6];
    }

    public final Object h(int i6) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f10514c;
        Object obj = objArr[i6];
        k.j0(objArr, objArr, i6, i6 + 1, this.f10515e);
        Object[] objArr2 = this.f10514c;
        int i7 = this.f10515e - 1;
        AbstractC1276k.f(objArr2, "<this>");
        objArr2[i7] = null;
        this.f10515e--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f10514c;
        int i6 = this.f10515e;
        int i7 = 1;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = objArr[i8];
            i7 = (i7 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i7;
    }

    public final void i(int i6, int i7) {
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f10514c;
        k.j0(objArr, objArr, i6, i6 + i7, this.f10515e);
        Object[] objArr2 = this.f10514c;
        int i8 = this.f10515e;
        j.G(objArr2, i8 - i7, i8);
        this.f10515e -= i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i6 = 0; i6 < this.f10515e; i6++) {
            if (AbstractC1276k.b(this.f10514c[i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f10515e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i6, int i7, Collection collection, boolean z5) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int i10 = i6 + i8;
            if (collection.contains(this.f10514c[i10]) == z5) {
                Object[] objArr = this.f10514c;
                i8++;
                objArr[i9 + i6] = objArr[i10];
                i9++;
            } else {
                i8++;
            }
        }
        int i11 = i7 - i9;
        Object[] objArr2 = this.f10514c;
        k.j0(objArr2, objArr2, i6 + i9, i7 + i6, this.f10515e);
        Object[] objArr3 = this.f10514c;
        int i12 = this.f10515e;
        j.G(objArr3, i12 - i11, i12);
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f10515e -= i11;
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i6 = this.f10515e - 1; i6 >= 0; i6--) {
            if (AbstractC1276k.b(this.f10514c[i6], obj)) {
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
        f();
        return j(0, this.f10515e, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        f();
        return j(0, this.f10515e, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        f();
        int i7 = this.f10515e;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
        }
        Object[] objArr = this.f10514c;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i6, int i7) {
        j.l(i6, i7, this.f10515e);
        return new a(this.f10514c, i6, i7 - i6, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1276k.f(objArr, "array");
        int length = objArr.length;
        int i6 = this.f10515e;
        if (length < i6) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f10514c, 0, i6, objArr.getClass());
            AbstractC1276k.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        k.j0(this.f10514c, objArr, 0, 0, i6);
        int i7 = this.f10515e;
        if (i7 < objArr.length) {
            objArr[i7] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j.d(this.f10514c, 0, this.f10515e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        int i7 = this.f10515e;
        if (i6 >= 0 && i6 <= i7) {
            return new C0162q(this, i6);
        }
        throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection collection) {
        AbstractC1276k.f(collection, "elements");
        f();
        int i7 = this.f10515e;
        if (i6 >= 0 && i6 <= i7) {
            int size = collection.size();
            d(i6, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        f();
        int i7 = this.f10515e;
        if (i6 >= 0 && i6 <= i7) {
            ((AbstractList) this).modCount++;
            g(i6, 1);
            this.f10514c[i6] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return k.n0(this.f10514c, 0, this.f10515e);
    }
}
