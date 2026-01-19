package Z3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class h extends Y3.g implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final h f10541e;

    /* renamed from: c, reason: collision with root package name */
    public final f f10542c;

    static {
        f fVar = f.f10525q;
        f10541e = new h(f.f10525q);
    }

    public h(f fVar) {
        AbstractC1276k.f(fVar, "backing");
        this.f10542c = fVar;
    }

    @Override // Y3.g
    public final int a() {
        return this.f10542c.f10534l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f10542c.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        this.f10542c.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f10542c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f10542c.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f10542c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f10542c;
        fVar.getClass();
        return new c(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f10542c;
        fVar.c();
        int h3 = fVar.h(obj);
        if (h3 < 0) {
            return false;
        }
        fVar.l(h3);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        this.f10542c.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        this.f10542c.c();
        return super.retainAll(collection);
    }

    public h() {
        this(new f());
    }
}
