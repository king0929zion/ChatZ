package Y3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;
import t4.C1730b;

/* loaded from: classes.dex */
public final class z implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9816c;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f9817e;

    /* renamed from: f, reason: collision with root package name */
    public int f9818f;

    public z(Iterator it) {
        this.f9816c = 0;
        AbstractC1276k.f(it, "iterator");
        this.f9817e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f9816c) {
            case 0:
                return this.f9817e.hasNext();
            case 1:
                break;
            default:
                return this.f9818f > 0 && this.f9817e.hasNext();
        }
        while (true) {
            int i6 = this.f9818f;
            it = this.f9817e;
            if (i6 > 0 && it.hasNext()) {
                it.next();
                this.f9818f--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f9816c) {
            case 0:
                int i6 = this.f9818f;
                this.f9818f = i6 + 1;
                if (i6 >= 0) {
                    return new y(i6, this.f9817e.next());
                }
                Y4.l.U();
                throw null;
            case 1:
                break;
            default:
                int i7 = this.f9818f;
                if (i7 == 0) {
                    throw new NoSuchElementException();
                }
                this.f9818f = i7 - 1;
                return this.f9817e.next();
        }
        while (true) {
            int i8 = this.f9818f;
            it = this.f9817e;
            if (i8 > 0 && it.hasNext()) {
                it.next();
                this.f9818f--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9816c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(t4.n nVar) {
        this.f9816c = 2;
        this.f9818f = 6;
        this.f9817e = nVar.a.iterator();
    }

    public z(C1730b c1730b) {
        this.f9816c = 1;
        this.f9817e = c1730b.a.iterator();
        this.f9818f = c1730b.f14939b;
    }
}
