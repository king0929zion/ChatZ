package f0;

import H0.C0162q;
import T.AbstractC0619m0;
import Z2.M0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1374c;

/* renamed from: f0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996s implements Parcelable, InterfaceC0972B, List, RandomAccess, InterfaceC1374c {
    public static final Parcelable.Creator<C0996s> CREATOR = new Object();

    /* renamed from: c, reason: collision with root package name */
    public C1002y f11718c;

    public C0996s(X.c cVar) {
        AbstractC0983f j3 = AbstractC0992o.j();
        C1002y c1002y = new C1002y(j3.g(), cVar);
        if (!(j3 instanceof C0978a)) {
            c1002y.f11648b = new C1002y(1, cVar);
        }
        this.f11718c = c1002y;
    }

    @Override // f0.InterfaceC0972B
    public final AbstractC0974D a() {
        return this.f11718c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i6;
        X.c cVar;
        AbstractC0983f j3;
        boolean b5;
        do {
            synchronized (AbstractC0997t.a) {
                C1002y c1002y = this.f11718c;
                AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C1002y c1002y2 = (C1002y) AbstractC0992o.h(c1002y);
                i6 = c1002y2.f11748d;
                cVar = c1002y2.f11747c;
            }
            AbstractC1276k.c(cVar);
            X.c c6 = cVar.c(obj);
            if (c6.equals(cVar)) {
                return false;
            }
            C1002y c1002y3 = this.f11718c;
            AbstractC1276k.d(c1002y3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = AbstractC0997t.b((C1002y) AbstractC0992o.w(c1002y3, this, j3), i6, c6, true);
            }
            AbstractC0992o.n(j3, this);
        } while (!b5);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection collection) {
        return AbstractC0997t.i(this, new M0(i6, 1, collection));
    }

    public final void b(int i6, int i7) {
        int i8;
        X.c cVar;
        AbstractC0983f j3;
        boolean b5;
        do {
            synchronized (AbstractC0997t.a) {
                C1002y c1002y = this.f11718c;
                AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C1002y c1002y2 = (C1002y) AbstractC0992o.h(c1002y);
                i8 = c1002y2.f11748d;
                cVar = c1002y2.f11747c;
            }
            AbstractC1276k.c(cVar);
            X.g e6 = cVar.e();
            e6.subList(i6, i7).clear();
            X.c c6 = e6.c();
            if (AbstractC1276k.b(c6, cVar)) {
                return;
            }
            C1002y c1002y3 = this.f11718c;
            AbstractC1276k.d(c1002y3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = AbstractC0997t.b((C1002y) AbstractC0992o.w(c1002y3, this, j3), i8, c6, true);
            }
            AbstractC0992o.n(j3, this);
        } while (!b5);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC0983f j3;
        C1002y c1002y = this.f11718c;
        AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (AbstractC0992o.f11707c) {
            j3 = AbstractC0992o.j();
            C1002y c1002y2 = (C1002y) AbstractC0992o.w(c1002y, this, j3);
            synchronized (AbstractC0997t.a) {
                c1002y2.f11747c = X.j.f9070e;
                c1002y2.f11748d++;
                c1002y2.f11749e++;
            }
        }
        AbstractC0992o.n(j3, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC0997t.f(this).f11747c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC0997t.f(this).f11747c.containsAll(collection);
    }

    @Override // f0.InterfaceC0972B
    public final void d(AbstractC0974D abstractC0974D) {
        abstractC0974D.f11648b = this.f11718c;
        this.f11718c = (C1002y) abstractC0974D;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        return AbstractC0997t.f(this).f11747c.get(i6);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return AbstractC0997t.f(this).f11747c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC0997t.f(this).f11747c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC0997t.f(this).f11747c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0162q(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i6) {
        int i7;
        X.c cVar;
        AbstractC0983f j3;
        boolean b5;
        Object obj = get(i6);
        do {
            synchronized (AbstractC0997t.a) {
                C1002y c1002y = this.f11718c;
                AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C1002y c1002y2 = (C1002y) AbstractC0992o.h(c1002y);
                i7 = c1002y2.f11748d;
                cVar = c1002y2.f11747c;
            }
            AbstractC1276k.c(cVar);
            X.c g3 = cVar.g(i6);
            if (g3.equals(cVar)) {
                break;
            }
            C1002y c1002y3 = this.f11718c;
            AbstractC1276k.d(c1002y3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = AbstractC0997t.b((C1002y) AbstractC0992o.w(c1002y3, this, j3), i7, g3, true);
            }
            AbstractC0992o.n(j3, this);
        } while (!b5);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i6;
        X.c cVar;
        AbstractC0983f j3;
        boolean b5;
        do {
            synchronized (AbstractC0997t.a) {
                C1002y c1002y = this.f11718c;
                AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C1002y c1002y2 = (C1002y) AbstractC0992o.h(c1002y);
                i6 = c1002y2.f11748d;
                cVar = c1002y2.f11747c;
            }
            AbstractC1276k.c(cVar);
            X.c f6 = cVar.f(new X.b(0, collection));
            if (AbstractC1276k.b(f6, cVar)) {
                return false;
            }
            C1002y c1002y3 = this.f11718c;
            AbstractC1276k.d(c1002y3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = AbstractC0997t.b((C1002y) AbstractC0992o.w(c1002y3, this, j3), i6, f6, true);
            }
            AbstractC0992o.n(j3, this);
        } while (!b5);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC0997t.i(this, new X.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i6, Object obj) {
        int i7;
        X.c cVar;
        AbstractC0983f j3;
        boolean b5;
        Object obj2 = get(i6);
        do {
            synchronized (AbstractC0997t.a) {
                C1002y c1002y = this.f11718c;
                AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C1002y c1002y2 = (C1002y) AbstractC0992o.h(c1002y);
                i7 = c1002y2.f11748d;
                cVar = c1002y2.f11747c;
            }
            AbstractC1276k.c(cVar);
            X.c h3 = cVar.h(i6, obj);
            if (h3.equals(cVar)) {
                break;
            }
            C1002y c1002y3 = this.f11718c;
            AbstractC1276k.d(c1002y3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = AbstractC0997t.b((C1002y) AbstractC0992o.w(c1002y3, this, j3), i7, h3, false);
            }
            AbstractC0992o.n(j3, this);
        } while (!b5);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return AbstractC0997t.f(this).f11747c.a();
    }

    @Override // java.util.List
    public final List subList(int i6, int i7) {
        if (!(i6 >= 0 && i6 <= i7 && i7 <= size())) {
            AbstractC0619m0.a("fromIndex or toIndex are out of bounds");
        }
        return new C0975E(this, i6, i7);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1275j.a(this);
    }

    public final String toString() {
        C1002y c1002y = this.f11718c;
        AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((C1002y) AbstractC0992o.h(c1002y)).f11747c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        X.c cVar = AbstractC0997t.f(this).f11747c;
        int a = cVar.a();
        parcel.writeInt(a);
        for (int i7 = 0; i7 < a; i7++) {
            parcel.writeValue(cVar.get(i7));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i6;
        X.c cVar;
        AbstractC0983f j3;
        boolean b5;
        do {
            synchronized (AbstractC0997t.a) {
                C1002y c1002y = this.f11718c;
                AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C1002y c1002y2 = (C1002y) AbstractC0992o.h(c1002y);
                i6 = c1002y2.f11748d;
                cVar = c1002y2.f11747c;
            }
            AbstractC1276k.c(cVar);
            X.c d6 = cVar.d(collection);
            if (AbstractC1276k.b(d6, cVar)) {
                return false;
            }
            C1002y c1002y3 = this.f11718c;
            AbstractC1276k.d(c1002y3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = AbstractC0997t.b((C1002y) AbstractC0992o.w(c1002y3, this, j3), i6, d6, true);
            }
            AbstractC0992o.n(j3, this);
        } while (!b5);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i6) {
        return new C0162q(this, i6);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1275j.b(this, objArr);
    }

    public C0996s() {
        this(X.j.f9070e);
    }

    @Override // java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        X.c cVar;
        AbstractC0983f j3;
        boolean b5;
        do {
            synchronized (AbstractC0997t.a) {
                C1002y c1002y = this.f11718c;
                AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C1002y c1002y2 = (C1002y) AbstractC0992o.h(c1002y);
                i7 = c1002y2.f11748d;
                cVar = c1002y2.f11747c;
            }
            AbstractC1276k.c(cVar);
            X.c b6 = cVar.b(i6, obj);
            if (b6.equals(cVar)) {
                return;
            }
            C1002y c1002y3 = this.f11718c;
            AbstractC1276k.d(c1002y3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = AbstractC0997t.b((C1002y) AbstractC0992o.w(c1002y3, this, j3), i7, b6, true);
            }
            AbstractC0992o.n(j3, this);
        } while (!b5);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i6;
        X.c cVar;
        AbstractC0983f j3;
        boolean b5;
        do {
            synchronized (AbstractC0997t.a) {
                C1002y c1002y = this.f11718c;
                AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C1002y c1002y2 = (C1002y) AbstractC0992o.h(c1002y);
                i6 = c1002y2.f11748d;
                cVar = c1002y2.f11747c;
            }
            AbstractC1276k.c(cVar);
            int indexOf = cVar.indexOf(obj);
            X.c g3 = indexOf != -1 ? cVar.g(indexOf) : cVar;
            if (g3.equals(cVar)) {
                return false;
            }
            C1002y c1002y3 = this.f11718c;
            AbstractC1276k.d(c1002y3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = AbstractC0997t.b((C1002y) AbstractC0992o.w(c1002y3, this, j3), i6, g3, true);
            }
            AbstractC0992o.n(j3, this);
        } while (!b5);
        return true;
    }
}
