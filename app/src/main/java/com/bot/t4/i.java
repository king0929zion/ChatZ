package t4;

import X3.y;
import b4.C0911i;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class i implements Iterator, InterfaceC0905c, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public int f14949c;

    /* renamed from: e, reason: collision with root package name */
    public Object f14950e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0905c f14951f;

    public final RuntimeException a() {
        int i6 = this.f14949c;
        if (i6 == 4) {
            return new NoSuchElementException();
        }
        if (i6 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f14949c);
    }

    public final void b(Object obj, d4.h hVar) {
        this.f14950e = obj;
        this.f14949c = 3;
        this.f14951f = hVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6;
        while (true) {
            i6 = this.f14949c;
            if (i6 != 0) {
                break;
            }
            this.f14949c = 5;
            InterfaceC0905c interfaceC0905c = this.f14951f;
            AbstractC1276k.c(interfaceC0905c);
            this.f14951f = null;
            interfaceC0905c.k(y.a);
        }
        if (i6 == 1) {
            AbstractC1276k.c(null);
            throw null;
        }
        if (i6 == 2 || i6 == 3) {
            return true;
        }
        if (i6 == 4) {
            return false;
        }
        throw a();
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        X3.a.e(obj);
        this.f14949c = 4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i6 = this.f14949c;
        if (i6 == 0 || i6 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i6 == 2) {
            this.f14949c = 1;
            AbstractC1276k.c(null);
            throw null;
        }
        if (i6 != 3) {
            throw a();
        }
        this.f14949c = 0;
        Object obj = this.f14950e;
        this.f14950e = null;
        return obj;
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        return C0911i.f11057c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
