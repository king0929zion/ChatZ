package Y3;

import f0.AbstractC0997t;
import f0.C0975E;
import j1.AbstractC1135a;
import java.util.List;
import java.util.ListIterator;
import m4.C1286u;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class D implements ListIterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9791c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9793f;

    public D(E e6, int i6) {
        this.f9793f = e6;
        List list = (List) e6.f9795e;
        if (i6 >= 0 && i6 <= e6.a()) {
            this.f9792e = list.listIterator(e6.a() - i6);
            return;
        }
        StringBuilder k3 = AbstractC1135a.k("Position index ", i6, " must be in range [");
        k3.append(new r4.e(0, e6.a(), 1));
        k3.append("].");
        throw new IndexOutOfBoundsException(k3.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f9791c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9791c) {
            case 0:
                return ((ListIterator) this.f9792e).hasPrevious();
            default:
                return ((C1286u) this.f9792e).f12971c < ((C0975E) this.f9793f).f11652g - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f9791c) {
            case 0:
                return ((ListIterator) this.f9792e).hasNext();
            default:
                return ((C1286u) this.f9792e).f12971c >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f9791c) {
            case 0:
                return ((ListIterator) this.f9792e).previous();
            default:
                C1286u c1286u = (C1286u) this.f9792e;
                int i6 = c1286u.f12971c + 1;
                C0975E c0975e = (C0975E) this.f9793f;
                AbstractC0997t.a(i6, c0975e.f11652g);
                c1286u.f12971c = i6;
                return c0975e.get(i6);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f9791c) {
            case 0:
                E e6 = (E) this.f9793f;
                return Y4.l.C(e6) - ((ListIterator) this.f9792e).previousIndex();
            default:
                return ((C1286u) this.f9792e).f12971c + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f9791c) {
            case 0:
                return ((ListIterator) this.f9792e).next();
            default:
                C1286u c1286u = (C1286u) this.f9792e;
                int i6 = c1286u.f12971c;
                C0975E c0975e = (C0975E) this.f9793f;
                AbstractC0997t.a(i6, c0975e.f11652g);
                c1286u.f12971c = i6 - 1;
                return c0975e.get(i6);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f9791c) {
            case 0:
                E e6 = (E) this.f9793f;
                return Y4.l.C(e6) - ((ListIterator) this.f9792e).nextIndex();
            default:
                return ((C1286u) this.f9792e).f12971c;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f9791c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f9791c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public D(C1286u c1286u, C0975E c0975e) {
        this.f9792e = c1286u;
        this.f9793f = c0975e;
    }
}
