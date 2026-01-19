package X3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class q implements Collection, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9407c;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        byte b5 = ((p) obj).f9406c;
        byte[] bArr = this.f9407c;
        int length = bArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i6 = -1;
                break;
            }
            if (b5 == bArr[i6]) {
                break;
            }
            i6++;
        }
        return i6 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof p) {
                    byte b5 = ((p) obj).f9406c;
                    byte[] bArr = this.f9407c;
                    int length = bArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            i6 = -1;
                            break;
                        }
                        if (b5 == bArr[i6]) {
                            break;
                        }
                        i6++;
                    }
                    if (i6 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return AbstractC1276k.b(this.f9407c, ((q) obj).f9407c);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f9407c);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f9407c.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new K4.h(this.f9407c, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f9407c.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1275j.a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f9407c) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC1276k.f(objArr, "array");
        return AbstractC1275j.b(this, objArr);
    }
}
