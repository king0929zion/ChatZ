package V;

import Y3.k;
import Y4.l;
import j1.AbstractC1135a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k.I;
import k.T;
import l.AbstractC1180a;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1374c;

/* loaded from: classes.dex */
public final class b implements List, InterfaceC1374c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8750c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8751e;

    public /* synthetic */ b(Object obj, int i6) {
        this.f8750c = i6;
        this.f8751e = obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f8750c) {
            case 0:
                ((e) this.f8751e).b(obj);
                return true;
            default:
                ((I) this.f8751e).a(obj);
                return true;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection collection) {
        switch (this.f8750c) {
            case 0:
                return ((e) this.f8751e).e(i6, collection);
            default:
                AbstractC1276k.f(collection, "elements");
                I i7 = (I) this.f8751e;
                if (i6 >= 0 && i6 <= i7.f12466b) {
                    int i8 = 0;
                    if (collection.isEmpty()) {
                        return false;
                    }
                    int size = collection.size() + i7.f12466b;
                    Object[] objArr = i7.a;
                    if (objArr.length < size) {
                        i7.m(objArr, size);
                    }
                    Object[] objArr2 = i7.a;
                    if (i6 != i7.f12466b) {
                        k.j0(objArr2, objArr2, collection.size() + i6, i6, i7.f12466b);
                    }
                    for (Object obj : collection) {
                        int i9 = i8 + 1;
                        if (i8 >= 0) {
                            objArr2[i8 + i6] = obj;
                            i8 = i9;
                        } else {
                            l.U();
                            throw null;
                        }
                    }
                    i7.f12466b = collection.size() + i7.f12466b;
                    return true;
                }
                StringBuilder k3 = AbstractC1135a.k("Index ", i6, " must be in 0..");
                k3.append(i7.f12466b);
                AbstractC1180a.d(k3.toString());
                throw null;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f8750c) {
            case 0:
                ((e) this.f8751e).g();
                return;
            default:
                ((I) this.f8751e).d();
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f8750c) {
            case 0:
                return ((e) this.f8751e).h(obj);
            default:
                return ((I) this.f8751e).g(obj) >= 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f8750c) {
            case 0:
                e eVar = (e) this.f8751e;
                eVar.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!eVar.h(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                AbstractC1276k.f(collection, "elements");
                I i6 = (I) this.f8751e;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (i6.g(it2.next()) < 0) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i6) {
        switch (this.f8750c) {
            case 0:
                f.a(this, i6);
                return ((e) this.f8751e).f8759c[i6];
            default:
                T.a(this, i6);
                return ((I) this.f8751e).f(i6);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f8750c) {
            case 0:
                return ((e) this.f8751e).i(obj);
            default:
                return ((I) this.f8751e).g(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f8750c) {
            case 0:
                return ((e) this.f8751e).f8761f == 0;
            default:
                return ((I) this.f8751e).h();
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8750c) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i6;
        switch (this.f8750c) {
            case 0:
                e eVar = (e) this.f8751e;
                Object[] objArr = eVar.f8759c;
                for (int i7 = eVar.f8761f - 1; i7 >= 0; i7--) {
                    if (AbstractC1276k.b(obj, objArr[i7])) {
                        return i7;
                    }
                }
                return -1;
            default:
                I i8 = (I) this.f8751e;
                if (obj == null) {
                    Object[] objArr2 = i8.a;
                    i6 = i8.f12466b - 1;
                    while (-1 < i6) {
                        if (objArr2[i6] != null) {
                            i6--;
                        }
                    }
                    return -1;
                }
                Object[] objArr3 = i8.a;
                i6 = i8.f12466b - 1;
                while (-1 < i6) {
                    if (!obj.equals(objArr3[i6])) {
                        i6--;
                    }
                }
                return -1;
                return i6;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f8750c) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f8750c) {
            case 0:
                return ((e) this.f8751e).j(obj);
            default:
                return ((I) this.f8751e).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f8750c) {
            case 0:
                e eVar = (e) this.f8751e;
                eVar.getClass();
                if (!collection.isEmpty()) {
                    int i6 = eVar.f8761f;
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        eVar.j(it.next());
                    }
                    if (i6 != eVar.f8761f) {
                        return true;
                    }
                }
                return false;
            default:
                AbstractC1276k.f(collection, "elements");
                I i7 = (I) this.f8751e;
                i7.getClass();
                int i8 = i7.f12466b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    i7.j(it2.next());
                }
                return i8 != i7.f12466b;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f8750c) {
            case 0:
                e eVar = (e) this.f8751e;
                int i6 = eVar.f8761f;
                for (int i7 = i6 - 1; -1 < i7; i7--) {
                    if (!collection.contains(eVar.f8759c[i7])) {
                        eVar.k(i7);
                    }
                }
                return i6 != eVar.f8761f;
            default:
                AbstractC1276k.f(collection, "elements");
                I i8 = (I) this.f8751e;
                i8.getClass();
                int i9 = i8.f12466b;
                Object[] objArr = i8.a;
                for (int i10 = i9 - 1; -1 < i10; i10--) {
                    if (!collection.contains(objArr[i10])) {
                        i8.k(i10);
                    }
                }
                return i9 != i8.f12466b;
        }
    }

    @Override // java.util.List
    public final Object set(int i6, Object obj) {
        switch (this.f8750c) {
            case 0:
                f.a(this, i6);
                Object[] objArr = ((e) this.f8751e).f8759c;
                Object obj2 = objArr[i6];
                objArr[i6] = obj;
                return obj2;
            default:
                T.a(this, i6);
                I i7 = (I) this.f8751e;
                if (i6 < 0 || i6 >= i7.f12466b) {
                    i7.n(i6);
                    throw null;
                }
                Object[] objArr2 = i7.a;
                Object obj3 = objArr2[i6];
                objArr2[i6] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f8750c) {
            case 0:
                return ((e) this.f8751e).f8761f;
            default:
                return ((I) this.f8751e).f12466b;
        }
    }

    @Override // java.util.List
    public final List subList(int i6, int i7) {
        switch (this.f8750c) {
            case 0:
                f.b(this, i6, i7);
                return new c(this, i6, i7, 0);
            default:
                T.b(this, i6, i7);
                return new c(this, i6, i7, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f8750c) {
            case 0:
                return AbstractC1275j.a(this);
            default:
                return AbstractC1275j.a(this);
        }
    }

    @Override // java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        switch (this.f8750c) {
            case 0:
                ((e) this.f8751e).a(i6, obj);
                return;
            default:
                I i8 = (I) this.f8751e;
                if (i6 >= 0 && i6 <= (i7 = i8.f12466b)) {
                    int i9 = i7 + 1;
                    Object[] objArr = i8.a;
                    if (objArr.length < i9) {
                        i8.m(objArr, i9);
                    }
                    Object[] objArr2 = i8.a;
                    int i10 = i8.f12466b;
                    if (i6 != i10) {
                        k.j0(objArr2, objArr2, i6 + 1, i6, i10);
                    }
                    objArr2[i6] = obj;
                    i8.f12466b++;
                    return;
                }
                StringBuilder k3 = AbstractC1135a.k("Index ", i6, " must be in 0..");
                k3.append(i8.f12466b);
                AbstractC1180a.d(k3.toString());
                throw null;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i6) {
        switch (this.f8750c) {
            case 0:
                return new d(this, i6, 0);
            default:
                return new d(this, i6, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i6) {
        switch (this.f8750c) {
            case 0:
                f.a(this, i6);
                return ((e) this.f8751e).k(i6);
            default:
                T.a(this, i6);
                return ((I) this.f8751e).k(i6);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f8750c) {
            case 0:
                return AbstractC1275j.b(this, objArr);
            default:
                AbstractC1276k.f(objArr, "array");
                return AbstractC1275j.b(this, objArr);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f8750c) {
            case 0:
                e eVar = (e) this.f8751e;
                return eVar.e(eVar.f8761f, collection);
            default:
                AbstractC1276k.f(collection, "elements");
                I i6 = (I) this.f8751e;
                int i7 = i6.f12466b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    i6.a(it.next());
                }
                return i7 != i6.f12466b;
        }
    }
}
