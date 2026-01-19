package Z3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class g extends Y3.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10539c;

    /* renamed from: e, reason: collision with root package name */
    public final f f10540e;

    public /* synthetic */ g(f fVar, int i6) {
        this.f10539c = i6;
        this.f10540e = fVar;
    }

    @Override // Y3.g
    public final int a() {
        switch (this.f10539c) {
            case 0:
                return this.f10540e.f10534l;
            default:
                return this.f10540e.f10534l;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f10539c) {
            case 0:
                AbstractC1276k.f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f10539c) {
            case 0:
                AbstractC1276k.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                AbstractC1276k.f(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f10539c) {
            case 0:
                this.f10540e.clear();
                return;
            default:
                this.f10540e.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f10539c) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1276k.f(entry, "element");
                return this.f10540e.f(entry);
            default:
                return this.f10540e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f10539c) {
            case 0:
                AbstractC1276k.f(collection, "elements");
                return this.f10540e.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f10539c) {
            case 0:
                return this.f10540e.isEmpty();
            default:
                return this.f10540e.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f10539c) {
            case 0:
                f fVar = this.f10540e;
                fVar.getClass();
                return new c(fVar, 0);
            default:
                f fVar2 = this.f10540e;
                fVar2.getClass();
                return new c(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f10539c) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1276k.f(entry, "element");
                f fVar = this.f10540e;
                fVar.getClass();
                fVar.c();
                int h3 = fVar.h(entry.getKey());
                if (h3 < 0) {
                    return false;
                }
                Object[] objArr = fVar.f10527e;
                AbstractC1276k.c(objArr);
                if (!AbstractC1276k.b(objArr[h3], entry.getValue())) {
                    return false;
                }
                fVar.l(h3);
                return true;
            default:
                f fVar2 = this.f10540e;
                fVar2.c();
                int h6 = fVar2.h(obj);
                if (h6 < 0) {
                    return false;
                }
                fVar2.l(h6);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f10539c) {
            case 0:
                AbstractC1276k.f(collection, "elements");
                this.f10540e.c();
                return super.removeAll(collection);
            default:
                AbstractC1276k.f(collection, "elements");
                this.f10540e.c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f10539c) {
            case 0:
                AbstractC1276k.f(collection, "elements");
                this.f10540e.c();
                return super.retainAll(collection);
            default:
                AbstractC1276k.f(collection, "elements");
                this.f10540e.c();
                return super.retainAll(collection);
        }
    }
}
