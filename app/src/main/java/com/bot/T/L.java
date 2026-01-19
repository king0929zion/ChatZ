package T;

import java.util.Iterator;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class L implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final J0 f7982c;

    /* renamed from: e, reason: collision with root package name */
    public final int f7983e;

    /* renamed from: f, reason: collision with root package name */
    public int f7984f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7985g;

    public L(J0 j02, int i6, int i7) {
        this.f7982c = j02;
        this.f7983e = i7;
        this.f7984f = i6;
        this.f7985g = j02.f7973k;
        if (j02.f7972j) {
            L0.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7984f < this.f7983e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        J0 j02 = this.f7982c;
        int i6 = j02.f7973k;
        int i7 = this.f7985g;
        if (i6 != i7) {
            L0.f();
        }
        int i8 = this.f7984f;
        this.f7984f = L0.a(j02.f7966c, i8) + i8;
        return new K0(j02, i8, i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
