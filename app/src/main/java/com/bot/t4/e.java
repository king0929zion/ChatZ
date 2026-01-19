package t4;

import Y3.t;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class e implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14940c;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f14941e;

    /* renamed from: f, reason: collision with root package name */
    public int f14942f;

    /* renamed from: g, reason: collision with root package name */
    public Object f14943g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f14944h;

    public e(f fVar) {
        this.f14940c = 0;
        this.f14944h = fVar;
        this.f14941e = fVar.a.iterator();
        this.f14942f = -1;
    }

    public void a() {
        Object next;
        f fVar = (f) this.f14944h;
        do {
            Iterator it = this.f14941e;
            if (!it.hasNext()) {
                this.f14942f = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) fVar.f14946c.f(next)).booleanValue() != fVar.f14945b);
        this.f14943g = next;
        this.f14942f = 1;
    }

    public void b() {
        Iterator it = this.f14941e;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((o) this.f14944h).f14956c.f(next)).booleanValue()) {
                this.f14942f = 1;
                this.f14943g = next;
                return;
            }
        }
        this.f14942f = 0;
    }

    public boolean c() {
        Iterator it;
        g gVar = (g) this.f14944h;
        Iterator it2 = (Iterator) this.f14943g;
        if (it2 != null && it2.hasNext()) {
            this.f14942f = 1;
            return true;
        }
        do {
            Iterator it3 = this.f14941e;
            if (!it3.hasNext()) {
                this.f14942f = 2;
                this.f14943g = null;
                return false;
            }
            Object next = it3.next();
            gVar.getClass();
            it = (Iterator) l.f14952l.f(gVar.f14947b.f(next));
        } while (!it.hasNext());
        this.f14943g = it;
        this.f14942f = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14940c) {
            case 0:
                if (this.f14942f == -1) {
                    a();
                }
                return this.f14942f == 1;
            case 1:
                int i6 = this.f14942f;
                if (i6 == 1) {
                    return true;
                }
                if (i6 == 2) {
                    return false;
                }
                return c();
            default:
                if (this.f14942f == -1) {
                    b();
                }
                return this.f14942f == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14940c) {
            case 0:
                if (this.f14942f == -1) {
                    a();
                }
                if (this.f14942f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f14943g;
                this.f14943g = null;
                this.f14942f = -1;
                return obj;
            case 1:
                int i6 = this.f14942f;
                if (i6 == 2) {
                    throw new NoSuchElementException();
                }
                if (i6 == 0 && !c()) {
                    throw new NoSuchElementException();
                }
                this.f14942f = 0;
                Iterator it = (Iterator) this.f14943g;
                AbstractC1276k.c(it);
                return it.next();
            default:
                if (this.f14942f == -1) {
                    b();
                }
                if (this.f14942f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f14943g;
                this.f14943g = null;
                this.f14942f = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14940c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(g gVar) {
        this.f14940c = 1;
        this.f14944h = gVar;
        this.f14941e = ((Iterable) ((t) gVar.f14948c).f9810b).iterator();
    }

    public e(o oVar) {
        this.f14940c = 2;
        this.f14944h = oVar;
        this.f14941e = oVar.f14955b.iterator();
        this.f14942f = -1;
    }
}
