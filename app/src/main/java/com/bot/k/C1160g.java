package k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import l.AbstractC1180a;
import m4.AbstractC1276k;
import n4.InterfaceC1373b;
import n4.InterfaceC1377f;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1160g implements Collection, Set, InterfaceC1373b, InterfaceC1377f {

    /* renamed from: c, reason: collision with root package name */
    public int[] f12543c = AbstractC1180a.a;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f12544e = AbstractC1180a.f12635c;

    /* renamed from: f, reason: collision with root package name */
    public int f12545f;

    public C1160g(int i6) {
        if (i6 > 0) {
            AbstractC1174v.b(this, i6);
        }
    }

    public final Object a(int i6) {
        int i7 = this.f12545f;
        Object[] objArr = this.f12544e;
        Object obj = objArr[i6];
        if (i7 <= 1) {
            clear();
            return obj;
        }
        int i8 = i7 - 1;
        int[] iArr = this.f12543c;
        if (iArr.length <= 8 || i7 >= iArr.length / 3) {
            if (i6 < i8) {
                int i9 = i6 + 1;
                Y3.k.h0(iArr, iArr, i6, i9, i7);
                Object[] objArr2 = this.f12544e;
                Y3.k.j0(objArr2, objArr2, i6, i9, i7);
            }
            this.f12544e[i8] = null;
        } else {
            int i10 = i7 > 8 ? i7 + (i7 >> 1) : 8;
            int[] iArr2 = new int[i10];
            this.f12543c = iArr2;
            this.f12544e = new Object[i10];
            if (i6 > 0) {
                Y3.k.k0(iArr, iArr2, 0, i6, 6);
                Y3.k.l0(objArr, this.f12544e, 0, i6, 6);
            }
            if (i6 < i8) {
                int i11 = i6 + 1;
                Y3.k.h0(iArr, this.f12543c, i6, i11, i7);
                Y3.k.j0(objArr, this.f12544e, i6, i11, i7);
            }
        }
        if (i7 != this.f12545f) {
            throw new ConcurrentModificationException();
        }
        this.f12545f = i8;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i6;
        int c6;
        int i7 = this.f12545f;
        if (obj == null) {
            c6 = AbstractC1174v.c(this, null, 0);
            i6 = 0;
        } else {
            int hashCode = obj.hashCode();
            i6 = hashCode;
            c6 = AbstractC1174v.c(this, obj, hashCode);
        }
        if (c6 >= 0) {
            return false;
        }
        int i8 = ~c6;
        int[] iArr = this.f12543c;
        if (i7 >= iArr.length) {
            int i9 = 8;
            if (i7 >= 8) {
                i9 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i9 = 4;
            }
            Object[] objArr = this.f12544e;
            int[] iArr2 = new int[i9];
            this.f12543c = iArr2;
            this.f12544e = new Object[i9];
            if (i7 != this.f12545f) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                Y3.k.k0(iArr, iArr2, 0, iArr.length, 6);
                Y3.k.l0(objArr, this.f12544e, 0, objArr.length, 6);
            }
        }
        if (i8 < i7) {
            int[] iArr3 = this.f12543c;
            int i10 = i8 + 1;
            Y3.k.h0(iArr3, iArr3, i10, i8, i7);
            Object[] objArr2 = this.f12544e;
            Y3.k.j0(objArr2, objArr2, i10, i8, i7);
        }
        int i11 = this.f12545f;
        if (i7 == i11) {
            int[] iArr4 = this.f12543c;
            if (i8 < iArr4.length) {
                iArr4[i8] = i6;
                this.f12544e[i8] = obj;
                this.f12545f = i11 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        int size = collection.size() + this.f12545f;
        int i6 = this.f12545f;
        int[] iArr = this.f12543c;
        boolean z5 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f12544e;
            int[] iArr2 = new int[size];
            this.f12543c = iArr2;
            this.f12544e = new Object[size];
            if (i6 > 0) {
                Y3.k.k0(iArr, iArr2, 0, i6, 6);
                Y3.k.l0(objArr, this.f12544e, 0, this.f12545f, 6);
            }
        }
        if (this.f12545f != i6) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z5 |= add(it.next());
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f12545f != 0) {
            this.f12543c = AbstractC1180a.a;
            this.f12544e = AbstractC1180a.f12635c;
            this.f12545f = 0;
        }
        if (this.f12545f != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC1174v.c(this, null, 0) : AbstractC1174v.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f12545f != ((Set) obj).size()) {
            return false;
        }
        try {
            int i6 = this.f12545f;
            for (int i7 = 0; i7 < i6; i7++) {
                if (!((Set) obj).contains(this.f12544e[i7])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f12543c;
        int i6 = this.f12545f;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += iArr[i8];
        }
        return i7;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12545f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1155b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c6 = obj == null ? AbstractC1174v.c(this, null, 0) : AbstractC1174v.c(this, obj, obj.hashCode());
        if (c6 < 0) {
            return false;
        }
        a(c6);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        Iterator it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= remove(it.next());
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        boolean z5 = false;
        for (int i6 = this.f12545f - 1; -1 < i6; i6--) {
            if (!Y3.m.j0(collection, this.f12544e[i6])) {
                a(i6);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f12545f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return Y3.k.n0(this.f12544e, 0, this.f12545f);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12545f * 14);
        sb.append('{');
        int i6 = this.f12545f;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object obj = this.f12544e[i7];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        AbstractC1276k.f(objArr, "array");
        int i6 = this.f12545f;
        if (objArr.length < i6) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i6);
        } else if (objArr.length > i6) {
            objArr[i6] = null;
        }
        Y3.k.j0(this.f12544e, objArr, 0, 0, this.f12545f);
        return objArr;
    }
}
