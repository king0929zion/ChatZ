package H0;

import h0.AbstractC1040q;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import k.C1150D;
import l.AbstractC1180a;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* renamed from: H0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163s implements List, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final k.I f1988c = new k.I(16);

    /* renamed from: e, reason: collision with root package name */
    public final C1150D f1989e = new C1150D(16);

    /* renamed from: f, reason: collision with root package name */
    public int f1990f = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = H0.AbstractC0157l.a(r0, r1, r1)
            int r2 = r7.f1990f
            int r2 = r2 + 1
            int r3 = Y4.l.C(r7)
            if (r2 > r3) goto L44
        L11:
            k.D r4 = r7.f1989e
            if (r2 < 0) goto L3a
            int r5 = r4.f12446b
            if (r2 >= r5) goto L3d
            long[] r4 = r4.a
            r5 = r4[r2]
            int r4 = H0.AbstractC0157l.g(r5, r0)
            if (r4 >= 0) goto L24
            r0 = r5
        L24:
            float r4 = H0.AbstractC0157l.j(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L34
            boolean r4 = H0.AbstractC0157l.o(r0)
            if (r4 == 0) goto L34
            goto L39
        L34:
            if (r2 == r3) goto L39
            int r2 = r2 + 1
            goto L11
        L39:
            return r0
        L3a:
            r4.getClass()
        L3d:
            java.lang.String r0 = "Index must be between 0 and size"
            l.AbstractC1180a.d(r0)
            r0 = 0
            throw r0
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C0163s.a():long");
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

    public final void b(int i6, int i7) {
        if (i6 >= i7) {
            return;
        }
        this.f1988c.l(i6, i7);
        C1150D c1150d = this.f1989e;
        if (i6 >= 0) {
            int i8 = c1150d.f12446b;
            if (i6 <= i8 && i7 >= 0 && i7 <= i8) {
                if (i7 < i6) {
                    AbstractC1180a.c("The end index must be < start index");
                    throw null;
                }
                if (i7 != i6) {
                    if (i7 < i8) {
                        long[] jArr = c1150d.a;
                        Y3.k.i0(jArr, jArr, i6, i7, i8);
                    }
                    c1150d.f12446b -= i7 - i6;
                    return;
                }
                return;
            }
        } else {
            c1150d.getClass();
        }
        AbstractC1180a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f1990f = -1;
        this.f1988c.d();
        this.f1989e.f12446b = 0;
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
        Object f6 = this.f1988c.f(i6);
        AbstractC1276k.d(f6, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC1040q) f6;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC1040q)) {
            return -1;
        }
        AbstractC1040q abstractC1040q = (AbstractC1040q) obj;
        int C5 = Y4.l.C(this);
        if (C5 >= 0) {
            int i6 = 0;
            while (!AbstractC1276k.b(this.f1988c.f(i6), abstractC1040q)) {
                if (i6 != C5) {
                    i6++;
                }
            }
            return i6;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f1988c.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0162q(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC1040q)) {
            return -1;
        }
        AbstractC1040q abstractC1040q = (AbstractC1040q) obj;
        for (int C5 = Y4.l.C(this); -1 < C5; C5--) {
            if (AbstractC1276k.b(this.f1988c.f(C5), abstractC1040q)) {
                return C5;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0162q(this, 0, 7);
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
        return this.f1988c.f12466b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i6, int i7) {
        return new r(this, i6, i7);
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
        return new C0162q(this, i6, 6);
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
