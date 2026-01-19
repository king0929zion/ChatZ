package N3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import n4.InterfaceC1377f;

/* loaded from: classes.dex */
public final class m implements Set, InterfaceC1377f {

    /* renamed from: c, reason: collision with root package name */
    public final Set f3869c;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1277l f3870e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1277l f3871f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3872g;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Set set, l4.c cVar, l4.c cVar2) {
        AbstractC1276k.f(set, "delegate");
        this.f3869c = set;
        this.f3870e = (AbstractC1277l) cVar;
        this.f3871f = (AbstractC1277l) cVar2;
        this.f3872g = set.size();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [m4.l, l4.c] */
    public final ArrayList a(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(Y3.n.Z(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f3871f.f(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.l, l4.c] */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f3869c.add(this.f3871f.f(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        return this.f3869c.addAll(a(collection));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [m4.l, l4.c] */
    public final ArrayList b(Collection collection) {
        AbstractC1276k.f(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(Y3.n.Z(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f3870e.f(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f3869c.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.l, l4.c] */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3869c.contains(this.f3871f.f(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        return this.f3869c.containsAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList b5 = b(this.f3869c);
        return ((Set) obj).containsAll(b5) && b5.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f3869c.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f3869c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new l(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.l, l4.c] */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f3869c.remove(this.f3871f.f(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        return this.f3869c.removeAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        return this.f3869c.retainAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f3872g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1275j.a(this);
    }

    public final String toString() {
        return b(this.f3869c).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC1276k.f(objArr, "array");
        return AbstractC1275j.b(this, objArr);
    }
}
