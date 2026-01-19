package f0;

import T.AbstractC0619m0;
import i4.AbstractC1117a;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import m4.C1286u;
import n4.InterfaceC1374c;

/* renamed from: f0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975E implements List, InterfaceC1374c {

    /* renamed from: c, reason: collision with root package name */
    public final C0996s f11649c;

    /* renamed from: e, reason: collision with root package name */
    public final int f11650e;

    /* renamed from: f, reason: collision with root package name */
    public int f11651f;

    /* renamed from: g, reason: collision with root package name */
    public int f11652g;

    public C0975E(C0996s c0996s, int i6, int i7) {
        this.f11649c = c0996s;
        this.f11650e = i6;
        this.f11651f = AbstractC0997t.g(c0996s);
        this.f11652g = i7 - i6;
    }

    public final void a() {
        if (AbstractC0997t.g(this.f11649c) != this.f11651f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i6 = this.f11650e + this.f11652g;
        C0996s c0996s = this.f11649c;
        c0996s.add(i6, obj);
        this.f11652g++;
        this.f11651f = AbstractC0997t.g(c0996s);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f11652g, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f11652g > 0) {
            a();
            int i6 = this.f11652g;
            int i7 = this.f11650e;
            C0996s c0996s = this.f11649c;
            c0996s.b(i7, i6 + i7);
            this.f11652g = 0;
            this.f11651f = AbstractC0997t.g(c0996s);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        a();
        AbstractC0997t.a(i6, this.f11652g);
        return this.f11649c.get(this.f11650e + i6);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i6 = this.f11652g;
        int i7 = this.f11650e;
        Iterator it = AbstractC1117a.z(i7, i6 + i7).iterator();
        while (it.hasNext()) {
            int nextInt = ((Y3.A) it).nextInt();
            if (AbstractC1276k.b(obj, this.f11649c.get(nextInt))) {
                return nextInt - i7;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f11652g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i6 = this.f11652g;
        int i7 = this.f11650e;
        for (int i8 = (i6 + i7) - 1; i8 >= i7; i8--) {
            if (AbstractC1276k.b(obj, this.f11649c.get(i8))) {
                return i8 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z5 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z5) {
                    z5 = true;
                }
            }
            return z5;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i6;
        X.c cVar;
        AbstractC0983f j3;
        boolean b5;
        a();
        C0996s c0996s = this.f11649c;
        int i7 = this.f11650e;
        int i8 = this.f11652g + i7;
        int size = c0996s.size();
        do {
            synchronized (AbstractC0997t.a) {
                C1002y c1002y = c0996s.f11718c;
                AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C1002y c1002y2 = (C1002y) AbstractC0992o.h(c1002y);
                i6 = c1002y2.f11748d;
                cVar = c1002y2.f11747c;
            }
            AbstractC1276k.c(cVar);
            X.g e6 = cVar.e();
            e6.subList(i7, i8).retainAll(collection);
            X.c c6 = e6.c();
            if (AbstractC1276k.b(c6, cVar)) {
                break;
            }
            C1002y c1002y3 = c0996s.f11718c;
            AbstractC1276k.d(c1002y3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = AbstractC0997t.b((C1002y) AbstractC0992o.w(c1002y3, c0996s, j3), i6, c6, true);
            }
            AbstractC0992o.n(j3, c0996s);
        } while (!b5);
        int size2 = size - c0996s.size();
        if (size2 > 0) {
            this.f11651f = AbstractC0997t.g(this.f11649c);
            this.f11652g -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i6, Object obj) {
        AbstractC0997t.a(i6, this.f11652g);
        a();
        int i7 = i6 + this.f11650e;
        C0996s c0996s = this.f11649c;
        Object obj2 = c0996s.set(i7, obj);
        this.f11651f = AbstractC0997t.g(c0996s);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f11652g;
    }

    @Override // java.util.List
    public final List subList(int i6, int i7) {
        if (!(i6 >= 0 && i6 <= i7 && i7 <= this.f11652g)) {
            AbstractC0619m0.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i8 = this.f11650e;
        return new C0975E(this.f11649c, i6 + i8, i7 + i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1275j.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m4.u] */
    @Override // java.util.List
    public final ListIterator listIterator(int i6) {
        a();
        Object obj = new Object();
        obj.f12971c = i6 - 1;
        return new Y3.D((C1286u) obj, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1275j.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection collection) {
        a();
        int i7 = i6 + this.f11650e;
        C0996s c0996s = this.f11649c;
        boolean addAll = c0996s.addAll(i7, collection);
        if (addAll) {
            this.f11652g = collection.size() + this.f11652g;
            this.f11651f = AbstractC0997t.g(c0996s);
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i6) {
        a();
        int i7 = this.f11650e + i6;
        C0996s c0996s = this.f11649c;
        Object remove = c0996s.remove(i7);
        this.f11652g--;
        this.f11651f = AbstractC0997t.g(c0996s);
        return remove;
    }

    @Override // java.util.List
    public final void add(int i6, Object obj) {
        a();
        int i7 = this.f11650e + i6;
        C0996s c0996s = this.f11649c;
        c0996s.add(i7, obj);
        this.f11652g++;
        this.f11651f = AbstractC0997t.g(c0996s);
    }
}
