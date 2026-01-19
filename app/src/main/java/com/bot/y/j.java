package Y;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import m4.AbstractC1276k;
import n4.InterfaceC1373b;

/* loaded from: classes.dex */
public final class j extends AbstractCollection implements Collection, InterfaceC1373b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9563c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9564e;

    public /* synthetic */ j(Object obj, int i6) {
        this.f9563c = i6;
        this.f9564e = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f9563c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f9563c) {
            case 1:
                AbstractC1276k.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f9563c) {
            case 0:
                ((e) this.f9564e).clear();
                return;
            default:
                ((Z3.f) this.f9564e).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f9563c) {
            case 0:
                return ((e) this.f9564e).containsValue(obj);
            default:
                return ((Z3.f) this.f9564e).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f9563c) {
            case 1:
                return ((Z3.f) this.f9564e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9563c) {
            case 0:
                e eVar = (e) this.f9564e;
                o[] oVarArr = new o[8];
                for (int i6 = 0; i6 < 8; i6++) {
                    oVarArr[i6] = new p(2);
                }
                return new f(eVar, oVarArr);
            default:
                Z3.f fVar = (Z3.f) this.f9564e;
                fVar.getClass();
                return new Z3.c(fVar, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f9563c) {
            case 1:
                Z3.f fVar = (Z3.f) this.f9564e;
                fVar.c();
                int i6 = fVar.i(obj);
                if (i6 < 0) {
                    return false;
                }
                fVar.l(i6);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f9563c) {
            case 1:
                AbstractC1276k.f(collection, "elements");
                ((Z3.f) this.f9564e).c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f9563c) {
            case 1:
                AbstractC1276k.f(collection, "elements");
                ((Z3.f) this.f9564e).c();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f9563c) {
            case 0:
                e eVar = (e) this.f9564e;
                eVar.getClass();
                return eVar.f9554i;
            default:
                return ((Z3.f) this.f9564e).f10534l;
        }
    }
}
