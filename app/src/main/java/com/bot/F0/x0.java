package F0;

import i1.AbstractC1087g;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class x0 implements Collection, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1541c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1542e;

    public x0() {
        int i6 = k.U.a;
        this.f1542e = new k.J(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f1541c) {
            case 0:
                return ((k.J) this.f1542e).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f1541c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f1541c) {
            case 0:
                ((k.J) this.f1542e).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f1541c) {
            case 0:
                return ((k.J) this.f1542e).c(obj);
            default:
                return ((k.M) this.f1542e).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f1541c) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((k.J) this.f1542e).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                AbstractC1276k.f(collection, "elements");
                Collection collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (!((k.M) this.f1542e).d(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f1541c) {
            case 0:
                return ((k.J) this.f1542e).f12473g == 0;
            default:
                return ((k.M) this.f1542e).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1541c) {
            case 0:
                k.J j3 = (k.J) this.f1542e;
                j3.getClass();
                return new Z.c(new k.L(j3));
            default:
                return AbstractC1087g.m(new k.Z(this, null));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f1541c) {
            case 0:
                return ((k.J) this.f1542e).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f1541c) {
            case 0:
                return ((k.J) this.f1542e).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f1541c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f1541c) {
            case 0:
                return ((k.J) this.f1542e).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f1541c) {
            case 0:
                return ((k.J) this.f1542e).f12473g;
            default:
                return ((k.M) this.f1542e).f12488e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f1541c) {
            case 0:
                return AbstractC1275j.a(this);
            default:
                return AbstractC1275j.a(this);
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f1541c) {
            case 0:
                return AbstractC1275j.b(this, objArr);
            default:
                AbstractC1276k.f(objArr, "array");
                return AbstractC1275j.b(this, objArr);
        }
    }

    public x0(k.M m3) {
        AbstractC1276k.f(m3, "parent");
        this.f1542e = m3;
    }
}
