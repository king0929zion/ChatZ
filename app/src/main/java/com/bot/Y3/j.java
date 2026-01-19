package Y3;

import com.vladsch.flexmark.util.format.TableCell;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class j extends AbstractC0739f {

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f9802g = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public int f9803c;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f9804e;

    /* renamed from: f, reason: collision with root package name */
    public int f9805f;

    public j() {
        this.f9804e = f9802g;
    }

    @Override // Y3.AbstractC0739f
    public final int a() {
        return this.f9805f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        int i8 = this.f9805f;
        if (i6 < 0 || i6 > i8) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i8, ", size: "));
        }
        if (i6 == i8) {
            addLast(obj);
            return;
        }
        if (i6 == 0) {
            addFirst(obj);
            return;
        }
        k();
        d(this.f9805f + 1);
        int j3 = j(this.f9803c + i6);
        int i9 = this.f9805f;
        if (i6 < ((i9 + 1) >> 1)) {
            if (j3 == 0) {
                Object[] objArr = this.f9804e;
                AbstractC1276k.f(objArr, "<this>");
                j3 = objArr.length;
            }
            int i10 = j3 - 1;
            int i11 = this.f9803c;
            if (i11 == 0) {
                Object[] objArr2 = this.f9804e;
                AbstractC1276k.f(objArr2, "<this>");
                i7 = objArr2.length - 1;
            } else {
                i7 = i11 - 1;
            }
            int i12 = this.f9803c;
            if (i10 >= i12) {
                Object[] objArr3 = this.f9804e;
                objArr3[i7] = objArr3[i12];
                k.j0(objArr3, objArr3, i12, i12 + 1, i10 + 1);
            } else {
                Object[] objArr4 = this.f9804e;
                k.j0(objArr4, objArr4, i12 - 1, i12, objArr4.length);
                Object[] objArr5 = this.f9804e;
                objArr5[objArr5.length - 1] = objArr5[0];
                k.j0(objArr5, objArr5, 0, 1, i10 + 1);
            }
            this.f9804e[i10] = obj;
            this.f9803c = i7;
        } else {
            int j4 = j(i9 + this.f9803c);
            if (j3 < j4) {
                Object[] objArr6 = this.f9804e;
                k.j0(objArr6, objArr6, j3 + 1, j3, j4);
            } else {
                Object[] objArr7 = this.f9804e;
                k.j0(objArr7, objArr7, 1, 0, j4);
                Object[] objArr8 = this.f9804e;
                objArr8[0] = objArr8[objArr8.length - 1];
                k.j0(objArr8, objArr8, j3 + 1, j3, objArr8.length - 1);
            }
            this.f9804e[j3] = obj;
        }
        this.f9805f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection collection) {
        AbstractC1276k.f(collection, "elements");
        int i7 = this.f9805f;
        if (i6 >= 0 && i6 <= i7) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i6 == this.f9805f) {
                return addAll(collection);
            }
            k();
            d(collection.size() + this.f9805f);
            int j3 = j(this.f9805f + this.f9803c);
            int j4 = j(this.f9803c + i6);
            int size = collection.size();
            if (i6 < ((this.f9805f + 1) >> 1)) {
                int i8 = this.f9803c;
                int i9 = i8 - size;
                if (j4 < i8) {
                    Object[] objArr = this.f9804e;
                    k.j0(objArr, objArr, i9, i8, objArr.length);
                    if (size >= j4) {
                        Object[] objArr2 = this.f9804e;
                        k.j0(objArr2, objArr2, objArr2.length - size, 0, j4);
                    } else {
                        Object[] objArr3 = this.f9804e;
                        k.j0(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f9804e;
                        k.j0(objArr4, objArr4, 0, size, j4);
                    }
                } else if (i9 >= 0) {
                    Object[] objArr5 = this.f9804e;
                    k.j0(objArr5, objArr5, i9, i8, j4);
                } else {
                    Object[] objArr6 = this.f9804e;
                    i9 += objArr6.length;
                    int i10 = j4 - i8;
                    int length = objArr6.length - i9;
                    if (length >= i10) {
                        k.j0(objArr6, objArr6, i9, i8, j4);
                    } else {
                        k.j0(objArr6, objArr6, i9, i8, i8 + length);
                        Object[] objArr7 = this.f9804e;
                        k.j0(objArr7, objArr7, 0, this.f9803c + length, j4);
                    }
                }
                this.f9803c = i9;
                c(h(j4 - size), collection);
                return true;
            }
            int i11 = j4 + size;
            if (j4 < j3) {
                int i12 = size + j3;
                Object[] objArr8 = this.f9804e;
                if (i12 <= objArr8.length) {
                    k.j0(objArr8, objArr8, i11, j4, j3);
                } else if (i11 >= objArr8.length) {
                    k.j0(objArr8, objArr8, i11 - objArr8.length, j4, j3);
                } else {
                    int length2 = j3 - (i12 - objArr8.length);
                    k.j0(objArr8, objArr8, 0, length2, j3);
                    Object[] objArr9 = this.f9804e;
                    k.j0(objArr9, objArr9, i11, j4, length2);
                }
            } else {
                Object[] objArr10 = this.f9804e;
                k.j0(objArr10, objArr10, size, 0, j3);
                Object[] objArr11 = this.f9804e;
                if (i11 >= objArr11.length) {
                    k.j0(objArr11, objArr11, i11 - objArr11.length, j4, objArr11.length);
                } else {
                    k.j0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f9804e;
                    k.j0(objArr12, objArr12, i11, j4, objArr12.length - size);
                }
            }
            c(j4, collection);
            return true;
        }
        throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
    }

    public final void addFirst(Object obj) {
        k();
        d(this.f9805f + 1);
        int i6 = this.f9803c;
        if (i6 == 0) {
            Object[] objArr = this.f9804e;
            AbstractC1276k.f(objArr, "<this>");
            i6 = objArr.length;
        }
        int i7 = i6 - 1;
        this.f9803c = i7;
        this.f9804e[i7] = obj;
        this.f9805f++;
    }

    public final void addLast(Object obj) {
        k();
        d(a() + 1);
        this.f9804e[j(a() + this.f9803c)] = obj;
        this.f9805f = a() + 1;
    }

    @Override // Y3.AbstractC0739f
    public final Object b(int i6) {
        int i7 = this.f9805f;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
        }
        if (i6 == Y4.l.C(this)) {
            return removeLast();
        }
        if (i6 == 0) {
            return removeFirst();
        }
        k();
        int j3 = j(this.f9803c + i6);
        Object[] objArr = this.f9804e;
        Object obj = objArr[j3];
        if (i6 < (this.f9805f >> 1)) {
            int i8 = this.f9803c;
            if (j3 >= i8) {
                k.j0(objArr, objArr, i8 + 1, i8, j3);
            } else {
                k.j0(objArr, objArr, 1, 0, j3);
                Object[] objArr2 = this.f9804e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i9 = this.f9803c;
                k.j0(objArr2, objArr2, i9 + 1, i9, objArr2.length - 1);
            }
            Object[] objArr3 = this.f9804e;
            int i10 = this.f9803c;
            objArr3[i10] = null;
            this.f9803c = f(i10);
        } else {
            int j4 = j(Y4.l.C(this) + this.f9803c);
            if (j3 <= j4) {
                Object[] objArr4 = this.f9804e;
                k.j0(objArr4, objArr4, j3, j3 + 1, j4 + 1);
            } else {
                Object[] objArr5 = this.f9804e;
                k.j0(objArr5, objArr5, j3, j3 + 1, objArr5.length);
                Object[] objArr6 = this.f9804e;
                objArr6[objArr6.length - 1] = objArr6[0];
                k.j0(objArr6, objArr6, 0, 1, j4 + 1);
            }
            this.f9804e[j4] = null;
        }
        this.f9805f--;
        return obj;
    }

    public final void c(int i6, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f9804e.length;
        while (i6 < length && it.hasNext()) {
            this.f9804e[i6] = it.next();
            i6++;
        }
        int i7 = this.f9803c;
        for (int i8 = 0; i8 < i7 && it.hasNext(); i8++) {
            this.f9804e[i8] = it.next();
        }
        this.f9805f = collection.size() + this.f9805f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            i(this.f9803c, j(a() + this.f9803c));
        }
        this.f9803c = 0;
        this.f9805f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i6) {
        if (i6 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f9804e;
        if (i6 <= objArr.length) {
            return;
        }
        if (objArr == f9802g) {
            if (i6 < 10) {
                i6 = 10;
            }
            this.f9804e = new Object[i6];
            return;
        }
        int length = objArr.length;
        int i7 = length + (length >> 1);
        if (i7 - i6 < 0) {
            i7 = i6;
        }
        if (i7 - 2147483639 > 0) {
            i7 = i6 > 2147483639 ? TableCell.NOT_TRACKED : 2147483639;
        }
        Object[] objArr2 = new Object[i7];
        k.j0(objArr, objArr2, 0, this.f9803c, objArr.length);
        Object[] objArr3 = this.f9804e;
        int length2 = objArr3.length;
        int i8 = this.f9803c;
        k.j0(objArr3, objArr2, length2 - i8, 0, i8);
        this.f9803c = 0;
        this.f9804e = objArr2;
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.f9804e[this.f9803c];
    }

    public final int f(int i6) {
        AbstractC1276k.f(this.f9804e, "<this>");
        if (i6 == r0.length - 1) {
            return 0;
        }
        return i6 + 1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f9804e[this.f9803c];
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.f9804e[j(Y4.l.C(this) + this.f9803c)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        int a = a();
        if (i6 < 0 || i6 >= a) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, a, ", size: "));
        }
        return this.f9804e[j(this.f9803c + i6)];
    }

    public final int h(int i6) {
        return i6 < 0 ? i6 + this.f9804e.length : i6;
    }

    public final void i(int i6, int i7) {
        if (i6 < i7) {
            k.o0(null, this.f9804e, i6, i7);
            return;
        }
        Object[] objArr = this.f9804e;
        k.o0(null, objArr, i6, objArr.length);
        k.o0(null, this.f9804e, 0, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i6;
        int j3 = j(a() + this.f9803c);
        int i7 = this.f9803c;
        if (i7 < j3) {
            while (i7 < j3) {
                if (AbstractC1276k.b(obj, this.f9804e[i7])) {
                    i6 = this.f9803c;
                } else {
                    i7++;
                }
            }
            return -1;
        }
        if (i7 < j3) {
            return -1;
        }
        int length = this.f9804e.length;
        while (true) {
            if (i7 >= length) {
                for (int i8 = 0; i8 < j3; i8++) {
                    if (AbstractC1276k.b(obj, this.f9804e[i8])) {
                        i7 = i8 + this.f9804e.length;
                        i6 = this.f9803c;
                    }
                }
                return -1;
            }
            if (AbstractC1276k.b(obj, this.f9804e[i7])) {
                i6 = this.f9803c;
                break;
            }
            i7++;
        }
        return i7 - i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int j(int i6) {
        Object[] objArr = this.f9804e;
        return i6 >= objArr.length ? i6 - objArr.length : i6;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f9804e[j(Y4.l.C(this) + this.f9803c)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i6;
        int j3 = j(this.f9805f + this.f9803c);
        int i7 = this.f9803c;
        if (i7 < j3) {
            length = j3 - 1;
            if (i7 <= length) {
                while (!AbstractC1276k.b(obj, this.f9804e[length])) {
                    if (length != i7) {
                        length--;
                    }
                }
                i6 = this.f9803c;
                return length - i6;
            }
            return -1;
        }
        if (i7 > j3) {
            int i8 = j3 - 1;
            while (true) {
                if (-1 >= i8) {
                    Object[] objArr = this.f9804e;
                    AbstractC1276k.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i9 = this.f9803c;
                    if (i9 <= length) {
                        while (!AbstractC1276k.b(obj, this.f9804e[length])) {
                            if (length != i9) {
                                length--;
                            }
                        }
                        i6 = this.f9803c;
                    }
                } else {
                    if (AbstractC1276k.b(obj, this.f9804e[i8])) {
                        length = i8 + this.f9804e.length;
                        i6 = this.f9803c;
                        break;
                    }
                    i8--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int j3;
        AbstractC1276k.f(collection, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f9804e.length != 0) {
            int j4 = j(a() + this.f9803c);
            int i6 = this.f9803c;
            if (i6 < j4) {
                j3 = i6;
                while (i6 < j4) {
                    Object obj = this.f9804e[i6];
                    if (collection.contains(obj)) {
                        z5 = true;
                    } else {
                        this.f9804e[j3] = obj;
                        j3++;
                    }
                    i6++;
                }
                k.o0(null, this.f9804e, j3, j4);
            } else {
                int length = this.f9804e.length;
                boolean z6 = false;
                int i7 = i6;
                while (i6 < length) {
                    Object[] objArr = this.f9804e;
                    Object obj2 = objArr[i6];
                    objArr[i6] = null;
                    if (collection.contains(obj2)) {
                        z6 = true;
                    } else {
                        this.f9804e[i7] = obj2;
                        i7++;
                    }
                    i6++;
                }
                j3 = j(i7);
                for (int i8 = 0; i8 < j4; i8++) {
                    Object[] objArr2 = this.f9804e;
                    Object obj3 = objArr2[i8];
                    objArr2[i8] = null;
                    if (collection.contains(obj3)) {
                        z6 = true;
                    } else {
                        this.f9804e[j3] = obj3;
                        j3 = f(j3);
                    }
                }
                z5 = z6;
            }
            if (z5) {
                k();
                this.f9805f = h(j3 - this.f9803c);
            }
        }
        return z5;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        Object[] objArr = this.f9804e;
        int i6 = this.f9803c;
        Object obj = objArr[i6];
        objArr[i6] = null;
        this.f9803c = f(i6);
        this.f9805f = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        int j3 = j(Y4.l.C(this) + this.f9803c);
        Object[] objArr = this.f9804e;
        Object obj = objArr[j3];
        objArr[j3] = null;
        this.f9805f = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        s4.j.l(i6, i7, this.f9805f);
        int i8 = i7 - i6;
        if (i8 == 0) {
            return;
        }
        if (i8 == this.f9805f) {
            clear();
            return;
        }
        if (i8 == 1) {
            b(i6);
            return;
        }
        k();
        if (i6 < this.f9805f - i7) {
            int j3 = j(this.f9803c + (i6 - 1));
            int j4 = j(this.f9803c + (i7 - 1));
            while (i6 > 0) {
                int i9 = j3 + 1;
                int min = Math.min(i6, Math.min(i9, j4 + 1));
                Object[] objArr = this.f9804e;
                int i10 = j4 - min;
                int i11 = j3 - min;
                k.j0(objArr, objArr, i10 + 1, i11 + 1, i9);
                j3 = h(i11);
                j4 = h(i10);
                i6 -= min;
            }
            int j5 = j(this.f9803c + i8);
            i(this.f9803c, j5);
            this.f9803c = j5;
        } else {
            int j6 = j(this.f9803c + i7);
            int j7 = j(this.f9803c + i6);
            int i12 = this.f9805f;
            while (true) {
                i12 -= i7;
                if (i12 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f9804e;
                i7 = Math.min(i12, Math.min(objArr2.length - j6, objArr2.length - j7));
                Object[] objArr3 = this.f9804e;
                int i13 = j6 + i7;
                k.j0(objArr3, objArr3, j7, j6, i13);
                j6 = j(i13);
                j7 = j(j7 + i7);
            }
            int j8 = j(this.f9805f + this.f9803c);
            i(h(j8 - i8), j8);
        }
        this.f9805f -= i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int j3;
        AbstractC1276k.f(collection, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f9804e.length != 0) {
            int j4 = j(a() + this.f9803c);
            int i6 = this.f9803c;
            if (i6 < j4) {
                j3 = i6;
                while (i6 < j4) {
                    Object obj = this.f9804e[i6];
                    if (collection.contains(obj)) {
                        this.f9804e[j3] = obj;
                        j3++;
                    } else {
                        z5 = true;
                    }
                    i6++;
                }
                k.o0(null, this.f9804e, j3, j4);
            } else {
                int length = this.f9804e.length;
                boolean z6 = false;
                int i7 = i6;
                while (i6 < length) {
                    Object[] objArr = this.f9804e;
                    Object obj2 = objArr[i6];
                    objArr[i6] = null;
                    if (collection.contains(obj2)) {
                        this.f9804e[i7] = obj2;
                        i7++;
                    } else {
                        z6 = true;
                    }
                    i6++;
                }
                j3 = j(i7);
                for (int i8 = 0; i8 < j4; i8++) {
                    Object[] objArr2 = this.f9804e;
                    Object obj3 = objArr2[i8];
                    objArr2[i8] = null;
                    if (collection.contains(obj3)) {
                        this.f9804e[j3] = obj3;
                        j3 = f(j3);
                    } else {
                        z6 = true;
                    }
                }
                z5 = z6;
            }
            if (z5) {
                k();
                this.f9805f = h(j3 - this.f9803c);
            }
        }
        return z5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        int a = a();
        if (i6 < 0 || i6 >= a) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, a, ", size: "));
        }
        int j3 = j(this.f9803c + i6);
        Object[] objArr = this.f9804e;
        Object obj2 = objArr[j3];
        objArr[j3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public j(int i6) {
        Object[] objArr;
        if (i6 == 0) {
            objArr = f9802g;
        } else if (i6 > 0) {
            objArr = new Object[i6];
        } else {
            throw new IllegalArgumentException(B3.e.h(i6, "Illegal Capacity: "));
        }
        this.f9804e = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1276k.f(objArr, "array");
        int length = objArr.length;
        int i6 = this.f9805f;
        if (length < i6) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i6);
            AbstractC1276k.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int j3 = j(this.f9805f + this.f9803c);
        int i7 = this.f9803c;
        if (i7 < j3) {
            k.l0(this.f9804e, objArr, i7, j3, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f9804e;
            k.j0(objArr2, objArr, 0, this.f9803c, objArr2.length);
            Object[] objArr3 = this.f9804e;
            k.j0(objArr3, objArr, objArr3.length - this.f9803c, 0, j3);
        }
        int i8 = this.f9805f;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        k();
        d(collection.size() + a());
        c(j(a() + this.f9803c), collection);
        return true;
    }
}
