package k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158e implements Collection {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1159f f12536c;

    public C1158e(C1159f c1159f) {
        this.f12536c = c1159f;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f12536c.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12536c.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f12536c.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1155b(this.f12536c, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1159f c1159f = this.f12536c;
        int a = c1159f.a(obj);
        if (a < 0) {
            return false;
        }
        c1159f.i(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1159f c1159f = this.f12536c;
        int i6 = c1159f.f12539f;
        int i7 = 0;
        boolean z5 = false;
        while (i7 < i6) {
            if (collection.contains(c1159f.k(i7))) {
                c1159f.i(i7);
                i7--;
                i6--;
                z5 = true;
            }
            i7++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1159f c1159f = this.f12536c;
        int i6 = c1159f.f12539f;
        int i7 = 0;
        boolean z5 = false;
        while (i7 < i6) {
            if (!collection.contains(c1159f.k(i7))) {
                c1159f.i(i7);
                i7--;
                i6--;
                z5 = true;
            }
            i7++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f12536c.f12539f;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1159f c1159f = this.f12536c;
        int i6 = c1159f.f12539f;
        Object[] objArr = new Object[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = c1159f.k(i7);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1159f c1159f = this.f12536c;
        int i6 = c1159f.f12539f;
        if (objArr.length < i6) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i6);
        }
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = c1159f.k(i7);
        }
        if (objArr.length > i6) {
            objArr[i6] = null;
        }
        return objArr;
    }
}
