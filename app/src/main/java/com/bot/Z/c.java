package Z;

import i1.AbstractC1087g;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import k.K;
import k.L;
import k.O;
import k.P;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;
import t4.g;
import t4.i;
import t4.m;

/* loaded from: classes.dex */
public final class c implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9850c;

    /* renamed from: e, reason: collision with root package name */
    public int f9851e;

    /* renamed from: f, reason: collision with root package name */
    public Object f9852f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9853g;

    public c(Object obj, Map map) {
        this.f9850c = 0;
        this.f9852f = obj;
        this.f9853g = map;
    }

    public void a() {
        Object f6;
        g gVar = (g) this.f9853g;
        if (this.f9851e == -2) {
            f6 = ((InterfaceC1193a) gVar.f14948c).b();
        } else {
            l4.c cVar = gVar.f14947b;
            Object obj = this.f9852f;
            AbstractC1276k.c(obj);
            f6 = cVar.f(obj);
        }
        this.f9852f = f6;
        this.f9851e = f6 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9850c) {
            case 0:
                return this.f9851e < ((Map) this.f9853g).size();
            case 1:
                return ((i) this.f9852f).hasNext();
            case 2:
                return ((i) this.f9852f).hasNext();
            case 3:
                if (this.f9851e < 0) {
                    a();
                }
                return this.f9851e == 1;
            default:
                m mVar = (m) this.f9853g;
                Iterator it = (Iterator) this.f9852f;
                while (this.f9851e < mVar.f14953b && it.hasNext()) {
                    it.next();
                    this.f9851e++;
                }
                return this.f9851e < mVar.f14954c && it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9850c) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f9852f;
                this.f9851e++;
                Object obj2 = ((Map) this.f9853g).get(obj);
                if (obj2 != null) {
                    this.f9852f = ((a) obj2).f9845b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                return ((i) this.f9852f).next();
            case 2:
                return ((i) this.f9852f).next();
            case 3:
                if (this.f9851e < 0) {
                    a();
                }
                if (this.f9851e == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f9852f;
                AbstractC1276k.d(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f9851e = -1;
                return obj3;
            default:
                m mVar = (m) this.f9853g;
                Iterator it = (Iterator) this.f9852f;
                while (this.f9851e < mVar.f14953b && it.hasNext()) {
                    it.next();
                    this.f9851e++;
                }
                int i6 = this.f9851e;
                if (i6 >= mVar.f14954c) {
                    throw new NoSuchElementException();
                }
                this.f9851e = i6 + 1;
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9850c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i6 = this.f9851e;
                if (i6 != -1) {
                    ((L) this.f9853g).f12484e.h(i6);
                    this.f9851e = -1;
                    return;
                }
                return;
            case 2:
                int i7 = this.f9851e;
                if (i7 != -1) {
                    ((P) this.f9853g).f12507e.m(i7);
                    this.f9851e = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(m mVar) {
        this.f9850c = 4;
        this.f9853g = mVar;
        this.f9852f = mVar.a.iterator();
    }

    public c(g gVar) {
        this.f9850c = 3;
        this.f9853g = gVar;
        this.f9851e = -2;
    }

    public c(P p5) {
        this.f9850c = 2;
        this.f9853g = p5;
        this.f9851e = -1;
        this.f9852f = AbstractC1087g.m(new O(p5, this, null));
    }

    public c(L l3) {
        this.f9850c = 1;
        this.f9853g = l3;
        this.f9851e = -1;
        this.f9852f = AbstractC1087g.m(new K(l3, this, null));
    }
}
